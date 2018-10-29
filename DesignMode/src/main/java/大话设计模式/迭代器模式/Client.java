package 大话设计模式.迭代器模式;

/**
 * Date 2018/10/25 9:53
 *
 * @author : lyc
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.setObject(0,"呆鸟");
		a.setObject(1,"小菜");
		a.setObject(2,"老外");
		a.setObject(3,"小偷");
		a.setObject(4,"同鞋");
		a.setObject(5,"内部员工");

		//在这里使用iterator是因为 也可能会有从后往前遍历的情况
		Iterator iterator = new ConcreteIterator(a);
		System.out.println(iterator.First());
		while (! iterator.IsDone()){
			System.out.println("please buy ticket  "+ iterator.CurrentItem());
			iterator.Next();
		}
	}
}
