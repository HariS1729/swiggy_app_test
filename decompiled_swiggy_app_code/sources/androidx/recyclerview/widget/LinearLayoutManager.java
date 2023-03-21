package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s  reason: collision with root package name */
    int f11099s;
    private c t;

    /* renamed from: u  reason: collision with root package name */
    q f11100u;
    private boolean v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f11101w;

    /* renamed from: x  reason: collision with root package name */
    boolean f11102x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f11103y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11104z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f11105a;

        /* renamed from: b  reason: collision with root package name */
        int f11106b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11107c;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f11105a >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f11105a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f11105a);
            parcel.writeInt(this.f11106b);
            parcel.writeInt(this.f11107c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f11105a = parcel.readInt();
            this.f11106b = parcel.readInt();
            this.f11107c = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f11105a = savedState.f11105a;
            this.f11106b = savedState.f11106b;
            this.f11107c = savedState.f11107c;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        q f11108a;

        /* renamed from: b  reason: collision with root package name */
        int f11109b;

        /* renamed from: c  reason: collision with root package name */
        int f11110c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11111d;

        /* renamed from: e  reason: collision with root package name */
        boolean f11112e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i11;
            if (this.f11111d) {
                i11 = this.f11108a.i();
            } else {
                i11 = this.f11108a.m();
            }
            this.f11110c = i11;
        }

        public void b(View view, int i11) {
            if (this.f11111d) {
                this.f11110c = this.f11108a.d(view) + this.f11108a.o();
            } else {
                this.f11110c = this.f11108a.g(view);
            }
            this.f11109b = i11;
        }

        public void c(View view, int i11) {
            int o11 = this.f11108a.o();
            if (o11 >= 0) {
                b(view, i11);
                return;
            }
            this.f11109b = i11;
            if (this.f11111d) {
                int i12 = (this.f11108a.i() - o11) - this.f11108a.d(view);
                this.f11110c = this.f11108a.i() - i12;
                if (i12 > 0) {
                    int e11 = this.f11110c - this.f11108a.e(view);
                    int m11 = this.f11108a.m();
                    int min = e11 - (m11 + Math.min(this.f11108a.g(view) - m11, 0));
                    if (min < 0) {
                        this.f11110c += Math.min(i12, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g11 = this.f11108a.g(view);
            int m12 = g11 - this.f11108a.m();
            this.f11110c = g11;
            if (m12 > 0) {
                int i13 = (this.f11108a.i() - Math.min(0, (this.f11108a.i() - o11) - this.f11108a.d(view))) - (g11 + this.f11108a.e(view));
                if (i13 < 0) {
                    this.f11110c -= Math.min(m12, -i13);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.d() && pVar.b() >= 0 && pVar.b() < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f11109b = -1;
            this.f11110c = Integer.MIN_VALUE;
            this.f11111d = false;
            this.f11112e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f11109b + ", mCoordinate=" + this.f11110c + ", mLayoutFromEnd=" + this.f11111d + ", mValid=" + this.f11112e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11113a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11114b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11115c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11116d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f11113a = 0;
            this.f11114b = false;
            this.f11115c = false;
            this.f11116d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f11117a = true;

        /* renamed from: b  reason: collision with root package name */
        int f11118b;

        /* renamed from: c  reason: collision with root package name */
        int f11119c;

        /* renamed from: d  reason: collision with root package name */
        int f11120d;

        /* renamed from: e  reason: collision with root package name */
        int f11121e;

        /* renamed from: f  reason: collision with root package name */
        int f11122f;

        /* renamed from: g  reason: collision with root package name */
        int f11123g;

        /* renamed from: h  reason: collision with root package name */
        int f11124h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f11125i = 0;
        boolean j = false;
        int k;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.d0> f11126l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f11127m;

        c() {
        }

        private View e() {
            int size = this.f11126l.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = this.f11126l.get(i11).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.d() && this.f11120d == pVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f11 = f(view);
            if (f11 == null) {
                this.f11120d = -1;
            } else {
                this.f11120d = ((RecyclerView.p) f11.getLayoutParams()).b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.a0 a0Var) {
            int i11 = this.f11120d;
            return i11 >= 0 && i11 < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.v vVar) {
            if (this.f11126l != null) {
                return e();
            }
            View o11 = vVar.o(this.f11120d);
            this.f11120d += this.f11121e;
            return o11;
        }

        public View f(View view) {
            int b11;
            int size = this.f11126l.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.f11126l.get(i12).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.d() && (b11 = (pVar.b() - this.f11120d) * this.f11121e) >= 0 && b11 < i11) {
                    view2 = view3;
                    if (b11 == 0) {
                        break;
                    }
                    i11 = b11;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void B2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i11, int i12) {
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        if (a0Var.g() && U() != 0 && !a0Var.e() && U1()) {
            List<RecyclerView.d0> k = vVar.k();
            int size = k.size();
            int o02 = o0(T(0));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                RecyclerView.d0 d0Var = k.get(i15);
                if (!d0Var.isRemoved()) {
                    char c11 = 1;
                    if ((d0Var.getLayoutPosition() < o02) != this.f11102x) {
                        c11 = 65535;
                    }
                    if (c11 == 65535) {
                        i13 += this.f11100u.e(d0Var.itemView);
                    } else {
                        i14 += this.f11100u.e(d0Var.itemView);
                    }
                }
            }
            this.t.f11126l = k;
            if (i13 > 0) {
                U2(o0(u2()), i11);
                c cVar = this.t;
                cVar.f11124h = i13;
                cVar.f11119c = 0;
                cVar.a();
                d2(vVar2, this.t, a0Var2, false);
            }
            if (i14 > 0) {
                S2(o0(t2()), i12);
                c cVar2 = this.t;
                cVar2.f11124h = i14;
                cVar2.f11119c = 0;
                cVar2.a();
                d2(vVar2, this.t, a0Var2, false);
            }
            this.t.f11126l = null;
        }
    }

    private void D2(RecyclerView.v vVar, c cVar) {
        if (cVar.f11117a && !cVar.f11127m) {
            int i11 = cVar.f11123g;
            int i12 = cVar.f11125i;
            if (cVar.f11122f == -1) {
                F2(vVar, i11, i12);
            } else {
                G2(vVar, i11, i12);
            }
        }
    }

    private void E2(RecyclerView.v vVar, int i11, int i12) {
        if (i11 != i12) {
            if (i12 > i11) {
                for (int i13 = i12 - 1; i13 >= i11; i13--) {
                    w1(i13, vVar);
                }
                return;
            }
            while (i11 > i12) {
                w1(i11, vVar);
                i11--;
            }
        }
    }

    private void F2(RecyclerView.v vVar, int i11, int i12) {
        int U = U();
        if (i11 >= 0) {
            int h11 = (this.f11100u.h() - i11) + i12;
            if (this.f11102x) {
                for (int i13 = 0; i13 < U; i13++) {
                    View T = T(i13);
                    if (this.f11100u.g(T) < h11 || this.f11100u.q(T) < h11) {
                        E2(vVar, 0, i13);
                        return;
                    }
                }
                return;
            }
            int i14 = U - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                View T2 = T(i15);
                if (this.f11100u.g(T2) < h11 || this.f11100u.q(T2) < h11) {
                    E2(vVar, i14, i15);
                    return;
                }
            }
        }
    }

    private void G2(RecyclerView.v vVar, int i11, int i12) {
        if (i11 >= 0) {
            int i13 = i11 - i12;
            int U = U();
            if (this.f11102x) {
                int i14 = U - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    View T = T(i15);
                    if (this.f11100u.d(T) > i13 || this.f11100u.p(T) > i13) {
                        E2(vVar, i14, i15);
                        return;
                    }
                }
                return;
            }
            for (int i16 = 0; i16 < U; i16++) {
                View T2 = T(i16);
                if (this.f11100u.d(T2) > i13 || this.f11100u.p(T2) > i13) {
                    E2(vVar, 0, i16);
                    return;
                }
            }
        }
    }

    private void I2() {
        if (this.f11099s == 1 || !y2()) {
            this.f11102x = this.f11101w;
        } else {
            this.f11102x = !this.f11101w;
        }
    }

    private boolean O2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View q22;
        boolean z11 = false;
        if (U() == 0) {
            return false;
        }
        View g02 = g0();
        if (g02 == null || !aVar.d(g02, a0Var)) {
            boolean z12 = this.v;
            boolean z13 = this.f11103y;
            if (z12 != z13 || (q22 = q2(vVar, a0Var, aVar.f11111d, z13)) == null) {
                return false;
            }
            aVar.b(q22, o0(q22));
            if (!a0Var.e() && U1()) {
                int g11 = this.f11100u.g(q22);
                int d11 = this.f11100u.d(q22);
                int m11 = this.f11100u.m();
                int i11 = this.f11100u.i();
                boolean z14 = d11 <= m11 && g11 < m11;
                if (g11 >= i11 && d11 > i11) {
                    z11 = true;
                }
                if (z14 || z11) {
                    if (aVar.f11111d) {
                        m11 = i11;
                    }
                    aVar.f11110c = m11;
                }
            }
            return true;
        }
        aVar.c(g02, o0(g02));
        return true;
    }

    private boolean P2(RecyclerView.a0 a0Var, a aVar) {
        int i11;
        int i12;
        boolean z11 = false;
        if (!a0Var.e() && (i11 = this.A) != -1) {
            if (i11 < 0 || i11 >= a0Var.b()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
            } else {
                aVar.f11109b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z12 = this.D.f11107c;
                    aVar.f11111d = z12;
                    if (z12) {
                        aVar.f11110c = this.f11100u.i() - this.D.f11106b;
                    } else {
                        aVar.f11110c = this.f11100u.m() + this.D.f11106b;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View N = N(this.A);
                    if (N == null) {
                        if (U() > 0) {
                            if ((this.A < o0(T(0))) == this.f11102x) {
                                z11 = true;
                            }
                            aVar.f11111d = z11;
                        }
                        aVar.a();
                    } else if (this.f11100u.e(N) > this.f11100u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f11100u.g(N) - this.f11100u.m() < 0) {
                        aVar.f11110c = this.f11100u.m();
                        aVar.f11111d = false;
                        return true;
                    } else if (this.f11100u.i() - this.f11100u.d(N) < 0) {
                        aVar.f11110c = this.f11100u.i();
                        aVar.f11111d = true;
                        return true;
                    } else {
                        if (aVar.f11111d) {
                            i12 = this.f11100u.d(N) + this.f11100u.o();
                        } else {
                            i12 = this.f11100u.g(N);
                        }
                        aVar.f11110c = i12;
                    }
                    return true;
                } else {
                    boolean z13 = this.f11102x;
                    aVar.f11111d = z13;
                    if (z13) {
                        aVar.f11110c = this.f11100u.i() - this.B;
                    } else {
                        aVar.f11110c = this.f11100u.m() + this.B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void Q2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!P2(a0Var, aVar) && !O2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f11109b = this.f11103y ? a0Var.b() - 1 : 0;
        }
    }

    private void R2(int i11, int i12, boolean z11, RecyclerView.a0 a0Var) {
        int i13;
        this.t.f11127m = H2();
        this.t.f11122f = i11;
        int[] iArr = this.H;
        boolean z12 = false;
        iArr[0] = 0;
        int i14 = 1;
        iArr[1] = 0;
        V1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i11 == 1) {
            z12 = true;
        }
        c cVar = this.t;
        int i15 = z12 ? max2 : max;
        cVar.f11124h = i15;
        if (!z12) {
            max = max2;
        }
        cVar.f11125i = max;
        if (z12) {
            cVar.f11124h = i15 + this.f11100u.j();
            View t22 = t2();
            c cVar2 = this.t;
            if (this.f11102x) {
                i14 = -1;
            }
            cVar2.f11121e = i14;
            int o02 = o0(t22);
            c cVar3 = this.t;
            cVar2.f11120d = o02 + cVar3.f11121e;
            cVar3.f11118b = this.f11100u.d(t22);
            i13 = this.f11100u.d(t22) - this.f11100u.i();
        } else {
            View u22 = u2();
            this.t.f11124h += this.f11100u.m();
            c cVar4 = this.t;
            if (!this.f11102x) {
                i14 = -1;
            }
            cVar4.f11121e = i14;
            int o03 = o0(u22);
            c cVar5 = this.t;
            cVar4.f11120d = o03 + cVar5.f11121e;
            cVar5.f11118b = this.f11100u.g(u22);
            i13 = (-this.f11100u.g(u22)) + this.f11100u.m();
        }
        c cVar6 = this.t;
        cVar6.f11119c = i12;
        if (z11) {
            cVar6.f11119c = i12 - i13;
        }
        cVar6.f11123g = i13;
    }

    private void S2(int i11, int i12) {
        this.t.f11119c = this.f11100u.i() - i12;
        c cVar = this.t;
        cVar.f11121e = this.f11102x ? -1 : 1;
        cVar.f11120d = i11;
        cVar.f11122f = 1;
        cVar.f11118b = i12;
        cVar.f11123g = Integer.MIN_VALUE;
    }

    private void T2(a aVar) {
        S2(aVar.f11109b, aVar.f11110c);
    }

    private void U2(int i11, int i12) {
        this.t.f11119c = i12 - this.f11100u.m();
        c cVar = this.t;
        cVar.f11120d = i11;
        cVar.f11121e = this.f11102x ? 1 : -1;
        cVar.f11122f = -1;
        cVar.f11118b = i12;
        cVar.f11123g = Integer.MIN_VALUE;
    }

    private void V2(a aVar) {
        U2(aVar.f11109b, aVar.f11110c);
    }

    private int X1(RecyclerView.a0 a0Var) {
        if (U() == 0) {
            return 0;
        }
        c2();
        q qVar = this.f11100u;
        View h22 = h2(!this.f11104z, true);
        return t.a(a0Var, qVar, h22, g2(!this.f11104z, true), this, this.f11104z);
    }

    private int Y1(RecyclerView.a0 a0Var) {
        if (U() == 0) {
            return 0;
        }
        c2();
        q qVar = this.f11100u;
        View h22 = h2(!this.f11104z, true);
        return t.b(a0Var, qVar, h22, g2(!this.f11104z, true), this, this.f11104z, this.f11102x);
    }

    private int Z1(RecyclerView.a0 a0Var) {
        if (U() == 0) {
            return 0;
        }
        c2();
        q qVar = this.f11100u;
        View h22 = h2(!this.f11104z, true);
        return t.c(a0Var, qVar, h22, g2(!this.f11104z, true), this, this.f11104z);
    }

    private View f2() {
        return m2(0, U());
    }

    private View k2() {
        return m2(U() - 1, -1);
    }

    private View o2() {
        if (this.f11102x) {
            return f2();
        }
        return k2();
    }

    private View p2() {
        if (this.f11102x) {
            return k2();
        }
        return f2();
    }

    private int r2(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z11) {
        int i12;
        int i13 = this.f11100u.i() - i11;
        if (i13 <= 0) {
            return 0;
        }
        int i14 = -J2(-i13, vVar, a0Var);
        int i15 = i11 + i14;
        if (!z11 || (i12 = this.f11100u.i() - i15) <= 0) {
            return i14;
        }
        this.f11100u.r(i12);
        return i12 + i14;
    }

    private int s2(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z11) {
        int m11;
        int m12 = i11 - this.f11100u.m();
        if (m12 <= 0) {
            return 0;
        }
        int i12 = -J2(m12, vVar, a0Var);
        int i13 = i11 + i12;
        if (!z11 || (m11 = i13 - this.f11100u.m()) <= 0) {
            return i12;
        }
        this.f11100u.r(-m11);
        return i12 - m11;
    }

    private View t2() {
        return T(this.f11102x ? 0 : U() - 1);
    }

    private View u2() {
        return T(this.f11102x ? U() - 1 : 0);
    }

    public void A(int i11, RecyclerView.o.c cVar) {
        boolean z11;
        int i12;
        SavedState savedState = this.D;
        int i13 = -1;
        if (savedState == null || !savedState.a()) {
            I2();
            z11 = this.f11102x;
            i12 = this.A;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z11 = savedState2.f11107c;
            i12 = savedState2.f11105a;
        }
        if (!z11) {
            i13 = 1;
        }
        for (int i14 = 0; i14 < this.G && i12 >= 0 && i12 < i11; i14++) {
            cVar.a(i12, 0);
            i12 += i13;
        }
    }

    /* access modifiers changed from: package-private */
    public void A2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View d11 = cVar.d(vVar);
        if (d11 == null) {
            bVar.f11114b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d11.getLayoutParams();
        if (cVar.f11126l == null) {
            if (this.f11102x == (cVar.f11122f == -1)) {
                q(d11);
            } else {
                r(d11, 0);
            }
        } else {
            if (this.f11102x == (cVar.f11122f == -1)) {
                o(d11);
            } else {
                p(d11, 0);
            }
        }
        I0(d11, 0, 0);
        bVar.f11113a = this.f11100u.e(d11);
        if (this.f11099s == 1) {
            if (y2()) {
                i15 = v0() - getPaddingRight();
                i14 = i15 - this.f11100u.f(d11);
            } else {
                i14 = getPaddingLeft();
                i15 = this.f11100u.f(d11) + i14;
            }
            if (cVar.f11122f == -1) {
                int i16 = cVar.f11118b;
                i11 = i16;
                i12 = i15;
                i13 = i16 - bVar.f11113a;
            } else {
                int i17 = cVar.f11118b;
                i13 = i17;
                i12 = i15;
                i11 = bVar.f11113a + i17;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f11 = this.f11100u.f(d11) + paddingTop;
            if (cVar.f11122f == -1) {
                int i18 = cVar.f11118b;
                i12 = i18;
                i13 = paddingTop;
                i11 = f11;
                i14 = i18 - bVar.f11113a;
            } else {
                int i19 = cVar.f11118b;
                i13 = paddingTop;
                i12 = bVar.f11113a + i19;
                i11 = f11;
                i14 = i19;
            }
        }
        H0(d11, i14, i13, i12, i11);
        if (pVar.d() || pVar.c()) {
            bVar.f11115c = true;
        }
        bVar.f11116d = d11.hasFocusable();
    }

    public int B(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    public int C(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void C2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i11) {
    }

    public int D(RecyclerView.a0 a0Var) {
        return Z1(a0Var);
    }

    public int E(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    public int F(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    public int F1(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f11099s == 1) {
            return 0;
        }
        return J2(i11, vVar, a0Var);
    }

    public int G(RecyclerView.a0 a0Var) {
        return Z1(a0Var);
    }

    public void G1(int i11) {
        this.A = i11;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        C1();
    }

    public int H1(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f11099s == 0) {
            return 0;
        }
        return J2(i11, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean H2() {
        return this.f11100u.k() == 0 && this.f11100u.h() == 0;
    }

    /* access modifiers changed from: package-private */
    public int J2(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (U() == 0 || i11 == 0) {
            return 0;
        }
        c2();
        this.t.f11117a = true;
        int i12 = i11 > 0 ? 1 : -1;
        int abs = Math.abs(i11);
        R2(i12, abs, true, a0Var);
        c cVar = this.t;
        int d22 = cVar.f11123g + d2(vVar, cVar, a0Var, false);
        if (d22 < 0) {
            return 0;
        }
        if (abs > d22) {
            i11 = i12 * d22;
        }
        this.f11100u.r(-i11);
        this.t.k = i11;
        return i11;
    }

    public void K2(int i11, int i12) {
        this.A = i11;
        this.B = i12;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        C1();
    }

    public void L2(int i11) {
        if (i11 == 0 || i11 == 1) {
            t((String) null);
            if (i11 != this.f11099s || this.f11100u == null) {
                q b11 = q.b(this, i11);
                this.f11100u = b11;
                this.E.f11108a = b11;
                this.f11099s = i11;
                C1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i11);
    }

    public void M2(boolean z11) {
        t((String) null);
        if (z11 != this.f11101w) {
            this.f11101w = z11;
            C1();
        }
    }

    public View N(int i11) {
        int U = U();
        if (U == 0) {
            return null;
        }
        int o02 = i11 - o0(T(0));
        if (o02 >= 0 && o02 < U) {
            View T = T(o02);
            if (o0(T) == i11) {
                return T;
            }
        }
        return super.N(i11);
    }

    public void N2(boolean z11) {
        t((String) null);
        if (this.f11103y != z11) {
            this.f11103y = z11;
            C1();
        }
    }

    public RecyclerView.p O() {
        return new RecyclerView.p(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public boolean P1() {
        return (i0() == 1073741824 || w0() == 1073741824 || !x0()) ? false : true;
    }

    public void Q0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.Q0(recyclerView, vVar);
        if (this.C) {
            t1(vVar);
            vVar.c();
        }
    }

    public View R0(View view, int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int a22;
        View view2;
        View view3;
        I2();
        if (U() == 0 || (a22 = a2(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        c2();
        R2(a22, (int) (((float) this.f11100u.n()) * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.f11123g = Integer.MIN_VALUE;
        cVar.f11117a = false;
        d2(vVar, cVar, a0Var, true);
        if (a22 == -1) {
            view2 = p2();
        } else {
            view2 = o2();
        }
        if (a22 == -1) {
            view3 = u2();
        } else {
            view3 = t2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void R1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i11) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i11);
        S1(lVar);
    }

    public void S0(AccessibilityEvent accessibilityEvent) {
        super.S0(accessibilityEvent);
        if (U() > 0) {
            accessibilityEvent.setFromIndex(i2());
            accessibilityEvent.setToIndex(l2());
        }
    }

    public boolean U1() {
        return this.D == null && this.v == this.f11103y;
    }

    /* access modifiers changed from: protected */
    public void V1(RecyclerView.a0 a0Var, int[] iArr) {
        int i11;
        int v22 = v2(a0Var);
        if (this.t.f11122f == -1) {
            i11 = 0;
        } else {
            i11 = v22;
            v22 = 0;
        }
        iArr[0] = v22;
        iArr[1] = i11;
    }

    /* access modifiers changed from: package-private */
    public void W1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i11 = cVar.f11120d;
        if (i11 >= 0 && i11 < a0Var.b()) {
            cVar2.a(i11, Math.max(0, cVar.f11123g));
        }
    }

    public PointF a(int i11) {
        if (U() == 0) {
            return null;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 < o0(T(0))) {
            z11 = true;
        }
        if (z11 != this.f11102x) {
            i12 = -1;
        }
        if (this.f11099s == 0) {
            return new PointF((float) i12, 0.0f);
        }
        return new PointF(0.0f, (float) i12);
    }

    /* access modifiers changed from: package-private */
    public int a2(int i11) {
        if (i11 == 1) {
            return (this.f11099s != 1 && y2()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.f11099s != 1 && y2()) ? -1 : 1;
        }
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    return (i11 == 130 && this.f11099s == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f11099s == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f11099s == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f11099s == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    public c b2() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void c2() {
        if (this.t == null) {
            this.t = b2();
        }
    }

    /* access modifiers changed from: package-private */
    public int d2(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z11) {
        int i11 = cVar.f11119c;
        int i12 = cVar.f11123g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                cVar.f11123g = i12 + i11;
            }
            D2(vVar, cVar);
        }
        int i13 = cVar.f11119c + cVar.f11124h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f11127m && i13 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            A2(vVar, a0Var, cVar, bVar);
            if (!bVar.f11114b) {
                cVar.f11118b += bVar.f11113a * cVar.f11122f;
                if (!bVar.f11115c || cVar.f11126l != null || !a0Var.e()) {
                    int i14 = cVar.f11119c;
                    int i15 = bVar.f11113a;
                    cVar.f11119c = i14 - i15;
                    i13 -= i15;
                }
                int i16 = cVar.f11123g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + bVar.f11113a;
                    cVar.f11123g = i17;
                    int i18 = cVar.f11119c;
                    if (i18 < 0) {
                        cVar.f11123g = i17 + i18;
                    }
                    D2(vVar, cVar);
                }
                if (z11 && bVar.f11116d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - cVar.f11119c;
    }

    public int e2() {
        View n22 = n2(0, U(), true, false);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    public void f1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View N;
        int i17;
        int i18;
        int i19 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            t1(vVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f11105a;
        }
        c2();
        this.t.f11117a = false;
        I2();
        View g02 = g0();
        a aVar = this.E;
        if (!aVar.f11112e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f11111d = this.f11102x ^ this.f11103y;
            Q2(vVar, a0Var, aVar2);
            this.E.f11112e = true;
        } else if (g02 != null && (this.f11100u.g(g02) >= this.f11100u.i() || this.f11100u.d(g02) <= this.f11100u.m())) {
            this.E.c(g02, o0(g02));
        }
        c cVar = this.t;
        cVar.f11122f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        V1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f11100u.m();
        int max2 = Math.max(0, this.H[1]) + this.f11100u.j();
        if (!(!a0Var.e() || (i16 = this.A) == -1 || this.B == Integer.MIN_VALUE || (N = N(i16)) == null)) {
            if (this.f11102x) {
                i17 = this.f11100u.i() - this.f11100u.d(N);
                i18 = this.B;
            } else {
                i18 = this.f11100u.g(N) - this.f11100u.m();
                i17 = this.B;
            }
            int i21 = i17 - i18;
            if (i21 > 0) {
                max += i21;
            } else {
                max2 -= i21;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f11111d ? !this.f11102x : this.f11102x) {
            i19 = 1;
        }
        C2(vVar, a0Var, aVar3, i19);
        H(vVar);
        this.t.f11127m = H2();
        this.t.j = a0Var.e();
        this.t.f11125i = 0;
        a aVar4 = this.E;
        if (aVar4.f11111d) {
            V2(aVar4);
            c cVar2 = this.t;
            cVar2.f11124h = max;
            d2(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i12 = cVar3.f11118b;
            int i22 = cVar3.f11120d;
            int i23 = cVar3.f11119c;
            if (i23 > 0) {
                max2 += i23;
            }
            T2(this.E);
            c cVar4 = this.t;
            cVar4.f11124h = max2;
            cVar4.f11120d += cVar4.f11121e;
            d2(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i11 = cVar5.f11118b;
            int i24 = cVar5.f11119c;
            if (i24 > 0) {
                U2(i22, i12);
                c cVar6 = this.t;
                cVar6.f11124h = i24;
                d2(vVar, cVar6, a0Var, false);
                i12 = this.t.f11118b;
            }
        } else {
            T2(aVar4);
            c cVar7 = this.t;
            cVar7.f11124h = max2;
            d2(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i11 = cVar8.f11118b;
            int i25 = cVar8.f11120d;
            int i26 = cVar8.f11119c;
            if (i26 > 0) {
                max += i26;
            }
            V2(this.E);
            c cVar9 = this.t;
            cVar9.f11124h = max;
            cVar9.f11120d += cVar9.f11121e;
            d2(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i12 = cVar10.f11118b;
            int i27 = cVar10.f11119c;
            if (i27 > 0) {
                S2(i25, i11);
                c cVar11 = this.t;
                cVar11.f11124h = i27;
                d2(vVar, cVar11, a0Var, false);
                i11 = this.t.f11118b;
            }
        }
        if (U() > 0) {
            if (this.f11102x ^ this.f11103y) {
                int r22 = r2(i11, vVar, a0Var, true);
                i14 = i12 + r22;
                i13 = i11 + r22;
                i15 = s2(i14, vVar, a0Var, false);
            } else {
                int s22 = s2(i12, vVar, a0Var, true);
                i14 = i12 + s22;
                i13 = i11 + s22;
                i15 = r2(i13, vVar, a0Var, false);
            }
            i12 = i14 + i15;
            i11 = i13 + i15;
        }
        B2(vVar, a0Var, i12, i11);
        if (!a0Var.e()) {
            this.f11100u.s();
        } else {
            this.E.e();
        }
        this.v = this.f11103y;
    }

    public void g1(RecyclerView.a0 a0Var) {
        super.g1(a0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    /* access modifiers changed from: package-private */
    public View g2(boolean z11, boolean z12) {
        if (this.f11102x) {
            return n2(0, U(), z11, z12);
        }
        return n2(U() - 1, -1, z11, z12);
    }

    /* access modifiers changed from: package-private */
    public View h2(boolean z11, boolean z12) {
        if (this.f11102x) {
            return n2(U() - 1, -1, z11, z12);
        }
        return n2(0, U(), z11, z12);
    }

    public int i2() {
        View n22 = n2(0, U(), false, true);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    public int j2() {
        View n22 = n2(U() - 1, -1, true, false);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    public void k1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            C1();
        }
    }

    public boolean l() {
        return this.f11099s == 1;
    }

    public Parcelable l1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (U() > 0) {
            c2();
            boolean z11 = this.v ^ this.f11102x;
            savedState.f11107c = z11;
            if (z11) {
                View t22 = t2();
                savedState.f11106b = this.f11100u.i() - this.f11100u.d(t22);
                savedState.f11105a = o0(t22);
            } else {
                View u22 = u2();
                savedState.f11105a = o0(u22);
                savedState.f11106b = this.f11100u.g(u22) - this.f11100u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    public int l2() {
        View n22 = n2(U() - 1, -1, false, true);
        if (n22 == null) {
            return -1;
        }
        return o0(n22);
    }

    public boolean m() {
        return this.f11099s == 0;
    }

    /* access modifiers changed from: package-private */
    public View m2(int i11, int i12) {
        int i13;
        int i14;
        c2();
        if ((i12 > i11 ? 1 : i12 < i11 ? (char) 65535 : 0) == 0) {
            return T(i11);
        }
        if (this.f11100u.g(T(i11)) < this.f11100u.m()) {
            i14 = 16644;
            i13 = 16388;
        } else {
            i14 = 4161;
            i13 = 4097;
        }
        if (this.f11099s == 0) {
            return this.f11198e.a(i11, i12, i14, i13);
        }
        return this.f11199f.a(i11, i12, i14, i13);
    }

    /* access modifiers changed from: package-private */
    public View n2(int i11, int i12, boolean z11, boolean z12) {
        c2();
        int i13 = 320;
        int i14 = z11 ? 24579 : 320;
        if (!z12) {
            i13 = 0;
        }
        if (this.f11099s == 0) {
            return this.f11198e.a(i11, i12, i14, i13);
        }
        return this.f11199f.a(i11, i12, i14, i13);
    }

    /* access modifiers changed from: package-private */
    public View q2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z11, boolean z12) {
        int i11;
        int i12;
        c2();
        int U = U();
        int i13 = -1;
        if (z12) {
            i12 = U() - 1;
            i11 = -1;
        } else {
            i13 = U;
            i12 = 0;
            i11 = 1;
        }
        int b11 = a0Var.b();
        int m11 = this.f11100u.m();
        int i14 = this.f11100u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i12 != i13) {
            View T = T(i12);
            int o02 = o0(T);
            int g11 = this.f11100u.g(T);
            int d11 = this.f11100u.d(T);
            if (o02 >= 0 && o02 < b11) {
                if (!((RecyclerView.p) T.getLayoutParams()).d()) {
                    boolean z13 = d11 <= m11 && g11 < m11;
                    boolean z14 = g11 >= i14 && d11 > i14;
                    if (!z13 && !z14) {
                        return T;
                    }
                    if (z11) {
                        if (!z14) {
                            if (view != null) {
                            }
                            view = T;
                        }
                    } else if (!z13) {
                        if (view != null) {
                        }
                        view = T;
                    }
                    view2 = T;
                } else if (view3 == null) {
                    view3 = T;
                }
            }
            i12 += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public void t(String str) {
        if (this.D == null) {
            super.t(str);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int v2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f11100u.n();
        }
        return 0;
    }

    public int w2() {
        return this.f11099s;
    }

    public boolean x2() {
        return this.f11101w;
    }

    /* access modifiers changed from: protected */
    public boolean y2() {
        return k0() == 1;
    }

    public void z(int i11, int i12, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.f11099s != 0) {
            i11 = i12;
        }
        if (U() != 0 && i11 != 0) {
            c2();
            R2(i11 > 0 ? 1 : -1, Math.abs(i11), true, a0Var);
            W1(a0Var, this.t, cVar);
        }
    }

    public boolean z0() {
        return true;
    }

    public boolean z2() {
        return this.f11104z;
    }

    public LinearLayoutManager(Context context, int i11, boolean z11) {
        this.f11099s = 1;
        this.f11101w = false;
        this.f11102x = false;
        this.f11103y = false;
        this.f11104z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        L2(i11);
        M2(z11);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f11099s = 1;
        this.f11101w = false;
        this.f11102x = false;
        this.f11103y = false;
        this.f11104z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d p02 = RecyclerView.o.p0(context, attributeSet, i11, i12);
        L2(p02.f11210a);
        M2(p02.f11212c);
        N2(p02.f11213d);
    }
}
