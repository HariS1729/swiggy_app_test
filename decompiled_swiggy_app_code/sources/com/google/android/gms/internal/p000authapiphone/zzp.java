package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzp  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
final class zzp extends zzd {
    final /* synthetic */ i zza;

    zzp(zzr zzr, i iVar) {
        this.zza = iVar;
    }

    public final void zzb(Status status, int i11) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i11), this.zza);
    }
}
