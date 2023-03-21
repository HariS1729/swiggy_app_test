package androidx.compose.foundation.layout;

import bp0.k;
import d2.b;
import defpackage.a2;
import e0.g;
import i1.j0;
import i1.t;
import i1.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import lp0.p;
import lp0.q;

/* compiled from: BoxWithConstraints.kt */
final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends Lambda implements p<j0, b, u> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f3700a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q<a2.f, g, Integer, k> f3701b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f3702c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxWithConstraintsKt$BoxWithConstraints$1$1(t tVar, q<? super a2.f, ? super g, ? super Integer, k> qVar, int i11) {
        super(2);
        this.f3700a = tVar;
        this.f3701b = qVar;
        this.f3702c = i11;
    }

    public final u a(j0 j0Var, long j) {
        kotlin.jvm.internal.p.j(j0Var, "$this$SubcomposeLayout");
        return this.f3700a.d(j0Var, j0Var.a0(k.f22762a, l0.b.c(-1945019079, true, new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.f3701b, new c(j0Var, j, (i) null), this.f3702c))), j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((j0) obj, ((b) obj2).t());
    }
}
