package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzac extends BaseImplementation.ApiMethodImpl<Result, zzam> {
    final /* synthetic */ boolean zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzac(zzal zzal, Api api, GoogleApiClient googleApiClient, boolean z11) {
        super((Api<?>) api, googleApiClient);
        this.zza = z11;
    }

    /* access modifiers changed from: protected */
    public final Result createFailedResult(Status status) {
        return new zzaj(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((g) ((zzam) anyClient).getService()).j0(this.zza);
        setResult(new zzaj(Status.RESULT_SUCCESS));
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
