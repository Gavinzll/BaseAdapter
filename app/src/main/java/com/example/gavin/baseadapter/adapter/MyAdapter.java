package com.example.gavin.baseadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gavin.baseadapter.R;
import com.example.gavin.baseadapter.bean.Bean;

import java.util.List;

/**
 * Created by gavin on 2016/1/23.
 */
public class MyAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Bean> mDates;

    public MyAdapter() {
    }

    public MyAdapter(Context context, List<Bean> mDates) {
        this.mInflater = LayoutInflater.from(context);
        this.mDates = mDates;
    }

    @Override
    public int getCount() {
        return mDates.size();
    }

    @Override
    public Object getItem(int position) {
        return mDates.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        //如果布局是空的，就加载布局
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_listview, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mTitle = (TextView) convertView.findViewById(R.id.id_title);
            viewHolder.mDesc = (TextView) convertView.findViewById(R.id.id_desc);
            viewHolder.mTime = (TextView) convertView.findViewById(R.id.id_time);
            viewHolder.mPhone = (TextView) convertView.findViewById(R.id.id_phone);
            convertView.setTag(viewHolder);
        }else {
            //如果有缓存过，直接取出使用，提高效率
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //依次给View元素赋值。
        Bean bean = mDates.get(position);
        viewHolder.mTitle.setText(bean.getTitle());
        viewHolder.mDesc.setText(bean.getDesc());
        viewHolder.mTime.setText(bean.getTime());
        viewHolder.mPhone.setText(bean.getPhone());
        return convertView;
    }

    private class ViewHolder {
        TextView mTitle;
        TextView mDesc;
        TextView mTime;
        TextView mPhone;
    }

}
