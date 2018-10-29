package haedFirst.Singleton;

/**
 * Date 2018/9/5 11:18
 *
 * @Description: 这个是一个巧克力的锅炉
 */
public class ChocolateBoiler {
	//空的
	private boolean  empty;

	//煮沸
	private boolean  boiled;

	public ChocolateBoiler(){
		empty = true;
		boiled = false;
	}

	//锅炉为空，向锅炉中添加原料
	public void fill(){
		if (isEmpty()){
			empty = false;
			boiled = false;
		}
	}

	public void drain(){

	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
