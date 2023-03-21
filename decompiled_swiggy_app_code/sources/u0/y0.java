package u0;

import kotlin.jvm.internal.i;

/* compiled from: PathFillType.kt */
public final class y0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16899b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16900c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16901d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f16902a;

    /* compiled from: PathFillType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return y0.f16901d;
        }

        public final int b() {
            return y0.f16900c;
        }
    }

    private /* synthetic */ y0(int i11) {
        this.f16902a = i11;
    }

    public static final /* synthetic */ y0 c(int i11) {
        return new y0(i11);
    }

    public static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof y0) && i11 == ((y0) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return i11;
    }

    public static String h(int i11) {
        if (f(i11, f16900c)) {
            return "NonZero";
        }
        return f(i11, f16901d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f16902a, obj);
    }

    public int hashCode() {
        return g(this.f16902a);
    }

    public final /* synthetic */ int i() {
        return this.f16902a;
    }

    public String toString() {
        return h(this.f16902a);
    }
}
