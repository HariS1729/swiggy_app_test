package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzgx extends zzgy {
    zzgx(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzj(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzi(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z11) {
        if (zzgz.zza) {
            zzgz.zzi(obj, j, z11);
        } else {
            zzgz.zzj(obj, j, z11);
        }
    }

    public final void zzd(Object obj, long j, double d11) {
        zzn(obj, j, Double.doubleToLongBits(d11));
    }

    public final void zze(Object obj, long j, float f11) {
        zzm(obj, j, Float.floatToIntBits(f11));
    }

    public final boolean zzf(Object obj, long j) {
        if (zzgz.zza) {
            return zzgz.zzq(obj, j);
        }
        return zzgz.zzr(obj, j);
    }
}
