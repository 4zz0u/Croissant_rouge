package com.example.croissant_rouge.Actions.Module;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.croissant_rouge.R;

public class ModuleActivity extends AppCompatActivity {

    private TextView moduleDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        //fetching the data sent from the module item
        String someText = getIntent().getStringExtra("MODULE_TEXT_EXTRA");
        moduleDescription = findViewById(R.id.module_description);
        moduleDescription.setText(someText);


    }
}
