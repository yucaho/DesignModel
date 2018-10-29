package 大话设计模式.模板方法模式;

/**
 * Date 2018/10/16 16:56
 *
 * @Description
 */
public class TestPaperA extends TestPaper {
	@Override
	public String Answer1() {
		return "A";
	}

	@Override
	public String Answer2() {
		return "B";
	}

	@Override
	public String Answer3() {
		return "A";
	}
}
