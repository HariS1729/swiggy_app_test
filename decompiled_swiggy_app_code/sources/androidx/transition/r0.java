package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
class r0 extends q0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f11999f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f12000g = true;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f12001h = true;

    r0() {
    }

    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (f11999f) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f11999f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f12000g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f12000g = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void j(View view, Matrix matrix) {
        if (f12001h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f12001h = false;
            }
        }
    }
}
