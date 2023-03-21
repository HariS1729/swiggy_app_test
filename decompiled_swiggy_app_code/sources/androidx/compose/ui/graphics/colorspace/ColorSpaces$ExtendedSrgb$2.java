package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.Lambda;
import lp0.l;
import v0.c;

/* compiled from: ColorSpaces.kt */
final class ColorSpaces$ExtendedSrgb$2 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorSpaces$ExtendedSrgb$2 f6461a = new ColorSpaces$ExtendedSrgb$2();

    ColorSpaces$ExtendedSrgb$2() {
        super(1);
    }

    public final Double a(double d11) {
        return Double.valueOf(c.b(d11, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
