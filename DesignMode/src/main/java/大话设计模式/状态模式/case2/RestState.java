package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:57
 *
 * @author : lyc
 * @Description： 下班休息状态
 */
public class RestState extends State{
	@Override
	public void WriteProgram(Work work) {
		System.out.println("当前时间 "+work.Hour+"  下班回家");
	}
}
