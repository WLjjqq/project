package com.jbj.bean;

public class UsRo {
	private Integer uId;
	private String userName;
	private String password;
	private Integer sId;
	private String rName;

public UsRo() {
}

public UsRo(Integer uId, String userName, String password, Integer sId, String rName) {
	this.uId = uId;
	this.userName = userName;
	this.password = password;
	this.sId = sId;
	this.rName = rName;
}

public Integer getuId() {
	return uId;
}

public void setuId(Integer uId) {
	this.uId = uId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Integer getsId() {
	return sId;
}

public void setsId(Integer sId) {
	this.sId = sId;
}

public String getrName() {
	return rName;
}

public void setrName(String rName) {
	this.rName = rName;
}

@Override
public String toString() {
	return "UsRo{" +
			"uId=" + uId +
			", userName='" + userName + '\'' +
			", password='" + password + '\'' +
			", sId=" + sId +
			", rName='" + rName + '\'' +
			'}';
}
}
