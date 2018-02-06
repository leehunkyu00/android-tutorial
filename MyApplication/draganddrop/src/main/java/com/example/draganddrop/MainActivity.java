package com.example.draganddrop;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mImg;
    private static final String IMAGEVIEW_TAG = "ic_launcher.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_and_drop);

        mImg = (ImageView)findViewById(R.id.image);
        mImg.setTag(IMAGEVIEW_TAG);

        mImg.setOnLongClickListener(new LongClickListener());

        findViewById(R.id.toplinear).setOnDragListener(new DragListener());
        findViewById(R.id.bottomlinear).setOnDragListener(new DragListener());
    }

    class DragListener implements View.OnDragListener {
        Drawable normalShape = getResources().getDrawable(R.drawable.normal_shape);
        Drawable targetShape = getResources().getDrawable(R.drawable.target_shape);

        @Override
        public boolean onDrag(View view, DragEvent dragEvent) {

            switch (dragEvent.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.d("DragClickListener", "ACTION_DRAG_STARTED");
                    break;

                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.d("DragClickListener", "ACTION_DRAG_ENTERED");
                    view.setBackground(targetShape);
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    Log.d("DragClickListener", "ACTION_DRAG_EXITED");
                    view.setBackground(normalShape);
                    break;

                case DragEvent.ACTION_DROP:
                    Log.d("DragClickListener", "ACTION_DROP");

                    if (view == findViewById(R.id.bottomlinear)) {
                        View targetView = (View) dragEvent.getLocalState();
                        ViewGroup viewGroup = (ViewGroup)targetView.getParent();
                        viewGroup.removeView(targetView);

                        // change the text
                        TextView text = (TextView)view.findViewById(R.id.text);
                        text.setText("Drop the image");

                        LinearLayout containView = (LinearLayout)view;
                        containView.addView(targetView);
                        targetView.setVisibility(targetView.VISIBLE);

                    } else if (view == findViewById(R.id.toplinear)) {
                        View targetView = (View)dragEvent.getLocalState();
                        ViewGroup viewGroup = (ViewGroup)targetView.getParent();
                        viewGroup.removeView(targetView);

                        LinearLayout containView = (LinearLayout) view;
                        containView.addView(targetView);
                        targetView.setVisibility(targetView.VISIBLE);
                    } else {
                        View targetView = (View)dragEvent.getLocalState();
                        targetView.setVisibility(View.VISIBLE);
                        Context context = getApplicationContext();
                        Toast.makeText(context,
                                "이미지를 다른 지역에 드랍할 수 없습니다",
                                Toast.LENGTH_LONG).show();
                    }
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    Log.d("DragClickListener", "ACTION_DRAG_ENDED");
                    view.setBackground(normalShape);
                    break;
                default:
                    break;
            }
            return true;
        }
    }

}
