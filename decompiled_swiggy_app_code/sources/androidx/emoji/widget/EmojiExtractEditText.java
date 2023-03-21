package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.widget.l;
import e3.a;

public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: a  reason: collision with root package name */
    private a f10177a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10178b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 16842862, 0);
    }

    private void a(AttributeSet attributeSet, int i11, int i12) {
        if (!this.f10178b) {
            this.f10178b = true;
            setMaxEmojiCount(new a(this, attributeSet, i11, i12).a());
            setKeyListener(super.getKeyListener());
        }
    }

    private a getEmojiEditTextHelper() {
        if (this.f10177a == null) {
            this.f10177a = new a(this);
        }
        return this.f10177a;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().a();
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().c();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setEmojiReplaceStrategy(int i11) {
        getEmojiEditTextHelper().e(i11);
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().b(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i11) {
        getEmojiEditTextHelper().f(i11);
    }
}
