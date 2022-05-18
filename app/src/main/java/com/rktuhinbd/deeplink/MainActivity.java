package com.rktuhinbd.deeplink;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.progressindicator.CircularProgressIndicator;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = findViewById(R.id.progressBar);

        if (getIntent() != null && getIntent().getData() != null) {
            Uri deepLinkUri = getIntent().getData();
            Log.d(TAG, "DeepLinkUrl : " + deepLinkUri);
            progressBar.setVisibility(View.GONE);
            DeepLinkManager.openDeepLink(this, deepLinkUri);
        } else {
            Log.wtf(TAG, "Deep Link is not triggered!");
        }
    }
}