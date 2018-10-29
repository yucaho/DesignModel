package 大话设计模式.迭代器模式;

/**
 * Date 2018/10/25 9:34
 *
 * @author : lyc
 * @Description concreteIterator迭代器类
 */
public class ConcreteIterator  extends  Iterator{
	//定义了一个具体的聚集对象
	private ConcreteAggregate aggregate;
	private  int current = 0;

	//初始化时将具体的聚集对象传入
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public Object First() {
		return aggregate.getObject(0);
	}

	//得到聚集的下一个对象
	@Override
	public Object Next() {
		Object ob = null;
		current++;
		if (current < aggregate.Count()){
			ob = aggregate.getObject(current);
		}
		return  ob;
	}

	//判断当前是否遍历到结尾，到结尾返回true
	@Override
	public boolean IsDone() {
		return current >= aggregate.Count() ? true:false;
	}

	//返回当前的聚集对象
	@Override
	public Object CurrentItem() {
		return  aggregate.getObject(current);
	}
}
