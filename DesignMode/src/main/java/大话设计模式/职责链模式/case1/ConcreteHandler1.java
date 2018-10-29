package 大话设计模式.职责链模式.case1;


/**
 * 
 * @author : lyuchao
 * @description: 具体处理者类，处理他所负责的请求，可访问它的后继者，如果可处理该请求就处理，
 * 否则就将该请求转发给它的后继者
 *
 */
public class ConcreteHandler1  extends Handler{

    @Override
    public void HandlerRequest(int request) {
        // TODO Auto-generated method stub
        if (request >=0 && request <= 10) {
            System.out.println("处理请求   "+  request);
            System.out.println("this is ConcreteHandler1");
        }else if (successor != null) {
             successor.HandlerRequest(request);
        }
    }
  
}
