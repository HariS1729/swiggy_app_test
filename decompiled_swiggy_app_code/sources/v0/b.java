package v0;

import kotlin.jvm.internal.i;

/* compiled from: ColorModel.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17013a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f17014b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f17015c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f17016d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f17017e;

    /* compiled from: ColorModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return b.f17016d;
        }

        public final long b() {
            return b.f17014b;
        }

        public final long c() {
            return b.f17015c;
        }
    }

    static {
        long j = (long) 3;
        long j11 = j << 32;
        f17014b = d((((long) 0) & 4294967295L) | j11);
        f17015c = d((((long) 1) & 4294967295L) | j11);
        f17016d = d(j11 | (((long) 2) & 4294967295L));
        f17017e = d((j & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j) {
        return j;
    }

    public static final boolean e(long j, long j11) {
        return j == j11;
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(long j) {
        return bs.a.a(j);
    }

    public static String h(long j) {
        if (e(j, f17014b)) {
            return "Rgb";
        }
        if (e(j, f17015c)) {
            return "Xyz";
        }
        if (e(j, f17016d)) {
            return "Lab";
        }
        return e(j, f17017e) ? "Cmyk" : "Unknown";
    }
}
