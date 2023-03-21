package u0;

import kotlin.jvm.internal.i;

/* compiled from: TileMode.kt */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16850a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f16851b = e(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16852c = e(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16853d = e(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16854e = e(3);

    /* compiled from: TileMode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return o1.f16851b;
        }

        public final int b() {
            return o1.f16854e;
        }

        public final int c() {
            return o1.f16853d;
        }

        public final int d() {
            return o1.f16852c;
        }
    }

    public static int e(int i11) {
        return i11;
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return i11;
    }

    public static String h(int i11) {
        if (f(i11, f16851b)) {
            return "Clamp";
        }
        if (f(i11, f16852c)) {
            return "Repeated";
        }
        if (f(i11, f16853d)) {
            return "Mirror";
        }
        return f(i11, f16854e) ? "Decal" : "Unknown";
    }
}
