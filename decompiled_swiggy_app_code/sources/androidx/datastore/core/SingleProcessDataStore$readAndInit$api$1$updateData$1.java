package androidx.datastore.core;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f9827a;

    /* renamed from: b  reason: collision with root package name */
    Object f9828b;

    /* renamed from: c  reason: collision with root package name */
    Object f9829c;

    /* renamed from: d  reason: collision with root package name */
    Object f9830d;

    /* renamed from: e  reason: collision with root package name */
    Object f9831e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f9832f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 f9833g;

    /* renamed from: h  reason: collision with root package name */
    int f9834h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, c<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> cVar) {
        super(cVar);
        this.f9833g = singleProcessDataStore$readAndInit$api$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9832f = obj;
        this.f9834h |= Integer.MIN_VALUE;
        return this.f9833g.a((p) null, this);
    }
}
