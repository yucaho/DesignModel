package 大话设计模式.单例模式.case2;

/**
 * 
 * @author : lyuchao
 * @description:  static静态代码块实现
 *
 */
public class Singleton4 {
    private Singleton4(){}
    
    private static Singleton4 singleton4 = null;
    
    //静态代码块
    static {
         singleton4  = new Singleton4();
    }
    
    public static Singleton4 getSingleton4(){
        return singleton4;
    }
}
