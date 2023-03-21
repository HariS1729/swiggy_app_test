package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$readData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9843a;

    /* renamed from: b  reason: collision with root package name */
    Object f9844b;

    /* renamed from: c  reason: collision with root package name */
    Object f9845c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f9846d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9847e;

    /* renamed from: f  reason: collision with root package name */
    int f9848f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readData$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readData$1> cVar) {
        super(cVar);
        this.f9847e = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9846d = obj;
        this.f9848f |= Integer.MIN_VALUE;
        return this.f9847e.w(this);
    }
}
