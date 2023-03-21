package androidx.compose.animation;

import d2.m;
import d2.p;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideOutHorizontally$2 extends Lambda implements l<p, d2.l> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f2560a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$slideOutHorizontally$2(l<? super Integer, Integer> lVar) {
        super(1);
        this.f2560a = lVar;
    }

    public final long a(long j) {
        return m.a(this.f2560a.invoke(Integer.valueOf(p.g(j))).intValue(), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return d2.l.b(a(((p) obj).j()));
    }
}
