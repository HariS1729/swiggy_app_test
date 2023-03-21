package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* compiled from: AccessibilityRecordCompat */
public class e {

    /* compiled from: AccessibilityRecordCompat */
    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i11) {
            accessibilityRecord.setMaxScrollX(i11);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i11) {
            accessibilityRecord.setMaxScrollY(i11);
        }
    }

    /* compiled from: AccessibilityRecordCompat */
    static class b {
        static void a(AccessibilityRecord accessibilityRecord, View view, int i11) {
            accessibilityRecord.setSource(view, i11);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i11) {
        a.c(accessibilityRecord, i11);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i11) {
        a.d(accessibilityRecord, i11);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i11) {
        b.a(accessibilityRecord, view, i11);
    }
}
