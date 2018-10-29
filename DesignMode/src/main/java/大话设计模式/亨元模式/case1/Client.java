package 大话设计模式.亨元模式.case1;

public class Client {
  

    public static void main(String[] args) {
        //代码外部状态
        int extrinsicstate = 22;
        
        FlyweightFactory factory  = new FlyweightFactory();
        
        Flyweight fx = factory.getFlyweight("X");
        fx.Operation(-- extrinsicstate);
        
          Flyweight fy = factory.getFlyweight("Y");
          fy.Operation(-- extrinsicstate);
          
          Flyweight fz = factory.getFlyweight("Z");
          fz.Operation(--extrinsicstate);
          
          UnsharedConcreteFlyweight  uf  =new UnsharedConcreteFlyweight();
          uf.Operation(--extrinsicstate);
          
          
    }
}
