package com.zj.example.delegate.demo.delegate;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hannesdorfmann.adapterdelegates2.AdapterDelegate;
import com.zj.example.delegate.demo.R;
import com.zj.example.delegate.demo.model.BaseModel;
import com.zj.example.delegate.demo.model.Dog;

import java.util.List;

/**
 * Title: DogDelegate
 * Description:
 * Copyright:Copyright(c)2016
 * Company: 博智维讯信息技术有限公司
 * CreateTime:16/7/27  15:38
 *
 * @author 郑炯
 * @version 1.0
 */
public class DogDelegate implements AdapterDelegate<List<BaseModel>> {

    private LayoutInflater inflater;

    public DogDelegate(Activity activity){
        inflater = activity.getLayoutInflater();
    }

    @Override
    public boolean isForViewType(@NonNull List<BaseModel> items, int position) {
        return items.get(position) instanceof Dog;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new DogViewHolder(inflater.inflate(R.layout.dog_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull List<BaseModel> items, int position, @NonNull RecyclerView.ViewHolder holder) {
        Dog dog = (Dog) items.get(position);

        DogViewHolder dogHolder = (DogViewHolder) holder;
        dogHolder.tvName.setText(dog.getDogName());
    }

    class DogViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;

        public DogViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}
