package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:38
 *
 * @author : lyc
 * @Description: 下午工作状态
 */
public class AfternoonState extends State {
	@Override
	public void WriteProgram(Work work) {
		if (work.Hour < 17){
			System.out.println("当前时间是 "+work.Hour+"  状态还不错，继续努力");
		}else {
			work.SetState(new EveningState());
			work.WriteProgram();
		}
	}
}
