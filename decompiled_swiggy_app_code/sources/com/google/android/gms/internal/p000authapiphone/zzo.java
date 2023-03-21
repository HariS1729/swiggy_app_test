package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
final class zzo extends IStatusCallback.Stub {
    final /* synthetic */ i zza;

    zzo(zzr zzr, i iVar) {
        this.zza = iVar;
    }

    public final void onResult(Status status) {
        if (status.getStatusCode() == 6) {
            this.zza.d(ApiExceptionUtil.fromStatus(status));
        } else {
            TaskUtil.setResultOrApiException(status, this.zza);
        }
    }
}
