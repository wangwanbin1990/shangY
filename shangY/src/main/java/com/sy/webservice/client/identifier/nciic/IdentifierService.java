package com.sy.webservice.client.identifier.nciic;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-25T15:37:52.282+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "IdentifierService", 
                  wsdlLocation = "http://service.sfxxrz.com/identifierservice.svc?wsdl",
                  targetNamespace = "http://www.nciic.com.cn") 
public class IdentifierService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.nciic.com.cn", "IdentifierService");
    public final static QName BasicHttpBindingIIdentifierService = new QName("http://www.nciic.com.cn", "BasicHttpBinding_IIdentifierService");
    static {
        URL url = null;
        try {
            url = new URL("http://service.sfxxrz.com/identifierservice.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IdentifierService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://service.sfxxrz.com/identifierservice.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IdentifierService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IdentifierService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IdentifierService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IdentifierService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IdentifierService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IdentifierService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IIdentifierService
     */
    @WebEndpoint(name = "BasicHttpBinding_IIdentifierService")
    public IIdentifierService getBasicHttpBindingIIdentifierService() {
        return super.getPort(BasicHttpBindingIIdentifierService, IIdentifierService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IIdentifierService
     */
    @WebEndpoint(name = "BasicHttpBinding_IIdentifierService")
    public IIdentifierService getBasicHttpBindingIIdentifierService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIIdentifierService, IIdentifierService.class, features);
    }

}
