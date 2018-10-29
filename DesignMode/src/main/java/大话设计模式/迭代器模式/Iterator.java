package 大话设计模式.迭代器模式;

/**
 * Date 2018/10/24 17:25
 *
 * @author : lyc
 * @Description: 迭代器抽象类
 */
public abstract class Iterator {
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean IsDone();
	public abstract Object CurrentItem();
}
