package 大话设计模式.工厂方法模式;

import 大话设计模式.simpleFactory.Operation;
import 大话设计模式.simpleFactory.OperationSub;

/**
 * Date 2018/10/15 17:05
 *
 * @Description: 减法类工厂
 */
public class SubFactory implements IFactory {
	@Override
	public Operation CreateOperation() {
		return new OperationSub();
	}
}
