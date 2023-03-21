package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.a0;
import androidx.core.view.e;

/* compiled from: MenuPopupHelper */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1784a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1785b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1786c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1787d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1788e;

    /* renamed from: f  reason: collision with root package name */
    private View f1789f;

    /* renamed from: g  reason: collision with root package name */
    private int f1790g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1791h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f1792i;
    private h j;
    private PopupWindow.OnDismissListener k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1793l;

    /* compiled from: MenuPopupHelper */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z11, int i11) {
        this(context, eVar, view, z11, i11, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.h a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1784a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1784a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.R.dimen.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f1784a
            android.view.View r3 = r14.f1789f
            int r4 = r14.f1787d
            int r5 = r14.f1788e
            boolean r6 = r14.f1786c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r8 = r14.f1784a
            androidx.appcompat.view.menu.e r9 = r14.f1785b
            android.view.View r10 = r14.f1789f
            int r11 = r14.f1787d
            int r12 = r14.f1788e
            boolean r13 = r14.f1786c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.e r1 = r14.f1785b
            r0.n(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1793l
            r0.w(r1)
            android.view.View r1 = r14.f1789f
            r0.r(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f1792i
            r0.k(r1)
            boolean r1 = r14.f1791h
            r0.t(r1)
            int r1 = r14.f1790g
            r0.u(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():androidx.appcompat.view.menu.h");
    }

    private void l(int i11, int i12, boolean z11, boolean z12) {
        h c11 = c();
        c11.x(z12);
        if (z11) {
            if ((e.b(this.f1790g, a0.F(this.f1789f)) & 7) == 5) {
                i11 -= this.f1789f.getWidth();
            }
            c11.v(i11);
            c11.y(i12);
            int i13 = (int) ((this.f1784a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c11.s(new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13));
        }
        c11.a();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public h c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        h hVar = this.j;
        return hVar != null && hVar.b();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1789f = view;
    }

    public void g(boolean z11) {
        this.f1791h = z11;
        h hVar = this.j;
        if (hVar != null) {
            hVar.t(z11);
        }
    }

    public void h(int i11) {
        this.f1790g = i11;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1792i = aVar;
        h hVar = this.j;
        if (hVar != null) {
            hVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1789f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i11, int i12) {
        if (d()) {
            return true;
        }
        if (this.f1789f == null) {
            return false;
        }
        l(i11, i12, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z11, int i11, int i12) {
        this.f1790g = 8388611;
        this.f1793l = new a();
        this.f1784a = context;
        this.f1785b = eVar;
        this.f1789f = view;
        this.f1786c = z11;
        this.f1787d = i11;
        this.f1788e = i12;
    }
}
