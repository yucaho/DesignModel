package haedFirst.one.newD.action.impl;

import haedFirst.one.newD.action.FlyBehavior;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:40
 *
 * @Description
 */
public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("FlyRocketPowered： 飞的像火箭一样快");
	}
}
