package u0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import com.BV.LinearGradient.LinearGradientManager;
import java.util.List;
import t0.f;

/* compiled from: AndroidShader.android.kt */
public final class p {
    public static final Shader a(long j, long j11, List<d0> list, List<Float> list2, int i11) {
        List<d0> list3 = list;
        kotlin.jvm.internal.p.j(list, LinearGradientManager.PROP_COLORS);
        f(list, list2);
        int c11 = c(list);
        return new LinearGradient(f.m(j), f.n(j), f.m(j11), f.n(j11), d(list, c11), e(list2, list, c11), q.a(i11));
    }

    public static final Shader b(long j, List<d0> list, List<Float> list2) {
        kotlin.jvm.internal.p.j(list, LinearGradientManager.PROP_COLORS);
        f(list, list2);
        int c11 = c(list);
        return new SweepGradient(f.m(j), f.n(j), d(list, c11), e(list2, list, c11));
    }

    public static final int c(List<d0> list) {
        kotlin.jvm.internal.p.j(list, LinearGradientManager.PROP_COLORS);
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int l11 = k.l(list);
        int i11 = 0;
        for (int i12 = 1; i12 < l11; i12++) {
            if (d0.o(list.get(i12).v()) == 0.0f) {
                i11++;
            }
        }
        return i11;
    }

    public static final int[] d(List<d0> list, int i11) {
        int i12;
        List<d0> list2 = list;
        kotlin.jvm.internal.p.j(list2, LinearGradientManager.PROP_COLORS);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i13 = 0; i13 < size; i13++) {
                iArr[i13] = f0.j(list2.get(i13).v());
            }
            return iArr;
        }
        int[] iArr2 = new int[(list.size() + i11)];
        int l11 = k.l(list);
        int size2 = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size2; i15++) {
            long v = list2.get(i15).v();
            if (d0.o(v) == 0.0f) {
                if (i15 == 0) {
                    i12 = i14 + 1;
                    iArr2[i14] = f0.j(d0.l(list2.get(1).v(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else if (i15 == l11) {
                    i12 = i14 + 1;
                    iArr2[i14] = f0.j(d0.l(list2.get(i15 - 1).v(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else {
                    int i16 = i14 + 1;
                    iArr2[i14] = f0.j(d0.l(list2.get(i15 - 1).v(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    i14 = i16 + 1;
                    iArr2[i16] = f0.j(d0.l(list2.get(i15 + 1).v(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                }
                i14 = i12;
            } else {
                iArr2[i14] = f0.j(v);
                i14++;
            }
        }
        return iArr2;
    }

    public static final float[] e(List<Float> list, List<d0> list2, int i11) {
        kotlin.jvm.internal.p.j(list2, LinearGradientManager.PROP_COLORS);
        if (i11 != 0) {
            float[] fArr = new float[(list2.size() + i11)];
            fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
            int l11 = k.l(list2);
            int i12 = 1;
            for (int i13 = 1; i13 < l11; i13++) {
                long v = list2.get(i13).v();
                float floatValue = list != null ? list.get(i13).floatValue() : ((float) i13) / ((float) k.l(list2));
                int i14 = i12 + 1;
                fArr[i12] = floatValue;
                if (d0.o(v) == 0.0f) {
                    i12 = i14 + 1;
                    fArr[i14] = floatValue;
                } else {
                    i12 = i14;
                }
            }
            fArr[i12] = list != null ? list.get(k.l(list2)).floatValue() : 1.0f;
            return fArr;
        } else if (list != null) {
            return s.B0(list);
        } else {
            return null;
        }
    }

    private static final void f(List<d0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
