package com.example.a41061.activitytest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.example.a41061.activitytest.fragment.MainFragment;
import com.example.a41061.activitytest.fragment.MessageFragment;
import com.example.a41061.activitytest.fragment.MessageGroupFragmentAdpter;
import com.example.a41061.activitytest.fragment.MyFragment;
import com.example.a41061.activitytest.fragment.SellFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends android.support.v4.app.FragmentActivity{

    //四个要显示的Fragment
    private MainFragment mainFragment;
    private SellFragment sellFragment;
    private MessageFragment messageFragment;
    private MyFragment myFragment;

    //当前默认要显示的Fragment
    private int curID = R.id.Fmain;

    //下面4个textview
    private TextView text_main, text_sell, text_mess, text_my;

    /********************************************************************/
    //滑动页面
    private ViewPager viewPager;
    private List<Fragment> list=new ArrayList<Fragment>();
    private MessageGroupFragmentAdpter adpter;

    private  int offset=0;
    private int screenWidth=1;
    /*******************************************************************/


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_main = (TextView) findViewById(R.id.Fmain);
        text_main.setSelected(true);
        text_sell = (TextView) findViewById(R.id.Fsell);
        text_mess = (TextView) findViewById(R.id.Fmes);
        text_my = (TextView) findViewById(R.id.Fmy);
        viewPager=(ViewPager)findViewById(R.id.viewpaper_home);

        text_main.setOnClickListener(clickListener);
        text_sell.setOnClickListener(clickListener);
        text_mess.setOnClickListener(clickListener);
        text_my.setOnClickListener(clickListener);


        //默认显示，设置首页可用

        mainFragment = new MainFragment();
        sellFragment=new SellFragment();
        messageFragment=new MessageFragment();
        myFragment=new MyFragment();
        list.add(mainFragment);
        list.add(sellFragment);
        list.add(messageFragment);
        list.add(myFragment);
        adpter=new MessageGroupFragmentAdpter(
                this.getSupportFragmentManager(),list
        );
        viewPager.setCurrentItem(0);
        viewPager.setAdapter(adpter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                changetv(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void changetv(int index){
        text_main.setSelected(false);
        text_my.setSelected(false);
        text_mess.setSelected(false);
        text_sell.setSelected(false);

        switch (index){
            case 0:
                text_main.setSelected(true);
                break;
            case 1:
                text_sell.setSelected(true);
                break;
            case 2:
                text_mess.setSelected(true);
                break;
            case 3:
                text_my.setSelected(true);
        }
    }


    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.Fmain:
                    viewPager.setCurrentItem(0);
                    break;
                case  R.id.Fsell:
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.Fmes:
                    viewPager.setCurrentItem(2);
                    break;
                case R.id.Fmy:
                    viewPager.setCurrentItem(3);
                    break;
            }
        }
    };
}
