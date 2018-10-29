package 大话设计模式.访问者模式;

public class Client {
    public static void main(String[] args) {
         ObjectStructure o = new ObjectStructure();
         o.Attach( new ConcreteElementA());
         o.Attach(new ConcreteElementB());
         
         ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
         ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
         
         o.Accept(visitor1);
         o.Accept(visitor2);
         System.out.println("over");
         
    }
}
