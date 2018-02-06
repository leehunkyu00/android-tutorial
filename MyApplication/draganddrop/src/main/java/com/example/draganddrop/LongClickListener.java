package com.example.draganddrop;

import android.content.ClipData;
import android.content.ClipDescription;
import android.view.View;

/**
 * Created by hklee on 2018. 2. 6..
 */

public class LongClickListener implements View.OnLongClickListener {
    @Override
    public boolean onLongClick(View view) {

        ClipData.Item item = new ClipData.Item((CharSequence) view.getTag());

        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
        ClipData data = new ClipData(view.getTag().toString(),
                mimeTypes, item);
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);

        view.startDrag(data,
                shadowBuilder,
                view,
                0
        );

        view.setVisibility(View.INVISIBLE);

        return true;
    }
}
