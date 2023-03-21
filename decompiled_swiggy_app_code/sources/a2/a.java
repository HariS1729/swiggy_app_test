package a2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: BaselineShift.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0000a f884b = new C0000a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f885c = c(0.5f);

    /* renamed from: d  reason: collision with root package name */
    private static final float f886d = c(-0.5f);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final float f887e = c(0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f888a;

    /* renamed from: a2.a$a  reason: collision with other inner class name */
    /* compiled from: BaselineShift.kt */
    public static final class C0000a {
        private C0000a() {
        }

        public /* synthetic */ C0000a(i iVar) {
            this();
        }

        public final float a() {
            return a.f887e;
        }
    }

    private /* synthetic */ a(float f11) {
        this.f888a = f11;
    }

    public static final /* synthetic */ a b(float f11) {
        return new a(f11);
    }

    public static float c(float f11) {
        return f11;
    }

    public static boolean d(float f11, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return p.e(Float.valueOf(f11), Float.valueOf(((a) obj).h()));
    }

    public static final boolean e(float f11, float f12) {
        return p.e(Float.valueOf(f11), Float.valueOf(f12));
    }

    public static int f(float f11) {
        return Float.floatToIntBits(f11);
    }

    public static String g(float f11) {
        return "BaselineShift(multiplier=" + f11 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f888a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f888a;
    }

    public int hashCode() {
        return f(this.f888a);
    }

    public String toString() {
        return g(this.f888a);
    }
}
