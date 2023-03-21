package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.a0;

/* compiled from: ViewUtils */
class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final v0 f11995a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f11996b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    static final Property<View, Rect> f11997c = new b(Rect.class, "clipBounds");

    /* compiled from: ViewUtils */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(p0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f11) {
            p0.h(view, f11.floatValue());
        }
    }

    /* compiled from: ViewUtils */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return a0.x(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            a0.D0(view, rect);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f11995a = new u0();
        } else if (i11 >= 23) {
            f11995a = new t0();
        } else if (i11 >= 22) {
            f11995a = new s0();
        } else {
            f11995a = new r0();
        }
    }

    static void a(View view) {
        f11995a.a(view);
    }

    static o0 b(View view) {
        return new n0(view);
    }

    static float c(View view) {
        return f11995a.c(view);
    }

    static y0 d(View view) {
        return new x0(view);
    }

    static void e(View view) {
        f11995a.d(view);
    }

    static void f(View view, Matrix matrix) {
        f11995a.e(view, matrix);
    }

    static void g(View view, int i11, int i12, int i13, int i14) {
        f11995a.f(view, i11, i12, i13, i14);
    }

    static void h(View view, float f11) {
        f11995a.g(view, f11);
    }

    static void i(View view, int i11) {
        f11995a.h(view, i11);
    }

    static void j(View view, Matrix matrix) {
        f11995a.i(view, matrix);
    }

    static void k(View view, Matrix matrix) {
        f11995a.j(view, matrix);
    }
}
