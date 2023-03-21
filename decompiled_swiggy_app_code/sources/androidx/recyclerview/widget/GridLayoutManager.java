package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    boolean I = false;
    int K = -1;
    int[] L;
    View[] M;
    final SparseIntArray N = new SparseIntArray();
    final SparseIntArray O = new SparseIntArray();
    c P = new a();
    final Rect Q = new Rect();
    private boolean R;

    public static final class a extends c {
        public int e(int i11, int i12) {
            return i11 % i12;
        }

        public int f(int i11) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f11095a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f11096b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f11097c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11098d = false;

        static int a(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 < 0 || i14 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i14);
        }

        /* access modifiers changed from: package-private */
        public int b(int i11, int i12) {
            if (!this.f11098d) {
                return d(i11, i12);
            }
            int i13 = this.f11096b.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int d11 = d(i11, i12);
            this.f11096b.put(i11, d11);
            return d11;
        }

        /* access modifiers changed from: package-private */
        public int c(int i11, int i12) {
            if (!this.f11097c) {
                return e(i11, i12);
            }
            int i13 = this.f11095a.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int e11 = e(i11, i12);
            this.f11095a.put(i11, e11);
            return e11;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f11098d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f11096b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f11096b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f11097c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f11095a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f11095a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i11);

        public void g() {
            this.f11096b.clear();
        }

        public void h() {
            this.f11095a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        o3(RecyclerView.o.p0(context, attributeSet, i11, i12).f11211b);
    }

    private void W2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i11, boolean z11) {
        int i12;
        int i13;
        int i14 = 0;
        int i15 = -1;
        if (z11) {
            i15 = i11;
            i13 = 0;
            i12 = 1;
        } else {
            i13 = i11 - 1;
            i12 = -1;
        }
        while (i13 != i15) {
            View view = this.M[i13];
            b bVar = (b) view.getLayoutParams();
            int j32 = j3(vVar, a0Var, o0(view));
            bVar.f11094f = j32;
            bVar.f11093e = i14;
            i14 += j32;
            i13 += i12;
        }
    }

    private void X2() {
        int U = U();
        for (int i11 = 0; i11 < U; i11++) {
            b bVar = (b) T(i11).getLayoutParams();
            int b11 = bVar.b();
            this.N.put(b11, bVar.g());
            this.O.put(b11, bVar.f());
        }
    }

    private void Y2(int i11) {
        this.L = Z2(this.L, this.K, i11);
    }

    static int[] Z2(int[] iArr, int i11, int i12) {
        int i13;
        if (!(iArr != null && iArr.length == i11 + 1 && iArr[iArr.length - 1] == i12)) {
            iArr = new int[(i11 + 1)];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i12 / i11;
        int i16 = i12 % i11;
        int i17 = 0;
        for (int i18 = 1; i18 <= i11; i18++) {
            i14 += i16;
            if (i14 <= 0 || i11 - i14 >= i16) {
                i13 = i15;
            } else {
                i13 = i15 + 1;
                i14 -= i11;
            }
            i17 += i13;
            iArr[i18] = i17;
        }
        return iArr;
    }

    private void a3() {
        this.N.clear();
        this.O.clear();
    }

    private int b3(RecyclerView.a0 a0Var) {
        int i11;
        if (!(U() == 0 || a0Var.b() == 0)) {
            c2();
            boolean z22 = z2();
            View h22 = h2(!z22, true);
            View g22 = g2(!z22, true);
            if (!(h22 == null || g22 == null)) {
                int b11 = this.P.b(o0(h22), this.K);
                int b12 = this.P.b(o0(g22), this.K);
                int min = Math.min(b11, b12);
                int max = Math.max(b11, b12);
                int b13 = this.P.b(a0Var.b() - 1, this.K) + 1;
                if (this.f11102x) {
                    i11 = Math.max(0, (b13 - max) - 1);
                } else {
                    i11 = Math.max(0, min);
                }
                if (!z22) {
                    return i11;
                }
                return Math.round((((float) i11) * (((float) Math.abs(this.f11100u.d(g22) - this.f11100u.g(h22))) / ((float) ((this.P.b(o0(g22), this.K) - this.P.b(o0(h22), this.K)) + 1)))) + ((float) (this.f11100u.m() - this.f11100u.g(h22))));
            }
        }
        return 0;
    }

    private int c3(RecyclerView.a0 a0Var) {
        if (!(U() == 0 || a0Var.b() == 0)) {
            c2();
            View h22 = h2(!z2(), true);
            View g22 = g2(!z2(), true);
            if (!(h22 == null || g22 == null)) {
                if (!z2()) {
                    return this.P.b(a0Var.b() - 1, this.K) + 1;
                }
                int d11 = this.f11100u.d(g22) - this.f11100u.g(h22);
                int b11 = this.P.b(o0(h22), this.K);
                return (int) ((((float) d11) / ((float) ((this.P.b(o0(g22), this.K) - b11) + 1))) * ((float) (this.P.b(a0Var.b() - 1, this.K) + 1)));
            }
        }
        return 0;
    }

    private void d3(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i11) {
        boolean z11 = i11 == 1;
        int i32 = i3(vVar, a0Var, aVar.f11109b);
        if (z11) {
            while (i32 > 0) {
                int i12 = aVar.f11109b;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    aVar.f11109b = i13;
                    i32 = i3(vVar, a0Var, i13);
                } else {
                    return;
                }
            }
            return;
        }
        int b11 = a0Var.b() - 1;
        int i14 = aVar.f11109b;
        while (i14 < b11) {
            int i15 = i14 + 1;
            int i33 = i3(vVar, a0Var, i15);
            if (i33 <= i32) {
                break;
            }
            i14 = i15;
            i32 = i33;
        }
        aVar.f11109b = i14;
    }

    private void e3() {
        View[] viewArr = this.M;
        if (viewArr == null || viewArr.length != this.K) {
            this.M = new View[this.K];
        }
    }

    private int h3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i11) {
        if (!a0Var.e()) {
            return this.P.b(i11, this.K);
        }
        int f11 = vVar.f(i11);
        if (f11 != -1) {
            return this.P.b(f11, this.K);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i11);
        return 0;
    }

    private int i3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i11) {
        if (!a0Var.e()) {
            return this.P.c(i11, this.K);
        }
        int i12 = this.O.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int f11 = vVar.f(i11);
        if (f11 != -1) {
            return this.P.c(f11, this.K);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 0;
    }

    private int j3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i11) {
        if (!a0Var.e()) {
            return this.P.f(i11);
        }
        int i12 = this.N.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int f11 = vVar.f(i11);
        if (f11 != -1) {
            return this.P.f(f11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 1;
    }

    private void l3(float f11, int i11) {
        Y2(Math.max(Math.round(f11 * ((float) this.K)), i11));
    }

    private void m3(View view, int i11, boolean z11) {
        int i12;
        int i13;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f11215b;
        int i14 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i15 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int f32 = f3(bVar.f11093e, bVar.f11094f);
        if (this.f11099s == 1) {
            i12 = RecyclerView.o.V(f32, i11, i15, bVar.width, false);
            i13 = RecyclerView.o.V(this.f11100u.n(), i0(), i14, bVar.height, true);
        } else {
            int V = RecyclerView.o.V(f32, i11, i14, bVar.height, false);
            int V2 = RecyclerView.o.V(this.f11100u.n(), w0(), i15, bVar.width, true);
            i13 = V;
            i12 = V2;
        }
        n3(view, i12, i13, z11);
    }

    private void n3(View view, int i11, int i12, boolean z11) {
        boolean z12;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z11) {
            z12 = Q1(view, i11, i12, pVar);
        } else {
            z12 = O1(view, i11, i12, pVar);
        }
        if (z12) {
            view.measure(i11, i12);
        }
    }

    private void q3() {
        int i11;
        int i12;
        if (w2() == 1) {
            i12 = v0() - getPaddingRight();
            i11 = getPaddingLeft();
        } else {
            i12 = h0() - getPaddingBottom();
            i11 = getPaddingTop();
        }
        Y2(i12 - i11);
    }

    /* access modifiers changed from: package-private */
    public void A2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        View d11;
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int l11 = this.f11100u.l();
        boolean z11 = false;
        boolean z12 = l11 != 1073741824;
        int i22 = U() > 0 ? this.L[this.K] : 0;
        if (z12) {
            q3();
        }
        boolean z13 = cVar2.f11121e == 1;
        int i23 = this.K;
        if (!z13) {
            i23 = i3(vVar2, a0Var2, cVar2.f11120d) + j3(vVar2, a0Var2, cVar2.f11120d);
        }
        int i24 = 0;
        while (i24 < this.K && cVar2.c(a0Var2) && i23 > 0) {
            int i25 = cVar2.f11120d;
            int j32 = j3(vVar2, a0Var2, i25);
            if (j32 <= this.K) {
                i23 -= j32;
                if (i23 < 0 || (d11 = cVar2.d(vVar2)) == null) {
                    break;
                }
                this.M[i24] = d11;
                i24++;
            } else {
                throw new IllegalArgumentException("Item at position " + i25 + " requires " + j32 + " spans but GridLayoutManager has only " + this.K + " spans.");
            }
        }
        if (i24 == 0) {
            bVar2.f11114b = true;
            return;
        }
        float f11 = 0.0f;
        W2(vVar2, a0Var2, i24, z13);
        int i26 = 0;
        int i27 = 0;
        while (i26 < i24) {
            View view = this.M[i26];
            if (cVar2.f11126l == null) {
                if (z13) {
                    q(view);
                } else {
                    r(view, z11);
                }
            } else if (z13) {
                o(view);
            } else {
                p(view, z11 ? 1 : 0);
            }
            w(view, this.Q);
            m3(view, l11, z11);
            int e11 = this.f11100u.e(view);
            if (e11 > i27) {
                i27 = e11;
            }
            float f12 = (((float) this.f11100u.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f11094f);
            if (f12 > f11) {
                f11 = f12;
            }
            i26++;
            z11 = false;
        }
        if (z12) {
            l3(f11, i22);
            i27 = 0;
            for (int i28 = 0; i28 < i24; i28++) {
                View view2 = this.M[i28];
                m3(view2, 1073741824, true);
                int e12 = this.f11100u.e(view2);
                if (e12 > i27) {
                    i27 = e12;
                }
            }
        }
        for (int i29 = 0; i29 < i24; i29++) {
            View view3 = this.M[i29];
            if (this.f11100u.e(view3) != i27) {
                b bVar3 = (b) view3.getLayoutParams();
                Rect rect = bVar3.f11215b;
                int i31 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i32 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int f32 = f3(bVar3.f11093e, bVar3.f11094f);
                if (this.f11099s == 1) {
                    i21 = RecyclerView.o.V(f32, 1073741824, i32, bVar3.width, false);
                    i19 = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    i19 = RecyclerView.o.V(f32, 1073741824, i31, bVar3.height, false);
                    i21 = makeMeasureSpec;
                }
                n3(view3, i21, i19, true);
            }
        }
        int i33 = 0;
        bVar2.f11113a = i27;
        if (this.f11099s == 1) {
            if (cVar2.f11122f == -1) {
                i14 = cVar2.f11118b;
                i11 = i14 - i27;
            } else {
                int i34 = cVar2.f11118b;
                i11 = i34;
                i14 = i27 + i34;
            }
            i13 = 0;
            i12 = 0;
        } else if (cVar2.f11122f == -1) {
            int i35 = cVar2.f11118b;
            i12 = i35 - i27;
            i11 = 0;
            i13 = i35;
            i14 = 0;
        } else {
            int i36 = cVar2.f11118b;
            i13 = i27 + i36;
            i12 = i36;
            i14 = 0;
            i11 = 0;
        }
        while (i33 < i24) {
            View view4 = this.M[i33];
            b bVar4 = (b) view4.getLayoutParams();
            if (this.f11099s == 1) {
                if (y2()) {
                    int paddingLeft = getPaddingLeft() + this.L[this.K - bVar4.f11093e];
                    i18 = i14;
                    i17 = paddingLeft;
                    i16 = paddingLeft - this.f11100u.f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.L[bVar4.f11093e];
                    i18 = i14;
                    i16 = paddingLeft2;
                    i17 = this.f11100u.f(view4) + paddingLeft2;
                }
                i15 = i11;
            } else {
                int paddingTop = getPaddingTop() + this.L[bVar4.f11093e];
                i15 = paddingTop;
                i17 = i13;
                i16 = i12;
                i18 = this.f11100u.f(view4) + paddingTop;
            }
            H0(view4, i16, i15, i17, i18);
            if (bVar4.d() || bVar4.c()) {
                bVar2.f11115c = true;
            }
            bVar2.f11116d |= view4.hasFocusable();
            i33++;
            i14 = i18;
            i13 = i17;
            i12 = i16;
            i11 = i15;
        }
        Arrays.fill(this.M, (Object) null);
    }

    public int C(RecyclerView.a0 a0Var) {
        if (this.R) {
            return b3(a0Var);
        }
        return super.C(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void C2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i11) {
        super.C2(vVar, a0Var, aVar, i11);
        q3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            d3(vVar, a0Var, aVar, i11);
        }
        e3();
    }

    public int D(RecyclerView.a0 a0Var) {
        if (this.R) {
            return c3(a0Var);
        }
        return super.D(a0Var);
    }

    public int F(RecyclerView.a0 a0Var) {
        if (this.R) {
            return b3(a0Var);
        }
        return super.F(a0Var);
    }

    public int F1(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        q3();
        e3();
        return super.F1(i11, vVar, a0Var);
    }

    public int G(RecyclerView.a0 a0Var) {
        if (this.R) {
            return c3(a0Var);
        }
        return super.G(a0Var);
    }

    public int H1(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        q3();
        e3();
        return super.H1(i11, vVar, a0Var);
    }

    public void L1(Rect rect, int i11, int i12) {
        int i13;
        int i14;
        if (this.L == null) {
            super.L1(rect, i11, i12);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f11099s == 1) {
            i14 = RecyclerView.o.y(i12, rect.height() + paddingTop, m0());
            int[] iArr = this.L;
            i13 = RecyclerView.o.y(i11, iArr[iArr.length - 1] + paddingLeft, n0());
        } else {
            i13 = RecyclerView.o.y(i11, rect.width() + paddingLeft, n0());
            int[] iArr2 = this.L;
            i14 = RecyclerView.o.y(i12, iArr2[iArr2.length - 1] + paddingTop, m0());
        }
        K1(i13, i14);
    }

    public void N2(boolean z11) {
        if (!z11) {
            super.N2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public RecyclerView.p O() {
        if (this.f11099s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.p P(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.p Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View R0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.M(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f11093e
            int r5 = r5.f11094f
            int r5 = r5 + r6
            android.view.View r7 = super.R0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.a2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f11102x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.U()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.U()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f11099s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.y2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.h3(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.h3(r1, r2, r10)
            android.view.View r1 = r0.T(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f11093e
            r18 = r3
            int r3 = r9.f11094f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.G0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f11093e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f11093e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.R0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public boolean U1() {
        return this.D == null && !this.I;
    }

    /* access modifiers changed from: package-private */
    public void W1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i11 = this.K;
        for (int i12 = 0; i12 < this.K && cVar.c(a0Var) && i11 > 0; i12++) {
            int i13 = cVar.f11120d;
            cVar2.a(i13, Math.max(0, cVar.f11123g));
            i11 -= this.P.f(i13);
            cVar.f11120d += cVar.f11121e;
        }
    }

    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.W0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int h32 = h3(vVar, a0Var, bVar.b());
        if (this.f11099s == 0) {
            cVar.f0(c.C0047c.b(bVar.f(), bVar.g(), h32, 1, false, false));
            return;
        }
        cVar.f0(c.C0047c.b(h32, 1, bVar.f(), bVar.g(), false, false));
    }

    public int Y(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f11099s == 1) {
            return this.K;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return h3(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    public void Z0(RecyclerView recyclerView, int i11, int i12) {
        this.P.h();
        this.P.g();
    }

    public void a1(RecyclerView recyclerView) {
        this.P.h();
        this.P.g();
    }

    public void b1(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.P.h();
        this.P.g();
    }

    public void c1(RecyclerView recyclerView, int i11, int i12) {
        this.P.h();
        this.P.g();
    }

    public void e1(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.P.h();
        this.P.g();
    }

    public void f1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            X2();
        }
        super.f1(vVar, a0Var);
        a3();
    }

    /* access modifiers changed from: package-private */
    public int f3(int i11, int i12) {
        if (this.f11099s != 1 || !y2()) {
            int[] iArr = this.L;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.L;
        int i13 = this.K;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    public void g1(RecyclerView.a0 a0Var) {
        super.g1(a0Var);
        this.I = false;
    }

    public int g3() {
        return this.K;
    }

    public c k3() {
        return this.P;
    }

    public void o3(int i11) {
        if (i11 != this.K) {
            this.I = true;
            if (i11 >= 1) {
                this.K = i11;
                this.P.h();
                C1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i11);
        }
    }

    public void p3(c cVar) {
        this.P = cVar;
    }

    /* access modifiers changed from: package-private */
    public View q2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z11, boolean z12) {
        int i11;
        int U = U();
        int i12 = -1;
        int i13 = 1;
        if (z12) {
            i11 = U() - 1;
            i13 = -1;
        } else {
            i12 = U;
            i11 = 0;
        }
        int b11 = a0Var.b();
        c2();
        int m11 = this.f11100u.m();
        int i14 = this.f11100u.i();
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View T = T(i11);
            int o02 = o0(T);
            if (o02 >= 0 && o02 < b11 && i3(vVar, a0Var, o02) == 0) {
                if (((RecyclerView.p) T.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.f11100u.g(T) < i14 && this.f11100u.d(T) >= m11) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i11 += i13;
        }
        return view != null ? view : view2;
    }

    public int r0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f11099s == 0) {
            return this.K;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return h3(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    public boolean x(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        int f11093e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f11094f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int f() {
            return this.f11093e;
        }

        public int g() {
            return this.f11094f;
        }

        public b(int i11, int i12) {
            super(i11, i12);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        o3(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i12, z11);
        o3(i11);
    }
}
