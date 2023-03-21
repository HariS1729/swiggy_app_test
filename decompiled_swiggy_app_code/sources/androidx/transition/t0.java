package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23 */
class t0 extends s0 {
    private static boolean j = true;

    t0() {
    }

    @SuppressLint({"NewApi"})
    public void h(View view, int i11) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i11);
        } else if (j) {
            try {
                view.setTransitionVisibility(i11);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
