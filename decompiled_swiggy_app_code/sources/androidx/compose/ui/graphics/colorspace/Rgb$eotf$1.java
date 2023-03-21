package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Rgb.kt */
final class Rgb$eotf$1 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Rgb f6480a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.f6480a = rgb;
    }

    public final Double a(double d11) {
        return this.f6480a.m().invoke(Double.valueOf(l.k(d11, (double) this.f6480a.f6465f, (double) this.f6480a.f6466g)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
