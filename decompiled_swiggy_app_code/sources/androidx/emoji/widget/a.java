package androidx.emoji.widget;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.g;

/* compiled from: EmojiEditTextHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f10179a;

    /* renamed from: b  reason: collision with root package name */
    private int f10180b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private int f10181c = 0;

    /* renamed from: androidx.emoji.widget.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiEditTextHelper */
    private static class C0058a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f10182a;

        /* renamed from: b  reason: collision with root package name */
        private final g f10183b;

        C0058a(EditText editText) {
            this.f10182a = editText;
            g gVar = new g(editText);
            this.f10183b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            return new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f10182a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void c(int i11) {
            this.f10183b.b(i11);
        }

        /* access modifiers changed from: package-private */
        public void d(int i11) {
            this.f10183b.c(i11);
        }
    }

    /* compiled from: EmojiEditTextHelper */
    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i11) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void d(int i11) {
            throw null;
        }
    }

    public a(EditText editText) {
        g.h(editText, "editText cannot be null");
        this.f10179a = new C0058a(editText);
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f10181c;
    }

    public KeyListener b(KeyListener keyListener) {
        g.h(keyListener, "keyListener cannot be null");
        return this.f10179a.a(keyListener);
    }

    public int c() {
        return this.f10180b;
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f10179a.b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    public void e(int i11) {
        this.f10181c = i11;
        this.f10179a.c(i11);
    }

    public void f(int i11) {
        g.e(i11, "maxEmojiCount should be greater than 0");
        this.f10180b = i11;
        this.f10179a.d(i11);
    }
}
