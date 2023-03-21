package androidx.compose.ui.platform;

import kotlin.jvm.internal.p;

/* compiled from: InvertMatrix.kt */
public final class p0 {
    public static final boolean a(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        p.j(fArr3, "$this$invertTo");
        p.j(fArr4, "other");
        float f11 = fArr3[0];
        float f12 = fArr3[1];
        float f13 = fArr3[2];
        float f14 = fArr3[3];
        float f15 = fArr3[4];
        float f16 = fArr3[5];
        float f17 = fArr3[6];
        float f18 = fArr3[7];
        float f19 = fArr3[8];
        float f21 = fArr3[9];
        float f22 = fArr3[10];
        float f23 = fArr3[11];
        float f24 = fArr3[12];
        float f25 = fArr3[13];
        float f26 = fArr3[14];
        float f27 = fArr3[15];
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f11 * f17) - (f13 * f15);
        float f31 = (f11 * f18) - (f14 * f15);
        float f32 = (f12 * f17) - (f13 * f16);
        float f33 = (f12 * f18) - (f14 * f16);
        float f34 = (f13 * f18) - (f14 * f17);
        float f35 = (f19 * f25) - (f21 * f24);
        float f36 = (f19 * f26) - (f22 * f24);
        float f37 = (f19 * f27) - (f23 * f24);
        float f38 = (f21 * f26) - (f22 * f25);
        float f39 = (f21 * f27) - (f23 * f25);
        float f41 = (f22 * f27) - (f23 * f26);
        float f42 = (((((f28 * f41) - (f29 * f39)) + (f31 * f38)) + (f32 * f37)) - (f33 * f36)) + (f34 * f35);
        if (f42 == 0.0f) {
            return false;
        }
        float f43 = 1.0f / f42;
        fArr4[0] = (((f16 * f41) - (f17 * f39)) + (f18 * f38)) * f43;
        fArr4[1] = ((((-f12) * f41) + (f13 * f39)) - (f14 * f38)) * f43;
        fArr4[2] = (((f25 * f34) - (f26 * f33)) + (f27 * f32)) * f43;
        fArr4[3] = ((((-f21) * f34) + (f22 * f33)) - (f23 * f32)) * f43;
        float f44 = -f15;
        fArr4[4] = (((f44 * f41) + (f17 * f37)) - (f18 * f36)) * f43;
        fArr4[5] = (((f41 * f11) - (f13 * f37)) + (f14 * f36)) * f43;
        float f45 = -f24;
        fArr4[6] = (((f45 * f34) + (f26 * f31)) - (f27 * f29)) * f43;
        fArr4[7] = (((f34 * f19) - (f22 * f31)) + (f23 * f29)) * f43;
        fArr4[8] = (((f15 * f39) - (f16 * f37)) + (f18 * f35)) * f43;
        fArr4[9] = ((((-f11) * f39) + (f37 * f12)) - (f14 * f35)) * f43;
        fArr4[10] = (((f24 * f33) - (f25 * f31)) + (f27 * f28)) * f43;
        fArr4[11] = ((((-f19) * f33) + (f31 * f21)) - (f23 * f28)) * f43;
        fArr4[12] = (((f44 * f38) + (f16 * f36)) - (f17 * f35)) * f43;
        fArr4[13] = (((f11 * f38) - (f12 * f36)) + (f13 * f35)) * f43;
        fArr4[14] = (((f45 * f32) + (f25 * f29)) - (f26 * f28)) * f43;
        fArr4[15] = (((f19 * f32) - (f21 * f29)) + (f22 * f28)) * f43;
        return true;
    }
}
