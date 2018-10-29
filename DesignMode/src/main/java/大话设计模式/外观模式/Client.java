package 大话设计模式.外观模式;

/**
 * Date 2018/10/22 15:51
 *
 * @Description: 客户端调用，有了facade的作用，客户端可以不需要知道子系统类的存在
 */
public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.MethodA();
		facade.MethodB();
	}
}
