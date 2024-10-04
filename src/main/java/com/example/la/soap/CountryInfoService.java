
package com.example.la.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This DataFlex Web Service opens up country information. 2 letter ISO codes are used for Country code. There are functions to retrieve the used Currency, Language, Capital City, Continent and Telephone code.
 * 
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CountryInfoService", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", wsdlLocation = "file:/C:/Users/56956/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/soap/src/main/resources/CountryInfoService_1.wsdl")
public class CountryInfoService
    extends Service
{

    private static final URL COUNTRYINFOSERVICE_WSDL_LOCATION;
    private static final WebServiceException COUNTRYINFOSERVICE_EXCEPTION;
    private static final QName COUNTRYINFOSERVICE_QNAME = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/56956/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/soap/src/main/resources/CountryInfoService_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COUNTRYINFOSERVICE_WSDL_LOCATION = url;
        COUNTRYINFOSERVICE_EXCEPTION = e;
    }

    public CountryInfoService() {
        super(__getWsdlLocation(), COUNTRYINFOSERVICE_QNAME);
    }

    public CountryInfoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COUNTRYINFOSERVICE_QNAME, features);
    }

    public CountryInfoService(URL wsdlLocation) {
        super(wsdlLocation, COUNTRYINFOSERVICE_QNAME);
    }

    public CountryInfoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COUNTRYINFOSERVICE_QNAME, features);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap() {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap"), CountryInfoServiceSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap"), CountryInfoServiceSoapType.class, features);
    }

    /**
     * 
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12() {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap12"), CountryInfoServiceSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap12"), CountryInfoServiceSoapType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COUNTRYINFOSERVICE_EXCEPTION!= null) {
            throw COUNTRYINFOSERVICE_EXCEPTION;
        }
        return COUNTRYINFOSERVICE_WSDL_LOCATION;
    }

}
