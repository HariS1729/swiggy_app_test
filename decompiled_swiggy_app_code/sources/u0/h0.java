package u0;

import kotlin.jvm.internal.i;

/* compiled from: FilterQuality.kt */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16791a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f16792b = c(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16793c = c(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f16794d = c(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f16795e = c(3);

    /* compiled from: FilterQuality.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return h0.f16793c;
        }

        public final int b() {
            return h0.f16792b;
        }
    }

    public static int c(int i11) {
        return i11;
    }

    public static final boolean d(int i11, int i12) {
        return i11 == i12;
    }

    public static int e(int i11) {
        return i11;
    }

    public static String f(int i11) {
        if (d(i11, f16792b)) {
            return "None";
        }
        if (d(i11, f16793c)) {
            return "Low";
        }
        if (d(i11, f16794d)) {
            return "Medium";
        }
        return d(i11, f16795e) ? "High" : "Unknown";
    }
}
