package haedFirst.Decorator;

import haedFirst.Decorator.entity.Espoesso;
import haedFirst.Decorator.entity.HouseBlend;
import haedFirst.Decorator.entity.Mocha;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/24 14:55
 *
 * @Description： 测试用的
 */
public class CoffeeTest {
	public static void main(String[] args) {
		//定一杯浓咖啡
		Beverage beverage = new Espoesso();
		System.out.println(beverage.getDescription()+"	$"+beverage.cost());

		Beverage beverage1 = new HouseBlend();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() +"	$"+beverage1.cost());

	}
}















