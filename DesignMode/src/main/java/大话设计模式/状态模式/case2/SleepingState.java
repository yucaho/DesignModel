package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:55
 *
 * @author : lyc
 * @Description: 睡眠状态
 */
public class SleepingState extends State{
	@Override
	public void WriteProgram(Work work) {
		System.out.println("当前时间是"+ work.Hour+" 想睡觉啊");
	}
}
