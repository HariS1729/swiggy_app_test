package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import lp0.l;
import p4.a;

/* compiled from: either.kt */
final class EitherMonad$flatMap$1 extends Lambda implements l<A, a<? extends L, ? extends B>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f12486a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EitherMonad$flatMap$1(l lVar) {
        super(1);
        this.f12486a = lVar;
    }

    /* renamed from: a */
    public final a<L, B> invoke(A a11) {
        return (a) ((o4.a) this.f12486a.invoke(a11));
    }
}
