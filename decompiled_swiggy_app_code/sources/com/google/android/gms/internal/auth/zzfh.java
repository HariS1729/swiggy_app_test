package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzfh implements zzfo {
    private final zzfo[] zza;

    zzfh(zzfo... zzfoArr) {
        this.zza = zzfoArr;
    }

    public final zzfn zzb(Class<?> cls) {
        zzfo[] zzfoArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            zzfo zzfo = zzfoArr[i11];
            if (zzfo.zzc(cls)) {
                return zzfo.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean zzc(Class<?> cls) {
        zzfo[] zzfoArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzfoArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
