package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 15:52
 *
 * @author : lyc
 * @Description
 */
public class AccessUser implements IUser {
	@Override
	public void insert(User user) {
		System.out.println("在 access数据库中给user表里面插入数据");
	}

	@Override
	public User getUser(String id) {
		System.out.println("在access数据库中根据id来查抄数据");
		return null;
	}
}
