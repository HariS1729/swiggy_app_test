package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import ej.b;

/* renamed from: com.google.android.gms.internal.auth-api.zbao  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
public final class zbao extends GoogleApi {
    private static final Api.ClientKey zba;
    private static final Api.AbstractClientBuilder zbb;
    private static final Api zbc;
    private final String zbd = zbbb.zba();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zba = clientKey;
        zbal zbal = new zbal();
        zbb = zbal;
        zbc = new Api("Auth.Api.Identity.CredentialSaving.API", zbal, clientKey);
    }

    public zbao(Activity activity, b bVar) {
        super(activity, zbc, bVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        SaveAccountLinkingTokenRequest.a H0 = SaveAccountLinkingTokenRequest.H0(saveAccountLinkingTokenRequest);
        H0.f(this.zbd);
        SaveAccountLinkingTokenRequest a11 = H0.a();
        return doRead(TaskApiCall.builder().setFeatures(zbba.zbg).run(new zbaj(this, a11)).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest.a e02 = SavePasswordRequest.e0(savePasswordRequest);
        e02.c(this.zbd);
        SavePasswordRequest a11 = e02.a();
        return doRead(TaskApiCall.builder().setFeatures(zbba.zbe).run(new zbak(this, a11)).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public zbao(Context context, b bVar) {
        super(context, zbc, bVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
