package com.google.android.gms.internal.auth;

import java.io.IOException;
import org.apache.fontbox.ttf.GlyfDescript;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzdq {
    static int zza(byte[] bArr, int i11, zzdp zzdp) throws zzew {
        int zzj = zzj(bArr, i11, zzdp);
        int i12 = zzdp.zza;
        if (i12 < 0) {
            throw zzew.zzc();
        } else if (i12 > bArr.length - zzj) {
            throw zzew.zzf();
        } else if (i12 == 0) {
            zzdp.zzc = zzeb.zzb;
            return zzj;
        } else {
            zzdp.zzc = zzeb.zzk(bArr, zzj, i12);
            return zzj + i12;
        }
    }

    static int zzb(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << GlyfDescript.X_DUAL);
    }

    static int zzc(zzgb zzgb, byte[] bArr, int i11, int i12, int i13, zzdp zzdp) throws IOException {
        zzft zzft = (zzft) zzgb;
        Object zzd = zzft.zzd();
        int zzb = zzft.zzb(zzd, bArr, i11, i12, i13, zzdp);
        zzft.zze(zzd);
        zzdp.zzc = zzd;
        return zzb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzd(com.google.android.gms.internal.auth.zzgb r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.auth.zzdp r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zzd()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzg(r1, r2, r3, r4, r5)
            r6.zze(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.auth.zzew r6 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdq.zzd(com.google.android.gms.internal.auth.zzgb, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    static int zze(zzgb<?> zzgb, int i11, byte[] bArr, int i12, int i13, zzeu<?> zzeu, zzdp zzdp) throws IOException {
        int zzd = zzd(zzgb, bArr, i12, i13, zzdp);
        zzeu.add(zzdp.zzc);
        while (zzd < i13) {
            int zzj = zzj(bArr, zzd, zzdp);
            if (i11 != zzdp.zza) {
                break;
            }
            zzd = zzd(zzgb, bArr, zzj, i13, zzdp);
            zzeu.add(zzdp.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i11, zzeu<?> zzeu, zzdp zzdp) throws IOException {
        zzer zzer = (zzer) zzeu;
        int zzj = zzj(bArr, i11, zzdp);
        int i12 = zzdp.zza + zzj;
        while (zzj < i12) {
            zzj = zzj(bArr, zzj, zzdp);
            zzer.zze(zzdp.zza);
        }
        if (zzj == i12) {
            return zzj;
        }
        throw zzew.zzf();
    }

    static int zzg(byte[] bArr, int i11, zzdp zzdp) throws zzew {
        int zzj = zzj(bArr, i11, zzdp);
        int i12 = zzdp.zza;
        if (i12 < 0) {
            throw zzew.zzc();
        } else if (i12 == 0) {
            zzdp.zzc = "";
            return zzj;
        } else {
            zzdp.zzc = new String(bArr, zzj, i12, zzev.zza);
            return zzj + i12;
        }
    }

    static int zzh(byte[] bArr, int i11, zzdp zzdp) throws zzew {
        int zzj = zzj(bArr, i11, zzdp);
        int i12 = zzdp.zza;
        if (i12 < 0) {
            throw zzew.zzc();
        } else if (i12 == 0) {
            zzdp.zzc = "";
            return zzj;
        } else {
            zzdp.zzc = zzhd.zzb(bArr, zzj, i12);
            return zzj + i12;
        }
    }

    static int zzi(int i11, byte[] bArr, int i12, int i13, zzgq zzgq, zzdp zzdp) throws zzew {
        if ((i11 >>> 3) != 0) {
            int i14 = i11 & 7;
            if (i14 == 0) {
                int zzm = zzm(bArr, i12, zzdp);
                zzgq.zzf(i11, Long.valueOf(zzdp.zzb));
                return zzm;
            } else if (i14 == 1) {
                zzgq.zzf(i11, Long.valueOf(zzn(bArr, i12)));
                return i12 + 8;
            } else if (i14 == 2) {
                int zzj = zzj(bArr, i12, zzdp);
                int i15 = zzdp.zza;
                if (i15 < 0) {
                    throw zzew.zzc();
                } else if (i15 <= bArr.length - zzj) {
                    if (i15 == 0) {
                        zzgq.zzf(i11, zzeb.zzb);
                    } else {
                        zzgq.zzf(i11, zzeb.zzk(bArr, zzj, i15));
                    }
                    return zzj + i15;
                } else {
                    throw zzew.zzf();
                }
            } else if (i14 == 3) {
                int i16 = (i11 & -8) | 4;
                zzgq zzc = zzgq.zzc();
                int i17 = 0;
                while (true) {
                    if (i12 >= i13) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i12, zzdp);
                    int i18 = zzdp.zza;
                    if (i18 == i16) {
                        i17 = i18;
                        i12 = zzj2;
                        break;
                    }
                    i17 = i18;
                    i12 = zzi(i18, bArr, zzj2, i13, zzc, zzdp);
                }
                if (i12 > i13 || i17 != i16) {
                    throw zzew.zzd();
                }
                zzgq.zzf(i11, zzc);
                return i12;
            } else if (i14 == 5) {
                zzgq.zzf(i11, Integer.valueOf(zzb(bArr, i12)));
                return i12 + 4;
            } else {
                throw zzew.zza();
            }
        } else {
            throw zzew.zza();
        }
    }

    static int zzj(byte[] bArr, int i11, zzdp zzdp) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzk(b11, bArr, i12, zzdp);
        }
        zzdp.zza = b11;
        return i12;
    }

    static int zzk(int i11, byte[] bArr, int i12, zzdp zzdp) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdp.zza = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzdp.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzdp.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i18 + 1;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzdp.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] < 0) {
                i21 = i23;
            } else {
                zzdp.zza = i22;
                return i23;
            }
        }
    }

    static int zzl(int i11, byte[] bArr, int i12, int i13, zzeu<?> zzeu, zzdp zzdp) {
        zzer zzer = (zzer) zzeu;
        int zzj = zzj(bArr, i12, zzdp);
        zzer.zze(zzdp.zza);
        while (zzj < i13) {
            int zzj2 = zzj(bArr, zzj, zzdp);
            if (i11 != zzdp.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdp);
            zzer.zze(zzdp.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i11, zzdp zzdp) {
        int i12 = i11 + 1;
        long j = (long) bArr[i11];
        if (j < 0) {
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            long j11 = (j & 127) | (((long) (b11 & Byte.MAX_VALUE)) << 7);
            int i14 = 7;
            while (b11 < 0) {
                int i15 = i13 + 1;
                byte b12 = bArr[i13];
                i14 += 7;
                j11 |= ((long) (b12 & Byte.MAX_VALUE)) << i14;
                int i16 = i15;
                b11 = b12;
                i13 = i16;
            }
            zzdp.zzb = j11;
            return i13;
        }
        zzdp.zzb = j;
        return i12;
    }

    static long zzn(byte[] bArr, int i11) {
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }
}
