package in.swiggy.android.services.network;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.network.NetworkPreHeatWorker", f = "NetworkPreHeatWorker.kt", l = {77}, m = "doWork")
/* compiled from: NetworkPreHeatWorker.kt */
final class NetworkPreHeatWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18707a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f18708b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NetworkPreHeatWorker f18709c;

    /* renamed from: d  reason: collision with root package name */
    int f18710d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkPreHeatWorker$doWork$1(NetworkPreHeatWorker networkPreHeatWorker, c<? super NetworkPreHeatWorker$doWork$1> cVar) {
        super(cVar);
        this.f18709c = networkPreHeatWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18708b = obj;
        this.f18710d |= Integer.MIN_VALUE;
        return this.f18709c.w(this);
    }
}
