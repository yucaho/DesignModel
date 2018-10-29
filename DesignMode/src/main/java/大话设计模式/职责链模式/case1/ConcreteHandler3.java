package 大话设计模式.职责链模式.case1;


public class ConcreteHandler3  extends Handler{

    @Override
    public void HandlerRequest(int request) {
        if (request >= 20 && request < 30) {
             System.out.println("20-30 来处理  "+request);
        }else if (successor !=null) {
             successor.HandlerRequest(request);
        }
        
    }
    
}
