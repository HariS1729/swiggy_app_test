package d2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Dp.kt */
public final class h implements Comparable<h> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13997b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f13998c = n(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f13999d = n(Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final float f14000e = n(Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final float f14001a;

    /* compiled from: Dp.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final float a() {
            return h.f13998c;
        }

        public final float b() {
            return h.f13999d;
        }

        public final float c() {
            return h.f14000e;
        }
    }

    private /* synthetic */ h(float f11) {
        this.f14001a = f11;
    }

    public static final /* synthetic */ h k(float f11) {
        return new h(f11);
    }

    public static int m(float f11, float f12) {
        return Float.compare(f11, f12);
    }

    public static float n(float f11) {
        return f11;
    }

    public static boolean o(float f11, Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return p.e(Float.valueOf(f11), Float.valueOf(((h) obj).s()));
    }

    public static final boolean p(float f11, float f12) {
        return p.e(Float.valueOf(f11), Float.valueOf(f12));
    }

    public static int q(float f11) {
        return Float.floatToIntBits(f11);
    }

    public static String r(float f11) {
        if (Float.isNaN(f11)) {
            return "Dp.Unspecified";
        }
        return f11 + ".dp";
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return l(((h) obj).s());
    }

    public boolean equals(Object obj) {
        return o(this.f14001a, obj);
    }

    public int hashCode() {
        return q(this.f14001a);
    }

    public int l(float f11) {
        return m(this.f14001a, f11);
    }

    public final /* synthetic */ float s() {
        return this.f14001a;
    }

    public String toString() {
        return r(this.f14001a);
    }
}
