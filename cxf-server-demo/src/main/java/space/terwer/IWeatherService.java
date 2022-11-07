package space.terwer;

import javax.jws.WebService;

/**
 * 天气接口
 *
 * @name: IWeatherService
 * @author: terwer
 * @date: 2022-11-07 13:57
 **/
@WebService
public interface IWeatherService {
    /**
     * 通过cityName查询天气
     *
     * @param cityName 城市名
     * @return 该城市的天气
     */
    String queryWeather(String cityName);
}
