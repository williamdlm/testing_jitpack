package com.github.williamdlm;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OnlyByeProcessor implements Processor {


    public void process(Exchange exchange) throws Exception {
            exchange.getIn().setBody("Bye " + exchange);
    }
}
