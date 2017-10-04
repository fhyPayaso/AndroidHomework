package com.example.a41061.activitytest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a41061.activitytest.R;

/**
 * Created by 41061 on 2017/9/29.
 */
public class MyFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview=inflater.inflate(R.layout.my_fragment,container,false);

        rootview.findViewById(R.id.top).getBackground().setAlpha(30);

        return rootview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
}
