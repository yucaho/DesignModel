package 大话设计模式.中介模式;

/**
 * 
 * @author : lyuchao
 * @description: 具体的1号同事
 *
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }
   
    //发送信息是通常是中介者发送出去的
    public void Send(String message){
        mediator.Send(message, this);
    }
    
    public void notify(String message){
        System.out.println("1号同事得到了信心"+message);
    }
}


/**
 * 
 * @author : lyuchao
 * @description: 2号同事
 *
 */
class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }
   
    //发送信息是通常是中介者发送出去的
    public void Send(String message){
        mediator.Send(message, this);
    }
    
    public void notify(String message){
        System.out.println("2号同事得到了信心"+message);
    }
}

