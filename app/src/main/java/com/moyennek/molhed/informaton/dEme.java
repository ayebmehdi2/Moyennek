package com.moyennek.molhed.informaton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.moyennek.molhed.R;

import java.util.ArrayList;

public class dEme extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_matiere);

        AdView mAdView = findViewById(R.id.adVj);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ArrayList<classInfo> infos = new ArrayList<>();

        TextView he =  findViewById(R.id.anne);
        he.setText(R.string.deuxieme);

        infos.add(new classInfo(" ", "LETTRE ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "4", "5"));
        infos.add(new classInfo("الفرنسية", "4", "4"));
        infos.add(new classInfo("الأنقليزية", "3", "3"));
        infos.add(new classInfo("التاريخ", "1,5", "1,5"));
        infos.add(new classInfo("الجغرافيا", "1,5", "1,5"));
        infos.add(new classInfo("التفكير الإسلامي", "1", "1,5"));
        infos.add(new classInfo("التربية المدنية", "1", "1,5"));
        infos.add(new classInfo("الرياضيات", "1", "2"));
        infos.add(new classInfo("علوم الحياة و الأرض", "1", "1,5"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "19", "25,5"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "INFO ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "2", "3"));
        infos.add(new classInfo("الفرنسية", "2", "3"));
        infos.add(new classInfo("الأنقليزية", "2", "3"));
        infos.add(new classInfo("التاريخ", "1", "1"));
        infos.add(new classInfo("الجغرافيا", "1", "1"));
        infos.add(new classInfo("التفكير الإسلامي", "1", "1,5"));
        infos.add(new classInfo("التربية المدنية", "1", "1,5"));
        infos.add(new classInfo("الرياضيات", "4", "5"));
        infos.add(new classInfo("علوم الحياة و الأرض", "1", "1,5"));
        infos.add(new classInfo("الإعلامية", "3", "5"));
        infos.add(new classInfo("العلوم الفيزيائية", "3", "4"));
        infos.add(new classInfo("التكنولوجيا", "2", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "23", "32"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "SCIENCE ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "2", "4"));
        infos.add(new classInfo("الفرنسية", "2", "4"));
        infos.add(new classInfo("الأنقليزية", "2", "3"));
        infos.add(new classInfo("التاريخ", "1", "1"));
        infos.add(new classInfo("الجغرافيا", "1", "1"));
        infos.add(new classInfo("التفكير الإسلامي", "1", "1,5"));
        infos.add(new classInfo("التربية المدنية", "1", "1,5"));
        infos.add(new classInfo("الرياضيات", "4", "5"));
        infos.add(new classInfo("علوم الحياة و الأرض", "2", "3,5"));
        infos.add(new classInfo("العلوم الفيزيائية", "4", "4"));
        infos.add(new classInfo("التكنولوجيا", "2", "2"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "23", "32,5"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        infos.add(new classInfo(" ", "ECO ", " ", R.color.hdrclr));
        infos.add(new classInfo("المواد ", "الضارب ", "الساعات", R.color.hdrclr));
        infos.add(new classInfo("العربية", "2", "4"));
        infos.add(new classInfo("الفرنسية", "2", "4"));
        infos.add(new classInfo("الأنقليزية", "2", "4"));
        infos.add(new classInfo("التاريخ", "1,5", "1,5"));
        infos.add(new classInfo("الجغرافيا", "1,5", "1,5"));
        infos.add(new classInfo("التفكير الإسلامي", "1", "1,5"));
        infos.add(new classInfo("التربية المدنية", "1", "1,5"));
        infos.add(new classInfo("الرياضيات", "2,5", "3"));
        infos.add(new classInfo("الإقتصاد", "3", "3"));
        infos.add(new classInfo("التصرف", "3", "3"));
        infos.add(new classInfo("التربية البدنية", "1", "2"));
        infos.add(new classInfo(": المجموع", "31", "21,5"));
        infos.add(new classInfo("", "", "", R.color.bkgg));

        AdapterIndo ad = new AdapterIndo(dEme.this, infos);
        ListView li = findViewById(R.id.list_table);
        li.setAdapter(ad);


    }
}