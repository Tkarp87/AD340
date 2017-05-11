package com.example.travis.ad340.Adapters;

import android.support.v7.widget.RecyclerView;

import com.example.travis.ad340.R;

/**
 * Created by Travis on 4/27/2017.
 */

public class Item {
    protected int id;
    protected String name;
    protected String brand;
    protected String url;

    public Item(int id, String name, String brand, String url) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.url = url;
    }
}

