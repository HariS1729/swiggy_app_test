package w2;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ViewBindingAdapter */
public class f {
    private static int a(float f11) {
        int i11 = (int) (0.5f + f11);
        if (i11 != 0) {
            return i11;
        }
        int i12 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i12 == 0) {
            return 0;
        }
        return i12 > 0 ? 1 : -1;
    }

    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void c(View view, float f11) {
        int a11 = a(f11);
        view.setPadding(a11, a11, a11, a11);
    }

    public static void d(View view, float f11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f11));
    }

    public static void e(View view, float f11) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f11), view.getPaddingBottom());
    }

    public static void f(View view, float f11) {
        view.setPadding(a(f11), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void g(View view, float f11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f11), view.getPaddingBottom());
    }

    public static void h(View view, float f11) {
        view.setPaddingRelative(a(f11), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static void i(View view, float f11) {
        view.setPadding(view.getPaddingLeft(), a(f11), view.getPaddingRight(), view.getPaddingBottom());
    }
}
