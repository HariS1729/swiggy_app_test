package s0;

import kotlin.jvm.internal.i;

/* compiled from: FocusTraversal.kt */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16557b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16558c = j(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16559d = j(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16560e = j(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f16561f = j(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f16562g = j(5);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f16563h = j(6);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f16564i = j(7);
    /* access modifiers changed from: private */
    public static final int j = j(8);

    /* renamed from: a  reason: collision with root package name */
    private final int f16565a;

    /* compiled from: FocusTraversal.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return b.f16563h;
        }

        public final int b() {
            return b.f16564i;
        }

        public final int c() {
            return b.f16560e;
        }

        public final int d() {
            return b.f16558c;
        }

        public final int e() {
            return b.j;
        }

        public final int f() {
            return b.f16559d;
        }

        public final int g() {
            return b.f16561f;
        }

        public final int h() {
            return b.f16562g;
        }
    }

    private /* synthetic */ b(int i11) {
        this.f16565a = i11;
    }

    public static final /* synthetic */ b i(int i11) {
        return new b(i11);
    }

    public static int j(int i11) {
        return i11;
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof b) && i11 == ((b) obj).o();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return i11;
    }

    public static String n(int i11) {
        if (l(i11, f16558c)) {
            return "Next";
        }
        if (l(i11, f16559d)) {
            return "Previous";
        }
        if (l(i11, f16560e)) {
            return "Left";
        }
        if (l(i11, f16561f)) {
            return "Right";
        }
        if (l(i11, f16562g)) {
            return "Up";
        }
        if (l(i11, f16563h)) {
            return "Down";
        }
        if (l(i11, f16564i)) {
            return "In";
        }
        return l(i11, j) ? "Out" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f16565a, obj);
    }

    public int hashCode() {
        return m(this.f16565a);
    }

    public final /* synthetic */ int o() {
        return this.f16565a;
    }

    public String toString() {
        return n(this.f16565a);
    }
}
