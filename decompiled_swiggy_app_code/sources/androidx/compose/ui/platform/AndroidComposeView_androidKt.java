package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.p;
import lp0.l;
import v1.a0;
import v1.u;

/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static l<? super u, ? extends a0> f7040a = AndroidComposeView_androidKt$textInputServiceFactory$1.f7041a;

    private static final float c(float[] fArr, int i11, float[] fArr2, int i12) {
        int i13 = i11 * 4;
        return (fArr[i13 + 0] * fArr2[0 + i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 3] * fArr2[12 + i12]);
    }

    public static final LayoutDirection d(Configuration configuration) {
        p.j(configuration, "<this>");
        return f(configuration.getLayoutDirection());
    }

    public static final l<u, a0> e() {
        return f7040a;
    }

    /* access modifiers changed from: private */
    public static final LayoutDirection f(int i11) {
        if (i11 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i11 != 1) {
            return LayoutDirection.Ltr;
        }
        return LayoutDirection.Rtl;
    }

    /* access modifiers changed from: private */
    public static final void g(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float c11 = c(fArr4, 0, fArr3, 0);
        float c12 = c(fArr4, 0, fArr3, 1);
        float c13 = c(fArr4, 0, fArr3, 2);
        float c14 = c(fArr4, 0, fArr3, 3);
        float c15 = c(fArr4, 1, fArr3, 0);
        float c16 = c(fArr4, 1, fArr3, 1);
        float c17 = c(fArr4, 1, fArr3, 2);
        float c18 = c(fArr4, 1, fArr3, 3);
        float c19 = c(fArr4, 2, fArr3, 0);
        float c21 = c(fArr4, 2, fArr3, 1);
        float c22 = c(fArr4, 2, fArr3, 2);
        float c23 = c(fArr4, 2, fArr3, 3);
        float c24 = c(fArr4, 3, fArr3, 0);
        float c25 = c(fArr4, 3, fArr3, 1);
        float c26 = c(fArr4, 3, fArr3, 2);
        float c27 = c(fArr4, 3, fArr3, 3);
        fArr3[0] = c11;
        fArr3[1] = c12;
        fArr3[2] = c13;
        fArr3[3] = c14;
        fArr3[4] = c15;
        fArr3[5] = c16;
        fArr3[6] = c17;
        fArr3[7] = c18;
        fArr3[8] = c19;
        fArr3[9] = c21;
        fArr3[10] = c22;
        fArr3[11] = c23;
        fArr3[12] = c24;
        fArr3[13] = c25;
        fArr3[14] = c26;
        fArr3[15] = c27;
    }
}
