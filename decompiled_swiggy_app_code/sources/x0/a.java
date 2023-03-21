package x0;

import androidx.compose.ui.graphics.painter.Painter;
import d2.l;
import d2.p;
import d2.q;
import kotlin.jvm.internal.i;
import u0.e0;
import u0.h0;
import u0.l0;
import w0.e;
import w0.f;
import w0.g;

/* compiled from: BitmapPainter.kt */
public final class a extends Painter {

    /* renamed from: g  reason: collision with root package name */
    private final l0 f17654g;

    /* renamed from: h  reason: collision with root package name */
    private final long f17655h;

    /* renamed from: i  reason: collision with root package name */
    private final long f17656i;
    private int j;
    private final long k;

    /* renamed from: l  reason: collision with root package name */
    private float f17657l;

    /* renamed from: m  reason: collision with root package name */
    private e0 f17658m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(l0 l0Var, long j11, long j12, int i11, i iVar) {
        this(l0Var, (i11 & 2) != 0 ? l.f14010b.a() : j11, (i11 & 4) != 0 ? q.a(l0Var.getWidth(), l0Var.getHeight()) : j12, (i) null);
    }

    public /* synthetic */ a(l0 l0Var, long j11, long j12, i iVar) {
        this(l0Var, j11, j12);
    }

    private final long o(long j11, long j12) {
        if (l.j(j11) >= 0 && l.k(j11) >= 0 && p.g(j12) >= 0 && p.f(j12) >= 0 && p.g(j12) <= this.f17654g.getWidth() && p.f(j12) <= this.f17654g.getHeight()) {
            return j12;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: protected */
    public boolean a(float f11) {
        this.f17657l = f11;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(e0 e0Var) {
        this.f17658m = e0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.p.e(this.f17654g, aVar.f17654g) && l.i(this.f17655h, aVar.f17655h) && p.e(this.f17656i, aVar.f17656i) && h0.d(this.j, aVar.j);
    }

    public int hashCode() {
        return (((((this.f17654g.hashCode() * 31) + l.l(this.f17655h)) * 31) + p.h(this.f17656i)) * 31) + h0.e(this.j);
    }

    public long k() {
        return q.b(this.k);
    }

    /* access modifiers changed from: protected */
    public void m(f fVar) {
        kotlin.jvm.internal.p.j(fVar, "<this>");
        e.g(fVar, this.f17654g, this.f17655h, this.f17656i, 0, q.a(c.c(t0.l.i(fVar.d())), c.c(t0.l.g(fVar.d()))), this.f17657l, (g) null, this.f17658m, 0, this.j, 328, (Object) null);
    }

    public final void n(int i11) {
        this.j = i11;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f17654g + ", srcOffset=" + l.m(this.f17655h) + ", srcSize=" + p.i(this.f17656i) + ", filterQuality=" + h0.f(this.j) + ')';
    }

    private a(l0 l0Var, long j11, long j12) {
        this.f17654g = l0Var;
        this.f17655h = j11;
        this.f17656i = j12;
        this.j = h0.f16791a.a();
        this.k = o(j11, j12);
        this.f17657l = 1.0f;
    }
}
