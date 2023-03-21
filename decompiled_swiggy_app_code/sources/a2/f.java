package a2;

import kotlin.jvm.internal.i;

/* compiled from: TextDirection.kt */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f920b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f921c = g(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f922d = g(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f923e = g(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f924f = g(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f925g = g(5);

    /* renamed from: a  reason: collision with root package name */
    private final int f926a;

    /* compiled from: TextDirection.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return f.f923e;
        }

        public final int b() {
            return f.f924f;
        }

        public final int c() {
            return f.f925g;
        }

        public final int d() {
            return f.f921c;
        }

        public final int e() {
            return f.f922d;
        }
    }

    private /* synthetic */ f(int i11) {
        this.f926a = i11;
    }

    public static final /* synthetic */ f f(int i11) {
        return new f(i11);
    }

    public static int g(int i11) {
        return i11;
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof f) && i11 == ((f) obj).l();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return i11;
    }

    public static String k(int i11) {
        if (i(i11, f921c)) {
            return "Ltr";
        }
        if (i(i11, f922d)) {
            return "Rtl";
        }
        if (i(i11, f923e)) {
            return "Content";
        }
        if (i(i11, f924f)) {
            return "ContentOrLtr";
        }
        return i(i11, f925g) ? "ContentOrRtl" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f926a, obj);
    }

    public int hashCode() {
        return j(this.f926a);
    }

    public final /* synthetic */ int l() {
        return this.f926a;
    }

    public String toString() {
        return k(this.f926a);
    }
}
