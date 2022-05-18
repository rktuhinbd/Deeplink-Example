package com.rktuhinbd.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class DeepLinkManager {

    public static void openDeepLink(Activity activity, Uri uri) {
        Intent intent = new Intent(activity, WebViewActivity.class);
        intent.putExtra("URI", uri.toString());
        activity.startActivity(intent);
    }
}
