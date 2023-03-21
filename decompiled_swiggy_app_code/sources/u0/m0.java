package u0;

import kotlin.jvm.internal.i;

/* compiled from: ImageBitmap.kt */
public final class m0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16830b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16831c = g(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16832d = g(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16833e = g(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f16834f = g(3);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f16835g = g(4);

    /* renamed from: a  reason: collision with root package name */
    private final int f16836a;

    /* compiled from: ImageBitmap.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return m0.f16832d;
        }

        public final int b() {
            return m0.f16831c;
        }

        public final int c() {
            return m0.f16834f;
        }

        public final int d() {
            return m0.f16835g;
        }

        public final int e() {
            return m0.f16833e;
        }
    }

    private /* synthetic */ m0(int i11) {
        this.f16836a = i11;
    }

    public static final /* synthetic */ m0 f(int i11) {
        return new m0(i11);
    }

    public static int g(int i11) {
        return i11;
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof m0) && i11 == ((m0) obj).l();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return i11;
    }

    public static String k(int i11) {
        if (i(i11, f16831c)) {
            return "Argb8888";
        }
        if (i(i11, f16832d)) {
            return "Alpha8";
        }
        if (i(i11, f16833e)) {
            return "Rgb565";
        }
        if (i(i11, f16834f)) {
            return "F16";
        }
        return i(i11, f16835g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f16836a, obj);
    }

    public int hashCode() {
        return j(this.f16836a);
    }

    public final /* synthetic */ int l() {
        return this.f16836a;
    }

    public String toString() {
        return k(this.f16836a);
    }
}
