package 大话设计模式.工厂方法模式;

import 大话设计模式.simpleFactory.Operation;

/**
 * Date 2018/10/15 17:03
 *
 * @Description
 */
public interface IFactory {
	Operation CreateOperation();
}
