package com.example.a41061.activitytest.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by 41061 on 2017/10/1.
 */
public class MessageGroupFragmentAdpter extends FragmentStatePagerAdapter {


    private List<android.support.v4.app.Fragment> list;

    public  MessageGroupFragmentAdpter(FragmentManager fragmentManager,List<android.support.v4.app.Fragment> list){
        super(fragmentManager);
        this.list=list;
    }

    public MessageGroupFragmentAdpter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override

    public android.support.v4.app.Fragment getItem(int arg0){
        return list.get(arg0);
    }

    @Override
    public  int getCount(){
        return  list.size();
    }
}
