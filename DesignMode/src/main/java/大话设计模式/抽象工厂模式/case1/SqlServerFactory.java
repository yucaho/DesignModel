package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 16:03
 *
 * @author : lyc
 * @Description
 */
public class SqlServerFactory implements IFactory {
	@Override
	public IUser createUser() {

		return new SqlserverUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlserverDepartment();
	}
}
