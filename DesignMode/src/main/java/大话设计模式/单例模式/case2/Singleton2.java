package 大话设计模式.单例模式.case2;

public class Singleton2 {
    private Singleton2(){}
    
    private static Singleton2 singleton2 = null;
    
    //双重检查  做了进一步的优化，可以避免真个方法被锁，只对需要锁的代码部分加锁，可以提高执行效率
    public static Singleton2 getSingleton2(){
         if (singleton2 == null) {
            synchronized (Singleton2.class) {
                 if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
         return singleton2;
    }
}
