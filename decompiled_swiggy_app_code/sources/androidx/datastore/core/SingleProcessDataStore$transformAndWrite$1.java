package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9854a;

    /* renamed from: b  reason: collision with root package name */
    Object f9855b;

    /* renamed from: c  reason: collision with root package name */
    Object f9856c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f9857d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9858e;

    /* renamed from: f  reason: collision with root package name */
    int f9859f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$transformAndWrite$1> cVar) {
        super(cVar);
        this.f9858e = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9857d = obj;
        this.f9859f |= Integer.MIN_VALUE;
        return this.f9858e.y((p) null, (CoroutineContext) null, this);
    }
}
