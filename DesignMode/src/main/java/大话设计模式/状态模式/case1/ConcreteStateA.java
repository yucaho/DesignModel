package 大话设计模式.状态模式.case1;

/**
 * Date 2018/10/24 10:53
 *
 * @author : lyc
 * @Description
 */
public class ConcreteStateA extends State {
	@Override
	public void Handle(Context context) {
		context.state = new ConcreteStateB();
		System.out.println("this  in  A");
	}
}
class ConcreteStateB extends  State{
	@Override
	public void Handle(Context context) {
		context.state = new ConcreteStateA();
		System.out.println("this in B");
	}
}