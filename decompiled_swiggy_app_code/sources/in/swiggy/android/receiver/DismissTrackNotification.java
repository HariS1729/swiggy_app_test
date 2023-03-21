package in.swiggy.android.receiver;

import android.content.Context;
import android.content.Intent;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.SwiggyApplication;
import in.swiggy.android.mvvm.base.SwiggyBaseBroadcastReceiver;
import in.swiggy.android.services.TrackNotificationService;
import j3.b;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DismissTrackNotification.kt */
public final class DismissTrackNotification extends SwiggyBaseBroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18513a = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final String f18514b = DismissTrackNotification.class.getSimpleName();

    /* compiled from: DismissTrackNotification.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public void onReceive(Context context, Intent intent) {
        p.j(context, LogCategory.CONTEXT);
        p.j(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type in.swiggy.android.SwiggyApplication");
        ((SwiggyApplication) applicationContext).I().R(this);
        b.a(context).edit().putBoolean("track_notification_dismissed", true).apply();
        b.a(context).edit().remove("track_notification_order").apply();
        b.a(context).edit().remove("track_notification_order_id").apply();
        TrackNotificationService.f18680l.o(context);
    }
}
