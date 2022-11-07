package space.terwer;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * 天气客户端
 *
 * @name: WeatherClient
 * @author: terwer
 * @date: 2022-11-07 14:53
 **/
public class WeatherClient {
    public static void main(String[] args) {
        //1、创建代理工厂
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        // 记录入站消息
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());

        // 记录出站消息
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        //2、设置 服务接口类型
        factoryBean.setServiceClass(IWeatherService.class);
        //3、设置服务器地址，必须与服务器配置的相同！！！
        factoryBean.setAddress("http://127.0.0.1:8888/weather?wsdl");
        IWeatherService weather = factoryBean.create(IWeatherService.class);
        System.out.println(weather.queryWeather("北京"));
    }
}
