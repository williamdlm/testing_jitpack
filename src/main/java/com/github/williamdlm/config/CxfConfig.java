package com.github.williamdlm.config;

import com.github.williamdlm.service.Introduce;
import org.apache.camel.BeanInject;
import org.apache.camel.BindToRegistry;
import org.apache.camel.EndpointInject;
import org.apache.camel.component.cxf.common.DataFormat;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;

public class CxfConfig extends CxfEndpoint {
    @BeanInject
    @BindToRegistry("introduceEndpoint")
    @EndpointInject
    public CxfEndpoint introduceEndpoint() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8080/introduce");
        cxfEndpoint.setServiceClass(Introduce.class);
        cxfEndpoint.setDataFormat(DataFormat.RAW);
        return cxfEndpoint;
    }
}
