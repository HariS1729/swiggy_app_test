package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbas  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
public final /* synthetic */ class zbas implements RemoteCall {
    public final /* synthetic */ zbay zba;
    public final /* synthetic */ GetSignInIntentRequest zbb;

    public /* synthetic */ zbas(zbay zbay, GetSignInIntentRequest getSignInIntentRequest) {
        this.zba = zbay;
        this.zbb = getSignInIntentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbay zbay = this.zba;
        GetSignInIntentRequest getSignInIntentRequest = this.zbb;
        ((zbai) ((zbaz) obj).getService()).zbe(new zbaw(zbay, (i) obj2), (GetSignInIntentRequest) Preconditions.checkNotNull(getSignInIntentRequest));
    }
}
