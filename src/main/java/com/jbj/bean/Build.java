package com.jbj.bean;

import java.util.Date;

public class Build {
	private Integer id;
	private String buildName;
	private String dvpcompany;
	private String province;
	private String city;
	private String area;
	private String designcompany;
	private String sightcompany;
	private String pmcompany;
	private String sg;
	private String ischoice;
	private String delivery;
	private String periods;
	private String buildingnm;
	private String taskStatus;
	private Date buildTime;

public Build() {
}

public Build(Integer id, String buildName, String dvpcompany, String province, String city, String area, String designcompany, String sightcompany, String pmcompany, String sg, String ischoice, String delivery, String periods, String buildingnm, String taskStatus, Date buildTime) {
	this.id = id;
	this.buildName = buildName;
	this.dvpcompany = dvpcompany;
	this.province = province;
	this.city = city;
	this.area = area;
	this.designcompany = designcompany;
	this.sightcompany = sightcompany;
	this.pmcompany = pmcompany;
	this.sg = sg;
	this.ischoice = ischoice;
	this.delivery = delivery;
	this.periods = periods;
	this.buildingnm = buildingnm;
	this.taskStatus = taskStatus;
	this.buildTime = buildTime;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getBuildName() {
	return buildName;
}

public void setBuildName(String buildName) {
	this.buildName = buildName;
}

public String getDvpcompany() {
	return dvpcompany;
}

public void setDvpcompany(String dvpcompany) {
	this.dvpcompany = dvpcompany;
}

public String getProvince() {
	return province;
}

public void setProvince(String province) {
	this.province = province;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getDesigncompany() {
	return designcompany;
}

public void setDesigncompany(String designcompany) {
	this.designcompany = designcompany;
}

public String getSightcompany() {
	return sightcompany;
}

public void setSightcompany(String sightcompany) {
	this.sightcompany = sightcompany;
}

public String getPmcompany() {
	return pmcompany;
}

public void setPmcompany(String pmcompany) {
	this.pmcompany = pmcompany;
}

public String getSg() {
	return sg;
}

public void setSg(String sg) {
	this.sg = sg;
}

public String getIschoice() {
	return ischoice;
}

public void setIschoice(String ischoice) {
	this.ischoice = ischoice;
}

public String getDelivery() {
	return delivery;
}

public void setDelivery(String delivery) {
	this.delivery = delivery;
}

public String getPeriods() {
	return periods;
}

public void setPeriods(String periods) {
	this.periods = periods;
}

public String getBuildingnm() {
	return buildingnm;
}

public void setBuildingnm(String buildingnm) {
	this.buildingnm = buildingnm;
}

public String getTaskStatus() {
	return taskStatus;
}

public void setTaskStatus(String taskStatus) {
	this.taskStatus = taskStatus;
}

public Date getBuildTime() {
	return buildTime;
}

public void setBuildTime(Date buildTime) {
	this.buildTime = buildTime;
}

@Override
public String toString() {
	return "Build{" +
			"id=" + id +
			", buildName='" + buildName + '\'' +
			", dvpcompany='" + dvpcompany + '\'' +
			", province='" + province + '\'' +
			", city='" + city + '\'' +
			", area='" + area + '\'' +
			", designcompany='" + designcompany + '\'' +
			", sightcompany='" + sightcompany + '\'' +
			", pmcompany='" + pmcompany + '\'' +
			", sg='" + sg + '\'' +
			", ischoice='" + ischoice + '\'' +
			", delivery='" + delivery + '\'' +
			", periods='" + periods + '\'' +
			", buildingnm='" + buildingnm + '\'' +
			", taskStatus='" + taskStatus + '\'' +
			", buildTime=" + buildTime +
			'}';
}
}
