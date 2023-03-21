package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbax  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
final class zbax extends zbaa {
    final /* synthetic */ i zba;

    zbax(zbay zbay, i iVar) {
        this.zba = iVar;
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zba);
    }
}
