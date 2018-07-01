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

public class Btech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matiere_list);



        final ArrayList<Word> infos = new ArrayList<Word>();

        infos.add(new Word("العربية", "1"));
        infos.add(new Word("الفرنسية", "2"));
        infos.add(new Word("الأنقليزية", "2"));
        infos.add(new Word("التاريخ", "1"));
        infos.add(new Word("الجغرافيا", "1"));
        infos.add(new Word("الفلسفة", "1"));
        infos.add(new Word("الرياضيات", "3"));
        infos.add(new Word("الإعلامية", "1"));
        infos.add(new Word("الالكترونيك", "2"));
        infos.add(new Word("الميكنيك", "2"));
        infos.add(new Word("العلوم الفيزيائية", "4"));
        infos.add(new Word("المادة الإختيارية", "1"));
        infos.add(new Word("التربية البدنية", "1"));
        WordAdapter Adapter = new WordAdapter(Btech.this, infos, R.color.btech);

        ListView llist = (ListView)findViewById(R.id.list);

        llist.setAdapter(Adapter);


        final TextView t = (TextView) findViewById(R.id.mouaadel);
        Button bb = findViewById(R.id.btnPlaceOrder);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer media = MediaPlayer.create(Btech.this, R.raw.re);
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

        AdView mAdView = findViewById(R.id.adV);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }


}