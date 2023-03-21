package p;

/* compiled from: SplineBasedDecay.kt */
public final class n {
    /* access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i12;
        int i13 = i11;
        float f21 = 0.0f;
        float f22 = 0.0f;
        int i14 = 0;
        while (true) {
            float f23 = 1.0f;
            if (i14 < i13) {
                int i15 = i14 + 1;
                float f24 = ((float) i14) / ((float) i13);
                float f25 = 1.0f;
                while (true) {
                    f11 = 2.0f;
                    f12 = ((f25 - f21) / 2.0f) + f21;
                    f13 = f23 - f12;
                    f14 = f12 * 3.0f * f13;
                    f15 = f12 * f12 * f12;
                    float f26 = (((f13 * 0.175f) + (f12 * 0.35000002f)) * f14) + f15;
                    float f27 = f26;
                    if (((double) Math.abs(f26 - f24)) < 1.0E-5d) {
                        break;
                    }
                    int i16 = i15;
                    if (f27 > f24) {
                        f25 = f12;
                    } else {
                        f21 = f12;
                    }
                    i15 = i16;
                    f23 = 1.0f;
                }
                fArr[i14] = (f14 * ((f13 * 0.5f) + f12)) + f15;
                float f28 = 1.0f;
                while (true) {
                    f16 = ((f28 - f22) / f11) + f22;
                    f17 = f23 - f16;
                    f18 = f16 * 3.0f * f17;
                    f19 = f16 * f16 * f16;
                    float f29 = (((f17 * 0.5f) + f16) * f18) + f19;
                    i12 = i15;
                    if (((double) Math.abs(f29 - f24)) < 1.0E-5d) {
                        break;
                    }
                    if (f29 > f24) {
                        f28 = f16;
                    } else {
                        f22 = f16;
                    }
                    i15 = i12;
                    f23 = 1.0f;
                    f11 = 2.0f;
                }
                fArr2[i14] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
                i14 = i12;
            } else {
                fArr2[i13] = 1.0f;
                fArr[i13] = fArr2[i13];
                return;
            }
        }
    }
}
