package 大话设计模式.建造者模式.case2;

/**
 * Date 2018/10/22 17:11
 *
 * @Description: 建造者模式中的指挥者类
 */
public class Director {
	 //用来指挥建造过程
	public void Construct(Builder builder){
		builder.BuildPartA();
		builder.BuildPartB();
	}
}
