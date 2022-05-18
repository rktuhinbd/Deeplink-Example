package com.rktuhinbd.deeplink;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Toast.makeText(this, "Deeplink triggered!", Toast.LENGTH_LONG).show();

        String webUri = getIntent().getStringExtra("URI");

        if (webUri != null && !webUri.isEmpty()) {
            WebView myWebView = findViewById(R.id.webView);
            myWebView.clearCache(true);
            myWebView.clearHistory();
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            myWebView.loadUrl(webUri);
        } else {
            Toast.makeText(this, "Invalid web url!", Toast.LENGTH_LONG).show();
        }
    }
}