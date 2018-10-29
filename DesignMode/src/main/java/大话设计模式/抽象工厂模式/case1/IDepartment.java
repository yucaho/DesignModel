package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 16:12
 *
 * @author : lyc
 * @Description：用于客户端访问，解除与具体数据库访问的耦合
 */
public interface IDepartment {
	void insert(Department department);

	Department getDepartment(String id);
}
