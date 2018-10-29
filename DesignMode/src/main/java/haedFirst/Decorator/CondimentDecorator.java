package haedFirst.Decorator;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/24 14:29
 *
 * @Description:	condiment 调料
 */
public abstract class CondimentDecorator extends Beverage{

	//所有的调料装饰者都必须重新实现这个方法
	public abstract String getDescription();

}
