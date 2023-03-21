package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import dj.b;

/* renamed from: com.google.android.gms.internal.auth-api.zbe  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
public final class zbe implements b {
    private final Status zba;
    private final Credential zbb;

    public zbe(Status status, Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    public final Credential getCredential() {
        return this.zbb;
    }

    public final Status getStatus() {
        return this.zba;
    }
}
