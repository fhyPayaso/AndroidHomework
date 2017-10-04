package com.example.a41061.activitytest.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a41061.activitytest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41061 on 2017/9/29.
 */
public class SellFragment extends android.support.v4.app.Fragment{

    private List<Pagesell> pagesells=new ArrayList<>();

    private  void  initpagesell(){

        double prebase=88.0;
        int numbase=10;

        for (int i=0;i<=10;i++){
            Pagesell sell=new Pagesell("淑女学生蕾丝连衣裙,修身甜美小清新",
                    "截止时间：2016.09.04",
                    String.valueOf(prebase+i*8.8),
                    "参与人数:"+String.valueOf(numbase+i),
                    R.drawable.dress);
            pagesells.add(sell);
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.sell_fragment,container,false);

        initpagesell();

        RecyclerView recyclerView=(RecyclerView)rootView.findViewById(R.id.rv_list_sell);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new line());
        RecyclerViewAdapterSell adapter=new RecyclerViewAdapterSell(pagesells);
        recyclerView.setAdapter(adapter);

        return  rootView;
    }
}
