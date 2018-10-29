package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 16:07
 *
 * @author : lyc
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		User user = new User();
		//若要是改成access数据库，只需要将本句改成 AccessFactory
		IFactory factory = new SqlServerFactory();
		IUser user1 = factory.createUser();
		user1.insert(user);
		user1.getUser("1");

		Department department = new Department();
		IDepartment factoryDepartment = factory.createDepartment();
		factoryDepartment.insert(department);
		factoryDepartment.getDepartment("2");
	}
}
