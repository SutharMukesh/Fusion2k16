package com.example.root.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
 private WebView we;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //WebView webView=new WebView(this);
        setContentView(R.layout.activity_web);
        we = (WebView) findViewById(R.id.webview);
        WebSettings webSettings=we.getSettings();
        webSettings.setJavaScriptEnabled(true);
       we.setWebViewClient(new MyBrowser());
        we.loadUrl("https://nirmalsaini.typeform.com/to/FiWIdw");
     //   Uri uri =Uri.parse("www.google.com");
       // Intent intent=new Intent(Intent.ACTION_VIEW,uri);
    //    startActivity(intent);
    }

}
 class MyBrowser extends WebViewClient {
    @Override
    public  boolean shouldOverrideUrlLoading(WebView view, String url ){
        view.loadUrl(url);
        return true;
    }};

