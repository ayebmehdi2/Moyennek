package com.moyennek.molhed;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Tmath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matiere_list);

        final ArrayList<Word> infos = new ArrayList<Word>();

        infos.add(new Word("العربية", "2"));
        infos.add(new Word("الفرنسية", "2"));
        infos.add(new Word("الأنقليزية", "2"));
        infos.add(new Word("التاريخ", "1"));
        infos.add(new Word("الجغرافيا", "1"));
        infos.add(new Word("التفكير الإسلامي", "1"));
        infos.add(new Word("الفلسفة", "1"));
        infos.add(new Word("الرياضيات", "4"));
        infos.add(new Word("علوم", "1.5"));
        infos.add(new Word("العلوم الفيزيائية", "4"));
        infos.add(new Word("المادة الإختيارية", "1"));
        infos.add(new Word("التربية البدنية", "1"));
        infos.add(new Word("الإعلامية", "1"));

        WordAdapter Adapter = new WordAdapter(Tmath.this, infos, R.color.tmath);

        ListView llist = findViewById(R.id.list);

        llist.setAdapter(Adapter);

        AdView mAdView = findViewById(R.id.adV);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        final TextView t =  findViewById(R.id.mouaadel);
        Button bb = findViewById(R.id.btnPlaceOrder);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer media = MediaPlayer.create(Tmath.this, R.raw.re);
                media.start();

                Double o = 0d;
                int p = 0;

                /* int help = 1;*/

                for (Word i : infos){
                    Double n = i.getMoyenne();
                    if (n > 0){
                        o += n;
                        p += 1;
                    }
                }


                if (p > 0){
                    t.setText(String.valueOf(o / p));
                } else {
                    t.setText(R.string.enter);
                }

            }

        });
    }
}