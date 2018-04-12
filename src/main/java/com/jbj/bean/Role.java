package com.jbj.bean;

public class Role {
	private Integer sId;
	private String rName;

public Role() {
}

public Role(Integer sId, String rName) {
	this.sId = sId;
	this.rName = rName;
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
	return "Role{" +
			"sId=" + sId +
			", rName='" + rName + '\'' +
			'}';
}
}
