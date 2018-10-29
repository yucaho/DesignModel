package 大话设计模式.中介模式;

/**
 * 
 * @author : lyuchao
 * @description:
 *
 */
public abstract class Colleague {
   //抽象调停类
    protected Mediator mediator;
   
   public Colleague(Mediator mediator){
       this.mediator = mediator;
   } 
   
}


