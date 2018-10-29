package 大话设计模式.抽象工厂模式.case2;

import 大话设计模式.抽象工厂模式.case1.IUser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Date 2018/10/23 17:23
 *
 * @author : lyc
 * @Description
 */


public class Reflact {
	public static void main(String[] args) throws Exception {
		Class<?> name = Class.forName("大话设计模式.抽象工厂模式.case2.XYZ");
	//	Class<XYZ> name = XYZ.class;
		Method[] methods = name.getDeclaredMethods();//利用得到的class对象的自审，返回方法对象集合
		for ( Method me: methods
			 ) {
			System.out.println(me.toString());
		}
		System.out.println("***********");
		//设置Class对象数组，用于指定构造方法类型
		Class[] c1 = {int.class, int.class};
		//获取Constructor构造器对象，并制定构造方法类型
		Constructor<?> constructor = name.getConstructor(c1);
		//给传入参数赋初值
		Object[] objects = {new Integer(33),new Integer(67)};
		//得到实例
		Object o = constructor.newInstance(objects);
		System.out.println("***********");

		System.out.println( name.getName());
	}
}
class XYZ{
	public static String name = "jingjing";

	static{
		System.out.println("xyz的静态块");
	}
	public XYZ(int a,int b){
		System.out.println("this is a ="+a+"	this is b="+b);
	}
	public void test(){
		System.out.println("this is a  test");
	}
}