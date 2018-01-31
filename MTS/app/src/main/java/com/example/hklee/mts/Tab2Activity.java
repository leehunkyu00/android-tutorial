package com.example.hklee.mts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by hklee on 2018. 1. 30..
 */

public class Tab2Activity extends mtsManager {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.activity_tab2);
        mtsManager.getMTSManager().init();
    }
}
