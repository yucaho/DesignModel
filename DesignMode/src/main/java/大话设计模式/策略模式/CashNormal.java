package 大话设计模式.策略模式;

/**
 * Date 2018/10/15 10:18
 *
 * @Description: 正常收费类
 */
public class CashNormal extends CashSuper{
	@Override
	public double acceptCash(double money) {

		return money;
	}
}
