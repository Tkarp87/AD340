package com.example.travis.ad340.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.travis.ad340.CategoryResultActivity;
import com.example.travis.ad340.R;

import java.util.List;

/**
 * Created by Travis on 4/27/2017.
 */

    public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

        private List<Item> itemList;
        private Context context;
        /**
         * View holder class
         * */
        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView itemName;
            public TextView brandName;
            public ImageView itemThumbnail;

            public MyViewHolder(View view) {
                super(view);
                itemName = (TextView) view.findViewById(R.id.itemName);
                brandName = (TextView) view.findViewById(R.id.brand);
                itemThumbnail = (ImageView) view.findViewById(R.id.itemThumbnail);
            }
        }

    public ItemAdapter(List<Item> itemList,Context context) {
                this.itemList = itemList;
                this.context = context;
            }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Item c = itemList.get(position);
            holder.itemName.setText(c.name);
            holder.brandName.setText(String.valueOf(c.brand));
            Glide
                    .with(context)
                    .load(c.url)
                    .placeholder(R.drawable.beer_tn)
                    .into(holder.itemThumbnail);
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row,parent, false);
            return new MyViewHolder(v);
        }
    }

