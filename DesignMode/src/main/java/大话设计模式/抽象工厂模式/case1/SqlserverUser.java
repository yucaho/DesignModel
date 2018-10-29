package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 15:49
 *
 * @author : lyc
 * @Description
 */
public class SqlserverUser implements IUser {
	@Override
	public void insert(User user) {
		System.out.println("sqlserver  再给user表中添加数据");
	}

	@Override
	public User getUser(String id) {
		System.out.println("SQLserver 表根据id查询user表中的数据");
		return null;
	}
}
