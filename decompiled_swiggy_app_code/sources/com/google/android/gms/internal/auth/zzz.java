package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import zj.i;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzz extends zzl {
    final /* synthetic */ i zza;

    zzz(zzab zzab, i iVar) {
        this.zza = iVar;
    }

    public final void zzb(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        zzab.zzf(status, accountChangeEventsResponse, this.zza);
    }
}
