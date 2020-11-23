package com.example.android.flavor;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.simple_list_item_1,
                    parent,
                    false
            );
        }
        Word currentWord = getItem(position);
        TextView digit = (TextView) listItemView.findViewById(R.id.digit);
        TextView alpha = (TextView) listItemView.findViewById(R.id.alpha);
        String alp =  currentWord.getName();
        int nn = currentWord.getNo();
        String num = nn+"";
        digit.setText(num);
        alpha.setText(alp);
        return listItemView;
    }

    public WordAdapter(@NonNull Context context, ArrayList<Word> word) {

        super(context,0,  word);
    }
}
