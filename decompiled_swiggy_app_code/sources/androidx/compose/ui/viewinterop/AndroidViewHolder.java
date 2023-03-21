package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.u0;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.lifecycle.q0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import bp0.k;
import d2.e;
import d2.g;
import d2.v;
import fp0.c;
import in.juspay.hyper.constants.LogCategory;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import lp0.a;
import lp0.l;
import p0.d;
import t0.f;
import wp0.k1;

/* compiled from: AndroidViewHolder.android.kt */
public abstract class AndroidViewHolder extends ViewGroup implements r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollDispatcher f7691a;

    /* renamed from: b  reason: collision with root package name */
    private View f7692b;

    /* renamed from: c  reason: collision with root package name */
    private a<k> f7693c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f7694d;

    /* renamed from: e  reason: collision with root package name */
    private d f7695e;

    /* renamed from: f  reason: collision with root package name */
    private l<? super d, k> f7696f;

    /* renamed from: g  reason: collision with root package name */
    private e f7697g;

    /* renamed from: h  reason: collision with root package name */
    private l<? super e, k> f7698h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.lifecycle.r f7699i;
    private n3.d j;
    /* access modifiers changed from: private */
    public final SnapshotStateObserver k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final l<AndroidViewHolder, k> f7700l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final a<k> f7701m;
    private l<? super Boolean, k> n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f7702o;

    /* renamed from: p  reason: collision with root package name */
    private int f7703p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private final s f7704r;

    /* renamed from: s  reason: collision with root package name */
    private final LayoutNode f7705s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(Context context, androidx.compose.runtime.a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        p.j(nestedScrollDispatcher, "dispatcher");
        this.f7691a = nestedScrollDispatcher;
        if (aVar != null) {
            WindowRecomposer_androidKt.i(this, aVar);
        }
        setSaveFromParentEnabled(false);
        this.f7693c = AndroidViewHolder$update$1.f7732a;
        d.a aVar2 = d.f16037h0;
        this.f7695e = aVar2;
        this.f7697g = g.b(1.0f, 0.0f, 2, (Object) null);
        this.k = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.f7700l = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.f7701m = new AndroidViewHolder$runUpdate$1(this);
        this.f7702o = new int[2];
        this.f7703p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.f7704r = new s(this);
        LayoutNode layoutNode = new LayoutNode(false, 1, (i) null);
        d a11 = OnGloballyPositionedModifierKt.a(DrawModifierKt.a(PointerInteropFilter_androidKt.a(aVar2, this), new AndroidViewHolder$layoutNode$1$coreModifier$1(layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode));
        layoutNode.a(this.f7695e.N(a11));
        this.f7696f = new AndroidViewHolder$layoutNode$1$1(layoutNode, a11);
        layoutNode.i(this.f7697g);
        this.f7698h = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        layoutNode.u1(new AndroidViewHolder$layoutNode$1$3(this, layoutNode, ref$ObjectRef));
        layoutNode.v1(new AndroidViewHolder$layoutNode$1$4(this, ref$ObjectRef));
        layoutNode.e(new AndroidViewHolder$layoutNode$1$5(this, layoutNode));
        this.f7705s = layoutNode;
    }

    /* access modifiers changed from: private */
    public final int g(int i11, int i12, int i13) {
        if (i13 >= 0 || i11 == i12) {
            return View.MeasureSpec.makeMeasureSpec(l.m(i13, i11, i12), 1073741824);
        }
        if (i13 == -2 && i12 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        if (i13 != -1 || i12 == Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f7702o);
        int[] iArr = this.f7702o;
        region.op(iArr[0], iArr[1], iArr[0] + getWidth(), this.f7702o[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final e getDensity() {
        return this.f7697g;
    }

    public final LayoutNode getLayoutNode() {
        return this.f7705s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        /*
            r2 = this;
            android.view.View r0 = r2.f7692b
            if (r0 == 0) goto L_0x000a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0010
        L_0x000a:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.getLayoutParams():android.view.ViewGroup$LayoutParams");
    }

    public final androidx.lifecycle.r getLifecycleOwner() {
        return this.f7699i;
    }

    public final d getModifier() {
        return this.f7695e;
    }

    public int getNestedScrollAxes() {
        return this.f7704r.a();
    }

    public final l<e, k> getOnDensityChanged$ui_release() {
        return this.f7698h;
    }

    public final l<d, k> getOnModifierChanged$ui_release() {
        return this.f7696f;
    }

    public final l<Boolean, k> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.n;
    }

    public final n3.d getSavedStateRegistryOwner() {
        return this.j;
    }

    public final a<k> getUpdate() {
        return this.f7693c;
    }

    public final View getView() {
        return this.f7692b;
    }

    public void h(View view, View view2, int i11, int i12) {
        p.j(view, "child");
        p.j(view2, "target");
        this.f7704r.c(view, view2, i11, i12);
    }

    public void i(View view, int i11) {
        p.j(view, "target");
        this.f7704r.e(view, i11);
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f7705s.I0();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        View view = this.f7692b;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    public void j(View view, int i11, int i12, int i13, int i14, int i15) {
        p.j(view, "target");
        if (isNestedScrollingEnabled()) {
            this.f7691a.b(t0.g.a(c.f(i11), c.f(i12)), t0.g.a(c.f(i13), c.f(i14)), c.h(i15));
        }
    }

    public final void k() {
        int i11;
        int i12 = this.f7703p;
        if (i12 != Integer.MIN_VALUE && (i11 = this.q) != Integer.MIN_VALUE) {
            measure(i12, i11);
        }
    }

    public void l(View view, int i11, int i12, int[] iArr, int i13) {
        p.j(view, "target");
        p.j(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long d11 = this.f7691a.d(t0.g.a(c.f(i11), c.f(i12)), c.h(i13));
            iArr[0] = u0.b(f.m(d11));
            iArr[1] = u0.b(f.n(d11));
        }
    }

    public void n(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        p.j(view, "target");
        p.j(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long b11 = this.f7691a.b(t0.g.a(c.f(i11), c.f(i12)), t0.g.a(c.f(i13), c.f(i14)), c.h(i15));
            iArr[0] = u0.b(f.m(b11));
            iArr[1] = u0.b(f.n(b11));
        }
    }

    public boolean o(View view, View view2, int i11, int i12) {
        p.j(view, "child");
        p.j(view2, "target");
        return ((i11 & 2) == 0 && (i11 & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.k();
    }

    public void onDescendantInvalidated(View view, View view2) {
        p.j(view, "child");
        p.j(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.f7705s.I0();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k.l();
        this.k.g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View view = this.f7692b;
        if (view != null) {
            view.layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        View view = this.f7692b;
        if (view != null) {
            view.measure(i11, i12);
        }
        View view2 = this.f7692b;
        int i13 = 0;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f7692b;
        if (view3 != null) {
            i13 = view3.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i13);
        this.f7703p = i11;
        this.q = i12;
    }

    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        View view2 = view;
        p.j(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long a11 = v.a(c.g(f11), c.g(f12));
        k1 unused = j.d(this.f7691a.e(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedFling$1(z11, this, a11, (c<? super AndroidViewHolder$onNestedFling$1>) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(View view, float f11, float f12) {
        p.j(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        k1 unused = j.d(this.f7691a.e(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedPreFling$1(this, v.a(c.g(f11), c.g(f12)), (c<? super AndroidViewHolder$onNestedPreFling$1>) null), 3, (Object) null);
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z11) {
        l<? super Boolean, k> lVar = this.n;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z11));
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public final void setDensity(e eVar) {
        p.j(eVar, "value");
        if (eVar != this.f7697g) {
            this.f7697g = eVar;
            l<? super e, k> lVar = this.f7698h;
            if (lVar != null) {
                lVar.invoke(eVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.r rVar) {
        if (rVar != this.f7699i) {
            this.f7699i = rVar;
            q0.b(this, rVar);
        }
    }

    public final void setModifier(d dVar) {
        p.j(dVar, "value");
        if (dVar != this.f7695e) {
            this.f7695e = dVar;
            l<? super d, k> lVar = this.f7696f;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(l<? super e, k> lVar) {
        this.f7698h = lVar;
    }

    public final void setOnModifierChanged$ui_release(l<? super d, k> lVar) {
        this.f7696f = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l<? super Boolean, k> lVar) {
        this.n = lVar;
    }

    public final void setSavedStateRegistryOwner(n3.d dVar) {
        if (dVar != this.j) {
            this.j = dVar;
            ViewTreeSavedStateRegistryOwner.b(this, dVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void setUpdate(a<k> aVar) {
        p.j(aVar, "value");
        this.f7693c = aVar;
        this.f7694d = true;
        this.f7701m.invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f7692b) {
            this.f7692b = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f7701m.invoke();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
