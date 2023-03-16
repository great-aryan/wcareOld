package com.wcareteam.wcare;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    ImageButton fab_google;
    EditText email;
    EditText password;
    Button continue1;
    int counter = 2;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        fab_google = findViewById(R.id.fab_google);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        continue1 = findViewById(R.id.continue1);


        fab_google.setTranslationY(200);
        email.setTranslationX(400);
        password.setTranslationX(400);
        continue1.setTranslationY(300);

        fab_google.setAlpha(v);
        email.setAlpha(v);
        password.setAlpha(v);
        continue1.setAlpha(v);


        email.animate().translationX(0).alpha(1).setDuration(500).setStartDelay(100).start();
        password.animate().translationX(0).alpha(1).setDuration(500).setStartDelay(200).start();
        continue1.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(300).start();
        fab_google.animate().translationY(0).alpha(1).setDuration(500).setStartDelay(300).start();



    }
}
