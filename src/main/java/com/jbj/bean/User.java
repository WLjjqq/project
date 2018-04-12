package com.jbj.bean;


public class User {
	private Integer uId;
	private String userName;
	private String password;
	private Role role;

public User() {
}

public User(Integer uId, String userName, String password, Role role) {
	this.uId = uId;
	this.userName = userName;
	this.password = password;
	this.role = role;
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

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

@Override
public String toString() {
	return "User{" +
			"uId=" + uId +
			", userName='" + userName + '\'' +
			", password='" + password + '\'' +
			", role=" + role +
			'}';
}
}
