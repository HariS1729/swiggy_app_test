package com.google.android.gms.internal.p001authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbau  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
final class zbau extends zbx {
    final /* synthetic */ i zba;

    zbau(zbay zbay, i iVar) {
        this.zba = iVar;
    }

    public final void zbb(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, beginSignInResult, this.zba);
    }
}
