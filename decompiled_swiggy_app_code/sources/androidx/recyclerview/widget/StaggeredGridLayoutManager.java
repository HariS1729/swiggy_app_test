package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int K;
    private final Rect L = new Rect();
    private final b M = new b();
    private boolean N = false;
    private boolean O = true;
    private int[] P;
    private final Runnable Q = new a();

    /* renamed from: s  reason: collision with root package name */
    private int f11248s = -1;
    d[] t;

    /* renamed from: u  reason: collision with root package name */
    q f11249u;
    q v;

    /* renamed from: w  reason: collision with root package name */
    private int f11250w;

    /* renamed from: x  reason: collision with root package name */
    private int f11251x;

    /* renamed from: y  reason: collision with root package name */
    private final k f11252y;

    /* renamed from: z  reason: collision with root package name */
    boolean f11253z = false;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f11260a;

        /* renamed from: b  reason: collision with root package name */
        int f11261b;

        /* renamed from: c  reason: collision with root package name */
        int f11262c;

        /* renamed from: d  reason: collision with root package name */
        int[] f11263d;

        /* renamed from: e  reason: collision with root package name */
        int f11264e;

        /* renamed from: f  reason: collision with root package name */
        int[] f11265f;

        /* renamed from: g  reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f11266g;

        /* renamed from: h  reason: collision with root package name */
        boolean f11267h;

        /* renamed from: i  reason: collision with root package name */
        boolean f11268i;
        boolean j;

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
        public void a() {
            this.f11263d = null;
            this.f11262c = 0;
            this.f11260a = -1;
            this.f11261b = -1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f11263d = null;
            this.f11262c = 0;
            this.f11264e = 0;
            this.f11265f = null;
            this.f11266g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f11260a);
            parcel.writeInt(this.f11261b);
            parcel.writeInt(this.f11262c);
            if (this.f11262c > 0) {
                parcel.writeIntArray(this.f11263d);
            }
            parcel.writeInt(this.f11264e);
            if (this.f11264e > 0) {
                parcel.writeIntArray(this.f11265f);
            }
            parcel.writeInt(this.f11267h ? 1 : 0);
            parcel.writeInt(this.f11268i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.f11266g);
        }

        SavedState(Parcel parcel) {
            this.f11260a = parcel.readInt();
            this.f11261b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f11262c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f11263d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f11264e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f11265f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z11 = false;
            this.f11267h = parcel.readInt() == 1;
            this.f11268i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1 ? true : z11;
            this.f11266g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f11262c = savedState.f11262c;
            this.f11260a = savedState.f11260a;
            this.f11261b = savedState.f11261b;
            this.f11263d = savedState.f11263d;
            this.f11264e = savedState.f11264e;
            this.f11265f = savedState.f11265f;
            this.f11267h = savedState.f11267h;
            this.f11268i = savedState.f11268i;
            this.j = savedState.j;
            this.f11266g = savedState.f11266g;
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.b2();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f11270a;

        /* renamed from: b  reason: collision with root package name */
        int f11271b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11272c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11273d;

        /* renamed from: e  reason: collision with root package name */
        boolean f11274e;

        /* renamed from: f  reason: collision with root package name */
        int[] f11275f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i11;
            if (this.f11272c) {
                i11 = StaggeredGridLayoutManager.this.f11249u.i();
            } else {
                i11 = StaggeredGridLayoutManager.this.f11249u.m();
            }
            this.f11271b = i11;
        }

        /* access modifiers changed from: package-private */
        public void b(int i11) {
            if (this.f11272c) {
                this.f11271b = StaggeredGridLayoutManager.this.f11249u.i() - i11;
            } else {
                this.f11271b = StaggeredGridLayoutManager.this.f11249u.m() + i11;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f11270a = -1;
            this.f11271b = Integer.MIN_VALUE;
            this.f11272c = false;
            this.f11273d = false;
            this.f11274e = false;
            int[] iArr = this.f11275f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f11275f;
            if (iArr == null || iArr.length < length) {
                this.f11275f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i11 = 0; i11 < length; i11++) {
                this.f11275f[i11] = dVarArr[i11].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        d f11277e;

        /* renamed from: f  reason: collision with root package name */
        boolean f11278f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean f() {
            return this.f11278f;
        }

        public c(int i11, int i12) {
            super(i11, i12);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class d {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f11279a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f11280b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f11281c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f11282d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f11283e;

        d(int i11) {
            this.f11283e = i11;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n = n(view);
            n.f11277e = this;
            this.f11279a.add(view);
            this.f11281c = Integer.MIN_VALUE;
            if (this.f11279a.size() == 1) {
                this.f11280b = Integer.MIN_VALUE;
            }
            if (n.d() || n.c()) {
                this.f11282d += StaggeredGridLayoutManager.this.f11249u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z11, int i11) {
            int i12;
            if (z11) {
                i12 = l(Integer.MIN_VALUE);
            } else {
                i12 = p(Integer.MIN_VALUE);
            }
            e();
            if (i12 != Integer.MIN_VALUE) {
                if (z11 && i12 < StaggeredGridLayoutManager.this.f11249u.i()) {
                    return;
                }
                if (z11 || i12 <= StaggeredGridLayoutManager.this.f11249u.m()) {
                    if (i11 != Integer.MIN_VALUE) {
                        i12 += i11;
                    }
                    this.f11281c = i12;
                    this.f11280b = i12;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            LazySpanLookup.FullSpanItem f11;
            ArrayList<View> arrayList = this.f11279a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.f11281c = StaggeredGridLayoutManager.this.f11249u.d(view);
            if (n.f11278f && (f11 = StaggeredGridLayoutManager.this.E.f(n.b())) != null && f11.f11257b == 1) {
                this.f11281c += f11.a(this.f11283e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            LazySpanLookup.FullSpanItem f11;
            View view = this.f11279a.get(0);
            c n = n(view);
            this.f11280b = StaggeredGridLayoutManager.this.f11249u.g(view);
            if (n.f11278f && (f11 = StaggeredGridLayoutManager.this.E.f(n.b())) != null && f11.f11257b == -1) {
                this.f11280b -= f11.a(this.f11283e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f11279a.clear();
            q();
            this.f11282d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f11253z) {
                return i(this.f11279a.size() - 1, -1, true);
            }
            return i(0, this.f11279a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f11253z) {
                return i(0, this.f11279a.size(), true);
            }
            return i(this.f11279a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i11, int i12, boolean z11, boolean z12, boolean z13) {
            int m11 = StaggeredGridLayoutManager.this.f11249u.m();
            int i13 = StaggeredGridLayoutManager.this.f11249u.i();
            int i14 = i12 > i11 ? 1 : -1;
            while (i11 != i12) {
                View view = this.f11279a.get(i11);
                int g11 = StaggeredGridLayoutManager.this.f11249u.g(view);
                int d11 = StaggeredGridLayoutManager.this.f11249u.d(view);
                boolean z14 = false;
                boolean z15 = !z13 ? g11 < i13 : g11 <= i13;
                if (!z13 ? d11 > m11 : d11 >= m11) {
                    z14 = true;
                }
                if (z15 && z14) {
                    if (!z11 || !z12) {
                        if (z12) {
                            return StaggeredGridLayoutManager.this.o0(view);
                        }
                        if (g11 < m11 || d11 > i13) {
                            return StaggeredGridLayoutManager.this.o0(view);
                        }
                    } else if (g11 >= m11 && d11 <= i13) {
                        return StaggeredGridLayoutManager.this.o0(view);
                    }
                }
                i11 += i14;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i11, int i12, boolean z11) {
            return h(i11, i12, false, false, z11);
        }

        public int j() {
            return this.f11282d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i11 = this.f11281c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            c();
            return this.f11281c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i11) {
            int i12 = this.f11281c;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f11279a.size() == 0) {
                return i11;
            }
            c();
            return this.f11281c;
        }

        public View m(int i11, int i12) {
            View view = null;
            if (i12 != -1) {
                int size = this.f11279a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f11279a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f11253z && staggeredGridLayoutManager.o0(view2) >= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f11253z && staggeredGridLayoutManager2.o0(view2) <= i11) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f11279a.size();
                int i13 = 0;
                while (i13 < size2) {
                    View view3 = this.f11279a.get(i13);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f11253z && staggeredGridLayoutManager3.o0(view3) <= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f11253z && staggeredGridLayoutManager4.o0(view3) >= i11) || !view3.hasFocusable()) {
                        break;
                    }
                    i13++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i11 = this.f11280b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            d();
            return this.f11280b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i11) {
            int i12 = this.f11280b;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f11279a.size() == 0) {
                return i11;
            }
            d();
            return this.f11280b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f11280b = Integer.MIN_VALUE;
            this.f11281c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i11) {
            int i12 = this.f11280b;
            if (i12 != Integer.MIN_VALUE) {
                this.f11280b = i12 + i11;
            }
            int i13 = this.f11281c;
            if (i13 != Integer.MIN_VALUE) {
                this.f11281c = i13 + i11;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f11279a.size();
            View remove = this.f11279a.remove(size - 1);
            c n = n(remove);
            n.f11277e = null;
            if (n.d() || n.c()) {
                this.f11282d -= StaggeredGridLayoutManager.this.f11249u.e(remove);
            }
            if (size == 1) {
                this.f11280b = Integer.MIN_VALUE;
            }
            this.f11281c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View remove = this.f11279a.remove(0);
            c n = n(remove);
            n.f11277e = null;
            if (this.f11279a.size() == 0) {
                this.f11281c = Integer.MIN_VALUE;
            }
            if (n.d() || n.c()) {
                this.f11282d -= StaggeredGridLayoutManager.this.f11249u.e(remove);
            }
            this.f11280b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n = n(view);
            n.f11277e = this;
            this.f11279a.add(0, view);
            this.f11280b = Integer.MIN_VALUE;
            if (this.f11279a.size() == 1) {
                this.f11281c = Integer.MIN_VALUE;
            }
            if (n.d() || n.c()) {
                this.f11282d += StaggeredGridLayoutManager.this.f11249u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i11) {
            this.f11280b = i11;
            this.f11281c = i11;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        RecyclerView.o.d p02 = RecyclerView.o.p0(context, attributeSet, i11, i12);
        R2(p02.f11210a);
        T2(p02.f11211b);
        S2(p02.f11212c);
        this.f11252y = new k();
        j2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.t2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.s2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.s2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.t2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.C1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(int, int, int):void");
    }

    private void E2(View view, int i11, int i12, boolean z11) {
        boolean z12;
        w(view, this.L);
        c cVar = (c) view.getLayoutParams();
        int i13 = cVar.leftMargin;
        Rect rect = this.L;
        int b32 = b3(i11, i13 + rect.left, cVar.rightMargin + rect.right);
        int i14 = cVar.topMargin;
        Rect rect2 = this.L;
        int b33 = b3(i12, i14 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z11) {
            z12 = Q1(view, b32, b33, cVar);
        } else {
            z12 = O1(view, b32, b33, cVar);
        }
        if (z12) {
            view.measure(b32, b33);
        }
    }

    private void F2(View view, c cVar, boolean z11) {
        if (cVar.f11278f) {
            if (this.f11250w == 1) {
                E2(view, this.K, RecyclerView.o.V(h0(), i0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z11);
            } else {
                E2(view, RecyclerView.o.V(v0(), w0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), this.K, z11);
            }
        } else if (this.f11250w == 1) {
            E2(view, RecyclerView.o.V(this.f11251x, w0(), 0, cVar.width, false), RecyclerView.o.V(h0(), i0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z11);
        } else {
            E2(view, RecyclerView.o.V(v0(), w0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), RecyclerView.o.V(this.f11251x, i0(), 0, cVar.height, false), z11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (b2() != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.M
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.t1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f11274e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.W1(r0)
            goto L_0x003e
        L_0x0037:
            r8.O2()
            boolean r5 = r8.A
            r0.f11272c = r5
        L_0x003e:
            r8.X2(r10, r0)
            r0.f11274e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f11272c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.D2()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.E
            r5.b()
            r0.f11273d = r4
        L_0x0060:
            int r5 = r8.U()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f11262c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f11273d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f11248s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f11271b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.M
            int[] r1 = r1.f11275f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f11248s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.M
            int[] r6 = r6.f11275f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f11248s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.f11271b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.M
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.t
            r1.d(r5)
        L_0x00c9:
            r8.H(r9)
            androidx.recyclerview.widget.k r1 = r8.f11252y
            r1.f11437a = r3
            r8.N = r3
            androidx.recyclerview.widget.q r1 = r8.v
            int r1 = r1.n()
            r8.Z2(r1)
            int r1 = r0.f11270a
            r8.Y2(r1, r10)
            boolean r1 = r0.f11272c
            if (r1 == 0) goto L_0x00fc
            r8.Q2(r2)
            androidx.recyclerview.widget.k r1 = r8.f11252y
            r8.k2(r9, r1, r10)
            r8.Q2(r4)
            androidx.recyclerview.widget.k r1 = r8.f11252y
            int r2 = r0.f11270a
            int r5 = r1.f11440d
            int r2 = r2 + r5
            r1.f11439c = r2
            r8.k2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.Q2(r4)
            androidx.recyclerview.widget.k r1 = r8.f11252y
            r8.k2(r9, r1, r10)
            r8.Q2(r2)
            androidx.recyclerview.widget.k r1 = r8.f11252y
            int r2 = r0.f11270a
            int r5 = r1.f11440d
            int r2 = r2 + r5
            r1.f11439c = r2
            r8.k2(r9, r1, r10)
        L_0x0113:
            r8.N2()
            int r1 = r8.U()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x0127
            r8.q2(r9, r10, r4)
            r8.r2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.r2(r9, r10, r4)
            r8.q2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.U()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.N
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.B2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.Q
            r8.x1(r11)
            boolean r11 = r8.b2()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.M
            r11.c()
        L_0x0166:
            boolean r11 = r0.f11272c
            r8.G = r11
            boolean r11 = r8.D2()
            r8.H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.M
            r11.c()
            r8.G2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean H2(int i11) {
        if (this.f11250w == 0) {
            if ((i11 == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((i11 == -1) == this.A) == D2()) {
            return true;
        }
        return false;
    }

    private void J2(View view) {
        for (int i11 = this.f11248s - 1; i11 >= 0; i11--) {
            this.t[i11].u(view);
        }
    }

    private void K2(RecyclerView.v vVar, k kVar) {
        int i11;
        int i12;
        if (kVar.f11437a && !kVar.f11445i) {
            if (kVar.f11438b == 0) {
                if (kVar.f11441e == -1) {
                    L2(vVar, kVar.f11443g);
                } else {
                    M2(vVar, kVar.f11442f);
                }
            } else if (kVar.f11441e == -1) {
                int i13 = kVar.f11442f;
                int v22 = i13 - v2(i13);
                if (v22 < 0) {
                    i12 = kVar.f11443g;
                } else {
                    i12 = kVar.f11443g - Math.min(v22, kVar.f11438b);
                }
                L2(vVar, i12);
            } else {
                int w22 = w2(kVar.f11443g) - kVar.f11443g;
                if (w22 < 0) {
                    i11 = kVar.f11442f;
                } else {
                    i11 = Math.min(w22, kVar.f11438b) + kVar.f11442f;
                }
                M2(vVar, i11);
            }
        }
    }

    private void L2(RecyclerView.v vVar, int i11) {
        int U = U() - 1;
        while (U >= 0) {
            View T = T(U);
            if (this.f11249u.g(T) >= i11 && this.f11249u.q(T) >= i11) {
                c cVar = (c) T.getLayoutParams();
                if (cVar.f11278f) {
                    int i12 = 0;
                    while (i12 < this.f11248s) {
                        if (this.t[i12].f11279a.size() != 1) {
                            i12++;
                        } else {
                            return;
                        }
                    }
                    for (int i13 = 0; i13 < this.f11248s; i13++) {
                        this.t[i13].s();
                    }
                } else if (cVar.f11277e.f11279a.size() != 1) {
                    cVar.f11277e.s();
                } else {
                    return;
                }
                v1(T, vVar);
                U--;
            } else {
                return;
            }
        }
    }

    private void M2(RecyclerView.v vVar, int i11) {
        while (U() > 0) {
            View T = T(0);
            if (this.f11249u.d(T) <= i11 && this.f11249u.p(T) <= i11) {
                c cVar = (c) T.getLayoutParams();
                if (cVar.f11278f) {
                    int i12 = 0;
                    while (i12 < this.f11248s) {
                        if (this.t[i12].f11279a.size() != 1) {
                            i12++;
                        } else {
                            return;
                        }
                    }
                    for (int i13 = 0; i13 < this.f11248s; i13++) {
                        this.t[i13].t();
                    }
                } else if (cVar.f11277e.f11279a.size() != 1) {
                    cVar.f11277e.t();
                } else {
                    return;
                }
                v1(T, vVar);
            } else {
                return;
            }
        }
    }

    private void N2() {
        if (this.v.k() != 1073741824) {
            float f11 = 0.0f;
            int U = U();
            for (int i11 = 0; i11 < U; i11++) {
                View T = T(i11);
                float e11 = (float) this.v.e(T);
                if (e11 >= f11) {
                    if (((c) T.getLayoutParams()).f()) {
                        e11 = (e11 * 1.0f) / ((float) this.f11248s);
                    }
                    f11 = Math.max(f11, e11);
                }
            }
            int i12 = this.f11251x;
            int round = Math.round(f11 * ((float) this.f11248s));
            if (this.v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.n());
            }
            Z2(round);
            if (this.f11251x != i12) {
                for (int i13 = 0; i13 < U; i13++) {
                    View T2 = T(i13);
                    c cVar = (c) T2.getLayoutParams();
                    if (!cVar.f11278f) {
                        if (!D2() || this.f11250w != 1) {
                            int i14 = cVar.f11277e.f11283e;
                            int i15 = this.f11251x * i14;
                            int i16 = i14 * i12;
                            if (this.f11250w == 1) {
                                T2.offsetLeftAndRight(i15 - i16);
                            } else {
                                T2.offsetTopAndBottom(i15 - i16);
                            }
                        } else {
                            int i17 = this.f11248s;
                            int i18 = cVar.f11277e.f11283e;
                            T2.offsetLeftAndRight(((-((i17 - 1) - i18)) * this.f11251x) - ((-((i17 - 1) - i18)) * i12));
                        }
                    }
                }
            }
        }
    }

    private void O2() {
        if (this.f11250w == 1 || !D2()) {
            this.A = this.f11253z;
        } else {
            this.A = !this.f11253z;
        }
    }

    private void Q2(int i11) {
        k kVar = this.f11252y;
        kVar.f11441e = i11;
        int i12 = 1;
        if (this.A != (i11 == -1)) {
            i12 = -1;
        }
        kVar.f11440d = i12;
    }

    private void U2(int i11, int i12) {
        for (int i13 = 0; i13 < this.f11248s; i13++) {
            if (!this.t[i13].f11279a.isEmpty()) {
                a3(this.t[i13], i11, i12);
            }
        }
    }

    private void V1(View view) {
        for (int i11 = this.f11248s - 1; i11 >= 0; i11--) {
            this.t[i11].a(view);
        }
    }

    private boolean V2(RecyclerView.a0 a0Var, b bVar) {
        int i11;
        if (this.G) {
            i11 = p2(a0Var.b());
        } else {
            i11 = l2(a0Var.b());
        }
        bVar.f11270a = i11;
        bVar.f11271b = Integer.MIN_VALUE;
        return true;
    }

    private void W1(b bVar) {
        int i11;
        SavedState savedState = this.I;
        int i12 = savedState.f11262c;
        if (i12 > 0) {
            if (i12 == this.f11248s) {
                for (int i13 = 0; i13 < this.f11248s; i13++) {
                    this.t[i13].e();
                    SavedState savedState2 = this.I;
                    int i14 = savedState2.f11263d[i13];
                    if (i14 != Integer.MIN_VALUE) {
                        if (savedState2.f11268i) {
                            i11 = this.f11249u.i();
                        } else {
                            i11 = this.f11249u.m();
                        }
                        i14 += i11;
                    }
                    this.t[i13].v(i14);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.f11260a = savedState3.f11261b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.j;
        S2(savedState4.f11267h);
        O2();
        SavedState savedState5 = this.I;
        int i15 = savedState5.f11260a;
        if (i15 != -1) {
            this.C = i15;
            bVar.f11272c = savedState5.f11268i;
        } else {
            bVar.f11272c = this.A;
        }
        if (savedState5.f11264e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f11254a = savedState5.f11265f;
            lazySpanLookup.f11255b = savedState5.f11266g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.k r0 = r4.f11252y
            r1 = 0
            r0.f11438b = r1
            r0.f11439c = r5
            boolean r0 = r4.F0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.q r5 = r4.f11249u
            int r5 = r5.n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.q r5 = r4.f11249u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.X()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.k r0 = r4.f11252y
            androidx.recyclerview.widget.q r3 = r4.f11249u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f11442f = r3
            androidx.recyclerview.widget.k r6 = r4.f11252y
            androidx.recyclerview.widget.q r0 = r4.f11249u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f11443g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.k r0 = r4.f11252y
            androidx.recyclerview.widget.q r3 = r4.f11249u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f11443g = r3
            androidx.recyclerview.widget.k r5 = r4.f11252y
            int r6 = -r6
            r5.f11442f = r6
        L_0x005d:
            androidx.recyclerview.widget.k r5 = r4.f11252y
            r5.f11444h = r1
            r5.f11437a = r2
            androidx.recyclerview.widget.q r6 = r4.f11249u
            int r6 = r6.k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.q r6 = r4.f11249u
            int r6 = r6.h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f11445i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void Z1(View view, c cVar, k kVar) {
        if (kVar.f11441e == 1) {
            if (cVar.f11278f) {
                V1(view);
            } else {
                cVar.f11277e.a(view);
            }
        } else if (cVar.f11278f) {
            J2(view);
        } else {
            cVar.f11277e.u(view);
        }
    }

    private int a2(int i11) {
        if (U() != 0) {
            if ((i11 < s2()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    private void a3(d dVar, int i11, int i12) {
        int j = dVar.j();
        if (i11 == -1) {
            if (dVar.o() + j <= i12) {
                this.B.set(dVar.f11283e, false);
            }
        } else if (dVar.k() - j >= i12) {
            this.B.set(dVar.f11283e, false);
        }
    }

    private int b3(int i11, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return i11;
        }
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode);
        }
        return i11;
    }

    private boolean c2(d dVar) {
        if (this.A) {
            if (dVar.k() < this.f11249u.i()) {
                ArrayList<View> arrayList = dVar.f11279a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f11278f;
            }
        } else if (dVar.o() > this.f11249u.m()) {
            return !dVar.n(dVar.f11279a.get(0)).f11278f;
        }
        return false;
    }

    private int d2(RecyclerView.a0 a0Var) {
        if (U() == 0) {
            return 0;
        }
        return t.a(a0Var, this.f11249u, n2(!this.O), m2(!this.O), this, this.O);
    }

    private int e2(RecyclerView.a0 a0Var) {
        if (U() == 0) {
            return 0;
        }
        return t.b(a0Var, this.f11249u, n2(!this.O), m2(!this.O), this, this.O, this.A);
    }

    private int f2(RecyclerView.a0 a0Var) {
        if (U() == 0) {
            return 0;
        }
        return t.c(a0Var, this.f11249u, n2(!this.O), m2(!this.O), this, this.O);
    }

    private int g2(int i11) {
        if (i11 == 1) {
            return (this.f11250w != 1 && D2()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.f11250w != 1 && D2()) ? -1 : 1;
        }
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    return (i11 == 130 && this.f11250w == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f11250w == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f11250w == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f11250w == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private LazySpanLookup.FullSpanItem h2(int i11) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f11258c = new int[this.f11248s];
        for (int i12 = 0; i12 < this.f11248s; i12++) {
            fullSpanItem.f11258c[i12] = i11 - this.t[i12].l(i11);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem i2(int i11) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f11258c = new int[this.f11248s];
        for (int i12 = 0; i12 < this.f11248s; i12++) {
            fullSpanItem.f11258c[i12] = this.t[i12].p(i11) - i11;
        }
        return fullSpanItem;
    }

    private void j2() {
        this.f11249u = q.b(this, this.f11250w);
        this.v = q.b(this, 1 - this.f11250w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int k2(RecyclerView.v vVar, k kVar, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        int i13;
        d dVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i21;
        int i22;
        int i23;
        RecyclerView.v vVar2 = vVar;
        k kVar2 = kVar;
        ? r92 = 0;
        this.B.set(0, this.f11248s, true);
        if (this.f11252y.f11445i) {
            i11 = kVar2.f11441e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (kVar2.f11441e == 1) {
                i23 = kVar2.f11443g + kVar2.f11438b;
            } else {
                i23 = kVar2.f11442f - kVar2.f11438b;
            }
            i11 = i23;
        }
        U2(kVar2.f11441e, i11);
        if (this.A) {
            i12 = this.f11249u.i();
        } else {
            i12 = this.f11249u.m();
        }
        int i24 = i12;
        boolean z12 = false;
        while (kVar.a(a0Var) && (this.f11252y.f11445i || !this.B.isEmpty())) {
            View b11 = kVar2.b(vVar2);
            c cVar = (c) b11.getLayoutParams();
            int b12 = cVar.b();
            int g11 = this.E.g(b12);
            boolean z13 = g11 == -1;
            if (z13) {
                dVar = cVar.f11278f ? this.t[r92] : y2(kVar2);
                this.E.n(b12, dVar);
            } else {
                dVar = this.t[g11];
            }
            d dVar2 = dVar;
            cVar.f11277e = dVar2;
            if (kVar2.f11441e == 1) {
                q(b11);
            } else {
                r(b11, r92);
            }
            F2(b11, cVar, r92);
            if (kVar2.f11441e == 1) {
                if (cVar.f11278f) {
                    i22 = u2(i24);
                } else {
                    i22 = dVar2.l(i24);
                }
                int e11 = this.f11249u.e(b11) + i22;
                if (z13 && cVar.f11278f) {
                    LazySpanLookup.FullSpanItem h22 = h2(i22);
                    h22.f11257b = -1;
                    h22.f11256a = b12;
                    this.E.a(h22);
                }
                i14 = e11;
                i15 = i22;
            } else {
                if (cVar.f11278f) {
                    i21 = x2(i24);
                } else {
                    i21 = dVar2.p(i24);
                }
                i15 = i21 - this.f11249u.e(b11);
                if (z13 && cVar.f11278f) {
                    LazySpanLookup.FullSpanItem i25 = i2(i21);
                    i25.f11257b = 1;
                    i25.f11256a = b12;
                    this.E.a(i25);
                }
                i14 = i21;
            }
            if (cVar.f11278f && kVar2.f11440d == -1) {
                if (z13) {
                    this.N = true;
                } else {
                    if (kVar2.f11441e == 1) {
                        z11 = X1();
                    } else {
                        z11 = Y1();
                    }
                    if (!z11) {
                        LazySpanLookup.FullSpanItem f11 = this.E.f(b12);
                        if (f11 != null) {
                            f11.f11259d = true;
                        }
                        this.N = true;
                    }
                }
            }
            Z1(b11, cVar, kVar2);
            if (!D2() || this.f11250w != 1) {
                if (cVar.f11278f) {
                    i18 = this.v.m();
                } else {
                    i18 = (dVar2.f11283e * this.f11251x) + this.v.m();
                }
                i17 = i18;
                i16 = this.v.e(b11) + i18;
            } else {
                if (cVar.f11278f) {
                    i19 = this.v.i();
                } else {
                    i19 = this.v.i() - (((this.f11248s - 1) - dVar2.f11283e) * this.f11251x);
                }
                i16 = i19;
                i17 = i19 - this.v.e(b11);
            }
            if (this.f11250w == 1) {
                H0(b11, i17, i15, i16, i14);
            } else {
                H0(b11, i15, i17, i14, i16);
            }
            if (cVar.f11278f) {
                U2(this.f11252y.f11441e, i11);
            } else {
                a3(dVar2, this.f11252y.f11441e, i11);
            }
            K2(vVar2, this.f11252y);
            if (this.f11252y.f11444h && b11.hasFocusable()) {
                if (cVar.f11278f) {
                    this.B.clear();
                } else {
                    this.B.set(dVar2.f11283e, false);
                    z12 = true;
                    r92 = 0;
                }
            }
            z12 = true;
            r92 = 0;
        }
        if (!z12) {
            K2(vVar2, this.f11252y);
        }
        if (this.f11252y.f11441e == -1) {
            i13 = this.f11249u.m() - x2(this.f11249u.m());
        } else {
            i13 = u2(this.f11249u.i()) - this.f11249u.i();
        }
        if (i13 > 0) {
            return Math.min(kVar2.f11438b, i13);
        }
        return 0;
    }

    private int l2(int i11) {
        int U = U();
        for (int i12 = 0; i12 < U; i12++) {
            int o02 = o0(T(i12));
            if (o02 >= 0 && o02 < i11) {
                return o02;
            }
        }
        return 0;
    }

    private int p2(int i11) {
        for (int U = U() - 1; U >= 0; U--) {
            int o02 = o0(T(U));
            if (o02 >= 0 && o02 < i11) {
                return o02;
            }
        }
        return 0;
    }

    private void q2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z11) {
        int i11;
        int u22 = u2(Integer.MIN_VALUE);
        if (u22 != Integer.MIN_VALUE && (i11 = this.f11249u.i() - u22) > 0) {
            int i12 = i11 - (-P2(-i11, vVar, a0Var));
            if (z11 && i12 > 0) {
                this.f11249u.r(i12);
            }
        }
    }

    private void r2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z11) {
        int m11;
        int x22 = x2(Integer.MAX_VALUE);
        if (x22 != Integer.MAX_VALUE && (m11 = x22 - this.f11249u.m()) > 0) {
            int P2 = m11 - P2(m11, vVar, a0Var);
            if (z11 && P2 > 0) {
                this.f11249u.r(-P2);
            }
        }
    }

    private int u2(int i11) {
        int l11 = this.t[0].l(i11);
        for (int i12 = 1; i12 < this.f11248s; i12++) {
            int l12 = this.t[i12].l(i11);
            if (l12 > l11) {
                l11 = l12;
            }
        }
        return l11;
    }

    private int v2(int i11) {
        int p11 = this.t[0].p(i11);
        for (int i12 = 1; i12 < this.f11248s; i12++) {
            int p12 = this.t[i12].p(i11);
            if (p12 > p11) {
                p11 = p12;
            }
        }
        return p11;
    }

    private int w2(int i11) {
        int l11 = this.t[0].l(i11);
        for (int i12 = 1; i12 < this.f11248s; i12++) {
            int l12 = this.t[i12].l(i11);
            if (l12 < l11) {
                l11 = l12;
            }
        }
        return l11;
    }

    private int x2(int i11) {
        int p11 = this.t[0].p(i11);
        for (int i12 = 1; i12 < this.f11248s; i12++) {
            int p12 = this.t[i12].p(i11);
            if (p12 < p11) {
                p11 = p12;
            }
        }
        return p11;
    }

    private d y2(k kVar) {
        int i11;
        int i12;
        int i13 = -1;
        if (H2(kVar.f11441e)) {
            i12 = this.f11248s - 1;
            i11 = -1;
        } else {
            i12 = 0;
            i13 = this.f11248s;
            i11 = 1;
        }
        d dVar = null;
        if (kVar.f11441e == 1) {
            int i14 = Integer.MAX_VALUE;
            int m11 = this.f11249u.m();
            while (i12 != i13) {
                d dVar2 = this.t[i12];
                int l11 = dVar2.l(m11);
                if (l11 < i14) {
                    dVar = dVar2;
                    i14 = l11;
                }
                i12 += i11;
            }
            return dVar;
        }
        int i15 = Integer.MIN_VALUE;
        int i16 = this.f11249u.i();
        while (i12 != i13) {
            d dVar3 = this.t[i12];
            int p11 = dVar3.p(i16);
            if (p11 > i15) {
                dVar = dVar3;
                i15 = p11;
            }
            i12 += i11;
        }
        return dVar;
    }

    public int B(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View B2() {
        /*
            r12 = this;
            int r0 = r12.U()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f11248s
            r2.<init>(r3)
            int r3 = r12.f11248s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f11250w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.D2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.T(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f11277e
            int r9 = r9.f11283e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f11277e
            boolean r9 = r12.c2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f11277e
            int r9 = r9.f11283e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f11278f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.T(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.q r10 = r12.f11249u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.q r11 = r12.f11249u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.q r10 = r12.f11249u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.q r11 = r12.f11249u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f11277e
            int r8 = r8.f11283e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f11277e
            int r9 = r9.f11283e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2():android.view.View");
    }

    public int C(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    public void C2() {
        this.E.b();
        C1();
    }

    public int D(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean D2() {
        return k0() == 1;
    }

    public int E(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    public int F(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    public int F1(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return P2(i11, vVar, a0Var);
    }

    public int G(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    public void G1(int i11) {
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.f11260a == i11)) {
            savedState.a();
        }
        this.C = i11;
        this.D = Integer.MIN_VALUE;
        C1();
    }

    public int H1(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return P2(i11, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public void I2(int i11, RecyclerView.a0 a0Var) {
        int i12;
        int i13;
        if (i11 > 0) {
            i13 = t2();
            i12 = 1;
        } else {
            i13 = s2();
            i12 = -1;
        }
        this.f11252y.f11437a = true;
        Y2(i13, a0Var);
        Q2(i12);
        k kVar = this.f11252y;
        kVar.f11439c = i13 + kVar.f11440d;
        kVar.f11438b = Math.abs(i11);
    }

    public void K0(int i11) {
        super.K0(i11);
        for (int i12 = 0; i12 < this.f11248s; i12++) {
            this.t[i12].r(i11);
        }
    }

    public void L0(int i11) {
        super.L0(i11);
        for (int i12 = 0; i12 < this.f11248s; i12++) {
            this.t[i12].r(i11);
        }
    }

    public void L1(Rect rect, int i11, int i12) {
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f11250w == 1) {
            i14 = RecyclerView.o.y(i12, rect.height() + paddingTop, m0());
            i13 = RecyclerView.o.y(i11, (this.f11251x * this.f11248s) + paddingLeft, n0());
        } else {
            i13 = RecyclerView.o.y(i11, rect.width() + paddingLeft, n0());
            i14 = RecyclerView.o.y(i12, (this.f11251x * this.f11248s) + paddingTop, m0());
        }
        K1(i13, i14);
    }

    public void M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.E.b();
        for (int i11 = 0; i11 < this.f11248s; i11++) {
            this.t[i11].e();
        }
    }

    public RecyclerView.p O() {
        if (this.f11250w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public RecyclerView.p P(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public int P2(int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (U() == 0 || i11 == 0) {
            return 0;
        }
        I2(i11, a0Var);
        int k22 = k2(vVar, this.f11252y, a0Var);
        if (this.f11252y.f11438b >= k22) {
            i11 = i11 < 0 ? -k22 : k22;
        }
        this.f11249u.r(-i11);
        this.G = this.A;
        k kVar = this.f11252y;
        kVar.f11438b = 0;
        K2(vVar, kVar);
        return i11;
    }

    public RecyclerView.p Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void Q0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.Q0(recyclerView, vVar);
        x1(this.Q);
        for (int i11 = 0; i11 < this.f11248s; i11++) {
            this.t[i11].e();
        }
        recyclerView.requestLayout();
    }

    public View R0(View view, int i11, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View M2;
        int i12;
        int i13;
        int i14;
        int i15;
        View m11;
        if (U() == 0 || (M2 = M(view)) == null) {
            return null;
        }
        O2();
        int g22 = g2(i11);
        if (g22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) M2.getLayoutParams();
        boolean z11 = cVar.f11278f;
        d dVar = cVar.f11277e;
        if (g22 == 1) {
            i12 = t2();
        } else {
            i12 = s2();
        }
        Y2(i12, a0Var);
        Q2(g22);
        k kVar = this.f11252y;
        kVar.f11439c = kVar.f11440d + i12;
        kVar.f11438b = (int) (((float) this.f11249u.n()) * 0.33333334f);
        k kVar2 = this.f11252y;
        kVar2.f11444h = true;
        kVar2.f11437a = false;
        k2(vVar, kVar2, a0Var);
        this.G = this.A;
        if (!z11 && (m11 = dVar.m(i12, g22)) != null && m11 != M2) {
            return m11;
        }
        if (H2(g22)) {
            for (int i16 = this.f11248s - 1; i16 >= 0; i16--) {
                View m12 = this.t[i16].m(i12, g22);
                if (m12 != null && m12 != M2) {
                    return m12;
                }
            }
        } else {
            for (int i17 = 0; i17 < this.f11248s; i17++) {
                View m13 = this.t[i17].m(i12, g22);
                if (m13 != null && m13 != M2) {
                    return m13;
                }
            }
        }
        boolean z12 = (this.f11253z ^ true) == (g22 == -1);
        if (!z11) {
            if (z12) {
                i15 = dVar.f();
            } else {
                i15 = dVar.g();
            }
            View N2 = N(i15);
            if (!(N2 == null || N2 == M2)) {
                return N2;
            }
        }
        if (H2(g22)) {
            for (int i18 = this.f11248s - 1; i18 >= 0; i18--) {
                if (i18 != dVar.f11283e) {
                    if (z12) {
                        i14 = this.t[i18].f();
                    } else {
                        i14 = this.t[i18].g();
                    }
                    View N3 = N(i14);
                    if (!(N3 == null || N3 == M2)) {
                        return N3;
                    }
                }
            }
        } else {
            for (int i19 = 0; i19 < this.f11248s; i19++) {
                if (z12) {
                    i13 = this.t[i19].f();
                } else {
                    i13 = this.t[i19].g();
                }
                View N4 = N(i13);
                if (N4 != null && N4 != M2) {
                    return N4;
                }
            }
        }
        return null;
    }

    public void R1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i11) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i11);
        S1(lVar);
    }

    public void R2(int i11) {
        if (i11 == 0 || i11 == 1) {
            t((String) null);
            if (i11 != this.f11250w) {
                this.f11250w = i11;
                q qVar = this.f11249u;
                this.f11249u = this.v;
                this.v = qVar;
                C1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void S0(AccessibilityEvent accessibilityEvent) {
        super.S0(accessibilityEvent);
        if (U() > 0) {
            View n22 = n2(false);
            View m22 = m2(false);
            if (n22 != null && m22 != null) {
                int o02 = o0(n22);
                int o03 = o0(m22);
                if (o02 < o03) {
                    accessibilityEvent.setFromIndex(o02);
                    accessibilityEvent.setToIndex(o03);
                    return;
                }
                accessibilityEvent.setFromIndex(o03);
                accessibilityEvent.setToIndex(o02);
            }
        }
    }

    public void S2(boolean z11) {
        t((String) null);
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.f11267h == z11)) {
            savedState.f11267h = z11;
        }
        this.f11253z = z11;
        C1();
    }

    public void T2(int i11) {
        t((String) null);
        if (i11 != this.f11248s) {
            C2();
            this.f11248s = i11;
            this.B = new BitSet(this.f11248s);
            this.t = new d[this.f11248s];
            for (int i12 = 0; i12 < this.f11248s; i12++) {
                this.t[i12] = new d(i12);
            }
            C1();
        }
    }

    public boolean U1() {
        return this.I == null;
    }

    /* access modifiers changed from: package-private */
    public boolean W2(RecyclerView.a0 a0Var, b bVar) {
        int i11;
        int i12;
        int i13;
        boolean z11 = false;
        if (!a0Var.e() && (i11 = this.C) != -1) {
            if (i11 < 0 || i11 >= a0Var.b()) {
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.I;
                if (savedState == null || savedState.f11260a == -1 || savedState.f11262c < 1) {
                    View N2 = N(this.C);
                    if (N2 != null) {
                        if (this.A) {
                            i12 = t2();
                        } else {
                            i12 = s2();
                        }
                        bVar.f11270a = i12;
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f11272c) {
                                bVar.f11271b = (this.f11249u.i() - this.D) - this.f11249u.d(N2);
                            } else {
                                bVar.f11271b = (this.f11249u.m() + this.D) - this.f11249u.g(N2);
                            }
                            return true;
                        } else if (this.f11249u.e(N2) > this.f11249u.n()) {
                            if (bVar.f11272c) {
                                i13 = this.f11249u.i();
                            } else {
                                i13 = this.f11249u.m();
                            }
                            bVar.f11271b = i13;
                            return true;
                        } else {
                            int g11 = this.f11249u.g(N2) - this.f11249u.m();
                            if (g11 < 0) {
                                bVar.f11271b = -g11;
                                return true;
                            }
                            int i14 = this.f11249u.i() - this.f11249u.d(N2);
                            if (i14 < 0) {
                                bVar.f11271b = i14;
                                return true;
                            }
                            bVar.f11271b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i15 = this.C;
                        bVar.f11270a = i15;
                        int i16 = this.D;
                        if (i16 == Integer.MIN_VALUE) {
                            if (a2(i15) == 1) {
                                z11 = true;
                            }
                            bVar.f11272c = z11;
                            bVar.a();
                        } else {
                            bVar.b(i16);
                        }
                        bVar.f11273d = true;
                    }
                } else {
                    bVar.f11271b = Integer.MIN_VALUE;
                    bVar.f11270a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean X1() {
        int l11 = this.t[0].l(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f11248s; i11++) {
            if (this.t[i11].l(Integer.MIN_VALUE) != l11) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void X2(RecyclerView.a0 a0Var, b bVar) {
        if (!W2(a0Var, bVar) && !V2(a0Var, bVar)) {
            bVar.a();
            bVar.f11270a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y1() {
        int p11 = this.t[0].p(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.f11248s; i11++) {
            if (this.t[i11].p(Integer.MIN_VALUE) != p11) {
                return false;
            }
        }
        return true;
    }

    public void Z0(RecyclerView recyclerView, int i11, int i12) {
        A2(i11, i12, 1);
    }

    /* access modifiers changed from: package-private */
    public void Z2(int i11) {
        this.f11251x = i11 / this.f11248s;
        this.K = View.MeasureSpec.makeMeasureSpec(i11, this.v.k());
    }

    public PointF a(int i11) {
        int a22 = a2(i11);
        PointF pointF = new PointF();
        if (a22 == 0) {
            return null;
        }
        if (this.f11250w == 0) {
            pointF.x = (float) a22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) a22;
        }
        return pointF;
    }

    public void a1(RecyclerView recyclerView) {
        this.E.b();
        C1();
    }

    public void b1(RecyclerView recyclerView, int i11, int i12, int i13) {
        A2(i11, i12, 8);
    }

    /* access modifiers changed from: package-private */
    public boolean b2() {
        int i11;
        int i12;
        if (U() == 0 || this.F == 0 || !y0()) {
            return false;
        }
        if (this.A) {
            i12 = t2();
            i11 = s2();
        } else {
            i12 = s2();
            i11 = t2();
        }
        if (i12 == 0 && B2() != null) {
            this.E.b();
            D1();
            C1();
            return true;
        } else if (!this.N) {
            return false;
        } else {
            int i13 = this.A ? -1 : 1;
            int i14 = i11 + 1;
            LazySpanLookup.FullSpanItem e11 = this.E.e(i12, i14, i13, true);
            if (e11 == null) {
                this.N = false;
                this.E.d(i14);
                return false;
            }
            LazySpanLookup.FullSpanItem e12 = this.E.e(i12, e11.f11256a, i13 * -1, true);
            if (e12 == null) {
                this.E.d(e11.f11256a);
            } else {
                this.E.d(e12.f11256a + 1);
            }
            D1();
            C1();
            return true;
        }
    }

    public void c1(RecyclerView recyclerView, int i11, int i12) {
        A2(i11, i12, 2);
    }

    public void e1(RecyclerView recyclerView, int i11, int i12, Object obj) {
        A2(i11, i12, 4);
    }

    public void f1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        G2(vVar, a0Var, true);
    }

    public void g1(RecyclerView.a0 a0Var) {
        super.g1(a0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.M.c();
    }

    public void k1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.b();
            }
            C1();
        }
    }

    public boolean l() {
        return this.f11250w == 1;
    }

    public Parcelable l1() {
        int i11;
        int i12;
        int i13;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f11267h = this.f11253z;
        savedState.f11268i = this.G;
        savedState.j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f11254a) == null) {
            savedState.f11264e = 0;
        } else {
            savedState.f11265f = iArr;
            savedState.f11264e = iArr.length;
            savedState.f11266g = lazySpanLookup.f11255b;
        }
        if (U() > 0) {
            if (this.G) {
                i11 = t2();
            } else {
                i11 = s2();
            }
            savedState.f11260a = i11;
            savedState.f11261b = o2();
            int i14 = this.f11248s;
            savedState.f11262c = i14;
            savedState.f11263d = new int[i14];
            for (int i15 = 0; i15 < this.f11248s; i15++) {
                if (this.G) {
                    i12 = this.t[i15].l(Integer.MIN_VALUE);
                    if (i12 != Integer.MIN_VALUE) {
                        i13 = this.f11249u.i();
                    } else {
                        savedState.f11263d[i15] = i12;
                    }
                } else {
                    i12 = this.t[i15].p(Integer.MIN_VALUE);
                    if (i12 != Integer.MIN_VALUE) {
                        i13 = this.f11249u.m();
                    } else {
                        savedState.f11263d[i15] = i12;
                    }
                }
                i12 -= i13;
                savedState.f11263d[i15] = i12;
            }
        } else {
            savedState.f11260a = -1;
            savedState.f11261b = -1;
            savedState.f11262c = 0;
        }
        return savedState;
    }

    public boolean m() {
        return this.f11250w == 0;
    }

    public void m1(int i11) {
        if (i11 == 0) {
            b2();
        }
    }

    /* access modifiers changed from: package-private */
    public View m2(boolean z11) {
        int m11 = this.f11249u.m();
        int i11 = this.f11249u.i();
        View view = null;
        for (int U = U() - 1; U >= 0; U--) {
            View T = T(U);
            int g11 = this.f11249u.g(T);
            int d11 = this.f11249u.d(T);
            if (d11 > m11 && g11 < i11) {
                if (d11 <= i11 || !z11) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View n2(boolean z11) {
        int m11 = this.f11249u.m();
        int i11 = this.f11249u.i();
        int U = U();
        View view = null;
        for (int i12 = 0; i12 < U; i12++) {
            View T = T(i12);
            int g11 = this.f11249u.g(T);
            if (this.f11249u.d(T) > m11 && g11 < i11) {
                if (g11 >= m11 || !z11) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int o2() {
        View view;
        if (this.A) {
            view = m2(true);
        } else {
            view = n2(true);
        }
        if (view == null) {
            return -1;
        }
        return o0(view);
    }

    /* access modifiers changed from: package-private */
    public int s2() {
        if (U() == 0) {
            return 0;
        }
        return o0(T(0));
    }

    public void t(String str) {
        if (this.I == null) {
            super.t(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int t2() {
        int U = U();
        if (U == 0) {
            return 0;
        }
        return o0(T(U - 1));
    }

    public boolean x(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public void z(int i11, int i12, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i13;
        int i14;
        if (this.f11250w != 0) {
            i11 = i12;
        }
        if (U() != 0 && i11 != 0) {
            I2(i11, a0Var);
            int[] iArr = this.P;
            if (iArr == null || iArr.length < this.f11248s) {
                this.P = new int[this.f11248s];
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.f11248s; i16++) {
                k kVar = this.f11252y;
                if (kVar.f11440d == -1) {
                    i14 = kVar.f11442f;
                    i13 = this.t[i16].p(i14);
                } else {
                    i14 = this.t[i16].l(kVar.f11443g);
                    i13 = this.f11252y.f11443g;
                }
                int i17 = i14 - i13;
                if (i17 >= 0) {
                    this.P[i15] = i17;
                    i15++;
                }
            }
            Arrays.sort(this.P, 0, i15);
            for (int i18 = 0; i18 < i15 && this.f11252y.a(a0Var); i18++) {
                cVar.a(this.f11252y.f11439c, this.P[i18]);
                k kVar2 = this.f11252y;
                kVar2.f11439c += kVar2.f11440d;
            }
        }
    }

    public boolean z0() {
        return this.F != 0;
    }

    public int z2() {
        return this.f11250w;
    }

    static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        int[] f11254a;

        /* renamed from: b  reason: collision with root package name */
        List<FullSpanItem> f11255b;

        LazySpanLookup() {
        }

        private int i(int i11) {
            if (this.f11255b == null) {
                return -1;
            }
            FullSpanItem f11 = f(i11);
            if (f11 != null) {
                this.f11255b.remove(f11);
            }
            int size = this.f11255b.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                } else if (this.f11255b.get(i12).f11256a >= i11) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 == -1) {
                return -1;
            }
            this.f11255b.remove(i12);
            return this.f11255b.get(i12).f11256a;
        }

        private void l(int i11, int i12) {
            List<FullSpanItem> list = this.f11255b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f11255b.get(size);
                    int i13 = fullSpanItem.f11256a;
                    if (i13 >= i11) {
                        fullSpanItem.f11256a = i13 + i12;
                    }
                }
            }
        }

        private void m(int i11, int i12) {
            List<FullSpanItem> list = this.f11255b;
            if (list != null) {
                int i13 = i11 + i12;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f11255b.get(size);
                    int i14 = fullSpanItem.f11256a;
                    if (i14 >= i11) {
                        if (i14 < i13) {
                            this.f11255b.remove(size);
                        } else {
                            fullSpanItem.f11256a = i14 - i12;
                        }
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f11255b == null) {
                this.f11255b = new ArrayList();
            }
            int size = this.f11255b.size();
            for (int i11 = 0; i11 < size; i11++) {
                FullSpanItem fullSpanItem2 = this.f11255b.get(i11);
                if (fullSpanItem2.f11256a == fullSpanItem.f11256a) {
                    this.f11255b.remove(i11);
                }
                if (fullSpanItem2.f11256a >= fullSpanItem.f11256a) {
                    this.f11255b.add(i11, fullSpanItem);
                    return;
                }
            }
            this.f11255b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f11254a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11255b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i11) {
            int[] iArr = this.f11254a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i11, 10) + 1)];
                this.f11254a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[o(i11)];
                this.f11254a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f11254a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i11) {
            List<FullSpanItem> list = this.f11255b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f11255b.get(size).f11256a >= i11) {
                        this.f11255b.remove(size);
                    }
                }
            }
            return h(i11);
        }

        public FullSpanItem e(int i11, int i12, int i13, boolean z11) {
            List<FullSpanItem> list = this.f11255b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                FullSpanItem fullSpanItem = this.f11255b.get(i14);
                int i15 = fullSpanItem.f11256a;
                if (i15 >= i12) {
                    return null;
                }
                if (i15 >= i11 && (i13 == 0 || fullSpanItem.f11257b == i13 || (z11 && fullSpanItem.f11259d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i11) {
            List<FullSpanItem> list = this.f11255b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f11255b.get(size);
                if (fullSpanItem.f11256a == i11) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i11) {
            int[] iArr = this.f11254a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }

        /* access modifiers changed from: package-private */
        public int h(int i11) {
            int[] iArr = this.f11254a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            int i12 = i(i11);
            if (i12 == -1) {
                int[] iArr2 = this.f11254a;
                Arrays.fill(iArr2, i11, iArr2.length, -1);
                return this.f11254a.length;
            }
            int min = Math.min(i12 + 1, this.f11254a.length);
            Arrays.fill(this.f11254a, i11, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        public void j(int i11, int i12) {
            int[] iArr = this.f11254a;
            if (iArr != null && i11 < iArr.length) {
                int i13 = i11 + i12;
                c(i13);
                int[] iArr2 = this.f11254a;
                System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
                Arrays.fill(this.f11254a, i11, i13, -1);
                l(i11, i12);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i11, int i12) {
            int[] iArr = this.f11254a;
            if (iArr != null && i11 < iArr.length) {
                int i13 = i11 + i12;
                c(i13);
                int[] iArr2 = this.f11254a;
                System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
                int[] iArr3 = this.f11254a;
                Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
                m(i11, i12);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i11, d dVar) {
            c(i11);
            this.f11254a[i11] = dVar.f11283e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i11) {
            int length = this.f11254a.length;
            while (length <= i11) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            int f11256a;

            /* renamed from: b  reason: collision with root package name */
            int f11257b;

            /* renamed from: c  reason: collision with root package name */
            int[] f11258c;

            /* renamed from: d  reason: collision with root package name */
            boolean f11259d;

            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i11) {
                    return new FullSpanItem[i11];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f11256a = parcel.readInt();
                this.f11257b = parcel.readInt();
                this.f11259d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f11258c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i11) {
                int[] iArr = this.f11258c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i11];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f11256a + ", mGapDir=" + this.f11257b + ", mHasUnwantedGapAfter=" + this.f11259d + ", mGapPerSpan=" + Arrays.toString(this.f11258c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.f11256a);
                parcel.writeInt(this.f11257b);
                parcel.writeInt(this.f11259d ? 1 : 0);
                int[] iArr = this.f11258c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f11258c);
            }

            FullSpanItem() {
            }
        }
    }
}
