package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzag extends BaseImplementation.ApiMethodImpl<Result, zzam> {
    final /* synthetic */ Account zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzag(zzal zzal, Api api, GoogleApiClient googleApiClient, Account account) {
        super((Api<?>) api, googleApiClient);
        this.zza = account;
    }

    /* access modifiers changed from: protected */
    public final Result createFailedResult(Status status) {
        return new zzak(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((g) ((zzam) anyClient).getService()).K3(new zzaf(this), this.zza);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
