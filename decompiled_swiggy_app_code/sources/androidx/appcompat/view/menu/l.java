package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.d0;
import androidx.core.view.a0;

/* compiled from: StandardMenuPopup */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int v = R.layout.abc_popup_menu_item_layout;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1795b;

    /* renamed from: c  reason: collision with root package name */
    private final e f1796c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1797d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1798e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1799f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1800g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1801h;

    /* renamed from: i  reason: collision with root package name */
    final d0 f1802i;
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new b();

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1803l;

    /* renamed from: m  reason: collision with root package name */
    private View f1804m;
    View n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f1805o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f1806p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1807r;

    /* renamed from: s  reason: collision with root package name */
    private int f1808s;
    private int t = 0;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1809u;

    /* compiled from: StandardMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (l.this.b() && !l.this.f1802i.A()) {
                View view = l.this.n;
                if (view == null || !view.isShown()) {
                    l.this.dismiss();
                } else {
                    l.this.f1802i.a();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1806p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1806p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1806p.removeGlobalOnLayoutListener(lVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i11, int i12, boolean z11) {
        this.f1795b = context;
        this.f1796c = eVar;
        this.f1798e = z11;
        this.f1797d = new d(eVar, LayoutInflater.from(context), z11, v);
        this.f1800g = i11;
        this.f1801h = i12;
        Resources resources = context.getResources();
        this.f1799f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1804m = view;
        this.f1802i = new d0(context, (AttributeSet) null, i11, i12);
        eVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (b()) {
            return true;
        }
        if (this.q || (view = this.f1804m) == null) {
            return false;
        }
        this.n = view;
        this.f1802i.J(this);
        this.f1802i.K(this);
        this.f1802i.I(true);
        View view2 = this.n;
        boolean z11 = this.f1806p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1806p = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.f1802i.C(view2);
        this.f1802i.F(this.t);
        if (!this.f1807r) {
            this.f1808s = h.q(this.f1797d, (ViewGroup) null, this.f1795b, this.f1799f);
            this.f1807r = true;
        }
        this.f1802i.E(this.f1808s);
        this.f1802i.H(2);
        this.f1802i.G(p());
        this.f1802i.a();
        ListView j11 = this.f1802i.j();
        j11.setOnKeyListener(this);
        if (this.f1809u && this.f1796c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1795b).inflate(R.layout.abc_popup_menu_header_item_layout, j11, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1796c.z());
            }
            frameLayout.setEnabled(false);
            j11.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1802i.o(this.f1797d);
        this.f1802i.a();
        return true;
    }

    public void a() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean b() {
        return !this.q && this.f1802i.b();
    }

    public void c(e eVar, boolean z11) {
        if (eVar == this.f1796c) {
            dismiss();
            j.a aVar = this.f1805o;
            if (aVar != null) {
                aVar.c(eVar, z11);
            }
        }
    }

    public void dismiss() {
        if (b()) {
            this.f1802i.dismiss();
        }
    }

    public Parcelable e() {
        return null;
    }

    public void f(boolean z11) {
        this.f1807r = false;
        d dVar = this.f1797d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public ListView j() {
        return this.f1802i.j();
    }

    public void k(j.a aVar) {
        this.f1805o = aVar;
    }

    public void l(Parcelable parcelable) {
    }

    public boolean m(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1795b, mVar, this.n, this.f1798e, this.f1800g, this.f1801h);
            iVar.j(this.f1805o);
            iVar.g(h.z(mVar));
            iVar.i(this.f1803l);
            this.f1803l = null;
            this.f1796c.e(false);
            int k11 = this.f1802i.k();
            int h11 = this.f1802i.h();
            if ((Gravity.getAbsoluteGravity(this.t, a0.F(this.f1804m)) & 7) == 5) {
                k11 += this.f1804m.getWidth();
            }
            if (iVar.n(k11, h11)) {
                j.a aVar = this.f1805o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    public void n(e eVar) {
    }

    public void onDismiss() {
        this.q = true;
        this.f1796c.close();
        ViewTreeObserver viewTreeObserver = this.f1806p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1806p = this.n.getViewTreeObserver();
            }
            this.f1806p.removeGlobalOnLayoutListener(this.j);
            this.f1806p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.f1803l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void r(View view) {
        this.f1804m = view;
    }

    public void t(boolean z11) {
        this.f1797d.d(z11);
    }

    public void u(int i11) {
        this.t = i11;
    }

    public void v(int i11) {
        this.f1802i.l(i11);
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f1803l = onDismissListener;
    }

    public void x(boolean z11) {
        this.f1809u = z11;
    }

    public void y(int i11) {
        this.f1802i.e(i11);
    }
}
