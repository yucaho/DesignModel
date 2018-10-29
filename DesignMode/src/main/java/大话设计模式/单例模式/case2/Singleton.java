package 大话设计模式.单例模式.case2;

/**
 * 
 * @author : lyuchao
 * @description: 多线程时的单例， 使用了 synchronized同步锁或是同步代码块对类加同步锁，但是该方式运行效率地下
 *  下一个线程想要获取对象，就必须等待上一个线程释放锁之后
 *
 */
public class Singleton {
	private static Singleton singleton =null;
    
	private Singleton(){}
	
	/*
	 *  使用了 synchronized 同步锁
	 */
	public static Singleton getSingleton(){
	     synchronized (Singleton.class) {
               if (singleton == null) {
                 singleton = new Singleton();
            }
        }
	     return singleton;
	}
}
