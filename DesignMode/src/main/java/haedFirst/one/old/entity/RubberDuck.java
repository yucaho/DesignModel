package haedFirst.one.old.entity;

import haedFirst.one.old.Duck;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 15:47
 *
 * @Description:橡皮鸭
 */
public class RubberDuck extends Duck{
	@Override
	public void quack() {
		System.out.println("这个是橡皮鸭的叫声");
	}

	@Override
	public void swim() {

	}

	@Override
	public void display() {
		System.out.println("这个是一个橡皮鸭" );
	}
}
