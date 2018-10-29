package 大话设计模式.桥接模式.case1;

/**
 * 
 * @author : lyuchao
 * @description:  手机品牌
 *
 */
public abstract class HandsetBrand {
   protected  HandsetSoft soft;
   
   //设置手机软件,  品牌需要关注软件，所以可以在机器中安装软件
   public void SetHandsetSoft( HandsetSoft soft) {
        this.soft = soft;  
   }
   
   //运行
   public abstract void Run();
} 
