package com.mjh.screendpi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        int flag= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        //获得当前窗体对象
        Window window=MainActivity.this.getWindow();
        //设置当前窗体为全屏显示
        window.setFlags(flag, flag);
        setContentView(R.layout.activity_main);
        mLayout = (LinearLayout) findViewById(R.id.layout);
        mLayout.addView(getButton("density: " + getResources().getDisplayMetrics().density));
        mLayout.addView(getButton("densityDpi: " + getResources().getDisplayMetrics().densityDpi));
        mLayout.addView(getButton("scaledDensity: " + getResources().getDisplayMetrics().scaledDensity));
        mLayout.addView(getButton("heightPixels: " + getResources().getDisplayMetrics().heightPixels));
        mLayout.addView(getButton("widthPixels: " + getResources().getDisplayMetrics().widthPixels));
        mLayout.addView(getButton("xdpi: " + getResources().getDisplayMetrics().xdpi));
        mLayout.addView(getButton("ydpi: " + getResources().getDisplayMetrics().ydpi));
    }

    private Button getButton(String text){
        Button button = new Button(this);
        button.setText(text);
        return button;
    }
}
