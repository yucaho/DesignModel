package 大话设计模式.工厂方法模式;

import 大话设计模式.simpleFactory.Operation;

/**
 * Date 2018/10/15 17:09
 *
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		IFactory iFactory = new AddFactory();
		Operation operation = iFactory.CreateOperation();

		operation.setNumberA(11);
		operation.setNumberB(2);
		double result = operation.getResult();
		System.out.println(result);
	}
}
