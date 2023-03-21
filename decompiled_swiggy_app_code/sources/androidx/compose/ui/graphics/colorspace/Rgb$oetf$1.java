package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Rgb.kt */
final class Rgb$oetf$1 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Rgb f6481a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.f6481a = rgb;
    }

    public final Double a(double d11) {
        return Double.valueOf(l.k(this.f6481a.p().invoke(Double.valueOf(d11)).doubleValue(), (double) this.f6481a.f6465f, (double) this.f6481a.f6466g));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
