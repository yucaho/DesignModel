package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 15:55
 *
 * @author : lyc
 * @Description: 定义一个创建访问user表对象的抽象的工厂接口
 */
public interface IFactory {
	IUser createUser();

	//增加的接口方法
	IDepartment createDepartment();
}
