package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 14:30
 *
 * @author : lyc
 * @Description： 在运行的时候发现如果不是按照时间顺序来弄，展示出来的结果和想要的结果不一致
 * 使用状态模式需要数据有顺序的来
 */
public class Client {
	public static void main(String[] args) {
		Work work = new Work();
		work.Hour = 9;
		work.WriteProgram();


		work.Hour = 12;
		work.WriteProgram();

		work.Hour = 15;
		work.WriteProgram();

		/*work.Hour = 10;
		work.WriteProgram();*/

		work.Hour = 18;
		work.WriteProgram();

		work.setTaskFinished(true);
		work.Hour = 22;
		work.WriteProgram();

	}
}
