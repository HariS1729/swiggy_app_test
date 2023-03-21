package d2;

import kotlin.jvm.internal.i;

/* compiled from: TextUnit.kt */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14026b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f14027c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f14028d = e(4294967296L);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final long f14029e = e(8589934592L);

    /* renamed from: a  reason: collision with root package name */
    private final long f14030a;

    /* compiled from: TextUnit.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return t.f14029e;
        }

        public final long b() {
            return t.f14028d;
        }

        public final long c() {
            return t.f14027c;
        }
    }

    private /* synthetic */ t(long j) {
        this.f14030a = j;
    }

    public static final /* synthetic */ t d(long j) {
        return new t(j);
    }

    public static long e(long j) {
        return j;
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof t) && j == ((t) obj).j();
    }

    public static final boolean g(long j, long j11) {
        return j == j11;
    }

    public static int h(long j) {
        return bs.a.a(j);
    }

    public static String i(long j) {
        if (g(j, f14027c)) {
            return "Unspecified";
        }
        if (g(j, f14028d)) {
            return "Sp";
        }
        return g(j, f14029e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f14030a, obj);
    }

    public int hashCode() {
        return h(this.f14030a);
    }

    public final /* synthetic */ long j() {
        return this.f14030a;
    }

    public String toString() {
        return i(this.f14030a);
    }
}
