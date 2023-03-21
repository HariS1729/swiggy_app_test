package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.a0;

/* compiled from: AppCompatBackgroundHelper */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f2106a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2107b;

    /* renamed from: c  reason: collision with root package name */
    private int f2108c = -1;

    /* renamed from: d  reason: collision with root package name */
    private m0 f2109d;

    /* renamed from: e  reason: collision with root package name */
    private m0 f2110e;

    /* renamed from: f  reason: collision with root package name */
    private m0 f2111f;

    d(View view) {
        this.f2106a = view;
        this.f2107b = g.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f2111f == null) {
            this.f2111f = new m0();
        }
        m0 m0Var = this.f2111f;
        m0Var.a();
        ColorStateList v = a0.v(this.f2106a);
        if (v != null) {
            m0Var.f2216d = true;
            m0Var.f2213a = v;
        }
        PorterDuff.Mode w11 = a0.w(this.f2106a);
        if (w11 != null) {
            m0Var.f2215c = true;
            m0Var.f2214b = w11;
        }
        if (!m0Var.f2216d && !m0Var.f2215c) {
            return false;
        }
        g.i(drawable, m0Var, this.f2106a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 21) {
            return i11 == 21;
        }
        if (this.f2109d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f2106a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            m0 m0Var = this.f2110e;
            if (m0Var != null) {
                g.i(background, m0Var, this.f2106a.getDrawableState());
                return;
            }
            m0 m0Var2 = this.f2109d;
            if (m0Var2 != null) {
                g.i(background, m0Var2, this.f2106a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        m0 m0Var = this.f2110e;
        if (m0Var != null) {
            return m0Var.f2213a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        m0 m0Var = this.f2110e;
        if (m0Var != null) {
            return m0Var.f2214b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i11) {
        Context context = this.f2106a.getContext();
        int[] iArr = R.styleable.ViewBackgroundHelper;
        o0 v = o0.v(context, attributeSet, iArr, i11, 0);
        View view = this.f2106a;
        a0.u0(view, view.getContext(), iArr, attributeSet, v.r(), i11, 0);
        try {
            int i12 = R.styleable.ViewBackgroundHelper_android_background;
            if (v.s(i12)) {
                this.f2108c = v.n(i12, -1);
                ColorStateList f11 = this.f2107b.f(this.f2106a.getContext(), this.f2108c);
                if (f11 != null) {
                    h(f11);
                }
            }
            int i13 = R.styleable.ViewBackgroundHelper_backgroundTint;
            if (v.s(i13)) {
                a0.B0(this.f2106a, v.c(i13));
            }
            int i14 = R.styleable.ViewBackgroundHelper_backgroundTintMode;
            if (v.s(i14)) {
                a0.C0(this.f2106a, x.e(v.k(i14, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.w();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f2108c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i11) {
        this.f2108c = i11;
        g gVar = this.f2107b;
        h(gVar != null ? gVar.f(this.f2106a.getContext(), i11) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2109d == null) {
                this.f2109d = new m0();
            }
            m0 m0Var = this.f2109d;
            m0Var.f2213a = colorStateList;
            m0Var.f2216d = true;
        } else {
            this.f2109d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f2110e == null) {
            this.f2110e = new m0();
        }
        m0 m0Var = this.f2110e;
        m0Var.f2213a = colorStateList;
        m0Var.f2216d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f2110e == null) {
            this.f2110e = new m0();
        }
        m0 m0Var = this.f2110e;
        m0Var.f2214b = mode;
        m0Var.f2215c = true;
        b();
    }
}
