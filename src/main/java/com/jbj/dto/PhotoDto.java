package com.jbj.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PhotoDto {

    private Integer pId;
    private Integer pbId;
    private Date date;
    private String pCity;

    public PhotoDto() {
    }

    public PhotoDto(Integer pId, Integer pbId, Date date, String pCity) {
        this.pId = pId;
        this.pbId = pbId;
        this.date = date;
        this.pCity = pCity;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Date getDate() {
        return date;
    }
    //不加这句话的在前台输出的是从1970年1月1日至今的毫秒数。把它转换成能看懂的格式。
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public void setDate(Date date) {
        this.date = date;
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    @Override
    public String toString() {
        return "PhotoDto{" +
                "pId=" + pId +
                ", pbId=" + pbId +
                ", date=" + date +
                ", pCity='" + pCity + '\'' +
                '}';
    }
}


