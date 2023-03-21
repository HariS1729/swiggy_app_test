package androidx.compose.animation;

import d2.p;
import d2.q;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$expandHorizontally$2 extends Lambda implements l<p, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f2540a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$expandHorizontally$2(l<? super Integer, Integer> lVar) {
        super(1);
        this.f2540a = lVar;
    }

    public final long a(long j) {
        return q.a(this.f2540a.invoke(Integer.valueOf(p.g(j))).intValue(), p.f(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return p.b(a(((p) obj).j()));
    }
}
