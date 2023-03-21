package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9839a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f9840b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9841c;

    /* renamed from: d  reason: collision with root package name */
    int f9842d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readAndInitOrPropagateFailure$1> cVar) {
        super(cVar);
        this.f9841c = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9840b = obj;
        this.f9842d |= Integer.MIN_VALUE;
        return this.f9841c.v(this);
    }
}
