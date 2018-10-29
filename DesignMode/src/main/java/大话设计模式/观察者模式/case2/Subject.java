package 大话设计模式.观察者模式.case2;


//增加通知者的抽象类  抽象类或者接口都可以，可以根据当时的情况来选
public abstract class Subject {

	//通知者状态
	private  String action;

	private EventHandler eventHandler = new EventHandler();

	public EventHandler getEventHandler(){
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	public abstract  void addListener(Object object,String methodName,Object... args);

	public abstract  void  Notify();
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
