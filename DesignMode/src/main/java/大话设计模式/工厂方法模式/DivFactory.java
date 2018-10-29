package 大话设计模式.工厂方法模式;

import 大话设计模式.simpleFactory.Operation;
import 大话设计模式.simpleFactory.OperationAdd;
import 大话设计模式.simpleFactory.OperationDiv;

/**
 * Date 2018/10/15 17:08
 *
 * @Description:除法类工厂
 */
public class DivFactory implements IFactory {
	@Override
	public Operation CreateOperation() {
		return new OperationDiv();
	}
}
