package 大话设计模式.策略模式;

/**
 * Date 2018/10/15 10:47
 *
 * @Description 这个是策略和简单工厂组合起来用的
 */
public class CashContext {
	private CashSuper cs;
	public CashContext(String type){
		switch (type){
			case "normal":
				 cs = new CashNormal();
				 break;
			case "打折": //打折
				cs = new CashRebate("0.8");
				break;
		}
	}

	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
