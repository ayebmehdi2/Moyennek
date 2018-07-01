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

public class College extends AppCompatActivity {


    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matiere_list);


        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("العربية", "4"));
        words.add(new Word("الفرنسية", "4"));
        words.add(new Word("الأنقليزية", "1.5"));
        words.add(new Word("التاريخ", "1"));
        words.add(new Word("الجغرافيا", "1"));
        words.add(new Word("التفكير الإسلامي", "1"));
        words.add(new Word("التربية المدنية", "1"));
        words.add(new Word("الرياضيات", "3"));
        words.add(new Word("العلوم الفيزيائة", "1"));
        words.add(new Word("التكنولوجيا", "1"));
        words.add(new Word("الإعلامية", "1"));
        words.add(new Word("التربية التشكيلية", "1"));
        words.add(new Word("التربية البدنية", "1"));
        words.add(new Word("علوم الحياة و الأرض", "1"));

        WordAdapter a = new WordAdapter(College.this, words, R.color.clg);

        ListView lit = findViewById(R.id.list);

        lit.setAdapter(a);


        final TextView t = (TextView) findViewById(R.id.mouaadel);
        Button bb = findViewById(R.id.btnPlaceOrder);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                media = MediaPlayer.create(College.this, R.raw.re);
                media.start();

                Double o = 0d;
                int p = 0;


                for (Word i : words){
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
