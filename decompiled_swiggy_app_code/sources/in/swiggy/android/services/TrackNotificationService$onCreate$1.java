package in.swiggy.android.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: TrackNotificationService.kt */
public final class TrackNotificationService$onCreate$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TrackNotificationService f18693a;

    TrackNotificationService$onCreate$1(TrackNotificationService trackNotificationService) {
        this.f18693a = trackNotificationService;
    }

    public void onReceive(Context context, Intent intent) {
        p.j(context, LogCategory.CONTEXT);
        p.j(intent, "intent");
        if (this.f18693a.f18688i != null) {
            TrackNotificationService trackNotificationService = this.f18693a;
            trackNotificationService.u(trackNotificationService.f18688i);
        }
    }
}
