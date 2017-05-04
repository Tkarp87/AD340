package com.example.travis.ad340;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;

import java.lang.reflect.Field;

public class LoginActivity extends AppCompatActivity {
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
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_login:
                Intent login = new Intent(this, LoginActivity.class);
                startActivity(login);
                return true;

            case R.id.action_category:
                Intent category = new Intent(this, CategoryActivity.class);
                startActivity(category);
                return true;

            case R.id.action_about:
                Intent about = new Intent(this, AboutActivity.class);
                startActivity(about);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
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
