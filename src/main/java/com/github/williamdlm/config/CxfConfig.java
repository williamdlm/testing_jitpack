package com.github.williamdlm.config;

import com.github.williamdlm.service.Introduce;
import org.apache.camel.BeanInject;
import org.apache.camel.BindToRegistry;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;

public class CxfConfig {
    @BeanInject
    @BindToRegistry("introduceEndpoint")
    public CxfEndpoint introduceEndpoint() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8080/introduce");
        cxfEndpoint.setServiceClass(Introduce.class);
        return cxfEndpoint;
    }
}
