package com.example.florian.recycler_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] androidVersion ={"Cupcake","Donut","Eclair","Froyo","GingerBread","Honeycomb","Lollipop"};
    private String[] androidVersionNum ={"1.0","2.0","3.0","4.0","5.0","6.0","7.0"};

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private  adapter_custom_01 mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AndroidVersion> derp = new ArrayList<AndroidVersion>();
        initList(derp);

        mRecyclerView = (RecyclerView) findViewById(R.id.activity_main);
        //mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //mAdapter = new adapter_custom_01(androidVersion);
        mAdapter = new adapter_custom_01(derp);
        mRecyclerView.setAdapter(mAdapter);

    }

    public void initList(ArrayList<AndroidVersion> derp){

        //AndroidVersion version = new AndroidVersion();

        for (int i = 0; i < 7 ;i++){

            AndroidVersion version = new AndroidVersion();
            version.setVersionName(androidVersion[i]);
            version.setVersionNumber(androidVersionNum[i]);
            derp.add(version);

        }

    }

}
