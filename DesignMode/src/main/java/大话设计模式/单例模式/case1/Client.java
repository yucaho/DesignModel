package 大话设计模式.单例模式.case1;

public class Client {
  public static void main(String[] args) {
	  Singleton s1 = Singleton.getInstance();
	  Singleton s2 = Singleton.getInstance();
	  
	  if (s1 == s2) {
		System.out.println("this is ==");
	}
	  System.out.println("over");
 }
}
