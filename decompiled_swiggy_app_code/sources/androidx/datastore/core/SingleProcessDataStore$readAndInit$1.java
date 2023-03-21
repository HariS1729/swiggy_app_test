package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$readAndInit$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9814a;

    /* renamed from: b  reason: collision with root package name */
    Object f9815b;

    /* renamed from: c  reason: collision with root package name */
    Object f9816c;

    /* renamed from: d  reason: collision with root package name */
    Object f9817d;

    /* renamed from: e  reason: collision with root package name */
    Object f9818e;

    /* renamed from: f  reason: collision with root package name */
    Object f9819f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f9820g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9821h;

    /* renamed from: i  reason: collision with root package name */
    int f9822i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInit$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readAndInit$1> cVar) {
        super(cVar);
        this.f9821h = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9820g = obj;
        this.f9822i |= Integer.MIN_VALUE;
        return this.f9821h.t(this);
    }
}
