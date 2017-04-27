package com.example.travis.ad340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.travis.ad340.Adapters.Item;
import com.example.travis.ad340.Adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class CategoryResultActivity extends AppCompatActivity {

    private List<Item> itemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_result);
        RecyclerView rv = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        createList();
        ItemAdapter ia = new ItemAdapter(itemList);
        rv.setAdapter(ia);


    }
    private void createList() {
        itemList.add(new Item("Summer Wheat", "Shocktop"));
        itemList.add(new Item("Crisp Apple Wheat", "Shocktop"));
        itemList.add(new Item("Cranberry Wheat", "Shocktop"));
        itemList.add(new Item("Chocolate Wheat", "Shocktop"));
        itemList.add(new Item("Summer Shandy", "Shocktop"));
        itemList.add(new Item("Honey Wheat", "Blue Moon"));
        itemList.add(new Item("Belgion White", "Blue Moon"));
        itemList.add(new Item("White IPA", "Blue Moon"));
        itemList.add(new Item("Cinnamon Horchata", "Blue Moon"));
        itemList.add(new Item("Mango Wheat", "Blue Moon"));
        itemList.add(new Item("First Peach Ale", "Blue Moon"));
        itemList.add(new Item("Mountain Abbey Ale", "Blue Moon"));
        itemList.add(new Item("Harvest Pumpkin Ale", "Blue Moon"));
        itemList.add(new Item("Sidecar Orange Pale Ale", "Sierra Nevada"));
        itemList.add(new Item("Torpedo", "Sierra Nevada"));
        itemList.add(new Item("Tropical Torpedo", "Sierra Nevada"));
        itemList.add(new Item("Hop Hunter", "Sierra Nevada"));
        itemList.add(new Item("Noone Pilsner", "Sierra Nevada"));
        itemList.add(new Item("Otra Vez", "Sierra Nevada"));
        itemList.add(new Item("Kellerweis", "Sierra Nevada"));
        itemList.add(new Item("IPA", "Stone Brewing"));
        itemList.add(new Item("Delicious", "Stone Brewing"));
        itemList.add(new Item("Ruination", "Stone Brewing"));
        itemList.add(new Item("Tangerine Express IPA", "Stone Brewing"));
        itemList.add(new Item("Go To IPA", "Stone Brewing"));
        itemList.add(new Item("Ripper", "Stone Brewing"));
        itemList.add(new Item("Give Me Death IPA", "Stone Brewing"));
        itemList.add(new Item("Saison du Buff", "Stone Brewing"));
        itemList.add(new Item("120 Minute IPA", "Dogfish Head"));
        itemList.add(new Item("90 Minute IPA", "Dogfish Head"));
        itemList.add(new Item("60 Minute IPA", "Dogfish Head"));
        itemList.add(new Item("Beer For Breakfast Stout", "Dogfish Head"));
        itemList.add(new Item("Firefly Ale", "Dogfish Head"));
        itemList.add(new Item("Flesh & Blood IPA", "Dogfish Head"));
        itemList.add(new Item("Indian Brown", "Dogfish Head"));
        itemList.add(new Item("Midas Touch", "Dogfish Head"));
        itemList.add(new Item("Pumpkin Ale", "Dogfish Head"));




    }
}
