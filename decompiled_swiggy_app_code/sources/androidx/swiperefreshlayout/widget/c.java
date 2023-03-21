package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.a0;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.s;

/* compiled from: SwipeRefreshLayout */
public class c extends ViewGroup implements o {
    private static final String P = c.class.getSimpleName();
    private static final int[] Q = {16842766};
    int A;
    b B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    boolean H;
    private int I;
    boolean K;
    private i L;
    private Animation.AnimationListener M;
    private final Animation N;
    private final Animation O;

    /* renamed from: a  reason: collision with root package name */
    private View f11786a;

    /* renamed from: b  reason: collision with root package name */
    j f11787b;

    /* renamed from: c  reason: collision with root package name */
    boolean f11788c;

    /* renamed from: d  reason: collision with root package name */
    private int f11789d;

    /* renamed from: e  reason: collision with root package name */
    private float f11790e;

    /* renamed from: f  reason: collision with root package name */
    private float f11791f;

    /* renamed from: g  reason: collision with root package name */
    private final s f11792g;

    /* renamed from: h  reason: collision with root package name */
    private final p f11793h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f11794i;
    private final int[] j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private int f11795l;

    /* renamed from: m  reason: collision with root package name */
    int f11796m;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    private float f11797o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11798p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    boolean f11799r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11800s;
    private final DecelerateInterpolator t;

    /* renamed from: u  reason: collision with root package name */
    a f11801u;
    private int v;

    /* renamed from: w  reason: collision with root package name */
    protected int f11802w;

    /* renamed from: x  reason: collision with root package name */
    float f11803x;

    /* renamed from: y  reason: collision with root package name */
    protected int f11804y;

    /* renamed from: z  reason: collision with root package name */
    int f11805z;

    /* compiled from: SwipeRefreshLayout */
    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (cVar.f11788c) {
                cVar.B.setAlpha(255);
                c.this.B.start();
                c cVar2 = c.this;
                if (cVar2.H && (jVar = cVar2.f11787b) != null) {
                    jVar.a();
                }
                c cVar3 = c.this;
                cVar3.f11796m = cVar3.f11801u.getTop();
                return;
            }
            cVar.k();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f11, Transformation transformation) {
            c.this.setAnimationProgress(f11);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$c  reason: collision with other inner class name */
    /* compiled from: SwipeRefreshLayout */
    class C0086c extends Animation {
        C0086c() {
        }

        public void applyTransformation(float f11, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f11);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11810b;

        d(int i11, int i12) {
            this.f11809a = i11;
            this.f11810b = i12;
        }

        public void applyTransformation(float f11, Transformation transformation) {
            b bVar = c.this.B;
            int i11 = this.f11809a;
            bVar.setAlpha((int) (((float) i11) + (((float) (this.f11810b - i11)) * f11)));
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (!cVar.f11799r) {
                cVar.r((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f11, Transformation transformation) {
            int i11;
            c cVar = c.this;
            if (!cVar.K) {
                i11 = cVar.f11805z - Math.abs(cVar.f11804y);
            } else {
                i11 = cVar.f11805z;
            }
            c cVar2 = c.this;
            int i12 = cVar2.f11802w;
            c.this.setTargetOffsetTopAndBottom((i12 + ((int) (((float) (i11 - i12)) * f11))) - cVar2.f11801u.getTop());
            c.this.B.e(1.0f - f11);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f11, Transformation transformation) {
            c.this.i(f11);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f11, Transformation transformation) {
            c cVar = c.this;
            float f12 = cVar.f11803x;
            cVar.setAnimationProgress(f12 + ((-f12) * f11));
            c.this.i(f11);
        }
    }

    /* compiled from: SwipeRefreshLayout */
    public interface i {
        boolean a(c cVar, View view);
    }

    /* compiled from: SwipeRefreshLayout */
    public interface j {
        void a();
    }

    public c(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(int i11, Animation.AnimationListener animationListener) {
        this.f11802w = i11;
        this.N.reset();
        this.N.setDuration(200);
        this.N.setInterpolator(this.t);
        if (animationListener != null) {
            this.f11801u.b(animationListener);
        }
        this.f11801u.clearAnimation();
        this.f11801u.startAnimation(this.N);
    }

    private void b(int i11, Animation.AnimationListener animationListener) {
        if (this.f11799r) {
            s(i11, animationListener);
            return;
        }
        this.f11802w = i11;
        this.O.reset();
        this.O.setDuration(200);
        this.O.setInterpolator(this.t);
        if (animationListener != null) {
            this.f11801u.b(animationListener);
        }
        this.f11801u.clearAnimation();
        this.f11801u.startAnimation(this.O);
    }

    private void d() {
        this.f11801u = new a(getContext(), -328966);
        b bVar = new b(getContext());
        this.B = bVar;
        bVar.l(1);
        this.f11801u.setImageDrawable(this.B);
        this.f11801u.setVisibility(8);
        addView(this.f11801u);
    }

    private void e() {
        if (this.f11786a == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.f11801u)) {
                    this.f11786a = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f11) {
        if (f11 > this.f11790e) {
            m(true, true);
            return;
        }
        this.f11788c = false;
        this.B.j(0.0f, 0.0f);
        e eVar = null;
        if (!this.f11799r) {
            eVar = new e();
        }
        b(this.f11796m, eVar);
        this.B.d(false);
    }

    private boolean g(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void h(float f11) {
        this.B.d(true);
        float min = Math.min(1.0f, Math.abs(f11 / this.f11790e));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f11) - this.f11790e;
        int i11 = this.A;
        if (i11 <= 0) {
            i11 = this.K ? this.f11805z - this.f11804y : this.f11805z;
        }
        float f12 = (float) i11;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f12 * 2.0f) / f12) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i12 = this.f11804y + ((int) ((f12 * min) + (f12 * pow * 2.0f)));
        if (this.f11801u.getVisibility() != 0) {
            this.f11801u.setVisibility(0);
        }
        if (!this.f11799r) {
            this.f11801u.setScaleX(1.0f);
            this.f11801u.setScaleY(1.0f);
        }
        if (this.f11799r) {
            setAnimationProgress(Math.min(1.0f, f11 / this.f11790e));
        }
        if (f11 < this.f11790e) {
            if (this.B.getAlpha() > 76 && !g(this.E)) {
                q();
            }
        } else if (this.B.getAlpha() < 255 && !g(this.F)) {
            p();
        }
        this.B.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.B.e(Math.min(1.0f, max));
        this.B.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i12 - this.f11796m);
    }

    private void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q) {
            this.q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void m(boolean z11, boolean z12) {
        if (this.f11788c != z11) {
            this.H = z12;
            e();
            this.f11788c = z11;
            if (z11) {
                a(this.f11796m, this.M);
            } else {
                r(this.M);
            }
        }
    }

    private Animation n(int i11, int i12) {
        d dVar = new d(i11, i12);
        dVar.setDuration(300);
        this.f11801u.b((Animation.AnimationListener) null);
        this.f11801u.clearAnimation();
        this.f11801u.startAnimation(dVar);
        return dVar;
    }

    private void o(float f11) {
        float f12 = this.f11797o;
        int i11 = this.f11789d;
        if (f11 - f12 > ((float) i11) && !this.f11798p) {
            this.n = f12 + ((float) i11);
            this.f11798p = true;
            this.B.setAlpha(76);
        }
    }

    private void p() {
        this.F = n(this.B.getAlpha(), 255);
    }

    private void q() {
        this.E = n(this.B.getAlpha(), 76);
    }

    private void s(int i11, Animation.AnimationListener animationListener) {
        this.f11802w = i11;
        this.f11803x = this.f11801u.getScaleX();
        h hVar = new h();
        this.G = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f11801u.b(animationListener);
        }
        this.f11801u.clearAnimation();
        this.f11801u.startAnimation(this.G);
    }

    private void setColorViewAlpha(int i11) {
        this.f11801u.getBackground().setAlpha(i11);
        this.B.setAlpha(i11);
    }

    private void t(Animation.AnimationListener animationListener) {
        this.f11801u.setVisibility(0);
        this.B.setAlpha(255);
        b bVar = new b();
        this.C = bVar;
        bVar.setDuration((long) this.f11795l);
        if (animationListener != null) {
            this.f11801u.b(animationListener);
        }
        this.f11801u.clearAnimation();
        this.f11801u.startAnimation(this.C);
    }

    public boolean c() {
        i iVar = this.L;
        if (iVar != null) {
            return iVar.a(this, this.f11786a);
        }
        View view = this.f11786a;
        if (view instanceof ListView) {
            return androidx.core.widget.i.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f11793h.a(f11, f12, z11);
    }

    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f11793h.b(f11, f12);
    }

    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f11793h.c(i11, i12, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f11793h.f(i11, i12, i13, i14, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.v;
        return i13 < 0 ? i12 : i12 == i11 + -1 ? i13 : i12 >= i13 ? i12 + 1 : i12;
    }

    public int getNestedScrollAxes() {
        return this.f11792g.a();
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.f11805z;
    }

    public int getProgressViewStartOffset() {
        return this.f11804y;
    }

    public boolean hasNestedScrollingParent() {
        return this.f11793h.j();
    }

    /* access modifiers changed from: package-private */
    public void i(float f11) {
        int i11 = this.f11802w;
        setTargetOffsetTopAndBottom((i11 + ((int) (((float) (this.f11804y - i11)) * f11))) - this.f11801u.getTop());
    }

    public boolean isNestedScrollingEnabled() {
        return this.f11793h.l();
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f11801u.clearAnimation();
        this.B.stop();
        this.f11801u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f11799r) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f11804y - this.f11796m);
        }
        this.f11796m = this.f11801u.getTop();
    }

    public void l(boolean z11, int i11, int i12) {
        this.f11799r = z11;
        this.f11804y = i11;
        this.f11805z = i12;
        this.K = true;
        k();
        this.f11788c = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11800s && actionMasked == 0) {
            this.f11800s = false;
        }
        if (!isEnabled() || this.f11800s || c() || this.f11788c || this.k) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i11 = this.q;
                    if (i11 == -1) {
                        Log.e(P, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    o(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        j(motionEvent);
                    }
                }
            }
            this.f11798p = false;
            this.q = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f11804y - this.f11801u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.q = pointerId;
            this.f11798p = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f11797o = motionEvent.getY(findPointerIndex2);
        }
        return this.f11798p;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f11786a == null) {
                e();
            }
            View view = this.f11786a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f11801u.getMeasuredWidth();
                int measuredHeight2 = this.f11801u.getMeasuredHeight();
                int i15 = measuredWidth / 2;
                int i16 = measuredWidth2 / 2;
                int i17 = this.f11796m;
                this.f11801u.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
            }
        }
    }

    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f11786a == null) {
            e();
        }
        View view = this.f11786a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f11801u.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
            this.v = -1;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) == this.f11801u) {
                    this.v = i13;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return dispatchNestedFling(f11, f12, z11);
    }

    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f11 = this.f11791f;
            if (f11 > 0.0f) {
                float f12 = (float) i12;
                if (f12 > f11) {
                    iArr[1] = i12 - ((int) f11);
                    this.f11791f = 0.0f;
                } else {
                    this.f11791f = f11 - f12;
                    iArr[1] = i12;
                }
                h(this.f11791f);
            }
        }
        if (this.K && i12 > 0 && this.f11791f == 0.0f && Math.abs(i12 - iArr[1]) > 0) {
            this.f11801u.setVisibility(8);
        }
        int[] iArr2 = this.f11794i;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i11, i12, i13, i14, this.j);
        int i15 = i14 + this.j[1];
        if (i15 < 0 && !c()) {
            float abs = this.f11791f + ((float) Math.abs(i15));
            this.f11791f = abs;
            h(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f11792g.b(view, view2, i11);
        startNestedScroll(i11 & 2);
        this.f11791f = 0.0f;
        this.k = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return isEnabled() && !this.f11800s && !this.f11788c && (i11 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f11792g.d(view);
        this.k = false;
        float f11 = this.f11791f;
        if (f11 > 0.0f) {
            f(f11);
            this.f11791f = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11800s && actionMasked == 0) {
            this.f11800s = false;
        }
        if (!isEnabled() || this.f11800s || c() || this.f11788c || this.k) {
            return false;
        }
        if (actionMasked == 0) {
            this.q = motionEvent.getPointerId(0);
            this.f11798p = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.q);
            if (findPointerIndex < 0) {
                Log.e(P, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f11798p) {
                this.f11798p = false;
                f((motionEvent.getY(findPointerIndex) - this.n) * 0.5f);
            }
            this.q = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.q);
            if (findPointerIndex2 < 0) {
                Log.e(P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y11 = motionEvent.getY(findPointerIndex2);
            o(y11);
            if (this.f11798p) {
                float f11 = (y11 - this.n) * 0.5f;
                if (f11 <= 0.0f) {
                    return false;
                }
                h(f11);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void r(Animation.AnimationListener animationListener) {
        C0086c cVar = new C0086c();
        this.D = cVar;
        cVar.setDuration(150);
        this.f11801u.b(animationListener);
        this.f11801u.clearAnimation();
        this.f11801u.startAnimation(this.D);
    }

    public void requestDisallowInterceptTouchEvent(boolean z11) {
        View view = this.f11786a;
        if (view == null || a0.b0(view)) {
            super.requestDisallowInterceptTouchEvent(z11);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f11) {
        this.f11801u.setScaleX(f11);
        this.f11801u.setScaleY(f11);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        this.B.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = androidx.core.content.a.c(context, iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f11790e = (float) i11;
    }

    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!z11) {
            k();
        }
    }

    public void setNestedScrollingEnabled(boolean z11) {
        this.f11793h.m(z11);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.L = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f11787b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.f11801u.setBackgroundColor(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.c(getContext(), i11));
    }

    public void setRefreshing(boolean z11) {
        int i11;
        if (!z11 || this.f11788c == z11) {
            m(z11, false);
            return;
        }
        this.f11788c = z11;
        if (!this.K) {
            i11 = this.f11805z + this.f11804y;
        } else {
            i11 = this.f11805z;
        }
        setTargetOffsetTopAndBottom(i11 - this.f11796m);
        this.H = false;
        t(this.M);
    }

    public void setSize(int i11) {
        if (i11 == 0 || i11 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i11 == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            this.f11801u.setImageDrawable((Drawable) null);
            this.B.l(i11);
            this.f11801u.setImageDrawable(this.B);
        }
    }

    public void setSlingshotDistance(int i11) {
        this.A = i11;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i11) {
        this.f11801u.bringToFront();
        a0.h0(this.f11801u, i11);
        this.f11796m = this.f11801u.getTop();
    }

    public boolean startNestedScroll(int i11) {
        return this.f11793h.o(i11);
    }

    public void stopNestedScroll() {
        this.f11793h.q();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11788c = false;
        this.f11790e = -1.0f;
        this.f11794i = new int[2];
        this.j = new int[2];
        this.q = -1;
        this.v = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f11789d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11795l = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i11 = (int) (displayMetrics.density * 64.0f);
        this.f11805z = i11;
        this.f11790e = (float) i11;
        this.f11792g = new s(this);
        this.f11793h = new p(this);
        setNestedScrollingEnabled(true);
        int i12 = -this.I;
        this.f11796m = i12;
        this.f11804y = i12;
        i(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
