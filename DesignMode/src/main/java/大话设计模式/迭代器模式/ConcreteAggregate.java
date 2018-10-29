package 大话设计模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 2018/10/25 9:38
 *
 * @author : lyc
 * @Description
 */
public class ConcreteAggregate extends Aggregate{
	private List<Object> items = new ArrayList<>();
	@Override
	public Iterator CreateIterator() {
		return new ConcreteIterator(this);
	}

	public int Count(){
		return  items.size();
	}

	public Object getObject(int index){
		return items.get(index);
	}

	public void setObject(int index, Object value){
		items.add(index,value);
	}
}
