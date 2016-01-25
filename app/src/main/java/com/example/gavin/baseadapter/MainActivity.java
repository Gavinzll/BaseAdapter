package com.example.gavin.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;

import com.example.gavin.baseadapter.adapter.MyAdapterWithCommonViewHolder;
import com.example.gavin.baseadapter.bean.Bean;
import com.example.gavin.baseadapter.util.CommonAdapter;
import com.example.gavin.baseadapter.util.CommonViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Bean> mDdatas;
    //private MyAdapterWithCommonViewHolder myAdapterWithCommonViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.id_listView);
        // mListView.setAdapter(myAdapterWithCommonViewHolder);
        mListView.setAdapter(new CommonAdapter<Bean>(MainActivity.this, mDdatas) {
            @Override
            public void convert(CommonViewHolder holder, Bean bean) {
                holder.setText(R.id.id_title, bean.getTitle())
                        .setText(R.id.id_desc, bean.getDesc())
                        .setText(R.id.id_time, bean.getTime())
                        .setText(R.id.id_phone, bean.getPhone());

            }
        });
    }

    private void initData() {
        mDdatas = new ArrayList<>();
        Bean bean = new Bean("Android新技能Get", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get1", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get2", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get3", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get4", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get5", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get6", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get7", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get8", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get9", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        bean = new Bean("Android新技能Get10", "Adnroid打造万能的ListView和GridView适配器", "2016-1-23", "10086");
        mDdatas.add(bean);
        //myAdapter = new MyAdapter(this,mDdatas);
        // myAdapterWithCommonViewHolder = new MyAdapterWithCommonViewHolder(this,mDdatas);
    }
}
