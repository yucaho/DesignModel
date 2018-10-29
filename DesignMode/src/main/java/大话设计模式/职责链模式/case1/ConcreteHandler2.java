package 大话设计模式.职责链模式.case1;


public class ConcreteHandler2  extends Handler{

    @Override
    public void HandlerRequest(int request) {
        if (request >= 10 && request < 20) {
             System.out.println("10-20 来处理  "+request);
        }else if (successor !=null) {
             successor.HandlerRequest(request);
        }
        
    }
    
}
