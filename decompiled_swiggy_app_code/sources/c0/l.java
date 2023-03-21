package c0;

import kotlin.jvm.internal.i;

/* compiled from: Scaffold.kt */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12731b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f12732c = c(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f12733d = c(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f12734a;

    /* compiled from: Scaffold.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return l.f12733d;
        }
    }

    private /* synthetic */ l(int i11) {
        this.f12734a = i11;
    }

    public static final /* synthetic */ l b(int i11) {
        return new l(i11);
    }

    public static int c(int i11) {
        return i11;
    }

    public static boolean d(int i11, Object obj) {
        return (obj instanceof l) && i11 == ((l) obj).h();
    }

    public static final boolean e(int i11, int i12) {
        return i11 == i12;
    }

    public static int f(int i11) {
        return i11;
    }

    public static String g(int i11) {
        return e(i11, f12732c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return d(this.f12734a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f12734a;
    }

    public int hashCode() {
        return f(this.f12734a);
    }

    public String toString() {
        return g(this.f12734a);
    }
}
