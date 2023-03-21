package androidx.emoji.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import d3.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher */
final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f10195a;

    /* renamed from: b  reason: collision with root package name */
    private a.d f10196b;

    /* renamed from: c  reason: collision with root package name */
    private int f10197c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f10198d = 0;

    /* compiled from: EmojiTextWatcher */
    private static class a extends a.d {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f10199a;

        a(EditText editText) {
            this.f10199a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            EditText editText = this.f10199a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                d3.a.a().l(editableText);
                d.b(editableText, selectionStart, selectionEnd);
            }
        }
    }

    g(EditText editText) {
        this.f10195a = editText;
    }

    private a.d a() {
        if (this.f10196b == null) {
            this.f10196b = new a(this.f10195a);
        }
        return this.f10196b;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public void b(int i11) {
        this.f10198d = i11;
    }

    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: package-private */
    public void c(int i11) {
        this.f10197c = i11;
    }

    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        if (!this.f10195a.isInEditMode() && i12 <= i13 && (charSequence instanceof Spannable)) {
            int c11 = d3.a.a().c();
            if (c11 != 0) {
                if (c11 == 1) {
                    d3.a.a().o((Spannable) charSequence, i11, i11 + i13, this.f10197c, this.f10198d);
                    return;
                } else if (c11 != 3) {
                    return;
                }
            }
            d3.a.a().p(a());
        }
    }
}
