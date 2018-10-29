package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:38
 *
 * @author : lyc
 * @Description: 中午工作状态
 */
public class NoonState extends State {
	@Override
	public void WriteProgram(Work work) {
		if (work.Hour < 13){
			System.out.println("当前时间是 "+work.Hour+"  已经饿了， 有些困");
		}else {
			work.SetState(new AfternoonState());
			work.WriteProgram();
		}
	}
}
