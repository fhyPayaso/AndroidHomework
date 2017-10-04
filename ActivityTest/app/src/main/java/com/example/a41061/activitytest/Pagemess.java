package com.example.a41061.activitytest;

/**
 * Created by 41061 on 2017/10/4.
 */
public class Pagemess {

    private String name,time,message;
    private int roundpic;

    public Pagemess(String name,String time,String message,int roundpic){
        this.name=name;
        this.time=time;
        this.message=message;
        this.roundpic=roundpic;
    }


    public String getName(){
        return name;
    }

    public String getTime(){
        return time;
    }
    public String getMessage(){
        return message;
    }
    public int getRoundpic(){
        return roundpic;
    }

}
