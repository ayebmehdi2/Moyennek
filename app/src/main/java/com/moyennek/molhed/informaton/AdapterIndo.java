package com.moyennek.molhed.informaton;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moyennek.molhed.R;

import java.util.ArrayList;



public class AdapterIndo extends ArrayAdapter<classInfo> {

    AdapterIndo(Context context, ArrayList<classInfo> users) {
        super(context, 0, users);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        classInfo us = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.unfo, parent, false);
        }

        TextView mtr =  convertView.findViewById(R.id.mtrrr);
        TextView cofi =  convertView.findViewById(R.id.cofii);
        TextView her =  convertView.findViewById(R.id.herr);

        assert us != null;
        mtr.setText(us.getMtr());

        cofi.setText(us.getCofi());

        her.setText(us.getHer());



        return convertView;
    }
}