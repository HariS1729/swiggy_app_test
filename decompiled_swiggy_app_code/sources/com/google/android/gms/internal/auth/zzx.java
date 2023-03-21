package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import zj.i;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzx extends IStatusCallback.Stub {
    final /* synthetic */ i zza;

    zzx(zzab zzab, i iVar) {
        this.zza = iVar;
    }

    public final void onResult(Status status) {
        zzab.zzf(status, (Object) null, this.zza);
    }
}
