package com.example.a41061.activitytest.fragment;

/**
 * Created by 41061 on 2017/10/4.
 */

public class Pagesell {

    private String name,time,price,num;
    private int pic,heart;

    public Pagesell(String name,String time,String price,String num,int pic){
        this.name=name;
        this.time=time;
        this.price=price;
        this.num=num;
        this.pic=pic;
    }


    public String getName(){
        return name;
    }

    public String getTime(){
        return time;
    }
    public String getPrice(){
        return price;
    }

    public String getNum(){
        return num;
    }
    public int getpic(){
        return pic;
    }

}

