package com.tonyjstudio.pickerlikeios;


import android.os.Handler;
import android.os.Message;

/**
 * Created by Xuan Thinh Phan on 7/29/2018.
 */
public class MessageHandler extends Handler {
    public static final int WHAT_INVALIDATE_LOOP_VIEW = 1000;
    public static final int WHAT_SMOOTH_SCROLL = 2000;
    public static final int WHAT_ITEM_SELECTED = 3000;

    private final LoopView mLoopView;

    MessageHandler(LoopView loopView) {
        mLoopView = loopView;
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case WHAT_INVALIDATE_LOOP_VIEW:
                mLoopView.invalidate();
                break;
            case WHAT_SMOOTH_SCROLL:
                mLoopView.smoothScroll(LoopView.ACTION.FLING);
                break;
            case WHAT_ITEM_SELECTED:
                mLoopView.onItemSelected();
                break;
                default: break;
        }
    }
}
