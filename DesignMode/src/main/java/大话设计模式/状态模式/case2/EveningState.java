package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:38
 *
 * @author : lyc
 * @Description: 晚间工作状态
 */
public class EveningState extends State {
	@Override
	public void WriteProgram(Work work) {
		if (work.TaskFinished){
			 //如果完成任务，就转入到下班状态
			work.SetState(new RestState());
			work.WriteProgram();
		}else{
			if (work.Hour <21){
				System.out.println("当前时间 "+work.Hour+"  还在加班，想要删库跑路");
			}else{
				work.SetState(new SleepingState());
				work.WriteProgram();
			}
		}
	}
}
