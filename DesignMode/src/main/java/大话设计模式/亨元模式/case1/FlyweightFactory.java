package 大话设计模式.亨元模式.case1;

import java.util.Hashtable;

/**
 * 
 * @author : lyuchao
 * @description:  是一个亨元工厂
 *
 */
public class FlyweightFactory {
    private Hashtable<String, Flyweight> flyweights = new Hashtable<>();
    
    //初始化工厂时，先生成三个实例
    public FlyweightFactory(){
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());  
    }
    
    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
