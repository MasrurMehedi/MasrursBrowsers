package com.example.masror_mehedi.masrursbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.security.PublicKey;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webview);
        String getUrl = getIntent().getExtras().getString("url");

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true); // for enable js in web
        webView.getSettings().setBuiltInZoomControls(true); //for zoom
        webView.loadUrl("http://" + getUrl);
    }


        //for backpress
        public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode ==KeyEvent.KEYCODE_BACK && webView.canGoBack())
        {
            webView.goBack();
            return true;
        }
        return  super.onKeyDown(keyCode,event);

    }


    }

