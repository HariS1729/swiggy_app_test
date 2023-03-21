package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
class zzdz extends zzdy {
    protected final byte[] zza;

    zzdz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeb) || zzd() != ((zzeb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return obj.equals(this);
        }
        zzdz zzdz = (zzdz) obj;
        int zzj = zzj();
        int zzj2 = zzdz.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzdz.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzd <= zzdz.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzdz.zza;
            zzdz.zzc();
            int i11 = 0;
            int i12 = 0;
            while (i11 < zzd) {
                if (bArr[i11] != bArr2[i12]) {
                    return false;
                }
                i11++;
                i12++;
            }
            return true;
        } else {
            int zzd3 = zzdz.zzd();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(zzd);
            sb3.append(", ");
            sb3.append(zzd3);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public byte zza(int i11) {
        return this.zza[i11];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i11) {
        return this.zza[i11];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public final int zze(int i11, int i12, int i13) {
        return zzev.zzd(i11, this.zza, 0, i13);
    }

    public final zzeb zzf(int i11, int i12) {
        int zzi = zzeb.zzi(0, i12, zzd());
        if (zzi == 0) {
            return zzeb.zzb;
        }
        return new zzdw(this.zza, 0, zzi);
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final boolean zzh() {
        return zzhd.zzd(this.zza, 0, zzd());
    }
}
