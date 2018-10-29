package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 15:27
 * @author lyc
 * @Description: 用户客户端的访问，解除与具体数据访问的耦合
 */
public interface IUser {

	void insert(User user);
	User getUser(String id);


}
