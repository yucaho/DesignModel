package 大话设计模式.建造者模式;

/**
 * Date 2018/10/22 16:30
 *
 * @Description: 指挥者类，用它来控制建造的过程，也用它来隔离用户与建造过程的关联
 */
public class PersonDirector {
	private PersonBuilder builder;
	public PersonDirector(PersonBuilder builder){
		this.builder = builder;
	}
	public void CreatePerson(){
		builder.BuildHead();
		builder.BuildBody();
		builder.BuildArmLeft();
		builder.BuildArmRight();
		builder.BuildLegLeft();
		builder.BuildLegRight();
	}
}
