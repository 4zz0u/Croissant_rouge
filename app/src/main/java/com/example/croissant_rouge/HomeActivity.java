package com.example.croissant_rouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.croissant_rouge.Actions.ContactActivity;
import com.example.croissant_rouge.Actions.GestesActivity;
import com.example.croissant_rouge.Actions.PrincipeActivity;
import com.example.croissant_rouge.Actions.UrgenceActivity;
import com.example.croissant_rouge.R;

public class HomeActivity extends AppCompatActivity {
    private Button principes, urgence, gestes, contact;
    private Animation btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //find the buttons
        principes = findViewById(R.id.principes);
        urgence = findViewById(R.id.urgence);
        gestes = findViewById(R.id.gestes);
        contact = findViewById(R.id.contact);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttons_anim);

        principes.setAnimation(btnAnim);
        urgence.setAnimation(btnAnim);
        gestes.setAnimation(btnAnim);
        contact.setAnimation(btnAnim);

        principes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principeIntent = new Intent(getApplicationContext(), PrincipeActivity.class);
                startActivity(principeIntent);
            }
        });

        urgence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urgenceIntent = new Intent(getApplicationContext(), UrgenceActivity.class);
                startActivity(urgenceIntent);
            }
        });

        gestes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gestesIntent = new Intent(getApplicationContext(), GestesActivity.class);
                startActivity(gestesIntent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(contactIntent);
            }
        });
    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }


}
