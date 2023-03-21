package com.google.android.gms.internal.p001authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbav  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
final class zbav extends IStatusCallback.Stub {
    final /* synthetic */ i zba;

    zbav(zbay zbay, i iVar) {
        this.zba = iVar;
    }

    public final void onResult(Status status) throws RemoteException {
        TaskUtil.setResultOrApiException(status, this.zba);
    }
}
