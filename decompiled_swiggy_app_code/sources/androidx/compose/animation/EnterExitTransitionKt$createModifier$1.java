package androidx.compose.animation;

import bp0.k;
import e0.d1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.j0;
import u0.q1;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$createModifier$1 extends Lambda implements l<j0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<Float> f2531a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<Float> f2532b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d1<q1> f2533c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$1(d1<Float> d1Var, d1<Float> d1Var2, d1<q1> d1Var3) {
        super(1);
        this.f2531a = d1Var;
        this.f2532b = d1Var2;
        this.f2533c = d1Var3;
    }

    public final void a(j0 j0Var) {
        p.j(j0Var, "$this$graphicsLayer");
        j0Var.c(EnterExitTransitionKt.n(this.f2531a));
        j0Var.l(EnterExitTransitionKt.i(this.f2532b));
        j0Var.m(EnterExitTransitionKt.i(this.f2532b));
        j0Var.z(EnterExitTransitionKt.j(this.f2533c));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((j0) obj);
        return k.f22762a;
    }
}
