package 大话设计模式.桥接模式.case2;

public class Abstraction {
    protected Implementor implementor;

   public void Opeartion() {
     implementor.Operation();
   }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
    
}


class RefinedAbstraction extends Abstraction{

    @Override
    public void Opeartion() {
        // TODO Auto-generated method stub
        implementor.Operation();
    }
    
}
