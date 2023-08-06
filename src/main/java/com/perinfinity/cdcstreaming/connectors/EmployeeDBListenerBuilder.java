package com.perinfinity.cdcstreaming.connectors;

import com.perinfinity.cdcstreaming.model.CustomerOffset;
import com.perinfinity.cdcstreaming.processors.EmployeeProcessor;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDBListenerBuilder extends RouteBuilder {
    @Autowired
    HikariDataSource dataSource;

    @Autowired
    EmployeeProcessor employeeProcessor;

    @Override
    public void configure() throws Exception {
        from("timer://listener?period=30000")
                .process(employeeProcessor)
                .to("jdbc:dataSource") // jdbc data source
                .log("Captured datas: ${body}");
                //.to("activemq:queue:customers");
    }
}
