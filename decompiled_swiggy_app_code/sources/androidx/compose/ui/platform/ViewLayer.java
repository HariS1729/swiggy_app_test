package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k1.o;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;
import t0.d;
import t0.f;
import t0.m;
import u0.c1;
import u0.d1;
import u0.f0;
import u0.j1;
import u0.p0;
import u0.q1;
import u0.w0;
import u0.x;
import u0.y;

/* compiled from: ViewLayer.android.kt */
public final class ViewLayer extends View implements o {

    /* renamed from: m  reason: collision with root package name */
    public static final b f7191m = new b((i) null);
    private static final p<View, Matrix, k> n = ViewLayer$Companion$getMatrix$1.f7206a;

    /* renamed from: o  reason: collision with root package name */
    private static final ViewOutlineProvider f7192o = new a();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static Method f7193p;
    /* access modifiers changed from: private */
    public static Field q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static boolean f7194r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static boolean f7195s;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f7196a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f7197b;

    /* renamed from: c  reason: collision with root package name */
    private l<? super x, k> f7198c;

    /* renamed from: d  reason: collision with root package name */
    private lp0.a<k> f7199d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final v0 f7200e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7201f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f7202g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7203h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7204i;
    private final y j = new y();
    private final r0<View> k = new r0<>(n);

    /* renamed from: l  reason: collision with root package name */
    private long f7205l = q1.f16858b.a();

    /* compiled from: ViewLayer.android.kt */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.p.j(view, "view");
            kotlin.jvm.internal.p.j(outline, "outline");
            Outline c11 = ((ViewLayer) view).f7200e.c();
            kotlin.jvm.internal.p.g(c11);
            outline.set(c11);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        public final boolean a() {
            return ViewLayer.f7194r;
        }

        public final boolean b() {
            return ViewLayer.f7195s;
        }

        public final void c(boolean z11) {
            ViewLayer.f7195s = z11;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            Class<String> cls = String.class;
            kotlin.jvm.internal.p.j(view, "view");
            try {
                if (!a()) {
                    ViewLayer.f7194r = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f7193p = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.q = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        Object[] objArr = {"updateDisplayListIfDirty", new Class[0]};
                        ViewLayer.f7193p = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(View.class, objArr);
                        Object[] objArr2 = {"mRecreateDisplayList"};
                        ViewLayer.q = (Field) Class.class.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(View.class, objArr2);
                    }
                    Method n = ViewLayer.f7193p;
                    if (n != null) {
                        n.setAccessible(true);
                    }
                    Field l11 = ViewLayer.q;
                    if (l11 != null) {
                        l11.setAccessible(true);
                    }
                }
                Field l12 = ViewLayer.q;
                if (l12 != null) {
                    l12.setBoolean(view, true);
                }
                Method n11 = ViewLayer.f7193p;
                if (n11 != null) {
                    n11.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }
    }

    /* compiled from: ViewLayer.android.kt */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7207a = new c();

        private c() {
        }

        public static final long a(View view) {
            kotlin.jvm.internal.p.j(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, j0 j0Var, l<? super x, k> lVar, lp0.a<k> aVar) {
        super(androidComposeView.getContext());
        kotlin.jvm.internal.p.j(androidComposeView, "ownerView");
        kotlin.jvm.internal.p.j(j0Var, "container");
        kotlin.jvm.internal.p.j(lVar, "drawBlock");
        kotlin.jvm.internal.p.j(aVar, "invalidateParentLayer");
        this.f7196a = androidComposeView;
        this.f7197b = j0Var;
        this.f7198c = lVar;
        this.f7199d = aVar;
        this.f7200e = new v0(androidComposeView.getDensity());
        setWillNotDraw(false);
        setId(View.generateViewId());
        j0Var.addView(this);
    }

    private final w0 getManualClipPath() {
        if (!getClipToOutline() || this.f7200e.d()) {
            return null;
        }
        return this.f7200e.b();
    }

    private final void setInvalidated(boolean z11) {
        if (z11 != this.f7203h) {
            this.f7203h = z11;
            this.f7196a.c0(this, z11);
        }
    }

    private final void t() {
        Rect rect;
        if (this.f7201f) {
            Rect rect2 = this.f7202g;
            if (rect2 == null) {
                this.f7202g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.p.g(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f7202g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void u() {
        setOutlineProvider(this.f7200e.c() != null ? f7192o : null);
    }

    public void a(d dVar, boolean z11) {
        kotlin.jvm.internal.p.j(dVar, "rect");
        if (z11) {
            float[] a11 = this.k.a(this);
            if (a11 != null) {
                p0.g(a11, dVar);
            } else {
                dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            p0.g(this.k.b(this), dVar);
        }
    }

    public void b(l<? super x, k> lVar, lp0.a<k> aVar) {
        kotlin.jvm.internal.p.j(lVar, "drawBlock");
        kotlin.jvm.internal.p.j(aVar, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT >= 23 || f7195s) {
            this.f7197b.addView(this);
        } else {
            setVisibility(0);
        }
        this.f7201f = false;
        this.f7204i = false;
        this.f7205l = q1.f16858b.a();
        this.f7198c = lVar;
        this.f7199d = aVar;
    }

    public long c(long j11, boolean z11) {
        if (!z11) {
            return p0.f(this.k.b(this), j11);
        }
        float[] a11 = this.k.a(this);
        return a11 != null ? p0.f(a11, j11) : f.f16662b.a();
    }

    public void d(long j11) {
        int g11 = d2.p.g(j11);
        int f11 = d2.p.f(j11);
        if (g11 != getWidth() || f11 != getHeight()) {
            float f12 = (float) g11;
            setPivotX(q1.f(this.f7205l) * f12);
            float f13 = (float) f11;
            setPivotY(q1.g(this.f7205l) * f13);
            this.f7200e.h(m.a(f12, f13));
            u();
            layout(getLeft(), getTop(), getLeft() + g11, getTop() + f11);
            t();
            this.k.c();
        }
    }

    public void destroy() {
        setInvalidated(false);
        this.f7196a.i0();
        this.f7198c = null;
        this.f7199d = null;
        boolean g02 = this.f7196a.g0(this);
        if (Build.VERSION.SDK_INT >= 23 || f7195s || !g02) {
            this.f7197b.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.p.j(canvas, "canvas");
        boolean z11 = false;
        setInvalidated(false);
        y yVar = this.j;
        Canvas v = yVar.a().v();
        yVar.a().w(canvas);
        u0.b a11 = yVar.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z11 = true;
            a11.a();
            this.f7200e.a(a11);
        }
        l<? super x, k> lVar = this.f7198c;
        if (lVar != null) {
            lVar.invoke(a11);
        }
        if (z11) {
            a11.o();
        }
        yVar.a().w(v);
    }

    public void e(x xVar) {
        kotlin.jvm.internal.p.j(xVar, "canvas");
        boolean z11 = getElevation() > 0.0f;
        this.f7204i = z11;
        if (z11) {
            xVar.p();
        }
        this.f7197b.a(xVar, this, getDrawingTime());
        if (this.f7204i) {
            xVar.j();
        }
    }

    public boolean f(long j11) {
        float m11 = f.m(j11);
        float n11 = f.n(j11);
        if (this.f7201f) {
            if (0.0f > m11 || m11 >= ((float) getWidth()) || 0.0f > n11 || n11 >= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (getClipToOutline()) {
            return this.f7200e.e(j11);
        } else {
            return true;
        }
    }

    public void forceLayout() {
    }

    public void g(long j11) {
        int j12 = d2.l.j(j11);
        if (j12 != getLeft()) {
            offsetLeftAndRight(j12 - getLeft());
            this.k.c();
        }
        int k11 = d2.l.k(j11);
        if (k11 != getTop()) {
            offsetTopAndBottom(k11 - getTop());
            this.k.c();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final j0 getContainer() {
        return this.f7197b;
    }

    public long getLayerId() {
        return (long) getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f7196a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(this.f7196a);
        }
        return -1;
    }

    public void h() {
        if (this.f7203h && !f7195s) {
            setInvalidated(false);
            f7191m.d(this);
        }
    }

    public void i(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, j1 j1Var, boolean z11, d1 d1Var, long j12, long j13, LayoutDirection layoutDirection, e eVar) {
        lp0.a<k> aVar;
        j1 j1Var2 = j1Var;
        kotlin.jvm.internal.p.j(j1Var2, "shape");
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.p.j(eVar, "density");
        this.f7205l = j11;
        setScaleX(f11);
        float f22 = f12;
        setScaleY(f12);
        float f23 = f13;
        setAlpha(f13);
        float f24 = f14;
        setTranslationX(f14);
        setTranslationY(f15);
        setElevation(f16);
        setRotation(f19);
        setRotationX(f17);
        setRotationY(f18);
        setPivotX(q1.f(this.f7205l) * ((float) getWidth()));
        setPivotY(q1.g(this.f7205l) * ((float) getHeight()));
        setCameraDistancePx(f21);
        boolean z12 = true;
        this.f7201f = z11 && j1Var2 == c1.a();
        t();
        boolean z13 = getManualClipPath() != null;
        setClipToOutline(z11 && j1Var2 != c1.a());
        boolean g11 = this.f7200e.g(j1Var, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, eVar);
        u();
        if (getManualClipPath() == null) {
            z12 = false;
        }
        if (z13 != z12 || (z12 && g11)) {
            invalidate();
        }
        if (!this.f7204i && getElevation() > 0.0f && (aVar = this.f7199d) != null) {
            aVar.invoke();
        }
        this.k.c();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            p1 p1Var = p1.f7331a;
            p1Var.a(this, f0.j(j12));
            p1Var.b(this, f0.j(j13));
        }
        if (i11 >= 31) {
            q1.f7333a.a(this, d1Var);
        }
    }

    public void invalidate() {
        if (!this.f7203h) {
            setInvalidated(true);
            super.invalidate();
            this.f7196a.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    public final boolean s() {
        return this.f7203h;
    }

    public final void setCameraDistancePx(float f11) {
        setCameraDistance(f11 * ((float) getResources().getDisplayMetrics().densityDpi));
    }
}
