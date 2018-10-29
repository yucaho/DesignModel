package 大话设计模式.备忘录模式;

/**
 * Date 2018/10/24 16:10
 *
 * @author : lyc
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");
		o.Show();

		Caretaker caretaker = new Caretaker();
		caretaker.memento = o.createMemento();

		o.setState("OFF");
		o.Show();

		//恢复初始状态
		o.setMemento(caretaker.memento);
		o.Show();
	}
}
