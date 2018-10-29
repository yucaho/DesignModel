package 大话设计模式.建造者模式.case2;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 2018/10/22 17:03
 *
 * @Description:产品类，有多个部件组成
 */
public class Product {
	List<String> parts  = new ArrayList<>();

	//添加产品部件
	public  void Add(String part){
		parts.add(part);
	}

	public void Show(){
		System.out.println("创建产品");
		for (String part:parts
			 ) {
			System.out.println(part);
		}
	}
}
