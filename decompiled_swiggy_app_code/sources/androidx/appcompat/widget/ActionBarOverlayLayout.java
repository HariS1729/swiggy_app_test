package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import androidx.core.view.a0;
import androidx.core.view.n0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements v, q, r {
    static final int[] F = {R.attr.actionBarSize, 16842841};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final s E;

    /* renamed from: a  reason: collision with root package name */
    private int f1830a;

    /* renamed from: b  reason: collision with root package name */
    private int f1831b = 0;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f1832c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f1833d;

    /* renamed from: e  reason: collision with root package name */
    private w f1834e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1835f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1836g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1837h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1838i;
    private boolean j;
    boolean k;

    /* renamed from: l  reason: collision with root package name */
    private int f1839l;

    /* renamed from: m  reason: collision with root package name */
    private int f1840m;
    private final Rect n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final Rect f1841o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    private final Rect f1842p = new Rect();
    private final Rect q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f1843r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f1844s = new Rect();
    private final Rect t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    private n0 f1845u;
    private n0 v;

    /* renamed from: w  reason: collision with root package name */
    private n0 f1846w;

    /* renamed from: x  reason: collision with root package name */
    private n0 f1847x;

    /* renamed from: y  reason: collision with root package name */
    private d f1848y;

    /* renamed from: z  reason: collision with root package name */
    private OverScroller f1849z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.k = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1833d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1833d.animate().translationY((float) (-ActionBarOverlayLayout.this.f1833d.getHeight())).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(int i11);

        void f(boolean z11);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i11, int i12) {
            super(i11, i12);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n0 n0Var = n0.f9558b;
        this.f1845u = n0Var;
        this.v = n0Var;
        this.f1846w = n0Var;
        this.f1847x = n0Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        v(context);
        this.E = new s(this);
    }

    private void A() {
        u();
        this.C.run();
    }

    private boolean B(float f11) {
        this.f1849z.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1849z.getFinalY() > this.f1833d.getHeight();
    }

    private void p() {
        u();
        this.D.run();
    }

    private boolean q(View view, Rect rect, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        e eVar = (e) view.getLayoutParams();
        if (!z11 || eVar.leftMargin == (i14 = rect.left)) {
            z15 = false;
        } else {
            eVar.leftMargin = i14;
            z15 = true;
        }
        if (z12 && eVar.topMargin != (i13 = rect.top)) {
            eVar.topMargin = i13;
            z15 = true;
        }
        if (z14 && eVar.rightMargin != (i12 = rect.right)) {
            eVar.rightMargin = i12;
            z15 = true;
        }
        if (!z13 || eVar.bottomMargin == (i11 = rect.bottom)) {
            return z15;
        }
        eVar.bottomMargin = i11;
        return true;
    }

    private w t(View view) {
        if (view instanceof w) {
            return (w) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        boolean z11 = false;
        this.f1830a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1835f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f1836g = z11;
        this.f1849z = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.D, 600);
    }

    private void y() {
        u();
        postDelayed(this.C, 600);
    }

    public boolean a() {
        z();
        return this.f1834e.a();
    }

    public boolean b() {
        z();
        return this.f1834e.b();
    }

    public boolean c() {
        z();
        return this.f1834e.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        z();
        return this.f1834e.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1835f != null && !this.f1836g) {
            int bottom = this.f1833d.getVisibility() == 0 ? (int) (((float) this.f1833d.getBottom()) + this.f1833d.getTranslationY() + 0.5f) : 0;
            this.f1835f.setBounds(0, bottom, getWidth(), this.f1835f.getIntrinsicHeight() + bottom);
            this.f1835f.draw(canvas);
        }
    }

    public void e(Menu menu, j.a aVar) {
        z();
        this.f1834e.e(menu, aVar);
    }

    public void f() {
        z();
        this.f1834e.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        z();
        return this.f1834e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1833d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f1834e.getTitle();
    }

    public void h(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    public void i(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    public void k(int i11) {
        z();
        if (i11 == 2) {
            this.f1834e.k();
        } else if (i11 == 5) {
            this.f1834e.o();
        } else if (i11 == 109) {
            setOverlayMode(true);
        }
    }

    public void l(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    public void m() {
        z();
        this.f1834e.m();
    }

    public void n(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        j(view, i11, i12, i13, i14, i15);
    }

    public boolean o(View view, View view2, int i11, int i12) {
        return i12 == 0 && onStartNestedScroll(view, view2, i11);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        n0 D2 = n0.D(windowInsets, this);
        boolean q11 = q(this.f1833d, new Rect(D2.p(), D2.r(), D2.q(), D2.o()), true, true, false, true);
        a0.h(this, D2, this.n);
        Rect rect = this.n;
        n0 s11 = D2.s(rect.left, rect.top, rect.right, rect.bottom);
        this.f1845u = s11;
        boolean z11 = true;
        if (!this.v.equals(s11)) {
            this.v = this.f1845u;
            q11 = true;
        }
        if (!this.f1841o.equals(this.n)) {
            this.f1841o.set(this.n);
        } else {
            z11 = q11;
        }
        if (z11) {
            requestLayout();
        }
        return D2.a().c().b().B();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        a0.t0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = eVar.leftMargin + paddingLeft;
                int i17 = eVar.topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13;
        z();
        measureChildWithMargins(this.f1833d, i11, 0, i12, 0);
        e eVar = (e) this.f1833d.getLayoutParams();
        int max = Math.max(0, this.f1833d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1833d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1833d.getMeasuredState());
        boolean z11 = (a0.S(this) & 256) != 0;
        if (z11) {
            i13 = this.f1830a;
            if (this.f1838i && this.f1833d.getTabContainer() != null) {
                i13 += this.f1830a;
            }
        } else {
            i13 = this.f1833d.getVisibility() != 8 ? this.f1833d.getMeasuredHeight() : 0;
        }
        this.f1842p.set(this.n);
        n0 n0Var = this.f1845u;
        this.f1846w = n0Var;
        if (this.f1837h || z11) {
            this.f1846w = new n0.b(this.f1846w).d(androidx.core.graphics.b.b(n0Var.p(), this.f1846w.r() + i13, this.f1846w.q(), this.f1846w.o() + 0)).a();
        } else {
            Rect rect = this.f1842p;
            rect.top += i13;
            rect.bottom += 0;
            this.f1846w = n0Var.s(0, i13, 0, 0);
        }
        q(this.f1832c, this.f1842p, true, true, true, true);
        if (!this.f1847x.equals(this.f1846w)) {
            n0 n0Var2 = this.f1846w;
            this.f1847x = n0Var2;
            a0.i(this.f1832c, n0Var2);
        }
        measureChildWithMargins(this.f1832c, i11, 0, i12, 0);
        e eVar2 = (e) this.f1832c.getLayoutParams();
        int max3 = Math.max(max, this.f1832c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1832c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1832c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (!this.j || !z11) {
            return false;
        }
        if (B(f12)) {
            p();
        } else {
            A();
        }
        this.k = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        int i15 = this.f1839l + i12;
        this.f1839l = i15;
        setActionBarHideOffset(i15);
    }

    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.E.b(view, view2, i11);
        this.f1839l = getActionBarHideOffset();
        u();
        d dVar = this.f1848y;
        if (dVar != null) {
            dVar.d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) == 0 || this.f1833d.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    public void onStopNestedScroll(View view) {
        if (this.j && !this.k) {
            if (this.f1839l <= this.f1833d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f1848y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i11) {
        super.onWindowSystemUiVisibilityChanged(i11);
        z();
        int i12 = this.f1840m ^ i11;
        this.f1840m = i11;
        boolean z11 = false;
        boolean z12 = (i11 & 4) == 0;
        if ((i11 & 256) != 0) {
            z11 = true;
        }
        d dVar = this.f1848y;
        if (dVar != null) {
            dVar.f(!z11);
            if (z12 || !z11) {
                this.f1848y.a();
            } else {
                this.f1848y.c();
            }
        }
        if ((i12 & 256) != 0 && this.f1848y != null) {
            a0.t0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f1831b = i11;
        d dVar = this.f1848y;
        if (dVar != null) {
            dVar.e(i11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i11) {
        u();
        this.f1833d.setTranslationY((float) (-Math.max(0, Math.min(i11, this.f1833d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1848y = dVar;
        if (getWindowToken() != null) {
            this.f1848y.e(this.f1831b);
            int i11 = this.f1840m;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                a0.t0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z11) {
        this.f1838i = z11;
    }

    public void setHideOnContentScrollEnabled(boolean z11) {
        if (z11 != this.j) {
            this.j = z11;
            if (!z11) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i11) {
        z();
        this.f1834e.setIcon(i11);
    }

    public void setLogo(int i11) {
        z();
        this.f1834e.v(i11);
    }

    public void setOverlayMode(boolean z11) {
        this.f1837h = z11;
        this.f1836g = z11 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z11) {
    }

    public void setUiOptions(int i11) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f1834e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f1834e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f1837h;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f1832c == null) {
            this.f1832c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1833d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f1834e = t(findViewById(R.id.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f1834e.setIcon(drawable);
    }
}
