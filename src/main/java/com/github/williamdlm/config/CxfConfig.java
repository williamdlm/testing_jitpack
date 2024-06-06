package com.github.williamdlm.config;

import com.github.williamdlm.service.Introduce;
import org.apache.camel.BeanInject;
import org.apache.camel.component.cxf.common.DataFormat;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;

public class CxfConfig {
//    @BeanInject
//    public CxfEndpoint introduceEndpoint() {
//        CxfEndpoint cxfEndpoint = new CxfEndpoint();
//        cxfEndpoint.setAddress("http://localhost:8080/introduce");
//        cxfEndpoint.setServiceClass(Introduce.class);
//        return cxfEndpoint;
//    }

    @BeanInject
    public CxfEndpoint producerCxf(){
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setWsdlURL("cxfbean-to-log:8080/services/soapbean?wsdl");
        cxfEndpoint.setDataFormat(DataFormat.RAW);
        return cxfEndpoint;
    }
}
