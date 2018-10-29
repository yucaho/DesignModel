package 大话设计模式.抽象工厂模式.case1;

/**
 * Date 2018/10/23 15:26
 *
 * @Description
 */
public class User {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "黄鹤一去不复返，白云千载空悠悠";
	}
}
