package e0;

import androidx.compose.runtime.ComposerKt;
import e0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SlotTable.kt */
public final class x0 {
    public static final a v = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final v0 f14249a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int[] f14250b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Object[] f14251c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<c> f14252d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f14253e;

    /* renamed from: f  reason: collision with root package name */
    private int f14254f;

    /* renamed from: g  reason: collision with root package name */
    private int f14255g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f14256h;

    /* renamed from: i  reason: collision with root package name */
    private int f14257i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f14258l;

    /* renamed from: m  reason: collision with root package name */
    private int f14259m;
    /* access modifiers changed from: private */
    public int n;

    /* renamed from: o  reason: collision with root package name */
    private final w f14260o = new w();

    /* renamed from: p  reason: collision with root package name */
    private final w f14261p = new w();
    private final w q = new w();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f14262r;

    /* renamed from: s  reason: collision with root package name */
    private int f14263s = -1;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private k0 f14264u;

    /* compiled from: SlotTable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final List<c> b(x0 x0Var, int i11, x0 x0Var2, boolean z11, boolean z12) {
            boolean z13;
            ArrayList arrayList;
            boolean z14;
            int i12;
            int i13;
            int i14;
            x0 x0Var3 = x0Var;
            int i15 = i11;
            x0 x0Var4 = x0Var2;
            int c02 = x0Var.c0(i11);
            int i16 = i15 + c02;
            int b11 = x0Var.J(i11);
            int b12 = x0Var3.J(i16);
            int i17 = b12 - b11;
            boolean a11 = x0Var.G(i11);
            x0Var4.h0(c02);
            x0Var4.i0(i17, x0Var2.U());
            if (x0Var.f14253e < i16) {
                x0Var3.q0(i16);
            }
            if (x0Var.j < b12) {
                x0Var3.s0(b12, i16);
            }
            int[] i18 = x0Var2.f14250b;
            int U = x0Var2.U();
            int[] unused = g.h(x0Var.f14250b, i18, U * 5, i15 * 5, i16 * 5);
            Object[] k = x0Var2.f14251c;
            int g11 = x0Var2.f14256h;
            Object[] unused2 = g.j(x0Var.f14251c, k, g11, b11, b12);
            int V = x0Var2.V();
            w0.Z(i18, U, V);
            int i19 = U - i15;
            int i21 = U + c02;
            int c11 = g11 - x0Var4.K(i18, U);
            int m11 = x0Var2.f14258l;
            int i22 = V;
            int l11 = x0Var2.k;
            int length = k.length;
            boolean z15 = a11;
            int i23 = m11;
            int i24 = g11;
            int i25 = U;
            while (true) {
                z13 = false;
                if (i25 >= i21) {
                    break;
                }
                if (i25 != U) {
                    i12 = i21;
                    w0.Z(i18, i25, w0.R(i18, i25) + i19);
                } else {
                    i12 = i21;
                }
                int c12 = x0Var4.K(i18, i25) + c11;
                if (i23 < i25) {
                    i13 = c11;
                    i14 = 0;
                } else {
                    i13 = c11;
                    i14 = x0Var2.j;
                }
                w0.V(i18, i25, x0Var4.M(c12, i14, l11, length));
                if (i25 == i23) {
                    i23++;
                }
                i25++;
                c11 = i13;
                i21 = i12;
            }
            int i26 = i21;
            x0Var4.f14258l = i23;
            int n = w0.N(x0Var.f14252d, i15, x0Var.W());
            int n11 = w0.N(x0Var.f14252d, i16, x0Var.W());
            if (n < n11) {
                ArrayList f11 = x0Var.f14252d;
                ArrayList arrayList2 = new ArrayList(n11 - n);
                for (int i27 = n; i27 < n11; i27++) {
                    Object obj = f11.get(i27);
                    p.i(obj, "sourceAnchors[anchorIndex]");
                    c cVar = (c) obj;
                    cVar.c(cVar.a() + i19);
                    arrayList2.add(cVar);
                }
                x0Var2.f14252d.addAll(w0.N(x0Var2.f14252d, x0Var2.U(), x0Var2.W()), arrayList2);
                f11.subList(n, n11).clear();
                arrayList = arrayList2;
            } else {
                arrayList = k.j();
            }
            int y02 = x0Var.y0(i11);
            int i28 = 1;
            if (z11) {
                if (y02 >= 0) {
                    z13 = true;
                }
                if (z13) {
                    x0Var.T0();
                    x0Var3.z(y02 - x0Var.U());
                    x0Var.T0();
                }
                x0Var3.z(i15 - x0Var.U());
                z14 = x0Var.E0();
                if (z13) {
                    x0Var.O0();
                    x0Var.N();
                    x0Var.O0();
                    x0Var.N();
                }
            } else {
                boolean s11 = x0Var3.F0(i15, c02);
                x0Var3.G0(b11, i17, i15 - 1);
                z14 = s11;
            }
            if (!z14) {
                int j = x0Var2.n;
                if (!w0.L(i18, U)) {
                    i28 = w0.O(i18, U);
                }
                x0Var4.n = j + i28;
                if (z12) {
                    x0Var4.f14262r = i26;
                    x0Var4.f14256h = i24 + i17;
                }
                if (z15) {
                    x0Var4.a1(i22);
                }
                return arrayList;
            }
            ComposerKt.x("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SlotTable.kt */
    public static final class b implements Iterator<Object>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private int f14265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x0 f14267c;

        b(int i11, int i12, x0 x0Var) {
            this.f14266b = i12;
            this.f14267c = x0Var;
            this.f14265a = i11;
        }

        public boolean hasNext() {
            return this.f14265a < this.f14266b;
        }

        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] k = this.f14267c.f14251c;
            x0 x0Var = this.f14267c;
            int i11 = this.f14265a;
            this.f14265a = i11 + 1;
            return k[x0Var.L(i11)];
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x0(v0 v0Var) {
        p.j(v0Var, "table");
        this.f14249a = v0Var;
        this.f14250b = v0Var.g();
        this.f14251c = v0Var.i();
        this.f14252d = v0Var.f();
        this.f14253e = v0Var.h();
        this.f14254f = (this.f14250b.length / 5) - v0Var.h();
        this.f14255g = v0Var.h();
        this.j = v0Var.k();
        this.k = this.f14251c.length - v0Var.k();
        this.f14258l = v0Var.h();
    }

    private final int A0(int i11) {
        return i11 > -2 ? i11 : W() + i11 + 2;
    }

    private final int B0(int i11, int i12) {
        return i11 < i12 ? i11 : -((W() - i11) + 2);
    }

    private final int C(int[] iArr, int i11) {
        return K(iArr, i11) + w0.D(w0.F(iArr, i11) >> 29);
    }

    private final void C0() {
        k0 k0Var = this.f14264u;
        if (k0Var != null) {
            while (k0Var.b()) {
                b1(k0Var.d(), k0Var);
            }
        }
    }

    private final boolean D0(int i11, int i12) {
        int i13 = i12 + i11;
        int n11 = w0.N(this.f14252d, i13, S() - this.f14254f);
        if (n11 >= this.f14252d.size()) {
            n11--;
        }
        int i14 = n11 + 1;
        boolean z11 = false;
        int i15 = 0;
        while (n11 >= 0) {
            c cVar = this.f14252d.get(n11);
            p.i(cVar, "anchors[index]");
            c cVar2 = cVar;
            int B = B(cVar2);
            if (B < i11) {
                break;
            }
            if (B < i13) {
                cVar2.c(Integer.MIN_VALUE);
                if (i15 == 0) {
                    i15 = n11 + 1;
                }
                i14 = n11;
            }
            n11--;
        }
        if (i14 < i15) {
            z11 = true;
        }
        if (z11) {
            this.f14252d.subList(i14, i15).clear();
        }
        return z11;
    }

    private final boolean E(int i11) {
        int i12 = i11 + 1;
        int c02 = i11 + c0(i11);
        while (i12 < c02) {
            if (w0.B(this.f14250b, Z(i12))) {
                return true;
            }
            i12 += c0(i12);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean F0(int i11, int i12) {
        boolean z11 = false;
        if (i12 > 0) {
            ArrayList<c> arrayList = this.f14252d;
            q0(i11);
            if (!arrayList.isEmpty()) {
                z11 = D0(i11, i12);
            }
            this.f14253e = i11;
            this.f14254f += i12;
            int i13 = this.f14258l;
            if (i13 > i11) {
                this.f14258l = Math.max(i11, i13 - i12);
            }
            int i14 = this.f14255g;
            if (i14 >= this.f14253e) {
                this.f14255g = i14 - i12;
            }
            if (H(this.f14263s)) {
                a1(this.f14263s);
            }
        }
        return z11;
    }

    /* access modifiers changed from: private */
    public final boolean G(int i11) {
        return i11 >= 0 && w0.B(this.f14250b, Z(i11));
    }

    /* access modifiers changed from: private */
    public final void G0(int i11, int i12, int i13) {
        if (i12 > 0) {
            int i14 = this.k;
            int i15 = i11 + i12;
            s0(i15, i13);
            this.j = i11;
            this.k = i14 + i12;
            g.t(this.f14251c, null, i11, i15);
            int i16 = this.f14257i;
            if (i16 >= i11) {
                this.f14257i = i16 - i12;
            }
        }
    }

    private final boolean H(int i11) {
        return i11 >= 0 && w0.C(this.f14250b, Z(i11));
    }

    private final int I(int i11, int i12, int i13) {
        return i11 < 0 ? (i13 - i12) + i11 + 1 : i11;
    }

    private final int I0() {
        int S = (S() - this.f14254f) - this.f14261p.h();
        this.f14255g = S;
        return S;
    }

    /* access modifiers changed from: private */
    public final int J(int i11) {
        return K(this.f14250b, Z(i11));
    }

    private final void J0() {
        this.f14261p.i((S() - this.f14254f) - this.f14255g);
    }

    /* access modifiers changed from: private */
    public final int K(int[] iArr, int i11) {
        if (i11 >= S()) {
            return this.f14251c.length - this.k;
        }
        return I(w0.E(iArr, i11), this.k, this.f14251c.length);
    }

    /* access modifiers changed from: private */
    public final int L(int i11) {
        return i11 < this.j ? i11 : i11 + this.k;
    }

    /* access modifiers changed from: private */
    public final int M(int i11, int i12, int i13, int i14) {
        return i11 > i12 ? -(((i14 - i13) - i11) + 1) : i11;
    }

    private final void R(int i11, int i12, int i13) {
        int B0 = B0(i11, this.f14253e);
        while (i13 < i12) {
            w0.Z(this.f14250b, Z(i13), B0);
            int g11 = w0.G(this.f14250b, Z(i13)) + i13;
            R(i13, g11, i13 + 1);
            i13 = g11;
        }
    }

    private final int R0(int[] iArr, int i11) {
        if (i11 >= S()) {
            return this.f14251c.length - this.k;
        }
        return I(w0.T(iArr, i11), this.k, this.f14251c.length);
    }

    private final int S() {
        return this.f14250b.length / 5;
    }

    private final void V0(int i11, Object obj, boolean z11, Object obj2) {
        int i12;
        Object obj3 = obj;
        Object obj4 = obj2;
        boolean z12 = this.f14259m > 0;
        this.q.i(this.n);
        if (z12) {
            h0(1);
            int i13 = this.f14262r;
            int Z = Z(i13);
            g.a aVar = g.f14172a;
            boolean z13 = obj3 != aVar.a();
            boolean z14 = !z11 && obj4 != aVar.a();
            w0.K(this.f14250b, Z, i11, z11, z13, z14, this.f14263s, this.f14256h);
            this.f14257i = this.f14256h;
            int i14 = (z11 ? 1 : 0) + (z13 ? 1 : 0) + (z14 ? 1 : 0);
            if (i14 > 0) {
                i0(i14, i13);
                Object[] objArr = this.f14251c;
                int i15 = this.f14256h;
                if (z11) {
                    objArr[i15] = obj4;
                    i15++;
                }
                if (z13) {
                    objArr[i15] = obj3;
                    i15++;
                }
                if (z14) {
                    objArr[i15] = obj4;
                    i15++;
                }
                this.f14256h = i15;
            }
            this.n = 0;
            i12 = i13 + 1;
            this.f14263s = i13;
            this.f14262r = i12;
        } else {
            this.f14260o.i(this.f14263s);
            J0();
            int i16 = this.f14262r;
            int Z2 = Z(i16);
            if (!p.e(obj4, g.f14172a.a())) {
                if (z11) {
                    e1(obj4);
                } else {
                    Z0(obj4);
                }
            }
            this.f14256h = R0(this.f14250b, Z2);
            this.f14257i = K(this.f14250b, Z(this.f14262r + 1));
            this.n = w0.O(this.f14250b, Z2);
            this.f14263s = i16;
            this.f14262r = i16 + 1;
            i12 = i16 + w0.G(this.f14250b, Z2);
        }
        this.f14255g = i12;
    }

    private final void Y0(int i11, int i12) {
        int i13;
        int S = S() - this.f14254f;
        if (i11 < i12) {
            int n11 = w0.N(this.f14252d, i11, S);
            while (n11 < this.f14252d.size()) {
                c cVar = this.f14252d.get(n11);
                p.i(cVar, "anchors[index]");
                c cVar2 = cVar;
                int a11 = cVar2.a();
                if (a11 < 0 && (i13 = a11 + S) < i12) {
                    cVar2.c(i13);
                    n11++;
                } else {
                    return;
                }
            }
            return;
        }
        int n12 = w0.N(this.f14252d, i12, S);
        while (n12 < this.f14252d.size()) {
            c cVar3 = this.f14252d.get(n12);
            p.i(cVar3, "anchors[index]");
            c cVar4 = cVar3;
            int a12 = cVar4.a();
            if (a12 >= 0) {
                cVar4.c(-(S - a12));
                n12++;
            } else {
                return;
            }
        }
    }

    private final int Z(int i11) {
        return i11 < this.f14253e ? i11 : i11 + this.f14254f;
    }

    /* access modifiers changed from: private */
    public final void a1(int i11) {
        if (i11 >= 0) {
            k0 k0Var = this.f14264u;
            if (k0Var == null) {
                k0Var = new k0((List) null, 1, (i) null);
                this.f14264u = k0Var;
            }
            k0Var.a(i11);
        }
    }

    private final void b1(int i11, k0 k0Var) {
        int Z = Z(i11);
        boolean E = E(i11);
        if (w0.C(this.f14250b, Z) != E) {
            w0.U(this.f14250b, Z, E);
            int y02 = y0(i11);
            if (y02 >= 0) {
                k0Var.a(y02);
            }
        }
    }

    private final void c1(int[] iArr, int i11, int i12) {
        w0.V(iArr, i11, M(i12, this.j, this.k, this.f14251c.length));
    }

    private final void f1(int i11, Object obj) {
        int Z = Z(i11);
        int[] iArr = this.f14250b;
        if (Z < iArr.length && w0.L(iArr, Z)) {
            this.f14251c[L(x0(this.f14250b, Z))] = obj;
            return;
        }
        ComposerKt.x(("Updating the node of a group at " + i11 + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    /* access modifiers changed from: private */
    public final void h0(int i11) {
        if (i11 > 0) {
            int i12 = this.f14262r;
            q0(i12);
            int i13 = this.f14253e;
            int i14 = this.f14254f;
            int[] iArr = this.f14250b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            int i16 = 0;
            if (i14 < i11) {
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                int[] iArr2 = new int[(max * 5)];
                int i17 = max - i15;
                int[] unused = g.h(iArr, iArr2, 0, 0, i13 * 5);
                int[] unused2 = g.h(iArr, iArr2, (i13 + i17) * 5, (i14 + i13) * 5, length * 5);
                this.f14250b = iArr2;
                i14 = i17;
            }
            int i18 = this.f14255g;
            if (i18 >= i13) {
                this.f14255g = i18 + i11;
            }
            int i19 = i13 + i11;
            this.f14253e = i19;
            this.f14254f = i14 - i11;
            int J = i15 > 0 ? J(i12 + i11) : 0;
            if (this.f14258l >= i13) {
                i16 = this.j;
            }
            int M = M(J, i16, this.k, this.f14251c.length);
            for (int i21 = i13; i21 < i19; i21++) {
                w0.V(this.f14250b, i21, M);
            }
            int i22 = this.f14258l;
            if (i22 >= i13) {
                this.f14258l = i22 + i11;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void i0(int i11, int i12) {
        if (i11 > 0) {
            s0(this.f14256h, i12);
            int i13 = this.j;
            int i14 = this.k;
            if (i14 < i11) {
                Object[] objArr = this.f14251c;
                int length = objArr.length;
                int i15 = length - i14;
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                Object[] objArr2 = new Object[max];
                for (int i16 = 0; i16 < max; i16++) {
                    objArr2[i16] = null;
                }
                int i17 = max - i15;
                Object[] unused = g.j(objArr, objArr2, 0, 0, i13);
                Object[] unused2 = g.j(objArr, objArr2, i13 + i17, i14 + i13, length);
                this.f14251c = objArr2;
                i14 = i17;
            }
            int i18 = this.f14257i;
            if (i18 >= i13) {
                this.f14257i = i18 + i11;
            }
            this.j = i13 + i11;
            this.k = i14 - i11;
        }
    }

    public static /* synthetic */ void m0(x0 x0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = x0Var.f14263s;
        }
        x0Var.l0(i11);
    }

    private final void n0(int i11, int i12, int i13) {
        int i14 = i13 + i11;
        int W = W();
        int n11 = w0.N(this.f14252d, i11, W);
        ArrayList arrayList = new ArrayList();
        if (n11 >= 0) {
            while (n11 < this.f14252d.size()) {
                c cVar = this.f14252d.get(n11);
                p.i(cVar, "anchors[index]");
                c cVar2 = cVar;
                int B = B(cVar2);
                if (B < i11 || B >= i14) {
                    break;
                }
                arrayList.add(cVar2);
                this.f14252d.remove(n11);
            }
        }
        int i15 = i12 - i11;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            c cVar3 = (c) arrayList.get(i16);
            int B2 = B(cVar3) + i15;
            if (B2 >= this.f14253e) {
                cVar3.c(-(W - B2));
            } else {
                cVar3.c(B2);
            }
            this.f14252d.add(w0.N(this.f14252d, B2, W), cVar3);
        }
    }

    /* access modifiers changed from: private */
    public final void q0(int i11) {
        int i12;
        int i13 = this.f14254f;
        int i14 = this.f14253e;
        if (i14 != i11) {
            boolean z11 = true;
            if (!this.f14252d.isEmpty()) {
                Y0(i14, i11);
            }
            if (i13 > 0) {
                int[] iArr = this.f14250b;
                int i15 = i11 * 5;
                int i16 = i13 * 5;
                int i17 = i14 * 5;
                if (i11 < i14) {
                    int[] unused = g.h(iArr, iArr, i16 + i15, i15, i17);
                } else {
                    int[] unused2 = g.h(iArr, iArr, i17, i17 + i16, i15 + i16);
                }
            }
            if (i11 < i14) {
                i14 = i11 + i13;
            }
            int S = S();
            if (i12 >= S) {
                z11 = false;
            }
            ComposerKt.X(z11);
            while (i12 < S) {
                int r11 = w0.R(this.f14250b, i12);
                int B0 = B0(A0(r11), i11);
                if (B0 != r11) {
                    w0.Z(this.f14250b, i12, B0);
                }
                i12++;
                if (i12 == i11) {
                    i12 += i13;
                }
            }
        }
        this.f14253e = i11;
    }

    /* access modifiers changed from: private */
    public final void s0(int i11, int i12) {
        int i13 = this.k;
        int i14 = this.j;
        int i15 = this.f14258l;
        if (i14 != i11) {
            Object[] objArr = this.f14251c;
            if (i11 < i14) {
                Object[] unused = g.j(objArr, objArr, i11 + i13, i11, i14);
            } else {
                Object[] unused2 = g.j(objArr, objArr, i14, i14 + i13, i11 + i13);
            }
            g.t(objArr, null, i11, i11 + i13);
        }
        int min = Math.min(i12 + 1, W());
        if (i15 != min) {
            int length = this.f14251c.length - i13;
            if (min < i15) {
                int Z = Z(min);
                int Z2 = Z(i15);
                int i16 = this.f14253e;
                while (Z < Z2) {
                    int e11 = w0.E(this.f14250b, Z);
                    if (e11 >= 0) {
                        w0.V(this.f14250b, Z, -((length - e11) + 1));
                        Z++;
                        if (Z == i16) {
                            Z += this.f14254f;
                        }
                    } else {
                        ComposerKt.x("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int Z3 = Z(i15);
                int Z4 = Z(min);
                while (Z3 < Z4) {
                    int e12 = w0.E(this.f14250b, Z3);
                    if (e12 < 0) {
                        w0.V(this.f14250b, Z3, e12 + length + 1);
                        Z3++;
                        if (Z3 == this.f14253e) {
                            Z3 += this.f14254f;
                        }
                    } else {
                        ComposerKt.x("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f14258l = min;
        }
        this.j = i11;
    }

    private final int x0(int[] iArr, int i11) {
        return K(iArr, i11);
    }

    private final int z0(int[] iArr, int i11) {
        return A0(w0.R(iArr, Z(i11)));
    }

    public final c A(int i11) {
        ArrayList<c> arrayList = this.f14252d;
        int s11 = w0.S(arrayList, i11, W());
        if (s11 < 0) {
            if (i11 > this.f14253e) {
                i11 = -(W() - i11);
            }
            c cVar = new c(i11);
            arrayList.add(-(s11 + 1), cVar);
            return cVar;
        }
        c cVar2 = arrayList.get(s11);
        p.i(cVar2, "get(location)");
        return cVar2;
    }

    public final int B(c cVar) {
        p.j(cVar, "anchor");
        int a11 = cVar.a();
        return a11 < 0 ? a11 + W() : a11;
    }

    public final void D() {
        int i11 = this.f14259m;
        this.f14259m = i11 + 1;
        if (i11 == 0) {
            J0();
        }
    }

    public final boolean E0() {
        if (this.f14259m == 0) {
            int i11 = this.f14262r;
            int i12 = this.f14256h;
            int N0 = N0();
            k0 k0Var = this.f14264u;
            if (k0Var != null) {
                while (k0Var.b() && k0Var.c() >= i11) {
                    k0Var.d();
                }
            }
            boolean F0 = F0(i11, this.f14262r - i11);
            G0(i12, this.f14256h - i12, i11 - 1);
            this.f14262r = i11;
            this.f14256h = i12;
            this.n -= N0;
            return F0;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final void F() {
        this.t = true;
        if (this.f14260o.d()) {
            q0(W());
            s0(this.f14251c.length - this.k, this.f14253e);
            C0();
        }
        this.f14249a.c(this, this.f14250b, this.f14253e, this.f14251c, this.j, this.f14252d);
    }

    public final void H0() {
        if (this.f14259m == 0) {
            C0();
            this.f14262r = 0;
            this.f14255g = S() - this.f14254f;
            this.f14256h = 0;
            this.f14257i = 0;
            this.n = 0;
            return;
        }
        ComposerKt.x("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object K0(int i11, Object obj) {
        int R0 = R0(this.f14250b, Z(this.f14262r));
        boolean z11 = true;
        int K = K(this.f14250b, Z(this.f14262r + 1));
        int i12 = R0 + i11;
        if (i12 < R0 || i12 >= K) {
            z11 = false;
        }
        if (z11) {
            int L = L(i12);
            Object[] objArr = this.f14251c;
            Object obj2 = objArr[L];
            objArr[L] = obj;
            return obj2;
        }
        ComposerKt.x(("Write to an invalid slot index " + i11 + " for group " + this.f14262r).toString());
        throw new KotlinNothingValueException();
    }

    public final void L0(Object obj) {
        int i11 = this.f14256h;
        if (i11 <= this.f14257i) {
            this.f14251c[L(i11 - 1)] = obj;
        } else {
            ComposerKt.x("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object M0() {
        if (this.f14259m > 0) {
            i0(1, this.f14263s);
        }
        Object[] objArr = this.f14251c;
        int i11 = this.f14256h;
        this.f14256h = i11 + 1;
        return objArr[L(i11)];
    }

    public final int N() {
        int i11 = 1;
        int i12 = 0;
        boolean z11 = this.f14259m > 0;
        int i13 = this.f14262r;
        int i14 = this.f14255g;
        int i15 = this.f14263s;
        int Z = Z(i15);
        int i16 = this.n;
        int i17 = i13 - i15;
        boolean l11 = w0.L(this.f14250b, Z);
        if (z11) {
            w0.W(this.f14250b, Z, i17);
            w0.Y(this.f14250b, Z, i16);
            int h11 = this.q.h();
            if (!l11) {
                i11 = i16;
            }
            this.n = h11 + i11;
            this.f14263s = z0(this.f14250b, i15);
        } else {
            if (i13 != i14) {
                i11 = 0;
            }
            if (i11 != 0) {
                int g11 = w0.G(this.f14250b, Z);
                int o11 = w0.O(this.f14250b, Z);
                w0.W(this.f14250b, Z, i17);
                w0.Y(this.f14250b, Z, i16);
                int h12 = this.f14260o.h();
                I0();
                this.f14263s = h12;
                int z02 = z0(this.f14250b, i15);
                int h13 = this.q.h();
                this.n = h13;
                if (z02 == h12) {
                    if (!l11) {
                        i12 = i16 - o11;
                    }
                    this.n = h13 + i12;
                } else {
                    int i18 = i17 - g11;
                    int i19 = l11 ? 0 : i16 - o11;
                    if (!(i18 == 0 && i19 == 0)) {
                        while (z02 != 0 && z02 != h12 && (i19 != 0 || i18 != 0)) {
                            int Z2 = Z(z02);
                            if (i18 != 0) {
                                w0.W(this.f14250b, Z2, w0.G(this.f14250b, Z2) + i18);
                            }
                            if (i19 != 0) {
                                int[] iArr = this.f14250b;
                                w0.Y(iArr, Z2, w0.O(iArr, Z2) + i19);
                            }
                            if (w0.L(this.f14250b, Z2)) {
                                i19 = 0;
                            }
                            z02 = z0(this.f14250b, z02);
                        }
                    }
                    this.n += i19;
                }
            } else {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
        }
        return i16;
    }

    public final int N0() {
        int Z = Z(this.f14262r);
        int g11 = this.f14262r + w0.G(this.f14250b, Z);
        this.f14262r = g11;
        this.f14256h = K(this.f14250b, Z(g11));
        if (w0.L(this.f14250b, Z)) {
            return 1;
        }
        return w0.O(this.f14250b, Z);
    }

    public final void O() {
        int i11 = this.f14259m;
        boolean z11 = true;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f14259m = i12;
            if (i12 == 0) {
                if (this.q.b() != this.f14260o.b()) {
                    z11 = false;
                }
                if (z11) {
                    I0();
                } else {
                    ComposerKt.x("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    public final void O0() {
        int i11 = this.f14255g;
        this.f14262r = i11;
        this.f14256h = K(this.f14250b, Z(i11));
    }

    public final void P(int i11) {
        boolean z11 = true;
        if (this.f14259m <= 0) {
            int i12 = this.f14263s;
            if (i12 != i11) {
                if (i11 < i12 || i11 >= this.f14255g) {
                    z11 = false;
                }
                if (z11) {
                    int i13 = this.f14262r;
                    int i14 = this.f14256h;
                    int i15 = this.f14257i;
                    this.f14262r = i11;
                    T0();
                    this.f14262r = i13;
                    this.f14256h = i14;
                    this.f14257i = i15;
                    return;
                }
                throw new IllegalArgumentException(("Started group at " + i11 + " must be a subgroup of the group at " + i12).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    public final Object P0(int i11, int i12) {
        int R0 = R0(this.f14250b, Z(i11));
        boolean z11 = true;
        int K = K(this.f14250b, Z(i11 + 1));
        int i13 = i12 + R0;
        if (R0 > i13 || i13 >= K) {
            z11 = false;
        }
        if (!z11) {
            return g.f14172a.a();
        }
        return this.f14251c[L(i13)];
    }

    public final void Q(c cVar) {
        p.j(cVar, "anchor");
        P(cVar.e(this));
    }

    public final Object Q0(c cVar, int i11) {
        p.j(cVar, "anchor");
        return P0(B(cVar), i11);
    }

    public final void S0(int i11, Object obj, Object obj2) {
        V0(i11, obj, false, obj2);
    }

    public final boolean T() {
        return this.t;
    }

    public final void T0() {
        if (this.f14259m == 0) {
            g.a aVar = g.f14172a;
            V0(0, aVar.a(), false, aVar.a());
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    public final int U() {
        return this.f14262r;
    }

    public final void U0(int i11, Object obj) {
        V0(i11, obj, false, g.f14172a.a());
    }

    public final int V() {
        return this.f14263s;
    }

    public final int W() {
        return S() - this.f14254f;
    }

    public final void W0(Object obj) {
        V0(125, obj, true, g.f14172a.a());
    }

    public final v0 X() {
        return this.f14249a;
    }

    public final Object X0(Object obj) {
        Object M0 = M0();
        L0(obj);
        return M0;
    }

    public final Object Y(int i11) {
        int Z = Z(i11);
        return w0.H(this.f14250b, Z) ? this.f14251c[C(this.f14250b, Z)] : g.f14172a.a();
    }

    public final void Z0(Object obj) {
        int Z = Z(this.f14262r);
        if (w0.H(this.f14250b, Z)) {
            this.f14251c[L(C(this.f14250b, Z))] = obj;
        } else {
            ComposerKt.x("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final int a0(int i11) {
        return w0.M(this.f14250b, Z(i11));
    }

    public final Object b0(int i11) {
        int Z = Z(i11);
        if (w0.J(this.f14250b, Z)) {
            return this.f14251c[w0.Q(this.f14250b, Z)];
        }
        return null;
    }

    public final int c0(int i11) {
        return w0.G(this.f14250b, Z(i11));
    }

    public final Iterator<Object> d0() {
        int K = K(this.f14250b, Z(this.f14262r));
        int[] iArr = this.f14250b;
        int i11 = this.f14262r;
        return new b(K, K(iArr, Z(i11 + c0(i11))), this);
    }

    public final void d1(c cVar, Object obj) {
        p.j(cVar, "anchor");
        f1(cVar.e(this), obj);
    }

    public final boolean e0(int i11) {
        return f0(i11, this.f14262r);
    }

    public final void e1(Object obj) {
        f1(this.f14262r, obj);
    }

    public final boolean f0(int i11, int i12) {
        int i13;
        int c02;
        if (i12 == this.f14263s) {
            i13 = this.f14255g;
        } else {
            if (i12 > this.f14260o.g(0)) {
                c02 = c0(i12);
            } else {
                int c11 = this.f14260o.c(i12);
                if (c11 < 0) {
                    c02 = c0(i12);
                } else {
                    i13 = (S() - this.f14254f) - this.f14261p.f(c11);
                }
            }
            i13 = c02 + i12;
        }
        if (i11 <= i12 || i11 >= i13) {
            return false;
        }
        return true;
    }

    public final boolean g0(int i11) {
        int i12 = this.f14263s;
        return (i11 > i12 && i11 < this.f14255g) || (i12 == 0 && i11 == 0);
    }

    public final boolean j0() {
        int i11 = this.f14262r;
        return i11 < this.f14255g && w0.L(this.f14250b, Z(i11));
    }

    public final boolean k0(int i11) {
        return w0.L(this.f14250b, Z(i11));
    }

    public final void l0(int i11) {
        int Z = Z(i11);
        if (!w0.I(this.f14250b, Z)) {
            w0.X(this.f14250b, Z, true);
            if (!w0.C(this.f14250b, Z)) {
                a1(y0(i11));
            }
        }
    }

    public final List<c> o0(v0 v0Var, int i11) {
        p.j(v0Var, "table");
        if (!(this.f14259m > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i11 == 0 && this.f14262r == 0 && this.f14249a.h() == 0) {
            int[] iArr = this.f14250b;
            Object[] objArr = this.f14251c;
            ArrayList<c> arrayList = this.f14252d;
            int[] g11 = v0Var.g();
            int h11 = v0Var.h();
            Object[] i12 = v0Var.i();
            int k11 = v0Var.k();
            this.f14250b = g11;
            this.f14251c = i12;
            this.f14252d = v0Var.f();
            this.f14253e = h11;
            this.f14254f = (g11.length / 5) - h11;
            this.j = k11;
            this.k = i12.length - k11;
            this.f14258l = h11;
            v0Var.r(iArr, 0, objArr, 0, arrayList);
            return this.f14252d;
        } else {
            x0 p11 = v0Var.p();
            try {
                return v.b(p11, i11, this, true, true);
            } finally {
                p11.F();
            }
        }
    }

    public final void p0(int i11) {
        if (this.f14259m == 0) {
            if (!(i11 >= 0)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            } else if (i11 != 0) {
                int i12 = this.f14262r;
                int i13 = this.f14263s;
                int i14 = this.f14255g;
                int i15 = i11;
                int i16 = i12;
                while (i15 > 0) {
                    i16 += w0.G(this.f14250b, Z(i16));
                    if (i16 <= i14) {
                        i15--;
                    } else {
                        throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
                    }
                }
                int g11 = w0.G(this.f14250b, Z(i16));
                int i17 = this.f14256h;
                int K = K(this.f14250b, Z(i16));
                int i18 = i16 + g11;
                int K2 = K(this.f14250b, Z(i18));
                int i19 = K2 - K;
                i0(i19, Math.max(this.f14262r - 1, 0));
                h0(g11);
                int[] iArr = this.f14250b;
                int Z = Z(i18) * 5;
                int[] unused = g.h(iArr, iArr, Z(i12) * 5, Z, (g11 * 5) + Z);
                if (i19 > 0) {
                    Object[] objArr = this.f14251c;
                    Object[] unused2 = g.j(objArr, objArr, i17, L(K + i19), L(K2 + i19));
                }
                int i21 = K + i19;
                int i22 = i21 - i17;
                int i23 = this.j;
                int i24 = this.k;
                int length = this.f14251c.length;
                int i25 = this.f14258l;
                int i26 = i12 + g11;
                int i27 = i12;
                while (i27 < i26) {
                    int Z2 = Z(i27);
                    int i28 = i23;
                    int i29 = i22;
                    c1(iArr, Z2, M(K(iArr, Z2) - i22, i25 < Z2 ? 0 : i28, i24, length));
                    i27++;
                    i23 = i28;
                    i22 = i29;
                }
                n0(i18, i12, g11);
                if (!F0(i18, g11)) {
                    R(i13, this.f14255g, i12);
                    if (i19 > 0) {
                        G0(i21, i19, i18 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.x("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
        } else {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public final List<c> r0(int i11, v0 v0Var, int i12) {
        p.j(v0Var, "table");
        boolean z11 = true;
        if (this.f14259m > 0 || c0(this.f14262r + i11) != 1) {
            z11 = false;
        }
        ComposerKt.X(z11);
        int i13 = this.f14262r;
        int i14 = this.f14256h;
        int i15 = this.f14257i;
        z(i11);
        T0();
        D();
        x0 p11 = v0Var.p();
        try {
            List<c> a11 = v.b(p11, i12, this, false, true);
            p11.F();
            O();
            N();
            this.f14262r = i13;
            this.f14256h = i14;
            this.f14257i = i15;
            return a11;
        } catch (Throwable th2) {
            p11.F();
            throw th2;
        }
    }

    public final List<c> t0(c cVar, int i11, x0 x0Var) {
        p.j(cVar, "anchor");
        p.j(x0Var, "writer");
        boolean z11 = true;
        if (x0Var.f14259m > 0) {
            if (!(this.f14259m == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (cVar.b()) {
                int B = B(cVar) + i11;
                int i12 = this.f14262r;
                if (i12 <= B && B < this.f14255g) {
                    int y02 = y0(B);
                    int c02 = c0(B);
                    int w02 = k0(B) ? 1 : w0(B);
                    List<c> a11 = v.b(this, B, x0Var, false, false);
                    a1(y02);
                    boolean z12 = w02 > 0;
                    while (y02 >= i12) {
                        int Z = Z(y02);
                        int[] iArr = this.f14250b;
                        w0.W(iArr, Z, w0.G(iArr, Z) - c02);
                        if (z12) {
                            if (w0.L(this.f14250b, Z)) {
                                z12 = false;
                            } else {
                                int[] iArr2 = this.f14250b;
                                w0.Y(iArr2, Z, w0.O(iArr2, Z) - w02);
                            }
                        }
                        y02 = y0(y02);
                    }
                    if (z12) {
                        if (this.n < w02) {
                            z11 = false;
                        }
                        ComposerKt.X(z11);
                        this.n -= w02;
                    }
                    return a11;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public String toString() {
        return "SlotWriter(current = " + this.f14262r + " end=" + this.f14255g + " size = " + W() + " gap=" + this.f14253e + '-' + (this.f14253e + this.f14254f) + ')';
    }

    public final Object u0(int i11) {
        int Z = Z(i11);
        if (w0.L(this.f14250b, Z)) {
            return this.f14251c[L(x0(this.f14250b, Z))];
        }
        return null;
    }

    public final Object v0(c cVar) {
        p.j(cVar, "anchor");
        return u0(cVar.e(this));
    }

    public final int w0(int i11) {
        return w0.O(this.f14250b, Z(i11));
    }

    public final int y0(int i11) {
        return z0(this.f14250b, i11);
    }

    public final void z(int i11) {
        boolean z11 = true;
        if (i11 >= 0) {
            if (!(this.f14259m <= 0)) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i11 != 0) {
                int i12 = this.f14262r + i11;
                if (i12 < this.f14263s || i12 > this.f14255g) {
                    z11 = false;
                }
                if (z11) {
                    this.f14262r = i12;
                    int K = K(this.f14250b, Z(i12));
                    this.f14256h = K;
                    this.f14257i = K;
                    return;
                }
                ComposerKt.x(("Cannot seek outside the current group (" + this.f14263s + '-' + this.f14255g + ')').toString());
                throw new KotlinNothingValueException();
            }
        } else {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
    }
}
