package com.example.travis.ad340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travis.ad340.Adapters.ImageAdapter;

public class CategoryActivity extends AppCompatActivity {

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
    }
}
