package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.R;
import androidx.core.widget.l;
import f.a;

/* compiled from: AppCompatAutoCompleteTextView */
public class c extends AutoCompleteTextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2103c = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final d f2104a;

    /* renamed from: b  reason: collision with root package name */
    private final s f2105b;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2104a;
        if (dVar != null) {
            dVar.b();
        }
        s sVar = this.f2105b;
        if (sVar != null) {
            sVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2104a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2104a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2104a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2104a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setDropDownBackgroundResource(int i11) {
        setDropDownBackgroundDrawable(a.b(getContext(), i11));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2104a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2104a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        s sVar = this.f2105b;
        if (sVar != null) {
            sVar.q(context, i11);
        }
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        j0.a(this, getContext());
        o0 v = o0.v(getContext(), attributeSet, f2103c, i11, 0);
        if (v.s(0)) {
            setDropDownBackgroundDrawable(v.g(0));
        }
        v.w();
        d dVar = new d(this);
        this.f2104a = dVar;
        dVar.e(attributeSet, i11);
        s sVar = new s(this);
        this.f2105b = sVar;
        sVar.m(attributeSet, i11);
        sVar.b();
    }
}
