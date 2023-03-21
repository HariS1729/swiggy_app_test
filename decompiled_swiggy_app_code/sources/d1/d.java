package d1;

import android.view.KeyEvent;
import kotlin.jvm.internal.p;

/* compiled from: KeyEvent.android.kt */
public final class d {
    public static final long a(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$key");
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action == 0) {
            return c.f13981a.a();
        }
        if (action != 1) {
            return c.f13981a.c();
        }
        return c.f13981a.b();
    }

    public static final int c(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$utf16CodePoint");
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
