package 大话设计模式.备忘录模式;

/**
 * Date 2018/10/24 15:56
 *
 * @author : lyc
 * @Description: 管理者
 */
public class Caretaker {
	protected  Memento memento;

	//得到或设置备忘录
	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
