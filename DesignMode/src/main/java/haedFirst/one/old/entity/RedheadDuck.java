package haedFirst.one.old.entity;

import haedFirst.one.old.Duck;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 15:45
 *
 * @Description
 */
public class RedheadDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("这是鸭子的叫声");
	}

	@Override
	public void swim() {

	}

	@Override
	public void display() {
		System.out.println("这个是红头鸭");
	}
}
