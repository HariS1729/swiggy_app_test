package in.swiggy.android.services.network;

import bp0.g;
import bp0.k;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import qf0.a;
import wp0.j0;

@d(c = "in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$2", f = "NetworkPreHeatWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: NetworkPreHeatWorker.kt */
final class NetworkPreHeatWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18711a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f18712b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NetworkPreHeatWorker f18713c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkPreHeatWorker$doWork$2(a aVar, NetworkPreHeatWorker networkPreHeatWorker, c<? super NetworkPreHeatWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18712b = aVar;
        this.f18713c = networkPreHeatWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new NetworkPreHeatWorker$doWork$2(this.f18712b, this.f18713c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((NetworkPreHeatWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18711a == 0) {
            g.b(obj);
            List<String> a11 = this.f18712b.a();
            NetworkPreHeatWorker networkPreHeatWorker = this.f18713c;
            for (String c11 : a11) {
                networkPreHeatWorker.j.c(c11);
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
