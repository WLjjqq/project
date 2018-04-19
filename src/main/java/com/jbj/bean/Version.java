package com.jbj.bean;

public class Version {
    private Integer vId;
    private String versionNew;
    private String versionUrl;

    public Version() {
    }

    public Version(Integer vId, String versionNew, String versionUrl) {
        this.vId = vId;
        this.versionNew = versionNew;
        this.versionUrl = versionUrl;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getVersionNew() {
        return versionNew;
    }

    public void setVersionNew(String versionNew) {
        this.versionNew = versionNew;
    }

    public String getVersionUrl() {
        return versionUrl;
    }

    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }

    @Override
    public String toString() {
        return "Version{" +
                "vId=" + vId +
                ", versionNew='" + versionNew + '\'' +
                ", versionUrl='" + versionUrl + '\'' +
                '}';
    }
}
