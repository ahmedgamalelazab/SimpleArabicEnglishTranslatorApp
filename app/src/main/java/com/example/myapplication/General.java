package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class General extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        //selecting data to put elements in
        ArrayList<Vocabulary> GeneralList = new ArrayList<Vocabulary>();
        GeneralList.add(new Vocabulary("مدرسة (ج) مدارس", "school"));
        GeneralList.add(new Vocabulary("منهج (ج) مناهج", "curriculum"));
        GeneralList.add(new Vocabulary("الدراسات العليا", "higher education"));
        GeneralList.add(new Vocabulary("حضانة (ج) حضانات", "nursery school"));
        GeneralList.add(new Vocabulary("بامتياز", "with distinction"));
        GeneralList.add(new Vocabulary("حصّة (ج) حصص", "class period"));
        GeneralList.add(new Vocabulary("الهندسة المدنية", "civil engineering"));
        GeneralList.add(new Vocabulary("هندسة الحاسوبات", "computer engineering"));
        GeneralList.add(new Vocabulary("الهندسة الكهربائية", "electrical engineering"));
        GeneralList.add(new Vocabulary("الهندسة الصناعية", "industrial engineering"));
        GeneralList.add(new Vocabulary("الهندسة النووية", "nuclear engineering"));
        GeneralList.add(new Vocabulary("غدة (ج) غدد", "gland"));
        GeneralList.add(new Vocabulary("قصّة", "bangs, fringe"));
        GeneralList.add(new Vocabulary("دهني", "greasy"));
        GeneralList.add(new Vocabulary("شعر مستعار", "wig"));
        GeneralList.add(new Vocabulary("قشرة", "dandruff"));
        GeneralList.add(new Vocabulary("صدغ (ج) اصداغ", "temple"));
        GeneralList.add(new Vocabulary("نمش", "freckles"));
        GeneralList.add(new Vocabulary("طبل الاذن", "eardrum"));
        GeneralList.add(new Vocabulary("لعاب", "saliva"));
        GeneralList.add(new Vocabulary("قبضة (ج) قبضات اليد", "fist"));
        //u can update this data if u wanana in any tine as u want

        TemplateAdapter GeneralsAdapter = new TemplateAdapter(this, GeneralList);

        ListView GeneralsLists = (ListView) findViewById(R.id.ListGeneral);
        GeneralsLists.setAdapter(GeneralsAdapter);


    }
}
