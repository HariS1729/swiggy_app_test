package arrow.typeclasses;

import fp0.c;
import in.juspay.hyper.constants.LogCategory;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import o4.a;
import u4.b;
import u4.d;
import u4.e;
import v4.a;

/* compiled from: MonadContinuations.kt */
public class MonadContinuation<F, A> implements b<a<? extends F, ? extends A>>, d<F>, v4.a<F>, e<F> {

    /* renamed from: a  reason: collision with root package name */
    protected a<? extends F, ? extends A> f12492a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f12493b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d f12494c;

    public MonadContinuation(d<F> dVar, CoroutineContext coroutineContext) {
        p.k(dVar, "M");
        p.k(coroutineContext, LogCategory.CONTEXT);
        this.f12494c = dVar;
        this.f12493b = coroutineContext;
    }

    static /* synthetic */ Object h(MonadContinuation monadContinuation, a aVar, c cVar) {
        monadContinuation.l(monadContinuation.c(aVar, new MonadContinuation$bind$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1(cVar, ContinuationUtilsKt.e(cVar), monadContinuation, aVar)));
        Object d11 = b.d();
        if (d11 == b.d()) {
            f.c(cVar);
        }
        return d11;
    }

    public <B> Object a(a<? extends F, ? extends B> aVar, c<? super B> cVar) {
        return h(this, aVar, cVar);
    }

    public <A, B> a<F, B> c(a<? extends F, ? extends A> aVar, l<? super A, ? extends a<? extends F, ? extends B>> lVar) {
        p.k(aVar, "$this$flatMap");
        p.k(lVar, "f");
        return this.f12494c.c(aVar, lVar);
    }

    public <A> a<F, A> d(A a11) {
        return this.f12494c.d(a11);
    }

    public <A> Object g(a<? extends F, ? extends A> aVar, c<? super A> cVar) {
        return a.C0201a.a(this, aVar, cVar);
    }

    public CoroutineContext getContext() {
        return this.f12493b;
    }

    /* access modifiers changed from: protected */
    public final o4.a<F, A> i() {
        o4.a<? extends F, ? extends A> aVar = this.f12492a;
        if (aVar == null) {
            p.B("returnedMonad");
        }
        return aVar;
    }

    /* renamed from: j */
    public void p(o4.a<? extends F, ? extends A> aVar) {
        p.k(aVar, "value");
        this.f12492a = aVar;
    }

    public o4.a<F, A> k() {
        o4.a<? extends F, ? extends A> aVar = this.f12492a;
        if (aVar == null) {
            p.B("returnedMonad");
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final void l(o4.a<? extends F, ? extends A> aVar) {
        p.k(aVar, "<set-?>");
        this.f12492a = aVar;
    }

    public void resumeWith(Object obj) {
        b.a.a(this, obj);
    }

    public void s(Throwable th2) {
        p.k(th2, "exception");
        throw th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MonadContinuation(d dVar, CoroutineContext coroutineContext, int i11, i iVar) {
        this(dVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f25631a : coroutineContext);
    }
}
