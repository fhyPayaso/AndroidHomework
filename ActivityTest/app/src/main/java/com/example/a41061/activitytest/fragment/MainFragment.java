package com.example.a41061.activitytest.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a41061.activitytest.R;

/**
 * Created by 41061 on 2017/9/29.
 */
public class MainFragment extends android.support.v4.app.Fragment {

    private String content;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.main_fragment,container,false);
    }
}
