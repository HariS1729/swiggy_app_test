package androidx.compose.foundation;

import d2.e;
import e0.d1;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import t0.f;
import t0.g;

/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends Lambda implements a<f> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f3101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<l<e, f>> f3102b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<f> f3103c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(e eVar, d1<? extends l<? super e, f>> d1Var, h0<f> h0Var) {
        super(0);
        this.f3101a = eVar;
        this.f3102b = d1Var;
        this.f3103c = h0Var;
    }

    public final long a() {
        long u11 = ((f) MagnifierKt$magnifier$4.n(this.f3102b).invoke(this.f3101a)).u();
        if (!g.c(MagnifierKt$magnifier$4.k(this.f3103c)) || !g.c(u11)) {
            return f.f16662b.b();
        }
        return f.r(MagnifierKt$magnifier$4.k(this.f3103c), u11);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return f.d(a());
    }
}
