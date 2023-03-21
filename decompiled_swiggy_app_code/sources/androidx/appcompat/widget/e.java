package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.l;
import f.a;

/* compiled from: AppCompatCheckedTextView */
public class e extends CheckedTextView {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f2115b = {16843016};

    /* renamed from: a  reason: collision with root package name */
    private final s f2116a;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f2116a;
        if (sVar != null) {
            sVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(a.b(getContext(), i11));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        s sVar = this.f2116a;
        if (sVar != null) {
            sVar.q(context, i11);
        }
    }

    public e(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        j0.a(this, getContext());
        s sVar = new s(this);
        this.f2116a = sVar;
        sVar.m(attributeSet, i11);
        sVar.b();
        o0 v = o0.v(getContext(), attributeSet, f2115b, i11, 0);
        setCheckMarkDrawable(v.g(0));
        v.w();
    }
}
