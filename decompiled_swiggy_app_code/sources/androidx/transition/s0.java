package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22 */
class s0 extends r0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f12003i = true;

    s0() {
    }

    @SuppressLint({"NewApi"})
    public void f(View view, int i11, int i12, int i13, int i14) {
        if (f12003i) {
            try {
                view.setLeftTopRightBottom(i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f12003i = false;
            }
        }
    }
}
