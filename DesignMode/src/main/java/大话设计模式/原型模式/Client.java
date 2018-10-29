package 大话设计模式.原型模式;

import java.util.ArrayList;

/**
 * Date 2018/10/16 15:19
 *
 * @Description
 */
public class Client {
	public static void main(String[] args) {
		Resume resume = new Resume("大鸟");
		resume.setPersonal("nan",20);
		resume.setWork("1998-2000","xxx公司");

		//浅复制
		Resume b =(Resume) resume.clone();
		b.display();
		b.setPersonal("nan",30);
		b.setWork("1996-1998","yyy公司");

		resume.display();
		b.display();
/*      输出的结果
		大鸟 nan 20
		Work experience: 1996-1998 yyy公司

		大鸟 nan 30
		Work experience: 1996-1998 yyy公司*/

		Resume c = new Resume("小鸟");
		c.setPersonal("男",18);
		c.setWork("2000-2002","zzz公司");
		//深复制
		Resume d =(Resume)c.clone();
		d.setPersonal("未知",20);
		d.setWork("2000-2010","xyz公司");

		c.display();
		d.display();
/*
		小鸟 男 18
		Work experience: 2000-2002 zzz公司

		小鸟 未知 20
		Work experience: 2000-2010 xyz公司*/

	}
}




















