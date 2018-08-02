package com.tonyjstudio.pickerlikeios;

/**
 * Created by Xuan Thinh Phan on 7/29/2018.
 */
public class OnItemSelectedRunnable implements Runnable{
    private final LoopView loopView;

    OnItemSelectedRunnable(LoopView loopview) {
        loopView = loopview;
    }

    @Override
    public final void run() {
        loopView.onItemSelectedListener.onItemSelected(loopView.getSelectedItem());
    }
}
