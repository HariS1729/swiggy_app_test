package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import bj.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
abstract class zzbi extends BaseImplementation.ApiMethodImpl<Object, zzbe> {
    public zzbi(GoogleApiClient googleApiClient) {
        super((Api<?>) b.f30822a, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new zzbu(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzbe zzbe = (zzbe) anyClient;
        zza(zzbe.getContext(), (zzbh) zzbe.getService());
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, zzbh zzbh) throws RemoteException;
}
