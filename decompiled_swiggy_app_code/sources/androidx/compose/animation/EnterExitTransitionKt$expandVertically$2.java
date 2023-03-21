package androidx.compose.animation;

import d2.p;
import d2.q;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$expandVertically$2 extends Lambda implements l<p, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Integer, Integer> f2543a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$expandVertically$2(l<? super Integer, Integer> lVar) {
        super(1);
        this.f2543a = lVar;
    }

    public final long a(long j) {
        return q.a(p.g(j), this.f2543a.invoke(Integer.valueOf(p.f(j))).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return p.b(a(((p) obj).j()));
    }
}
