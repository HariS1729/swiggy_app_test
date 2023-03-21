package androidx.core.view;

import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat */
public final class h {

    /* compiled from: MarginLayoutParamsCompat */
    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.resolveLayoutDirection(i11);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.setLayoutDirection(i11);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.setMarginEnd(i11);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.setMarginStart(i11);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        a.e(marginLayoutParams, i11);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        a.g(marginLayoutParams, i11);
    }

    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        a.h(marginLayoutParams, i11);
    }
}
