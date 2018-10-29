package 大话设计模式.单例模式.case2;

/**
 * 
 * @author : lyuchao
 * @description: 静态内部类实现, 它可以保证单例在多线程并发的情况下的线程安全性，但是
 * 在遇到序列化对象时，默认的方式得到的运行结果就是多例的。
 *
 */
public class Singleton3 {
    private Singleton3(){}
    
    //静态内部类
    private static class InnerObject{
        private static Singleton3 singleton3 = new Singleton3();
    }
    
    public static Singleton3 getInSingleton(){
        return InnerObject.singleton3;
    }
}
