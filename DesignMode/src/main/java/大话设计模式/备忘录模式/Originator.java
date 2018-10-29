package 大话设计模式.备忘录模式;

/**
 * Date 2018/10/24 15:47
 *
 * @author : lyc
 * @Description： 发起人
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//创建备忘录，将当前需要保存的信息导入并实例化出一个memento对象
	public Memento createMemento(){
		return (new Memento(state));
	}
	//恢复备忘录，将memento导入并将相关数据恢复
	public void setMemento(Memento memento){
		state = memento.state;
	}

	//显示数据
	public void Show(){
		System.out.println("the state= "+ state);
	}
}
