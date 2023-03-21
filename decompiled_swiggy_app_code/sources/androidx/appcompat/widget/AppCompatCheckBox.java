package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.R;
import f.a;

public class AppCompatCheckBox extends CheckBox {

    /* renamed from: a  reason: collision with root package name */
    private final f f1890a;

    /* renamed from: b  reason: collision with root package name */
    private final d f1891b;

    /* renamed from: c  reason: collision with root package name */
    private final s f1892c;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1891b;
        if (dVar != null) {
            dVar.b();
        }
        s sVar = this.f1892c;
        if (sVar != null) {
            sVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        f fVar = this.f1890a;
        return fVar != null ? fVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1891b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1891b;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        f fVar = this.f1890a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f fVar = this.f1890a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1891b;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1891b;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f fVar = this.f1890a;
        if (fVar != null) {
            fVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1891b;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1891b;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f fVar = this.f1890a;
        if (fVar != null) {
            fVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1890a;
        if (fVar != null) {
            fVar.h(mode);
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        j0.a(this, getContext());
        f fVar = new f(this);
        this.f1890a = fVar;
        fVar.e(attributeSet, i11);
        d dVar = new d(this);
        this.f1891b = dVar;
        dVar.e(attributeSet, i11);
        s sVar = new s(this);
        this.f1892c = sVar;
        sVar.m(attributeSet, i11);
    }

    public void setButtonDrawable(int i11) {
        setButtonDrawable(a.b(getContext(), i11));
    }
}
