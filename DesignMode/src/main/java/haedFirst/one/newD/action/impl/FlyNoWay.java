package haedFirst.one.newD.action.impl;

import haedFirst.one.newD.action.FlyBehavior;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:11
 *
 * @Description
 */
public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("没有翅膀，飞不起来");
	}
}
