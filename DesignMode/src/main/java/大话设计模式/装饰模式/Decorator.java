package 大话设计模式.装饰模式;

/**
 * Date 2018/10/15 15:05
 *
 * @Description: 装饰类
 */
public class Decorator extends Component{
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void Operation() {
		if (component !=null){
			component.Operation();
		}
	}
}
