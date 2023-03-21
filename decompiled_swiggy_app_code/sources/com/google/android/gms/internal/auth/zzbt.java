package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import gj.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzbt implements a {
    public final PendingResult<Object> getSpatulaHeader(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient);
        return googleApiClient.execute(new zzbs(this, googleApiClient));
    }

    public final PendingResult<Object> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        Preconditions.checkNotNull(googleApiClient);
        Preconditions.checkNotNull(proxyRequest);
        return googleApiClient.execute(new zzbq(this, googleApiClient, proxyRequest));
    }
}
