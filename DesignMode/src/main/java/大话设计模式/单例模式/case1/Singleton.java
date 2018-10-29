package 大话设计模式.单例模式.case1;


public class Singleton {
  private static Singleton singleton;
  
  private Singleton(){ }
  
  public static Singleton getInstance(){
	   if (singleton == null) {
		 singleton = new Singleton();
	   }
	   return singleton;
  }
  
}
