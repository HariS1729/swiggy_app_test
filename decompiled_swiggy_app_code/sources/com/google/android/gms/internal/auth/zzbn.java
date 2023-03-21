package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzbn extends zzbd {
    final /* synthetic */ i zza;

    zzbn(zzbo zzbo, i iVar) {
        this.zza = iVar;
    }

    public final void zzc(String str) throws RemoteException {
        Status status;
        if (str != null) {
            status = Status.RESULT_SUCCESS;
        } else {
            status = new Status(3006);
        }
        TaskUtil.setResultOrApiException(status, str, this.zza);
    }
}
