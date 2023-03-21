package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.g;
import androidx.compose.ui.focus.FocusManagerImpl;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.c0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d1.a;
import e0.a1;
import f1.h0;
import f1.i0;
import f1.r;
import f1.s;
import f1.x;
import f1.z;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import k1.h;
import k1.l;
import k1.o;
import k1.q;
import k1.u;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import n1.m;
import n1.n;
import p0.d;
import s0.t;
import t0.f;
import u0.p0;
import u0.y;
import u1.h;
import u1.i;
import v1.a0;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView extends ViewGroup implements q, t1, h0, DefaultLifecycleObserver {
    public static final a E0 = new a((i) null);
    /* access modifiers changed from: private */
    public static Class<?> F0;
    /* access modifiers changed from: private */
    public static Method G0;
    private boolean A;
    private final lp0.a<k> A0;
    private z B;
    private final b0 B0;
    private j0 C;
    /* access modifiers changed from: private */
    public r C0;
    private d2.b D;
    private final s D0;
    private boolean E;
    private final l F;
    private final n1 G;
    private long H;
    private final int[] I;
    private final float[] K;
    private final float[] L;
    private long M;
    private boolean N;
    private long O;
    private boolean P;
    private final e0.h0 Q;
    private lp0.l<? super b, k> R;
    private final ViewTreeObserver.OnGlobalLayoutListener S;
    private final ViewTreeObserver.OnScrollChangedListener T;
    private final ViewTreeObserver.OnTouchModeChangeListener U;
    private final TextInputServiceAndroid V;
    private final a0 W;

    /* renamed from: a  reason: collision with root package name */
    private long f6949a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6950b = true;

    /* renamed from: c  reason: collision with root package name */
    private final h f6951c = new h((w0.a) null, 1, (i) null);

    /* renamed from: c0  reason: collision with root package name */
    private final h.a f6952c0;

    /* renamed from: d  reason: collision with root package name */
    private d2.e f6953d;

    /* renamed from: e  reason: collision with root package name */
    private final m f6954e;

    /* renamed from: f  reason: collision with root package name */
    private final FocusManagerImpl f6955f;

    /* renamed from: g  reason: collision with root package name */
    private final w1 f6956g;

    /* renamed from: h  reason: collision with root package name */
    private final d1.e f6957h;

    /* renamed from: i  reason: collision with root package name */
    private final p0.d f6958i;
    private final y j;
    private final LayoutNode k;

    /* renamed from: l  reason: collision with root package name */
    private final u f6959l;

    /* renamed from: m  reason: collision with root package name */
    private final n f6960m;
    private final AndroidComposeViewAccessibilityDelegateCompat n;

    /* renamed from: n0  reason: collision with root package name */
    private final e0.h0 f6961n0;

    /* renamed from: o  reason: collision with root package name */
    private final q0.i f6962o;

    /* renamed from: o0  reason: collision with root package name */
    private int f6963o0;

    /* renamed from: p  reason: collision with root package name */
    private final List<o> f6964p;

    /* renamed from: p0  reason: collision with root package name */
    private final e0.h0 f6965p0;
    private List<o> q;

    /* renamed from: q0  reason: collision with root package name */
    private final a1.a f6966q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6967r;

    /* renamed from: r0  reason: collision with root package name */
    private final b1.c f6968r0;

    /* renamed from: s  reason: collision with root package name */
    private final f1.i f6969s;

    /* renamed from: s0  reason: collision with root package name */
    private final g1 f6970s0;
    private final z t;
    /* access modifiers changed from: private */

    /* renamed from: t0  reason: collision with root package name */
    public MotionEvent f6971t0;

    /* renamed from: u  reason: collision with root package name */
    private lp0.l<? super Configuration, k> f6972u;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public long f6973u0;
    private final q0.a v;

    /* renamed from: v0  reason: collision with root package name */
    private final u1<o> f6974v0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6975w;

    /* renamed from: w0  reason: collision with root package name */
    private final f0.e<lp0.a<k>> f6976w0;

    /* renamed from: x  reason: collision with root package name */
    private final k f6977x;
    /* access modifiers changed from: private */

    /* renamed from: x0  reason: collision with root package name */
    public final e f6978x0;

    /* renamed from: y  reason: collision with root package name */
    private final j f6979y;

    /* renamed from: y0  reason: collision with root package name */
    private final Runnable f6980y0;

    /* renamed from: z  reason: collision with root package name */
    private final OwnerSnapshotObserver f6981z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f6982z0;

    /* compiled from: AndroidComposeView.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.F0 == null) {
                    AndroidComposeView.F0 = Class.forName("android.os.SystemProperties");
                    Class B = AndroidComposeView.F0;
                    if (B != null) {
                        method = B.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    AndroidComposeView.G0 = method;
                }
                Method x11 = AndroidComposeView.G0;
                if (x11 != null) {
                    obj = x11.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.lifecycle.r f6984a;

        /* renamed from: b  reason: collision with root package name */
        private final n3.d f6985b;

        public b(androidx.lifecycle.r rVar, n3.d dVar) {
            p.j(rVar, "lifecycleOwner");
            p.j(dVar, "savedStateRegistryOwner");
            this.f6984a = rVar;
            this.f6985b = dVar;
        }

        public final androidx.lifecycle.r a() {
            return this.f6984a;
        }

        public final n3.d b() {
            return this.f6985b;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class c extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LayoutNode f6986d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6987e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6988f;

        c(LayoutNode layoutNode, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
            this.f6986d = layoutNode;
            this.f6987e = androidComposeView;
            this.f6988f = androidComposeView2;
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            p.j(view, "host");
            p.j(cVar, "info");
            super.g(view, cVar);
            n1.k j = androidx.compose.ui.semantics.a.j(this.f6986d);
            p.g(j);
            SemanticsNode m11 = new SemanticsNode(j, false).m();
            p.g(m11);
            int i11 = m11.i();
            if (i11 == this.f6987e.getSemanticsOwner().a().i()) {
                i11 = -1;
            }
            cVar.x0(this.f6988f, i11);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class d implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6990a;

        d(AndroidComposeView androidComposeView) {
            this.f6990a = androidComposeView;
        }

        public void a(r rVar) {
            p.j(rVar, "value");
            this.f6990a.C0 = rVar;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6991a;

        e(AndroidComposeView androidComposeView) {
            this.f6991a = androidComposeView;
        }

        public void run() {
            this.f6991a.removeCallbacks(this);
            MotionEvent y11 = this.f6991a.f6971t0;
            if (y11 != null) {
                boolean z11 = false;
                boolean z12 = y11.getToolType(0) == 3;
                int actionMasked = y11.getActionMasked();
                if (!z12 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z11 = true;
                }
                if (z11) {
                    int i11 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    AndroidComposeView androidComposeView = this.f6991a;
                    androidComposeView.p0(y11, i11, androidComposeView.f6973u0, false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        b0 b0Var;
        p.j(context, LogCategory.CONTEXT);
        f.a aVar = f.f16662b;
        this.f6949a = aVar.b();
        this.f6953d = d2.a.a(context);
        m mVar = new m(m.f15805c.a(), false, false, AndroidComposeView$semanticsModifier$1.f6995a);
        this.f6954e = mVar;
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl((FocusModifier) null, 1, (i) null);
        this.f6955f = focusManagerImpl;
        this.f6956g = new w1();
        d1.e eVar = new d1.e(new AndroidComposeView$keyInputModifier$1(this), (lp0.l<? super d1.b, Boolean>) null);
        this.f6957h = eVar;
        d.a aVar2 = p0.d.f16037h0;
        p0.d c11 = RotaryInputModifierKt.c(aVar2, AndroidComposeView$rotaryInputModifier$1.f6994a);
        this.f6958i = c11;
        this.j = new y();
        LayoutNode layoutNode = new LayoutNode(false, 1, (i) null);
        layoutNode.e(RootMeasurePolicy.f6770b);
        layoutNode.a(aVar2.N(mVar).N(c11).N(focusManagerImpl.f()).N(eVar));
        layoutNode.i(getDensity());
        this.k = layoutNode;
        this.f6959l = this;
        this.f6960m = new n(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.n = androidComposeViewAccessibilityDelegateCompat;
        this.f6962o = new q0.i();
        this.f6964p = new ArrayList();
        this.f6969s = new f1.i();
        this.t = new z(getRoot());
        this.f6972u = AndroidComposeView$configurationChangeObserver$1.f6989a;
        this.v = I() ? new q0.a(this, getAutofillTree()) : null;
        this.f6977x = new k(context);
        this.f6979y = new j(context);
        this.f6981z = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.F = new l(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        p.i(viewConfiguration, "get(context)");
        this.G = new y(viewConfiguration);
        this.H = d2.l.f14010b.a();
        this.I = new int[]{0, 0};
        this.K = p0.c((float[]) null, 1, (i) null);
        this.L = p0.c((float[]) null, 1, (i) null);
        this.M = -1;
        this.O = aVar.a();
        this.P = true;
        this.Q = j.e((Object) null, (a1) null, 2, (Object) null);
        this.S = new m(this);
        this.T = new n(this);
        this.U = new o(this);
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(this);
        this.V = textInputServiceAndroid;
        this.W = AndroidComposeView_androidKt.e().invoke(textInputServiceAndroid);
        this.f6952c0 = new v(context);
        this.f6961n0 = g.g(u1.m.a(context), g.l());
        Configuration configuration = context.getResources().getConfiguration();
        p.i(configuration, "context.resources.configuration");
        this.f6963o0 = P(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        p.i(configuration2, "context.resources.configuration");
        this.f6965p0 = j.e(AndroidComposeView_androidKt.d(configuration2), (a1) null, 2, (Object) null);
        this.f6966q0 = new a1.c(this);
        this.f6968r0 = new b1.c(isInTouchMode() ? b1.a.f12567b.b() : b1.a.f12567b.a(), new AndroidComposeView$_inputModeManager$1(this), (i) null);
        this.f6970s0 = new AndroidTextToolbar(this);
        this.f6974v0 = new u1<>();
        this.f6976w0 = new f0.e<>(new lp0.a[16], 0);
        this.f6978x0 = new e(this);
        this.f6980y0 = new p(this);
        this.A0 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            b0Var = new d0();
        } else {
            b0Var = new c0();
        }
        this.B0 = b0Var;
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            u.f7359a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        androidx.core.view.a0.w0(this, androidComposeViewAccessibilityDelegateCompat);
        lp0.l<t1, k> a11 = t1.Y.a();
        if (a11 != null) {
            a11.invoke(this);
        }
        getRoot().F(this);
        if (i11 >= 29) {
            s.f7343a.a(this);
        }
        this.D0 = new d(this);
    }

    private final boolean I() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void K(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).g();
            } else if (childAt instanceof ViewGroup) {
                K((ViewGroup) childAt);
            }
        }
    }

    private final Pair<Integer, Integer> L(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return bp0.h.a(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return bp0.h.a(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return bp0.h.a(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    private final View N(int i11, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (p.e(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i11))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            p.i(childAt, "currentView.getChildAt(i)");
            View N2 = N(i11, childAt);
            if (N2 != null) {
                return N2;
            }
        }
        return null;
    }

    private final int P(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final void Q(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "this$0");
        androidComposeView.s0();
    }

    private final int R(MotionEvent motionEvent) {
        removeCallbacks(this.f6978x0);
        try {
            e0(motionEvent);
            boolean z11 = true;
            this.N = true;
            a(false);
            this.C0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f6971t0;
            boolean z12 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && T(motionEvent, motionEvent2)) {
                if (Y(motionEvent2)) {
                    this.t.b();
                } else if (motionEvent2.getActionMasked() != 10 && z12) {
                    q0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, (Object) null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z11 = false;
            }
            if (!z12 && z11 && actionMasked != 3 && actionMasked != 9 && Z(motionEvent)) {
                q0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, (Object) null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f6971t0 = MotionEvent.obtainNoHistory(motionEvent);
            int o02 = o0(motionEvent);
            Trace.endSection();
            if (Build.VERSION.SDK_INT >= 24) {
                t.f7345a.a(this, this.C0);
            }
            this.N = false;
            return o02;
        } catch (Throwable th2) {
            this.N = false;
            throw th2;
        }
    }

    private final boolean S(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f11 = -motionEvent.getAxisValue(26);
        h1.a aVar = new h1.a(c0.e(viewConfiguration, getContext()) * f11, f11 * c0.b(viewConfiguration, getContext()), motionEvent.getEventTime());
        FocusModifier d11 = this.f6955f.d();
        if (d11 != null) {
            return d11.q(aVar);
        }
        return false;
    }

    private final boolean T(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final void V(LayoutNode layoutNode) {
        layoutNode.J0();
        f0.e<LayoutNode> A02 = layoutNode.A0();
        int m11 = A02.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = A02.l();
            do {
                V((LayoutNode) l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }

    private final void W(LayoutNode layoutNode) {
        int i11 = 0;
        l.s(this.F, layoutNode, false, 2, (Object) null);
        f0.e<LayoutNode> A02 = layoutNode.A0();
        int m11 = A02.m();
        if (m11 > 0) {
            Object[] l11 = A02.l();
            do {
                W((LayoutNode) l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }

    private final boolean X(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        if (!(!Float.isInfinite(x11) && !Float.isNaN(x11))) {
            return true;
        }
        float y11 = motionEvent.getY();
        if (!(!Float.isInfinite(y11) && !Float.isNaN(y11))) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!(!Float.isInfinite(rawX) && !Float.isNaN(rawX))) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        if (!(!Float.isInfinite(rawY) && !Float.isNaN(rawY))) {
            return true;
        }
        return false;
    }

    private final boolean Y(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean Z(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (0.0f <= x11 && x11 <= ((float) getWidth())) {
            if (0.0f <= y11 && y11 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    private final boolean a0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f6971t0) == null) {
            return true;
        }
        if (!(motionEvent.getRawX() == motionEvent2.getRawX())) {
            return true;
        }
        if (!(motionEvent.getRawY() == motionEvent2.getRawY())) {
            return true;
        }
        return false;
    }

    private final void d0() {
        if (!this.N) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.M) {
                this.M = currentAnimationTimeMillis;
                f0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.I);
                int[] iArr = this.I;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.I;
                this.O = t0.g.a(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    private final void e0(MotionEvent motionEvent) {
        this.M = AnimationUtils.currentAnimationTimeMillis();
        f0();
        long f11 = p0.f(this.K, t0.g.a(motionEvent.getX(), motionEvent.getY()));
        this.O = t0.g.a(motionEvent.getRawX() - f.m(f11), motionEvent.getRawY() - f.n(f11));
    }

    private final void f0() {
        this.B0.a(this, this.K);
        p0.a(this.K, this.L);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private final void j0(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.E && layoutNode != null) {
                while (layoutNode != null && layoutNode.l0() == LayoutNode.UsageByParent.InMeasureBlock) {
                    layoutNode = layoutNode.u0();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    static /* synthetic */ void k0(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.j0(layoutNode);
    }

    /* access modifiers changed from: private */
    public static final void l0(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "this$0");
        androidComposeView.s0();
    }

    /* access modifiers changed from: private */
    public static final void m0(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "this$0");
        boolean z11 = false;
        androidComposeView.f6982z0 = false;
        MotionEvent motionEvent = androidComposeView.f6971t0;
        p.g(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z11 = true;
        }
        if (z11) {
            androidComposeView.o0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    private final int o0(MotionEvent motionEvent) {
        f1.y yVar;
        x c11 = this.f6969s.c(motionEvent, this);
        if (c11 != null) {
            List<f1.y> b11 = c11.b();
            ListIterator<f1.y> listIterator = b11.listIterator(b11.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    yVar = null;
                    break;
                }
                yVar = listIterator.previous();
                if (yVar.a()) {
                    break;
                }
            }
            f1.y yVar2 = yVar;
            if (yVar2 != null) {
                this.f6949a = yVar2.e();
            }
            int a11 = this.t.a(c11, this, Z(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || i0.c(a11)) {
                return a11;
            }
            this.f6969s.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return a11;
        }
        this.t.b();
        return f1.a0.a(false, false);
    }

    /* access modifiers changed from: private */
    public final void p0(MotionEvent motionEvent, int i11, long j11, boolean z11) {
        int i12;
        long j12;
        MotionEvent motionEvent2 = motionEvent;
        int i13 = i11;
        int actionMasked = motionEvent.getActionMasked();
        int i14 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i14 = motionEvent.getActionIndex();
            }
        } else if (!(i13 == 9 || i13 == 10)) {
            i14 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i14 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i15 = 0; i15 < pointerCount; i15++) {
                pointerPropertiesArr[i15] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i16 = 0; i16 < pointerCount; i16++) {
                pointerCoordsArr[i16] = new MotionEvent.PointerCoords();
            }
            int i17 = 0;
            while (i17 < pointerCount) {
                int i18 = ((i14 < 0 || i17 < i14) ? 0 : 1) + i17;
                motionEvent2.getPointerProperties(i18, pointerPropertiesArr[i17]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i17];
                motionEvent2.getPointerCoords(i18, pointerCoords);
                long p11 = p(t0.g.a(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = f.m(p11);
                pointerCoords.y = f.n(p11);
                i17++;
            }
            if (z11) {
                i12 = 0;
            } else {
                i12 = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                j12 = j11;
            } else {
                j12 = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j12, j11, i11, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i12, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            f1.i iVar = this.f6969s;
            p.i(obtain, "event");
            x c11 = iVar.c(obtain, this);
            p.g(c11);
            this.t.a(c11, this, true);
            obtain.recycle();
        }
    }

    static /* synthetic */ void q0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i11, long j11, boolean z11, int i12, Object obj) {
        androidComposeView.p0(motionEvent, i11, j11, (i12 & 8) != 0 ? true : z11);
    }

    /* access modifiers changed from: private */
    public static final void r0(AndroidComposeView androidComposeView, boolean z11) {
        p.j(androidComposeView, "this$0");
        androidComposeView.f6968r0.b(z11 ? b1.a.f12567b.b() : b1.a.f12567b.a());
        androidComposeView.f6955f.c();
    }

    private final void s0() {
        getLocationOnScreen(this.I);
        boolean z11 = false;
        if (!(d2.l.j(this.H) == this.I[0] && d2.l.k(this.H) == this.I[1])) {
            int[] iArr = this.I;
            this.H = d2.m.a(iArr[0], iArr[1]);
            z11 = true;
        }
        this.F.d(z11);
    }

    private void setFontFamilyResolver(i.b bVar) {
        this.f6961n0.setValue(bVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f6965p0.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(b bVar) {
        this.Q.setValue(bVar);
    }

    public final void H(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        p.j(androidViewHolder, "view");
        p.j(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidx.core.view.a0.H0(androidViewHolder, 1);
        androidx.core.view.a0.w0(androidViewHolder, new c(layoutNode, this, this));
    }

    public final Object J(fp0.c<? super k> cVar) {
        Object x11 = this.n.x(cVar);
        return x11 == b.d() ? x11 : k.f22762a;
    }

    public final void M(AndroidViewHolder androidViewHolder, Canvas canvas) {
        p.j(androidViewHolder, "view");
        p.j(canvas, "canvas");
        getAndroidViewsHandler$ui_release().a(androidViewHolder, canvas);
    }

    public s0.b O(KeyEvent keyEvent) {
        p.j(keyEvent, "keyEvent");
        long a11 = d1.d.a(keyEvent);
        a.C0112a aVar = d1.a.f13830a;
        if (d1.a.l(a11, aVar.j())) {
            return s0.b.i(d1.d.e(keyEvent) ? s0.b.f16557b.f() : s0.b.f16557b.d());
        } else if (d1.a.l(a11, aVar.e())) {
            return s0.b.i(s0.b.f16557b.g());
        } else {
            if (d1.a.l(a11, aVar.d())) {
                return s0.b.i(s0.b.f16557b.c());
            }
            if (d1.a.l(a11, aVar.f())) {
                return s0.b.i(s0.b.f16557b.h());
            }
            if (d1.a.l(a11, aVar.c())) {
                return s0.b.i(s0.b.f16557b.a());
            }
            boolean z11 = true;
            if (d1.a.l(a11, aVar.b()) ? true : d1.a.l(a11, aVar.g()) ? true : d1.a.l(a11, aVar.i())) {
                return s0.b.i(s0.b.f16557b.b());
            }
            if (!d1.a.l(a11, aVar.a())) {
                z11 = d1.a.l(a11, aVar.h());
            }
            if (z11) {
                return s0.b.i(s0.b.f16557b.e());
            }
            return null;
        }
    }

    public void U() {
        V(getRoot());
    }

    public void a(boolean z11) {
        lp0.a<k> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z11) {
            try {
                aVar = this.A0;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            aVar = null;
        }
        if (this.F.k(aVar)) {
            requestLayout();
        }
        l.e(this.F, false, 1, (Object) null);
        k kVar = k.f22762a;
        Trace.endSection();
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        q0.a aVar;
        p.j(sparseArray, "values");
        if (I() && (aVar = this.v) != null) {
            q0.c.a(aVar, sparseArray);
        }
    }

    public final Object b0(fp0.c<? super k> cVar) {
        Object o11 = this.V.o(cVar);
        return o11 == b.d() ? o11 : k.f22762a;
    }

    public long c(long j11) {
        d0();
        return p0.f(this.L, t0.g.a(f.m(j11) - f.m(this.O), f.n(j11) - f.n(this.O)));
    }

    public final void c0(o oVar, boolean z11) {
        p.j(oVar, "layer");
        if (!z11) {
            if (!this.f6967r && !this.f6964p.remove(oVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f6967r) {
            this.f6964p.add(oVar);
        } else {
            List list = this.q;
            if (list == null) {
                list = new ArrayList();
                this.q = list;
            }
            list.add(oVar);
        }
    }

    public boolean canScrollHorizontally(int i11) {
        return this.n.y(false, i11, this.f6949a);
    }

    public boolean canScrollVertically(int i11) {
        return this.n.y(true, i11, this.f6949a);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        p.j(canvas, "canvas");
        if (!isAttachedToWindow()) {
            V(getRoot());
        }
        k1.p.a(this, false, 1, (Object) null);
        this.f6967r = true;
        y yVar = this.j;
        Canvas v11 = yVar.a().v();
        yVar.a().w(canvas);
        getRoot().S(yVar.a());
        yVar.a().w(v11);
        if (!this.f6964p.isEmpty()) {
            int size = this.f6964p.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f6964p.get(i11).h();
            }
        }
        if (ViewLayer.f7191m.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f6964p.clear();
        this.f6967r = false;
        List<o> list = this.q;
        if (list != null) {
            p.g(list);
            this.f6964p.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        p.j(motionEvent, "event");
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return S(motionEvent);
        }
        if (X(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return i0.c(R(motionEvent));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        p.j(motionEvent, "event");
        if (this.f6982z0) {
            removeCallbacks(this.f6980y0);
            this.f6980y0.run();
        }
        if (X(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(4098) && motionEvent.getToolType(0) == 1) {
            return this.n.F(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && Z(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.f6971t0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f6971t0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.f6982z0 = true;
                    post(this.f6980y0);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!a0(motionEvent)) {
            return false;
        }
        return i0.c(R(motionEvent));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        p.j(keyEvent, "event");
        if (isFocused()) {
            return n0(d1.b.b(keyEvent));
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p.j(motionEvent, "motionEvent");
        if (this.f6982z0) {
            removeCallbacks(this.f6980y0);
            MotionEvent motionEvent2 = this.f6971t0;
            p.g(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || T(motionEvent, motionEvent2)) {
                this.f6980y0.run();
            } else {
                this.f6982z0 = false;
            }
        }
        if (X(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !a0(motionEvent)) {
            return false;
        }
        int R2 = R(motionEvent);
        if (i0.b(R2)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return i0.c(R2);
    }

    public void e(LayoutNode layoutNode, long j11) {
        p.j(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.F.l(layoutNode, j11);
            l.e(this.F, false, 1, (Object) null);
            k kVar = k.f22762a;
        } finally {
            Trace.endSection();
        }
    }

    public long f(long j11) {
        d0();
        return p0.f(this.L, j11);
    }

    public final View findViewByAccessibilityIdTraversal(int i11) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return N(i11, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i11)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void g() {
        if (this.f6975w) {
            getSnapshotObserver().a();
            this.f6975w = false;
        }
        z zVar = this.B;
        if (zVar != null) {
            K(zVar);
        }
        while (this.f6976w0.p()) {
            int m11 = this.f6976w0.m();
            for (int i11 = 0; i11 < m11; i11++) {
                lp0.a aVar = (lp0.a) this.f6976w0.l()[i11];
                this.f6976w0.x(i11, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f6976w0.v(0, m11);
        }
    }

    public final boolean g0(o oVar) {
        p.j(oVar, "layer");
        boolean z11 = this.C == null || ViewLayer.f7191m.b() || Build.VERSION.SDK_INT >= 23 || this.f6974v0.b() < 10;
        if (z11) {
            this.f6974v0.d(oVar);
        }
        return z11;
    }

    public final z getAndroidViewsHandler$ui_release() {
        if (this.B == null) {
            Context context = getContext();
            p.i(context, LogCategory.CONTEXT);
            z zVar = new z(context);
            this.B = zVar;
            addView(zVar);
        }
        z zVar2 = this.B;
        p.g(zVar2);
        return zVar2;
    }

    public q0.d getAutofill() {
        return this.v;
    }

    public q0.i getAutofillTree() {
        return this.f6962o;
    }

    public final lp0.l<Configuration, k> getConfigurationChangeObserver() {
        return this.f6972u;
    }

    public d2.e getDensity() {
        return this.f6953d;
    }

    public s0.f getFocusManager() {
        return this.f6955f;
    }

    public void getFocusedRect(Rect rect) {
        k kVar;
        t0.h e11;
        p.j(rect, "rect");
        FocusModifier d11 = this.f6955f.d();
        if (d11 == null || (e11 = t.e(d11)) == null) {
            kVar = null;
        } else {
            rect.left = c.c(e11.i());
            rect.top = c.c(e11.l());
            rect.right = c.c(e11.j());
            rect.bottom = c.c(e11.e());
            kVar = k.f22762a;
        }
        if (kVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public i.b getFontFamilyResolver() {
        return (i.b) this.f6961n0.getValue();
    }

    public h.a getFontLoader() {
        return this.f6952c0;
    }

    public a1.a getHapticFeedBack() {
        return this.f6966q0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.F.i();
    }

    public b1.b getInputModeManager() {
        return this.f6968r0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.M;
    }

    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f6965p0.getValue();
    }

    public long getMeasureIteration() {
        return this.F.j();
    }

    public s getPointerIconService() {
        return this.D0;
    }

    public LayoutNode getRoot() {
        return this.k;
    }

    public u getRootForTest() {
        return this.f6959l;
    }

    public n getSemanticsOwner() {
        return this.f6960m;
    }

    public k1.h getSharedDrawScope() {
        return this.f6951c;
    }

    public boolean getShowLayoutBounds() {
        return this.A;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.f6981z;
    }

    public a0 getTextInputService() {
        return this.W;
    }

    public g1 getTextToolbar() {
        return this.f6970s0;
    }

    public View getView() {
        return this;
    }

    public n1 getViewConfiguration() {
        return this.G;
    }

    public final b getViewTreeOwners() {
        return (b) this.Q.getValue();
    }

    public v1 getWindowInfo() {
        return this.f6956g;
    }

    public void h(q.b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.F.n(bVar);
        k0(this, (LayoutNode) null, 1, (Object) null);
    }

    public final void h0(AndroidViewHolder androidViewHolder) {
        p.j(androidViewHolder, "view");
        getAndroidViewsHandler$ui_release().removeView(androidViewHolder);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        kotlin.jvm.internal.x.d(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
        androidx.core.view.a0.H0(androidViewHolder, 0);
    }

    public long i(long j11) {
        d0();
        return p0.f(this.K, j11);
    }

    public final void i0() {
        this.f6975w = true;
    }

    public void j(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        this.n.R(layoutNode);
    }

    public void k(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        this.F.g(layoutNode);
    }

    public void l(LayoutNode layoutNode, boolean z11) {
        p.j(layoutNode, "layoutNode");
        if (this.F.p(layoutNode, z11)) {
            k0(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    public o m(lp0.l<? super u0.x, k> lVar, lp0.a<k> aVar) {
        j0 j0Var;
        p.j(lVar, "drawBlock");
        p.j(aVar, "invalidateParentLayer");
        o c11 = this.f6974v0.c();
        if (c11 != null) {
            c11.b(lVar, aVar);
            return c11;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.P) {
            try {
                return new RenderNodeLayer(this, lVar, aVar);
            } catch (Throwable unused) {
                this.P = false;
            }
        }
        if (this.C == null) {
            ViewLayer.b bVar = ViewLayer.f7191m;
            if (!bVar.a()) {
                bVar.d(new View(getContext()));
            }
            if (bVar.b()) {
                Context context = getContext();
                p.i(context, LogCategory.CONTEXT);
                j0Var = new j0(context);
            } else {
                Context context2 = getContext();
                p.i(context2, LogCategory.CONTEXT);
                j0Var = new o1(context2);
            }
            this.C = j0Var;
            addView(j0Var);
        }
        j0 j0Var2 = this.C;
        p.g(j0Var2);
        return new ViewLayer(this, j0Var2, lVar, aVar);
    }

    public void n(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
    }

    public boolean n0(KeyEvent keyEvent) {
        p.j(keyEvent, "keyEvent");
        return this.f6957h.e(keyEvent);
    }

    public void o(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
        this.F.m(layoutNode);
        i0();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        androidx.lifecycle.r a11;
        Lifecycle lifecycle;
        q0.a aVar;
        super.onAttachedToWindow();
        W(getRoot());
        V(getRoot());
        getSnapshotObserver().f();
        if (I() && (aVar = this.v) != null) {
            q0.g.f16275a.a(aVar);
        }
        androidx.lifecycle.r a12 = q0.a(this);
        n3.d a13 = ViewTreeSavedStateRegistryOwner.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(a12 == null || a13 == null || (a12 == viewTreeOwners.a() && a13 == viewTreeOwners.a()))) {
            if (a12 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a13 != null) {
                if (!(viewTreeOwners == null || (a11 = viewTreeOwners.a()) == null || (lifecycle = a11.getLifecycle()) == null)) {
                    lifecycle.c(this);
                }
                a12.getLifecycle().a(this);
                b bVar = new b(a12, a13);
                setViewTreeOwners(bVar);
                lp0.l<? super b, k> lVar = this.R;
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                this.R = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        b viewTreeOwners2 = getViewTreeOwners();
        p.g(viewTreeOwners2);
        viewTreeOwners2.a().getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.S);
        getViewTreeObserver().addOnScrollChangedListener(this.T);
        getViewTreeObserver().addOnTouchModeChangeListener(this.U);
    }

    public boolean onCheckIsTextEditor() {
        return this.V.l();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        p.j(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        p.i(context, LogCategory.CONTEXT);
        this.f6953d = d2.a.a(context);
        if (P(configuration) != this.f6963o0) {
            this.f6963o0 = P(configuration);
            Context context2 = getContext();
            p.i(context2, LogCategory.CONTEXT);
            setFontFamilyResolver(u1.m.a(context2));
        }
        this.f6972u.invoke(configuration);
    }

    public /* synthetic */ void onCreate(androidx.lifecycle.r rVar) {
        androidx.lifecycle.d.a(this, rVar);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        p.j(editorInfo, "outAttrs");
        return this.V.i(editorInfo);
    }

    public /* synthetic */ void onDestroy(androidx.lifecycle.r rVar) {
        androidx.lifecycle.d.b(this, rVar);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        q0.a aVar;
        androidx.lifecycle.r a11;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().g();
        b viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (a11 = viewTreeOwners.a()) == null || (lifecycle = a11.getLifecycle()) == null)) {
            lifecycle.c(this);
        }
        if (I() && (aVar = this.v) != null) {
            q0.g.f16275a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        getViewTreeObserver().removeOnScrollChangedListener(this.T);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.U);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        p.j(canvas, "canvas");
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z11 + ')');
        FocusManagerImpl focusManagerImpl = this.f6955f;
        if (z11) {
            focusManagerImpl.i();
        } else {
            focusManagerImpl.g();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.D = null;
        s0();
        if (this.B != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                W(getRoot());
            }
            Pair<Integer, Integer> L2 = L(i11);
            int intValue = L2.a().intValue();
            int intValue2 = L2.b().intValue();
            Pair<Integer, Integer> L3 = L(i12);
            long a11 = d2.c.a(intValue, intValue2, L3.a().intValue(), L3.b().intValue());
            d2.b bVar = this.D;
            boolean z11 = false;
            if (bVar == null) {
                this.D = d2.b.b(a11);
                this.E = false;
            } else {
                if (bVar != null) {
                    z11 = d2.b.g(bVar.t(), a11);
                }
                if (!z11) {
                    this.E = true;
                }
            }
            this.F.t(a11);
            this.F.k(this.A0);
            setMeasuredDimension(getRoot().y0(), getRoot().a0());
            if (this.B != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().y0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().a0(), 1073741824));
            }
            k kVar = k.f22762a;
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ void onPause(androidx.lifecycle.r rVar) {
        androidx.lifecycle.d.c(this, rVar);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i11) {
        q0.a aVar;
        if (I() && viewStructure != null && (aVar = this.v) != null) {
            q0.c.b(aVar, viewStructure);
        }
    }

    public void onResume(androidx.lifecycle.r rVar) {
        p.j(rVar, "owner");
        setShowLayoutBounds(E0.b());
    }

    public void onRtlPropertiesChanged(int i11) {
        if (this.f6950b) {
            LayoutDirection a11 = AndroidComposeView_androidKt.f(i11);
            setLayoutDirection(a11);
            this.f6955f.h(a11);
        }
    }

    public /* synthetic */ void onStart(androidx.lifecycle.r rVar) {
        androidx.lifecycle.d.e(this, rVar);
    }

    public /* synthetic */ void onStop(androidx.lifecycle.r rVar) {
        androidx.lifecycle.d.f(this, rVar);
    }

    public void onWindowFocusChanged(boolean z11) {
        boolean a11;
        this.f6956g.a(z11);
        super.onWindowFocusChanged(z11);
        if (z11 && getShowLayoutBounds() != (a11 = E0.b())) {
            setShowLayoutBounds(a11);
            U();
        }
    }

    public long p(long j11) {
        d0();
        long f11 = p0.f(this.K, j11);
        return t0.g.a(f.m(f11) + f.m(this.O), f.n(f11) + f.n(this.O));
    }

    public void q() {
        this.n.S();
    }

    public void r(lp0.a<k> aVar) {
        p.j(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f6976w0.h(aVar)) {
            this.f6976w0.b(aVar);
        }
    }

    public void s(LayoutNode layoutNode, boolean z11) {
        p.j(layoutNode, "layoutNode");
        if (this.F.r(layoutNode, z11)) {
            j0(layoutNode);
        }
    }

    public final void setConfigurationChangeObserver(lp0.l<? super Configuration, k> lVar) {
        p.j(lVar, "<set-?>");
        this.f6972u = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j11) {
        this.M = j11;
    }

    public final void setOnViewTreeOwnersAvailable(lp0.l<? super b, k> lVar) {
        p.j(lVar, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.R = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z11) {
        this.A = z11;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public j getAccessibilityManager() {
        return this.f6979y;
    }

    public k getClipboardManager() {
        return this.f6977x;
    }
}
