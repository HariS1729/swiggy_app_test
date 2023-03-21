package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d0;
import androidx.core.view.a0;
import androidx.core.view.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = R.layout.abc_cascading_menu_item_layout;
    boolean A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1692b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1693c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1694d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1695e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1696f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f1697g;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f1698h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List<d> f1699i = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new C0013b();

    /* renamed from: l  reason: collision with root package name */
    private final c0 f1700l = new c();

    /* renamed from: m  reason: collision with root package name */
    private int f1701m = 0;
    private int n = 0;

    /* renamed from: o  reason: collision with root package name */
    private View f1702o;

    /* renamed from: p  reason: collision with root package name */
    View f1703p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1704r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1705s;
    private int t;

    /* renamed from: u  reason: collision with root package name */
    private int f1706u;
    private boolean v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1707w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f1708x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f1709y;

    /* renamed from: z  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1710z;

    /* compiled from: CascadingMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (b.this.b() && b.this.f1699i.size() > 0 && !b.this.f1699i.get(0).f1718a.A()) {
                View view = b.this.f1703p;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f1699i) {
                    dVar.f1718a.a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    class C0013b implements View.OnAttachStateChangeListener {
        C0013b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f1709y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f1709y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f1709y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    class c implements c0 {

        /* compiled from: CascadingMenuPopup */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f1714a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f1715b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f1716c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f1714a = dVar;
                this.f1715b = menuItem;
                this.f1716c = eVar;
            }

            public void run() {
                d dVar = this.f1714a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f1719b.e(false);
                    b.this.A = false;
                }
                if (this.f1715b.isEnabled() && this.f1715b.hasSubMenu()) {
                    this.f1716c.N(this.f1715b, 4);
                }
            }
        }

        c() {
        }

        public void d(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.f1697g.removeCallbacksAndMessages((Object) null);
            int size = b.this.f1699i.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (eVar == b.this.f1699i.get(i11).f1719b) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                int i12 = i11 + 1;
                if (i12 < b.this.f1699i.size()) {
                    dVar = b.this.f1699i.get(i12);
                }
                b.this.f1697g.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void i(e eVar, MenuItem menuItem) {
            b.this.f1697g.removeCallbacksAndMessages(eVar);
        }
    }

    /* compiled from: CascadingMenuPopup */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f1718a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1719b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1720c;

        public d(d0 d0Var, e eVar, int i11) {
            this.f1718a = d0Var;
            this.f1719b = eVar;
            this.f1720c = i11;
        }

        public ListView a() {
            return this.f1718a.j();
        }
    }

    public b(Context context, View view, int i11, int i12, boolean z11) {
        this.f1692b = context;
        this.f1702o = view;
        this.f1694d = i11;
        this.f1695e = i12;
        this.f1696f = z11;
        this.v = false;
        this.q = F();
        Resources resources = context.getResources();
        this.f1693c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1697g = new Handler();
    }

    private d0 B() {
        d0 d0Var = new d0(this.f1692b, (AttributeSet) null, this.f1694d, this.f1695e);
        d0Var.S(this.f1700l);
        d0Var.K(this);
        d0Var.J(this);
        d0Var.C(this.f1702o);
        d0Var.F(this.n);
        d0Var.I(true);
        d0Var.H(2);
        return d0Var;
    }

    private int C(e eVar) {
        int size = this.f1699i.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (eVar == this.f1699i.get(i11).f1719b) {
                return i11;
            }
        }
        return -1;
    }

    private MenuItem D(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = eVar.getItem(i11);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(d dVar, e eVar) {
        int i11;
        d dVar2;
        int firstVisiblePosition;
        MenuItem D = D(dVar.f1719b, eVar);
        if (D == null) {
            return null;
        }
        ListView a11 = dVar.a();
        ListAdapter adapter = a11.getAdapter();
        int i12 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i11 = headerViewListAdapter.getHeadersCount();
            dVar2 = (d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (d) adapter;
            i11 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i12 >= count) {
                i12 = -1;
                break;
            } else if (D == dVar2.getItem(i12)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1 && (firstVisiblePosition = (i12 + i11) - a11.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a11.getChildCount()) {
            return a11.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return a0.F(this.f1702o) == 1 ? 0 : 1;
    }

    private int G(int i11) {
        List<d> list = this.f1699i;
        ListView a11 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a11.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1703p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            if (iArr[0] + a11.getWidth() + i11 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i11 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void H(e eVar) {
        View view;
        d dVar;
        int i11;
        int i12;
        int i13;
        LayoutInflater from = LayoutInflater.from(this.f1692b);
        d dVar2 = new d(eVar, from, this.f1696f, B);
        if (!b() && this.v) {
            dVar2.d(true);
        } else if (b()) {
            dVar2.d(h.z(eVar));
        }
        int q11 = h.q(dVar2, (ViewGroup) null, this.f1692b, this.f1693c);
        d0 B2 = B();
        B2.o(dVar2);
        B2.E(q11);
        B2.F(this.n);
        if (this.f1699i.size() > 0) {
            List<d> list = this.f1699i;
            dVar = list.get(list.size() - 1);
            view = E(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B2.T(false);
            B2.Q((Object) null);
            int G = G(q11);
            boolean z11 = G == 1;
            this.q = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B2.C(view);
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1702o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1702o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i11 = iArr2[0] - iArr[0];
                i12 = iArr2[1] - iArr[1];
            }
            if ((this.n & 5) != 5) {
                if (z11) {
                    q11 = view.getWidth();
                }
                i13 = i11 - q11;
                B2.l(i13);
                B2.L(true);
                B2.e(i12);
            } else if (!z11) {
                q11 = view.getWidth();
                i13 = i11 - q11;
                B2.l(i13);
                B2.L(true);
                B2.e(i12);
            }
            i13 = i11 + q11;
            B2.l(i13);
            B2.L(true);
            B2.e(i12);
        } else {
            if (this.f1704r) {
                B2.l(this.t);
            }
            if (this.f1705s) {
                B2.e(this.f1706u);
            }
            B2.G(p());
        }
        this.f1699i.add(new d(B2, eVar, this.q));
        B2.a();
        ListView j11 = B2.j();
        j11.setOnKeyListener(this);
        if (dVar == null && this.f1707w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, j11, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.z());
            j11.addHeaderView(frameLayout, (Object) null, false);
            B2.a();
        }
    }

    public void a() {
        if (!b()) {
            for (e H : this.f1698h) {
                H(H);
            }
            this.f1698h.clear();
            View view = this.f1702o;
            this.f1703p = view;
            if (view != null) {
                boolean z11 = this.f1709y == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1709y = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.j);
                }
                this.f1703p.addOnAttachStateChangeListener(this.k);
            }
        }
    }

    public boolean b() {
        return this.f1699i.size() > 0 && this.f1699i.get(0).f1718a.b();
    }

    public void c(e eVar, boolean z11) {
        int C = C(eVar);
        if (C >= 0) {
            int i11 = C + 1;
            if (i11 < this.f1699i.size()) {
                this.f1699i.get(i11).f1719b.e(false);
            }
            d remove = this.f1699i.remove(C);
            remove.f1719b.Q(this);
            if (this.A) {
                remove.f1718a.R((Object) null);
                remove.f1718a.D(0);
            }
            remove.f1718a.dismiss();
            int size = this.f1699i.size();
            if (size > 0) {
                this.q = this.f1699i.get(size - 1).f1720c;
            } else {
                this.q = F();
            }
            if (size == 0) {
                dismiss();
                j.a aVar = this.f1708x;
                if (aVar != null) {
                    aVar.c(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1709y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1709y.removeGlobalOnLayoutListener(this.j);
                    }
                    this.f1709y = null;
                }
                this.f1703p.removeOnAttachStateChangeListener(this.k);
                this.f1710z.onDismiss();
            } else if (z11) {
                this.f1699i.get(0).f1719b.e(false);
            }
        }
    }

    public void dismiss() {
        int size = this.f1699i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1699i.toArray(new d[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                d dVar = dVarArr[i11];
                if (dVar.f1718a.b()) {
                    dVar.f1718a.dismiss();
                }
            }
        }
    }

    public Parcelable e() {
        return null;
    }

    public void f(boolean z11) {
        for (d a11 : this.f1699i) {
            h.A(a11.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public ListView j() {
        if (this.f1699i.isEmpty()) {
            return null;
        }
        List<d> list = this.f1699i;
        return list.get(list.size() - 1).a();
    }

    public void k(j.a aVar) {
        this.f1708x = aVar;
    }

    public void l(Parcelable parcelable) {
    }

    public boolean m(m mVar) {
        for (d next : this.f1699i) {
            if (mVar == next.f1719b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.f1708x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    public void n(e eVar) {
        eVar.c(this, this.f1692b);
        if (b()) {
            H(eVar);
        } else {
            this.f1698h.add(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return false;
    }

    public void onDismiss() {
        d dVar;
        int size = this.f1699i.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1699i.get(i11);
            if (!dVar.f1718a.b()) {
                break;
            }
            i11++;
        }
        if (dVar != null) {
            dVar.f1719b.e(false);
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
        if (this.f1702o != view) {
            this.f1702o = view;
            this.n = e.b(this.f1701m, a0.F(view));
        }
    }

    public void t(boolean z11) {
        this.v = z11;
    }

    public void u(int i11) {
        if (this.f1701m != i11) {
            this.f1701m = i11;
            this.n = e.b(i11, a0.F(this.f1702o));
        }
    }

    public void v(int i11) {
        this.f1704r = true;
        this.t = i11;
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f1710z = onDismissListener;
    }

    public void x(boolean z11) {
        this.f1707w = z11;
    }

    public void y(int i11) {
        this.f1705s = true;
        this.f1706u = i11;
    }
}
