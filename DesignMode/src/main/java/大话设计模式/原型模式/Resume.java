package 大话设计模式.原型模式;

import java.io.*;
import java.util.ArrayList;

/**
 * Date 2018/10/16 15:10
 *
 * @Description: 简历
 */
public class Resume implements Cloneable {
	public String name =null;
	public Integer age =null;
	public String sex =null;
	//public ArrayList<String> famMem = new ArrayList<>();
	public WorkExperience work=null;

	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}

	public void setName(String name){
		this.name = name;
	}
	//设置个人信息
	public void setPersonal(String sex, int age){
		this.age = age;
		this.sex = sex;
		//this.famMem = famMem;
	}

	//设置工作经历
	public void setWork(String timeArea, String company){
		work.timeArea = timeArea;
		work.company = company;
	}

	//浅复制
	public Object clone(){
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return  obj;
	}
	//深复制
	public Object deepClone() throws IOException, ClassNotFoundException {
		//将对象写到流里
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(this);
		//从流里读出来
		ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		return (objectInputStream.readObject());


	}

	public void display() {
		System.out.println(this.name + " " + this.sex + " " + this.age);
		System.out.print("Work experience: " + this.work.timeArea);
		System.out.println(" " + this.work.company);
		System.out.println();
	}// display

}



















