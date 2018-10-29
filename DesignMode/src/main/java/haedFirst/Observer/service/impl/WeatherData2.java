package haedFirst.Observer.service.impl;

import java.util.Observable;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/21 10:03
 *
 * @Description:	这次利用了Java的内置观察者
 */
public class WeatherData2 extends Observable {
	private  float temperature;
	private  float humidity;
	private  float pressure;

	public WeatherData2(){}
	public void measurementsChanged(){
		setChanged();
		//在这里没有传递数据，这表示这次采用的是拉的方式
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
