package k1;

import androidx.compose.ui.node.DrawEntity;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.e0;
import u0.l0;
import u0.u;
import u0.w0;
import u0.x;
import u0.x0;
import w0.a;
import w0.c;
import w0.d;
import w0.f;
import w0.g;

/* compiled from: LayoutNodeDrawScope.kt */
public final class h implements f, c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f15354a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public DrawEntity f15355b;

    public h(a aVar) {
        p.j(aVar, "canvasDrawScope");
        this.f15354a = aVar;
    }

    public void B0(long j, long j11, long j12, float f11, int i11, x0 x0Var, float f12, e0 e0Var, int i12) {
        this.f15354a.B0(j, j11, j12, f11, i11, x0Var, f12, e0Var, i12);
    }

    public void C0(u uVar, float f11, float f12, boolean z11, long j, long j11, float f13, g gVar, e0 e0Var, int i11) {
        p.j(uVar, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.C0(uVar, f11, f12, z11, j, j11, f13, gVar2, e0Var, i11);
    }

    public void E(w0 w0Var, u uVar, float f11, g gVar, e0 e0Var, int i11) {
        p.j(w0Var, "path");
        p.j(uVar, "brush");
        p.j(gVar, "style");
        this.f15354a.E(w0Var, uVar, f11, gVar, e0Var, i11);
    }

    public void G(long j, float f11, float f12, boolean z11, long j11, long j12, float f13, g gVar, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.G(j, f11, f12, z11, j11, j12, f13, gVar2, e0Var, i11);
    }

    public float M(float f11) {
        return this.f15354a.M(f11);
    }

    public d O() {
        return this.f15354a.O();
    }

    public void Q(long j, long j11, long j12, long j13, g gVar, float f11, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.Q(j, j11, j12, j13, gVar2, f11, e0Var, i11);
    }

    public long R() {
        return this.f15354a.R();
    }

    public long S(long j) {
        return this.f15354a.S(j);
    }

    public void V() {
        x a11 = O().a();
        DrawEntity drawEntity = this.f15355b;
        p.g(drawEntity);
        DrawEntity drawEntity2 = (DrawEntity) drawEntity.d();
        if (drawEntity2 != null) {
            drawEntity2.m(a11);
        } else {
            drawEntity.b().K1(a11);
        }
    }

    public void X(w0 w0Var, long j, float f11, g gVar, e0 e0Var, int i11) {
        p.j(w0Var, "path");
        p.j(gVar, "style");
        this.f15354a.X(w0Var, j, f11, gVar, e0Var, i11);
    }

    public void Z(l0 l0Var, long j, long j11, long j12, long j13, float f11, g gVar, e0 e0Var, int i11, int i12) {
        l0 l0Var2 = l0Var;
        p.j(l0Var2, "image");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.Z(l0Var2, j, j11, j12, j13, f11, gVar2, e0Var, i11, i12);
    }

    public void b0(long j, long j11, long j12, float f11, g gVar, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.b0(j, j11, j12, f11, gVar2, e0Var, i11);
    }

    public long d() {
        return this.f15354a.d();
    }

    public void g0(long j, float f11, long j11, float f12, g gVar, e0 e0Var, int i11) {
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.g0(j, f11, j11, f12, gVar2, e0Var, i11);
    }

    public float getDensity() {
        return this.f15354a.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f15354a.getLayoutDirection();
    }

    public void h0(l0 l0Var, long j, float f11, g gVar, e0 e0Var, int i11) {
        p.j(l0Var, "image");
        p.j(gVar, "style");
        this.f15354a.h0(l0Var, j, f11, gVar, e0Var, i11);
    }

    public void i0(u uVar, long j, long j11, float f11, g gVar, e0 e0Var, int i11) {
        p.j(uVar, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.i0(uVar, j, j11, f11, gVar2, e0Var, i11);
    }

    public int j0(float f11) {
        return this.f15354a.j0(f11);
    }

    public float k(int i11) {
        return this.f15354a.k(i11);
    }

    public float m0(long j) {
        return this.f15354a.m0(j);
    }

    public long o(long j) {
        return this.f15354a.o(j);
    }

    public long q(int i11) {
        return this.f15354a.q(i11);
    }

    public float u0() {
        return this.f15354a.u0();
    }

    public void v(u uVar, long j, long j11, long j12, float f11, g gVar, e0 e0Var, int i11) {
        p.j(uVar, "brush");
        g gVar2 = gVar;
        p.j(gVar2, "style");
        this.f15354a.v(uVar, j, j11, j12, f11, gVar2, e0Var, i11);
    }

    public float v0(float f11) {
        return this.f15354a.v0(f11);
    }

    public void w(u uVar, long j, long j11, float f11, int i11, x0 x0Var, float f12, e0 e0Var, int i12) {
        p.j(uVar, "brush");
        this.f15354a.w(uVar, j, j11, f11, i11, x0Var, f12, e0Var, i12);
    }

    public int y0(long j) {
        return this.f15354a.y0(j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(a aVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? new a() : aVar);
    }
}
