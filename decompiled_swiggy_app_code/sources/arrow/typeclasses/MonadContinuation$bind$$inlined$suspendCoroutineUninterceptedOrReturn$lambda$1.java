package arrow.typeclasses;

import fp0.c;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import o4.a;

/* compiled from: MonadContinuations.kt */
final class MonadContinuation$bind$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 extends Lambda implements l<B, a<? extends F, ? extends A>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f12495a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f12496b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MonadContinuation f12497c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f12498d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MonadContinuation$bind$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1(c cVar, List list, MonadContinuation monadContinuation, a aVar) {
        super(1);
        this.f12495a = cVar;
        this.f12496b = list;
        this.f12497c = monadContinuation;
        this.f12498d = aVar;
    }

    /* renamed from: a */
    public final a<F, A> invoke(B b11) {
        ContinuationUtilsKt.f(this.f12495a, this.f12496b);
        c cVar = this.f12495a;
        Result.a aVar = Result.f25582b;
        cVar.resumeWith(Result.b(b11));
        return this.f12497c.i();
    }
}
