package com.example.a41061.activitytest.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a41061.activitytest.Pagemess;
import com.example.a41061.activitytest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 41061 on 2017/9/29.
 */
public class MessageFragment extends android.support.v4.app.Fragment  {

    private List<Pagemess> pagemesses=new ArrayList<>();

    private  void  initpagemess(){
        Pagemess m_one=new Pagemess("鸽王哈哈哈","2016.03.05 18:22","取消订单",R.drawable.tou1);
        pagemesses.add(m_one);
        Pagemess m_two=new Pagemess("女装哈哈哈","2016.10.07 12:26","申请退款",R.drawable.tou2);
        pagemesses.add(m_two);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.message_fragment,container,false);

        initpagemess();

        RecyclerView recyclerView=(RecyclerView)rootView.findViewById(R.id.rv_list);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new line());
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(pagemesses);
        recyclerView.setAdapter(adapter);

        return  rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
}
