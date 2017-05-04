package com.example.travis.ad340;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;

import java.lang.reflect.Field;

public class LoginActivity extends MainActivity {
    private static final String TAG ="LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // Enable the Up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.findItem(R.id.action_login).setVisible(false);


        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        return true;
    }

    public void login(View view) {
        Log.d(TAG, "login() Creating Intent");
        Intent login = new Intent(this, CategoryActivity.class);
        EditText et_login = (EditText) findViewById(R.id.et_login);
        EditText et_password = (EditText) findViewById(R.id.et_password);
        Log.d(TAG, "login() Assigning Data to message");
        String message = et_login.getText().toString();
        login.putExtra("EXTRA_MESSAGE", message);
        Log.d(TAG, "login() startActivity(login)");
        startActivity(login);

    }
}
