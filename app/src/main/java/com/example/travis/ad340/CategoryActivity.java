package com.example.travis.ad340;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travis.ad340.Adapters.ImageAdapter;

public class CategoryActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent welcome = getIntent();
        String message = welcome.getStringExtra("EXTRA_MESSAGE");

        TextView tv_name = (TextView) findViewById(R.id.tv_login_email);
        tv_name.setText(message);

        GridView gv_category = (GridView) findViewById(R.id.gv_category);
        gv_category.setAdapter(new ImageAdapter(this));

        gv_category.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                if (position == 0){
                    Intent categoryResult = new Intent(CategoryActivity.this, CategoryResultActivity.class);
                    startActivity(categoryResult);
                } else {
                    Toast.makeText(CategoryActivity.this, "" + position,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // Enable the Up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.findItem(R.id.action_category).setVisible(false);


        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        return true;
    }



}
