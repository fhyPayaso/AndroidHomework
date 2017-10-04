package com.example.a41061.activitytest.fragment;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by 41061 on 2017/10/4.
 */
public class line extends RecyclerView.ItemDecoration {

    @Override
    public void getItemOffsets(Rect rect, View view ,RecyclerView praent,RecyclerView.State state){
        rect.set(0,0,0,5);
    }
}
