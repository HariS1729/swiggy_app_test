package u0;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: AndroidPaint.android.kt */
public final class h implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private Paint f16786a = i.i();

    /* renamed from: b  reason: collision with root package name */
    private int f16787b = s.f16866b.B();

    /* renamed from: c  reason: collision with root package name */
    private Shader f16788c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f16789d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f16790e;

    public long a() {
        return i.c(this.f16786a);
    }

    public void b(int i11) {
        i.q(this.f16786a, i11);
    }

    public void c(float f11) {
        i.j(this.f16786a, f11);
    }

    public void d(x0 x0Var) {
        i.o(this.f16786a, x0Var);
        this.f16790e = x0Var;
    }

    public void e(int i11) {
        i.n(this.f16786a, i11);
    }

    public int f() {
        return i.e(this.f16786a);
    }

    public void g(int i11) {
        i.r(this.f16786a, i11);
    }

    public float getAlpha() {
        return i.b(this.f16786a);
    }

    public void h(long j) {
        i.l(this.f16786a, j);
    }

    public int i() {
        return i.f(this.f16786a);
    }

    public float j() {
        return i.g(this.f16786a);
    }

    public Paint k() {
        return this.f16786a;
    }

    public Shader l() {
        return this.f16788c;
    }

    public void m(float f11) {
        i.s(this.f16786a, f11);
    }

    public void n(int i11) {
        i.u(this.f16786a, i11);
    }

    public void o(float f11) {
        i.t(this.f16786a, f11);
    }

    public float p() {
        return i.h(this.f16786a);
    }

    public void q(int i11) {
        this.f16787b = i11;
        i.k(this.f16786a, i11);
    }

    public e0 r() {
        return this.f16789d;
    }

    public void s(e0 e0Var) {
        this.f16789d = e0Var;
        i.m(this.f16786a, e0Var);
    }

    public x0 t() {
        return this.f16790e;
    }

    public int u() {
        return this.f16787b;
    }

    public void v(Shader shader) {
        this.f16788c = shader;
        i.p(this.f16786a, shader);
    }

    public int w() {
        return i.d(this.f16786a);
    }
}
