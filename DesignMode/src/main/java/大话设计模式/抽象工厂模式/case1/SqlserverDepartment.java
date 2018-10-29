package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 16:21
 *
 * @author : lyc
 * @Description
 */
public class SqlserverDepartment implements IDepartment {
	@Override
	public void insert(Department department) {
		System.out.println("在SQLserver数据库中给department表增加一条记录");
	}

	@Override
	public Department getDepartment(String id) {
		System.out.println("在SQLserver 中根据id得到一条记录");
		return null;
	}
}
