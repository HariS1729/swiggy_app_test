package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements e.b, k {
    e A;

    /* renamed from: p  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f1872p;
    private Context q;

    /* renamed from: r  reason: collision with root package name */
    private int f1873r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1874s;
    private ActionMenuPresenter t;

    /* renamed from: u  reason: collision with root package name */
    private j.a f1875u;
    e.a v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1876w;

    /* renamed from: x  reason: collision with root package name */
    private int f1877x;

    /* renamed from: y  reason: collision with root package name */
    private int f1878y;

    /* renamed from: z  reason: collision with root package name */
    private int f1879z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
        }

        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1880a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1881b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1882c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1883d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1884e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1885f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1880a = cVar.f1880a;
        }

        public c(int i11, int i12) {
            super(i11, i12);
            this.f1880a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i11, int i12, int i13, int i14) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13) - i14, View.MeasureSpec.getMode(i13));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z11 = true;
        boolean z12 = actionMenuItemView != null && actionMenuItemView.f();
        int i15 = 2;
        if (i12 <= 0 || (z12 && i12 < 2)) {
            i15 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i16 = measuredWidth / i11;
            if (measuredWidth % i11 != 0) {
                i16++;
            }
            if (!z12 || i16 >= 2) {
                i15 = i16;
            }
        }
        if (cVar.f1880a || !z12) {
            z11 = false;
        }
        cVar.f1883d = z11;
        cVar.f1881b = i15;
        view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), makeMeasureSpec);
        return i15;
    }

    private void M(int i11, int i12) {
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        int i16;
        boolean z14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f1878y;
        int i19 = i17 / i18;
        int i21 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i22 = i18 + (i21 / i19);
        int childCount = getChildCount();
        int i23 = 0;
        int i24 = 0;
        boolean z15 = false;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        long j = 0;
        while (i24 < childCount) {
            View childAt = getChildAt(i24);
            int i28 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z16 = childAt instanceof ActionMenuItemView;
                int i29 = i25 + 1;
                if (z16) {
                    int i31 = this.f1879z;
                    i16 = i29;
                    z14 = false;
                    childAt.setPadding(i31, 0, i31, 0);
                } else {
                    i16 = i29;
                    z14 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1885f = z14;
                cVar.f1882c = z14 ? 1 : 0;
                cVar.f1881b = z14;
                cVar.f1883d = z14;
                cVar.leftMargin = z14;
                cVar.rightMargin = z14;
                cVar.f1884e = z16 && ((ActionMenuItemView) childAt).f();
                int L = L(childAt, i22, cVar.f1880a ? 1 : i19, childMeasureSpec, paddingTop);
                i26 = Math.max(i26, L);
                if (cVar.f1883d) {
                    i27++;
                }
                if (cVar.f1880a) {
                    z15 = true;
                }
                i19 -= L;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i24);
                    i23 = i23;
                } else {
                    int i32 = i23;
                }
                i25 = i16;
            }
            i24++;
            size2 = i28;
        }
        int i33 = size2;
        boolean z17 = z15 && i25 == 2;
        boolean z18 = false;
        while (true) {
            if (i27 <= 0 || i19 <= 0) {
                i15 = mode;
                i13 = i17;
                z11 = z18;
                i14 = i23;
            } else {
                int i34 = 0;
                int i35 = 0;
                int i36 = Integer.MAX_VALUE;
                long j11 = 0;
                while (i35 < childCount) {
                    boolean z19 = z18;
                    c cVar2 = (c) getChildAt(i35).getLayoutParams();
                    int i37 = i23;
                    if (cVar2.f1883d) {
                        int i38 = cVar2.f1881b;
                        if (i38 < i36) {
                            j11 = 1 << i35;
                            i36 = i38;
                            i34 = 1;
                        } else if (i38 == i36) {
                            i34++;
                            j11 |= 1 << i35;
                        }
                    }
                    i35++;
                    i23 = i37;
                    z18 = z19;
                }
                z11 = z18;
                i14 = i23;
                j |= j11;
                if (i34 > i19) {
                    i15 = mode;
                    i13 = i17;
                    break;
                }
                int i39 = i36 + 1;
                int i41 = 0;
                while (i41 < childCount) {
                    View childAt2 = getChildAt(i41);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i42 = i17;
                    int i43 = mode;
                    long j12 = (long) (1 << i41);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f1881b == i39) {
                            j |= j12;
                        }
                        z13 = z17;
                    } else {
                        if (!z17 || !cVar3.f1884e || i19 != 1) {
                            z13 = z17;
                        } else {
                            int i44 = this.f1879z;
                            z13 = z17;
                            childAt2.setPadding(i44 + i22, 0, i44, 0);
                        }
                        cVar3.f1881b++;
                        cVar3.f1885f = true;
                        i19--;
                    }
                    i41++;
                    mode = i43;
                    i17 = i42;
                    z17 = z13;
                }
                i23 = i14;
                z18 = true;
            }
        }
        boolean z21 = !z15 && i25 == 1;
        if (i19 <= 0 || j == 0 || (i19 >= i25 - 1 && !z21 && i26 <= 1)) {
            z12 = z11;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z21) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1884e) {
                    bitCount -= 0.5f;
                }
                int i45 = childCount - 1;
                if ((j & ((long) (1 << i45))) != 0 && !((c) getChildAt(i45).getLayoutParams()).f1884e) {
                    bitCount -= 0.5f;
                }
            }
            int i46 = bitCount > 0.0f ? (int) (((float) (i19 * i22)) / bitCount) : 0;
            z12 = z11;
            for (int i47 = 0; i47 < childCount; i47++) {
                if ((j & ((long) (1 << i47))) != 0) {
                    View childAt3 = getChildAt(i47);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1882c = i46;
                        cVar4.f1885f = true;
                        if (i47 == 0 && !cVar4.f1884e) {
                            cVar4.leftMargin = (-i46) / 2;
                        }
                    } else if (cVar4.f1880a) {
                        cVar4.f1882c = i46;
                        cVar4.f1885f = true;
                        cVar4.rightMargin = (-i46) / 2;
                    } else {
                        if (i47 != 0) {
                            cVar4.leftMargin = i46 / 2;
                        }
                        if (i47 != childCount - 1) {
                            cVar4.rightMargin = i46 / 2;
                        }
                    }
                    z12 = true;
                }
            }
        }
        if (z12) {
            for (int i48 = 0; i48 < childCount; i48++) {
                View childAt4 = getChildAt(i48);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1885f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1881b * i22) + cVar5.f1882c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i15 != 1073741824 ? i14 : i33);
    }

    public void B() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return m();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c C = m();
        C.f1880a = true;
        return C;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i11) {
        boolean z11 = false;
        if (i11 == 0) {
            return false;
        }
        View childAt = getChildAt(i11 - 1);
        View childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof a)) {
            z11 = false | ((a) childAt).a();
        }
        return (i11 <= 0 || !(childAt2 instanceof a)) ? z11 : z11 | ((a) childAt2).b();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean K() {
        return this.f1874s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f1872p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f1875u = aVar;
        this.v = aVar2;
    }

    public boolean P() {
        ActionMenuPresenter actionMenuPresenter = this.t;
        return actionMenuPresenter != null && actionMenuPresenter.M();
    }

    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f1872p = eVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean f(g gVar) {
        return this.f1872p.N(gVar, 0);
    }

    public Menu getMenu() {
        if (this.f1872p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1872p = eVar;
            eVar.V(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.t = actionMenuPresenter;
            actionMenuPresenter.L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.t;
            j.a aVar = this.f1875u;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.k(aVar);
            this.f1872p.c(this.t, this.q);
            this.t.J(this);
        }
        return this.f1872p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.C();
    }

    public int getPopupTheme() {
        return this.f1873r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f(false);
            if (this.t.G()) {
                this.t.D();
                this.t.M();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        if (!this.f1876w) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i13 - i11;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean b11 = u0.b(this);
        int i19 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1880a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i22)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b11) {
                        i15 = getPaddingLeft() + cVar.leftMargin;
                        i16 = i15 + measuredWidth;
                    } else {
                        i16 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i15 = i16 - measuredWidth;
                    }
                    int i23 = i17 - (measuredHeight / 2);
                    childAt.layout(i15, i23, i16, measuredHeight + i23);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i22);
                    i21++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i24 = (i18 / 2) - (measuredWidth2 / 2);
            int i25 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i24, i25, measuredWidth2 + i24, measuredHeight2 + i25);
            return;
        }
        int i26 = i21 - (i19 ^ 1);
        int max = Math.max(0, i26 > 0 ? paddingRight / i26 : 0);
        if (b11) {
            int width = getWidth() - getPaddingRight();
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt3 = getChildAt(i27);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1880a) {
                    int i28 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i29 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i28 - measuredWidth3, i29, i28, measuredHeight3 + i29);
                    width = i28 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i31 = 0; i31 < childCount; i31++) {
            View childAt4 = getChildAt(i31);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1880a) {
                int i32 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i33 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i32, i33, i32 + measuredWidth4, measuredHeight4 + i33);
                paddingLeft = i32 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = this.f1876w;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.f1876w = z12;
        if (z11 != z12) {
            this.f1877x = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (!(!this.f1876w || (eVar = this.f1872p) == null || size == this.f1877x)) {
            this.f1877x = size;
            eVar.M(true);
        }
        int childCount = getChildCount();
        if (!this.f1876w || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                c cVar = (c) getChildAt(i13).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i11, i12);
            return;
        }
        M(i11, i12);
    }

    public void setExpandedActionViewsExclusive(boolean z11) {
        this.t.I(z11);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.K(drawable);
    }

    public void setOverflowReserved(boolean z11) {
        this.f1874s = z11;
    }

    public void setPopupTheme(int i11) {
        if (this.f1873r != i11) {
            this.f1873r = i11;
            if (i11 == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.t = actionMenuPresenter;
        actionMenuPresenter.J(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f1878y = (int) (56.0f * f11);
        this.f1879z = (int) (f11 * 4.0f);
        this.q = context;
        this.f1873r = 0;
    }
}
