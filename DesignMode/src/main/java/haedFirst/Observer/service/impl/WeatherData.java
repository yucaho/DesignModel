package haedFirst.Observer.service.impl;

import haedFirst.Observer.service.Observer;
import haedFirst.Observer.service.Subject;

import java.util.ArrayList;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:53
 *
 * @Description: 一旦有新的测量值，下面的三个布告必须更新
 */
public class WeatherData implements Subject {
	//用来记录观察者
	private ArrayList observers;

	private  float temperature;
	private  float humidity;
	private  float pressure;

	public WeatherData(){
		observers = new ArrayList();
	}
	//注册观察者的时候
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i > 0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature,humidity,pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
