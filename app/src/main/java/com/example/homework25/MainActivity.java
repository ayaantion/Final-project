package com.example.homework25;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView icStar0ImageView, icStar1ImageView, icStar2ImageView, icStar3ImageView, icStar4ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       icStar0ImageView = findViewById(R.id.ic_favorite_0_image_view);
        icStar1ImageView = findViewById(R.id.ic_favorite_1_image_view);
        icStar2ImageView = findViewById(R.id.ic_favorite_2_image_view);
        icStar3ImageView = findViewById(R.id.ic_favorite_3_image_view);
        icStar4ImageView = findViewById(R.id.ic_favorite_4_image_view);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddContactActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickShowContact(View view) {
        startActivity(new Intent(MainActivity.this, ShowContactActivity.class));
    }

    public void onClickSetFavorite(View view) {

        switch (view.getId()) {
            case R.id.ic_favorite_0_image_view :
                icStar0ImageView.setSelected(!icStar0ImageView.isSelected());
                break;

            case R.id.ic_favorite_1_image_view :
                icStar1ImageView.setSelected(!icStar1ImageView.isSelected());
                break;

            case R.id.ic_favorite_2_image_view :
                icStar2ImageView.setSelected(!icStar2ImageView.isSelected());
                break;

            case R.id.ic_favorite_3_image_view :
                icStar3ImageView.setSelected(!icStar3ImageView.isSelected());
                break;

            case R.id.ic_favorite_4_image_view :
                icStar4ImageView.setSelected(!icStar4ImageView.isSelected());
                break;
        }
    }
}
