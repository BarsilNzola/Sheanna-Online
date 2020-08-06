package com.moringaschool.sheannaonline;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CategoriesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mCategories;

    public CategoriesArrayAdapter(Context mContext, int resource, String[] mCategories) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mCategories = mCategories;
    }

    @Override
    public Object getItem(int position) {
        String category = mCategories[position];
        return String.format("%s \n");
    }

    @Override
    public int getCount() {
        return mCategories.length;
    }
}
