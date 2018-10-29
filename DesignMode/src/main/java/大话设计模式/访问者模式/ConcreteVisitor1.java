package 大话设计模式.访问者模式;

/**
 * 
 * @author : lyuchao
 * @description:  具体的访问者，该算法片段仍是对应于结构中对象的类
 *
 */
public class ConcreteVisitor1 extends Visitor{

    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementA +" 被 ConcreteVisitor1访问" );
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementB +" 被 ConcreteVisitor1访问" );
    }

}


class ConcreteVisitor2 extends Visitor{
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementA +" 被 ConcreteVisitor2访问" );
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementB +" 被 ConcreteVisitor2访问" );
    }
    
}

