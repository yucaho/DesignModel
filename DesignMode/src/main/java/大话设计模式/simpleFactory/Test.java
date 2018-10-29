package 大话设计模式.simpleFactory;

/**
 * Date 2018/10/15 9:47
 *
 * @Description: 用来测试
 */
public class Test {
	public static void main(String[] args) {
		Operation operation =null;
		operation = OperationFactory.createOperation("+");
		operation.setNumberA(11);
		operation.setNumberB(1);
		double result = operation.getResult();
	}
}
