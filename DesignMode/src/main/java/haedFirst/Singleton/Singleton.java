package haedFirst.Singleton;

/**
 * Date 2018/9/5 11:11
 *
 * @Description: 单例模式的
 */
public class Singleton {
	private static  Singleton uniqueInstance;

	//将构造器声明为私有的，只有singleton类内才可以调用构造器
	private  Singleton(){}

	//用getInstance()方法实例化对象，并返回这个实例
	public static Singleton getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return  uniqueInstance;
	}
}
