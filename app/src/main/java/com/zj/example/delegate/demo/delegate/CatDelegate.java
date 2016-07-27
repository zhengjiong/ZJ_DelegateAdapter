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
import com.zj.example.delegate.demo.model.Cat;

import java.util.List;

/**
 * Title: CatDelegate
 * Description:
 * Copyright:Copyright(c)2016
 * CreateTime:16/7/27  15:37
 *
 * @author 郑炯
 * @version 1.0
 */
public class CatDelegate implements AdapterDelegate<List<BaseModel>> {

    private LayoutInflater inflater;

    public CatDelegate(Activity activity){
        inflater = activity.getLayoutInflater();
    }

    @Override
    public boolean isForViewType(@NonNull List<BaseModel> items, int position) {
        return items.get(position) instanceof Cat;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new CatViewHolder(inflater.inflate(R.layout.cat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull List<BaseModel> items, int position, @NonNull RecyclerView.ViewHolder holder) {

        Cat cat = (Cat) items.get(position);

        CatViewHolder catHolder = (CatViewHolder) holder;
        catHolder.tvName.setText(cat.getCatName());
    }

    class CatViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;

        public CatViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
        }

    }


}
