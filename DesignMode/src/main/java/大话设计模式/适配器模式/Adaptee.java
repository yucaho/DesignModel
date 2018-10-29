package 大话设计模式.适配器模式;

/**
 * Date 2018/10/24 14:54
 *
 * @author : lyc
 * @Description： 需要适配的类
 */
public class Adaptee {
	public void getSpecificRequest(){
		System.out.println("特殊请求");
	}
}
