package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.v;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import androidx.core.view.f;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import androidx.core.view.n0;
import androidx.lifecycle.Lifecycle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.truecaller.android.sdk.TruecallerSdkScope;
import defpackage.p1;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl */
class f extends e implements e.a, LayoutInflater.Factory2 {

    /* renamed from: r0  reason: collision with root package name */
    private static final androidx.collection.g<String, Integer> f1519r0 = new androidx.collection.g<>();

    /* renamed from: s0  reason: collision with root package name */
    private static final boolean f1520s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    private static final int[] f1521t0 = {16842836};

    /* renamed from: u0  reason: collision with root package name */
    private static final boolean f1522u0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: v0  reason: collision with root package name */
    private static final boolean f1523v0 = true;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private s[] G;
    private s H;
    private boolean I;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private o S;
    private o T;
    boolean U;
    int V;
    private final Runnable W;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f1524c0;

    /* renamed from: d  reason: collision with root package name */
    final Object f1525d;

    /* renamed from: e  reason: collision with root package name */
    final Context f1526e;

    /* renamed from: f  reason: collision with root package name */
    Window f1527f;

    /* renamed from: g  reason: collision with root package name */
    private m f1528g;

    /* renamed from: h  reason: collision with root package name */
    final d f1529h;

    /* renamed from: i  reason: collision with root package name */
    a f1530i;
    MenuInflater j;
    private CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    private v f1531l;

    /* renamed from: m  reason: collision with root package name */
    private g f1532m;
    private t n;

    /* renamed from: n0  reason: collision with root package name */
    private Rect f1533n0;

    /* renamed from: o  reason: collision with root package name */
    p1.c f1534o;

    /* renamed from: o0  reason: collision with root package name */
    private Rect f1535o0;

    /* renamed from: p  reason: collision with root package name */
    ActionBarContextView f1536p;

    /* renamed from: p0  reason: collision with root package name */
    private i f1537p0;
    PopupWindow q;

    /* renamed from: q0  reason: collision with root package name */
    private j f1538q0;

    /* renamed from: r  reason: collision with root package name */
    Runnable f1539r;

    /* renamed from: s  reason: collision with root package name */
    h0 f1540s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1541u;
    ViewGroup v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f1542w;

    /* renamed from: x  reason: collision with root package name */
    private View f1543x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1544y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1545z;

    /* compiled from: AppCompatDelegateImpl */
    class a implements Runnable {
        a() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.V & 1) != 0) {
                fVar.Z(0);
            }
            f fVar2 = f.this;
            if ((fVar2.V & 4096) != 0) {
                fVar2.Z(108);
            }
            f fVar3 = f.this;
            fVar3.U = false;
            fVar3.V = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class b implements androidx.core.view.t {
        b() {
        }

        public n0 a(View view, n0 n0Var) {
            int r11 = n0Var.r();
            int P0 = f.this.P0(n0Var, (Rect) null);
            if (r11 != P0) {
                n0Var = n0Var.w(n0Var.p(), P0, n0Var.q(), n0Var.o());
            }
            return a0.i0(view, n0Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class c implements ContentFrameLayout.a {
        c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            f.this.X();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class d implements Runnable {

        /* compiled from: AppCompatDelegateImpl */
        class a extends j0 {
            a() {
            }

            public void b(View view) {
                f.this.f1536p.setAlpha(1.0f);
                f.this.f1540s.h((i0) null);
                f.this.f1540s = null;
            }

            public void c(View view) {
                f.this.f1536p.setVisibility(0);
            }
        }

        d() {
        }

        public void run() {
            f fVar = f.this;
            fVar.q.showAtLocation(fVar.f1536p, 55, 0, 0);
            f.this.a0();
            if (f.this.I0()) {
                f.this.f1536p.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.f1540s = a0.e(fVar2.f1536p).b(1.0f);
                f.this.f1540s.h(new a());
                return;
            }
            f.this.f1536p.setAlpha(1.0f);
            f.this.f1536p.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class e extends j0 {
        e() {
        }

        public void b(View view) {
            f.this.f1536p.setAlpha(1.0f);
            f.this.f1540s.h((i0) null);
            f.this.f1540s = null;
        }

        public void c(View view) {
            f.this.f1536p.setVisibility(0);
            f.this.f1536p.sendAccessibilityEvent(32);
            if (f.this.f1536p.getParent() instanceof View) {
                a0.t0((View) f.this.f1536p.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    private class C0012f implements b {
        C0012f() {
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class g implements j.a {
        g() {
        }

        public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
            f.this.Q(eVar);
        }

        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback k02 = f.this.k0();
            if (k02 == null) {
                return true;
            }
            k02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class h implements p1.c.a {

        /* renamed from: a  reason: collision with root package name */
        private p1.c.a f1554a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends j0 {
            a() {
            }

            public void b(View view) {
                f.this.f1536p.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f1536p.getParent() instanceof View) {
                    a0.t0((View) f.this.f1536p.getParent());
                }
                f.this.f1536p.k();
                f.this.f1540s.h((i0) null);
                f fVar2 = f.this;
                fVar2.f1540s = null;
                a0.t0(fVar2.v);
            }
        }

        public h(p1.c.a aVar) {
            this.f1554a = aVar;
        }

        public void a(p1.c cVar) {
            this.f1554a.a(cVar);
            f fVar = f.this;
            if (fVar.q != null) {
                fVar.f1527f.getDecorView().removeCallbacks(f.this.f1539r);
            }
            f fVar2 = f.this;
            if (fVar2.f1536p != null) {
                fVar2.a0();
                f fVar3 = f.this;
                fVar3.f1540s = a0.e(fVar3.f1536p).b(0.0f);
                f.this.f1540s.h(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.f1529h;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(fVar4.f1534o);
            }
            f fVar5 = f.this;
            fVar5.f1534o = null;
            a0.t0(fVar5.v);
        }

        public boolean b(p1.c cVar, Menu menu) {
            a0.t0(f.this.v);
            return this.f1554a.b(cVar, menu);
        }

        public boolean c(p1.c cVar, Menu menu) {
            return this.f1554a.c(cVar, menu);
        }

        public boolean d(p1.c cVar, MenuItem menuItem) {
            return this.f1554a.d(cVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class i {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i11 = configuration.densityDpi;
            int i12 = configuration2.densityDpi;
            if (i11 != i12) {
                configuration3.densityDpi = i12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i11 = configuration.colorMode & 3;
            int i12 = configuration2.colorMode;
            if (i11 != (i12 & 3)) {
                configuration3.colorMode |= i12 & 3;
            }
            int i13 = configuration.colorMode & 12;
            int i14 = configuration2.colorMode;
            if (i13 != (i14 & 12)) {
                configuration3.colorMode |= i14 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class n extends o {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f1558c;

        n(Context context) {
            super();
            this.f1558c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return j.a(this.f1558c) ? 2 : 1;
        }

        public void d() {
            f.this.e();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    abstract class o {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f1560a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f1560a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f1526e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1560a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b11 = b();
            if (b11 != null && b11.countActions() != 0) {
                if (this.f1560a == null) {
                    this.f1560a = new a();
                }
                f.this.f1526e.registerReceiver(this.f1560a, b11);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class p extends o {

        /* renamed from: c  reason: collision with root package name */
        private final n f1563c;

        p(n nVar) {
            super();
            this.f1563c = nVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f1563c.d() ? 2 : 1;
        }

        public void d() {
            f.this.e();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i11, int i12) {
            return i11 < -5 || i12 < -5 || i11 > getWidth() + 5 || i12 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.S(0);
            return true;
        }

        public void setBackgroundResource(int i11) {
            setBackgroundDrawable(f.a.b(getContext(), i11));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    protected static final class s {

        /* renamed from: a  reason: collision with root package name */
        int f1566a;

        /* renamed from: b  reason: collision with root package name */
        int f1567b;

        /* renamed from: c  reason: collision with root package name */
        int f1568c;

        /* renamed from: d  reason: collision with root package name */
        int f1569d;

        /* renamed from: e  reason: collision with root package name */
        int f1570e;

        /* renamed from: f  reason: collision with root package name */
        int f1571f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f1572g;

        /* renamed from: h  reason: collision with root package name */
        View f1573h;

        /* renamed from: i  reason: collision with root package name */
        View f1574i;
        androidx.appcompat.view.menu.e j;
        androidx.appcompat.view.menu.c k;

        /* renamed from: l  reason: collision with root package name */
        Context f1575l;

        /* renamed from: m  reason: collision with root package name */
        boolean f1576m;
        boolean n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1577o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1578p;
        boolean q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f1579r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f1580s;

        s(int i11) {
            this.f1566a = i11;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f1575l, R.layout.abc_list_menu_item_layout);
                this.k = cVar;
                cVar.k(aVar);
                this.j.b(this.k);
            }
            return this.k.b(this.f1572g);
        }

        public boolean b() {
            if (this.f1573h == null) {
                return false;
            }
            if (this.f1574i == null && this.k.a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.Q(this.k);
                }
                this.j = eVar;
                if (eVar != null && (cVar = this.k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            int i12 = typedValue.resourceId;
            if (i12 != 0) {
                newTheme.applyStyle(i12, true);
            } else {
                newTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            p1.e eVar = new p1.e(context, 0);
            eVar.getTheme().setTo(newTheme);
            this.f1575l = eVar;
            TypedArray obtainStyledAttributes = eVar.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.f1567b = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.f1571f = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class t implements j.a {
        t() {
        }

        public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
            androidx.appcompat.view.menu.e F = eVar.F();
            boolean z12 = F != eVar;
            f fVar = f.this;
            if (z12) {
                eVar = F;
            }
            s d02 = fVar.d0(eVar);
            if (d02 == null) {
                return;
            }
            if (z12) {
                f.this.P(d02.f1566a, d02, F);
                f.this.T(d02, true);
                return;
            }
            f.this.T(d02, z11);
        }

        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback k02;
            if (eVar != eVar.F()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.A || (k02 = fVar.k0()) == null || f.this.N) {
                return true;
            }
            k02.onMenuOpened(108, eVar);
            return true;
        }
    }

    f(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    private void C0(s sVar, KeyEvent keyEvent) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        if (!sVar.f1577o && !this.N) {
            if (sVar.f1566a == 0) {
                if ((this.f1526e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback k02 = k0();
            if (k02 == null || k02.onMenuOpened(sVar.f1566a, sVar.j)) {
                WindowManager windowManager = (WindowManager) this.f1526e.getSystemService("window");
                if (windowManager != null && F0(sVar, keyEvent)) {
                    ViewGroup viewGroup = sVar.f1572g;
                    if (viewGroup == null || sVar.q) {
                        if (viewGroup == null) {
                            if (!n0(sVar) || sVar.f1572g == null) {
                                return;
                            }
                        } else if (sVar.q && viewGroup.getChildCount() > 0) {
                            sVar.f1572g.removeAllViews();
                        }
                        if (!m0(sVar) || !sVar.b()) {
                            sVar.q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = sVar.f1573h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        sVar.f1572g.setBackgroundResource(sVar.f1567b);
                        ViewParent parent = sVar.f1573h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(sVar.f1573h);
                        }
                        sVar.f1572g.addView(sVar.f1573h, layoutParams2);
                        if (!sVar.f1573h.hasFocus()) {
                            sVar.f1573h.requestFocus();
                        }
                    } else {
                        View view = sVar.f1574i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i11 = -1;
                            sVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i11, -2, sVar.f1569d, sVar.f1570e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                            layoutParams3.gravity = sVar.f1568c;
                            layoutParams3.windowAnimations = sVar.f1571f;
                            windowManager.addView(sVar.f1572g, layoutParams3);
                            sVar.f1577o = true;
                            return;
                        }
                    }
                    i11 = -2;
                    sVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i11, -2, sVar.f1569d, sVar.f1570e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                    layoutParams32.gravity = sVar.f1568c;
                    layoutParams32.windowAnimations = sVar.f1571f;
                    windowManager.addView(sVar.f1572g, layoutParams32);
                    sVar.f1577o = true;
                    return;
                }
                return;
            }
            T(sVar, true);
        }
    }

    private boolean E0(s sVar, int i11, KeyEvent keyEvent, int i12) {
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f1576m || F0(sVar, keyEvent)) && (eVar = sVar.j) != null) {
            z11 = eVar.performShortcut(i11, keyEvent, i12);
        }
        if (z11 && (i12 & 1) == 0 && this.f1531l == null) {
            T(sVar, true);
        }
        return z11;
    }

    private boolean F0(s sVar, KeyEvent keyEvent) {
        v vVar;
        v vVar2;
        v vVar3;
        if (this.N) {
            return false;
        }
        if (sVar.f1576m) {
            return true;
        }
        s sVar2 = this.H;
        if (!(sVar2 == null || sVar2 == sVar)) {
            T(sVar2, false);
        }
        Window.Callback k02 = k0();
        if (k02 != null) {
            sVar.f1574i = k02.onCreatePanelView(sVar.f1566a);
        }
        int i11 = sVar.f1566a;
        boolean z11 = i11 == 0 || i11 == 108;
        if (z11 && (vVar3 = this.f1531l) != null) {
            vVar3.f();
        }
        if (sVar.f1574i == null && (!z11 || !(D0() instanceof l))) {
            androidx.appcompat.view.menu.e eVar = sVar.j;
            if (eVar == null || sVar.f1579r) {
                if (eVar == null && (!o0(sVar) || sVar.j == null)) {
                    return false;
                }
                if (z11 && this.f1531l != null) {
                    if (this.f1532m == null) {
                        this.f1532m = new g();
                    }
                    this.f1531l.e(sVar.j, this.f1532m);
                }
                sVar.j.h0();
                if (!k02.onCreatePanelMenu(sVar.f1566a, sVar.j)) {
                    sVar.c((androidx.appcompat.view.menu.e) null);
                    if (z11 && (vVar2 = this.f1531l) != null) {
                        vVar2.e((Menu) null, this.f1532m);
                    }
                    return false;
                }
                sVar.f1579r = false;
            }
            sVar.j.h0();
            Bundle bundle = sVar.f1580s;
            if (bundle != null) {
                sVar.j.R(bundle);
                sVar.f1580s = null;
            }
            if (!k02.onPreparePanel(0, sVar.f1574i, sVar.j)) {
                if (z11 && (vVar = this.f1531l) != null) {
                    vVar.e((Menu) null, this.f1532m);
                }
                sVar.j.g0();
                return false;
            }
            boolean z12 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f1578p = z12;
            sVar.j.setQwertyMode(z12);
            sVar.j.g0();
        }
        sVar.f1576m = true;
        sVar.n = false;
        this.H = sVar;
        return true;
    }

    private void G0(boolean z11) {
        v vVar = this.f1531l;
        if (vVar == null || !vVar.a() || (ViewConfiguration.get(this.f1526e).hasPermanentMenuKey() && !this.f1531l.g())) {
            s i02 = i0(0, true);
            i02.q = true;
            T(i02, false);
            C0(i02, (KeyEvent) null);
            return;
        }
        Window.Callback k02 = k0();
        if (this.f1531l.c() && z11) {
            this.f1531l.d();
            if (!this.N) {
                k02.onPanelClosed(108, i0(0, true).j);
            }
        } else if (k02 != null && !this.N) {
            if (this.U && (this.V & 1) != 0) {
                this.f1527f.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            s i03 = i0(0, true);
            androidx.appcompat.view.menu.e eVar = i03.j;
            if (eVar != null && !i03.f1579r && k02.onPreparePanel(0, i03.f1574i, eVar)) {
                k02.onMenuOpened(108, i03.j);
                this.f1531l.b();
            }
        }
    }

    private int H0(int i11) {
        if (i11 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i11 != 9) {
            return i11;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1527f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || a0.Z((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean L(boolean z11) {
        if (this.N) {
            return false;
        }
        int O2 = O();
        boolean N0 = N0(s0(this.f1526e, O2), z11);
        if (O2 == 0) {
            h0(this.f1526e).e();
        } else {
            o oVar = this.S;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (O2 == 3) {
            g0(this.f1526e).e();
        } else {
            o oVar2 = this.T;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        return N0;
    }

    private void L0() {
        if (this.f1541u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.v.findViewById(16908290);
        View decorView = this.f1527f.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1526e.obtainStyledAttributes(R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i11 = R.styleable.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMajor());
        }
        int i12 = R.styleable.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedWidthMinor());
        }
        int i13 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMajor());
        }
        int i14 = R.styleable.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i14)) {
            obtainStyledAttributes.getValue(i14, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private AppCompatActivity M0() {
        Context context = this.f1526e;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    private void N(Window window) {
        if (this.f1527f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(callback);
                this.f1528g = mVar;
                window.setCallback(mVar);
                o0 u11 = o0.u(this.f1526e, (AttributeSet) null, f1521t0);
                Drawable h11 = u11.h(0);
                if (h11 != null) {
                    window.setBackgroundDrawable(h11);
                }
                u11.w();
                this.f1527f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean N0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f1526e
            r1 = 0
            android.content.res.Configuration r0 = r6.U(r0, r7, r1)
            boolean r2 = r6.q0()
            android.content.Context r3 = r6.f1526e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.K
            if (r8 == 0) goto L_0x0047
            boolean r8 = f1522u0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.L
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f1525d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f1525d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.u(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.O0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f1525d
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.onNightModeChanged(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.N0(int, boolean):boolean");
    }

    private int O() {
        int i11 = this.O;
        return i11 != -100 ? i11 : e.l();
    }

    private void O0(int i11, boolean z11, Configuration configuration) {
        Resources resources = this.f1526e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i11 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            k.a(resources);
        }
        int i13 = this.P;
        if (i13 != 0) {
            this.f1526e.setTheme(i13);
            if (i12 >= 23) {
                this.f1526e.getTheme().applyStyle(this.P, true);
            }
        }
        if (z11) {
            Object obj = this.f1525d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.r) {
                    if (((androidx.lifecycle.r) activity).getLifecycle().b().isAtLeast(Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.M) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void Q0(View view) {
        int i11;
        if ((a0.S(view) & 8192) != 0) {
            i11 = androidx.core.content.a.c(this.f1526e, R.color.abc_decor_view_status_guard_light);
        } else {
            i11 = androidx.core.content.a.c(this.f1526e, R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i11);
    }

    private void R() {
        o oVar = this.S;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.T;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private Configuration U(Context context, int i11, Configuration configuration) {
        int i12 = i11 != 1 ? i11 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private ViewGroup V() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1526e.obtainStyledAttributes(R.styleable.AppCompatTheme);
        int i11 = R.styleable.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i11)) {
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                C(1);
            } else if (obtainStyledAttributes.getBoolean(i11, false)) {
                C(108);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                C(109);
            }
            if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                C(10);
            }
            this.D = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            c0();
            this.f1527f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1526e);
            if (this.E) {
                viewGroup = this.C ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.D) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.B = false;
                this.A = false;
            } else if (this.A) {
                TypedValue typedValue = new TypedValue();
                this.f1526e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new p1.e(this.f1526e, typedValue.resourceId);
                } else {
                    context = this.f1526e;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                v vVar = (v) viewGroup.findViewById(R.id.decor_content_parent);
                this.f1531l = vVar;
                vVar.setWindowCallback(k0());
                if (this.B) {
                    this.f1531l.k(109);
                }
                if (this.f1544y) {
                    this.f1531l.k(2);
                }
                if (this.f1545z) {
                    this.f1531l.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                a0.K0(viewGroup, new b());
                if (this.f1531l == null) {
                    this.f1542w = (TextView) viewGroup.findViewById(R.id.title);
                }
                u0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1527f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f1527f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void b0() {
        if (!this.f1541u) {
            this.v = V();
            CharSequence j02 = j0();
            if (!TextUtils.isEmpty(j02)) {
                v vVar = this.f1531l;
                if (vVar != null) {
                    vVar.setWindowTitle(j02);
                } else if (D0() != null) {
                    D0().w(j02);
                } else {
                    TextView textView = this.f1542w;
                    if (textView != null) {
                        textView.setText(j02);
                    }
                }
            }
            M();
            B0(this.v);
            this.f1541u = true;
            s i02 = i0(0, false);
            if (this.N) {
                return;
            }
            if (i02 == null || i02.j == null) {
                p0(108);
            }
        }
    }

    private void c0() {
        if (this.f1527f == null) {
            Object obj = this.f1525d;
            if (obj instanceof Activity) {
                N(((Activity) obj).getWindow());
            }
        }
        if (this.f1527f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration e0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f11 = configuration.fontScale;
            float f12 = configuration2.fontScale;
            if (f11 != f12) {
                configuration3.fontScale = f12;
            }
            int i11 = configuration.mcc;
            int i12 = configuration2.mcc;
            if (i11 != i12) {
                configuration3.mcc = i12;
            }
            int i13 = configuration.mnc;
            int i14 = configuration2.mnc;
            if (i13 != i14) {
                configuration3.mnc = i14;
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i16 = configuration.touchscreen;
            int i17 = configuration2.touchscreen;
            if (i16 != i17) {
                configuration3.touchscreen = i17;
            }
            int i18 = configuration.keyboard;
            int i19 = configuration2.keyboard;
            if (i18 != i19) {
                configuration3.keyboard = i19;
            }
            int i21 = configuration.keyboardHidden;
            int i22 = configuration2.keyboardHidden;
            if (i21 != i22) {
                configuration3.keyboardHidden = i22;
            }
            int i23 = configuration.navigation;
            int i24 = configuration2.navigation;
            if (i23 != i24) {
                configuration3.navigation = i24;
            }
            int i25 = configuration.navigationHidden;
            int i26 = configuration2.navigationHidden;
            if (i25 != i26) {
                configuration3.navigationHidden = i26;
            }
            int i27 = configuration.orientation;
            int i28 = configuration2.orientation;
            if (i27 != i28) {
                configuration3.orientation = i28;
            }
            int i29 = configuration.screenLayout & 15;
            int i31 = configuration2.screenLayout;
            if (i29 != (i31 & 15)) {
                configuration3.screenLayout |= i31 & 15;
            }
            int i32 = configuration.screenLayout & 192;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 192)) {
                configuration3.screenLayout |= i33 & 192;
            }
            int i34 = configuration.screenLayout & 48;
            int i35 = configuration2.screenLayout;
            if (i34 != (i35 & 48)) {
                configuration3.screenLayout |= i35 & 48;
            }
            int i36 = configuration.screenLayout & 768;
            int i37 = configuration2.screenLayout;
            if (i36 != (i37 & 768)) {
                configuration3.screenLayout |= i37 & 768;
            }
            if (i15 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i38 = configuration.uiMode & 15;
            int i39 = configuration2.uiMode;
            if (i38 != (i39 & 15)) {
                configuration3.uiMode |= i39 & 15;
            }
            int i41 = configuration.uiMode & 48;
            int i42 = configuration2.uiMode;
            if (i41 != (i42 & 48)) {
                configuration3.uiMode |= i42 & 48;
            }
            int i43 = configuration.screenWidthDp;
            int i44 = configuration2.screenWidthDp;
            if (i43 != i44) {
                configuration3.screenWidthDp = i44;
            }
            int i45 = configuration.screenHeightDp;
            int i46 = configuration2.screenHeightDp;
            if (i45 != i46) {
                configuration3.screenHeightDp = i46;
            }
            int i47 = configuration.smallestScreenWidthDp;
            int i48 = configuration2.smallestScreenWidthDp;
            if (i47 != i48) {
                configuration3.smallestScreenWidthDp = i48;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private o g0(Context context) {
        if (this.T == null) {
            this.T = new n(context);
        }
        return this.T;
    }

    private o h0(Context context) {
        if (this.S == null) {
            this.S = new p(n.a(context));
        }
        return this.S;
    }

    private void l0() {
        b0();
        if (this.A && this.f1530i == null) {
            Object obj = this.f1525d;
            if (obj instanceof Activity) {
                this.f1530i = new o((Activity) this.f1525d, this.B);
            } else if (obj instanceof Dialog) {
                this.f1530i = new o((Dialog) this.f1525d);
            }
            a aVar = this.f1530i;
            if (aVar != null) {
                aVar.r(this.f1524c0);
            }
        }
    }

    private boolean m0(s sVar) {
        View view = sVar.f1574i;
        if (view != null) {
            sVar.f1573h = view;
            return true;
        } else if (sVar.j == null) {
            return false;
        } else {
            if (this.n == null) {
                this.n = new t();
            }
            View view2 = (View) sVar.a(this.n);
            sVar.f1573h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean n0(s sVar) {
        sVar.d(f0());
        sVar.f1572g = new r(sVar.f1575l);
        sVar.f1568c = 81;
        return true;
    }

    private boolean o0(s sVar) {
        Context context = this.f1526e;
        int i11 = sVar.f1566a;
        if ((i11 == 0 || i11 == 108) && this.f1531l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                p1.e eVar = new p1.e(context, 0);
                eVar.getTheme().setTo(theme2);
                context = eVar;
            }
        }
        androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
        eVar2.V(this);
        sVar.c(eVar2);
        return true;
    }

    private void p0(int i11) {
        this.V = (1 << i11) | this.V;
        if (!this.U) {
            a0.o0(this.f1527f.getDecorView(), this.W);
            this.U = true;
        }
    }

    private boolean q0() {
        if (!this.R && (this.f1525d instanceof Activity)) {
            PackageManager packageManager = this.f1526e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f1526e, this.f1525d.getClass()), i11 >= 29 ? 269221888 : i11 >= 24 ? 786432 : 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e11);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private boolean v0(int i11, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s i02 = i0(i11, true);
        if (!i02.f1577o) {
            return F0(i02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean y0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            p1$c r0 = r4.f1534o
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$s r2 = r4.i0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.v r5 = r4.f1531l
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f1526e
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.v r5 = r4.f1531l
            boolean r5 = r5.c()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.N
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.F0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.v r5 = r4.f1531l
            boolean r0 = r5.b()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.v r5 = r4.f1531l
            boolean r0 = r5.d()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f1577o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f1576m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f1579r
            if (r5 == 0) goto L_0x005b
            r2.f1576m = r1
            boolean r5 = r4.F0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.C0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.T(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f1526e
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.y0(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void A0(int i11) {
        if (i11 == 108) {
            a p11 = p();
            if (p11 != null) {
                p11.i(false);
            }
        } else if (i11 == 0) {
            s i02 = i0(i11, true);
            if (i02.f1577o) {
                T(i02, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B0(ViewGroup viewGroup) {
    }

    public boolean C(int i11) {
        int H0 = H0(i11);
        if (this.E && H0 == 108) {
            return false;
        }
        if (this.A && H0 == 1) {
            this.A = false;
        }
        if (H0 == 1) {
            L0();
            this.E = true;
            return true;
        } else if (H0 == 2) {
            L0();
            this.f1544y = true;
            return true;
        } else if (H0 == 5) {
            L0();
            this.f1545z = true;
            return true;
        } else if (H0 == 10) {
            L0();
            this.C = true;
            return true;
        } else if (H0 == 108) {
            L0();
            this.A = true;
            return true;
        } else if (H0 != 109) {
            return this.f1527f.requestFeature(H0);
        } else {
            L0();
            this.B = true;
            return true;
        }
    }

    public void D(int i11) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1526e).inflate(i11, viewGroup);
        this.f1528g.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public final a D0() {
        return this.f1530i;
    }

    public void E(View view) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1528g.a().onContentChanged();
    }

    public void F(View view, ViewGroup.LayoutParams layoutParams) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1528g.a().onContentChanged();
    }

    public void H(Toolbar toolbar) {
        if (this.f1525d instanceof Activity) {
            a p11 = p();
            if (!(p11 instanceof o)) {
                this.j = null;
                if (p11 != null) {
                    p11.n();
                }
                if (toolbar != null) {
                    l lVar = new l(toolbar, j0(), this.f1528g);
                    this.f1530i = lVar;
                    this.f1527f.setCallback(lVar.z());
                } else {
                    this.f1530i = null;
                    this.f1527f.setCallback(this.f1528g);
                }
                r();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void I(int i11) {
        this.P = i11;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I0() {
        /*
            r1 = this;
            boolean r0 = r1.f1541u
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.v
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.a0.a0(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.I0():boolean");
    }

    public final void J(CharSequence charSequence) {
        this.k = charSequence;
        v vVar = this.f1531l;
        if (vVar != null) {
            vVar.setWindowTitle(charSequence);
        } else if (D0() != null) {
            D0().w(charSequence);
        } else {
            TextView textView = this.f1542w;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public p1.c K(p1.c.a aVar) {
        d dVar;
        if (aVar != null) {
            p1.c cVar = this.f1534o;
            if (cVar != null) {
                cVar.c();
            }
            h hVar = new h(aVar);
            a p11 = p();
            if (p11 != null) {
                p1.c x11 = p11.x(hVar);
                this.f1534o = x11;
                if (!(x11 == null || (dVar = this.f1529h) == null)) {
                    dVar.onSupportActionModeStarted(x11);
                }
            }
            if (this.f1534o == null) {
                this.f1534o = K0(hVar);
            }
            return this.f1534o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.p1.c K0(defpackage.p1.c.a r8) {
        /*
            r7 = this;
            r7.a0()
            p1$c r0 = r7.f1534o
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.f.h
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$h r0 = new androidx.appcompat.app.f$h
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f1529h
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.N
            if (r2 != 0) goto L_0x0022
            p1$c r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f1534o = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1536p
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.D
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1526e
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.R.attr.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f1526e
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            p1$e r4 = new p1$e
            android.content.Context r6 = r7.f1526e
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f1526e
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1536p = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.R.attr.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.q = r5
            r6 = 2
            androidx.core.widget.j.b(r5, r6)
            android.widget.PopupWindow r5 = r7.q
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f1536p
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.q
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.R.attr.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1536p
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.q
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$d r0 = new androidx.appcompat.app.f$d
            r0.<init>()
            r7.f1539r = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.v
            int r4 = androidx.appcompat.R.id.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.f0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f1536p = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1536p
            if (r0 == 0) goto L_0x0162
            r7.a0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1536p
            r0.k()
            p1$f r0 = new p1$f
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1536p
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f1536p
            android.widget.PopupWindow r6 = r7.q
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.c(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            r8.h(r0)
            r7.f1534o = r0
            boolean r8 = r7.I0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            androidx.core.view.h0 r8 = androidx.core.view.a0.e(r8)
            androidx.core.view.h0 r8 = r8.b(r0)
            r7.f1540s = r8
            androidx.appcompat.app.f$e r0 = new androidx.appcompat.app.f$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1536p
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.a0.t0(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.q
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f1527f
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1539r
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f1534o = r1
        L_0x0162:
            p1$c r8 = r7.f1534o
            if (r8 == 0) goto L_0x016d
            androidx.appcompat.app.d r0 = r7.f1529h
            if (r0 == 0) goto L_0x016d
            r0.onSupportActionModeStarted(r8)
        L_0x016d:
            p1$c r8 = r7.f1534o
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.K0(p1$c$a):p1$c");
    }

    /* access modifiers changed from: package-private */
    public void P(int i11, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i11 >= 0) {
                s[] sVarArr = this.G;
                if (i11 < sVarArr.length) {
                    sVar = sVarArr[i11];
                }
            }
            if (sVar != null) {
                menu = sVar.j;
            }
        }
        if ((sVar == null || sVar.f1577o) && !this.N) {
            this.f1528g.a().onPanelClosed(i11, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public final int P0(n0 n0Var, Rect rect) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i14;
        int i15 = 0;
        if (n0Var != null) {
            i11 = n0Var.r();
        } else {
            i11 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f1536p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z11 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f1536p.getLayoutParams();
            boolean z13 = true;
            if (this.f1536p.isShown()) {
                if (this.f1533n0 == null) {
                    this.f1533n0 = new Rect();
                    this.f1535o0 = new Rect();
                }
                Rect rect2 = this.f1533n0;
                Rect rect3 = this.f1535o0;
                if (n0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(n0Var.p(), n0Var.r(), n0Var.q(), n0Var.o());
                }
                u0.a(this.v, rect2, rect3);
                int i16 = rect2.top;
                int i17 = rect2.left;
                int i18 = rect2.right;
                n0 M2 = a0.M(this.v);
                if (M2 == null) {
                    i12 = 0;
                } else {
                    i12 = M2.p();
                }
                if (M2 == null) {
                    i13 = 0;
                } else {
                    i13 = M2.q();
                }
                if (marginLayoutParams2.topMargin == i16 && marginLayoutParams2.leftMargin == i17 && marginLayoutParams2.rightMargin == i18) {
                    z12 = false;
                } else {
                    marginLayoutParams2.topMargin = i16;
                    marginLayoutParams2.leftMargin = i17;
                    marginLayoutParams2.rightMargin = i18;
                    z12 = true;
                }
                if (i16 <= 0 || this.f1543x != null) {
                    View view = this.f1543x;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i14 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13))) {
                        marginLayoutParams.height = i14;
                        marginLayoutParams.leftMargin = i12;
                        marginLayoutParams.rightMargin = i13;
                        this.f1543x.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f1526e);
                    this.f1543x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i12;
                    layoutParams.rightMargin = i13;
                    this.v.addView(this.f1543x, -1, layoutParams);
                }
                View view3 = this.f1543x;
                if (view3 == null) {
                    z13 = false;
                }
                if (z13 && view3.getVisibility() != 0) {
                    Q0(this.f1543x);
                }
                if (!this.C && z13) {
                    i11 = 0;
                }
                z11 = z13;
                z13 = z12;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z11 = false;
            } else {
                z11 = false;
                z13 = false;
            }
            if (z13) {
                this.f1536p.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f1543x;
        if (view4 != null) {
            if (!z11) {
                i15 = 8;
            }
            view4.setVisibility(i15);
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public void Q(androidx.appcompat.view.menu.e eVar) {
        if (!this.F) {
            this.F = true;
            this.f1531l.m();
            Window.Callback k02 = k0();
            if (k02 != null && !this.N) {
                k02.onPanelClosed(108, eVar);
            }
            this.F = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void S(int i11) {
        T(i0(i11, true), true);
    }

    /* access modifiers changed from: package-private */
    public void T(s sVar, boolean z11) {
        ViewGroup viewGroup;
        v vVar;
        if (!z11 || sVar.f1566a != 0 || (vVar = this.f1531l) == null || !vVar.c()) {
            WindowManager windowManager = (WindowManager) this.f1526e.getSystemService("window");
            if (!(windowManager == null || !sVar.f1577o || (viewGroup = sVar.f1572g) == null)) {
                windowManager.removeView(viewGroup);
                if (z11) {
                    P(sVar.f1566a, sVar, (Menu) null);
                }
            }
            sVar.f1576m = false;
            sVar.n = false;
            sVar.f1577o = false;
            sVar.f1573h = null;
            sVar.q = true;
            if (this.H == sVar) {
                this.H = null;
                return;
            }
            return;
        }
        Q(sVar.j);
    }

    public View W(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z11;
        boolean z12 = false;
        if (this.f1537p0 == null) {
            String string = this.f1526e.obtainStyledAttributes(R.styleable.AppCompatTheme).getString(R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f1537p0 = new i();
            } else {
                try {
                    this.f1537p0 = (i) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f1537p0 = new i();
                }
            }
        }
        boolean z13 = f1520s0;
        if (z13) {
            if (this.f1538q0 == null) {
                this.f1538q0 = new j();
            }
            if (this.f1538q0.a(attributeSet)) {
                z11 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z12 = J0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z12 = true;
                }
                z11 = z12;
            }
        } else {
            z11 = false;
        }
        return this.f1537p0.q(view, str, context, attributeSet, z11, z13, true, t0.c());
    }

    /* access modifiers changed from: package-private */
    public void X() {
        androidx.appcompat.view.menu.e eVar;
        v vVar = this.f1531l;
        if (vVar != null) {
            vVar.m();
        }
        if (this.q != null) {
            this.f1527f.getDecorView().removeCallbacks(this.f1539r);
            if (this.q.isShowing()) {
                try {
                    this.q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.q = null;
        }
        a0();
        s i02 = i0(0, false);
        if (i02 != null && (eVar = i02.j) != null) {
            eVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1525d;
        boolean z11 = true;
        if (((obj instanceof f.a) || (obj instanceof g)) && (decorView = this.f1527f.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1528g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z11 = false;
        }
        return z11 ? u0(keyCode, keyEvent) : x0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void Z(int i11) {
        s i02;
        s i03 = i0(i11, true);
        if (i03.j != null) {
            Bundle bundle = new Bundle();
            i03.j.T(bundle);
            if (bundle.size() > 0) {
                i03.f1580s = bundle;
            }
            i03.j.h0();
            i03.j.clear();
        }
        i03.f1579r = true;
        i03.q = true;
        if ((i11 == 108 || i11 == 0) && this.f1531l != null && (i02 = i0(0, false)) != null) {
            i02.f1576m = false;
            F0(i02, (KeyEvent) null);
        }
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s d02;
        Window.Callback k02 = k0();
        if (k02 == null || this.N || (d02 = d0(eVar.F())) == null) {
            return false;
        }
        return k02.onMenuItemSelected(d02.f1566a, menuItem);
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        h0 h0Var = this.f1540s;
        if (h0Var != null) {
            h0Var.c();
        }
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        G0(true);
    }

    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        b0();
        ((ViewGroup) this.v.findViewById(16908290)).addView(view, layoutParams);
        this.f1528g.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public s d0(Menu menu) {
        s[] sVarArr = this.G;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i11 = 0; i11 < length; i11++) {
            s sVar = sVarArr[i11];
            if (sVar != null && sVar.j == menu) {
                return sVar;
            }
        }
        return null;
    }

    public boolean e() {
        return L(true);
    }

    /* access modifiers changed from: package-private */
    public final Context f0() {
        a p11 = p();
        Context k11 = p11 != null ? p11.k() : null;
        return k11 == null ? this.f1526e : k11;
    }

    public Context h(Context context) {
        boolean z11 = true;
        this.K = true;
        int s02 = s0(context, O());
        Configuration configuration = null;
        if (f1523v0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, U(context, s02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof p1.e) {
            try {
                ((p1.e) context).a(U(context, s02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f1522u0) {
            return super.h(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = i.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = e0(configuration3, configuration4);
        }
        Configuration U2 = U(context, s02, configuration);
        p1.e eVar = new p1.e(context, R.style.Theme_AppCompat_Empty);
        eVar.a(U2);
        boolean z12 = false;
        try {
            if (context.getTheme() == null) {
                z11 = false;
            }
            z12 = z11;
        } catch (NullPointerException unused3) {
        }
        if (z12) {
            h.f.a(eVar.getTheme());
        }
        return super.h(eVar);
    }

    /* access modifiers changed from: protected */
    public s i0(int i11, boolean z11) {
        s[] sVarArr = this.G;
        if (sVarArr == null || sVarArr.length <= i11) {
            s[] sVarArr2 = new s[(i11 + 1)];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.G = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i11];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i11);
        sVarArr[i11] = sVar2;
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence j0() {
        Object obj = this.f1525d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.k;
    }

    public <T extends View> T k(int i11) {
        b0();
        return this.f1527f.findViewById(i11);
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback k0() {
        return this.f1527f.getCallback();
    }

    public final b m() {
        return new C0012f();
    }

    public int n() {
        return this.O;
    }

    public MenuInflater o() {
        if (this.j == null) {
            l0();
            a aVar = this.f1530i;
            this.j = new p1.h(aVar != null ? aVar.k() : this.f1526e);
        }
        return this.j;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return W(view, str, context, attributeSet);
    }

    public a p() {
        l0();
        return this.f1530i;
    }

    public void q() {
        LayoutInflater from = LayoutInflater.from(this.f1526e);
        if (from.getFactory() == null) {
            androidx.core.view.g.a(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void r() {
        a p11 = p();
        if (p11 == null || !p11.l()) {
            p0(0);
        }
    }

    public boolean r0() {
        return this.t;
    }

    public void s(Configuration configuration) {
        a p11;
        if (this.A && this.f1541u && (p11 = p()) != null) {
            p11.m(configuration);
        }
        androidx.appcompat.widget.g.b().g(this.f1526e);
        L(false);
    }

    /* access modifiers changed from: package-private */
    public int s0(Context context, int i11) {
        if (i11 == -100) {
            return -1;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (!(i11 == 1 || i11 == 2)) {
                    if (i11 == 3) {
                        return g0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return h0(context).c();
            } else {
                return -1;
            }
        }
        return i11;
    }

    public void t(Bundle bundle) {
        this.K = true;
        L(false);
        c0();
        Object obj = this.f1525d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a D0 = D0();
                if (D0 == null) {
                    this.f1524c0 = true;
                } else {
                    D0.r(true);
                }
            }
            e.c(this);
        }
        this.L = true;
    }

    /* access modifiers changed from: package-private */
    public boolean t0() {
        p1.c cVar = this.f1534o;
        if (cVar != null) {
            cVar.c();
            return true;
        }
        a p11 = p();
        if (p11 == null || !p11.h()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1525d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.e.A(r3)
        L_0x0009:
            boolean r0 = r3.U
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f1527f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.W
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.M = r0
            r0 = 1
            r3.N = r0
            int r0 = r3.O
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f1525d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = f1519r0
            java.lang.Object r1 = r3.f1525d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = f1519r0
            java.lang.Object r1 = r3.f1525d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f1530i
            if (r0 == 0) goto L_0x005e
            r0.n()
        L_0x005e:
            r3.R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.u():void");
    }

    /* access modifiers changed from: package-private */
    public boolean u0(int i11, KeyEvent keyEvent) {
        boolean z11 = true;
        if (i11 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z11 = false;
            }
            this.I = z11;
        } else if (i11 == 82) {
            v0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void v(Bundle bundle) {
        b0();
    }

    public void w() {
        a p11 = p();
        if (p11 != null) {
            p11.u(true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w0(int i11, KeyEvent keyEvent) {
        a p11 = p();
        if (p11 != null && p11.o(i11, keyEvent)) {
            return true;
        }
        s sVar = this.H;
        if (sVar == null || !E0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.H == null) {
                s i02 = i0(0, true);
                F0(i02, keyEvent);
                boolean E0 = E0(i02, keyEvent.getKeyCode(), keyEvent, 1);
                i02.f1576m = false;
                if (E0) {
                    return true;
                }
            }
            return false;
        }
        s sVar2 = this.H;
        if (sVar2 != null) {
            sVar2.n = true;
        }
        return true;
    }

    public void x(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public boolean x0(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            boolean z11 = this.I;
            this.I = false;
            s i02 = i0(0, false);
            if (i02 != null && i02.f1577o) {
                if (!z11) {
                    T(i02, true);
                }
                return true;
            } else if (t0()) {
                return true;
            }
        } else if (i11 == 82) {
            y0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void y() {
        this.M = true;
        e();
    }

    public void z() {
        this.M = false;
        a p11 = p();
        if (p11 != null) {
            p11.u(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void z0(int i11) {
        a p11;
        if (i11 == 108 && (p11 = p()) != null) {
            p11.i(true);
        }
    }

    f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f1519r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private f(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1540s = r0
            r0 = 1
            r2.t = r0
            r0 = -100
            r2.O = r0
            androidx.appcompat.app.f$a r1 = new androidx.appcompat.app.f$a
            r1.<init>()
            r2.W = r1
            r2.f1526e = r3
            r2.f1529h = r5
            r2.f1525d = r6
            int r3 = r2.O
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.AppCompatActivity r3 = r2.M0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.e r3 = r3.getDelegate()
            int r3 = r3.n()
            r2.O = r3
        L_0x0032:
            int r3 = r2.O
            if (r3 != r0) goto L_0x0059
            androidx.collection.g<java.lang.String, java.lang.Integer> r3 = f1519r0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.O = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.N(r4)
        L_0x005e:
            androidx.appcompat.widget.g.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    /* compiled from: AppCompatDelegateImpl */
    class m extends p1.j {
        m(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            p1.g.a aVar = new p1.g.a(f.this.f1526e, callback);
            p1.c K = f.this.K(aVar);
            if (K != null) {
                return aVar.e(K);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.w0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i11, Menu menu) {
            if (i11 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i11, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i11, Menu menu) {
            super.onMenuOpened(i11, menu);
            f.this.z0(i11);
            return true;
        }

        public void onPanelClosed(int i11, Menu menu) {
            super.onPanelClosed(i11, menu);
            f.this.A0(i11);
        }

        public boolean onPreparePanel(int i11, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i11 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i11, view, menu);
            if (eVar != null) {
                eVar.e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i11) {
            androidx.appcompat.view.menu.e eVar;
            s i02 = f.this.i0(0, true);
            if (i02 == null || (eVar = i02.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i11);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i11);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (f.this.r0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
            if (!f.this.r0() || i11 != 0) {
                return super.onWindowStartingActionMode(callback, i11);
            }
            return b(callback);
        }
    }
}
