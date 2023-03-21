package com.google.android.gms.internal.auth;

import in.swiggy.android.tejas.network.HttpRequest;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.pdfbox.pdfparser.BaseParser;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzev {
    static final Charset zza = Charset.forName(HttpRequest.CHARSET_UTF8);
    static final Charset zzb = Charset.forName(BaseParser.ISO_8859_1);
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzee zze;

    static {
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        int i11 = zzee.zza;
        zzed zzed = new zzed(bArr, 0, 0, false, (zzec) null);
        try {
            zzed.zza(0);
            zze = zzed;
        } catch (zzew e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static int zza(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static int zzd(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    static <T> T zze(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    static <T> T zzf(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    static Object zzg(Object obj, Object obj2) {
        return ((zzfq) obj).zze().zzc((zzfq) obj2).zzg();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzi(byte[] bArr) {
        return zzhd.zzc(bArr);
    }
}
