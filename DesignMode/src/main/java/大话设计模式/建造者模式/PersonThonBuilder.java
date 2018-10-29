package 大话设计模式.建造者模式;

/**
 * Date 2018/10/22 16:24
 *
 * @Description：
 */
public class PersonThonBuilder extends PersonBuilder {
	@Override
	public void BuildHead() {
		System.out.println("瘦子的头");
	}

	@Override
	public void BuildBody() {
		System.out.println("瘦子的body");
	}

	@Override
	public void BuildArmLeft() {
		System.out.println("瘦子的左手");
	}

	@Override
	public void BuildArmRight() {
		System.out.println("瘦子的右手");
	}

	@Override
	public void BuildLegLeft() {
		System.out.println("瘦子的左腿");
	}

	@Override
	public void BuildLegRight() {
		System.out.println("瘦子的右腿");
	}
}
