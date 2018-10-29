package 大话设计模式.组合模式;

/**
 * Date 2018/10/24 16:33
 *
 * @author : lyc
 * @Description: 是对象的声明接口
 */
public abstract class Component {
	protected String name;
	public Component(String name){
		this.name = name;
	}

	//通常都用add和remove方法来提供增加或移除树叶或树枝的功能
	public abstract void Add(Component c);
	public abstract void Remove(Component c);
	public abstract void Display(int depth);
}
