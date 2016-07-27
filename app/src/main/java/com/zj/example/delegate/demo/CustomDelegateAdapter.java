package com.zj.example.delegate.demo;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.hannesdorfmann.adapterdelegates2.AdapterDelegatesManager;
import com.zj.example.delegate.demo.delegate.CatDelegate;
import com.zj.example.delegate.demo.delegate.DogDelegate;
import com.zj.example.delegate.demo.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: CustomDelegateAdapter
 * Description: MainAdapter也可以继承ListDelegationAdapter
 * CreateTime:16/7/27  15:36
 * @author 郑炯
 * @version 1.0
 */
public class CustomDelegateAdapter extends RecyclerView.Adapter {

    private AdapterDelegatesManager mDelegatesManager;
    private List<BaseModel> mItems = new ArrayList<>();

    public CustomDelegateAdapter(Activity activity, List<BaseModel> items){
        mItems = items;
        mDelegatesManager = new AdapterDelegatesManager();

        mDelegatesManager.addDelegate(new CatDelegate(activity));
        mDelegatesManager.addDelegate(new DogDelegate(activity));
    }

    @Override
    public int getItemViewType(int position) {
        return mDelegatesManager.getItemViewType(mItems, position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mDelegatesManager.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mDelegatesManager.onBindViewHolder(mItems, position, holder);
    }

    @Override
    public int getItemCount() {
        return mItems == null ? 0 : mItems.size();
    }
}
