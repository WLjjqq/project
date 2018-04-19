package com.jbj.bean;

import org.omg.PortableInterceptor.Interceptor;

public class Feedback {
    private Integer fId;
    private Integer fType;
    private String fDescribe;
    private String fImg;

    public Feedback() {
    }

    public Feedback(Integer fId, Integer fType, String fDescribe, String fImg) {
        this.fId = fId;
        this.fType = fType;
        this.fDescribe = fDescribe;
        this.fImg = fImg;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getfType() {
        return fType;
    }

    public void setfType(Integer fType) {
        this.fType = fType;
    }

    public String getfDescribe() {
        return fDescribe;
    }

    public void setfDescribe(String fDescribe) {
        this.fDescribe = fDescribe;
    }

    public String getfImg() {
        return fImg;
    }

    public void setfImg(String fImg) {
        this.fImg = fImg;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "fId=" + fId +
                ", fType='" + fType + '\'' +
                ", fDescribe='" + fDescribe + '\'' +
                ", fImg='" + fImg + '\'' +
                '}';
    }
}
