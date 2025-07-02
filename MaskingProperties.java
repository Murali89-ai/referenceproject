package com.wu.brwallet.customer.profile.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Getter
@Component
@ConfigurationProperties(prefix = "mask")
public class MaskingProperties {

    private Map<String,String> maskingFields;

    public void setFields(String fields)
    {
        Map<String,String> maskData = new HashMap<>();

        for(String field : fields.split(","))
        {
            String [] fieldData = field.split("\\|");
            if(fieldData.length == 4)
            {
                maskData.put(fieldData[0], fieldData[1] + "|" + fieldData[2] + "|" + fieldData[3]);
            }
            else if (fieldData.length == 1)
            {
                maskData.put(fieldData[0],null);
            }
        }
        this.maskingFields = maskData;
    }
}
