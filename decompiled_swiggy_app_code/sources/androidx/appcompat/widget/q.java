package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.a;
import androidx.core.view.a0;

/* compiled from: AppCompatSeekBarHelper */
class q extends m {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f2242d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f2243e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f2244f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f2245g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2246h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2247i = false;

    q(SeekBar seekBar) {
        super(seekBar);
        this.f2242d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f2243e;
        if (drawable == null) {
            return;
        }
        if (this.f2246h || this.f2247i) {
            Drawable r11 = a.r(drawable.mutate());
            this.f2243e = r11;
            if (this.f2246h) {
                a.o(r11, this.f2244f);
            }
            if (this.f2247i) {
                a.p(this.f2243e, this.f2245g);
            }
            if (this.f2243e.isStateful()) {
                this.f2243e.setState(this.f2242d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i11) {
        super.c(attributeSet, i11);
        Context context = this.f2242d.getContext();
        int[] iArr = R.styleable.AppCompatSeekBar;
        o0 v = o0.v(context, attributeSet, iArr, i11, 0);
        SeekBar seekBar = this.f2242d;
        a0.u0(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i11, 0);
        Drawable h11 = v.h(R.styleable.AppCompatSeekBar_android_thumb);
        if (h11 != null) {
            this.f2242d.setThumb(h11);
        }
        j(v.g(R.styleable.AppCompatSeekBar_tickMark));
        int i12 = R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (v.s(i12)) {
            this.f2245g = x.e(v.k(i12, -1), this.f2245g);
            this.f2247i = true;
        }
        int i13 = R.styleable.AppCompatSeekBar_tickMarkTint;
        if (v.s(i13)) {
            this.f2244f = v.c(i13);
            this.f2246h = true;
        }
        v.w();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f2243e != null) {
            int max = this.f2242d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2243e.getIntrinsicWidth();
                int intrinsicHeight = this.f2243e.getIntrinsicHeight();
                int i12 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f2243e.setBounds(-i12, -i11, i12, i11);
                float width = ((float) ((this.f2242d.getWidth() - this.f2242d.getPaddingLeft()) - this.f2242d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f2242d.getPaddingLeft(), (float) (this.f2242d.getHeight() / 2));
                for (int i13 = 0; i13 <= max; i13++) {
                    this.f2243e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f2243e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2242d.getDrawableState())) {
            this.f2242d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f2243e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f2243e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2243e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2242d);
            a.m(drawable, a0.F(this.f2242d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2242d.getDrawableState());
            }
            f();
        }
        this.f2242d.invalidate();
    }
}
