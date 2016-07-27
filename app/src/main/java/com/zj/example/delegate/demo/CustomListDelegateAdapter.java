package com.zj.example.delegate.demo;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.hannesdorfmann.adapterdelegates2.AdapterDelegatesManager;
import com.hannesdorfmann.adapterdelegates2.ListDelegationAdapter;
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
public class CustomListDelegateAdapter extends ListDelegationAdapter {


    public CustomListDelegateAdapter(Activity activity, List<BaseModel> items){
        delegatesManager = new AdapterDelegatesManager();

        delegatesManager.addDelegate(new CatDelegate(activity));
        delegatesManager.addDelegate(new DogDelegate(activity));

        setItems(items);
    }

}
