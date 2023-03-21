package e0;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: SlotTable.kt */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f14222a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f14223b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14224c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f14225d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14226e;

    /* renamed from: f  reason: collision with root package name */
    private int f14227f;

    /* renamed from: g  reason: collision with root package name */
    private int f14228g;

    /* renamed from: h  reason: collision with root package name */
    private int f14229h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f14230i;
    private int j;
    private int k;

    public u0(v0 v0Var) {
        p.j(v0Var, "table");
        this.f14222a = v0Var;
        this.f14223b = v0Var.g();
        int h11 = v0Var.h();
        this.f14224c = h11;
        this.f14225d = v0Var.i();
        this.f14226e = v0Var.k();
        this.f14228g = h11;
    }

    private final Object J(int[] iArr, int i11) {
        if (w0.L(iArr, i11)) {
            return this.f14225d[w0.P(iArr, i11)];
        }
        return g.f14172a.a();
    }

    private final Object L(int[] iArr, int i11) {
        if (w0.J(iArr, i11)) {
            return this.f14225d[w0.Q(iArr, i11)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i11) {
        if (w0.H(iArr, i11)) {
            return this.f14225d[w0.A(iArr, i11)];
        }
        return g.f14172a.a();
    }

    public final Object A(int i11) {
        return L(this.f14223b, i11);
    }

    public final int B(int i11) {
        return w0.G(this.f14223b, i11);
    }

    public final boolean C(int i11) {
        return w0.I(this.f14223b, i11);
    }

    public final boolean D(int i11) {
        return w0.J(this.f14223b, i11);
    }

    public final boolean E() {
        return r() || this.f14227f == this.f14228g;
    }

    public final boolean F() {
        return w0.L(this.f14223b, this.f14227f);
    }

    public final boolean G(int i11) {
        return w0.L(this.f14223b, i11);
    }

    public final Object H() {
        int i11;
        if (this.f14230i > 0 || (i11 = this.j) >= this.k) {
            return g.f14172a.a();
        }
        Object[] objArr = this.f14225d;
        this.j = i11 + 1;
        return objArr[i11];
    }

    public final Object I(int i11) {
        if (w0.L(this.f14223b, i11)) {
            return J(this.f14223b, i11);
        }
        return null;
    }

    public final int K(int i11) {
        return w0.O(this.f14223b, i11);
    }

    public final int M(int i11) {
        return w0.R(this.f14223b, i11);
    }

    public final void N(int i11) {
        if (this.f14230i == 0) {
            this.f14227f = i11;
            int r11 = i11 < this.f14224c ? w0.R(this.f14223b, i11) : -1;
            this.f14229h = r11;
            if (r11 < 0) {
                this.f14228g = this.f14224c;
            } else {
                this.f14228g = r11 + w0.G(this.f14223b, r11);
            }
            this.j = 0;
            this.k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    public final void O(int i11) {
        int g11 = w0.G(this.f14223b, i11) + i11;
        int i12 = this.f14227f;
        if (i12 >= i11 && i12 <= g11) {
            this.f14229h = i11;
            this.f14228g = g11;
            this.j = 0;
            this.k = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i11 + " is not a parent of " + i12).toString());
    }

    public final int P() {
        int i11 = 1;
        if (this.f14230i == 0) {
            if (!w0.L(this.f14223b, this.f14227f)) {
                i11 = w0.O(this.f14223b, this.f14227f);
            }
            int i12 = this.f14227f;
            this.f14227f = i12 + w0.G(this.f14223b, i12);
            return i11;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    public final void Q() {
        if (this.f14230i == 0) {
            this.f14227f = this.f14228g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    public final void R() {
        int i11;
        if (this.f14230i <= 0) {
            if (w0.R(this.f14223b, this.f14227f) == this.f14229h) {
                int i12 = this.f14227f;
                this.f14229h = i12;
                this.f14228g = i12 + w0.G(this.f14223b, i12);
                int i13 = this.f14227f;
                int i14 = i13 + 1;
                this.f14227f = i14;
                this.j = w0.T(this.f14223b, i13);
                if (i13 >= this.f14224c - 1) {
                    i11 = this.f14226e;
                } else {
                    i11 = w0.E(this.f14223b, i14);
                }
                this.k = i11;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void S() {
        if (this.f14230i > 0) {
            return;
        }
        if (w0.L(this.f14223b, this.f14227f)) {
            R();
            return;
        }
        throw new IllegalArgumentException("Expected a node group".toString());
    }

    public final c a(int i11) {
        ArrayList<c> f11 = this.f14222a.f();
        int s11 = w0.S(f11, i11, this.f14224c);
        if (s11 < 0) {
            c cVar = new c(i11);
            f11.add(-(s11 + 1), cVar);
            return cVar;
        }
        c cVar2 = f11.get(s11);
        p.i(cVar2, "get(location)");
        return cVar2;
    }

    public final void c() {
        this.f14230i++;
    }

    public final void d() {
        this.f14222a.b(this);
    }

    public final boolean e(int i11) {
        return w0.C(this.f14223b, i11);
    }

    public final void f() {
        int i11 = this.f14230i;
        if (i11 > 0) {
            this.f14230i = i11 - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void g() {
        int i11;
        if (this.f14230i == 0) {
            if (this.f14227f == this.f14228g) {
                int r11 = w0.R(this.f14223b, this.f14229h);
                this.f14229h = r11;
                if (r11 < 0) {
                    i11 = this.f14224c;
                } else {
                    i11 = r11 + w0.G(this.f14223b, r11);
                }
                this.f14228g = i11;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    public final List<y> h() {
        ArrayList arrayList = new ArrayList();
        if (this.f14230i > 0) {
            return arrayList;
        }
        int i11 = this.f14227f;
        int i12 = 0;
        while (i11 < this.f14228g) {
            arrayList.add(new y(w0.M(this.f14223b, i11), L(this.f14223b, i11), i11, w0.L(this.f14223b, i11) ? 1 : w0.O(this.f14223b, i11), i12));
            i11 += w0.G(this.f14223b, i11);
            i12++;
        }
        return arrayList;
    }

    public final void i(int i11, lp0.p<? super Integer, Object, k> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        int t = w0.T(this.f14223b, i11);
        int i12 = i11 + 1;
        int e11 = i12 < this.f14222a.h() ? w0.E(this.f14222a.g(), i12) : this.f14222a.k();
        for (int i13 = t; i13 < e11; i13++) {
            pVar.invoke(Integer.valueOf(i13 - t), this.f14225d[i13]);
        }
    }

    public final int j() {
        return this.f14228g;
    }

    public final int k() {
        return this.f14227f;
    }

    public final Object l() {
        int i11 = this.f14227f;
        if (i11 < this.f14228g) {
            return b(this.f14223b, i11);
        }
        return 0;
    }

    public final int m() {
        return this.f14228g;
    }

    public final int n() {
        int i11 = this.f14227f;
        if (i11 < this.f14228g) {
            return w0.M(this.f14223b, i11);
        }
        return 0;
    }

    public final Object o() {
        int i11 = this.f14227f;
        if (i11 < this.f14228g) {
            return L(this.f14223b, i11);
        }
        return null;
    }

    public final int p() {
        return w0.G(this.f14223b, this.f14227f);
    }

    public final int q() {
        return this.j - w0.T(this.f14223b, this.f14229h);
    }

    public final boolean r() {
        return this.f14230i > 0;
    }

    public final int s() {
        return this.f14229h;
    }

    public final int t() {
        int i11 = this.f14229h;
        if (i11 >= 0) {
            return w0.O(this.f14223b, i11);
        }
        return 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f14227f + ", key=" + n() + ", parent=" + this.f14229h + ", end=" + this.f14228g + ')';
    }

    public final int u() {
        return this.f14224c;
    }

    public final v0 v() {
        return this.f14222a;
    }

    public final Object w(int i11) {
        return b(this.f14223b, i11);
    }

    public final Object x(int i11) {
        return y(this.f14227f, i11);
    }

    public final Object y(int i11, int i12) {
        int t = w0.T(this.f14223b, i11);
        int i13 = i11 + 1;
        int i14 = t + i12;
        return i14 < (i13 < this.f14224c ? w0.E(this.f14223b, i13) : this.f14226e) ? this.f14225d[i14] : g.f14172a.a();
    }

    public final int z(int i11) {
        return w0.M(this.f14223b, i11);
    }
}
