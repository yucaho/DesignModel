package haedFirst.one.newD.action.impl;

import haedFirst.one.newD.action.FlyBehavior;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:09
 *
 * @Description
 */
public class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("这个是鸭子有翅膀，能飞");
	}
}
