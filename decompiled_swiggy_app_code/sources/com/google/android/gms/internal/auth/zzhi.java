package com.google.android.gms.internal.auth;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzhi extends zzeq<zzhi, zzhh> implements zzfr {
    /* access modifiers changed from: private */
    public static final zzhi zzb;
    private zzeu<String> zzd = zzeq.zzd();

    static {
        zzhi zzhi = new zzhi();
        zzb = zzhi;
        zzeq.zzi(zzhi.class, zzhi);
    }

    private zzhi() {
    }

    public static zzhi zzl(byte[] bArr) throws zzew {
        return (zzhi) zzeq.zzb(zzb, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeq.zzg(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        } else if (i12 == 3) {
            return new zzhi();
        } else {
            if (i12 == 4) {
                return new zzhh((zzhg) null);
            }
            if (i12 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List<String> zzm() {
        return this.zzd;
    }
}
