package a2;

import kotlin.jvm.internal.i;

/* compiled from: TextAlign.kt */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f907b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f908c = h(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f909d = h(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f910e = h(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f911f = h(4);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f912g = h(5);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f913h = h(6);

    /* renamed from: a  reason: collision with root package name */
    private final int f914a;

    /* compiled from: TextAlign.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return d.f910e;
        }

        public final int b() {
            return d.f913h;
        }

        public final int c() {
            return d.f911f;
        }

        public final int d() {
            return d.f908c;
        }

        public final int e() {
            return d.f909d;
        }

        public final int f() {
            return d.f912g;
        }
    }

    private /* synthetic */ d(int i11) {
        this.f914a = i11;
    }

    public static final /* synthetic */ d g(int i11) {
        return new d(i11);
    }

    public static int h(int i11) {
        return i11;
    }

    public static boolean i(int i11, Object obj) {
        return (obj instanceof d) && i11 == ((d) obj).m();
    }

    public static final boolean j(int i11, int i12) {
        return i11 == i12;
    }

    public static int k(int i11) {
        return i11;
    }

    public static String l(int i11) {
        if (j(i11, f908c)) {
            return "Left";
        }
        if (j(i11, f909d)) {
            return "Right";
        }
        if (j(i11, f910e)) {
            return "Center";
        }
        if (j(i11, f911f)) {
            return "Justify";
        }
        if (j(i11, f912g)) {
            return "Start";
        }
        return j(i11, f913h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f914a, obj);
    }

    public int hashCode() {
        return k(this.f914a);
    }

    public final /* synthetic */ int m() {
        return this.f914a;
    }

    public String toString() {
        return l(this.f914a);
    }
}
