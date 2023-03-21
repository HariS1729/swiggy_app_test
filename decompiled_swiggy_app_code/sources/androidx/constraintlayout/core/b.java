package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import java.util.ArrayList;

/* compiled from: ArrayRow */
public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    SolverVariable f8032a = null;

    /* renamed from: b  reason: collision with root package name */
    float f8033b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f8034c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<SolverVariable> f8035d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public a f8036e;

    /* renamed from: f  reason: collision with root package name */
    boolean f8037f = false;

    /* compiled from: ArrayRow */
    public interface a {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i11);

        void c(SolverVariable solverVariable, float f11);

        void clear();

        float d(SolverVariable solverVariable);

        void e(float f11);

        void f(SolverVariable solverVariable, float f11, boolean z11);

        void g();

        float h(SolverVariable solverVariable, boolean z11);

        int i();

        float j(b bVar, boolean z11);

        float k(int i11);
    }

    public b() {
    }

    private boolean u(SolverVariable solverVariable, d dVar) {
        return solverVariable.f8019m <= 1;
    }

    private SolverVariable w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int i11 = this.f8036e.i();
        SolverVariable solverVariable2 = null;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float k = this.f8036e.k(i12);
            if (k < 0.0f) {
                SolverVariable b11 = this.f8036e.b(i12);
                if ((zArr == null || !zArr[b11.f8011c]) && b11 != solverVariable && (((type = b11.j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && k < f11)) {
                    f11 = k;
                    solverVariable2 = b11;
                }
            }
        }
        return solverVariable2;
    }

    public void A(d dVar, SolverVariable solverVariable, boolean z11) {
        if (solverVariable != null && solverVariable.f8015g) {
            this.f8033b += solverVariable.f8014f * this.f8036e.d(solverVariable);
            this.f8036e.h(solverVariable, z11);
            if (z11) {
                solverVariable.i(this);
            }
            if (d.t && this.f8036e.i() == 0) {
                this.f8037f = true;
                dVar.f8048a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z11) {
        this.f8033b += bVar.f8033b * this.f8036e.j(bVar, z11);
        if (z11) {
            bVar.f8032a.i(this);
        }
        if (d.t && this.f8032a != null && this.f8036e.i() == 0) {
            this.f8037f = true;
            dVar.f8048a = true;
        }
    }

    public void C(d dVar, SolverVariable solverVariable, boolean z11) {
        if (solverVariable != null && solverVariable.n) {
            float d11 = this.f8036e.d(solverVariable);
            this.f8033b += solverVariable.f8021p * d11;
            this.f8036e.h(solverVariable, z11);
            if (z11) {
                solverVariable.i(this);
            }
            this.f8036e.f(dVar.n.f8041d[solverVariable.f8020o], d11, z11);
            if (d.t && this.f8036e.i() == 0) {
                this.f8037f = true;
                dVar.f8048a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f8054g.length != 0) {
            boolean z11 = false;
            while (!z11) {
                int i11 = this.f8036e.i();
                for (int i12 = 0; i12 < i11; i12++) {
                    SolverVariable b11 = this.f8036e.b(i12);
                    if (b11.f8012d != -1 || b11.f8015g || b11.n) {
                        this.f8035d.add(b11);
                    }
                }
                int size = this.f8035d.size();
                if (size > 0) {
                    for (int i13 = 0; i13 < size; i13++) {
                        SolverVariable solverVariable = this.f8035d.get(i13);
                        if (solverVariable.f8015g) {
                            A(dVar, solverVariable, true);
                        } else if (solverVariable.n) {
                            C(dVar, solverVariable, true);
                        } else {
                            B(dVar, dVar.f8054g[solverVariable.f8012d], true);
                        }
                    }
                    this.f8035d.clear();
                } else {
                    z11 = true;
                }
            }
            if (d.t && this.f8032a != null && this.f8036e.i() == 0) {
                this.f8037f = true;
                dVar.f8048a = true;
            }
        }
    }

    public SolverVariable a(d dVar, boolean[] zArr) {
        return w(zArr, (SolverVariable) null);
    }

    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f8032a = null;
            this.f8036e.clear();
            for (int i11 = 0; i11 < bVar.f8036e.i(); i11++) {
                this.f8036e.f(bVar.f8036e.b(i11), bVar.f8036e.k(i11), true);
            }
        }
    }

    public void c(SolverVariable solverVariable) {
        int i11 = solverVariable.f8013e;
        float f11 = 1.0f;
        if (i11 != 1) {
            if (i11 == 2) {
                f11 = 1000.0f;
            } else if (i11 == 3) {
                f11 = 1000000.0f;
            } else if (i11 == 4) {
                f11 = 1.0E9f;
            } else if (i11 == 5) {
                f11 = 1.0E12f;
            }
        }
        this.f8036e.c(solverVariable, f11);
    }

    public void clear() {
        this.f8036e.clear();
        this.f8032a = null;
        this.f8033b = 0.0f;
    }

    public b d(d dVar, int i11) {
        this.f8036e.c(dVar.o(i11, "ep"), 1.0f);
        this.f8036e.c(dVar.o(i11, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(SolverVariable solverVariable, int i11) {
        this.f8036e.c(solverVariable, (float) i11);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z11;
        SolverVariable g11 = g(dVar);
        if (g11 == null) {
            z11 = true;
        } else {
            x(g11);
            z11 = false;
        }
        if (this.f8036e.i() == 0) {
            this.f8037f = true;
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public SolverVariable g(d dVar) {
        boolean u11;
        boolean u12;
        int i11 = this.f8036e.i();
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        boolean z11 = false;
        boolean z12 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float k = this.f8036e.k(i12);
            SolverVariable b11 = this.f8036e.b(i12);
            if (b11.j == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    u12 = u(b11, dVar);
                } else if (f11 > k) {
                    u12 = u(b11, dVar);
                } else if (!z11 && u(b11, dVar)) {
                    f11 = k;
                    solverVariable = b11;
                    z11 = true;
                }
                z11 = u12;
                f11 = k;
                solverVariable = b11;
            } else if (solverVariable == null && k < 0.0f) {
                if (solverVariable2 == null) {
                    u11 = u(b11, dVar);
                } else if (f12 > k) {
                    u11 = u(b11, dVar);
                } else if (!z12 && u(b11, dVar)) {
                    f12 = k;
                    solverVariable2 = b11;
                    z12 = true;
                }
                z12 = u11;
                f12 = k;
                solverVariable2 = b11;
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    public SolverVariable getKey() {
        return this.f8032a;
    }

    /* access modifiers changed from: package-private */
    public b h(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, float f11, SolverVariable solverVariable3, SolverVariable solverVariable4, int i12) {
        if (solverVariable2 == solverVariable3) {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable4, 1.0f);
            this.f8036e.c(solverVariable2, -2.0f);
            return this;
        }
        if (f11 == 0.5f) {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
            this.f8036e.c(solverVariable3, -1.0f);
            this.f8036e.c(solverVariable4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                this.f8033b = (float) ((-i11) + i12);
            }
        } else if (f11 <= 0.0f) {
            this.f8036e.c(solverVariable, -1.0f);
            this.f8036e.c(solverVariable2, 1.0f);
            this.f8033b = (float) i11;
        } else if (f11 >= 1.0f) {
            this.f8036e.c(solverVariable4, -1.0f);
            this.f8036e.c(solverVariable3, 1.0f);
            this.f8033b = (float) (-i12);
        } else {
            float f12 = 1.0f - f11;
            this.f8036e.c(solverVariable, f12 * 1.0f);
            this.f8036e.c(solverVariable2, f12 * -1.0f);
            this.f8036e.c(solverVariable3, -1.0f * f11);
            this.f8036e.c(solverVariable4, 1.0f * f11);
            if (i11 > 0 || i12 > 0) {
                this.f8033b = (((float) (-i11)) * f12) + (((float) i12) * f11);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(SolverVariable solverVariable, int i11) {
        this.f8032a = solverVariable;
        float f11 = (float) i11;
        solverVariable.f8014f = f11;
        this.f8033b = f11;
        this.f8037f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f8032a == null && this.f8033b == 0.0f && this.f8036e.i() == 0;
    }

    /* access modifiers changed from: package-private */
    public b j(SolverVariable solverVariable, SolverVariable solverVariable2, float f11) {
        this.f8036e.c(solverVariable, -1.0f);
        this.f8036e.c(solverVariable2, f11);
        return this;
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11) {
        this.f8036e.c(solverVariable, -1.0f);
        this.f8036e.c(solverVariable2, 1.0f);
        this.f8036e.c(solverVariable3, f11);
        this.f8036e.c(solverVariable4, -f11);
        return this;
    }

    public b l(float f11, float f12, float f13, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f8033b = 0.0f;
        if (f12 == 0.0f || f11 == f13) {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
            this.f8036e.c(solverVariable4, 1.0f);
            this.f8036e.c(solverVariable3, -1.0f);
        } else if (f11 == 0.0f) {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
        } else if (f13 == 0.0f) {
            this.f8036e.c(solverVariable3, 1.0f);
            this.f8036e.c(solverVariable4, -1.0f);
        } else {
            float f14 = (f11 / f12) / (f13 / f12);
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
            this.f8036e.c(solverVariable4, f14);
            this.f8036e.c(solverVariable3, -f14);
        }
        return this;
    }

    public b m(SolverVariable solverVariable, int i11) {
        if (i11 < 0) {
            this.f8033b = (float) (i11 * -1);
            this.f8036e.c(solverVariable, 1.0f);
        } else {
            this.f8033b = (float) i11;
            this.f8036e.c(solverVariable, -1.0f);
        }
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f8033b = (float) i11;
        }
        if (!z11) {
            this.f8036e.c(solverVariable, -1.0f);
            this.f8036e.c(solverVariable2, 1.0f);
        } else {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
        }
        return this;
    }

    public b o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f8033b = (float) i11;
        }
        if (!z11) {
            this.f8036e.c(solverVariable, -1.0f);
            this.f8036e.c(solverVariable2, 1.0f);
            this.f8036e.c(solverVariable3, 1.0f);
        } else {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
            this.f8036e.c(solverVariable3, -1.0f);
        }
        return this;
    }

    public b p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f8033b = (float) i11;
        }
        if (!z11) {
            this.f8036e.c(solverVariable, -1.0f);
            this.f8036e.c(solverVariable2, 1.0f);
            this.f8036e.c(solverVariable3, -1.0f);
        } else {
            this.f8036e.c(solverVariable, 1.0f);
            this.f8036e.c(solverVariable2, -1.0f);
            this.f8036e.c(solverVariable3, 1.0f);
        }
        return this;
    }

    public b q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11) {
        this.f8036e.c(solverVariable3, 0.5f);
        this.f8036e.c(solverVariable4, 0.5f);
        this.f8036e.c(solverVariable, -0.5f);
        this.f8036e.c(solverVariable2, -0.5f);
        this.f8033b = -f11;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f11 = this.f8033b;
        if (f11 < 0.0f) {
            this.f8033b = f11 * -1.0f;
            this.f8036e.g();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        SolverVariable solverVariable = this.f8032a;
        return solverVariable != null && (solverVariable.j == SolverVariable.Type.UNRESTRICTED || this.f8033b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean t(SolverVariable solverVariable) {
        return this.f8036e.a(solverVariable);
    }

    public String toString() {
        return z();
    }

    public SolverVariable v(SolverVariable solverVariable) {
        return w((boolean[]) null, solverVariable);
    }

    /* access modifiers changed from: package-private */
    public void x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f8032a;
        if (solverVariable2 != null) {
            this.f8036e.c(solverVariable2, -1.0f);
            this.f8032a.f8012d = -1;
            this.f8032a = null;
        }
        float h11 = this.f8036e.h(solverVariable, true) * -1.0f;
        this.f8032a = solverVariable;
        if (h11 != 1.0f) {
            this.f8033b /= h11;
            this.f8036e.e(h11);
        }
    }

    public void y() {
        this.f8032a = null;
        this.f8036e.clear();
        this.f8033b = 0.0f;
        this.f8037f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f8032a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f8032a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f8033b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f8033b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            androidx.constraintlayout.core.b$a r5 = r10.f8036e
            int r5 = r5.i()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ec
            androidx.constraintlayout.core.b$a r6 = r10.f8036e
            androidx.constraintlayout.core.SolverVariable r6 = r6.b(r2)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            androidx.constraintlayout.core.b$a r7 = r10.f8036e
            float r7 = r7.k(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0093:
            if (r8 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r9
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = 1
        L_0x00e8:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f8036e = new a(this, cVar);
    }
}
