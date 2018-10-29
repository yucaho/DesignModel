package haedFirst.Decorator.entity;

import haedFirst.Decorator.Beverage;
import haedFirst.Decorator.CondimentDecorator;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/24 14:50
 *
 * @Description: 摩卡是一个装饰者，所以让Mocha 继承CondimentDecorator
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +", 摩卡";
	}

	@Override
	public double cost() {
		return  0.20 + beverage.cost();
	}
}
