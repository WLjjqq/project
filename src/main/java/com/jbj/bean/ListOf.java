package com.jbj.bean;

public class ListOf {
    private Integer lId;
    private String lName;
    private String lType;
    private Integer lListId;
    private Integer lCount;

    public ListOf() {
    }

    public ListOf(Integer lId, String lName, String lType, Integer lListId, Integer lCount) {
        this.lId = lId;
        this.lName = lName;
        this.lType = lType;
        this.lListId = lListId;
        this.lCount = lCount;
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getlListId() {
        return lListId;
    }

    public void setlListId(Integer lListId) {
        this.lListId = lListId;
    }

    public Integer getlCount() {
        return lCount;
    }

    public void setlCount(Integer lCount) {
        this.lCount = lCount;
    }

    public String getlType() {
        return lType;
    }

    public void setlType(String lType) {
        this.lType = lType;
    }

    @Override
    public String toString() {
        return "ListOf{" +
                "lId=" + lId +
                ", lName='" + lName + '\'' +
                ", lType='" + lType + '\'' +
                ", lListId=" + lListId +
                ", lCount=" + lCount +
                '}';
    }
}
