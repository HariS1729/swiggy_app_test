package y3;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.b0;
import androidx.transition.h0;

/* compiled from: CircularPropagation */
public class b extends f {

    /* renamed from: b  reason: collision with root package name */
    private float f18017b = 3.0f;

    private static float h(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        return (float) Math.sqrt((double) ((f15 * f15) + (f16 * f16)));
    }

    public long c(ViewGroup viewGroup, b0 b0Var, h0 h0Var, h0 h0Var2) {
        int i11;
        int i12;
        int i13;
        if (h0Var == null && h0Var2 == null) {
            return 0;
        }
        if (h0Var2 == null || e(h0Var) == 0) {
            i11 = -1;
        } else {
            h0Var = h0Var2;
            i11 = 1;
        }
        int f11 = f(h0Var);
        int g11 = g(h0Var);
        Rect C = b0Var.C();
        if (C != null) {
            i13 = C.centerX();
            i12 = C.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i12 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i13 = round;
        }
        float h11 = h((float) f11, (float) g11, (float) i13, (float) i12) / h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long B = b0Var.B();
        if (B < 0) {
            B = 300;
        }
        return (long) Math.round((((float) (B * ((long) i11))) / this.f18017b) * h11);
    }
}
