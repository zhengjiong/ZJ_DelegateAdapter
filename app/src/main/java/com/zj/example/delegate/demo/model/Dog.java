package com.zj.example.delegate.demo.model;

/**
 * Title: Dog
 * Description:
 * Copyright:Copyright(c)2016
 * CreateTime:16/7/27  15:33
 *
 * @author 郑炯
 * @version 1.0
 */
public class Dog extends BaseModel {

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
