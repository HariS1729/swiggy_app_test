package d2;

import d2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: Dp.kt */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14002b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f14003c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f14004d;

    /* renamed from: a  reason: collision with root package name */
    private final long f14005a;

    /* compiled from: Dp.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return j.f14004d;
        }
    }

    static {
        float f11 = (float) 0;
        f14003c = i.a(h.n(f11), h.n(f11));
        h.a aVar = h.f13997b;
        f14004d = i.a(aVar.c(), aVar.c());
    }

    private /* synthetic */ j(long j) {
        this.f14005a = j;
    }

    public static final /* synthetic */ j b(long j) {
        return new j(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof j) && j == ((j) obj).i();
    }

    public static final float e(long j) {
        if (j != f14004d) {
            k kVar = k.f25688a;
            return h.n(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float f(long j) {
        if (j != f14004d) {
            k kVar = k.f25688a;
            return h.n(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static int g(long j) {
        return bs.a.a(j);
    }

    public static String h(long j) {
        if (!(j != f14002b.a())) {
            return "DpOffset.Unspecified";
        }
        return '(' + h.r(e(j)) + ", " + h.r(f(j)) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f14005a, obj);
    }

    public int hashCode() {
        return g(this.f14005a);
    }

    public final /* synthetic */ long i() {
        return this.f14005a;
    }

    public String toString() {
        return h(this.f14005a);
    }
}
