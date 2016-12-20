package ru.ppasoft.firecategory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by ifuterman on 09.12.2016.
 * Class data adapter for project list
 */

class FrameListAdapter extends BaseAdapter {
    private FCDataManager mDataManager;
    private Context mContext;
    FrameListAdapter(FCDataManager manager, Context ctx) {
        mDataManager = manager;
        mContext = ctx;
    }
    @Override
    public int getCount() {
        return mDataManager.getCurrentViewItemsCount();
    }

    @Override
    public Object getItem(int position) {
        return mDataManager.getCurrentViewItem(position);
    }

    @Override
    public long getItemId(int position) {
        return mDataManager.getCurrenViewItemID(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
