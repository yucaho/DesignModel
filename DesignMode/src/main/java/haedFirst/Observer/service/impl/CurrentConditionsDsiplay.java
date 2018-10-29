package haedFirst.Observer.service.impl;

import haedFirst.Observer.service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/21 10:08
 *
 * @Description:
 */
public class CurrentConditionsDsiplay implements Observer,DisplayElement{
	private  float temperature;
	private  float humidity;
	Observable observable;

	public CurrentConditionsDsiplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current conditions:	"+temperature +"	"+humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData2){
			WeatherData2 weatherData2 = (WeatherData2)o;
			this.temperature = weatherData2.getTemperature();
			this.humidity = weatherData2.getHumidity();
			display();
		}
	}
}
