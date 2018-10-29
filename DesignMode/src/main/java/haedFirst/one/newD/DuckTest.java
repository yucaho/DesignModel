package haedFirst.one.newD;

import haedFirst.one.newD.action.impl.FlyRocketPowered;
import haedFirst.one.newD.entity.ModelDuck;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:41
 *
 * @Description
 */
public class DuckTest {
	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.preformFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.preformFly();
	}
}
