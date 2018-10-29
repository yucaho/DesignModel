package 大话设计模式.装饰模式;

/**
 * Date 2018/10/15 15:03
 *
 * @Description: 具体组成类
 */
public class ConcreteComponent extends Component {
	@Override
	public void Operation() {
		System.out.println("这个是具体对象的操作");
	}
}
