package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzed extends zzee {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = Integer.MAX_VALUE;

    /* synthetic */ zzed(byte[] bArr, int i11, int i12, boolean z11, zzec zzec) {
        super((zzec) null);
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i11) throws zzew {
        int i12 = this.zze;
        this.zze = 0;
        int i13 = this.zzc + this.zzd;
        this.zzc = i13;
        if (i13 > 0) {
            this.zzd = i13;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i12;
    }
}
