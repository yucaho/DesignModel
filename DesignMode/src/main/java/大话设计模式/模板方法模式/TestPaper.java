package 大话设计模式.模板方法模式;

/**
 * Date 2018/10/16 16:53
 *
 * @Description: 这个是所有类的父类
 */
public class TestPaper {
	public void TestQuestion1(){
		System.out.println("questOne");
		System.out.println("答案："+Answer1());
	}
	public String Answer1(){
		return "";
	}
	public void TestQuestion2(){
		System.out.println("questTwo");
		System.out.println("答案："+Answer2());
	}
	public String Answer2(){
		return "";
	}
	public void TestQuestion3(){
		System.out.println("questThree");
		System.out.println("答案："+Answer3());
	}
	public String Answer3(){
		return "";
	}
}
