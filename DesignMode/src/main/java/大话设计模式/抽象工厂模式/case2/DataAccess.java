package 大话设计模式.抽象工厂模式.case2;

import 大话设计模式.抽象工厂模式.case1.*;

/**
 * Date 2018/10/23 16:58
 *
 * @author : lyc
 * @Description
 */
public class DataAccess {
	private static String db="Sqlserver"; //access

	public static IUser createUser(){
		IUser result = null;
		switch (db){
			case "Sqlserver":
				result = new SqlserverUser();
				break;
			case "Access":
				result = new AccessUser();
				break;
		}
		return  result;
	}
	public static IDepartment createDepartment(){
		IDepartment result = null;
		switch (db){
			case "Sqlserver":
				result = new SqlserverDepartment();
				break;
			case "Access":
				result = null;
				break;
		}
		return  result;
	}
}
