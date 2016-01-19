package com.example.tacademy.samplerecyclerheaderview1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-19.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView text_title;
    public ItemViewHolder(View itemView) {

        super(itemView);
        text_title = (TextView)itemView.findViewById(R.id.text_title);

    }
    public void setText(String text){
        text_title.setText(text);
    }
}
