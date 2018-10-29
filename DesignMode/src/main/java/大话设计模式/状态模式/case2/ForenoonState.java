package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:31
 *
 * @author : lyc
 * @Description: 上午的工作状态
 */
public class ForenoonState extends State {
	@Override
	public void WriteProgram(Work work) {
		if (work.Hour < 12){
			System.out.println("当前时间："+ work.Hour+ " 上午工作");
		}else{
			//超过12点，转入中午工作状态
			work.SetState(new NoonState());
			work.WriteProgram();
		}
	}
}
