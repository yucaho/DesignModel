package 大话设计模式.组合模式;

/**
 * Date 2018/10/24 16:37
 *
 * @author : lyc
 * @Description: 在组合中表示叶节点对象，叶节点没有子节点
 */
public class Leaf extends Component{
	public Leaf(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		System.out.println("cannot add to a leaf");
	}

	@Override
	public void Remove(Component c) {
		System.out.println("cannot remove from a leaf");
	}

	//此处用来显示其名称和级别
	@Override
	public void Display(int depth) {
		System.out.println(depth+"	-  "+name);
	}
}
