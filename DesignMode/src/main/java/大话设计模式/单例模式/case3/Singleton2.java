package 大话设计模式.单例模式.case3;

/**
 * 
 * @author : lyuchao
 * @description: 懒汉式单例(延迟加载)
 *
 */
public class Singleton2 {
    
    private Singleton2 (){}
    
    private static Singleton2 singleton2 = null;
    
    
    public static Singleton2 getSingleton2(){
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
