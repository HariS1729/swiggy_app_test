package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SpringEstimation.kt */
final class SpringEstimationKt$estimateCriticallyDamped$fn$1 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ double f2693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f2694b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f2695c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f2696d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpringEstimationKt$estimateCriticallyDamped$fn$1(double d11, double d12, double d13, double d14) {
        super(1);
        this.f2693a = d11;
        this.f2694b = d12;
        this.f2695c = d13;
        this.f2696d = d14;
    }

    public final Double a(double d11) {
        return Double.valueOf(((this.f2693a + (this.f2694b * d11)) * Math.exp(this.f2695c * d11)) + this.f2696d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
