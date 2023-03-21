package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzek;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzel<T extends zzek<T>> {
    private static final zzel zzb = new zzel(true);
    final zzgl<T, Object> zza = new zzge(16);
    private boolean zzc;
    private boolean zzd;

    private zzel() {
    }

    public static <T extends zzek<T>> zzel<T> zza() {
        throw null;
    }

    private static final void zzd(T t, Object obj) {
        boolean z11;
        zzhe zzb2 = t.zzb();
        zzev.zze(obj);
        zzhe zzhe = zzhe.DOUBLE;
        zzhf zzhf = zzhf.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z11 = obj instanceof Integer;
                break;
            case 1:
                z11 = obj instanceof Long;
                break;
            case 2:
                z11 = obj instanceof Float;
                break;
            case 3:
                z11 = obj instanceof Double;
                break;
            case 4:
                z11 = obj instanceof Boolean;
                break;
            case 5:
                z11 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzeb) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzes)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzfq) || (obj instanceof zzex)) {
                    return;
                }
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzel zzel = new zzel();
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            Map.Entry<T, Object> zzg = this.zza.zzg(i11);
            zzel.zzc((zzek) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry next : this.zza.zzc()) {
            zzel.zzc((zzek) next.getKey(), next.getValue());
        }
        zzel.zzd = this.zzd;
        return zzel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzel)) {
            return false;
        }
        return this.zza.equals(((zzel) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(T t, Object obj) {
        if (!t.zzc()) {
            zzd(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzd(t, arrayList.get(i11));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzex) {
            this.zzd = true;
        }
        this.zza.put(t, obj);
    }

    private zzel(boolean z11) {
        zzb();
        zzb();
    }
}
