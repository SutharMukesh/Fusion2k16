package com.example.root.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Visitweb extends AppCompatActivity {
    private WebView we;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //WebView webView=new WebView(this);
        setContentView(R.layout.activity_visitweb);
        we = (WebView) findViewById(R.id.webview);
        WebSettings webSettings=we.getSettings();
        webSettings.setJavaScriptEnabled(true);
        we.loadUrl("http://pvppfusion.pvppcoe.ac.in/");
        //   Uri uri =Uri.parse("www.google.com");
        // Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        //    startActivity(intent);
    }

}


