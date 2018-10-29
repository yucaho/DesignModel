package haedFirst.Observer.service.impl;

import haedFirst.Observer.service.DisplayElement;
import haedFirst.Observer.service.Observer;
import haedFirst.Observer.service.Subject;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 17:19
 *
 * @Description: 目前状况布告板
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
	private  float temperature;
	private  float humidity;
	private  Subject weatherData;

	public CurrentConditionDisplay() {
	}
	public CurrentConditionDisplay(Subject subject) {
		this.weatherData = subject;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(temperature +"	"+ humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temp;
		display();;
	}
}
