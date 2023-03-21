package com.google.android.gms.internal.p001authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbam  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
final class zbam extends zbae {
    final /* synthetic */ i zba;

    zbam(zbao zbao, i iVar) {
        this.zba = iVar;
    }

    public final void zbb(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws RemoteException {
        if (status.isSuccess()) {
            this.zba.c(saveAccountLinkingTokenResult);
        } else {
            this.zba.b(ApiExceptionUtil.fromStatus(status));
        }
    }
}
