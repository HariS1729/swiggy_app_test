package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
final class zzq extends zzf {
    final /* synthetic */ i zza;

    zzq(zzr zzr, i iVar) {
        this.zza = iVar;
    }

    public final void zzb(Status status, boolean z11) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z11), this.zza);
    }
}
