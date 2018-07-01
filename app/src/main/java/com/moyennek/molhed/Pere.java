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

public class Pere extends AppCompatActivity {

    MediaPlayer pp;

    private final void releaserr(){
        if (pp != null){
            pp.release();
            pp = null;
        }
    }

    private MediaPlayer.OnCompletionListener o = (new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaserr();
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matiere_list);


        final ArrayList<Word> infos = new ArrayList<Word>();

        infos.add(new Word("العربية", "3"));
        infos.add(new Word("الفرنسية", "2.5"));
        infos.add(new Word("الأنقليزية", "1.5"));
        infos.add(new Word("التاريخ", "1.5"));
        infos.add(new Word("الجغرافيا", "1.5"));
        infos.add(new Word("التفكير الإسلامي", "1"));
        infos.add(new Word("التربية المدنية", "1"));
        infos.add(new Word("الرياضيات", "3"));
        infos.add(new Word("العلوم الفيزيائية", "2.5"));
        infos.add(new Word("علوم الحياة و الأرض", "1.2"));
        infos.add(new Word("التكنولوجيا", "1"));
        infos.add(new Word("التربية البدنية", "1"));


        WordAdapter Adapter = new WordAdapter(Pere.this, infos, R.color.pere);

        ListView llist = (ListView)findViewById(R.id.list);

        llist.setAdapter(Adapter);

        final TextView t = (TextView) findViewById(R.id.mouaadel);
        Button bb = findViewById(R.id.btnPlaceOrder);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer media = MediaPlayer.create(Pere.this, R.raw.re);
                media.start();

                Double o = 0d;
                int p = 0;

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