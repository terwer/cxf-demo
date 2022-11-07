package space.terwer;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import space.terwer.impl.WeatherServiceImpl;

/**
 * 天气发布服务入口
 *
 * @name: WeatherServer
 * @author: terwer
 * @date: 2022-11-07 14:01
 **/
public class WeatherServer {
    public static void main(String[] args) {
        try {
            //1、创建服务工厂Bean
            JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
            //2、设置服务实现对象
            factoryBean.setServiceBean(new WeatherServiceImpl());
            // factoryBean.setServiceClass(Class.forName("space.terwer.impl.WeatherServiceImpl"));
            //3、设置服务发布地址，127.0.0.1为本地ip地址，8888为端口
            factoryBean.setAddress("http://127.0.0.1:8888/weather");
            //4、创建服务
            factoryBean.create();
            System.out.println("发布成功，请在浏览器中访问http://127.0.0.1:8888/weather?wsdl");
        } catch (Exception e) {
            System.out.println("Webservice服务异常");
            e.printStackTrace();
        }
    }
}
