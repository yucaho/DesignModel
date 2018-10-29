package 大话设计模式.装饰模式;

/**
 * Date 2018/10/15 15:09
 *
 * @Description: 具体的装饰类B
 */
public class ConcreteDecoratorB extends Decorator{
   private void AddBehavior(){
	   System.out.println("具体装饰对象B的操作");
   }

	@Override
	public void Operation() {
   	   //首先运行原来Component的操作，在执行本类的功能， 如AddBehavior
		super.Operation();
		AddBehavior();
	}
}
