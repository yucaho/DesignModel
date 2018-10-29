package 大话设计模式.访问者模式;

public abstract class Visitor {
    
       public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);
       
       public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
}
