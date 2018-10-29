package 大话设计模式.命令模式;



/**
 * 
 * @author : lyuchao
 * @description: 用来声明执行操作的接口
 *
 */
public abstract class Command {
    protected  Receiver receiver;
    
    public  Command(Receiver receiver){
        this.receiver  = receiver;
    }
    
    abstract public void  ececute();
}

/**
 * 
 * @author : lyuchao
 * @description:  讲一个接收者对象绑定于一个动作，调用接受者相应的操作
 *
 */
class ConcreteCommand extends Command{
   public ConcreteCommand(Receiver receiver){
       super(receiver);
   }
    
    @Override
    public void ececute() {
        // TODO Auto-generated method stub
         receiver.Action();
    }
    
}
