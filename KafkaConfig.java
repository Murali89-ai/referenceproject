package com.wu.brwallet.customer.profile.config;

import com.wu.brwallet.customer.profile.kafka.consumer.KafkaConsumerImpl;
import com.wu.era.kafka.consumer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {


    @Bean("ConsumerRetryRecordsMsgManualCommitHandler")
    public IKafkaRetryRecordManualConsumer kafkaRecordManualConsumer() {
        return new KafkaConsumerImpl();
    }


}
