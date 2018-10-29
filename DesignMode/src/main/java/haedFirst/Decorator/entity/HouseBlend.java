package haedFirst.Decorator.entity;

import haedFirst.Decorator.Beverage;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/24 14:34
 *
 * @Description: 这个是另外一种饮料
 */
public class HouseBlend extends Beverage {
	public HouseBlend(){
		description = "这是另一种饮料";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
