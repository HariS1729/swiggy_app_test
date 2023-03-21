package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9808a;

    /* renamed from: b  reason: collision with root package name */
    Object f9809b;

    /* renamed from: c  reason: collision with root package name */
    Object f9810c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f9811d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9812e;

    /* renamed from: f  reason: collision with root package name */
    int f9813f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$handleUpdate$1> cVar) {
        super(cVar);
        this.f9812e = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9811d = obj;
        this.f9813f |= Integer.MIN_VALUE;
        return this.f9812e.s((SingleProcessDataStore.b.C0055b) null, this);
    }
}
