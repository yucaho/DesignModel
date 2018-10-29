package 大话设计模式.策略模式;

/**
 * Date 2018/10/15 10:20
 *
 * @Description: 打折收费的子类
 */
public class CashRebate extends CashSuper{
	private double moneyRebate =1;

	public CashRebate() {
	}
	public  CashRebate(String rebate){
		moneyRebate =Double.parseDouble(rebate);
	}

	@Override
	public double acceptCash(double money) {

		return money* moneyRebate;
	}
}
