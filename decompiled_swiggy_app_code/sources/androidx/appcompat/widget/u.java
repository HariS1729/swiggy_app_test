package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton */
public class u extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    private final d f2300a;

    /* renamed from: b  reason: collision with root package name */
    private final s f2301b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2300a;
        if (dVar != null) {
            dVar.b();
        }
        s sVar = this.f2301b;
        if (sVar != null) {
            sVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2300a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2300a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2300a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2300a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2300a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2300a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public u(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j0.a(this, getContext());
        d dVar = new d(this);
        this.f2300a = dVar;
        dVar.e(attributeSet, i11);
        s sVar = new s(this);
        this.f2301b = sVar;
        sVar.m(attributeSet, i11);
    }
}
