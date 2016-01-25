package com.example.gavin.baseadapter.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.gavin.baseadapter.R;

import java.util.List;

/**
 * Created by gavin on 2016/1/23.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    protected   Context context;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    public CommonAdapter(Context context,List<T> datas) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mDatas = datas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent){
        CommonViewHolder viewHolder = CommonViewHolder.get(context, convertView, parent, R.layout.item_listview, position);
        convert(viewHolder, getItem(position));
        return viewHolder.getConvertView();
    };

    public abstract void convert(CommonViewHolder holder, T t);
}
