package com.app.playtolife.remington;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Email extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("https://www.gmail.com/");
    }
}
