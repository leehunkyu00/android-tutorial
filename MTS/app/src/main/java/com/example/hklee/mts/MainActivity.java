package com.example.hklee.mts;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class MainActivity extends mtsManager{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        // sample 2
        setContentView(R.layout.activity_sample2);
        TabHost tabhost = (TabHost)findViewById(R.id.tabHost);
        tabhost.setup();

        TabHost.TabSpec tabSpec = tabhost.newTabSpec("First tab");
        tabSpec.setContent(R.id.first_Tab);
        tabSpec.setIndicator("First Tab");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("Second tab");
        tabSpec.setContent(R.id.second_Tab);
        tabSpec.setIndicator("Second Tab");
        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec("Third tab");
        tabSpec.setContent(R.id.third_Tab);
        tabSpec.setIndicator("Third Tab");
        tabhost.addTab(tabSpec);
        */
        //setContentView(R.layout.activity_sample);

        IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1);    // first layout

        /*
        Button tabButton1 = (Button)findViewById(R.id.tabbutton1);
        tabButton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1, MainActivity.super.getApplicationContext());
            }
        });
        */
    }
}
