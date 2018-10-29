package 大话设计模式.策略模式;

/**
 * Date 2018/10/15 10:34
 *
 * @Description
 */
public class Test {
	public static void main(String[] args) {
		CashContext context = new CashContext("打折");
		double result = context.getResult(100);
		System.out.println("这个是打完折之后的"+result);

	}
}
