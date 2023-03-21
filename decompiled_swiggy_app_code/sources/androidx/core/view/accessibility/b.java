package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat */
public final class b {

    /* compiled from: AccessibilityEventCompat */
    static class a {
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        static void b(AccessibilityEvent accessibilityEvent, int i11) {
            accessibilityEvent.setContentChangeTypes(i11);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i11) {
        a.b(accessibilityEvent, i11);
    }
}
