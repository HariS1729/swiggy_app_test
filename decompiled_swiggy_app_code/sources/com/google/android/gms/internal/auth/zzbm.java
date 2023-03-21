package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import zj.i;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzbm extends zzbd {
    final /* synthetic */ i zza;

    zzbm(zzbo zzbo, i iVar) {
        this.zza = iVar;
    }

    public final void zzb(ProxyResponse proxyResponse) throws RemoteException {
        TaskUtil.setResultOrApiException(new Status(proxyResponse.f37902a), proxyResponse, this.zza);
    }
}
