package 大话设计模式.适配器模式;

/**
 * Date 2018/10/24 14:59
 *
 * @author : lyc
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		//对客户端来说，调用的就是target的request()
		Target target = new Adapter();
		target.getRequest();

		System.out.println("over    ");
	}
}
