package com.example.croissant_rouge.Actions.Module;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.croissant_rouge.R;

import java.util.List;

public class ModuleArrayAdapter extends ArrayAdapter<Module> {

    public ModuleArrayAdapter(Context context, List<Module> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.module_item, parent, false);
        }

        //instance of module
        Module module = getItem(position);

        //getting module's name from the instance
        TextView moduleText = listItemView.findViewById(R.id.text_module);
        moduleText.setText(module.getmModuleName());

        if(position % 2 == 0) {
            moduleText.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
        }
        else {
            moduleText.setTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        }

        //getting icon from the instance
        ImageView moduleIcon = listItemView.findViewById(R.id.ic_module);
        moduleIcon.setImageResource(module.getmIconRessource());

        //changing the module background
        listItemView.setBackgroundResource(module.getmBackgroundColor());

        return  listItemView;
    }
}
