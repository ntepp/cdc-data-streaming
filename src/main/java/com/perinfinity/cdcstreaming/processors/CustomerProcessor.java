package com.perinfinity.cdcstreaming.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomerProcessor implements Processor {
    Logger logger = LoggerFactory.getLogger(CustomerProcessor.class);
    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("Processing customer ${body[name]} - ${body[address]}");
    }
}
