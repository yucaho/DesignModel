package 大话设计模式.访问者模式;



public class ConcreteElementA extends Element {

    @Override
    public void Accept(Visitor visitor) {
        // TODO Auto-generated method stub
          visitor.VisitConcreteElementA(this);
    }
  public void  getOpeartion(){
      System.out.println("this is  ConcreteElementA");
  }
}


class ConcreteElementB extends Element{

    @Override
    public void Accept(Visitor visitor) {
        // TODO Auto-generated method stub
          visitor.VisitConcreteElementB(this);
    }
    
    public void getOpeartion(){
        System.out.println("this is ConcreteElementB");
    }
}