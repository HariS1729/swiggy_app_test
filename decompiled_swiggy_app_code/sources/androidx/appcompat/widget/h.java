package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.core.view.a0;
import androidx.core.view.c;
import androidx.core.view.v;
import androidx.core.widget.l;
import androidx.core.widget.m;
import s2.a;
import s2.b;

/* compiled from: AppCompatEditText */
public class h extends EditText implements v {

    /* renamed from: a  reason: collision with root package name */
    private final d f2150a;

    /* renamed from: b  reason: collision with root package name */
    private final s f2151b;

    /* renamed from: c  reason: collision with root package name */
    private final r f2152c;

    /* renamed from: d  reason: collision with root package name */
    private final m f2153d;

    public h(Context context) {
        this(context, (AttributeSet) null);
    }

    public c a(c cVar) {
        return this.f2153d.a(this, cVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2150a;
        if (dVar != null) {
            dVar.b();
        }
        s sVar = this.f2151b;
        if (sVar != null) {
            sVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2150a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2150a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f2152c) == null) {
            return super.getTextClassifier();
        }
        return rVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2151b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a11 = i.a(onCreateInputConnection, editorInfo, this);
        String[] I = a0.I(this);
        if (a11 == null || I == null) {
            return a11;
        }
        a.d(editorInfo, I);
        return b.a(a11, editorInfo, o.a(this));
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (o.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i11) {
        if (o.c(this, i11)) {
            return true;
        }
        return super.onTextContextMenuItem(i11);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2150a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f2150a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2150a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2150a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        s sVar = this.f2151b;
        if (sVar != null) {
            sVar.q(context, i11);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f2152c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            rVar.b(textClassifier);
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public h(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        j0.a(this, getContext());
        d dVar = new d(this);
        this.f2150a = dVar;
        dVar.e(attributeSet, i11);
        s sVar = new s(this);
        this.f2151b = sVar;
        sVar.m(attributeSet, i11);
        sVar.b();
        this.f2152c = new r(this);
        this.f2153d = new m();
    }
}
