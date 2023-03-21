package u0;

import kotlin.jvm.internal.p;

/* compiled from: Matrix.kt */
public final class q0 {
    public static final boolean a(float[] fArr) {
        p.j(fArr, "$this$isIdentity");
        int i11 = 0;
        while (i11 < 4) {
            int i12 = 0;
            while (i12 < 4) {
                if (!(fArr[(i11 * 4) + i12] == (i11 == i12 ? 1.0f : 0.0f))) {
                    return false;
                }
                i12++;
            }
            i11++;
        }
        return true;
    }
}
