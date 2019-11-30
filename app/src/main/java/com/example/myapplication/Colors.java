package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //selecting data structure to put my data in
        ArrayList<Vocabulary> Colors = new ArrayList<Vocabulary>();
        Colors.add(new Vocabulary("لون (ج) ألوان", "color"));
        Colors.add(new Vocabulary("ملوّن", "colored"));
        Colors.add(new Vocabulary("فاتح", "light"));
        Colors.add(new Vocabulary("غامق,داكن", "dark"));
        Colors.add(new Vocabulary("براق", "bright"));
        Colors.add(new Vocabulary("لامع", "shiny"));
        Colors.add(new Vocabulary("اسود – سوداء (ج)", "black"));
        Colors.add(new Vocabulary("أبيض – بيضاء (ج)", "white"));
        Colors.add(new Vocabulary("(تبييض)", "to whiten"));
        Colors.add(new Vocabulary("كحلي", "navy blue"));
        Colors.add(new Vocabulary("زهري", "royal blue"));
        Colors.add(new Vocabulary("سمائي", "sky blue"));
        Colors.add(new Vocabulary("لبني", "baby blue"));
        Colors.add(new Vocabulary("فيروزي", "turquoise"));
        Colors.add(new Vocabulary("أخضر – خضراء", "green"));
        Colors.add(new Vocabulary("زيتوني", "olive green"));
        Colors.add(new Vocabulary("ارجواني", "purple"));
        Colors.add(new Vocabulary("أحمر - حمراء (ج)", "red"));
        Colors.add(new Vocabulary("قرمزي", "scarlet"));
        Colors.add(new Vocabulary("زهري", "pink"));
        Colors.add(new Vocabulary("برتقالي", "orange"));
        Colors.add(new Vocabulary("أصفر ", "yellow"));
        Colors.add(new Vocabulary("بني", "brown"));
        Colors.add(new Vocabulary("أسمر - سمراء (ج)", "brown-skinned (or"));
        Colors.add(new Vocabulary("باهت", "pale, washed out"));
        Colors.add(new Vocabulary("كستنائي", "chestnut"));
        Colors.add(new Vocabulary("أصفر شاحب", "cream"));
        Colors.add(new Vocabulary("رمادي", "grey"));
        Colors.add(new Vocabulary("ذهبي", "gold"));
        Colors.add(new Vocabulary("فضي", "silver"));
        Colors.add(new Vocabulary("بيج", "beige"));
        Colors.add(new Vocabulary("لون العاج", "ivory"));

        TemplateAdapter colorsAdapter = new TemplateAdapter(this, Colors);
        ListView ColorsLists = (ListView) findViewById(R.id.ListNumbers);
        //i Overwritten the numbers to colors
        ColorsLists.setAdapter(colorsAdapter);
    }
}
