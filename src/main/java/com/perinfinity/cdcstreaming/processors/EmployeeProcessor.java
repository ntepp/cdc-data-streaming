package com.perinfinity.cdcstreaming.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProcessor implements Processor {
    Logger logger = LoggerFactory.getLogger(EmployeeProcessor.class);
    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("Get all customer in db");
        String query = "select * from CUSTOMER";
        exchange.getIn().setBody(query);
    }
}
