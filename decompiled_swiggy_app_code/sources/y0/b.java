package y0;

import bp0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import u0.o;
import u0.p0;
import u0.w0;
import w0.d;
import w0.f;
import w0.h;

/* compiled from: Vector.kt */
public final class b extends h {

    /* renamed from: b  reason: collision with root package name */
    private float[] f17856b;

    /* renamed from: c  reason: collision with root package name */
    private final List<h> f17857c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private List<? extends d> f17858d = m.e();

    /* renamed from: e  reason: collision with root package name */
    private boolean f17859e = true;

    /* renamed from: f  reason: collision with root package name */
    private w0 f17860f;

    /* renamed from: g  reason: collision with root package name */
    private f f17861g;

    /* renamed from: h  reason: collision with root package name */
    private a<k> f17862h;

    /* renamed from: i  reason: collision with root package name */
    private String f17863i = "";
    private float j;
    private float k;

    /* renamed from: l  reason: collision with root package name */
    private float f17864l;

    /* renamed from: m  reason: collision with root package name */
    private float f17865m = 1.0f;
    private float n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f17866o;

    /* renamed from: p  reason: collision with root package name */
    private float f17867p;
    private boolean q = true;

    public b() {
        super((i) null);
    }

    private final boolean g() {
        return !this.f17858d.isEmpty();
    }

    private final void t() {
        if (g()) {
            f fVar = this.f17861g;
            if (fVar == null) {
                fVar = new f();
                this.f17861g = fVar;
            } else {
                fVar.e();
            }
            w0 w0Var = this.f17860f;
            if (w0Var == null) {
                w0Var = o.a();
                this.f17860f = w0Var;
            } else {
                w0Var.reset();
            }
            fVar.b(this.f17858d).D(w0Var);
        }
    }

    private final void u() {
        float[] fArr = this.f17856b;
        if (fArr == null) {
            fArr = p0.c((float[]) null, 1, (i) null);
            this.f17856b = fArr;
        } else {
            p0.h(fArr);
        }
        p0.m(fArr, this.k + this.f17866o, this.f17864l + this.f17867p, 0.0f, 4, (Object) null);
        p0.i(fArr, this.j);
        p0.j(fArr, this.f17865m, this.n, 1.0f);
        p0.m(fArr, -this.k, -this.f17864l, 0.0f, 4, (Object) null);
    }

    public void a(f fVar) {
        p.j(fVar, "<this>");
        if (this.q) {
            u();
            this.q = false;
        }
        if (this.f17859e) {
            t();
            this.f17859e = false;
        }
        d O = fVar.O();
        long d11 = O.d();
        O.a().a();
        w0.i c11 = O.c();
        float[] fArr = this.f17856b;
        if (fArr != null) {
            c11.g(p0.a(fArr).n());
        }
        w0 w0Var = this.f17860f;
        if (g() && w0Var != null) {
            h.a(c11, w0Var, 0, 2, (Object) null);
        }
        List<h> list = this.f17857c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).a(fVar);
        }
        O.a().o();
        O.b(d11);
    }

    public a<k> b() {
        return this.f17862h;
    }

    public void d(a<k> aVar) {
        this.f17862h = aVar;
        List<h> list = this.f17857c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).d(aVar);
        }
    }

    public final String e() {
        return this.f17863i;
    }

    public final int f() {
        return this.f17857c.size();
    }

    public final void h(int i11, h hVar) {
        p.j(hVar, "instance");
        if (i11 < f()) {
            this.f17857c.set(i11, hVar);
        } else {
            this.f17857c.add(hVar);
        }
        hVar.d(b());
        c();
    }

    public final void i(int i11, int i12, int i13) {
        int i14 = 0;
        if (i11 > i12) {
            while (i14 < i13) {
                this.f17857c.remove(i11);
                this.f17857c.add(i12, this.f17857c.get(i11));
                i12++;
                i14++;
            }
        } else {
            while (i14 < i13) {
                this.f17857c.remove(i11);
                this.f17857c.add(i12 - 1, this.f17857c.get(i11));
                i14++;
            }
        }
        c();
    }

    public final void j(int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 < this.f17857c.size()) {
                this.f17857c.get(i11).d((a<k>) null);
                this.f17857c.remove(i11);
            }
        }
        c();
    }

    public final void k(List<? extends d> list) {
        p.j(list, "value");
        this.f17858d = list;
        this.f17859e = true;
        c();
    }

    public final void l(String str) {
        p.j(str, "value");
        this.f17863i = str;
        c();
    }

    public final void m(float f11) {
        this.k = f11;
        this.q = true;
        c();
    }

    public final void n(float f11) {
        this.f17864l = f11;
        this.q = true;
        c();
    }

    public final void o(float f11) {
        this.j = f11;
        this.q = true;
        c();
    }

    public final void p(float f11) {
        this.f17865m = f11;
        this.q = true;
        c();
    }

    public final void q(float f11) {
        this.n = f11;
        this.q = true;
        c();
    }

    public final void r(float f11) {
        this.f17866o = f11;
        this.q = true;
        c();
    }

    public final void s(float f11) {
        this.f17867p = f11;
        this.q = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f17863i);
        List<h> list = this.f17857c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append("\t");
            sb2.append(list.get(i11).toString());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        p.i(sb3, "sb.toString()");
        return sb3;
    }
}
