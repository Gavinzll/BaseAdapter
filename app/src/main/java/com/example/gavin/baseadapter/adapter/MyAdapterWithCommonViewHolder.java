package com.example.gavin.baseadapter.adapter;

import android.content.Context;

import com.example.gavin.baseadapter.R;
import com.example.gavin.baseadapter.bean.Bean;
import com.example.gavin.baseadapter.util.CommonAdapter;
import com.example.gavin.baseadapter.util.CommonViewHolder;

import java.util.List;

/**
 * Created by gavin on 2016/1/23.
 */
public class MyAdapterWithCommonViewHolder extends CommonAdapter<Bean> {

    public MyAdapterWithCommonViewHolder(Context context, List<Bean> mDates) {
        super(context, mDates);
    }

    @Override
    public void convert(CommonViewHolder viewHolder, Bean bean) {
        viewHolder.setText(R.id.id_title, bean.getTitle())
                .setText(R.id.id_desc, bean.getDesc())
                .setText(R.id.id_time, bean.getTime())
                .setText(R.id.id_phone, bean.getPhone());
    }

}
