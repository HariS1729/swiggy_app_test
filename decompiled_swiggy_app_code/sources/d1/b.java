package d1;

import android.view.KeyEvent;
import kotlin.jvm.internal.p;

/* compiled from: KeyEvent.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final KeyEvent f13980a;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.f13980a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        p.j(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && p.e(keyEvent, ((b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f13980a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f13980a;
    }

    public int hashCode() {
        return d(this.f13980a);
    }

    public String toString() {
        return e(this.f13980a);
    }
}
