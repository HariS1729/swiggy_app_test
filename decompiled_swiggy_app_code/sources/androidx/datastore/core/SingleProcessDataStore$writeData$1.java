package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9863a;

    /* renamed from: b  reason: collision with root package name */
    Object f9864b;

    /* renamed from: c  reason: collision with root package name */
    Object f9865c;

    /* renamed from: d  reason: collision with root package name */
    Object f9866d;

    /* renamed from: e  reason: collision with root package name */
    Object f9867e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f9868f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9869g;

    /* renamed from: h  reason: collision with root package name */
    int f9870h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$writeData$1> cVar) {
        super(cVar);
        this.f9869g = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9868f = obj;
        this.f9870h |= Integer.MIN_VALUE;
        return this.f9869g.z(null, this);
    }
}
