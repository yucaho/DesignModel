package 大话设计模式.建造者模式.case2;

/**
 * Date 2018/10/22 17:08
 *
 * @Description: 具体的建造者类,建造具体的两个部件
 */
public class ConcreteBuilder2 extends Builder{
	private Product product = new Product();

	@Override
	public void BuildPartA() {
		product.Add("部件X");
	}

	@Override
	public void BuildPartB() {
		product.Add("部件Y");
	}

	@Override
	public Product GetResult() {
		return product;
	}
}
