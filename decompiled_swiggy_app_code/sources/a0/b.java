package a0;

import android.view.KeyEvent;
import d1.c;
import d1.d;
import kotlin.jvm.internal.p;

/* compiled from: KeyEventHelpers.android.kt */
public final class b {
    public static final boolean a(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$cancelsTextSelection");
        return keyEvent.getKeyCode() == 4 && c.e(d.b(keyEvent), c.f13981a.b());
    }

    public static final void b() {
    }
}
