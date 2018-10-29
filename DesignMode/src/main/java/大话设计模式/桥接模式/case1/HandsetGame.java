package 大话设计模式.桥接模式.case1;

/**
 * 
 * @author : lyuchao
 * @description:  手机游戏
 *
 */
public class HandsetGame  extends HandsetSoft{

    @Override
    public void run() {
        System.out.println("运行手机游戏");
    }
   
}


/**
 * 
 * @author : lyuchao
 * @description:  手机通讯录
 *
 */
class HandsetAddressList extends HandsetSoft{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("运行手机通讯录");
    }
    
}

