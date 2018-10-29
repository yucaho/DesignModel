package 大话设计模式.代理模式.one;

/**
 * Date 2018/10/15 15:58
 *
 * @Description
 */
public class RealSubject extends Subject {
	@Override
	public void Request() {
		System.out.println("真实的请求");
	}

}
