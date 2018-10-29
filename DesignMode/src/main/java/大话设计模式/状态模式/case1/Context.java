package 大话设计模式.状态模式.case1;

/**
 * Date 2018/10/24 10:56
 *
 * @author : lyc
 * @Description: 维护ConcreteState 子类的实例，这个实例定义当前的状态
 */
public class Context {
	protected State state;
	public Context(State state){
		this.state = state;
	}

	public void Request(){
		state.Handle(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
