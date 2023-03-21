package in.swiggy.android.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppIndexingUpdateReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            "com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction());
        }
    }
}
