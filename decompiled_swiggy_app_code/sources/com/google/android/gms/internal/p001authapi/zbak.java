package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbak  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
public final /* synthetic */ class zbak implements RemoteCall {
    public final /* synthetic */ zbao zba;
    public final /* synthetic */ SavePasswordRequest zbb;

    public /* synthetic */ zbak(zbao zbao, SavePasswordRequest savePasswordRequest) {
        this.zba = zbao;
        this.zbb = savePasswordRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbao zbao = this.zba;
        SavePasswordRequest savePasswordRequest = this.zbb;
        ((zbz) ((zbw) obj).getService()).zbd(new zban(zbao, (i) obj2), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest));
    }
}
