package haedFirst.Decorator.entity;

import haedFirst.Decorator.Beverage;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/24 14:31
 *
 * @Description: 浓缩咖啡
 */
public class Espoesso extends Beverage {
	public Espoesso(){
		description = "浓缩咖啡";
	}

	//现在先把咖啡的钱写上去
	@Override
	public double cost() {
		return 1.99;
	}
}
