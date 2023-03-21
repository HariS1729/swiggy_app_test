package g1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: VelocityTracker.kt */
final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14720e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final f f14721f;

    /* renamed from: a  reason: collision with root package name */
    private final long f14722a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14723b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14724c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14725d;

    /* compiled from: VelocityTracker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final f a() {
            return f.f14721f;
        }
    }

    static {
        f.a aVar = t0.f.f16662b;
        f14721f = new f(aVar.c(), 1.0f, 0, aVar.c(), (i) null);
    }

    private f(long j, float f11, long j11, long j12) {
        this.f14722a = j;
        this.f14723b = f11;
        this.f14724c = j11;
        this.f14725d = j12;
    }

    public /* synthetic */ f(long j, float f11, long j11, long j12, i iVar) {
        this(j, f11, j11, j12);
    }

    public final long b() {
        return this.f14722a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t0.f.j(this.f14722a, fVar.f14722a) && p.e(Float.valueOf(this.f14723b), Float.valueOf(fVar.f14723b)) && this.f14724c == fVar.f14724c && t0.f.j(this.f14725d, fVar.f14725d);
    }

    public int hashCode() {
        return (((((t0.f.o(this.f14722a) * 31) + Float.floatToIntBits(this.f14723b)) * 31) + bs.a.a(this.f14724c)) * 31) + t0.f.o(this.f14725d);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + t0.f.t(this.f14722a) + ", confidence=" + this.f14723b + ", durationMillis=" + this.f14724c + ", offset=" + t0.f.t(this.f14725d) + ')';
    }
}
