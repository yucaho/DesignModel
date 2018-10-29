package 大话设计模式.simpleFactory;

/**
 * Date 2018/10/15 9:23
 *
 * @Description: 这个是除法的类
 */
public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result =0;

		try {
			return getNumberA()/getNumberB();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return result;
	}
}
