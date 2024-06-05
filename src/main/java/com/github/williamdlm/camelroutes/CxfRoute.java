package com.github.williamdlm.camelroutes;

import org.apache.camel.builder.RouteBuilder;

public class CxfRoute {

    public static RouteBuilder createBasicRoute() {

        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("cxf:bean:introduceEndpoint")
                        .log("{$body}");
            }
        };
    }

}
