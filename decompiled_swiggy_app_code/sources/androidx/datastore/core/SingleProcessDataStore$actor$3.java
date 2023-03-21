package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$actor$3 extends SuspendLambda implements p<SingleProcessDataStore.b<T>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9792a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f9793b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9794c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.f9794c = singleProcessDataStore;
    }

    /* renamed from: a */
    public final Object invoke(SingleProcessDataStore.b<T> bVar, c<? super k> cVar) {
        return ((SingleProcessDataStore$actor$3) create(bVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.f9794c, cVar);
        singleProcessDataStore$actor$3.f9793b = obj;
        return singleProcessDataStore$actor$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9792a;
        if (i11 == 0) {
            g.b(obj);
            SingleProcessDataStore.b bVar = (SingleProcessDataStore.b) this.f9793b;
            if (bVar instanceof SingleProcessDataStore.b.a) {
                this.f9792a = 1;
                if (this.f9794c.r((SingleProcessDataStore.b.a) bVar, this) == d11) {
                    return d11;
                }
            } else if (bVar instanceof SingleProcessDataStore.b.C0055b) {
                this.f9792a = 2;
                if (this.f9794c.s((SingleProcessDataStore.b.C0055b) bVar, this) == d11) {
                    return d11;
                }
            }
        } else if (i11 == 1 || i11 == 2) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
