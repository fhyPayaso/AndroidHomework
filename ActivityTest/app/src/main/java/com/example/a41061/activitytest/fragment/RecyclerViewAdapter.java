package com.example.a41061.activitytest.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a41061.activitytest.Pagemess;
import com.example.a41061.activitytest.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

/**
 * Created by 41061 on 2017/10/4.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Pagemess> mPagemesses;


    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,time,mess;
        RoundedImageView imageView;
        public ViewHolder(View view){
            super(view);
            name=(TextView)view.findViewById(R.id.rv_name);
            time=(TextView)view.findViewById(R.id.rv_time);
            mess=(TextView)view.findViewById(R.id.rv_mess);
            imageView=(RoundedImageView) view.findViewById(R.id.rv_pic);
        }
    }

    public RecyclerViewAdapter(List<Pagemess> pagemessList){
        mPagemesses=pagemessList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override

    public  void onBindViewHolder(ViewHolder holder,int position){
        Pagemess pagemess=mPagemesses.get(position);
        holder.name.setText(pagemess.getName());
        holder.time.setText(pagemess.getTime());
        holder.mess.setText(pagemess.getMessage());
        holder.imageView.setImageResource(pagemess.getRoundpic());
    }

    @Override
    public  int getItemCount(){
        return mPagemesses.size();
    }


//    private LayoutInflater mylayoutInflater;
//    private Context mycontext;
//    private String[] myname;
//    private String[] mytime;
//    private String[] mymessage;
//    private int [] mypic;
//
//    public RecyclerViewAdapter(Context context, String[] name,String[] time,String[] message,int [] pic ){
//        mycontext=context;
//        mymessage=message;
//        myname=name;
//        mytime=time;
//        mypic=pic;
//        mylayoutInflater=LayoutInflater.from(context);
//    }
//
//    public static class NormalViewHolder extends RecyclerView.ViewHolder{
//
//        TextView name,time,mess;
//        RoundedImageView imageView;
//
//        public NormalViewHolder(View itemView){
//            super(itemView);
//
//            name=(TextView)itemView.findViewById(R.id.rv_name);
//            time=(TextView)itemView.findViewById(R.id.rv_time);
//            mess=(TextView)itemView.findViewById(R.id.rv_mess);
//            imageView=(RoundedImageView)itemView.findViewById(R.id.rv_pic);
//        }
//
//    }
//
//    @Override
//    public NormalViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
//        return new NormalViewHolder(mylayoutInflater.inflate(R.layout.item,parent,false));
//    }
//    @Override
//    public void onBindViewHolder(NormalViewHolder holder, final int position){
//
//        holder.name.setText(myname[position]);
//        holder.time.setText(mytime[position]);
//        holder.mess.setText(mymessage[position]);
//        holder.imageView.setImageResource(mypic[position]);
//
//    }
//
//    public int getItemCount(){
//        return myname==null? 0:myname.length;
//    }
}
