
package 大话设计模式.状态模式.case2;

/**
 * Date 2018/10/24 11:29
 *
 * @author : lyc
 * @Description: 工作
 */
public class Work {
	protected int Hour;

	protected  State current;
	public Work(){
		current = new ForenoonState();
	}

	protected  boolean TaskFinished = false;

	public boolean isTaskFinished() {
		return TaskFinished;
	}

	public void setTaskFinished(boolean taskFinished) {
		TaskFinished = taskFinished;
	}

	public void SetState(State state){
		current = state;
	}
	public void WriteProgram(){
		current.WriteProgram(this);
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(int hour) {
		Hour = hour;
	}
}
