package 大话设计模式.建造者模式.case2;

/**
 * Date 2018/10/22 17:05
 *
 * @Description: 抽象建造者类，确定产品有两个部件PartA和PartB组成，并声明一个得到产品建造后结果的方法GetResult
 */
public abstract class Builder {
	public abstract void BuildPartA();
	public abstract void BuildPartB();
	public abstract Product GetResult();
}
