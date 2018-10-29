package 大话设计模式.中介模式;

/**
 * 
 * @author : lyuchao
 * @description: 抽象的中介者
 *
 */
public abstract class Mediator {
    public abstract void Send(String message,Colleague colleague);
}


/**
 * 
 * @author : lyuchao
 * @description: 具体的中介者类
 *
 */

class ConcreteMeditor extends Mediator{

    private ConcreteColleague1  colleague1;
    private ConcreteColleague2   colleague2;
    
    
    //需要了解所有的具体同事对象
    public void setColleague(ConcreteColleague1 colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }


    @Override
    public void Send(String message, Colleague colleague) {
       if (colleague == colleague1) {
          colleague1.notify(message);
       }else{
           colleague2.notify(message);
       }
    }
    
}

