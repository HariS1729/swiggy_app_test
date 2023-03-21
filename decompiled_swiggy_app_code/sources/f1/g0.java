package f1;

import kotlin.jvm.internal.i;

/* compiled from: PointerEvent.kt */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14488a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f14489b = f(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f14490c = f(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f14491d = f(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f14492e = f(3);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f14493f = f(4);

    /* compiled from: PointerEvent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return g0.f14493f;
        }

        public final int b() {
            return g0.f14491d;
        }

        public final int c() {
            return g0.f14492e;
        }

        public final int d() {
            return g0.f14490c;
        }

        public final int e() {
            return g0.f14489b;
        }
    }

    private static int f(int i11) {
        return i11;
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return i11;
    }

    public static String i(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
