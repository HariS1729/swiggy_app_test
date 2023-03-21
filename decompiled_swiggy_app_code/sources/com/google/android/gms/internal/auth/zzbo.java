package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import bj.b;
import bj.c;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzbo extends GoogleApi<c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Activity activity, c cVar) {
        super(activity, b.f30822a, cVar == null ? c.f30826b : cVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(TaskApiCall.builder().run(new zzbk(this)).setMethodKey(1520).build());
    }

    public final Task<ProxyResponse> performProxyRequest(ProxyRequest proxyRequest) {
        return doWrite(TaskApiCall.builder().run(new zzbl(this, proxyRequest)).setMethodKey(1518).build());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Context context, c cVar) {
        super(context, b.f30822a, cVar == null ? c.f30826b : cVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
