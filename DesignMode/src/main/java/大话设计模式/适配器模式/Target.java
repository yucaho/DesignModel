package 大话设计模式.适配器模式;

/**
 * Date 2018/10/24 14:52
 *
 * @author : lyc
 * @Description： 这是客户所期待的接口，目标可以是具体的或抽象的类，也可以是接口
 */
public class Target {
	public void getRequest(){
		System.out.println("这是一个普通的请求");
	}
}
