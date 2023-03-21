package p1;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.h;
import u0.w0;

/* compiled from: TextLayoutResult.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final x f16194a;

    /* renamed from: b  reason: collision with root package name */
    private final d f16195b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16196c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16197d;

    /* renamed from: e  reason: collision with root package name */
    private final float f16198e;

    /* renamed from: f  reason: collision with root package name */
    private final List<h> f16199f;

    private y(x xVar, d dVar, long j) {
        this.f16194a = xVar;
        this.f16195b = dVar;
        this.f16196c = j;
        this.f16197d = dVar.f();
        this.f16198e = dVar.j();
        this.f16199f = dVar.x();
    }

    public /* synthetic */ y(x xVar, d dVar, long j, i iVar) {
        this(xVar, dVar, j);
    }

    public static /* synthetic */ int o(y yVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return yVar.n(i11, z11);
    }

    public final long A() {
        return this.f16196c;
    }

    public final long B(int i11) {
        return this.f16195b.z(i11);
    }

    public final y a(x xVar, long j) {
        p.j(xVar, "layoutInput");
        return new y(xVar, this.f16195b, j, (i) null);
    }

    public final ResolvedTextDirection b(int i11) {
        return this.f16195b.b(i11);
    }

    public final h c(int i11) {
        return this.f16195b.c(i11);
    }

    public final h d(int i11) {
        return this.f16195b.d(i11);
    }

    public final boolean e() {
        return this.f16195b.e() || ((float) d2.p.f(this.f16196c)) < this.f16195b.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!p.e(this.f16194a, yVar.f16194a) || !p.e(this.f16195b, yVar.f16195b) || !d2.p.e(this.f16196c, yVar.f16196c)) {
            return false;
        }
        if (!(this.f16197d == yVar.f16197d)) {
            return false;
        }
        return ((this.f16198e > yVar.f16198e ? 1 : (this.f16198e == yVar.f16198e ? 0 : -1)) == 0) && p.e(this.f16199f, yVar.f16199f);
    }

    public final boolean f() {
        return ((float) d2.p.g(this.f16196c)) < this.f16195b.y();
    }

    public final float g() {
        return this.f16197d;
    }

    public final boolean h() {
        return f() || e();
    }

    public int hashCode() {
        return (((((((((this.f16194a.hashCode() * 31) + this.f16195b.hashCode()) * 31) + d2.p.h(this.f16196c)) * 31) + Float.floatToIntBits(this.f16197d)) * 31) + Float.floatToIntBits(this.f16198e)) * 31) + this.f16199f.hashCode();
    }

    public final float i(int i11, boolean z11) {
        return this.f16195b.h(i11, z11);
    }

    public final float j() {
        return this.f16198e;
    }

    public final x k() {
        return this.f16194a;
    }

    public final float l(int i11) {
        return this.f16195b.k(i11);
    }

    public final int m() {
        return this.f16195b.l();
    }

    public final int n(int i11, boolean z11) {
        return this.f16195b.m(i11, z11);
    }

    public final int p(int i11) {
        return this.f16195b.n(i11);
    }

    public final int q(float f11) {
        return this.f16195b.o(f11);
    }

    public final float r(int i11) {
        return this.f16195b.p(i11);
    }

    public final float s(int i11) {
        return this.f16195b.q(i11);
    }

    public final int t(int i11) {
        return this.f16195b.r(i11);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f16194a + ", multiParagraph=" + this.f16195b + ", size=" + d2.p.i(this.f16196c) + ", firstBaseline=" + this.f16197d + ", lastBaseline=" + this.f16198e + ", placeholderRects=" + this.f16199f + ')';
    }

    public final float u(int i11) {
        return this.f16195b.s(i11);
    }

    public final d v() {
        return this.f16195b;
    }

    public final int w(long j) {
        return this.f16195b.t(j);
    }

    public final ResolvedTextDirection x(int i11) {
        return this.f16195b.u(i11);
    }

    public final w0 y(int i11, int i12) {
        return this.f16195b.w(i11, i12);
    }

    public final List<h> z() {
        return this.f16199f;
    }
}
