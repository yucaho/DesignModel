package 大话设计模式.迭代器模式;

/**
 * Date 2018/10/25 9:31
 *
 * @author : lyc
 * @Description: aggregate 聚集抽象类
 */
public abstract class Aggregate {
	//创建迭代器
	public abstract Iterator CreateIterator();
}
