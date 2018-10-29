package 大话设计模式.建造者模式.case2;

/**
 * Date 2018/10/22 17:13
 *
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();

		director.Construct(b1);
		Product product = b1.GetResult();
		product.Show();

		director.Construct(b2);
		Product product1 = b2.GetResult();
		product1.Show();
	}
}
