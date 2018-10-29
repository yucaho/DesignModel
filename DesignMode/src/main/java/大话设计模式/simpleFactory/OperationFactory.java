package 大话设计模式.simpleFactory;

/**
 * Date 2018/10/15 9:42
 *
 * @Description: 简单工厂模式
 */
public class OperationFactory {
	public static Operation  createOperation(String operation){
		Operation oper= null;
		switch (operation){
			case "+":
				oper = new OperationAdd();
				break;
			case "/":
				oper = new OperationDiv();
				break;
			case "-":
				oper= new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
		}
		return  oper;
	}
}
