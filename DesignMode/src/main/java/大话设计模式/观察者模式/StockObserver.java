package 大话设计模式.观察者模式;

/**
 * Date 2018/10/23 9:09
 *
 * @Description: 查看股票的同事类
 */
public class StockObserver {
	private String name;
	private Secretary secretary;

	public StockObserver(String name,Secretary secretary){
		this.name = name;
		this.secretary = secretary;
	}

	//通知前台
	public void Update(){
		System.out.println("请继续工作"+name +secretary.getAction());

	}
}
