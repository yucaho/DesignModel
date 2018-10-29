package 大话设计模式.simpleFactory;

/**
 * Date 2018/10/15 9:23
 *
 * @Description: 这个是乘法的类
 */
public class OperationMul extends Operation{

	@Override
	public double getResult() {
		double result =0;
		result = getNumberA() *getNumberB();
		return result;
	}
}
