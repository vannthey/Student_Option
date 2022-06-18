package com.example.student.dashboard.dashboard_home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.R;

public class Adapter_category extends BaseAdapter {

    Context context;
    String[] titles;
    int[] images;
    int[] images_background;
    LayoutInflater inflater;

    public Adapter_category(Context context, String[] titles, int[] images, int[] images_background) {
        this.context = context;
        this.titles = titles;
        this.images = images;
        this.images_background = images_background;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custom_grid_category_item, null);
        }
        ImageView icon_category = convertView.findViewById(R.id.item_images);
        TextView textView = convertView.findViewById(R.id.item_titles);
        ImageView background = convertView.findViewById(R.id.item_images_background);

        icon_category.setImageResource(images[position]);
        textView.setText(titles[position]);
        background.setImageResource(images_background[position]);
        return convertView;
    }
}
