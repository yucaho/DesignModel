package 大话设计模式.适配器模式;

/**
 * Date 2018/10/24 14:56
 *
 * @author : lyc
 * @Description: 通过在内部包装一个adaptee对象，把原接口转换成目标接口
 */
public class Adapter extends Target{
	//建立一个私有的Adaptee对象
	private  Adaptee adaptee = new Adaptee();


	@Override
	public void getRequest() {
		adaptee.getSpecificRequest();
	}
}
