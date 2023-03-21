package androidx.emoji.widget;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import d3.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter */
final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f10188a;

    /* renamed from: b  reason: collision with root package name */
    private a.d f10189b;

    /* compiled from: EmojiInputFilter */
    private static class a extends a.d {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<TextView> f10190a;

        a(TextView textView) {
            this.f10190a = new WeakReference(textView);
        }

        public void b() {
            super.b();
            TextView textView = this.f10190a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence l11 = d3.a.a().l(textView.getText());
                int selectionStart = Selection.getSelectionStart(l11);
                int selectionEnd = Selection.getSelectionEnd(l11);
                textView.setText(l11);
                if (l11 instanceof Spannable) {
                    d.b((Spannable) l11, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f10188a = textView;
    }

    private a.d a() {
        if (this.f10189b == null) {
            this.f10189b = new a(this.f10188a);
        }
        return this.f10189b;
    }

    static void b(Spannable spannable, int i11, int i12) {
        if (i11 >= 0 && i12 >= 0) {
            Selection.setSelection(spannable, i11, i12);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        } else if (i12 >= 0) {
            Selection.setSelection(spannable, i12);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        if (this.f10188a.isInEditMode()) {
            return charSequence;
        }
        int c11 = d3.a.a().c();
        if (c11 != 0) {
            boolean z11 = true;
            if (c11 == 1) {
                if (i14 == 0 && i13 == 0 && spanned.length() == 0 && charSequence == this.f10188a.getText()) {
                    z11 = false;
                }
                if (!z11 || charSequence == null) {
                    return charSequence;
                }
                if (!(i11 == 0 && i12 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i11, i12);
                }
                return d3.a.a().m(charSequence, 0, charSequence.length());
            } else if (c11 != 3) {
                return charSequence;
            }
        }
        d3.a.a().p(a());
        return charSequence;
    }
}
