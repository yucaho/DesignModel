package 大话设计模式.simpleFactory;

/**
 * Date 2018/10/15 9:19
 *
 * @Description: 这个是一个运算类
 */
public class Operation {
	private double numberA=0;
	private double numberB=0;

	public double getResult(){
		double result=0;
		return result;
	}

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
}
