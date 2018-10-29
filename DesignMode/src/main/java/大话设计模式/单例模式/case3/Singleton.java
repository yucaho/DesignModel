package 大话设计模式.单例模式.case3;

/**
 * 
 * @author : lyuchao
 * @description: 饿汉式单例(立即加载方式)
 *
 */
public class Singleton {
    private Singleton(){}
    
    private static Singleton singleton = new Singleton();
    
    //静态工厂方法
    public static Singleton getSingleton(){
        return singleton;
    }
}
