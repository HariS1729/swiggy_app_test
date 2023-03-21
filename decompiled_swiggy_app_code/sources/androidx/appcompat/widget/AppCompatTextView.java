package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.e;
import androidx.core.text.c;
import androidx.core.widget.b;
import androidx.core.widget.l;
import androidx.core.widget.n;
import f.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements n, b {

    /* renamed from: a  reason: collision with root package name */
    private final d f1922a;

    /* renamed from: b  reason: collision with root package name */
    private final s f1923b;

    /* renamed from: c  reason: collision with root package name */
    private final r f1924c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1925d;

    /* renamed from: e  reason: collision with root package name */
    private Future<c> f1926e;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void d() {
        Future<c> future = this.f1926e;
        if (future != null) {
            try {
                this.f1926e = null;
                l.n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1922a;
        if (dVar != null) {
            dVar.b();
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.Z) {
            return super.getAutoSizeMaxTextSize();
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            return sVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.Z) {
            return super.getAutoSizeMinTextSize();
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            return sVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.Z) {
            return super.getAutoSizeStepGranularity();
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            return sVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.Z) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s sVar = this.f1923b;
        return sVar != null ? sVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.Z) {
            s sVar = this.f1923b;
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

    public int getFirstBaselineToTopHeight() {
        return l.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return l.c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1922a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1922a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1923b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1923b.k();
    }

    public CharSequence getText() {
        d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f1924c) == null) {
            return super.getTextClassifier();
        }
        return rVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return l.g(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1923b.r(this, onCreateInputConnection, editorInfo);
        return i.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.o(z11, i11, i12, i13, i14);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        d();
        super.onMeasure(i11, i12);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        s sVar = this.f1923b;
        if (sVar != null && !b.Z && sVar.l()) {
            this.f1923b.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (b.Z) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.t(i11, i12, i13, i14);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i11) throws IllegalArgumentException {
        if (b.Z) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.u(iArr, i11);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (b.Z) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.v(i11);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1922a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1922a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i11);
        } else {
            l.k(this, i11);
        }
    }

    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i11);
        } else {
            l.l(this, i11);
        }
    }

    public void setLineHeight(int i11) {
        l.m(this, i11);
    }

    public void setPrecomputedText(c cVar) {
        l.n(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1922a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1922a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1923b.w(colorStateList);
        this.f1923b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1923b.x(mode);
        this.f1923b.b();
    }

    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.q(context, i11);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f1924c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            rVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<c> future) {
        this.f1926e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        l.p(this, aVar);
    }

    public void setTextSize(int i11, float f11) {
        if (b.Z) {
            super.setTextSize(i11, f11);
            return;
        }
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.A(i11, f11);
        }
    }

    public void setTypeface(Typeface typeface, int i11) {
        if (!this.f1925d) {
            Typeface typeface2 = null;
            if (typeface != null && i11 > 0) {
                typeface2 = e.a(getContext(), typeface, i11);
            }
            this.f1925d = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i11);
            } finally {
                this.f1925d = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        this.f1925d = false;
        j0.a(this, getContext());
        d dVar = new d(this);
        this.f1922a = dVar;
        dVar.e(attributeSet, i11);
        s sVar = new s(this);
        this.f1923b = sVar;
        sVar.m(attributeSet, i11);
        sVar.b();
        this.f1924c = new r(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        Drawable b13 = i13 != 0 ? a.b(context, i13) : null;
        if (i14 != 0) {
            drawable = a.b(context, i14);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b11, b12, b13, drawable);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        Drawable b13 = i13 != 0 ? a.b(context, i13) : null;
        if (i14 != 0) {
            drawable = a.b(context, i14);
        }
        setCompoundDrawablesWithIntrinsicBounds(b11, b12, b13, drawable);
        s sVar = this.f1923b;
        if (sVar != null) {
            sVar.p();
        }
    }
}
