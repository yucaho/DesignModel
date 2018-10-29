package 大话设计模式.状态模式.case1;

/**
 * Date 2018/10/24 11:00
 *
 * @author : lyc
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());

		c.Request();
		c.Request();
		c.Request();
		c.Request();
	}

	/*
	this  in  A
	this in B
	this  in  A
	this in B
*/

}
