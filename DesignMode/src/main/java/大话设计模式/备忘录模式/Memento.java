package 大话设计模式.备忘录模式;

/**
 * Date 2018/10/24 15:52
 *
 * @author : lyc
 * @Description: 备忘录
 */
public class Memento {
	protected String state;

	//构造方法，将相关数据导入
	public Memento(String state){
		this.state = state;
	}

	//需要保存的数据属性，可以是多个
	public String getState() {
		return state;
	}
}
