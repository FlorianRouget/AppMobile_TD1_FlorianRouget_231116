package com.example.florian.recycler_app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.versionName;

/**
 * Created by florian on 16/11/2016.
 */

public class adapter_custom_01 extends RecyclerView.Adapter<adapter_custom_01.ViewHolder>{
        private String[] mDataset;
    private ArrayList<AndroidVersion> androidVersionList;
    private Context context;
    private int viewRes;
    private Resources res;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //public TextView mTextView;
        public TextView title ;
        public TextView desc ;
        public ImageView icon ;

        public ViewHolder (View v){
            super(v);
            //mTextView = (TextView) v.findViewById(R.id.title);
            title = (TextView) v.findViewById(R.id.title);
            desc = (TextView) v.findViewById(R.id.desc);
            icon = (ImageView) v.findViewById(R.id.icon);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //this.res = parent.getContext().getResources();
        //this.context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.resources, parent, false);

//        ViewHolder vh = new ViewHolder(v);
//        return vh;
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //final AndroidVersion androidVersion = androidVersionList.get(position);
        AndroidVersion androidVersion = androidVersionList.get(position);
        holder.title.setText(androidVersion.getVersionName());
        holder.desc.setText(androidVersion.getVersionNumber());
    }

    @Override
    public int getItemCount() {
        return androidVersionList.size();
    }

/*
    public adapter_custom_01(String[] myDataset){
            mDataset = myDataset;
    }
*/
    public adapter_custom_01(ArrayList<AndroidVersion> versions){
        this.androidVersionList = versions;
    }

}
