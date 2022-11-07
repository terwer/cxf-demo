package space.terwer.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import space.terwer.IWeatherService;

/**
 * This class was generated by Apache CXF 3.3.11
 * 2022-11-07T14:56:02.366+08:00
 * Generated source version: 3.3.11
 *
 */
@WebServiceClient(name = "WeatherServiceImplService",
                  wsdlLocation = "http://127.0.0.1:8888/weather?wsdl",
                  targetNamespace = "http://impl.terwer.space/")
public class WeatherServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.terwer.space/", "WeatherServiceImplService");
    public final static QName WeatherServiceImplPort = new QName("http://impl.terwer.space/", "WeatherServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8888/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8888/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WeatherServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WeatherServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WeatherServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IWeatherService
     */
    @WebEndpoint(name = "WeatherServiceImplPort")
    public IWeatherService getWeatherServiceImplPort() {
        return super.getPort(WeatherServiceImplPort, IWeatherService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWeatherService
     */
    @WebEndpoint(name = "WeatherServiceImplPort")
    public IWeatherService getWeatherServiceImplPort(WebServiceFeature... features) {
        return super.getPort(WeatherServiceImplPort, IWeatherService.class, features);
    }

}