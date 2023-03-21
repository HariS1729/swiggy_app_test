package a0;

import android.view.KeyEvent;
import kotlin.jvm.internal.p;

/* compiled from: TextFieldKeyInput.android.kt */
public final class q {
    public static final boolean a(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$isTypedEvent");
        return keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0;
    }
}
