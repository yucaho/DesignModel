package haedFirst.one.newD;

import haedFirst.one.newD.action.FlyBehavior;
import haedFirst.one.newD.action.QuackBehavior;

/**
 * Author  lyuchao@linewell.com
 * Date 2018/8/20 16:02
 *
 * @Description: 这个是采取设计原则之后的
 */
public  class Duck {

  public FlyBehavior flyBehavior;

	//这个是叫的接口
	public QuackBehavior quackBehavior;

	public void swim(){
		System.out.println("鸭子会游泳");
	}

	public void display(){}
	void performQuack(){
		quackBehavior.quack();
	}
	void preformFly(){
		flyBehavior.fly();
	}

	//动态设定行为
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}
