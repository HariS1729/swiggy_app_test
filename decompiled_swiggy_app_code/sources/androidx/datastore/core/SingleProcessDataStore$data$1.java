package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import lp0.p;

@d(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* compiled from: SingleProcessDataStore.kt */
final class SingleProcessDataStore$data$1 extends SuspendLambda implements p<e<? super T>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f9801a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f9802b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f9803c;

    @d(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1  reason: invalid class name */
    /* compiled from: SingleProcessDataStore.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<d<T>, c<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f9804a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f9805b;

        /* renamed from: a */
        public final Object invoke(d<T> dVar, c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(dVar, cVar);
            r02.f9805b = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = b.d();
            if (this.f9804a == 0) {
                g.b(obj);
                d<T> dVar = (d) this.f9805b;
                d<T> dVar2 = dVar;
                boolean z11 = false;
                if (!(dVar2 instanceof a) && !(dVar2 instanceof b) && dVar == dVar2) {
                    z11 = true;
                }
                return a.a(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$data$1> cVar) {
        super(2, cVar);
        this.f9803c = singleProcessDataStore;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.f9803c, cVar);
        singleProcessDataStore$data$1.f9802b = obj;
        return singleProcessDataStore$data$1;
    }

    public final Object invoke(e<? super T> eVar, c<? super k> cVar) {
        return ((SingleProcessDataStore$data$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f9801a;
        if (i11 == 0) {
            g.b(obj);
            e eVar = (e) this.f9802b;
            final d dVar = (d) this.f9803c.f9783h.getValue();
            if (!(dVar instanceof a)) {
                this.f9803c.j.e(new SingleProcessDataStore.b.a(dVar));
            }
            SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 = new SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1(f.n(this.f9803c.f9783h, new AnonymousClass1((c<? super AnonymousClass1>) null)));
            this.f9801a = 1;
            if (f.o(eVar, singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
