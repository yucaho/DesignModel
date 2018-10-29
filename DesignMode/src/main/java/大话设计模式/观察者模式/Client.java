package 大话设计模式.观察者模式;

/**
 * Date 2018/10/23 9:27
 *
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		//前台的秘书
		Secretary tongzizhe = new Secretary();
		//看股票的同时
		StockObserver ts1 = new StockObserver("魏冠扎",tongzizhe);
		StockObserver ts2 = new StockObserver("易冠茶",tongzizhe);

		//前台记下两位同事
		tongzizhe.Attach(ts1);
		tongzizhe.Attach(ts2);

		//发现老板回来
		tongzizhe.setAction("boss 回来了");
		//通知两个同事
		tongzizhe.Notify();
		System.out.println("over");
	}
}
