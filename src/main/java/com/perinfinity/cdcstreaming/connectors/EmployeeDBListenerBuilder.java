package com.perinfinity.cdcstreaming.connectors;

import com.perinfinity.cdcstreaming.processors.CustomersQueryProcessor;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDBListenerBuilder extends RouteBuilder {
    @Autowired
    HikariDataSource dataSource;

    @Autowired
    CustomersQueryProcessor customersQueryProcessor;

    @Override
    public void configure() throws Exception {
        from("timer://listener?period=30000")
                .process(customersQueryProcessor)
                .to("jdbc:dataSource?outputType=StreamList") // jdbc data source
                .log("List of customers: ${body}")
                .split(body()).streaming()
                .log("Customer to process: ${body}");
                //.to("activemq:queue:customers");
    }
}
