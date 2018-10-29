package 大话设计模式.观察者模式.case2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Date 2018/10/23 11:44
 *
 * @Description: 事件类
 */
public class Event {
	private Object object;
	private String methodName;
	private  Object[] params;
	private Class[] paramTypes;
	public Event(Object object, String method,Object...args){
		this.object = object;
		this.methodName = method;
		this.params = args;
		contractParamTypes(this.params);
	}
	private  void contractParamTypes(Object[] params){
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}

	public void invoke() throws Exception {
		//判断是否存在这个函数
		Method method = object.getClass().getMethod(this.methodName,this.paramTypes);
		if (null == method){
			return;
		}
		//利用反射机制调用函数
		method.invoke(this.object,this.params);
	}
}
