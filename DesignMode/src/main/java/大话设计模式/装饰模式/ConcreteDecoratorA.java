package 大话设计模式.装饰模式;

/**
 * Date 2018/10/15 15:07
 *
 * @Description: 具体的装饰类A
 */
public class ConcreteDecoratorA extends Decorator{
  private String addState; // A 的独有字段

	@Override
	public void Operation() {
		super.Operation();
		addState=" A 的操作";
		System.out.println("具体装饰对象A 的操作");
	}
}
