package com.google.android.gms.internal.auth;

import com.newrelic.mobile.fbs.Platform;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzha {
    static /* synthetic */ void zza(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws zzew {
        if (zze(b12) || (((b11 << 28) + (b12 + 112)) >> 30) != 0 || zze(b13) || zze(b14)) {
            throw zzew.zzb();
        }
        byte b15 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
        cArr[i11] = (char) ((b15 >>> 10) + 55232);
        cArr[i11 + 1] = (char) ((b15 & 1023) + Platform.Android);
    }

    static /* synthetic */ void zzb(byte b11, byte b12, char[] cArr, int i11) throws zzew {
        if (b11 < -62 || zze(b12)) {
            throw zzew.zzb();
        }
        cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
    }

    static /* synthetic */ void zzc(byte b11, byte b12, byte b13, char[] cArr, int i11) throws zzew {
        if (!zze(b12)) {
            if (b11 == -32) {
                if (b12 >= -96) {
                    b11 = -32;
                }
            }
            if (b11 == -19) {
                if (b12 < -96) {
                    b11 = -19;
                }
            }
            if (!zze(b13)) {
                cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
                return;
            }
        }
        throw zzew.zzb();
    }

    static /* synthetic */ boolean zzd(byte b11) {
        return b11 >= 0;
    }

    private static boolean zze(byte b11) {
        return b11 > -65;
    }
}
