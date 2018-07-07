package com.digitalbithub.stackview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private int colors[];

    public ViewPagerAdapter(Context context) {
        this.context = context;
        this.colors = new int[]{
                Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.GRAY
        };
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.pager_view, null, false);
        view.setBackgroundColor(colors[position]);
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
