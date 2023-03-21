package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import androidx.core.view.a0;
import androidx.core.widget.g;
import f.a;

/* compiled from: AppCompatImageHelper */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f2188a;

    /* renamed from: b  reason: collision with root package name */
    private m0 f2189b;

    /* renamed from: c  reason: collision with root package name */
    private m0 f2190c;

    /* renamed from: d  reason: collision with root package name */
    private m0 f2191d;

    public j(ImageView imageView) {
        this.f2188a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f2191d == null) {
            this.f2191d = new m0();
        }
        m0 m0Var = this.f2191d;
        m0Var.a();
        ColorStateList a11 = g.a(this.f2188a);
        if (a11 != null) {
            m0Var.f2216d = true;
            m0Var.f2213a = a11;
        }
        PorterDuff.Mode b11 = g.b(this.f2188a);
        if (b11 != null) {
            m0Var.f2215c = true;
            m0Var.f2214b = b11;
        }
        if (!m0Var.f2216d && !m0Var.f2215c) {
            return false;
        }
        g.i(drawable, m0Var, this.f2188a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 21) {
            return i11 == 21;
        }
        if (this.f2189b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f2188a.getDrawable();
        if (drawable != null) {
            x.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            m0 m0Var = this.f2190c;
            if (m0Var != null) {
                g.i(drawable, m0Var, this.f2188a.getDrawableState());
                return;
            }
            m0 m0Var2 = this.f2189b;
            if (m0Var2 != null) {
                g.i(drawable, m0Var2, this.f2188a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        m0 m0Var = this.f2190c;
        if (m0Var != null) {
            return m0Var.f2213a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        m0 m0Var = this.f2190c;
        if (m0Var != null) {
            return m0Var.f2214b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return !(this.f2188a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i11) {
        int n;
        Context context = this.f2188a.getContext();
        int[] iArr = R.styleable.AppCompatImageView;
        o0 v = o0.v(context, attributeSet, iArr, i11, 0);
        ImageView imageView = this.f2188a;
        a0.u0(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i11, 0);
        try {
            Drawable drawable = this.f2188a.getDrawable();
            if (!(drawable != null || (n = v.n(R.styleable.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.b(this.f2188a.getContext(), n)) == null)) {
                this.f2188a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                x.b(drawable);
            }
            int i12 = R.styleable.AppCompatImageView_tint;
            if (v.s(i12)) {
                g.c(this.f2188a, v.c(i12));
            }
            int i13 = R.styleable.AppCompatImageView_tintMode;
            if (v.s(i13)) {
                g.d(this.f2188a, x.e(v.k(i13, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.w();
        }
    }

    public void g(int i11) {
        if (i11 != 0) {
            Drawable b11 = a.b(this.f2188a.getContext(), i11);
            if (b11 != null) {
                x.b(b11);
            }
            this.f2188a.setImageDrawable(b11);
        } else {
            this.f2188a.setImageDrawable((Drawable) null);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f2190c == null) {
            this.f2190c = new m0();
        }
        m0 m0Var = this.f2190c;
        m0Var.f2213a = colorStateList;
        m0Var.f2216d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f2190c == null) {
            this.f2190c = new m0();
        }
        m0 m0Var = this.f2190c;
        m0Var.f2214b = mode;
        m0Var.f2215c = true;
        b();
    }
}
