package haedFirst.one.old.entity;

import haedFirst.one.old.Duck;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 15:41
 *
 * @Description:这个是野鸭，外观是绿头的
 */
public class MallardDuck extends Duck{
	@Override
	public void quack() {
		System.out.println("这是鸭子的叫声");
	}

	@Override
	public void swim() {

	}

	@Override
	public void display() {
		System.out.println("这个是野鸭，外观是绿头的");
	}
}
