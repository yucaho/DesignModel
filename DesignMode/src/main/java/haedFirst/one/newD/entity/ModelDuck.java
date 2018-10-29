package haedFirst.one.newD.entity;

import haedFirst.one.newD.Duck;
import haedFirst.one.newD.action.impl.FlyNoWay;
import haedFirst.one.newD.action.impl.Quack;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:36
 *
 * @Description
 */
public class ModelDuck extends Duck {
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("这是一个模型鸭子");
	}

}
