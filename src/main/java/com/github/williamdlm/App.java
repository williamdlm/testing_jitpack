package com.github.williamdlm;

import com.github.williamdlm.camelroutes.CxfRoute;
import com.github.williamdlm.config.CxfConfig;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        // create a CamelContext
//        try (CamelContext camel = new DefaultCamelContext()) {
//            CxfConfig cxfConfig = new CxfConfig();
//            camel.getRegistry().bind("introduceEndpoint", cxfConfig.introduceEndpoint());
//            // add routes which can be inlined as anonymous inner class
//            // (to keep all code in a single java file for this basic example)
//            camel.addRoutes(CxfRoute.createBasicRoute());
//
//            // start is not blocking
//            camel.start();
//
//            // so run for 10 seconds
//            Thread.sleep(100_000);
//        }
    }
}
