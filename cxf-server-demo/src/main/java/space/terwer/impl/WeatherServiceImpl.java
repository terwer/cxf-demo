package space.terwer.impl;

import space.terwer.IWeatherService;

/**
 * 天气实现类
 *
 * @name: WeatherServiceImpl
 * @author: terwer
 * @date: 2022-11-07 13:59
 **/
public class WeatherServiceImpl implements IWeatherService {
    @Override
    public String queryWeather(String cityName) {
        String nowCityName = "深圳";
        String weatherStrOne = "晴，10~20°C，适合外出！";
        String weatherStrTwo = "阴，5~10°C，不宜外出！";
        if (cityName.equals(nowCityName)) {
            return cityName + weatherStrOne;
        } else {
            return cityName + weatherStrTwo;
        }
    }
}
