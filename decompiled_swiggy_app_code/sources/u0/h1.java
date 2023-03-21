package u0;

import kotlin.jvm.internal.i;
import t0.f;

/* compiled from: Shadow.kt */
public final class h1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f16796d = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h1 f16797e = new h1(0, 0, 0.0f, 7, (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f16798a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16799b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16800c;

    /* compiled from: Shadow.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final h1 a() {
            return h1.f16797e;
        }
    }

    private h1(long j, long j11, float f11) {
        this.f16798a = j;
        this.f16799b = j11;
        this.f16800c = f11;
    }

    public /* synthetic */ h1(long j, long j11, float f11, i iVar) {
        this(j, j11, f11);
    }

    public final float b() {
        return this.f16800c;
    }

    public final long c() {
        return this.f16798a;
    }

    public final long d() {
        return this.f16799b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (!d0.n(this.f16798a, h1Var.f16798a) || !f.j(this.f16799b, h1Var.f16799b)) {
            return false;
        }
        return (this.f16800c > h1Var.f16800c ? 1 : (this.f16800c == h1Var.f16800c ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (((d0.t(this.f16798a) * 31) + f.o(this.f16799b)) * 31) + Float.floatToIntBits(this.f16800c);
    }

    public String toString() {
        return "Shadow(color=" + d0.u(this.f16798a) + ", offset=" + f.t(this.f16799b) + ", blurRadius=" + this.f16800c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(long j, long j11, float f11, int i11, i iVar) {
        this((i11 & 1) != 0 ? f0.c(4278190080L) : j, (i11 & 2) != 0 ? f.f16662b.c() : j11, (i11 & 4) != 0 ? 0.0f : f11, (i) null);
    }
}
