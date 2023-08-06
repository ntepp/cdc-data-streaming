package com.perinfinity.cdcstreaming.configuration;

import com.perinfinity.cdcstreaming.model.CustomerOffset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CdcConfiguration {
    @Bean
    public CustomerOffset getCustomerOffset() {
        return new CustomerOffset(LocalDateTime.MIN, LocalDateTime.MIN);
    }
}
