package haedFirst.Decorator;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/21 11:20
 *
 * @Description：Beverage 饮料，作为一个超类存在
 */
public abstract class Beverage {
	protected String description = "unknow beverage";

	public String getDescription() {
		return description;
	}

	public abstract  double cost();
}
