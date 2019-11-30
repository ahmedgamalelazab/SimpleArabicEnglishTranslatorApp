package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Military extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_military);
        //selecting the datastructure to store our data in
        ArrayList<Vocabulary> Militaries = new ArrayList<Vocabulary>();
        Militaries.add(new Vocabulary("حرب (ج) حروب", "war"));
        Militaries.add(new Vocabulary("حرب أهلية", "civil war"));
        Militaries.add(new Vocabulary("حرب بالوكالة", "proxy war"));
        Militaries.add(new Vocabulary("الحرب الباردة", "the Cold War"));
        Militaries.add(new Vocabulary("ثورة (ج) ثورات", "revolution"));
        Militaries.add(new Vocabulary("انقلاب", "coup"));
        Militaries.add(new Vocabulary("انقلاب أبيض", "bloodless coup"));
        Militaries.add(new Vocabulary("أطاح - يطوح (اطاحة)", "to overthrow"));
        Militaries.add(new Vocabulary("صراع", "conflict"));
        Militaries.add(new Vocabulary("نزاع", "strife"));
        Militaries.add(new Vocabulary("نضال", "fight, struggle"));
        Militaries.add(new Vocabulary("كفاح,مقاومة", "resistance"));
        Militaries.add(new Vocabulary("عصيان", "insurrection"));
        Militaries.add(new Vocabulary("تمرّد", "rebellion"));
        Militaries.add(new Vocabulary("عسكري", "military "));
        Militaries.add(new Vocabulary("حلف (ج) أحلاف", "alliance"));
        Militaries.add(new Vocabulary("حليف (ج) حلفاء", "ally"));
        Militaries.add(new Vocabulary("دفاع عن", "defense (of)"));
        Militaries.add(new Vocabulary("ضربة وقائية", "pre-emptive strike"));
        Militaries.add(new Vocabulary("الحكم العرفي", "martial law"));
        Militaries.add(new Vocabulary("احتلال", "occupation"));
        Militaries.add(new Vocabulary("سلاح (ج) أسلحة", "weapon, gun"));
        Militaries.add(new Vocabulary("رشاش (ج) رشاشات", "machine gun"));
        Militaries.add(new Vocabulary("ثقيل", "heavy"));
        Militaries.add(new Vocabulary("خفيف", "light"));
        Militaries.add(new Vocabulary("بندقية (ج) بنادق", "rifle"));
        Militaries.add(new Vocabulary("بندقية قناصة", "sniper rifle"));
        Militaries.add(new Vocabulary("مسدس (ج) مسدسات", "pistol"));
        Militaries.add(new Vocabulary("سيف (ج) سيوف", "sword"));
        Militaries.add(new Vocabulary("رصاصة (ج) رصوص", "bullet"));
        Militaries.add(new Vocabulary("رصاص مطاطي", "rubber bullets"));
        Militaries.add(new Vocabulary("رصاص حي", "live ammunition"));
        Militaries.add(new Vocabulary("الغاز المسيل للدموع", "tear gas"));
        Militaries.add(new Vocabulary("سلاح ناري", "firearm"));
        Militaries.add(new Vocabulary("أسلحة الدمار الشامل", "weapons of mass destruction"));
        Militaries.add(new Vocabulary("أسلحة نووية", "nuclear weapons"));
        Militaries.add(new Vocabulary("قنبلة ذرية", "atomic bomb"));
        Militaries.add(new Vocabulary("قنبلة ذكية", "smart bomb"));
        Militaries.add(new Vocabulary("قنبلة عنقودية", "cluster bomb"));
        Militaries.add(new Vocabulary("لغم أرضي (ج) ألغام أرضية", "land mine"));
        Militaries.add(new Vocabulary("هاون (ج) هواوين", "mortar"));

        TemplateAdapter MilitaryAdapter = new TemplateAdapter(this, Militaries);
        ListView MilitaryLists = (ListView) findViewById(R.id.ListMilitary);
        MilitaryLists.setAdapter(MilitaryAdapter);


    }
}
