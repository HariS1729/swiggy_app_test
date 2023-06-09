package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzcx {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzdd<Context, Boolean> zzi;

    public zzcx(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzdd<Context, Boolean>) null);
    }

    private zzcx(String str, Uri uri, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, zzdd<Context, Boolean> zzdd) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z11;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcx zza() {
        if (this.zzc.isEmpty()) {
            return new zzcx((String) null, this.zzb, this.zzc, this.zzd, true, false, false, false, (zzdd<Context, Boolean>) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzcz<Double> zzb(String str, double d11) {
        return new zzcv(this, str, Double.valueOf(0.0d), true);
    }

    public final zzcz<Long> zzc(String str, long j) {
        return new zzct(this, str, Long.valueOf(j), true);
    }

    public final zzcz<Boolean> zzd(String str, boolean z11) {
        return new zzcu(this, str, Boolean.valueOf(z11), true);
    }

    public final <T> zzcz<T> zze(String str, T t, zzhl zzhl) {
        return new zzcw(this, "getTokenRefactor__blocked_packages", t, true, zzhl, (byte[]) null);
    }
}
