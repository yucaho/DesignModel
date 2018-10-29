package 大话设计模式.工厂方法模式;

import 大话设计模式.simpleFactory.Operation;
import 大话设计模式.simpleFactory.OperationAdd;

/**
 * Date 2018/10/15 17:04
 *
 * @Description: 加法类工厂
 */
public class AddFactory implements IFactory {
	@Override
	public Operation CreateOperation() {
		return  new OperationAdd();
	}
}
