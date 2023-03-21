package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
abstract class zzgy {
    final Unsafe zza;

    zzgy(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j);

    public abstract float zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z11);

    public abstract void zzd(Object obj, long j, double d11);

    public abstract void zze(Object obj, long j, float f11);

    public abstract boolean zzf(Object obj, long j);

    public final int zzg(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(Object obj, long j) {
        return this.zza.getInt(obj, j);
    }

    public final long zzj(Object obj, long j) {
        return this.zza.getLong(obj, j);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object obj, long j) {
        return this.zza.getObject(obj, j);
    }

    public final void zzm(Object obj, long j, int i11) {
        this.zza.putInt(obj, j, i11);
    }

    public final void zzn(Object obj, long j, long j11) {
        this.zza.putLong(obj, j, j11);
    }

    public final void zzo(Object obj, long j, Object obj2) {
        this.zza.putObject(obj, j, obj2);
    }
}
