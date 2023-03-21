package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.a;
import com.google.android.gms.auth.account.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzal implements b {
    /* access modifiers changed from: private */
    public static final Status zza = new Status(13);

    public final PendingResult<Object> addWorkAccount(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.execute(new zzae(this, a.f37729a, googleApiClient, str));
    }

    public final PendingResult<Result> removeWorkAccount(GoogleApiClient googleApiClient, Account account) {
        return googleApiClient.execute(new zzag(this, a.f37729a, googleApiClient, account));
    }

    public final void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean z11) {
        setWorkAuthenticatorEnabledWithResult(googleApiClient, z11);
    }

    public final PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean z11) {
        return googleApiClient.execute(new zzac(this, a.f37729a, googleApiClient, z11));
    }
}
