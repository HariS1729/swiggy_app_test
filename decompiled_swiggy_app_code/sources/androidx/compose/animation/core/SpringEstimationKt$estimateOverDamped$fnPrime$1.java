package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SpringEstimation.kt */
final class SpringEstimationKt$estimateOverDamped$fnPrime$1 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ double f2705a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f2706b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f2707c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f2708d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpringEstimationKt$estimateOverDamped$fnPrime$1(double d11, double d12, double d13, double d14) {
        super(1);
        this.f2705a = d11;
        this.f2706b = d12;
        this.f2707c = d13;
        this.f2708d = d14;
    }

    public final Double a(double d11) {
        double d12 = this.f2705a;
        double d13 = this.f2706b;
        double exp = d12 * d13 * Math.exp(d13 * d11);
        double d14 = this.f2707c;
        double d15 = this.f2708d;
        return Double.valueOf(exp + (d14 * d15 * Math.exp(d15 * d11)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
