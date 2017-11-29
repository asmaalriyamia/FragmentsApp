package com.example.sasmob.fragmentsapp.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sasmob.fragmentsapp.R;

import java.util.ArrayList;

/**
 * Created by sasmob on 11/28/2017.
 */

public class HctHomeAdapter extends RecyclerView.Adapter<HctHomeAdapter.ViewHolder> {
    Context mContext;
    ArrayList<HomeItems>homeItems;

    public HctHomeAdapter(Context mContext, ArrayList<HomeItems> homeItems) {
        this.mContext = mContext;
        this.homeItems = homeItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.home_list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HomeItems items= homeItems.get(position);
        holder.home_item.setText(items.getHomeItems());
        holder.home_image.setImageResource(items.getHomeImages());

    }

    @Override
    public int getItemCount() {
        return homeItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView home_item;
        ImageView home_image;
        public ViewHolder(View itemView) {
            super(itemView);
          home_item=(TextView)  itemView.findViewById(R.id.home_element_name);
          home_image=(ImageView) itemView.findViewById(R.id.home_image);
        }
    }
}
