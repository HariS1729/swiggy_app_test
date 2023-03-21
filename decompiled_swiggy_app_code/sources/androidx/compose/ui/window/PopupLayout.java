package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.r1;
import androidx.compose.ui.platform.s1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import bp0.k;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.l;
import d2.n;
import d2.o;
import d2.q;
import e0.d1;
import e0.g;
import e0.h0;
import e0.s0;
import i1.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import t0.f;

@SuppressLint({"ViewConstructor"})
/* compiled from: AndroidPopup.android.kt */
public final class PopupLayout extends AbstractComposeView implements s1 {

    /* renamed from: h  reason: collision with root package name */
    private lp0.a<k> f7842h;

    /* renamed from: i  reason: collision with root package name */
    private h f7843i;
    private String j;
    private final View k;

    /* renamed from: l  reason: collision with root package name */
    private final d f7844l;

    /* renamed from: m  reason: collision with root package name */
    private final WindowManager f7845m;
    private final WindowManager.LayoutParams n;

    /* renamed from: o  reason: collision with root package name */
    private g f7846o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutDirection f7847p;
    private final h0 q;

    /* renamed from: r  reason: collision with root package name */
    private final h0 f7848r;

    /* renamed from: s  reason: collision with root package name */
    private n f7849s;
    private final d1 t;

    /* renamed from: u  reason: collision with root package name */
    private final float f7850u;
    private final Rect v;

    /* renamed from: w  reason: collision with root package name */
    private final h0 f7851w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7852x;

    /* renamed from: y  reason: collision with root package name */
    private final int[] f7853y;

    /* compiled from: AndroidPopup.android.kt */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            p.j(view, "view");
            p.j(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7856a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f7856a = iArr;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(lp0.a r11, androidx.compose.ui.window.h r12, java.lang.String r13, android.view.View r14, d2.e r15, androidx.compose.ui.window.g r16, java.util.UUID r17, androidx.compose.ui.window.d r18, int r19, kotlin.jvm.internal.i r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.e r0 = new androidx.compose.ui.window.e
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.window.f r0 = new androidx.compose.ui.window.f
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(lp0.a, androidx.compose.ui.window.h, java.lang.String, android.view.View, d2.e, androidx.compose.ui.window.g, java.util.UUID, androidx.compose.ui.window.d, int, kotlin.jvm.internal.i):void");
    }

    private final lp0.p<g, Integer, k> getContent() {
        return (lp0.p) this.f7851w.getValue();
    }

    private final int getDisplayHeight() {
        return c.c(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return c.c(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final m getParentLayoutCoordinates() {
        return (m) this.f7848r.getValue();
    }

    private final void l(int i11) {
        WindowManager.LayoutParams layoutParams = this.n;
        layoutParams.flags = i11;
        this.f7844l.a(this.f7845m, this, layoutParams);
    }

    private final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & -8552473) | 262144;
        layoutParams.type = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        layoutParams.token = this.k.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.k.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final void r(LayoutDirection layoutDirection) {
        int i11 = b.f7856a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i12);
    }

    private final void setClippingEnabled(boolean z11) {
        int i11;
        if (z11) {
            i11 = this.n.flags & -513;
        } else {
            i11 = this.n.flags | TruecallerSdkScope.FOOTER_TYPE_MANUALLY;
        }
        l(i11);
    }

    private final void setContent(lp0.p<? super g, ? super Integer, k> pVar) {
        this.f7851w.setValue(pVar);
    }

    private final void setIsFocusable(boolean z11) {
        int i11;
        if (!z11) {
            i11 = this.n.flags | 8;
        } else {
            i11 = this.n.flags & -9;
        }
        l(i11);
    }

    private final void setParentLayoutCoordinates(m mVar) {
        this.f7848r.setValue(mVar);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i11;
        if (i.a(secureFlagPolicy, AndroidPopup_androidKt.f(this.k))) {
            i11 = this.n.flags | 8192;
        } else {
            i11 = this.n.flags & -8193;
        }
        l(i11);
    }

    public void a(g gVar, int i11) {
        g t11 = gVar.t(-857613600);
        getContent().invoke(t11, 0);
        s0 v11 = t11.v();
        if (v11 != null) {
            v11.a(new PopupLayout$Content$4(this, i11));
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        p.j(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.f7843i.b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                lp0.a<k> aVar = this.f7842h;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void g(boolean z11, int i11, int i12, int i13, int i14) {
        super.g(z11, i11, i12, i13, i14);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.n.width = childAt.getMeasuredWidth();
            this.n.height = childAt.getMeasuredHeight();
            this.f7844l.a(this.f7845m, this, this.n);
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.n;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.f7847p;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final d2.p m0getPopupContentSizebOM6tXw() {
        return (d2.p) this.q.getValue();
    }

    public final g getPositionProvider() {
        return this.f7846o;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7852x;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.j;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return r1.b(this);
    }

    public void h(int i11, int i12) {
        if (this.f7843i.g()) {
            super.h(i11, i12);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void n() {
        q0.b(this, (r) null);
        this.f7845m.removeViewImmediate(this);
    }

    public final void o() {
        int[] iArr = this.f7853y;
        int i11 = iArr[0];
        int i12 = iArr[1];
        this.k.getLocationOnScreen(iArr);
        int[] iArr2 = this.f7853y;
        if (i11 != iArr2[0] || i12 != iArr2[1]) {
            t();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7843i.c()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z11 = false;
        if (!(motionEvent != null && motionEvent.getAction() == 0) || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z11 = true;
            }
            if (!z11) {
                return super.onTouchEvent(motionEvent);
            }
            lp0.a<k> aVar = this.f7842h;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        lp0.a<k> aVar2 = this.f7842h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void p(androidx.compose.runtime.a aVar, lp0.p<? super g, ? super Integer, k> pVar) {
        p.j(aVar, "parent");
        p.j(pVar, "content");
        setParentCompositionContext(aVar);
        setContent(pVar);
        this.f7852x = true;
    }

    public final void q() {
        this.f7845m.addView(this, this.n);
    }

    public final void s(lp0.a<k> aVar, h hVar, String str, LayoutDirection layoutDirection) {
        p.j(hVar, "properties");
        p.j(str, "testTag");
        p.j(layoutDirection, "layoutDirection");
        this.f7842h = aVar;
        this.f7843i = hVar;
        this.j = str;
        setIsFocusable(hVar.e());
        setSecurePolicy(hVar.f());
        setClippingEnabled(hVar.a());
        r(layoutDirection);
    }

    public void setLayoutDirection(int i11) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        p.j(layoutDirection, "<set-?>");
        this.f7847p = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(d2.p pVar) {
        this.q.setValue(pVar);
    }

    public final void setPositionProvider(g gVar) {
        p.j(gVar, "<set-?>");
        this.f7846o = gVar;
    }

    public final void setTestTag(String str) {
        p.j(str, "<set-?>");
        this.j = str;
    }

    public final void t() {
        m parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long a11 = parentLayoutCoordinates.a();
            long f11 = i1.n.f(parentLayoutCoordinates);
            n a12 = o.a(d2.m.a(c.c(f.m(f11)), c.c(f.n(f11))), a11);
            if (!p.e(a12, this.f7849s)) {
                this.f7849s = a12;
                v();
            }
        }
    }

    public final void u(m mVar) {
        p.j(mVar, "parentLayoutCoordinates");
        setParentLayoutCoordinates(mVar);
        t();
    }

    public final void v() {
        d2.p r02;
        n nVar = this.f7849s;
        if (nVar != null && (r02 = m0getPopupContentSizebOM6tXw()) != null) {
            long j11 = r02.j();
            Rect rect = this.v;
            this.f7844l.c(this.k, rect);
            n e11 = AndroidPopup_androidKt.g(rect);
            long a11 = q.a(e11.d(), e11.a());
            long a12 = this.f7846o.a(nVar, a11, this.f7847p, j11);
            this.n.x = l.j(a12);
            this.n.y = l.k(a12);
            if (this.f7843i.d()) {
                this.f7844l.b(this, d2.p.g(a11), d2.p.f(a11));
            }
            this.f7844l.a(this.f7845m, this, this.n);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(lp0.a<bp0.k> r8, androidx.compose.ui.window.h r9, java.lang.String r10, android.view.View r11, d2.e r12, androidx.compose.ui.window.g r13, java.util.UUID r14, androidx.compose.ui.window.d r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.p.j(r11, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.p.j(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            kotlin.jvm.internal.p.j(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.p.i(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f7842h = r8
            r7.f7843i = r9
            r7.j = r10
            r7.k = r11
            r7.f7844l = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            java.util.Objects.requireNonNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f7845m = r8
            android.view.WindowManager$LayoutParams r8 = r7.m()
            r7.n = r8
            r7.f7846o = r13
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.ui.unit.LayoutDirection.Ltr
            r7.f7847p = r8
            r8 = 0
            r9 = 2
            e0.h0 r10 = androidx.compose.runtime.j.e(r8, r8, r9, r8)
            r7.q = r10
            e0.h0 r10 = androidx.compose.runtime.j.e(r8, r8, r9, r8)
            r7.f7848r = r10
            androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 r10 = new androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            r10.<init>(r7)
            e0.d1 r10 = androidx.compose.runtime.g.c(r10)
            r7.t = r10
            r10 = 30
            float r10 = (float) r10
            float r10 = d2.h.n(r10)
            r7.f7850u = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.v = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.r r13 = androidx.lifecycle.q0.a(r11)
            androidx.lifecycle.q0.b(r7, r13)
            androidx.lifecycle.p0 r13 = androidx.lifecycle.r0.a(r11)
            androidx.lifecycle.r0.b(r7, r13)
            n3.d r11 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.a(r11)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.b(r7, r11)
            int r11 = androidx.compose.ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Popup:"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.v0(r10)
            r7.setElevation(r10)
            androidx.compose.ui.window.PopupLayout$a r10 = new androidx.compose.ui.window.PopupLayout$a
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt r10 = androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.f7835a
            lp0.p r10 = r10.a()
            e0.h0 r8 = androidx.compose.runtime.j.e(r10, r8, r9, r8)
            r7.f7851w = r8
            int[] r8 = new int[r9]
            r7.f7853y = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(lp0.a, androidx.compose.ui.window.h, java.lang.String, android.view.View, d2.e, androidx.compose.ui.window.g, java.util.UUID, androidx.compose.ui.window.d):void");
    }
}
