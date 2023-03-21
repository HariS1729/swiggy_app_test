package androidx.compose.material;

import bp0.k;
import e0.d1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import w0.f;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f5211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f5212b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ w0.l f5213c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d1<Integer> f5214d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d1<Float> f5215e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d1<Float> f5216f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d1<Float> f5217g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$CircularProgressIndicator$3(float f11, long j, w0.l lVar, d1<Integer> d1Var, d1<Float> d1Var2, d1<Float> d1Var3, d1<Float> d1Var4) {
        super(1);
        this.f5211a = f11;
        this.f5212b = j;
        this.f5213c = lVar;
        this.f5214d = d1Var;
        this.f5215e = d1Var2;
        this.f5216f = d1Var3;
        this.f5217g = d1Var4;
    }

    public final void a(f fVar) {
        p.j(fVar, "$this$Canvas");
        f fVar2 = fVar;
        ProgressIndicatorKt.m(fVar2, ProgressIndicatorKt.c(this.f5216f) + (((((float) ProgressIndicatorKt.d(this.f5214d)) * 216.0f) % 360.0f) - 0.049804688f) + ProgressIndicatorKt.e(this.f5217g), this.f5211a, Math.abs(ProgressIndicatorKt.b(this.f5215e) - ProgressIndicatorKt.c(this.f5216f)), this.f5212b, this.f5213c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return k.f22762a;
    }
}
