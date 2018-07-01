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

public class Dltre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matiere_list);


        final ArrayList<Word> items = new ArrayList<Word>();

        items.add(new Word("العربية", "4"));
        items.add(new Word("الفرنسية", "4"));
        items.add(new Word("الأنقليزية", "3"));
        items.add(new Word("التاريخ", "1,5"));
        items.add(new Word("الجغرافيا", "1,5"));
        items.add(new Word("التفكير الإسلامي", "1"));
        items.add(new Word("التربية المدنية", "1"));
        items.add(new Word("التربية المدنية", "1"));
        items.add(new Word("الرياضيات", "1"));
        items.add(new Word("علوم", "1"));
        items.add(new Word("التربية البدنية", "1"));
        items.add(new Word("التربية البدنية", "1"));

        WordAdapter Adapter = new WordAdapter(Dltre.this, items, R.color.dltre);

        ListView llist = (ListView)findViewById(R.id.list);

        llist.setAdapter(Adapter);


        final TextView t = (TextView) findViewById(R.id.mouaadel);
        Button bb = findViewById(R.id.btnPlaceOrder);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer media = MediaPlayer.create(Dltre.this, R.raw.re);
                media.start();
                Double o = 0d;
                int p = 0;


                for (Word i : items){
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