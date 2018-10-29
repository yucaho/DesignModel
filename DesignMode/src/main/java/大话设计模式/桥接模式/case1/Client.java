package 大话设计模式.桥接模式.case1;

/**
 * 
 * @author : lyuchao
 * @description:
 *
 */
public class Client {
    public static void main(String[] args) {
         HandsetBrand  brand =null;
         
         brand = new HandsetBrandN();
         brand.SetHandsetSoft(new HandsetGame());
         brand.Run();
         
         brand = new HandsetBrandM();
         brand.SetHandsetSoft(new HandsetAddressList());
         brand.Run();
    }
}
