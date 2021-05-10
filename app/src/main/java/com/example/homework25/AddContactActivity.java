package com.example.homework25;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class AddContactActivity extends AppCompatActivity {

    ImageView nameImageView, surnameImageView, workImageView, phoneImageView, emailImageView, webImageView;
    EditText nameEditText, surnameEditText, workEditText, phoneEditText, emailEditText, webEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.title_add_contact_text));
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_clear_white);

        nameImageView = findViewById(R.id.first_name_image_view);
        surnameImageView = findViewById(R.id.last_name_image_view);
        workImageView = findViewById(R.id.work_image_view);
        phoneImageView = findViewById(R.id.phone_image_view);
        emailImageView = findViewById(R.id.email_image_view);
        webImageView = findViewById(R.id.web_image_view);

        nameEditText = findViewById(R.id.first_name__edit_text);
        surnameEditText = findViewById(R.id.last_name_edit_text);
        workEditText = findViewById(R.id.work_edit_text);
        phoneEditText = findViewById(R.id.phone_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        webEditText = findViewById(R.id.web_edit_text);

        nameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) nameImageView.setImageResource(R.drawable.ic_person_grey);
                else nameImageView.setImageResource(R.drawable.ic_person_blue);
            }
        });

        surnameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) surnameImageView.setImageResource(R.drawable.ic_person_grey);
                else surnameImageView.setImageResource(R.drawable.ic_person_blue);
            }
        });

        workEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) workImageView.setImageResource(R.drawable.ic_work_grey);
                else workImageView.setImageResource(R.drawable.ic_work_blue);
            }
        });

        phoneEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) phoneImageView.setImageResource(R.drawable.ic_call_grey);
                else phoneImageView.setImageResource(R.drawable.ic_call_blue);
            }
        });

        emailEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) emailImageView.setImageResource(R.drawable.ic_email_grey);
                else emailImageView.setImageResource(R.drawable.ic_email_blue);
            }
        });

        webEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) webImageView.setImageResource(R.drawable.ic_web_grey);
                else webImageView.setImageResource(R.drawable.ic_web_blue);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_contact, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }


}
