package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19 */
class q0 extends v0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f11998e = true;

    q0() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f11998e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f11998e = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    @SuppressLint({"NewApi"})
    public void g(View view, float f11) {
        if (f11998e) {
            try {
                view.setTransitionAlpha(f11);
                return;
            } catch (NoSuchMethodError unused) {
                f11998e = false;
            }
        }
        view.setAlpha(f11);
    }
}
