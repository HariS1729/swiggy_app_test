package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.RemoteCall;
import zj.i;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final /* synthetic */ class zzr implements RemoteCall {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ Account zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzr(zzab zzab, Account account, String str, Bundle bundle) {
        this.zza = zzab;
        this.zzb = account;
        this.zzc = str;
        this.zzd = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzab, (i) obj2), this.zzb, this.zzc, this.zzd);
    }
}
