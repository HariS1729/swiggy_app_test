package androidx.datastore.core;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements p<j0, c<? super T>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9860a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<T, c<? super T>, Object> f9861b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ T f9862c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$transformAndWrite$newData$1(p<? super T, ? super c<? super T>, ? extends Object> pVar, T t, c<? super SingleProcessDataStore$transformAndWrite$newData$1> cVar) {
        super(2, cVar);
        this.f9861b = pVar;
        this.f9862c = t;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f9861b, this.f9862c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super T> cVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9860a;
        if (i11 == 0) {
            g.b(obj);
            p<T, c<? super T>, Object> pVar = this.f9861b;
            T t = this.f9862c;
            this.f9860a = 1;
            obj = pVar.invoke(t, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
