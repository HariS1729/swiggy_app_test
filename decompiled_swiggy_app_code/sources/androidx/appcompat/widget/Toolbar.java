package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.a0;
import androidx.core.view.h;
import androidx.customview.view.AbsSavedState;
import defpackage.p1;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    f G;
    private final ActionMenuView.e H;
    private p0 I;
    private ActionMenuPresenter K;
    private d L;
    private j.a M;
    private e.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: a  reason: collision with root package name */
    private ActionMenuView f2019a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f2020b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f2021c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f2022d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f2023e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f2024f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f2025g;

    /* renamed from: h  reason: collision with root package name */
    ImageButton f2026h;

    /* renamed from: i  reason: collision with root package name */
    View f2027i;
    private Context j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private int f2028l;

    /* renamed from: m  reason: collision with root package name */
    private int f2029m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    private int f2030o;

    /* renamed from: p  reason: collision with root package name */
    private int f2031p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private int f2032r;

    /* renamed from: s  reason: collision with root package name */
    private int f2033s;
    private g0 t;

    /* renamed from: u  reason: collision with root package name */
    private int f2034u;
    private int v;

    /* renamed from: w  reason: collision with root package name */
    private int f2035w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f2036x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f2037y;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f2038z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.G;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.P();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements j {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.e f2044a;

        /* renamed from: b  reason: collision with root package name */
        g f2045b;

        d() {
        }

        public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
        }

        public boolean d(androidx.appcompat.view.menu.e eVar, g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f2026h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2026h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2026h);
            }
            Toolbar.this.f2027i = gVar.getActionView();
            this.f2045b = gVar;
            ViewParent parent2 = Toolbar.this.f2027i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2027i);
                }
                e m11 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m11.f1512a = 8388611 | (toolbar4.n & 112);
                m11.f2047b = 2;
                toolbar4.f2027i.setLayoutParams(m11);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f2027i);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f2027i;
            if (view instanceof p1.d) {
                ((p1.d) view).d();
            }
            return true;
        }

        public Parcelable e() {
            return null;
        }

        public void f(boolean z11) {
            if (this.f2045b != null) {
                androidx.appcompat.view.menu.e eVar = this.f2044a;
                boolean z12 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        } else if (this.f2044a.getItem(i11) == this.f2045b) {
                            z12 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z12) {
                    h(this.f2044a, this.f2045b);
                }
            }
        }

        public boolean g() {
            return false;
        }

        public int getId() {
            return 0;
        }

        public boolean h(androidx.appcompat.view.menu.e eVar, g gVar) {
            View view = Toolbar.this.f2027i;
            if (view instanceof p1.d) {
                ((p1.d) view).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2027i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2026h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2027i = null;
            toolbar3.a();
            this.f2045b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f2044a;
            if (!(eVar2 == null || (gVar = this.f2045b) == null)) {
                eVar2.f(gVar);
            }
            this.f2044a = eVar;
        }

        public void l(Parcelable parcelable) {
        }

        public boolean m(m mVar) {
            return false;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private int B(View view, int i11, int[] iArr, int i12) {
        e eVar = (e) view.getLayoutParams();
        int i13 = eVar.leftMargin - iArr[0];
        int max = i11 + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        int q11 = q(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q11, max + measuredWidth, view.getMeasuredHeight() + q11);
        return max + measuredWidth + eVar.rightMargin;
    }

    private int C(View view, int i11, int[] iArr, int i12) {
        e eVar = (e) view.getLayoutParams();
        int i13 = eVar.rightMargin - iArr[1];
        int max = i11 - Math.max(0, i13);
        iArr[1] = Math.max(0, -i13);
        int q11 = q(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q11, max, view.getMeasuredHeight() + q11);
        return max - (measuredWidth + eVar.leftMargin);
    }

    private int D(View view, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i15 = marginLayoutParams.leftMargin - iArr[0];
        int i16 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i16);
        iArr[0] = Math.max(0, -i15);
        iArr[1] = Math.max(0, -i16);
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + max + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i11, int i12, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i15 >= 0) {
            if (mode != 0) {
                i15 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i15);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean N() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i11) {
        boolean z11 = a0.F(this) == 1;
        int childCount = getChildCount();
        int b11 = androidx.core.view.e.b(i11, a0.F(this));
        list.clear();
        if (z11) {
            for (int i12 = childCount - 1; i12 >= 0; i12--) {
                View childAt = getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f2047b == 0 && O(childAt) && p(eVar.f1512a) == b11) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f2047b == 0 && O(childAt2) && p(eVar2.f1512a) == b11) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z11) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f2047b = 1;
        if (!z11 || this.f2027i == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.E.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new p1.h(getContext());
    }

    private void h() {
        if (this.t == null) {
            this.t = new g0();
        }
    }

    private void i() {
        if (this.f2023e == null) {
            this.f2023e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f2019a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f2019a.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f2019a.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.j);
        }
    }

    private void k() {
        if (this.f2019a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f2019a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f2019a.setOnMenuItemClickListener(this.H);
            this.f2019a.O(this.M, this.N);
            e m11 = generateDefaultLayoutParams();
            m11.f1512a = 8388613 | (this.n & 112);
            this.f2019a.setLayoutParams(m11);
            c(this.f2019a, false);
        }
    }

    private void l() {
        if (this.f2022d == null) {
            this.f2022d = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e m11 = generateDefaultLayoutParams();
            m11.f1512a = 8388611 | (this.n & 112);
            this.f2022d.setLayoutParams(m11);
        }
    }

    private int p(int i11) {
        int F2 = a0.F(this);
        int b11 = androidx.core.view.e.b(i11, F2) & 7;
        if (b11 == 1 || b11 == 3 || b11 == 5) {
            return b11;
        }
        return F2 == 1 ? 5 : 3;
    }

    private int q(View view, int i11) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i11 > 0 ? (measuredHeight - i11) / 2 : 0;
        int r11 = r(eVar.f1512a);
        if (r11 == 48) {
            return getPaddingTop() - i12;
        }
        if (r11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i12;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = eVar.topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = eVar.bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    private int r(int i11) {
        int i12 = i11 & 112;
        return (i12 == 16 || i12 == 48 || i12 == 80) ? i12 : this.f2035w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.b(marginLayoutParams) + h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            View view = list.get(i13);
            e eVar = (e) view.getLayoutParams();
            int i15 = eVar.leftMargin - i11;
            int i16 = eVar.rightMargin - i12;
            int max = Math.max(0, i15);
            int max2 = Math.max(0, i16);
            int max3 = Math.max(0, -i15);
            int max4 = Math.max(0, -i16);
            i14 += max + view.getMeasuredWidth() + max2;
            i13++;
            i12 = max4;
            i11 = max3;
        }
        return i14;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f2019a;
        return actionMenuView != null && actionMenuView.J();
    }

    /* access modifiers changed from: package-private */
    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f2047b == 2 || childAt == this.f2019a)) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void H(int i11, int i12) {
        h();
        this.t.e(i11, i12);
    }

    public void I(int i11, int i12) {
        h();
        this.t.g(i11, i12);
    }

    public void J(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar != null || this.f2019a != null) {
            k();
            androidx.appcompat.view.menu.e N2 = this.f2019a.N();
            if (N2 != eVar) {
                if (N2 != null) {
                    N2.Q(this.K);
                    N2.Q(this.L);
                }
                if (this.L == null) {
                    this.L = new d();
                }
                actionMenuPresenter.I(true);
                if (eVar != null) {
                    eVar.c(actionMenuPresenter, this.j);
                    eVar.c(this.L, this.j);
                } else {
                    actionMenuPresenter.i(this.j, (androidx.appcompat.view.menu.e) null);
                    this.L.i(this.j, (androidx.appcompat.view.menu.e) null);
                    actionMenuPresenter.f(true);
                    this.L.f(true);
                }
                this.f2019a.setPopupTheme(this.k);
                this.f2019a.setPresenter(actionMenuPresenter);
                this.K = actionMenuPresenter;
            }
        }
    }

    public void K(j.a aVar, e.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f2019a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void L(Context context, int i11) {
        this.f2029m = i11;
        TextView textView = this.f2021c;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    public void M(Context context, int i11) {
        this.f2028l = i11;
        TextView textView = this.f2020b;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    public boolean P() {
        ActionMenuView actionMenuView = this.f2019a;
        return actionMenuView != null && actionMenuView.P();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2019a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f2019a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        g gVar;
        d dVar = this.L;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f2045b;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f2019a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f2026h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f2026h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f2024f);
            this.f2026h.setContentDescription(this.f2025g);
            e m11 = generateDefaultLayoutParams();
            m11.f1512a = 8388611 | (this.n & 112);
            m11.f2047b = 2;
            this.f2026h.setLayoutParams(m11);
            this.f2026h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f2026h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f2026h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        g0 g0Var = this.t;
        if (g0Var != null) {
            return g0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i11 = this.v;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        g0 g0Var = this.t;
        if (g0Var != null) {
            return g0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        g0 g0Var = this.t;
        if (g0Var != null) {
            return g0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        g0 g0Var = this.t;
        if (g0Var != null) {
            return g0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i11 = this.f2034u;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f2019a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.e r0 = r0.N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.v
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (a0.F(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (a0.F(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2034u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2023e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2023e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f2019a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2022d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2022d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f2019a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.f2037y;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f2021c;
    }

    public CharSequence getTitle() {
        return this.f2036x;
    }

    public int getTitleMarginBottom() {
        return this.f2033s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.f2031p;
    }

    public int getTitleMarginTop() {
        return this.f2032r;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f2020b;
    }

    public w getWrapper() {
        if (this.I == null) {
            this.I = new p0(this, true);
        }
        return this.I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0011a) {
            return new e((a.C0011a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.a0.F(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.F
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.a0.G(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f2022d
            boolean r13 = r0.O(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f2022d
            int r13 = r0.C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f2022d
            int r13 = r0.B(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f2026h
            boolean r15 = r0.O(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f2026h
            int r14 = r0.C(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f2026h
            int r13 = r0.B(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2019a
            boolean r15 = r0.O(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2019a
            int r13 = r0.B(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f2019a
            int r14 = r0.C(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f2027i
            boolean r13 = r0.O(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f2027i
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f2027i
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f2023e
            boolean r13 = r0.O(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f2023e
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f2023e
            int r2 = r0.B(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f2020b
            boolean r13 = r0.O(r13)
            android.widget.TextView r14 = r0.f2021c
            boolean r14 = r0.O(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f2020b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f2020b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f2021c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f2021c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f2020b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f2021c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f2021c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f2020b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f2020b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f2021c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f2035w
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f2032r
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f2033s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f2033s
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f2032r
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f2031p
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f2020b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f2020b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f2020b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f2020b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.q
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f2021c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f2021c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f2021c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f2021c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.q
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f2031p
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f2020b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f2020b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f2020b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f2020b
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.q
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f2021c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f2021c
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f2021c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f2021c
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.q
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.D
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.D
            int r3 = r3.size()
            r7 = 0
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.D
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.D
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.D
            int r3 = r3.size()
            r7 = 0
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.D
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.D
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.D
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.D
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.D
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = this.F;
        char b11 = u0.b(this);
        int i21 = 0;
        char c11 = b11 ^ 1;
        if (O(this.f2022d)) {
            E(this.f2022d, i11, 0, i12, 0, this.f2030o);
            i15 = this.f2022d.getMeasuredWidth() + s(this.f2022d);
            i14 = Math.max(0, this.f2022d.getMeasuredHeight() + t(this.f2022d));
            i13 = View.combineMeasuredStates(0, this.f2022d.getMeasuredState());
        } else {
            i15 = 0;
            i14 = 0;
            i13 = 0;
        }
        if (O(this.f2026h)) {
            E(this.f2026h, i11, 0, i12, 0, this.f2030o);
            i15 = this.f2026h.getMeasuredWidth() + s(this.f2026h);
            i14 = Math.max(i14, this.f2026h.getMeasuredHeight() + t(this.f2026h));
            i13 = View.combineMeasuredStates(i13, this.f2026h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i15);
        iArr[b11] = Math.max(0, currentContentInsetStart - i15);
        if (O(this.f2019a)) {
            E(this.f2019a, i11, max, i12, 0, this.f2030o);
            i16 = this.f2019a.getMeasuredWidth() + s(this.f2019a);
            i14 = Math.max(i14, this.f2019a.getMeasuredHeight() + t(this.f2019a));
            i13 = View.combineMeasuredStates(i13, this.f2019a.getMeasuredState());
        } else {
            i16 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i16);
        iArr[c11] = Math.max(0, currentContentInsetEnd - i16);
        if (O(this.f2027i)) {
            max2 += D(this.f2027i, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.f2027i.getMeasuredHeight() + t(this.f2027i));
            i13 = View.combineMeasuredStates(i13, this.f2027i.getMeasuredState());
        }
        if (O(this.f2023e)) {
            max2 += D(this.f2023e, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.f2023e.getMeasuredHeight() + t(this.f2023e));
            i13 = View.combineMeasuredStates(i13, this.f2023e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (((e) childAt.getLayoutParams()).f2047b == 0 && O(childAt)) {
                max2 += D(childAt, i11, max2, i12, 0, iArr);
                i14 = Math.max(i14, childAt.getMeasuredHeight() + t(childAt));
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        int i23 = this.f2032r + this.f2033s;
        int i24 = this.f2031p + this.q;
        if (O(this.f2020b)) {
            D(this.f2020b, i11, max2 + i24, i12, i23, iArr);
            int measuredWidth = this.f2020b.getMeasuredWidth() + s(this.f2020b);
            i17 = this.f2020b.getMeasuredHeight() + t(this.f2020b);
            i19 = View.combineMeasuredStates(i13, this.f2020b.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i19 = i13;
            i18 = 0;
            i17 = 0;
        }
        if (O(this.f2021c)) {
            int i25 = i17 + i23;
            i18 = Math.max(i18, D(this.f2021c, i11, max2 + i24, i12, i25, iArr));
            i17 += this.f2021c.getMeasuredHeight() + t(this.f2021c);
            i19 = View.combineMeasuredStates(i19, this.f2021c.getMeasuredState());
        } else {
            int i26 = i19;
        }
        int max3 = Math.max(i14, i17);
        int paddingLeft = max2 + i18 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, -16777216 & i19);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, i19 << 16);
        if (!N()) {
            i21 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i21);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f2019a;
        androidx.appcompat.view.menu.e N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i11 = savedState.f2039c;
        if (!(i11 == 0 || this.L == null || N2 == null || (findItem = N2.findItem(i11)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f2040d) {
            F();
        }
    }

    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        h();
        g0 g0Var = this.t;
        boolean z11 = true;
        if (i11 != 1) {
            z11 = false;
        }
        g0Var.f(z11);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (gVar = dVar.f2045b) == null)) {
            savedState.f2039c = gVar.getItemId();
        }
        savedState.f2040d = A();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i11) {
        setCollapseContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setCollapseIcon(int i11) {
        setCollapseIcon(f.a.b(getContext(), i11));
    }

    public void setCollapsible(boolean z11) {
        this.O = z11;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.v) {
            this.v = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f2034u) {
            this.f2034u = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i11) {
        setLogo(f.a.b(getContext(), i11));
    }

    public void setLogoDescription(int i11) {
        setLogoDescription(getContext().getText(i11));
    }

    public void setNavigationContentDescription(int i11) {
        setNavigationContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setNavigationIcon(int i11) {
        setNavigationIcon(f.a.b(getContext(), i11));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f2022d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.G = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f2019a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i11) {
        if (this.k != i11) {
            this.k = i11;
            if (i11 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setSubtitle(int i11) {
        setSubtitle(getContext().getText(i11));
    }

    public void setSubtitleTextColor(int i11) {
        setSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setTitle(int i11) {
        setTitle(getContext().getText(i11));
    }

    public void setTitleMarginBottom(int i11) {
        this.f2033s = i11;
        requestLayout();
    }

    public void setTitleMarginEnd(int i11) {
        this.q = i11;
        requestLayout();
    }

    public void setTitleMarginStart(int i11) {
        this.f2031p = i11;
        requestLayout();
    }

    public void setTitleMarginTop(int i11) {
        this.f2032r = i11;
        requestLayout();
    }

    public void setTitleTextColor(int i11) {
        setTitleTextColor(ColorStateList.valueOf(i11));
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f2045b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f2019a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i11) {
        getMenuInflater().inflate(i11, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f2019a;
        return actionMenuView != null && actionMenuView.I();
    }

    public static class e extends a.C0011a {

        /* renamed from: b  reason: collision with root package name */
        int f2047b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i11, int i12) {
            super(i11, i12);
            this.f1512a = 8388627;
        }

        public e(e eVar) {
            super((a.C0011a) eVar);
            this.f2047b = eVar.f2047b;
        }

        public e(a.C0011a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f2026h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f2026h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f2026h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f2024f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f2023e)) {
                c(this.f2023e, true);
            }
        } else {
            ImageView imageView = this.f2023e;
            if (imageView != null && y(imageView)) {
                removeView(this.f2023e);
                this.E.remove(this.f2023e);
            }
        }
        ImageView imageView2 = this.f2023e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f2023e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f2022d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f2022d)) {
                c(this.f2022d, true);
            }
        } else {
            ImageButton imageButton = this.f2022d;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f2022d);
                this.E.remove(this.f2022d);
            }
        }
        ImageButton imageButton2 = this.f2022d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2021c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2021c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2021c.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f2029m;
                if (i11 != 0) {
                    this.f2021c.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f2021c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f2021c)) {
                c(this.f2021c, true);
            }
        } else {
            TextView textView = this.f2021c;
            if (textView != null && y(textView)) {
                removeView(this.f2021c);
                this.E.remove(this.f2021c);
            }
        }
        TextView textView2 = this.f2021c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2037y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f2021c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2020b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2020b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2020b.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f2028l;
                if (i11 != 0) {
                    this.f2020b.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.f2038z;
                if (colorStateList != null) {
                    this.f2020b.setTextColor(colorStateList);
                }
            }
            if (!y(this.f2020b)) {
                c(this.f2020b, true);
            }
        } else {
            TextView textView = this.f2020b;
            if (textView != null && y(textView)) {
                removeView(this.f2020b);
                this.E.remove(this.f2020b);
            }
        }
        TextView textView2 = this.f2020b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2036x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2038z = colorStateList;
        TextView textView = this.f2020b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f2039c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2040d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2039c = parcel.readInt();
            this.f2040d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f2039c);
            parcel.writeInt(this.f2040d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2035w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new a();
        this.P = new b();
        Context context2 = getContext();
        int[] iArr = R.styleable.Toolbar;
        o0 v11 = o0.v(context2, attributeSet, iArr, i11, 0);
        a0.u0(this, context, iArr, attributeSet, v11.r(), i11, 0);
        this.f2028l = v11.n(R.styleable.Toolbar_titleTextAppearance, 0);
        this.f2029m = v11.n(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f2035w = v11.l(R.styleable.Toolbar_android_gravity, this.f2035w);
        this.n = v11.l(R.styleable.Toolbar_buttonGravity, 48);
        int e11 = v11.e(R.styleable.Toolbar_titleMargin, 0);
        int i12 = R.styleable.Toolbar_titleMargins;
        e11 = v11.s(i12) ? v11.e(i12, e11) : e11;
        this.f2033s = e11;
        this.f2032r = e11;
        this.q = e11;
        this.f2031p = e11;
        int e12 = v11.e(R.styleable.Toolbar_titleMarginStart, -1);
        if (e12 >= 0) {
            this.f2031p = e12;
        }
        int e13 = v11.e(R.styleable.Toolbar_titleMarginEnd, -1);
        if (e13 >= 0) {
            this.q = e13;
        }
        int e14 = v11.e(R.styleable.Toolbar_titleMarginTop, -1);
        if (e14 >= 0) {
            this.f2032r = e14;
        }
        int e15 = v11.e(R.styleable.Toolbar_titleMarginBottom, -1);
        if (e15 >= 0) {
            this.f2033s = e15;
        }
        this.f2030o = v11.f(R.styleable.Toolbar_maxButtonHeight, -1);
        int e16 = v11.e(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int e17 = v11.e(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int f11 = v11.f(R.styleable.Toolbar_contentInsetLeft, 0);
        int f12 = v11.f(R.styleable.Toolbar_contentInsetRight, 0);
        h();
        this.t.e(f11, f12);
        if (!(e16 == Integer.MIN_VALUE && e17 == Integer.MIN_VALUE)) {
            this.t.g(e16, e17);
        }
        this.f2034u = v11.e(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.v = v11.e(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2024f = v11.g(R.styleable.Toolbar_collapseIcon);
        this.f2025g = v11.p(R.styleable.Toolbar_collapseContentDescription);
        CharSequence p11 = v11.p(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(p11)) {
            setTitle(p11);
        }
        CharSequence p12 = v11.p(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p12)) {
            setSubtitle(p12);
        }
        this.j = getContext();
        setPopupTheme(v11.n(R.styleable.Toolbar_popupTheme, 0));
        Drawable g11 = v11.g(R.styleable.Toolbar_navigationIcon);
        if (g11 != null) {
            setNavigationIcon(g11);
        }
        CharSequence p13 = v11.p(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p13)) {
            setNavigationContentDescription(p13);
        }
        Drawable g12 = v11.g(R.styleable.Toolbar_logo);
        if (g12 != null) {
            setLogo(g12);
        }
        CharSequence p14 = v11.p(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p14)) {
            setLogoDescription(p14);
        }
        int i13 = R.styleable.Toolbar_titleTextColor;
        if (v11.s(i13)) {
            setTitleTextColor(v11.c(i13));
        }
        int i14 = R.styleable.Toolbar_subtitleTextColor;
        if (v11.s(i14)) {
            setSubtitleTextColor(v11.c(i14));
        }
        int i15 = R.styleable.Toolbar_menu;
        if (v11.s(i15)) {
            x(v11.n(i15, 0));
        }
        v11.w();
    }
}
