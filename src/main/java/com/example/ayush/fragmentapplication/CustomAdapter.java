package com.example.ayush.fragmentapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ayush on 9/28/2017.
 */

public class CustomAdapter extends BaseAdapter{

    private ArrayList<Data> list ;
    BlankFragment context;
    LayoutInflater mLayoutInflator;
    public CustomAdapter(BlankFragment context, ArrayList list){
        this.list = list;
        this.context = context;
        mLayoutInflator = (LayoutInflater)context.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*inflates the view and sets the text for the title and description as well as the image
        * for the imageView*/

        convertView = mLayoutInflator.inflate(R.layout.row_layout, null);
        TextView tv_title = (TextView) convertView.findViewById(R.id.title);
        TextView tv_description = (TextView) convertView.findViewById(R.id.description);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        tv_title.setText(list.get(position).getName());
        tv_description.setText(list.get(position).getDescription());
        imageView.setImageResource(list.get(position).getId());
        return convertView;
    }
}
