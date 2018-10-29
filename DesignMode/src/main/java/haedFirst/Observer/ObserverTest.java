package haedFirst.Observer;

import haedFirst.Observer.service.impl.CurrentConditionDisplay;
import haedFirst.Observer.service.impl.CurrentConditionsDsiplay;
import haedFirst.Observer.service.impl.WeatherData;
import haedFirst.Observer.service.impl.WeatherData2;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/21 9:20
 *
 * @Description：这个就是当一个可观察者的状态改变的时候其他的的订阅者可以跟着发生改变
 */
public class ObserverTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

		weatherData.setMeasurements(80,65,4f);
		weatherData.setMeasurements(82,45,1f);
		weatherData.setMeasurements(90,55,41f);


		WeatherData2 weatherData2 = new WeatherData2();
		CurrentConditionsDsiplay currentConditionsDsiplay = new CurrentConditionsDsiplay(weatherData2);
		weatherData2.setMeasurements(80,65,4f);
		weatherData2.setMeasurements(82,45,1f);
		weatherData2.setMeasurements(90,55,41f);
	}
}
