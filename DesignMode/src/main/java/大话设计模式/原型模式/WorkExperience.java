package 大话设计模式.原型模式;

import java.io.Serializable;

/**
 * Date 2018/10/16 15:09
 *
 * @Description: 工作经验
 */
public class WorkExperience implements Serializable,Cloneable {
	public String timeArea= null;
	public String company = null;

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
