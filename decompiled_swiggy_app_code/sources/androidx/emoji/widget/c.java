package androidx.emoji.widget;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import d3.a;

/* compiled from: EmojiInputConnection */
final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f10187a;

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f10187a = textView;
        a.a().q(editorInfo);
    }

    private Editable a() {
        return this.f10187a.getEditableText();
    }

    public boolean deleteSurroundingText(int i11, int i12) {
        if (a.d(this, a(), i11, i12, false) || super.deleteSurroundingText(i11, i12)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        if (a.d(this, a(), i11, i12, true) || super.deleteSurroundingTextInCodePoints(i11, i12)) {
            return true;
        }
        return false;
    }
}
