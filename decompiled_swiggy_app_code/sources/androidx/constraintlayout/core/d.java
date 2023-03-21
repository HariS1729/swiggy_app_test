package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f8042r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f8043s = true;
    public static boolean t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f8044u = true;
    public static boolean v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f8045w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static long f8046x;

    /* renamed from: y  reason: collision with root package name */
    public static long f8047y;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8048a;

    /* renamed from: b  reason: collision with root package name */
    int f8049b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, SolverVariable> f8050c;

    /* renamed from: d  reason: collision with root package name */
    private a f8051d;

    /* renamed from: e  reason: collision with root package name */
    private int f8052e;

    /* renamed from: f  reason: collision with root package name */
    private int f8053f;

    /* renamed from: g  reason: collision with root package name */
    b[] f8054g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8055h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8056i;
    private boolean[] j;
    int k;

    /* renamed from: l  reason: collision with root package name */
    int f8057l;

    /* renamed from: m  reason: collision with root package name */
    private int f8058m;
    final c n;

    /* renamed from: o  reason: collision with root package name */
    private SolverVariable[] f8059o;

    /* renamed from: p  reason: collision with root package name */
    private int f8060p;
    private a q;

    /* compiled from: LinearSystem */
    interface a {
        SolverVariable a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem */
    class b extends b {
        public b(c cVar) {
            this.f8036e = new h(this, cVar);
        }
    }

    public d() {
        this.f8048a = false;
        this.f8049b = 0;
        this.f8050c = null;
        this.f8052e = 32;
        this.f8053f = 32;
        this.f8054g = null;
        this.f8055h = false;
        this.f8056i = false;
        this.j = new boolean[32];
        this.k = 1;
        this.f8057l = 0;
        this.f8058m = 32;
        this.f8059o = new SolverVariable[f8045w];
        this.f8060p = 0;
        this.f8054g = new b[32];
        C();
        c cVar = new c();
        this.n = cVar;
        this.f8051d = new g(cVar);
        if (v) {
            this.q = new b(cVar);
        } else {
            this.q = new b(cVar);
        }
    }

    private final int B(a aVar, boolean z11) {
        for (int i11 = 0; i11 < this.k; i11++) {
            this.j[i11] = false;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            i12++;
            if (i12 >= this.k * 2) {
                return i12;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().f8011c] = true;
            }
            SolverVariable a11 = aVar.a(this, this.j);
            if (a11 != null) {
                boolean[] zArr = this.j;
                int i13 = a11.f8011c;
                if (zArr[i13]) {
                    return i12;
                }
                zArr[i13] = true;
            }
            if (a11 != null) {
                float f11 = Float.MAX_VALUE;
                int i14 = -1;
                for (int i15 = 0; i15 < this.f8057l; i15++) {
                    b bVar = this.f8054g[i15];
                    if (bVar.f8032a.j != SolverVariable.Type.UNRESTRICTED && !bVar.f8037f && bVar.t(a11)) {
                        float d11 = bVar.f8036e.d(a11);
                        if (d11 < 0.0f) {
                            float f12 = (-bVar.f8033b) / d11;
                            if (f12 < f11) {
                                i14 = i15;
                                f11 = f12;
                            }
                        }
                    }
                }
                if (i14 > -1) {
                    b bVar2 = this.f8054g[i14];
                    bVar2.f8032a.f8012d = -1;
                    bVar2.x(a11);
                    SolverVariable solverVariable = bVar2.f8032a;
                    solverVariable.f8012d = i14;
                    solverVariable.m(this, bVar2);
                }
            } else {
                z12 = true;
            }
        }
        return i12;
    }

    private void C() {
        int i11 = 0;
        if (v) {
            while (i11 < this.f8057l) {
                b bVar = this.f8054g[i11];
                if (bVar != null) {
                    this.n.f8038a.a(bVar);
                }
                this.f8054g[i11] = null;
                i11++;
            }
            return;
        }
        while (i11 < this.f8057l) {
            b bVar2 = this.f8054g[i11];
            if (bVar2 != null) {
                this.n.f8039b.a(bVar2);
            }
            this.f8054g[i11] = null;
            i11++;
        }
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable b11 = this.n.f8040c.b();
        if (b11 == null) {
            b11 = new SolverVariable(type, str);
            b11.l(type, str);
        } else {
            b11.j();
            b11.l(type, str);
        }
        int i11 = this.f8060p;
        int i12 = f8045w;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f8045w = i13;
            this.f8059o = (SolverVariable[]) Arrays.copyOf(this.f8059o, i13);
        }
        SolverVariable[] solverVariableArr = this.f8059o;
        int i14 = this.f8060p;
        this.f8060p = i14 + 1;
        solverVariableArr[i14] = b11;
        return b11;
    }

    private final void l(b bVar) {
        int i11;
        if (!t || !bVar.f8037f) {
            b[] bVarArr = this.f8054g;
            int i12 = this.f8057l;
            bVarArr[i12] = bVar;
            SolverVariable solverVariable = bVar.f8032a;
            solverVariable.f8012d = i12;
            this.f8057l = i12 + 1;
            solverVariable.m(this, bVar);
        } else {
            bVar.f8032a.k(this, bVar.f8033b);
        }
        if (t && this.f8048a) {
            int i13 = 0;
            while (i13 < this.f8057l) {
                if (this.f8054g[i13] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f8054g;
                if (bVarArr2[i13] != null && bVarArr2[i13].f8037f) {
                    b bVar2 = bVarArr2[i13];
                    bVar2.f8032a.k(this, bVar2.f8033b);
                    if (v) {
                        this.n.f8038a.a(bVar2);
                    } else {
                        this.n.f8039b.a(bVar2);
                    }
                    this.f8054g[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f8057l;
                        if (i14 >= i11) {
                            break;
                        }
                        b[] bVarArr3 = this.f8054g;
                        int i16 = i14 - 1;
                        bVarArr3[i16] = bVarArr3[i14];
                        if (bVarArr3[i16].f8032a.f8012d == i14) {
                            bVarArr3[i16].f8032a.f8012d = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f8054g[i15] = null;
                    }
                    this.f8057l = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f8048a = false;
        }
    }

    private void n() {
        for (int i11 = 0; i11 < this.f8057l; i11++) {
            b bVar = this.f8054g[i11];
            bVar.f8032a.f8014f = bVar.f8033b;
        }
    }

    public static b s(d dVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f11) {
        return dVar.r().j(solverVariable, solverVariable2, f11);
    }

    private int u(a aVar) throws Exception {
        boolean z11;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f8057l) {
                z11 = false;
                break;
            }
            b[] bVarArr = this.f8054g;
            if (bVarArr[i11].f8032a.j != SolverVariable.Type.UNRESTRICTED && bVarArr[i11].f8033b < 0.0f) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (!z11) {
            return 0;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            i12++;
            float f11 = Float.MAX_VALUE;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < this.f8057l; i16++) {
                b bVar = this.f8054g[i16];
                if (bVar.f8032a.j != SolverVariable.Type.UNRESTRICTED && !bVar.f8037f && bVar.f8033b < 0.0f) {
                    int i17 = 9;
                    if (f8044u) {
                        int i18 = bVar.f8036e.i();
                        int i19 = 0;
                        while (i19 < i18) {
                            SolverVariable b11 = bVar.f8036e.b(i19);
                            float d11 = bVar.f8036e.d(b11);
                            if (d11 > 0.0f) {
                                int i21 = 0;
                                while (i21 < i17) {
                                    float f12 = b11.f8016h[i21] / d11;
                                    if ((f12 < f11 && i21 == i15) || i21 > i15) {
                                        i14 = b11.f8011c;
                                        i15 = i21;
                                        i13 = i16;
                                        f11 = f12;
                                    }
                                    i21++;
                                    i17 = 9;
                                }
                            }
                            i19++;
                            i17 = 9;
                        }
                    } else {
                        for (int i22 = 1; i22 < this.k; i22++) {
                            SolverVariable solverVariable = this.n.f8041d[i22];
                            float d12 = bVar.f8036e.d(solverVariable);
                            if (d12 > 0.0f) {
                                for (int i23 = 0; i23 < 9; i23++) {
                                    float f13 = solverVariable.f8016h[i23] / d12;
                                    if ((f13 < f11 && i23 == i15) || i23 > i15) {
                                        i14 = i22;
                                        i13 = i16;
                                        i15 = i23;
                                        f11 = f13;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i13 != -1) {
                b bVar2 = this.f8054g[i13];
                bVar2.f8032a.f8012d = -1;
                bVar2.x(this.n.f8041d[i14]);
                SolverVariable solverVariable2 = bVar2.f8032a;
                solverVariable2.f8012d = i13;
                solverVariable2.m(this, bVar2);
            } else {
                z12 = true;
            }
            if (i12 > this.k / 2) {
                z12 = true;
            }
        }
        return i12;
    }

    public static g2.a w() {
        return null;
    }

    private void y() {
        int i11 = this.f8052e * 2;
        this.f8052e = i11;
        this.f8054g = (b[]) Arrays.copyOf(this.f8054g, i11);
        c cVar = this.n;
        cVar.f8041d = (SolverVariable[]) Arrays.copyOf(cVar.f8041d, this.f8052e);
        int i12 = this.f8052e;
        this.j = new boolean[i12];
        this.f8053f = i12;
        this.f8058m = i12;
    }

    /* access modifiers changed from: package-private */
    public void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i11 = 0;
        while (true) {
            cVar = this.n;
            SolverVariable[] solverVariableArr = cVar.f8041d;
            if (i11 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i11];
            if (solverVariable != null) {
                solverVariable.j();
            }
            i11++;
        }
        cVar.f8040c.c(this.f8059o, this.f8060p);
        this.f8060p = 0;
        Arrays.fill(this.n.f8041d, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.f8050c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f8049b = 0;
        this.f8051d.clear();
        this.k = 1;
        for (int i12 = 0; i12 < this.f8057l; i12++) {
            b[] bVarArr = this.f8054g;
            if (bVarArr[i12] != null) {
                bVarArr[i12].f8034c = false;
            }
        }
        C();
        this.f8057l = 0;
        if (v) {
            this.q = new b(this.n);
        } else {
            this.q = new b(this.n);
        }
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f11, int i11) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable q11 = q(constraintWidget3.q(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable q12 = q(constraintWidget3.q(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable q13 = q(constraintWidget3.q(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable q14 = q(constraintWidget3.q(type4));
        SolverVariable q15 = q(constraintWidget4.q(type));
        SolverVariable q16 = q(constraintWidget4.q(type2));
        SolverVariable q17 = q(constraintWidget4.q(type3));
        SolverVariable q18 = q(constraintWidget4.q(type4));
        b r11 = r();
        double d11 = (double) f11;
        SolverVariable solverVariable = q17;
        double d12 = (double) i11;
        r11.q(q12, q14, q16, q18, (float) (Math.sin(d11) * d12));
        d(r11);
        b r12 = r();
        r12.q(q11, q13, q15, solverVariable, (float) (Math.cos(d11) * d12));
        d(r12);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, float f11, SolverVariable solverVariable3, SolverVariable solverVariable4, int i12, int i13) {
        int i14 = i13;
        b r11 = r();
        r11.h(solverVariable, solverVariable2, i11, f11, solverVariable3, solverVariable4, i12);
        if (i14 != 8) {
            r11.d(this, i14);
        }
        d(r11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(androidx.constraintlayout.core.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f8057l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f8058m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.k
            int r0 = r0 + r1
            int r2 = r5.f8053f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.y()
        L_0x0015:
            r0 = 0
            boolean r2 = r6.f8037f
            if (r2 != 0) goto L_0x0084
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L_0x007b
            androidx.constraintlayout.core.SolverVariable r2 = r5.p()
            r6.f8032a = r2
            int r3 = r5.f8057l
            r5.l(r6)
            int r4 = r5.f8057l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            androidx.constraintlayout.core.d$a r0 = r5.q
            r0.b(r6)
            androidx.constraintlayout.core.d$a r0 = r5.q
            r5.B(r0, r1)
            int r0 = r2.f8012d
            r3 = -1
            if (r0 != r3) goto L_0x007c
            androidx.constraintlayout.core.SolverVariable r0 = r6.f8032a
            if (r0 != r2) goto L_0x0059
            androidx.constraintlayout.core.SolverVariable r0 = r6.v(r2)
            if (r0 == 0) goto L_0x0059
            r6.x(r0)
        L_0x0059:
            boolean r0 = r6.f8037f
            if (r0 != 0) goto L_0x0062
            androidx.constraintlayout.core.SolverVariable r0 = r6.f8032a
            r0.m(r5, r6)
        L_0x0062:
            boolean r0 = v
            if (r0 == 0) goto L_0x006e
            androidx.constraintlayout.core.c r0 = r5.n
            androidx.constraintlayout.core.e<androidx.constraintlayout.core.b> r0 = r0.f8038a
            r0.a(r6)
            goto L_0x0075
        L_0x006e:
            androidx.constraintlayout.core.c r0 = r5.n
            androidx.constraintlayout.core.e<androidx.constraintlayout.core.b> r0 = r0.f8039b
            r0.a(r6)
        L_0x0075:
            int r0 = r5.f8057l
            int r0 = r0 - r1
            r5.f8057l = r0
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r0 = r1
        L_0x0084:
            if (r0 != 0) goto L_0x0089
            r5.l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.d.d(androidx.constraintlayout.core.b):void");
    }

    public b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        if (!f8043s || i12 != 8 || !solverVariable2.f8015g || solverVariable.f8012d != -1) {
            b r11 = r();
            r11.n(solverVariable, solverVariable2, i11);
            if (i12 != 8) {
                r11.d(this, i12);
            }
            d(r11);
            return r11;
        }
        solverVariable.k(this, solverVariable2.f8014f + ((float) i11));
        return null;
    }

    public void f(SolverVariable solverVariable, int i11) {
        if (!f8043s || solverVariable.f8012d != -1) {
            int i12 = solverVariable.f8012d;
            if (i12 != -1) {
                b bVar = this.f8054g[i12];
                if (bVar.f8037f) {
                    bVar.f8033b = (float) i11;
                } else if (bVar.f8036e.i() == 0) {
                    bVar.f8037f = true;
                    bVar.f8033b = (float) i11;
                } else {
                    b r11 = r();
                    r11.m(solverVariable, i11);
                    d(r11);
                }
            } else {
                b r12 = r();
                r12.i(solverVariable, i11);
                d(r12);
            }
        } else {
            float f11 = (float) i11;
            solverVariable.k(this, f11);
            for (int i13 = 0; i13 < this.f8049b + 1; i13++) {
                SolverVariable solverVariable2 = this.n.f8041d[i13];
                if (solverVariable2 != null && solverVariable2.n && solverVariable2.f8020o == solverVariable.f8011c) {
                    solverVariable2.k(this, solverVariable2.f8021p + f11);
                }
            }
        }
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, boolean z11) {
        b r11 = r();
        SolverVariable t11 = t();
        t11.f8013e = 0;
        r11.o(solverVariable, solverVariable2, t11, i11);
        d(r11);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        b r11 = r();
        SolverVariable t11 = t();
        t11.f8013e = 0;
        r11.o(solverVariable, solverVariable2, t11, i11);
        if (i12 != 8) {
            m(r11, (int) (r11.f8036e.d(t11) * -1.0f), i12);
        }
        d(r11);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, boolean z11) {
        b r11 = r();
        SolverVariable t11 = t();
        t11.f8013e = 0;
        r11.p(solverVariable, solverVariable2, t11, i11);
        d(r11);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        b r11 = r();
        SolverVariable t11 = t();
        t11.f8013e = 0;
        r11.p(solverVariable, solverVariable2, t11, i11);
        if (i12 != 8) {
            m(r11, (int) (r11.f8036e.d(t11) * -1.0f), i12);
        }
        d(r11);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11, int i11) {
        b r11 = r();
        r11.k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f11);
        if (i11 != 8) {
            r11.d(this, i11);
        }
        d(r11);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, int i11, int i12) {
        bVar.e(o(i12, (String) null), i11);
    }

    public SolverVariable o(int i11, String str) {
        if (this.k + 1 >= this.f8053f) {
            y();
        }
        SolverVariable a11 = a(SolverVariable.Type.ERROR, str);
        int i12 = this.f8049b + 1;
        this.f8049b = i12;
        this.k++;
        a11.f8011c = i12;
        a11.f8013e = i11;
        this.n.f8041d[i12] = a11;
        this.f8051d.c(a11);
        return a11;
    }

    public SolverVariable p() {
        if (this.k + 1 >= this.f8053f) {
            y();
        }
        SolverVariable a11 = a(SolverVariable.Type.SLACK, (String) null);
        int i11 = this.f8049b + 1;
        this.f8049b = i11;
        this.k++;
        a11.f8011c = i11;
        this.n.f8041d[i11] = a11;
        return a11;
    }

    public SolverVariable q(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f8053f) {
            y();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.i();
            if (solverVariable == null) {
                constraintAnchor.s(this.n);
                solverVariable = constraintAnchor.i();
            }
            int i11 = solverVariable.f8011c;
            if (i11 == -1 || i11 > this.f8049b || this.n.f8041d[i11] == null) {
                if (i11 != -1) {
                    solverVariable.j();
                }
                int i12 = this.f8049b + 1;
                this.f8049b = i12;
                this.k++;
                solverVariable.f8011c = i12;
                solverVariable.j = SolverVariable.Type.UNRESTRICTED;
                this.n.f8041d[i12] = solverVariable;
            }
        }
        return solverVariable;
    }

    public b r() {
        b bVar;
        if (v) {
            bVar = this.n.f8038a.b();
            if (bVar == null) {
                bVar = new b(this.n);
                f8047y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = this.n.f8039b.b();
            if (bVar == null) {
                bVar = new b(this.n);
                f8046x++;
            } else {
                bVar.y();
            }
        }
        SolverVariable.h();
        return bVar;
    }

    public SolverVariable t() {
        if (this.k + 1 >= this.f8053f) {
            y();
        }
        SolverVariable a11 = a(SolverVariable.Type.SLACK, (String) null);
        int i11 = this.f8049b + 1;
        this.f8049b = i11;
        this.k++;
        a11.f8011c = i11;
        this.n.f8041d[i11] = a11;
        return a11;
    }

    public c v() {
        return this.n;
    }

    public int x(Object obj) {
        SolverVariable i11 = ((ConstraintAnchor) obj).i();
        if (i11 != null) {
            return (int) (i11.f8014f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.f8051d.isEmpty()) {
            n();
        } else if (this.f8055h || this.f8056i) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f8057l) {
                    z11 = true;
                    break;
                } else if (!this.f8054g[i11].f8037f) {
                    break;
                } else {
                    i11++;
                }
            }
            if (!z11) {
                A(this.f8051d);
            } else {
                n();
            }
        } else {
            A(this.f8051d);
        }
    }
}
