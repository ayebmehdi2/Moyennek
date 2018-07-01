package com.moyennek.molhed.informaton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.moyennek.molhed.R;

import java.util.ArrayList;

public class tEme extends AppCompatActivity {

    TextView hede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_matiere);

        AdView mAdView = findViewById(R.id.adVj);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ArrayList<classInfo> infos = new ArrayList<>();

        infos.add(new classInfo(" ", "LETTRE ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "4", "5"));
        infos.add(new classInfo("الفرنسية", "3", "5"));
        infos.add(new classInfo("الأنقليزية", "3", "5"));
        infos.add(new classInfo("التاريخ", "1,5", "2"));
        infos.add(new classInfo("الجغرافيا", "1,5", "2"));
        infos.add(new classInfo("التفكير الإسلامي", "1", "2"));
        infos.add(new classInfo("الفلسفة", "4", "6"));
        infos.add(new classInfo("المادة الإختيارية", "1", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "19", "30,5"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "INFO ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ",  "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "1", "1"));
        infos.add(new classInfo("الفرنسية", "1", "3"));
        infos.add(new classInfo("الأنقليزية", "1", "3"));
        infos.add(new classInfo("الفلسفة", "1", "3"));
        infos.add(new classInfo("الرياضيات", "3", "5"));
        infos.add(new classInfo("الخوارزميات", "3", "4"));
        infos.add(new classInfo("T.i.C", "1.5", "2"));
        infos.add(new classInfo("الشبكات", "1.5", "2"));
        infos.add(new classInfo("العلوم الفيزيائية", "3", "5"));
        infos.add(new classInfo("المادة الإختيارية", "1", "2"));
        infos.add(new classInfo("قاعدة البيانات", "1", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "18", "32"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "SCIENCE ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "1", "1"));
        infos.add(new classInfo("الفرنسية", "1", "3"));
        infos.add(new classInfo("الأنقليزية", "1", "3"));
        infos.add(new classInfo("الفلسفة", "1", "3"));
        infos.add(new classInfo("الرياضيات", "3", "5"));
        infos.add(new classInfo("علوم الحياة و الأرض", "4", "5"));
        infos.add(new classInfo("العلوم الفيزيائية", "4", "5"));
        infos.add(new classInfo("المادة الإختيارية", "1", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo("الإعلامية", "1", "2"));
        infos.add(new classInfo(": المجموع", "18", "31"));
        infos.add(new classInfo("", "", "", R.color.bkgg));


        infos.add(new classInfo(" ", "ECO ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "1", "1"));
        infos.add(new classInfo("الفرنسية", "1", "3"));
        infos.add(new classInfo("الأنقليزية", "1", "3"));
        infos.add(new classInfo("التاريخ", "1", "1"));
        infos.add(new classInfo("الجغرافيا", "2", "2"));
        infos.add(new classInfo("الفلسفة", "1", "3"));
        infos.add(new classInfo("الرياضيات", "2,5", "4"));
        infos.add(new classInfo("الإقتصاد", "4", "5"));
        infos.add(new classInfo("التصرف", "4", "5"));
        infos.add(new classInfo("الإعلامية", "1", "2"));
        infos.add(new classInfo("المادة الإختيارية", "1", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "20.5", "33"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "TECH", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "1", "1"));
        infos.add(new classInfo("الفرنسية", "1", "2"));
        infos.add(new classInfo("الأنقليزية", "1", "2"));
        infos.add(new classInfo("الفلسفة", "1", "3"));
        infos.add(new classInfo("الرياضيات", "3", "5"));
        infos.add(new classInfo("الإعلامية", "1", "2"));
        infos.add(new classInfo("الكهرباء", "2", "4"));
        infos.add(new classInfo("الميكنيك", "2", "4"));
        infos.add(new classInfo("العلوم الفيزيائية", "4", "5"));
        infos.add(new classInfo("المادة الإختيارية", "1", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "18", "32"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "MATH ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "2", "3"));
        infos.add(new classInfo("الفرنسية", "2", "4"));
        infos.add(new classInfo("الأنقليزية", "2", "3"));
        infos.add(new classInfo("التاريخ", "1", "1"));
        infos.add(new classInfo("الجغرافيا", "1", "1"));
        infos.add(new classInfo("التفكير الإسلامي", "1", "1"));
        infos.add(new classInfo("الفلسفة", "1", "1"));
        infos.add(new classInfo("الرياضيات", "4", "7"));
        infos.add(new classInfo("علوم الحياة و الأرض", "1.5", "1.5"));
        infos.add(new classInfo("العلوم الفيزيائية", "4", "5"));
        infos.add(new classInfo("المادة الإختيارية", "1", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo("الإعلامية", "1", "2"));
        infos.add(new classInfo(": المجموع", "22.5", "33,5"));
        infos.add(new classInfo("", "", "", R.color.bkgg));



        AdapterIndo ad = new AdapterIndo(tEme.this, infos);

        ListView li =  findViewById(R.id.list_table);

        li.setAdapter(ad);



        hede =  findViewById(R.id.anne);
        hede.setText(R.string.troisieme);

    }
}