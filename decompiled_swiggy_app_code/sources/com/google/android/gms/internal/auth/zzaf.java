package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    zzaf(zzag zzag) {
        this.zza = zzag;
    }

    public final void zzc(boolean z11) {
        this.zza.setResult(new zzak(z11 ? Status.RESULT_SUCCESS : zzal.zza));
    }
}
