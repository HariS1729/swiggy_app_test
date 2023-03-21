package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9849a;

    /* renamed from: b  reason: collision with root package name */
    Object f9850b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f9851c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9852d;

    /* renamed from: e  reason: collision with root package name */
    int f9853e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readDataOrHandleCorruption$1> cVar) {
        super(cVar);
        this.f9852d = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9851c = obj;
        this.f9853e |= Integer.MIN_VALUE;
        return this.f9852d.x(this);
    }
}
