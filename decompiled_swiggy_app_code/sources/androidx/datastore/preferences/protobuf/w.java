package androidx.datastore.preferences.protobuf;

import in.swiggy.android.tejas.network.HttpRequest;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.apache.pdfbox.pdfparser.BaseParser;

/* compiled from: Internal */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f10119a = Charset.forName(HttpRequest.CHARSET_UTF8);

    /* renamed from: b  reason: collision with root package name */
    static final Charset f10120b = Charset.forName(BaseParser.ISO_8859_1);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f10121c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f10122d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f10123e;

    /* compiled from: Internal */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal */
    public interface d<T extends c> {
        T findValueByNumber(int i11);
    }

    /* compiled from: Internal */
    public interface e {
        boolean isInRange(int i11);
    }

    /* compiled from: Internal */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal */
    public interface g extends i<Integer> {
    }

    /* compiled from: Internal */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal */
    public interface i<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        i<E> mutableCopyWithCapacity(int i11);
    }

    static {
        byte[] bArr = new byte[0];
        f10121c = bArr;
        f10122d = ByteBuffer.wrap(bArr);
        f10123e = h.h(bArr);
    }

    static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    static <T> T b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static int c(boolean z11) {
        return z11 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i11, int i12) {
        int i13 = i(i12, bArr, i11, i12);
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return Utf8.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((k0) obj).toBuilder().a((k0) obj2).buildPartial();
    }

    static int i(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f10119a);
    }
}
