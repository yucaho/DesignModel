package 大话设计模式.观察者模式.case2;


import 大话设计模式.观察者模式.case2.StockObserver;

/**
 * Date 2018/10/23 9:27
 *
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		//前台的秘书
		Subject boss = new Boss();
		//看股票的同时
		NBAObserver ts1 = new NBAObserver("魏冠扎",boss);
		StockObserver ts2 = new StockObserver("易冠茶",boss);

		//前台记下两位同事
		boss.addListener(ts1,"CloseNBADirectSeeding");
		boss.addListener(ts2,"CloseStockMarket");

		//发现老板回来
		boss.setAction("我胡三汉回来了");
		//通知两个同事
		boss.Notify();
		System.out.println("over");
	}
}
