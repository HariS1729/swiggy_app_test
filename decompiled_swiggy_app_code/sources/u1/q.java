package u1;

import kotlin.jvm.internal.i;

/* compiled from: FontLoadingStrategy.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16935a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f16936b = d(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16937c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16938d = d(2);

    /* compiled from: FontLoadingStrategy.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return q.f16938d;
        }

        public final int b() {
            return q.f16936b;
        }

        public final int c() {
            return q.f16937c;
        }
    }

    private static int d(int i11) {
        return i11;
    }

    public static final boolean e(int i11, int i12) {
        return i11 == i12;
    }

    public static int f(int i11) {
        return i11;
    }

    public static String g(int i11) {
        if (e(i11, f16936b)) {
            return "Blocking";
        }
        if (e(i11, f16937c)) {
            return "Optional";
        }
        if (e(i11, f16938d)) {
            return "Async";
        }
        return "Invalid(value=" + i11 + ')';
    }
}
