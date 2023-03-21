package androidx.compose.ui.graphics.vector;

import bp0.k;
import d2.q;
import e0.a1;
import e0.h0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.l;
import u0.e0;
import w0.f;
import y0.a;
import y0.b;
import y0.h;

/* compiled from: Vector.kt */
public final class VectorComponent extends h {

    /* renamed from: b  reason: collision with root package name */
    private final b f6516b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6517c = true;

    /* renamed from: d  reason: collision with root package name */
    private final a f6518d = new a();

    /* renamed from: e  reason: collision with root package name */
    private lp0.a<k> f6519e = VectorComponent$invalidateCallback$1.f6525a;

    /* renamed from: f  reason: collision with root package name */
    private final h0 f6520f = j.e((Object) null, (a1) null, 2, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private float f6521g;

    /* renamed from: h  reason: collision with root package name */
    private float f6522h;

    /* renamed from: i  reason: collision with root package name */
    private long f6523i = l.f16682b.a();
    private final lp0.l<f, k> j = new VectorComponent$drawVectorBlock$1(this);

    public VectorComponent() {
        super((i) null);
        b bVar = new b();
        bVar.m(0.0f);
        bVar.n(0.0f);
        bVar.d(new VectorComponent$root$1$1(this));
        this.f6516b = bVar;
    }

    /* access modifiers changed from: private */
    public final void f() {
        this.f6517c = true;
        this.f6519e.invoke();
    }

    public void a(f fVar) {
        p.j(fVar, "<this>");
        g(fVar, 1.0f, (e0) null);
    }

    public final void g(f fVar, float f11, e0 e0Var) {
        p.j(fVar, "<this>");
        if (e0Var == null) {
            e0Var = h();
        }
        if (this.f6517c || !l.f(this.f6523i, fVar.d())) {
            this.f6516b.p(l.i(fVar.d()) / this.f6521g);
            this.f6516b.q(l.g(fVar.d()) / this.f6522h);
            this.f6518d.b(q.a((int) ((float) Math.ceil((double) l.i(fVar.d()))), (int) ((float) Math.ceil((double) l.g(fVar.d())))), fVar, fVar.getLayoutDirection(), this.j);
            this.f6517c = false;
            this.f6523i = fVar.d();
        }
        this.f6518d.c(fVar, f11, e0Var);
    }

    public final e0 h() {
        return (e0) this.f6520f.getValue();
    }

    public final String i() {
        return this.f6516b.e();
    }

    public final b j() {
        return this.f6516b;
    }

    public final float k() {
        return this.f6522h;
    }

    public final float l() {
        return this.f6521g;
    }

    public final void m(e0 e0Var) {
        this.f6520f.setValue(e0Var);
    }

    public final void n(lp0.a<k> aVar) {
        p.j(aVar, "<set-?>");
        this.f6519e = aVar;
    }

    public final void o(String str) {
        p.j(str, "value");
        this.f6516b.l(str);
    }

    public final void p(float f11) {
        if (!(this.f6522h == f11)) {
            this.f6522h = f11;
            f();
        }
    }

    public final void q(float f11) {
        if (!(this.f6521g == f11)) {
            this.f6521g = f11;
            f();
        }
    }

    public String toString() {
        String str = "Params: " + "\tname: " + i() + "\n" + "\tviewportWidth: " + this.f6521g + "\n" + "\tviewportHeight: " + this.f6522h + "\n";
        p.i(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
