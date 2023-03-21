package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.w;
import androidx.core.view.a0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import androidx.core.view.k0;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import defpackage.p1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar */
public class o extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    final i0 B = new a();
    final i0 C = new b();
    final k0 D = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f1631a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1632b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f1633c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f1634d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f1635e;

    /* renamed from: f  reason: collision with root package name */
    w f1636f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f1637g;

    /* renamed from: h  reason: collision with root package name */
    View f1638h;

    /* renamed from: i  reason: collision with root package name */
    h0 f1639i;
    private ArrayList<Object> j = new ArrayList<>();
    private int k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1640l;

    /* renamed from: m  reason: collision with root package name */
    d f1641m;
    p1.c n;

    /* renamed from: o  reason: collision with root package name */
    p1.c.a f1642o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1643p;
    private ArrayList<a.b> q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f1644r;

    /* renamed from: s  reason: collision with root package name */
    private int f1645s = 0;
    boolean t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f1646u;
    boolean v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1647w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1648x = true;

    /* renamed from: y  reason: collision with root package name */
    p1.i f1649y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1650z;

    /* compiled from: WindowDecorActionBar */
    class a extends j0 {
        a() {
        }

        public void b(View view) {
            View view2;
            o oVar = o.this;
            if (oVar.t && (view2 = oVar.f1638h) != null) {
                view2.setTranslationY(0.0f);
                o.this.f1635e.setTranslationY(0.0f);
            }
            o.this.f1635e.setVisibility(8);
            o.this.f1635e.setTransitioning(false);
            o oVar2 = o.this;
            oVar2.f1649y = null;
            oVar2.A();
            ActionBarOverlayLayout actionBarOverlayLayout = o.this.f1634d;
            if (actionBarOverlayLayout != null) {
                a0.t0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    class b extends j0 {
        b() {
        }

        public void b(View view) {
            o oVar = o.this;
            oVar.f1649y = null;
            oVar.f1635e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    class c implements k0 {
        c() {
        }

        public void a(View view) {
            ((View) o.this.f1635e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends p1.c implements e.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f1654c;

        /* renamed from: d  reason: collision with root package name */
        private final e f1655d;

        /* renamed from: e  reason: collision with root package name */
        private p1.c.a f1656e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f1657f;

        public d(Context context, p1.c.a aVar) {
            this.f1654c = context;
            this.f1656e = aVar;
            e W = new e(context).W(1);
            this.f1655d = W;
            W.V(this);
        }

        public boolean a(e eVar, MenuItem menuItem) {
            p1.c.a aVar = this.f1656e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public void b(e eVar) {
            if (this.f1656e != null) {
                k();
                o.this.f1637g.l();
            }
        }

        public void c() {
            o oVar = o.this;
            if (oVar.f1641m == this) {
                if (!o.z(oVar.f1646u, oVar.v, false)) {
                    o oVar2 = o.this;
                    oVar2.n = this;
                    oVar2.f1642o = this.f1656e;
                } else {
                    this.f1656e.a(this);
                }
                this.f1656e = null;
                o.this.y(false);
                o.this.f1637g.g();
                o.this.f1636f.s().sendAccessibilityEvent(32);
                o oVar3 = o.this;
                oVar3.f1634d.setHideOnContentScrollEnabled(oVar3.A);
                o.this.f1641m = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f1657f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f1655d;
        }

        public MenuInflater f() {
            return new p1.h(this.f1654c);
        }

        public CharSequence g() {
            return o.this.f1637g.getSubtitle();
        }

        public CharSequence i() {
            return o.this.f1637g.getTitle();
        }

        public void k() {
            if (o.this.f1641m == this) {
                this.f1655d.h0();
                try {
                    this.f1656e.b(this, this.f1655d);
                } finally {
                    this.f1655d.g0();
                }
            }
        }

        public boolean l() {
            return o.this.f1637g.j();
        }

        public void m(View view) {
            o.this.f1637g.setCustomView(view);
            this.f1657f = new WeakReference<>(view);
        }

        public void n(int i11) {
            o(o.this.f1631a.getResources().getString(i11));
        }

        public void o(CharSequence charSequence) {
            o.this.f1637g.setSubtitle(charSequence);
        }

        public void q(int i11) {
            r(o.this.f1631a.getResources().getString(i11));
        }

        public void r(CharSequence charSequence) {
            o.this.f1637g.setTitle(charSequence);
        }

        public void s(boolean z11) {
            super.s(z11);
            o.this.f1637g.setTitleOptional(z11);
        }

        public boolean t() {
            this.f1655d.h0();
            try {
                return this.f1656e.c(this, this.f1655d);
            } finally {
                this.f1655d.g0();
            }
        }
    }

    public o(Activity activity, boolean z11) {
        this.f1633c = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (!z11) {
            this.f1638h = decorView.findViewById(16908290);
        }
    }

    private w D(View view) {
        if (view instanceof w) {
            return (w) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : SafeJsonPrimitive.NULL_STRING);
        throw new IllegalStateException(sb2.toString());
    }

    private void F() {
        if (this.f1647w) {
            this.f1647w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1634d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f1634d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1636f = D(view.findViewById(R.id.action_bar));
        this.f1637g = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1635e = actionBarContainer;
        w wVar = this.f1636f;
        if (wVar == null || this.f1637g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1631a = wVar.getContext();
        boolean z11 = (this.f1636f.n() & 4) != 0;
        if (z11) {
            this.f1640l = true;
        }
        p1.b b11 = p1.b.b(this.f1631a);
        L(b11.a() || z11);
        J(b11.g());
        TypedArray obtainStyledAttributes = this.f1631a.obtainStyledAttributes((AttributeSet) null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
            K(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            I((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void J(boolean z11) {
        this.f1644r = z11;
        if (!z11) {
            this.f1636f.u((h0) null);
            this.f1635e.setTabContainer(this.f1639i);
        } else {
            this.f1635e.setTabContainer((h0) null);
            this.f1636f.u(this.f1639i);
        }
        boolean z12 = true;
        boolean z13 = E() == 2;
        h0 h0Var = this.f1639i;
        if (h0Var != null) {
            if (z13) {
                h0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1634d;
                if (actionBarOverlayLayout != null) {
                    a0.t0(actionBarOverlayLayout);
                }
            } else {
                h0Var.setVisibility(8);
            }
        }
        this.f1636f.l(!this.f1644r && z13);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1634d;
        if (this.f1644r || !z13) {
            z12 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z12);
    }

    private boolean M() {
        return a0.a0(this.f1635e);
    }

    private void N() {
        if (!this.f1647w) {
            this.f1647w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1634d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            O(false);
        }
    }

    private void O(boolean z11) {
        if (z(this.f1646u, this.v, this.f1647w)) {
            if (!this.f1648x) {
                this.f1648x = true;
                C(z11);
            }
        } else if (this.f1648x) {
            this.f1648x = false;
            B(z11);
        }
    }

    static boolean z(boolean z11, boolean z12, boolean z13) {
        if (z13) {
            return true;
        }
        return !z11 && !z12;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        p1.c.a aVar = this.f1642o;
        if (aVar != null) {
            aVar.a(this.n);
            this.n = null;
            this.f1642o = null;
        }
    }

    public void B(boolean z11) {
        View view;
        p1.i iVar = this.f1649y;
        if (iVar != null) {
            iVar.a();
        }
        if (this.f1645s != 0 || (!this.f1650z && !z11)) {
            this.B.b((View) null);
            return;
        }
        this.f1635e.setAlpha(1.0f);
        this.f1635e.setTransitioning(true);
        p1.i iVar2 = new p1.i();
        float f11 = (float) (-this.f1635e.getHeight());
        if (z11) {
            int[] iArr = {0, 0};
            this.f1635e.getLocationInWindow(iArr);
            f11 -= (float) iArr[1];
        }
        androidx.core.view.h0 n11 = a0.e(this.f1635e).n(f11);
        n11.k(this.D);
        iVar2.c(n11);
        if (this.t && (view = this.f1638h) != null) {
            iVar2.c(a0.e(view).n(f11));
        }
        iVar2.f(E);
        iVar2.e(250);
        iVar2.g(this.B);
        this.f1649y = iVar2;
        iVar2.h();
    }

    public void C(boolean z11) {
        View view;
        View view2;
        p1.i iVar = this.f1649y;
        if (iVar != null) {
            iVar.a();
        }
        this.f1635e.setVisibility(0);
        if (this.f1645s != 0 || (!this.f1650z && !z11)) {
            this.f1635e.setAlpha(1.0f);
            this.f1635e.setTranslationY(0.0f);
            if (this.t && (view = this.f1638h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b((View) null);
        } else {
            this.f1635e.setTranslationY(0.0f);
            float f11 = (float) (-this.f1635e.getHeight());
            if (z11) {
                int[] iArr = {0, 0};
                this.f1635e.getLocationInWindow(iArr);
                f11 -= (float) iArr[1];
            }
            this.f1635e.setTranslationY(f11);
            p1.i iVar2 = new p1.i();
            androidx.core.view.h0 n11 = a0.e(this.f1635e).n(0.0f);
            n11.k(this.D);
            iVar2.c(n11);
            if (this.t && (view2 = this.f1638h) != null) {
                view2.setTranslationY(f11);
                iVar2.c(a0.e(this.f1638h).n(0.0f));
            }
            iVar2.f(F);
            iVar2.e(250);
            iVar2.g(this.C);
            this.f1649y = iVar2;
            iVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1634d;
        if (actionBarOverlayLayout != null) {
            a0.t0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.f1636f.j();
    }

    public void H(int i11, int i12) {
        int n11 = this.f1636f.n();
        if ((i12 & 4) != 0) {
            this.f1640l = true;
        }
        this.f1636f.i((i11 & i12) | ((~i12) & n11));
    }

    public void I(float f11) {
        a0.E0(this.f1635e, f11);
    }

    public void K(boolean z11) {
        if (!z11 || this.f1634d.w()) {
            this.A = z11;
            this.f1634d.setHideOnContentScrollEnabled(z11);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void L(boolean z11) {
        this.f1636f.t(z11);
    }

    public void a() {
        if (this.v) {
            this.v = false;
            O(true);
        }
    }

    public void b() {
    }

    public void c() {
        if (!this.v) {
            this.v = true;
            O(true);
        }
    }

    public void d() {
        p1.i iVar = this.f1649y;
        if (iVar != null) {
            iVar.a();
            this.f1649y = null;
        }
    }

    public void e(int i11) {
        this.f1645s = i11;
    }

    public void f(boolean z11) {
        this.t = z11;
    }

    public boolean h() {
        w wVar = this.f1636f;
        if (wVar == null || !wVar.h()) {
            return false;
        }
        this.f1636f.collapseActionView();
        return true;
    }

    public void i(boolean z11) {
        if (z11 != this.f1643p) {
            this.f1643p = z11;
            int size = this.q.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.q.get(i11).a(z11);
            }
        }
    }

    public int j() {
        return this.f1636f.n();
    }

    public Context k() {
        if (this.f1632b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1631a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f1632b = new ContextThemeWrapper(this.f1631a, i11);
            } else {
                this.f1632b = this.f1631a;
            }
        }
        return this.f1632b;
    }

    public void m(Configuration configuration) {
        J(p1.b.b(this.f1631a).g());
    }

    public boolean o(int i11, KeyEvent keyEvent) {
        Menu e11;
        d dVar = this.f1641m;
        if (dVar == null || (e11 = dVar.e()) == null) {
            return false;
        }
        boolean z11 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z11 = false;
        }
        e11.setQwertyMode(z11);
        return e11.performShortcut(i11, keyEvent, 0);
    }

    public void r(boolean z11) {
        if (!this.f1640l) {
            s(z11);
        }
    }

    public void s(boolean z11) {
        H(z11 ? 4 : 0, 4);
    }

    public void t(Drawable drawable) {
        this.f1636f.p(drawable);
    }

    public void u(boolean z11) {
        p1.i iVar;
        this.f1650z = z11;
        if (!z11 && (iVar = this.f1649y) != null) {
            iVar.a();
        }
    }

    public void v(CharSequence charSequence) {
        this.f1636f.setTitle(charSequence);
    }

    public void w(CharSequence charSequence) {
        this.f1636f.setWindowTitle(charSequence);
    }

    public p1.c x(p1.c.a aVar) {
        d dVar = this.f1641m;
        if (dVar != null) {
            dVar.c();
        }
        this.f1634d.setHideOnContentScrollEnabled(false);
        this.f1637g.k();
        d dVar2 = new d(this.f1637g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f1641m = dVar2;
        dVar2.k();
        this.f1637g.h(dVar2);
        y(true);
        this.f1637g.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void y(boolean z11) {
        androidx.core.view.h0 h0Var;
        androidx.core.view.h0 h0Var2;
        if (z11) {
            N();
        } else {
            F();
        }
        if (M()) {
            if (z11) {
                h0Var = this.f1636f.r(4, 100);
                h0Var2 = this.f1637g.f(0, 200);
            } else {
                h0Var2 = this.f1636f.r(0, 200);
                h0Var = this.f1637g.f(8, 100);
            }
            p1.i iVar = new p1.i();
            iVar.d(h0Var, h0Var2);
            iVar.h();
        } else if (z11) {
            this.f1636f.setVisibility(4);
            this.f1637g.setVisibility(0);
        } else {
            this.f1636f.setVisibility(0);
            this.f1637g.setVisibility(8);
        }
    }

    public o(Dialog dialog) {
        G(dialog.getWindow().getDecorView());
    }
}
