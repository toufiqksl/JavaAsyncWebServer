
package asyncclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AsyncwsService", targetNamespace = "http://example.com/", wsdlLocation = "http://toufiq-pc:8080/AsyncServer/AsyncwsService?wsdl")
public class AsyncwsService
    extends Service
{

    private final static URL ASYNCWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ASYNCWSSERVICE_EXCEPTION;
    private final static QName ASYNCWSSERVICE_QNAME = new QName("http://example.com/", "AsyncwsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://toufiq-pc:8080/AsyncServer/AsyncwsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASYNCWSSERVICE_WSDL_LOCATION = url;
        ASYNCWSSERVICE_EXCEPTION = e;
    }

    public AsyncwsService() {
        super(__getWsdlLocation(), ASYNCWSSERVICE_QNAME);
    }

    public AsyncwsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ASYNCWSSERVICE_QNAME, features);
    }

    public AsyncwsService(URL wsdlLocation) {
        super(wsdlLocation, ASYNCWSSERVICE_QNAME);
    }

    public AsyncwsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ASYNCWSSERVICE_QNAME, features);
    }

    public AsyncwsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AsyncwsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AsyncServer
     */
    @WebEndpoint(name = "AsyncServerPort")
    public AsyncServer getAsyncServerPort() {
        return super.getPort(new QName("http://example.com/", "AsyncServerPort"), AsyncServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsyncServer
     */
    @WebEndpoint(name = "AsyncServerPort")
    public AsyncServer getAsyncServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.com/", "AsyncServerPort"), AsyncServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASYNCWSSERVICE_EXCEPTION!= null) {
            throw ASYNCWSSERVICE_EXCEPTION;
        }
        return ASYNCWSSERVICE_WSDL_LOCATION;
    }

}
