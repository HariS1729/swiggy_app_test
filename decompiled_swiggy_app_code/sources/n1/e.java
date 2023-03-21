package n1;

import kotlin.jvm.internal.i;

/* compiled from: SemanticsProperties.kt */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15769b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f15770c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f15771d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f15772a;

    /* compiled from: SemanticsProperties.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return e.f15771d;
        }

        public final int b() {
            return e.f15770c;
        }
    }

    private /* synthetic */ e(int i11) {
        this.f15772a = i11;
    }

    public static final /* synthetic */ e c(int i11) {
        return new e(i11);
    }

    private static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof e) && i11 == ((e) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return i11;
    }

    public static String h(int i11) {
        if (f(i11, f15770c)) {
            return "Polite";
        }
        return f(i11, f15771d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f15772a, obj);
    }

    public int hashCode() {
        return g(this.f15772a);
    }

    public final /* synthetic */ int i() {
        return this.f15772a;
    }

    public String toString() {
        return h(this.f15772a);
    }
}
