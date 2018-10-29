package 大话设计模式.观察者模式.case2;

/**
 * Date 2018/10/23 9:45
 *
 * @Description： 查看股票的同事
 */
public class StockObserver {
	private String name;
	private Subject sub;
	public StockObserver(String name, Subject subject) {
		this.name = name;
		this.sub = subject;
	}

	//关闭股票行情
	public void CloseStockMarket() {
		System.out.println(sub.getAction()+"	"+name+"  关闭股票行情，请继续公国");
	}
}
