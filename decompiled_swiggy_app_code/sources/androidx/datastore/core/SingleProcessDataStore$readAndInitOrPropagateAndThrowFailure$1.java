package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9835a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f9836b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9837c;

    /* renamed from: d  reason: collision with root package name */
    int f9838d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1> cVar) {
        super(cVar);
        this.f9837c = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9836b = obj;
        this.f9838d |= Integer.MIN_VALUE;
        return this.f9837c.u(this);
    }
}
