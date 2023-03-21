package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SpringEstimation.kt */
final class SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ double f2697a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f2698b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f2699c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(double d11, double d12, double d13) {
        super(1);
        this.f2697a = d11;
        this.f2698b = d12;
        this.f2699c = d13;
    }

    public final Double a(double d11) {
        double d12 = this.f2697a;
        double d13 = this.f2698b;
        return Double.valueOf(((d12 * ((d13 * d11) + ((double) 1))) + (this.f2699c * d13)) * Math.exp(d13 * d11));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
