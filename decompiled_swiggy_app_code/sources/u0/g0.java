package u0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ColorMatrix.kt */
public final class g0 {
    public static float[] a(float[] fArr) {
        p.j(fArr, "values");
        return fArr;
    }

    public static /* synthetic */ float[] b(float[] fArr, int i11, i iVar) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return a(fArr);
    }

    public static final void c(float[] fArr) {
        g.u(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    public static final void d(float[] fArr, float f11) {
        c(fArr);
        float f12 = ((float) 1) - f11;
        float f13 = 0.213f * f12;
        float f14 = 0.715f * f12;
        float f15 = f12 * 0.072f;
        fArr[0] = f13 + f11;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[5] = f13;
        fArr[6] = f14 + f11;
        fArr[7] = f15;
        fArr[10] = f13;
        fArr[11] = f14;
        fArr[12] = f15 + f11;
    }
}
