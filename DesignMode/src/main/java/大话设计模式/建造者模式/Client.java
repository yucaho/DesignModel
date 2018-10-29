package 大话设计模式.建造者模式;

/**
 * Date 2018/10/22 16:38
 *
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		PersonBuilder builder  = new PersonThonBuilder();
		PersonDirector director = new PersonDirector(builder);
		director.CreatePerson();

	}
}
