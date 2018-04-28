package com.jbj.enums;

public enum BaseEnum implements BaseCodeEnum{
    //楼盘
    ISCHOICE(1),//楼盘是严选
    NOCHOICE(2),//楼盘不是严选

    //照片
    ISFILL(11),//不是补拍
    ISNOTFILL(12),//是补拍

    ISEDITOR(111),//编辑过了
    ISNOTEDITOR(112);//未编辑
    private int code;

    BaseEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
