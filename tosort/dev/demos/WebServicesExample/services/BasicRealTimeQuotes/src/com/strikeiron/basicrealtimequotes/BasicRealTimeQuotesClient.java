
package com.strikeiron.basicrealtimequotes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BasicRealTimeQuotes", targetNamespace = "http://www.strikeiron.com", wsdlLocation = "temp.wsdl")
public class BasicRealTimeQuotesClient
    extends Service
{

    private final static URL BASICREALTIMEQUOTES_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.strikeiron.basicrealtimequotes.BasicRealTimeQuotesClient.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.strikeiron.basicrealtimequotes.BasicRealTimeQuotesClient.class.getResource(".");
            url = new URL(baseUrl, "temp.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'temp.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BASICREALTIMEQUOTES_WSDL_LOCATION = url;
    }

    public BasicRealTimeQuotesClient(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BasicRealTimeQuotesClient() {
        super(BASICREALTIMEQUOTES_WSDL_LOCATION, new QName("http://www.strikeiron.com", "BasicRealTimeQuotes"));
    }

    /**
     * 
     * @return
     *     returns BasicRealTimeQuotesSoap
     */
    @WebEndpoint(name = "BasicRealTimeQuotesSoap")
    public BasicRealTimeQuotesSoap getBasicRealTimeQuotesSoap() {
        return super.getPort(new QName("http://www.strikeiron.com", "BasicRealTimeQuotesSoap"), BasicRealTimeQuotesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BasicRealTimeQuotesSoap
     */
    @WebEndpoint(name = "BasicRealTimeQuotesSoap")
    public BasicRealTimeQuotesSoap getBasicRealTimeQuotesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.strikeiron.com", "BasicRealTimeQuotesSoap"), BasicRealTimeQuotesSoap.class, features);
    }

}