package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.viewpager2.R;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    static boolean f12211u = true;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f12212a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f12213b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private b f12214c = new b(3);

    /* renamed from: d  reason: collision with root package name */
    int f12215d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12216e = false;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.i f12217f = new a();

    /* renamed from: g  reason: collision with root package name */
    private LinearLayoutManager f12218g;

    /* renamed from: h  reason: collision with root package name */
    private int f12219h = -1;

    /* renamed from: i  reason: collision with root package name */
    private Parcelable f12220i;
    RecyclerView j;
    private r k;

    /* renamed from: l  reason: collision with root package name */
    e f12221l;

    /* renamed from: m  reason: collision with root package name */
    private b f12222m;
    private c n;

    /* renamed from: o  reason: collision with root package name */
    private d f12223o;

    /* renamed from: p  reason: collision with root package name */
    private RecyclerView.l f12224p = null;
    private boolean q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12225r = true;

    /* renamed from: s  reason: collision with root package name */
    private int f12226s = -1;
    e t;

    class a extends g {
        a() {
            super((a) null);
        }

        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f12216e = true;
            viewPager2.f12221l.j();
        }
    }

    class b extends i {
        b() {
        }

        public void a(int i11) {
            if (i11 == 0) {
                ViewPager2.this.o();
            }
        }

        public void c(int i11) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f12215d != i11) {
                viewPager2.f12215d = i11;
                viewPager2.t.q();
            }
        }
    }

    class c extends i {
        c() {
        }

        public void c(int i11) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.q {
        d() {
        }

        public void a(View view) {
        }

        public void b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (pVar.width != -1 || pVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i11) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i11, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView.Adapter<?> adapter) {
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView.Adapter<?> adapter) {
        }

        /* access modifiers changed from: package-private */
        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void h(b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        public void j(androidx.core.view.accessibility.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i11) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i11, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void m() {
        }

        /* access modifiers changed from: package-private */
        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void o(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        public void p() {
        }

        /* access modifiers changed from: package-private */
        public void q() {
        }

        /* access modifiers changed from: package-private */
        public void r() {
        }

        /* access modifiers changed from: package-private */
        public void s() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, (a) null);
        }

        public boolean b(int i11) {
            return (i11 == 8192 || i11 == 4096) && !ViewPager2.this.e();
        }

        public boolean d() {
            return true;
        }

        public void j(androidx.core.view.accessibility.c cVar) {
            if (!ViewPager2.this.e()) {
                cVar.U(c.a.f9465r);
                cVar.U(c.a.q);
                cVar.C0(false);
            }
        }

        public boolean k(int i11) {
            if (b(i11)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.i {
        private g() {
        }

        public abstract void a();

        public final void b(int i11, int i12) {
            a();
        }

        public final void c(int i11, int i12, Object obj) {
            a();
        }

        public final void d(int i11, int i12) {
            a();
        }

        public final void e(int i11, int i12, int i13) {
            a();
        }

        public final void f(int i11, int i12) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        public boolean B1(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
            return false;
        }

        public void V0(RecyclerView.v vVar, RecyclerView.a0 a0Var, androidx.core.view.accessibility.c cVar) {
            super.V0(vVar, a0Var, cVar);
            ViewPager2.this.t.j(cVar);
        }

        /* access modifiers changed from: protected */
        public void V1(RecyclerView.a0 a0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.V1(a0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public boolean p1(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i11, Bundle bundle) {
            if (ViewPager2.this.t.b(i11)) {
                return ViewPager2.this.t.k(i11);
            }
            return super.p1(vVar, a0Var, i11, bundle);
        }
    }

    public static abstract class i {
        public void a(int i11) {
        }

        public void b(int i11, float f11, int i12) {
        }

        public void c(int i11) {
        }
    }

    class j extends e {

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.view.accessibility.f f12236b = new a();

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.view.accessibility.f f12237c = new b();

        /* renamed from: d  reason: collision with root package name */
        private RecyclerView.i f12238d;

        class a implements androidx.core.view.accessibility.f {
            a() {
            }

            public boolean a(View view, f.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements androidx.core.view.accessibility.f {
            b() {
            }

            public boolean a(View view, f.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super((a) null);
            }

            public void a() {
                j.this.w();
            }
        }

        j() {
            super(ViewPager2.this, (a) null);
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i11;
            int i12;
            if (ViewPager2.this.getAdapter() == null) {
                i12 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i12 = ViewPager2.this.getAdapter().getItemCount();
            } else {
                i11 = ViewPager2.this.getAdapter().getItemCount();
                i12 = 0;
                androidx.core.view.accessibility.c.O0(accessibilityNodeInfo).e0(c.b.a(i12, i11, false, 0));
            }
            i11 = 0;
            androidx.core.view.accessibility.c.O0(accessibilityNodeInfo).e0(c.b.a(i12, i11, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.f12215d > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f12215d < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public boolean a() {
            return true;
        }

        public boolean c(int i11, Bundle bundle) {
            return i11 == 8192 || i11 == 4096;
        }

        public void e(RecyclerView.Adapter<?> adapter) {
            w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f12238d);
            }
        }

        public void f(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f12238d);
            }
        }

        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void h(b bVar, RecyclerView recyclerView) {
            a0.H0(recyclerView, 2);
            this.f12238d = new c();
            if (a0.D(ViewPager2.this) == 0) {
                a0.H0(ViewPager2.this, 1);
            }
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        public boolean l(int i11, Bundle bundle) {
            int i12;
            if (c(i11, bundle)) {
                if (i11 == 8192) {
                    i12 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i12 = ViewPager2.this.getCurrentItem() + 1;
                }
                v(i12);
                return true;
            }
            throw new IllegalStateException();
        }

        public void m() {
            w();
        }

        public void o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        public void p() {
            w();
        }

        public void q() {
            w();
        }

        public void r() {
            w();
        }

        public void s() {
            w();
        }

        /* access modifiers changed from: package-private */
        public void v(int i11) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i11, true);
            }
        }

        /* access modifiers changed from: package-private */
        public void w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            a0.q0(viewPager2, 16908360);
            a0.q0(viewPager2, 16908361);
            a0.q0(viewPager2, 16908358);
            a0.q0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean d11 = ViewPager2.this.d();
                    int i12 = d11 ? 16908360 : 16908361;
                    if (d11) {
                        i11 = 16908361;
                    }
                    if (ViewPager2.this.f12215d < itemCount - 1) {
                        a0.s0(viewPager2, new c.a(i12, (CharSequence) null), (CharSequence) null, this.f12236b);
                    }
                    if (ViewPager2.this.f12215d > 0) {
                        a0.s0(viewPager2, new c.a(i11, (CharSequence) null), (CharSequence) null, this.f12237c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f12215d < itemCount - 1) {
                    a0.s0(viewPager2, new c.a(16908359, (CharSequence) null), (CharSequence) null, this.f12236b);
                }
                if (ViewPager2.this.f12215d > 0) {
                    a0.s0(viewPager2, new c.a(16908358, (CharSequence) null), (CharSequence) null, this.f12237c);
                }
            }
        }
    }

    public interface k {
        void a(View view, float f11);
    }

    private class l extends r {
        l() {
        }

        public View h(RecyclerView.o oVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.t.d()) {
                return ViewPager2.this.t.n();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f12215d);
            accessibilityEvent.setToIndex(ViewPager2.this.f12215d);
            ViewPager2.this.t.o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    private static class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final int f12244a;

        /* renamed from: b  reason: collision with root package name */
        private final RecyclerView f12245b;

        n(int i11, RecyclerView recyclerView) {
            this.f12244a = i11;
            this.f12245b = recyclerView;
        }

        public void run() {
            this.f12245b.u1(this.f12244a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        b(context, (AttributeSet) null);
    }

    private RecyclerView.q a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.t = f12211u ? new j() : new f();
        m mVar = new m(context);
        this.j = mVar;
        mVar.setId(a0.m());
        this.j.setDescendantFocusability(PDChoice.FLAG_COMBO);
        h hVar = new h(context);
        this.f12218g = hVar;
        this.j.setLayoutManager(hVar);
        this.j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.j(a());
        e eVar = new e(this);
        this.f12221l = eVar;
        this.n = new c(this, eVar, this.j);
        l lVar = new l();
        this.k = lVar;
        lVar.b(this.j);
        this.j.l(this.f12221l);
        b bVar = new b(3);
        this.f12222m = bVar;
        this.f12221l.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f12222m.d(bVar2);
        this.f12222m.d(cVar);
        this.t.h(this.f12222m, this.j);
        this.f12222m.d(this.f12214c);
        d dVar = new d(this.f12218g);
        this.f12223o = dVar;
        this.f12222m.d(dVar);
        RecyclerView recyclerView = this.j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f12217f);
        }
    }

    private void i() {
        RecyclerView.Adapter adapter;
        if (this.f12219h != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f12220i;
            if (parcelable != null) {
                if (adapter instanceof androidx.viewpager2.adapter.b) {
                    ((androidx.viewpager2.adapter.b) adapter).e(parcelable);
                }
                this.f12220i = null;
            }
            int max = Math.max(0, Math.min(this.f12219h, adapter.getItemCount() - 1));
            this.f12215d = max;
            this.f12219h = -1;
            this.j.m1(max);
            this.t.m();
        }
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = R.styleable.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f12217f);
        }
    }

    public boolean c() {
        return this.n.a();
    }

    public boolean canScrollHorizontally(int i11) {
        return this.j.canScrollHorizontally(i11);
    }

    public boolean canScrollVertically(int i11) {
        return this.j.canScrollVertically(i11);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f12218g.k0() == 1;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i11 = ((SavedState) parcelable).f12227a;
            sparseArray.put(this.j.getId(), sparseArray.get(i11));
            sparseArray.remove(i11);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f12225r;
    }

    public void g(i iVar) {
        this.f12214c.d(iVar);
    }

    public CharSequence getAccessibilityClassName() {
        if (this.t.a()) {
            return this.t.g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f12215d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f12226s;
    }

    public int getOrientation() {
        return this.f12218g.w2();
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i11;
        int i12;
        RecyclerView recyclerView = this.j;
        if (getOrientation() == 0) {
            i11 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i12 = recyclerView.getPaddingRight();
        } else {
            i11 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i12 = recyclerView.getPaddingBottom();
        }
        return i11 - i12;
    }

    public int getScrollState() {
        return this.f12221l.f();
    }

    public void h() {
        if (this.f12223o.d() != null) {
            double e11 = this.f12221l.e();
            int i11 = (int) e11;
            float f11 = (float) (e11 - ((double) i11));
            this.f12223o.b(i11, f11, Math.round(((float) getPageSize()) * f11));
        }
    }

    public void j(int i11, boolean z11) {
        if (!c()) {
            k(i11, z11);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    public void k(int i11, boolean z11) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f12219h != -1) {
                this.f12219h = Math.max(i11, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i11, 0), adapter.getItemCount() - 1);
            if (min != this.f12215d || !this.f12221l.h()) {
                int i12 = this.f12215d;
                if (min != i12 || !z11) {
                    double d11 = (double) i12;
                    this.f12215d = min;
                    this.t.q();
                    if (!this.f12221l.h()) {
                        d11 = this.f12221l.e();
                    }
                    this.f12221l.k(min, z11);
                    if (!z11) {
                        this.j.m1(min);
                        return;
                    }
                    double d12 = (double) min;
                    if (Math.abs(d12 - d11) > 3.0d) {
                        this.j.m1(d12 > d11 ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.j;
                        recyclerView.post(new n(min, recyclerView));
                        return;
                    }
                    this.j.u1(min);
                }
            }
        }
    }

    public void n(i iVar) {
        this.f12214c.e(iVar);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        r rVar = this.k;
        if (rVar != null) {
            View h11 = rVar.h(this.f12218g);
            if (h11 != null) {
                int o02 = this.f12218g.o0(h11);
                if (o02 != this.f12215d && getScrollState() == 0) {
                    this.f12222m.c(o02);
                }
                this.f12216e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.t.i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        this.f12212a.left = getPaddingLeft();
        this.f12212a.right = (i13 - i11) - getPaddingRight();
        this.f12212a.top = getPaddingTop();
        this.f12212a.bottom = (i14 - i12) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f12212a, this.f12213b);
        RecyclerView recyclerView = this.j;
        Rect rect = this.f12213b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f12216e) {
            o();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        measureChild(this.j, i11, i12);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f12219h = savedState.f12228b;
        this.f12220i = savedState.f12229c;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12227a = this.j.getId();
        int i11 = this.f12219h;
        if (i11 == -1) {
            i11 = this.f12215d;
        }
        savedState.f12228b = i11;
        Parcelable parcelable = this.f12220i;
        if (parcelable != null) {
            savedState.f12229c = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                savedState.f12229c = ((androidx.viewpager2.adapter.b) adapter).c();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (this.t.c(i11, bundle)) {
            return this.t.l(i11, bundle);
        }
        return super.performAccessibilityAction(i11, bundle);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.j.getAdapter();
        this.t.f(adapter2);
        m(adapter2);
        this.j.setAdapter(adapter);
        this.f12215d = 0;
        i();
        this.t.e(adapter);
        f(adapter);
    }

    public void setCurrentItem(int i11) {
        j(i11, true);
    }

    public void setLayoutDirection(int i11) {
        super.setLayoutDirection(i11);
        this.t.p();
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 >= 1 || i11 == -1) {
            this.f12226s = i11;
            this.j.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i11) {
        this.f12218g.L2(i11);
        this.t.r();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.q) {
                this.f12224p = this.j.getItemAnimator();
                this.q = true;
            }
            this.j.setItemAnimator((RecyclerView.l) null);
        } else if (this.q) {
            this.j.setItemAnimator(this.f12224p);
            this.f12224p = null;
            this.q = false;
        }
        if (kVar != this.f12223o.d()) {
            this.f12223o.e(kVar);
            h();
        }
    }

    public void setUserInputEnabled(boolean z11) {
        this.f12225r = z11;
        this.t.s();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f12227a;

        /* renamed from: b  reason: collision with root package name */
        int f12228b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f12229c;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f12227a = parcel.readInt();
            this.f12228b = parcel.readInt();
            this.f12229c = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f12227a);
            parcel.writeInt(this.f12228b);
            parcel.writeParcelable(this.f12229c, i11);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, (ClassLoader) null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }
}
