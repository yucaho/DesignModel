package 大话设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 2018/10/24 16:42
 *
 * @author : lyc
 * @Description: 有枝节点行为，用来存储子部件
 */
public class Composite extends Component{
	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		children.add(c);
	}

	@Override
	public void Remove(Component c) {
		if (children.contains(c)){
			children.remove(c);
		}
	}

	@Override
	public void Display(int depth) {
		System.out.println(depth+"  -  "+name);
		//显示其枝节点名称，并对其下级进行遍历
		for (Component component:
			 children) {
			 component.Display(depth+2);
		}
	}
}
