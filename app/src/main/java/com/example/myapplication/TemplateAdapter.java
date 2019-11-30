package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TemplateAdapter extends ArrayAdapter<Vocabulary> {

    //inherited the abstracted class and make some override on it's states
    public TemplateAdapter(Activity Contex , ArrayList<Vocabulary> categories){
        super(Contex ,0,categories);
    };
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListViewItem = convertView;
        if(ListViewItem == null){
            ListViewItem = LayoutInflater.from(getContext()).inflate(R.layout.template , parent ,false);
        };

        Vocabulary currentCategory = getItem(position);

        TextView ArabicLang = (TextView) ListViewItem.findViewById(R.id.Arabic);
        ArabicLang.setText(currentCategory.getArabic());

        TextView EnglishLang = (TextView) ListViewItem.findViewById(R.id.English);
        EnglishLang.setText(currentCategory.getEnglish());

        return ListViewItem;

    };
}
