package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbaj  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
public final /* synthetic */ class zbaj implements RemoteCall {
    public final /* synthetic */ zbao zba;
    public final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbaj(zbao zbao, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbao;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbao zbao = this.zba;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.zbb;
        ((zbz) ((zbw) obj).getService()).zbc(new zbam(zbao, (i) obj2), (SaveAccountLinkingTokenRequest) Preconditions.checkNotNull(saveAccountLinkingTokenRequest));
    }
}
