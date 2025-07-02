package com.wu.brwallet.customer.profile.model.common.error;

import com.wu.brwallet.customer.profile.model.common.blaze.Errors;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private boolean success;
    private int httpStatus;
    private String externalRefId;
    private String correlationId;
    private Map<String, Object> additionalFields;
    private List<Errors> errors;

    @Data
    public static class Errors {
        private String errorCode;
        private String errorType;
        private String errorMessage;
        @JsonSerialize(using = StackTraceSerializer.class)
        private String stackTrace;
    }

    public static class StackTraceSerializer extends JsonSerializer<String> {
        @Override
        public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value == null) {
                gen.writeNull();
                return;
            }
            try {
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonNode = mapper.readTree(value);
                gen.writeRawValue(value);
            } catch (Exception e) {
                gen.writeString(value);
            }
        }
    }

}
