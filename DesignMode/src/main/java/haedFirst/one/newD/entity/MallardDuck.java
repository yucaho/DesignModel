package haedFirst.one.newD.entity;

import haedFirst.one.newD.Duck;
import haedFirst.one.newD.action.impl.FlyWithWings;
import haedFirst.one.newD.action.impl.Quack;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:24
 *
 * @Description
 */
public class MallardDuck extends Duck {
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display(){
		System.out.println("这是一个野鸭");
	}
}
