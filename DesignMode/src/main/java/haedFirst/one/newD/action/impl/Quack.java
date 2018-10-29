package haedFirst.one.newD.action.impl;

import haedFirst.one.newD.action.QuackBehavior;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:12
 *
 * @Description
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("鸭子呱呱叫");
	}
}
