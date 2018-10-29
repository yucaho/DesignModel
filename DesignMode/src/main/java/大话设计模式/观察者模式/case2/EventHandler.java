package 大话设计模式.观察者模式.case2;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 2018/10/23 14:25
 *
 * @Description: 事件管理类
 */
public class EventHandler {
 	private List<Event> objects;

 	public EventHandler(){
 		objects = new ArrayList<>();
	}
	public void addEvent(Object object,String methodName,Object... args){
 		objects.add(new Event(object,methodName, args));
	}
	public void Notify() throws Exception {
		for (Event event: objects) {
			event.invoke();
		}
	}
}
