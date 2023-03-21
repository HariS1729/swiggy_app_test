package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SpringEstimation.kt */
final class SpringEstimationKt$estimateOverDamped$fn$1 extends Lambda implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ double f2700a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f2701b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f2702c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f2703d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ double f2704e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpringEstimationKt$estimateOverDamped$fn$1(double d11, double d12, double d13, double d14, double d15) {
        super(1);
        this.f2700a = d11;
        this.f2701b = d12;
        this.f2702c = d13;
        this.f2703d = d14;
        this.f2704e = d15;
    }

    public final Double a(double d11) {
        return Double.valueOf((this.f2700a * Math.exp(this.f2701b * d11)) + (this.f2702c * Math.exp(this.f2703d * d11)) + this.f2704e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
