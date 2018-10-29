package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 16:06
 *
 * @author : lyc
 * @Description
 */
public class AccessFactory implements IFactory {
	@Override
	public IUser createUser() {
		return  new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return null;
	}
}
