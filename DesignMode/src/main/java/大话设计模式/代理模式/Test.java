package 大话设计模式.代理模式;

/**
 * Date 2018/10/15 15:42
 *
 * @Description
 */
public class Test {
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("梦中人");

		Proxy proxy = new Proxy(girl);
		proxy.GiveDolls();
		proxy.GiveFlowers();
		proxy.GiveChocolate();
		System.out.println("gime over");
	}
/*
	梦中人	送洋娃娃
	梦中人 送鲜花
	梦中人 送巧克力
	gime over
*/
}
