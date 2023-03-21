package u0;

import kotlin.jvm.internal.i;

/* compiled from: StrokeJoin.kt */
public final class m1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16837b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16838c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16839d = e(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16840e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f16841a;

    /* compiled from: StrokeJoin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return m1.f16840e;
        }

        public final int b() {
            return m1.f16838c;
        }

        public final int c() {
            return m1.f16839d;
        }
    }

    private /* synthetic */ m1(int i11) {
        this.f16841a = i11;
    }

    public static final /* synthetic */ m1 d(int i11) {
        return new m1(i11);
    }

    public static int e(int i11) {
        return i11;
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof m1) && i11 == ((m1) obj).j();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return i11;
    }

    public static String i(int i11) {
        if (g(i11, f16838c)) {
            return "Miter";
        }
        if (g(i11, f16839d)) {
            return "Round";
        }
        return g(i11, f16840e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f16841a, obj);
    }

    public int hashCode() {
        return h(this.f16841a);
    }

    public final /* synthetic */ int j() {
        return this.f16841a;
    }

    public String toString() {
        return i(this.f16841a);
    }
}
