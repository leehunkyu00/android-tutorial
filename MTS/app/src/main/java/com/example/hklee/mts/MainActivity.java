package com.example.hklee.mts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_tabbar);

        // init tab
        TabHost tabHost1 = (TabHost)findViewById(R.id.tabHost1);
        tabHost1.setup();

        // add tab1
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.content1);
        ts1.setIndicator("TAB 1");
        tabHost1.addTab(ts1);

        // add tab2
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.content2);
        ts2.setIndicator("TAB 2");
        tabHost1.addTab(ts2);

        // add tab3
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.content3);
        ts3.setIndicator("TAB 3");
        tabHost1.addTab(ts3);

    }
}
