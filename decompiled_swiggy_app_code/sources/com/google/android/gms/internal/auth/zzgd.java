package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzgd {
    private static final Class<?> zza;
    private static final zzgp<?, ?> zzb = zzj(false);
    private static final zzgp<?, ?> zzc = zzj(true);
    private static final zzgp<?, ?> zzd = new zzgr();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgp<?, ?> zza() {
        return zzb;
    }

    public static zzgp<?, ?> zzb() {
        return zzc;
    }

    public static zzgp<?, ?> zzc() {
        return zzd;
    }

    static <UT, UB> UB zzd(int i11, List<Integer> list, zzet zzet, UB ub2, zzgp<UT, UB> zzgp) {
        if (zzet == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (zzet.zza()) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = zze(i11, intValue, ub2, zzgp);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
                return ub2;
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (!zzet.zza()) {
                    ub2 = zze(i11, intValue2, ub2, zzgp);
                    it2.remove();
                }
            }
        }
        return ub2;
    }

    static <UT, UB> UB zze(int i11, int i12, UB ub2, zzgp<UT, UB> zzgp) {
        if (ub2 == null) {
            ub2 = zzgp.zzc();
        }
        zzgp.zzd(ub2, i11, (long) i12);
        return ub2;
    }

    static <T, UT, UB> void zzf(zzgp<UT, UB> zzgp, T t, T t11) {
        zzgp.zzf(t, zzgp.zzb(zzgp.zza(t), zzgp.zza(t11)));
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzeq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzh(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void zzi(zzfl zzfl, T t, T t11, long j) {
        zzgz.zzp(t, j, zzfl.zza(zzgz.zzf(t, j), zzgz.zzf(t11, j)));
    }

    private static zzgp<?, ?> zzj(boolean z11) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgp) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z11)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
