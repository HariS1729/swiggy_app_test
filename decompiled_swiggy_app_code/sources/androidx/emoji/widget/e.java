package androidx.emoji.widget;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import d3.a;

/* compiled from: EmojiKeyListener */
final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f10191a;

    e(KeyListener keyListener) {
        this.f10191a = keyListener;
    }

    public void clearMetaKeyState(View view, Editable editable, int i11) {
        this.f10191a.clearMetaKeyState(view, editable, i11);
    }

    public int getInputType() {
        return this.f10191a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
        return a.e(editable, i11, keyEvent) || this.f10191a.onKeyDown(view, editable, i11, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f10191a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
        return this.f10191a.onKeyUp(view, editable, i11, keyEvent);
    }
}
