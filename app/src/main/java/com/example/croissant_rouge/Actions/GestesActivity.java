package com.example.croissant_rouge.Actions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.croissant_rouge.Actions.Module.Module;
import com.example.croissant_rouge.Actions.Module.ModuleActivity;
import com.example.croissant_rouge.Actions.Module.ModuleArrayAdapter;
import com.example.croissant_rouge.R;

import java.util.ArrayList;

public class GestesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestes);

        final ArrayList<Module> modules = new ArrayList<Module>();

        modules.add(new Module(1, "Module 1", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));
        modules.add(new Module(2, "Module 2", R.drawable.croissant_rouge_progress, R.color.colorAccent ));
        modules.add(new Module(3, "Module 3", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));
        modules.add(new Module(4, "Module 4", R.drawable.croissant_rouge_progress, R.color.colorAccent ));
        modules.add(new Module(5, "Module 5", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));
        modules.add(new Module(6, "Module 6", R.drawable.croissant_rouge_progress, R.color.colorAccent ));
        modules.add(new Module(7, "Module 7", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));
        modules.add(new Module(8, "Module 8", R.drawable.croissant_rouge_progress, R.color.colorAccent ));
        modules.add(new Module(9, "Module 9", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));
        modules.add(new Module(10, "Module 10", R.drawable.croissant_rouge_progress, R.color.colorAccent ));
        modules.add(new Module(11, "Module 11", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));
        modules.add(new Module(12, "Module 12", R.drawable.croissant_rouge_progress, R.color.colorAccent ));
        modules.add(new Module(13, "Module 13", R.drawable.croissant_rouge_progress, R.color.colorPrimary ));

        final ModuleArrayAdapter moduleAdapter = new ModuleArrayAdapter(this, modules);

        ListView modulesListView = findViewById(R.id.listView);
        modulesListView.setAdapter(moduleAdapter);
        //setting a click listener on ListView's ITEMS
        modulesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //This will take you to the clicked module activity
                ModuleActivityLoader(position);

            }
        });

    }

    /**
     * This will load the chosen module activity
     */
    private void ModuleActivityLoader(int position){
        /*depending on the position, the activity's content will change*/
        String someText = null;

        switch (position) {
            case 0 : someText = "module 1 text" ;
            break;
            case 1 : someText = "module 2 text" ;
            break;
            case 2 : someText = "module 3 text" ;
            break;
            case 3 : someText = "module 4 text" ;
            break;
            case 4 : someText = "module 5 text" ;
            break;
            case 5 : someText = "module 6 text" ;
            break;
            case 6 : someText = "module 7 text" ;
            break;
            case 7 : someText = "module 8 text" ;
            break;
            case 8 : someText = "module 9 text" ;
            break;
            case 9 : someText = "module 10 text" ;
            break;
            case 10 : someText = "module 11 text" ;
            break;
            case 11 : someText = "module 12 text" ;
            break;
            case 12 : someText = "module13 text" ;
            break;

        }
        Intent moduleIntent = new Intent(getBaseContext(), ModuleActivity.class);
        moduleIntent.putExtra("MODULE_TEXT_EXTRA", someText);
        startActivity(moduleIntent);
    }
}
