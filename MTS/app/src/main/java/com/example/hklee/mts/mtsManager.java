package com.example.hklee.mts;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hklee on 2018. 1. 31..
 */

public class mtsManager extends AppCompatActivity {

    private static AppCompatActivity sApplication;

    public static mtsManager getMTSManager() {
        return (mtsManager) sApplication;
    }

    public static Application getMTSsApplication() {
        return sApplication.getApplication();
    }

    public static Context getMTSContext() {
        return sApplication.getApplicationContext();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sApplication = this;
        System.out.println("mtsManager protected void onCreate(@Nullable Bundle savedInstanceState)");

        //setContentView(R.layout.bottomtab);
        //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1);    // first layout
        /*
        Button tabButton1 = (Button)findViewById(R.id.tabbutton1);
        tabButton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button1");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1);
            }
        });

        Button tabButton2 = (Button)findViewById(R.id.tabbutton2);
        tabButton2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button2");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB2, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB2);
            }
        });

        Button tabButton3 = (Button)findViewById(R.id.tabbutton3);
        tabButton3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button3");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB3, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB3);
            }
        });

        Button tabButton4 = (Button)findViewById(R.id.tabbutton4);
        tabButton4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button4");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB4, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB4);
            }
        });
        */
    }

    public void init() {
        Button tabButton1 = (Button)findViewById(R.id.tabbutton1);
        tabButton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button1");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB1);
            }
        });

        Button tabButton2 = (Button)findViewById(R.id.tabbutton2);
        tabButton2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button2");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB2, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB2);
            }
        });

        Button tabButton3 = (Button)findViewById(R.id.tabbutton3);
        tabButton3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button3");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB3, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB3);
            }
        });

        Button tabButton4 = (Button)findViewById(R.id.tabbutton4);
        tabButton4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onClick tab button4");
                //IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB4, mtsManager.super.getApplicationContext());
                IntentManager.getInstance().changeActivity(IntentManager.ActivityType.TAB4);
            }
        });
    }
}
