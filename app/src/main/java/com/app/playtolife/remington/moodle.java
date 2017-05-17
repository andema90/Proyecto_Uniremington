package com.app.playtolife.remington;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class moodle extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle);

        webView = (WebView)findViewById(R.id.moodle);
        webView.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/");
    }
}
