package 大话设计模式.亨元模式.case1;


public abstract class Flyweight {
    public abstract void Operation(int extrinsicstate);
}

/**
 * 
 * @author : lyuchao
 * @description:  继承超类或者实现接口，并为内部状态增加存储空间
 *
 */
class ConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicstate) {
        // TODO Auto-generated method stub
        System.out.println("具体的flyweight "+extrinsicstate);
    }
    
}

/**
 * 
 * @author : lyuchao
 * @description:  指的是那些不需要共享的flyweight子类，因为它的父接口并不强制要求共享
 *
 */
class UnsharedConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicstate) {
        // TODO Auto-generated method stub
        System.out.println("不共享的具体 flyweight"+extrinsicstate);
    }
    
}