package com.example.student.a20180103_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        //wv.setWebChromeClient(new WebChromeClient()); 也可直接用chrome開
        wv.getSettings().setJavaScriptEnabled(true);    //JavaScript內建式關閉的，要打開，否則無法開Youtube
        wv.loadUrl("http://www.yahoo.co.jp");

        /* Chrome開的話，就可以用嵌入式語法，本案例中，在影片點"分享/嵌入，把iframe貼上DATA中"
        wv.setWebChromeClient(new WebChromeClient());
        wv.loadData("<iframe widsth=\"480\" height=\"300\" src=\"https://www.youtube.com/embed/lrvqjdMcjjQ\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>","text/html; charset=UTF-8",null);
        */
    }
}
