package n1;

import kotlin.jvm.internal.i;

/* compiled from: SemanticsProperties.kt */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15778b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f15779c = h(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f15780d = h(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f15781e = h(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f15782f = h(3);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f15783g = h(4);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f15784h = h(5);

    /* renamed from: a  reason: collision with root package name */
    private final int f15785a;

    /* compiled from: SemanticsProperties.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return g.f15779c;
        }

        public final int b() {
            return g.f15780d;
        }

        public final int c() {
            return g.f15784h;
        }

        public final int d() {
            return g.f15782f;
        }

        public final int e() {
            return g.f15781e;
        }

        public final int f() {
            return g.f15783g;
        }
    }

    private /* synthetic */ g(int i11) {
        this.f15785a = i11;
    }

    public static final /* synthetic */ g g(int i11) {
        return new g(i11);
    }

    private static int h(int i11) {
        return i11;
    }

    public static boolean i(int i11, Object obj) {
        return (obj instanceof g) && i11 == ((g) obj).m();
    }

    public static final boolean j(int i11, int i12) {
        return i11 == i12;
    }

    public static int k(int i11) {
        return i11;
    }

    public static String l(int i11) {
        if (j(i11, f15779c)) {
            return "Button";
        }
        if (j(i11, f15780d)) {
            return "Checkbox";
        }
        if (j(i11, f15781e)) {
            return "Switch";
        }
        if (j(i11, f15782f)) {
            return "RadioButton";
        }
        if (j(i11, f15783g)) {
            return "Tab";
        }
        return j(i11, f15784h) ? "Image" : "Unknown";
    }

    public boolean equals(Object obj) {
        return i(this.f15785a, obj);
    }

    public int hashCode() {
        return k(this.f15785a);
    }

    public final /* synthetic */ int m() {
        return this.f15785a;
    }

    public String toString() {
        return l(this.f15785a);
    }
}
