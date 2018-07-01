package com.moyennek.molhed;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.moyennek.molhed.informaton.BAC;
import com.moyennek.molhed.informaton.dEme;
import com.moyennek.molhed.informaton.tEme;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Intent h;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,
                "ca-app-pub-2067708359225937~2678982588");

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        final MediaPlayer tap = MediaPlayer.create(MainActivity.this, R.raw.tap);


        ImageView abb = (ImageView) findViewById(R.id.ab);
        abb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                h = new Intent(MainActivity.this, Ab.class);
                startActivity(h);
            }
        });


        TextView dem = (TextView) findViewById(R.id.deuxieme);
        dem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                h = new Intent(MainActivity.this, dEme.class);
                startActivity(h);
            }
        });

        TextView tem = (TextView) findViewById(R.id.troiseme);
        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                h = new Intent(MainActivity.this, tEme.class);
                startActivity(h);
            }
        });

        TextView bc = (TextView) findViewById(R.id.bakaloria);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                h = new Intent(MainActivity.this, BAC.class);
                startActivity(h);
            }
        });


        final ArrayList<Data> ann = new ArrayList<Data>();
        ann.add(new Data("College", College.class, R.drawable.college));
        ann.add(new Data("Premier", Pere.class, R.drawable.peremier));
        DataAdapter dann = new DataAdapter(MainActivity.this, ann);
        GridView gann = (GridView) findViewById(R.id.gann);
        gann.setAdapter(dann);


        final ArrayList<Data> dexeme = new ArrayList<Data>();
        dexeme.add(new Data("Info", Dinfo.class, R.drawable.info));
        dexeme.add(new Data("Sience", Dsns.class,R.drawable.sciece));
        dexeme.add(new Data("Eco", Deco.class, R.drawable.koo));
        dexeme.add(new Data("Lettre",Dltre.class, R.drawable.lettre));
        DataAdapter ddexeme = new DataAdapter(MainActivity.this, dexeme);
        GridView gdexeme = (GridView) findViewById(R.id.gdexeme);
        gdexeme.setAdapter(ddexeme);


        final ArrayList<Data> trxeme = new ArrayList<Data>();
        trxeme.add(new Data("Info", Tinfo.class, R.drawable.info));
        trxeme.add(new Data("Eco", Teco.class, R.drawable.koo));
        trxeme.add(new Data("Science", Tsns.class, R.drawable.sciece));
        trxeme.add(new Data("Math", Tmath.class, R.drawable.math));
        trxeme.add(new Data("Tech", Ttech.class, R.drawable.tech));
        trxeme.add(new Data("Lettre", Tltre.class, R.drawable.lettre));
        DataAdapter dtrxeme = new DataAdapter(MainActivity.this, trxeme);
        GridView gtrxeme = (GridView) findViewById(R.id.gtrxeme);
        gtrxeme.setAdapter(dtrxeme);


        final ArrayList<Data> bcc = new ArrayList<Data>();
        bcc.add(new Data("Info",Binfo.class, R.drawable.info));
        bcc.add(new Data("Eco", Beco.class, R.drawable.koo));
        bcc.add(new Data("Science", Bsns.class, R.drawable.sciece));
        bcc.add(new Data("Math", Bmath.class, R.drawable.math));
        bcc.add(new Data("Tech", Btech.class, R.drawable.tech));
        bcc.add(new Data("Lettre", Bltre.class, R.drawable.lettre));
        bcc.add(new Data("Sport", Bsport.class, R.drawable.sport));


        DataAdapter dbcc = new DataAdapter(MainActivity.this, bcc);
        GridView gbcc = (GridView) findViewById(R.id.gbcc);
        gbcc.setAdapter(dbcc);

    }

}
