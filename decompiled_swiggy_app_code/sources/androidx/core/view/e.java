package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: GravityCompat */
public final class e {

    /* compiled from: GravityCompat */
    static class a {
        static void a(int i11, int i12, int i13, Rect rect, int i14, int i15, Rect rect2, int i16) {
            Gravity.apply(i11, i12, i13, rect, i14, i15, rect2, i16);
        }

        static void b(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
            Gravity.apply(i11, i12, i13, rect, rect2, i14);
        }

        static void c(int i11, Rect rect, Rect rect2, int i12) {
            Gravity.applyDisplay(i11, rect, rect2, i12);
        }
    }

    public static void a(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
        a.b(i11, i12, i13, rect, rect2, i14);
    }

    public static int b(int i11, int i12) {
        return Gravity.getAbsoluteGravity(i11, i12);
    }
}
