package in.swiggy.android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import in.swiggy.android.activities.OrderDetailsActivity;

/* compiled from: OrderDetailsReceiver.kt */
public final class OrderDetailsReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        OrderDetailsActivity.a aVar = OrderDetailsActivity.D;
        String str = "";
        if (!(intent == null || (stringExtra = intent.getStringExtra("order_id")) == null)) {
            str = stringExtra;
        }
        aVar.d(context, str);
    }
}
