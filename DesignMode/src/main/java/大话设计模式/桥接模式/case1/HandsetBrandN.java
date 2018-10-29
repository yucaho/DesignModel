package 大话设计模式.桥接模式.case1;

/**
 * 
 * @author : lyuchao
 * @description: 品牌N
 *
 */
public class HandsetBrandN  extends HandsetBrand{

    @Override
    public void Run() {
        // TODO Auto-generated method stub
         System.out.println("这里是N品牌");
    }
    
}

/**
 * 
 * @author : lyuchao
 * @description: 手机品牌M
 *
 */
class HandsetBrandM extends HandsetBrand{

    @Override
    public void Run() {
        // TODO Auto-generated method stub
        System.out.println("这里是M品牌");
    }
    
}
