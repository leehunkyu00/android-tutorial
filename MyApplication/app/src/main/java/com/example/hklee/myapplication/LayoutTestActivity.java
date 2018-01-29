package com.example.hklee.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LayoutTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        // 추가할 뷰들에게 설정할 파라미터 생성
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        Button btn1 = new Button(this);
        btn1.setText("Button 01");
        btn1.setLayoutParams(params);

        Button btn2 = new Button(this);
        btn2.setText("Button 02");
        btn2.setLayoutParams(params1);

        TextView text1 = new TextView(this);
        text1.setText("textView");
        text1.setBackgroundColor(Color.YELLOW);
        text1.setLayoutParams(params);

        mainLayout.addView(btn2);
        mainLayout.addView(btn1);
        mainLayout.addView(text1);


        //setContentView(R.layout.activity_main);
        setContentView(mainLayout);
    }
}
