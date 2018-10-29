package 大话设计模式.代理模式;

/**
 * Date 2018/10/15 15:26
 *
 * @Description：追求者
 */
public class Pursuit implements GiveGift {
	protected SchoolGirl girl;

	public Pursuit(SchoolGirl girl){
		this.girl = girl;
	}

	@Override
	public void GiveDolls() {
		System.out.println(girl.getName()+"	送洋娃娃");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(girl.getName()+" 送鲜花");
	}

	@Override
	public void GiveChocolate() {
		System.out.println(girl.getName()+" 送巧克力");
	}
}
