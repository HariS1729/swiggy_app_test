package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzbv implements Result {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) Preconditions.checkNotNull(status);
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zza = Status.RESULT_SUCCESS;
    }
}
