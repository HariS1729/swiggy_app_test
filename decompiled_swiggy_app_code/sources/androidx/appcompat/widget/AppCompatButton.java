package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R;
import androidx.core.widget.b;
import androidx.core.widget.l;
import androidx.core.widget.n;

public class AppCompatButton extends Button implements b, n {

    /* renamed from: a  reason: collision with root package name */
    private final d f1888a;

    /* renamed from: b  reason: collision with root package name */
    private final s f1889b;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1888a;
        if (dVar != null) {
            dVar.b();
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.Z) {
            return super.getAutoSizeMaxTextSize();
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            return sVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.Z) {
            return super.getAutoSizeMinTextSize();
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            return sVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.Z) {
            return super.getAutoSizeStepGranularity();
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            return sVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.Z) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s sVar = this.f1889b;
        return sVar != null ? sVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.Z) {
            s sVar = this.f1889b;
            if (sVar != null) {
                return sVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1888a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1888a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1889b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1889b.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.o(z11, i11, i12, i13, i14);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        s sVar = this.f1889b;
        if (sVar != null && !b.Z && sVar.l()) {
            this.f1889b.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (b.Z) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.t(i11, i12, i13, i14);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i11) throws IllegalArgumentException {
        if (b.Z) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.u(iArr, i11);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (b.Z) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.v(i11);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1888a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1888a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setSupportAllCaps(boolean z11) {
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.s(z11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1888a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1888a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1889b.w(colorStateList);
        this.f1889b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1889b.x(mode);
        this.f1889b.b();
    }

    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.q(context, i11);
        }
    }

    public void setTextSize(int i11, float f11) {
        if (b.Z) {
            super.setTextSize(i11, f11);
            return;
        }
        s sVar = this.f1889b;
        if (sVar != null) {
            sVar.A(i11, f11);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        j0.a(this, getContext());
        d dVar = new d(this);
        this.f1888a = dVar;
        dVar.e(attributeSet, i11);
        s sVar = new s(this);
        this.f1889b = sVar;
        sVar.m(attributeSet, i11);
        sVar.b();
    }
}
