package 大话设计模式.代理模式.one;

/**
 * Date 2018/10/15 16:03
 *
 * @Description
 */
public class Proxy extends Subject {
	RealSubject realSubject;
	@Override
	public void Request() {
		if (realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.Request();
		System.out.println("这个是代理的请求");
	}
}
