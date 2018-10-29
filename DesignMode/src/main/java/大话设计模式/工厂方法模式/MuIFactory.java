package 大话设计模式.工厂方法模式;

import 大话设计模式.simpleFactory.Operation;
import 大话设计模式.simpleFactory.OperationMul;

/**
 * Date 2018/10/15 17:06
 *
 * @Description: 乘法类工厂
 */
public class MuIFactory implements IFactory {
	@Override
	public Operation CreateOperation() {
		return new OperationMul();
	}
}
