package com.tonyjstudio.pickerlikeios;

/**
 * Created by Xuan Thinh Phan on 7/29/2018.
 */
public class SmoothScrollTimerTask implements Runnable {
    private int realTotalOffset;
    private int realOffset;
    private int offset;
    private final LoopView mLoopView;

    SmoothScrollTimerTask(LoopView loopView, int offset) {
        this.mLoopView = loopView;
        this.offset = offset;
        realTotalOffset = Integer.MAX_VALUE;
        realOffset = 0;
    }

    @Override
    public void run() {
        if (realTotalOffset == Integer.MAX_VALUE) {
            realTotalOffset = offset;
        }
        realOffset = (int) ((float) realTotalOffset * 0.1F);

        if (realOffset == 0) {
            if (realTotalOffset < 0) {
                realOffset = -1;
            } else {
                realOffset = 1;
            }
        }
        if (Math.abs(realTotalOffset) <= 0) {
            mLoopView.cancelFuture();
            mLoopView.handler.sendEmptyMessage(MessageHandler.WHAT_ITEM_SELECTED);
        } else {
            mLoopView.totalScrollY = mLoopView.totalScrollY + realOffset;
            mLoopView.handler.sendEmptyMessage(MessageHandler.WHAT_INVALIDATE_LOOP_VIEW);
            realTotalOffset = realTotalOffset - realOffset;
        }
    }
}
