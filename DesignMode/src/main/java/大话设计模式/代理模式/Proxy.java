package 大话设计模式.代理模式;

/**
 * Date 2018/10/15 15:38
 *
 * @Description: 代理人
 */
public class Proxy implements GiveGift {
	Pursuit pursuit;

	public Proxy(SchoolGirl girl){
		pursuit = new Pursuit(girl);
	}

	@Override
	public void GiveDolls() {
	   pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		pursuit.GiveChocolate();
	}
}
