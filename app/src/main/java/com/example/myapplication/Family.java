package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        //selecting the data structure to store this huge data in and save the performance of the mobile
        ArrayList<Vocabulary>Families = new ArrayList<Vocabulary>();
        //adding my data in the mobile using the add methode belongs to abstracted class ArrayList
        //-------------------------------ADDING SECTION-----------------------------------------
        Families.add(new Vocabulary("أب","Father"));
        Families.add(new Vocabulary("أم","Mother"));
        Families.add(new Vocabulary("ابن","Son"));
        Families.add(new Vocabulary("ابنة","Daughter"));
        Families.add(new Vocabulary("أخ","Brother"));
        Families.add(new Vocabulary("أخت","Sister"));
        Families.add(new Vocabulary("جد","Grand Father"));
        Families.add(new Vocabulary("جدة","Grand Mother"));
        Families.add(new Vocabulary("حفيد","Grandson"));
        Families.add(new Vocabulary("حفيدة","Granddaughter"));
        Families.add(new Vocabulary("أحفاد","Grandchildren"));
        Families.add(new Vocabulary("عم","Uncle (Father side)"));
        Families.add(new Vocabulary("خال","Uncle (Mother side)"));
        Families.add(new Vocabulary("عمة","Aunt (Father side)"));
        Families.add(new Vocabulary("خالة","Aunt (Mother side)"));
        Families.add(new Vocabulary("إبن العم","Cousin (male) – (Father side)"));
        Families.add(new Vocabulary("إبن الخال","Cousin (male) – (Mother side)"));
        Families.add(new Vocabulary("بنت العم","Cousin (female) – (Father side)"));
        Families.add(new Vocabulary("إبن الأخ","Nephew (brother’s son)"));
        Families.add(new Vocabulary("إبن الأخت","Nephew (sister’s son)"));
        Families.add(new Vocabulary("إبنة الأخ","Niece (brother’s daughter)"));
        Families.add(new Vocabulary("إبنة الأخت","Niece (sister’s daughter)"));

        TemplateAdapter FamilyAdapter = new TemplateAdapter(this , Families);

       // ArrayAdapter<Vocabulary> Familyadapter = new ArrayAdapter<Vocabulary>(this , android.R.layout.simple_list_item_1,Families);
        ListView FamilyList = (ListView) findViewById(R.id.ListFamily);
        FamilyList.setAdapter(FamilyAdapter);

        //END OF ADDING DATA SECTION

    }
}
