package com.kai.ling.androidoptimize;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

public class LayoutOptimizeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_optimize);
        findViewById(R.id.tv_view_stub).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_view_stub:
                ViewStub viewStubCompat = findViewById(R.id.view_stub);
                viewStubCompat.inflate();
                break;
        }
    }
}
