package 大话设计模式.观察者模式.case2;

import 大话设计模式.观察者模式.Secretary;

/**
 * Date 2018/10/23 9:47
 *
 * @Description
 */
public class NBAObserver {
	private  String name;
	private Subject subject;
	public NBAObserver(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	//关闭NBA直播
	public void CloseNBADirectSeeding() {
		System.out.println(subject.getAction()+"	"+name+"  关闭NBA直播，请继续工作");
	}
}
