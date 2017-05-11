package com.example.travis.ad340.Adapters;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Travis on 5/11/2017.
 */

public class JSONParseItemList{

    public List<Item> JsonParse(org.json.JSONArray jsonArray){
        List<Item> itemList = new ArrayList<>();
    try {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject c = jsonArray.getJSONObject(i);
            int id = c.getInt("id");
            String name = c.getString("name");
            String brand = c.getString("brand");
            String url = c.getString("url");
            Item item = new Item(id,name,brand,url);
            itemList.add(item);
        }
        return itemList;
    } catch (final JSONException e) {
        Log.e(TAG, "Json parsing error: " + e.getMessage());
            }
         return null;
    }


}
