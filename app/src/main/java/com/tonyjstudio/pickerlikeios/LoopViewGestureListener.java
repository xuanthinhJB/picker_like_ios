package com.tonyjstudio.pickerlikeios;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Xuan Thinh Phan on 7/29/2018.
 */
final class LoopViewGestureListener extends GestureDetector.SimpleOnGestureListener{
    private final LoopView mLoopView;
    LoopViewGestureListener(LoopView loopView) {
        mLoopView = loopView;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        mLoopView.scrollBy(velocityY);
        return true;
    }
}
