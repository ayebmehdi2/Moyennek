package com.moyennek.molhed;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class DataAdapter extends ArrayAdapter<Data> {



    private Context contxt;
    DataAdapter(Context context, ArrayList<Data> users) {
        super(context, 0, users);
        this.contxt = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final Data ss = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.data_item, parent, false);
        }

        final MediaPlayer tap = MediaPlayer.create(contxt, R.raw.tap);


        LinearLayout ma = (LinearLayout)  convertView.findViewById(R.id.mama);

        ImageView ico = (ImageView) convertView.findViewById(R.id.icone);
        ico.setImageResource(ss.getImg());

        TextView tt = (TextView) convertView.findViewById(R.id.matiep);
        tt.setText(ss.getAnn());

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap.start();
                Intent k = new Intent(contxt, ss.getClas());
                contxt.startActivity(k);

            }
        });


        return convertView;
    }




}
