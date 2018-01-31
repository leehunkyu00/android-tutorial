package com.example.hklee.mts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by hklee on 2018. 1. 30..
 */

public class Tab3Activity extends mtsManager {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        System.out.println(" public class Tab3Activity extends mtsManager");
        setContentView(R.layout.activity_tab3);
        mtsManager.getMTSManager().init();
    }

    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(0,0);
    }
}
