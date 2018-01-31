package com.example.hklee.mts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by hklee on 2018. 1. 30..
 */

public class IntentManager {

    public enum ActivityType {
        TAB1, TAB2, TAB3, TAB4
    }

    private static IntentManager m_instance = new IntentManager();

    private IntentManager() {
    }

    static IntentManager getInstance() {
        return m_instance;
    }

    //void changeActivity(ActivityType activityType, Context ctx) {
    void changeActivity(ActivityType activityType) {

        Intent intent = null;
        Context mtsContext = mtsManager.getMTSContext();

        switch (activityType) {
            case TAB1:
                //intent = new Intent(ctx, Tab1Activity.class);
                intent = new Intent(mtsContext, Tab1Activity.class);
                break;
            case TAB2:
                //intent = new Intent(ctx, Tab2Activity.class);
                intent = new Intent(mtsContext, Tab2Activity.class);
                break;
            case TAB3:
                //intent = new Intent(ctx, Tab3Activity.class);
                intent = new Intent(mtsContext, Tab3Activity.class);
                break;
            case TAB4:
                //intent = new Intent(ctx, Tab4Activity.class);
                intent = new Intent(mtsContext, Tab4Activity.class);
                break;
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        if (intent == null) {
            System.out.println("[error] Intent is null");
            return;
        }
        mtsContext.startActivity(intent);
    }
}
