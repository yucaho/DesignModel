package 大话设计模式.模板方法模式;

/**
 * Date 2018/10/16 16:58
 *
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("同学甲抄的试卷");
		TestPaper paper = new TestPaperA();
		paper.TestQuestion1();
		paper.TestQuestion2();
		paper.TestQuestion3();

		System.out.println("同学乙抄的试卷");
		TestPaper paperB = new TestPaperA();
		paperB.TestQuestion1();
		paperB.TestQuestion2();
		paperB.TestQuestion3();
	}
}
