package 大话设计模式.状态模式.case1;

/**
 * Date 2018/10/24 10:51
 *
 * @author : lyc
 * @Description: 抽象状态类，定义一个接口以封装与context的一个特定状态相关的行为
 */
public abstract class State {
	public abstract  void Handle(Context context);
}
