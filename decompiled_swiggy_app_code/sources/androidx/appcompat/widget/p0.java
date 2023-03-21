package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a0;
import androidx.core.view.h0;
import androidx.core.view.j0;
import defpackage.q1;

/* compiled from: ToolbarWidgetWrapper */
public class p0 implements w {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f2224a;

    /* renamed from: b  reason: collision with root package name */
    private int f2225b;

    /* renamed from: c  reason: collision with root package name */
    private View f2226c;

    /* renamed from: d  reason: collision with root package name */
    private View f2227d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f2228e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f2229f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f2230g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2231h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f2232i;
    private CharSequence j;
    private CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f2233l;

    /* renamed from: m  reason: collision with root package name */
    boolean f2234m;
    private ActionMenuPresenter n;

    /* renamed from: o  reason: collision with root package name */
    private int f2235o;

    /* renamed from: p  reason: collision with root package name */
    private int f2236p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final q1.b f2237a;

        a() {
            this.f2237a = new q1.b(p0.this.f2224a.getContext(), 0, 16908332, 0, 0, p0.this.f2232i);
        }

        public void onClick(View view) {
            p0 p0Var = p0.this;
            Window.Callback callback = p0Var.f2233l;
            if (callback != null && p0Var.f2234m) {
                callback.onMenuItemSelected(0, this.f2237a);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends j0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2239a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2240b;

        b(int i11) {
            this.f2240b = i11;
        }

        public void a(View view) {
            this.f2239a = true;
        }

        public void b(View view) {
            if (!this.f2239a) {
                p0.this.f2224a.setVisibility(this.f2240b);
            }
        }

        public void c(View view) {
            p0.this.f2224a.setVisibility(0);
        }
    }

    public p0(Toolbar toolbar, boolean z11) {
        this(toolbar, z11, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    private void E(CharSequence charSequence) {
        this.f2232i = charSequence;
        if ((this.f2225b & 8) != 0) {
            this.f2224a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.f2225b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f2224a.setNavigationContentDescription(this.f2236p);
        } else {
            this.f2224a.setNavigationContentDescription(this.k);
        }
    }

    private void G() {
        if ((this.f2225b & 4) != 0) {
            Toolbar toolbar = this.f2224a;
            Drawable drawable = this.f2230g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f2224a.setNavigationIcon((Drawable) null);
    }

    private void H() {
        Drawable drawable;
        int i11 = this.f2225b;
        if ((i11 & 2) == 0) {
            drawable = null;
        } else if ((i11 & 1) != 0) {
            drawable = this.f2229f;
            if (drawable == null) {
                drawable = this.f2228e;
            }
        } else {
            drawable = this.f2228e;
        }
        this.f2224a.setLogo(drawable);
    }

    private int x() {
        if (this.f2224a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f2224a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f2229f = drawable;
        H();
    }

    public void B(int i11) {
        C(i11 == 0 ? null : getContext().getString(i11));
    }

    public void C(CharSequence charSequence) {
        this.k = charSequence;
        F();
    }

    public void D(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f2225b & 8) != 0) {
            this.f2224a.setSubtitle(charSequence);
        }
    }

    public boolean a() {
        return this.f2224a.d();
    }

    public boolean b() {
        return this.f2224a.P();
    }

    public boolean c() {
        return this.f2224a.A();
    }

    public void collapseActionView() {
        this.f2224a.e();
    }

    public boolean d() {
        return this.f2224a.w();
    }

    public void e(Menu menu, j.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f2224a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.r(R.id.action_menu_presenter);
        }
        this.n.k(aVar);
        this.f2224a.J((e) menu, this.n);
    }

    public void f() {
        this.f2234m = true;
    }

    public boolean g() {
        return this.f2224a.z();
    }

    public Context getContext() {
        return this.f2224a.getContext();
    }

    public CharSequence getTitle() {
        return this.f2224a.getTitle();
    }

    public boolean h() {
        return this.f2224a.v();
    }

    public void i(int i11) {
        View view;
        int i12 = this.f2225b ^ i11;
        this.f2225b = i11;
        if (i12 != 0) {
            if ((i12 & 4) != 0) {
                if ((i11 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i12 & 3) != 0) {
                H();
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 8) != 0) {
                    this.f2224a.setTitle(this.f2232i);
                    this.f2224a.setSubtitle(this.j);
                } else {
                    this.f2224a.setTitle((CharSequence) null);
                    this.f2224a.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) != 0 && (view = this.f2227d) != null) {
                if ((i11 & 16) != 0) {
                    this.f2224a.addView(view);
                } else {
                    this.f2224a.removeView(view);
                }
            }
        }
    }

    public int j() {
        return this.f2235o;
    }

    public void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void l(boolean z11) {
        this.f2224a.setCollapsible(z11);
    }

    public void m() {
        this.f2224a.f();
    }

    public int n() {
        return this.f2225b;
    }

    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void p(Drawable drawable) {
        this.f2230g = drawable;
        G();
    }

    public Menu q() {
        return this.f2224a.getMenu();
    }

    public h0 r(int i11, long j11) {
        return a0.e(this.f2224a).b(i11 == 0 ? 1.0f : 0.0f).f(j11).h(new b(i11));
    }

    public ViewGroup s() {
        return this.f2224a;
    }

    public void setIcon(int i11) {
        setIcon(i11 != 0 ? f.a.b(getContext(), i11) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2231h = true;
        E(charSequence);
    }

    public void setVisibility(int i11) {
        this.f2224a.setVisibility(i11);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f2233l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2231h) {
            E(charSequence);
        }
    }

    public void t(boolean z11) {
    }

    public void u(h0 h0Var) {
        Toolbar toolbar;
        View view = this.f2226c;
        if (view != null && view.getParent() == (toolbar = this.f2224a)) {
            toolbar.removeView(this.f2226c);
        }
        this.f2226c = h0Var;
        if (h0Var != null && this.f2235o == 2) {
            this.f2224a.addView(h0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.f2226c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f1512a = 8388691;
            h0Var.setAllowCollapse(true);
        }
    }

    public void v(int i11) {
        A(i11 != 0 ? f.a.b(getContext(), i11) : null);
    }

    public void w(j.a aVar, e.a aVar2) {
        this.f2224a.K(aVar, aVar2);
    }

    public void y(View view) {
        View view2 = this.f2227d;
        if (!(view2 == null || (this.f2225b & 16) == 0)) {
            this.f2224a.removeView(view2);
        }
        this.f2227d = view;
        if (view != null && (this.f2225b & 16) != 0) {
            this.f2224a.addView(view);
        }
    }

    public void z(int i11) {
        if (i11 != this.f2236p) {
            this.f2236p = i11;
            if (TextUtils.isEmpty(this.f2224a.getNavigationContentDescription())) {
                B(this.f2236p);
            }
        }
    }

    public p0(Toolbar toolbar, boolean z11, int i11, int i12) {
        Drawable drawable;
        this.f2235o = 0;
        this.f2236p = 0;
        this.f2224a = toolbar;
        this.f2232i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.f2231h = this.f2232i != null;
        this.f2230g = toolbar.getNavigationIcon();
        o0 v = o0.v(toolbar.getContext(), (AttributeSet) null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.q = v.g(R.styleable.ActionBar_homeAsUpIndicator);
        if (z11) {
            CharSequence p11 = v.p(R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(p11)) {
                setTitle(p11);
            }
            CharSequence p12 = v.p(R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p12)) {
                D(p12);
            }
            Drawable g11 = v.g(R.styleable.ActionBar_logo);
            if (g11 != null) {
                A(g11);
            }
            Drawable g12 = v.g(R.styleable.ActionBar_icon);
            if (g12 != null) {
                setIcon(g12);
            }
            if (this.f2230g == null && (drawable = this.q) != null) {
                p(drawable);
            }
            i(v.k(R.styleable.ActionBar_displayOptions, 0));
            int n11 = v.n(R.styleable.ActionBar_customNavigationLayout, 0);
            if (n11 != 0) {
                y(LayoutInflater.from(this.f2224a.getContext()).inflate(n11, this.f2224a, false));
                i(this.f2225b | 16);
            }
            int m11 = v.m(R.styleable.ActionBar_height, 0);
            if (m11 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2224a.getLayoutParams();
                layoutParams.height = m11;
                this.f2224a.setLayoutParams(layoutParams);
            }
            int e11 = v.e(R.styleable.ActionBar_contentInsetStart, -1);
            int e12 = v.e(R.styleable.ActionBar_contentInsetEnd, -1);
            if (e11 >= 0 || e12 >= 0) {
                this.f2224a.I(Math.max(e11, 0), Math.max(e12, 0));
            }
            int n12 = v.n(R.styleable.ActionBar_titleTextStyle, 0);
            if (n12 != 0) {
                Toolbar toolbar2 = this.f2224a;
                toolbar2.M(toolbar2.getContext(), n12);
            }
            int n13 = v.n(R.styleable.ActionBar_subtitleTextStyle, 0);
            if (n13 != 0) {
                Toolbar toolbar3 = this.f2224a;
                toolbar3.L(toolbar3.getContext(), n13);
            }
            int n14 = v.n(R.styleable.ActionBar_popupTheme, 0);
            if (n14 != 0) {
                this.f2224a.setPopupTheme(n14);
            }
        } else {
            this.f2225b = x();
        }
        v.w();
        z(i11);
        this.k = this.f2224a.getNavigationContentDescription();
        this.f2224a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f2228e = drawable;
        H();
    }
}
