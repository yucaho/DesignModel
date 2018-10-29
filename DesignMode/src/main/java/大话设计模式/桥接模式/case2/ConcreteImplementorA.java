package 大话设计模式.桥接模式.case2;

public class ConcreteImplementorA  extends Implementor{

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
           System.out.println("具体实现A 的方法");
    }      
}


 class ConcreteImplementorB  extends Implementor{

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        System.out.println("具体实现B的方法");
    }
    
}
