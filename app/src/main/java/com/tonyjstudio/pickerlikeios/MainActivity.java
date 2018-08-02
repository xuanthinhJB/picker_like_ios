package com.tonyjstudio.pickerlikeios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LoopView loopView = findViewById(R.id.loop_view);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add("item " + i);
        }

        loopView.setItems(list);
        loopView.setInitPosition(0);
    }
}
