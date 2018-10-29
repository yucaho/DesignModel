package 大话设计模式.外观模式;

/**
 * Date 2018/10/22 15:46
 *
 * @Description： 外观类: 需要了解所有的子系统的方法或属性，进行组合，以备外界调用
 */
public class Facade {
	SubsystemOne one;
	SubsystemTwo two;
	SubsystemThree three;
	SubsystemFour four;

	public Facade(){
		one = new SubsystemOne();
		two = new SubsystemTwo();
		three = new SubsystemThree();
		four = new SubsystemFour();
	}

	public void MethodA(){
		System.out.println("方法组A()..........");
		one.MethodOne();
		two.MethodTwo();
		four.MethodFour();
	}

	public void MethodB(){
		System.out.println("方法组B()...........");
		two.MethodTwo();
		three.MethodThree();
	}
}
