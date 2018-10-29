package 大话设计模式.桥接模式.case2;

public class Client {
  public static void main(String[] args) {
     Abstraction abstraction = new RefinedAbstraction();
     abstraction.setImplementor(new ConcreteImplementorA());
     abstraction.Opeartion();
     
     abstraction.setImplementor(new ConcreteImplementorB());
     abstraction.Opeartion();
 }
}
