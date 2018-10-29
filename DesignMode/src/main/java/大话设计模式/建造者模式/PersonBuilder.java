package 大话设计模式.建造者模式;

/**
 * Date 2018/10/22 16:16
 *
 * @Description： 先抽象一个建造人的类，来把过程给稳定住
 */
public abstract class PersonBuilder {
	public abstract  void BuildHead();
	public abstract  void BuildBody();
	public abstract  void BuildArmLeft();
	public abstract  void BuildArmRight();
	public abstract  void BuildLegLeft();
	public abstract  void BuildLegRight();
}
