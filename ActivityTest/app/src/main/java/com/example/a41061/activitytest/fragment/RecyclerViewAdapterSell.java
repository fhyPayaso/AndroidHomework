package com.example.a41061.activitytest.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a41061.activitytest.R;

import java.util.List;

/**
 * Created by 41061 on 2017/10/4.
 */

public class  RecyclerViewAdapterSell extends RecyclerView.Adapter<RecyclerViewAdapterSell.ViewHolder> {

    private List<Pagesell> mPagesell;


    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, time, price,num;
        ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.rv_name_sell);
            time = (TextView) view.findViewById(R.id.rv_time_sell);
            price = (TextView) view.findViewById(R.id.rv_price_sell);
            num=(TextView)view.findViewById(R.id.rv_num_sell);
            imageView = (ImageView) view.findViewById(R.id.rv_pic_sell);
        }
    }

    public RecyclerViewAdapterSell(List<Pagesell> pagesellList) {
        mPagesell = pagesellList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sell_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }



    public void onBindViewHolder(ViewHolder holder, int position) {
        Pagesell pagesell = mPagesell.get(position);
        holder.name.setText(pagesell.getName());
        holder.time.setText(pagesell.getTime());
        holder.price.setText(pagesell.getPrice());
        holder.num.setText(pagesell.getNum());
        holder.imageView.setImageResource(pagesell.getpic());
    }

    @Override
    public int getItemCount() {
        return mPagesell.size();
    }
}