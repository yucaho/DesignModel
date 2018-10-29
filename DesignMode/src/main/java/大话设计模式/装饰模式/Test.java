package 大话设计模式.装饰模式;

/**
 * Date 2018/10/15 15:11
 *
 * @Description
 */
public class Test {
	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		ConcreteDecoratorA a = new ConcreteDecoratorA();
		ConcreteDecoratorB b = new ConcreteDecoratorB();

		a.setComponent(c);
		b.setComponent(a);
		b.Operation();
		System.out.println("over");
	}

/*
     结果为
    这个是具体对象的操作
	具体装饰对象A 的操作
	具体装饰对象B的操作
			over
*/
}
