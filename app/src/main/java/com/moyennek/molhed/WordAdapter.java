package com.moyennek.molhed;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int clorr;
    private Context cntxt;

    private long endTime = 0;


    WordAdapter(Context context, ArrayList<Word> users, Integer clorr) {
        super(context, 0, users);
        this.clorr = clorr;
        this.cntxt = context;
        }


    @SuppressLint("ClickableViewAccessibility")
    @NonNull
    @Override
    public View getView(final int position, View convertView, @NonNull final ViewGroup parent) {

        final Word user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final MediaPlayer tap = MediaPlayer.create(cntxt, R.raw.tap);


        final ListViewHolder listViewHolder = new ListViewHolder();

        listViewHolder.mtrName = convertView.findViewById(R.id.Mtier);
        assert user != null;
        listViewHolder.mtrName.setText(user.getMatiereName());


        listViewHolder.lnear = convertView.findViewById(R.id.lnear);
        listViewHolder.lnear.setBackgroundResource(clorr);


        listViewHolder.pl1cc =  convertView.findViewById(R.id.pl1cc);
        listViewHolder.pl2cc =  convertView.findViewById(R.id.pl2cc);
        listViewHolder.pl3cc =  convertView.findViewById(R.id.pl3cc);
        listViewHolder.m1cc =  convertView.findViewById(R.id.m1cc);
        listViewHolder.m2cc =  convertView.findViewById(R.id.m2cc);
        listViewHolder.m3cc =  convertView.findViewById(R.id.m3cc);
        listViewHolder.pl1sc =  convertView.findViewById(R.id.pl1sc);
        listViewHolder.pl2sc =  convertView.findViewById(R.id.pl2sc);
        listViewHolder.pl3sc =  convertView.findViewById(R.id.pl3sc);
        listViewHolder.m1sc =  convertView.findViewById(R.id.m1sc);
        listViewHolder.m2sc =  convertView.findViewById(R.id.m2sc);
        listViewHolder.m3sc =  convertView.findViewById(R.id.m3sc);

        listViewHolder.eCofi1 = convertView.findViewById(R.id.cofi1);
        listViewHolder.eCofi2 = convertView.findViewById(R.id.cofi2);
        listViewHolder.eCofi3 = convertView.findViewById(R.id.cofi3);
        listViewHolder.eCofi1s = convertView.findViewById(R.id.cofi1s);
        listViewHolder.eCofi2s = convertView.findViewById(R.id.cofi2s);
        listViewHolder.eCofi3s = convertView.findViewById(R.id.cofi3s);

        listViewHolder.eCofi1.setText(String.valueOf(user.getCofii1()));
        listViewHolder.eCofi2.setText(String.valueOf(user.getCofii2()));
        listViewHolder.eCofi3.setText(String.valueOf(user.getCofii3()));
        listViewHolder.eCofi1s.setText(String.valueOf(user.getCofii1s()));
        listViewHolder.eCofi2s.setText(String.valueOf(user.getCofii2s()));
        listViewHolder.eCofi3s.setText(String.valueOf(user.getCofii3s()));





        listViewHolder.pl1c =  convertView.findViewById(R.id.p1);
        listViewHolder.pl2c =  convertView.findViewById(R.id.p2);
        listViewHolder.pl3c =  convertView.findViewById(R.id.p3);
        listViewHolder.m1c =  convertView.findViewById(R.id.m1);
        listViewHolder.m2c =  convertView.findViewById(R.id.m2);
        listViewHolder.m3c =  convertView.findViewById(R.id.m3);
        listViewHolder.pl1s =  convertView.findViewById(R.id.p1s);
        listViewHolder.pl2s =  convertView.findViewById(R.id.p2s);
        listViewHolder.pl3s =  convertView.findViewById(R.id.p3s);
        listViewHolder.m1s =  convertView.findViewById(R.id.m1s);
        listViewHolder.m2s =  convertView.findViewById(R.id.m2s);
        listViewHolder.m3s =  convertView.findViewById(R.id.m3s);

        listViewHolder.not1 = convertView.findViewById(R.id.not1);
        listViewHolder.not2 = convertView.findViewById(R.id.not2);
        listViewHolder.not3 = convertView.findViewById(R.id.not3);
        listViewHolder.not1s = convertView.findViewById(R.id.not1s);
        listViewHolder.not2s = convertView.findViewById(R.id.not2s);
        listViewHolder.not3s = convertView.findViewById(R.id.not3s);

        listViewHolder.not1.setText(String.valueOf(user.getNott1()));
        listViewHolder.not2.setText(String.valueOf(user.getNott2()));
        listViewHolder.not3.setText(String.valueOf(user.getNott3()));
        listViewHolder.not1s.setText(String.valueOf(user.getNott1s()));
        listViewHolder.not2s.setText(String.valueOf(user.getNott2s()));
        listViewHolder.not3s.setText(String.valueOf(user.getNott3s()));

        listViewHolder.pl1sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                user.setCofii1s(user.getCofii1s() + 0.5);
                listViewHolder.eCofi1s.setText(String.valueOf(user.getCofii1s()));
            }
        });


        listViewHolder.pl2sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii2s() < 5){
                    tap.start();
                    user.setCofii2s(user.getCofii2s() + 0.5);
                    listViewHolder.eCofi2s.setText(String.valueOf(user.getCofii2s()));

                }
            }
        });

        listViewHolder.pl3sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii3s() < 5){
                    tap.start();
                    user.setCofii3s(user.getCofii3s() + 0.5);
                    listViewHolder.eCofi3s.setText(String.valueOf(user.getCofii3s()));

                }
            }
        });

        listViewHolder.pl1cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii1() < 5){
                    tap.start();
                    user.setCofii1(user.getCofii1() + 0.5);
                    listViewHolder.eCofi1.setText(String.valueOf(user.getCofii1()));

                }
            }
        });

        listViewHolder.pl2cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii2() < 5){
                    tap.start();
                    user.setCofii2(user.getCofii2() + 0.5);
                    listViewHolder.eCofi2.setText(String.valueOf(user.getCofii2()));

                }
            }
        });

        listViewHolder.pl3cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii3() < 5){
                    tap.start();
                    user.setCofii3(user.getCofii3() + 0.5);
                    listViewHolder.eCofi3.setText(String.valueOf(user.getCofii3()));

                }
            }
        });

        listViewHolder.m1sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii1s() > 1){
                    tap.start();
                    user.setCofii1s(user.getCofii1s() - 0.5);
                    listViewHolder.eCofi1s.setText(String.valueOf(user.getCofii1s()));

                }
            }
        });

        listViewHolder.m2sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii2s() > 1){
                    tap.start();
                    user.setCofii2s(user.getCofii2s() - 0.5);
                    listViewHolder.eCofi2s.setText(String.valueOf(user.getCofii2s()));

                }
            }
        });

        listViewHolder.m3sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii3s() > 1){
                    tap.start();
                    user.setCofii3s(user.getCofii3s() - 0.5);
                    listViewHolder.eCofi3s.setText(String.valueOf(user.getCofii3s()));

                }
            }
        });

        listViewHolder.m1cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii1() > 1){
                    tap.start();
                    user.setCofii1(user.getCofii1() - 0.5);
                    listViewHolder.eCofi1.setText(String.valueOf(user.getCofii1()));

                }
            }
        });

        listViewHolder.m2cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii2() > 1){
                    tap.start();
                    user.setCofii2(user.getCofii2() - 0.5);
                    listViewHolder.eCofi2.setText(String.valueOf(user.getCofii2()));

                }
            }
        });

        listViewHolder.m3cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getCofii3() > 1){
                    tap.start();
                    user.setCofii3(user.getCofii3() - 0.5);
                    listViewHolder.eCofi3.setText(String.valueOf(user.getCofii3()));
                }
            }
        });



        // button pour notte


        listViewHolder.pl1s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                user.setNott1s(user.getNott1s() + 0.25);
                listViewHolder.not1s.setText(String.valueOf(user.getNott1s()));
            }
        });


        listViewHolder.pl1s.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View pView, MotionEvent pEvent) {
                    if (endTime > 1000){
                        tap.start();
                        user.setNott1s(user.getNott1s() + 0.25);
                        listViewHolder.not1s.setText(String.valueOf(user.getNott1s()));
                    }
                    if (pEvent.getAction() == MotionEvent.ACTION_UP) {
                        endTime = pEvent.getEventTime();
                    }
                    if (pEvent.getAction() == MotionEvent.ACTION_MOVE){
                        endTime = 0;
                    }
                    return false;
                }
        });



        listViewHolder.pl2s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott2s() < 20.0){
                    tap.start();
                    user.setNott2s(user.getNott2s() + 0.25);
                    listViewHolder.not2s.setText(String.valueOf(user.getNott2s()));
                }
            }
        });

        listViewHolder.pl2s.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View pView, MotionEvent pEvent) {
                if (endTime > 1000){
                    tap.start();
                    user.setNott2s(user.getNott2s() + 0.25);
                    listViewHolder.not2s.setText(String.valueOf(user.getNott2s()));
                }
                if (pEvent.getAction() == MotionEvent.ACTION_UP) {
                    endTime = pEvent.getEventTime();
                }
                if (pEvent.getAction() == MotionEvent.ACTION_MOVE){
                    endTime = 0;
                }
                return false;
            }
        });





        listViewHolder.pl3s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott3s() < 20.0){
                    tap.start();
                    user.setNott3s(user.getNott3s() + 0.25);
                    listViewHolder.not3s.setText(String.valueOf(user.getNott3s()));

                }
            }
        });






        listViewHolder.pl3s.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View pView, MotionEvent pEvent) {
                if (endTime > 1000){
                    tap.start();
                    user.setNott3s(user.getNott3s() + 0.25);
                    listViewHolder.not3s.setText(String.valueOf(user.getNott3s()));
                }
                if (pEvent.getAction() == MotionEvent.ACTION_UP) {
                    endTime = pEvent.getEventTime();
                }
                if (pEvent.getAction() == MotionEvent.ACTION_MOVE){
                    endTime = 0;
                }
                return false;
            }
        });







        listViewHolder.pl1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott1() < 20.0){
                    tap.start();
                    user.setNott1(user.getNott1() + 0.25);
                    listViewHolder.not1.setText(String.valueOf(user.getNott1()));

                }
            }
        });


        listViewHolder.pl1c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View pView, MotionEvent pEvent) {
                if (endTime > 1000){
                    tap.start();
                    user.setNott1(user.getNott1() + 0.25);
                    listViewHolder.not1.setText(String.valueOf(user.getNott1()));
                }
                if (pEvent.getAction() == MotionEvent.ACTION_UP) {
                    endTime = pEvent.getEventTime();
                }
                if (pEvent.getAction() == MotionEvent.ACTION_MOVE){
                    endTime = 0;
                }
                return false;
            }
        });






        listViewHolder.pl2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott2() < 20.0){
                    tap.start();
                    user.setNott2(user.getNott2() + 0.25);
                    listViewHolder.not2.setText(String.valueOf(user.getNott2()));

                }
            }
        });


        listViewHolder.pl2c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View pView, MotionEvent pEvent) {
                if (endTime > 1000){
                    tap.start();
                    user.setNott2(user.getNott2() + 0.25);
                    listViewHolder.not2.setText(String.valueOf(user.getNott2()));
                }
                if (pEvent.getAction() == MotionEvent.ACTION_UP) {
                    endTime = pEvent.getEventTime();
                }
                if (pEvent.getAction() == MotionEvent.ACTION_MOVE){
                    endTime = 0;
                }
                return false;
            }
        });





        listViewHolder.pl3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott3() < 20.0){
                    tap.start();
                    user.setNott3(user.getNott3() + 0.25);
                    listViewHolder.not3.setText(String.valueOf(user.getNott3()));

                }
            }
        });


        listViewHolder.pl3c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View pView, MotionEvent pEvent) {
                if (endTime > 1000){
                    tap.start();
                    user.setNott3(user.getNott3() + 0.25);
                    listViewHolder.not3.setText(String.valueOf(user.getNott3()));
                }
                if (pEvent.getAction() == MotionEvent.ACTION_UP) {
                    endTime = pEvent.getEventTime();
                }
                if (pEvent.getAction() == MotionEvent.ACTION_MOVE){
                    endTime = 0;
                }
                return false;
            }
        });





        listViewHolder.m1s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott1s() > 0){
                    tap.start();
                    user.setNott1s(user.getNott1s() - 0.5);
                    listViewHolder.not1s.setText(String.valueOf(user.getNott1s()));

                }
            }
        });


        listViewHolder.m2s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott2s() > 0){
                    tap.start();
                    user.setNott2s(user.getNott2s() - 0.5);
                    listViewHolder.not2s.setText(String.valueOf(user.getNott2s()));

                }
            }
        });


        listViewHolder.m3s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott3s() > 0){
                    tap.start();
                    user.setNott3s(user.getNott3s() - 0.5);
                    listViewHolder.not3s.setText(String.valueOf(user.getNott3s()));

                }
            }
        });



        listViewHolder.m1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott1() > 0){
                    tap.start();
                    user.setNott1(user.getNott1() - 0.5);
                    listViewHolder.not1.setText(String.valueOf(user.getNott1()));

                }
            }
        });



        listViewHolder.m2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott2() > 0){
                    tap.start();
                    user.setNott2(user.getNott2() - 0.5);
                    listViewHolder.not2.setText(String.valueOf(user.getNott2()));

                }
            }
        });


        listViewHolder.m3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getNott3() > 0){
                    tap.start();
                    user.setNott3(user.getNott3() - 0.5);
                    listViewHolder.not3.setText(String.valueOf(user.getNott3()));

                }
            }
        });



        return convertView;
    }

}