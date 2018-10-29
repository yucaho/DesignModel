package 大话设计模式.观察者模式;

import java.util.*;

/**
 * Date 2018/10/23 9:07
 *
 * @Description: 秘书类
 */
public class Secretary {
	//同时列表
	private List<StockObserver> observers =new ArrayList<>();
	private String action;

	//增加  有几个同时请求帮忙，就给集合增加几个对象
	public void Attach(StockObserver observer){
		observers.add(observer);
	}

	//通知
	public void Notify(){
		for (StockObserver ob : observers) {
			ob.Update();
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
