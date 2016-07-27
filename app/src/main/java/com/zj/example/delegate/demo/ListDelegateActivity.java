package com.zj.example.delegate.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zj.example.delegate.demo.model.BaseModel;
import com.zj.example.delegate.demo.model.Cat;
import com.zj.example.delegate.demo.model.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title: CustomDelegateActivity
 * Description:
 * Copyright:Copyright(c)2016
 * CreateTime:16/7/27  16:44
 * @author 郑炯
 * @version 1.0
 */

public class ListDelegateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_delegate);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new CustomListDelegateAdapter(this, getAnimals()));
    }

    public List<BaseModel> getAnimals() {
        List<BaseModel> animals = new ArrayList<>();
        animals.add(new Dog("dog1"));
        animals.add(new Dog("dog2"));
        animals.add(new Dog("dog3"));
        animals.add(new Dog("dog4"));
        animals.add(new Cat("cat1"));
        animals.add(new Cat("cat2"));
        animals.add(new Cat("cat3"));
        animals.add(new Cat("cat4"));

        Collections.shuffle(animals);
        return animals;
    }
}
