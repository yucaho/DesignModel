package 大话设计模式.观察者模式.case2;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 2018/10/23 10:02
 *
 * @Description
 */
public class Boss extends Subject{
	@Override
	public void addListener(Object object, String methodName, Object... args) {
		this.getEventHandler().addEvent(object,methodName,args);
	}

	@Override
	public void Notify() {
		try {
			this.getEventHandler().Notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
