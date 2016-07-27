package com.zj.example.delegate.demo.model;

/**
 * Title: Cat
 * Description:
 * Copyright:Copyright(c)2016
 * Company: 博智维讯信息技术有限公司
 * CreateTime:16/7/27  15:33
 *
 * @author 郑炯
 * @version 1.0
 */
public class Cat extends BaseModel{
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
