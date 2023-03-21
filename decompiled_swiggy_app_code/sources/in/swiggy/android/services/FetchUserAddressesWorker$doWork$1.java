package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.FetchUserAddressesWorker", f = "FetchUserAddressesWorker.kt", l = {50}, m = "doWork")
/* compiled from: FetchUserAddressesWorker.kt */
final class FetchUserAddressesWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f18607a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FetchUserAddressesWorker f18608b;

    /* renamed from: c  reason: collision with root package name */
    int f18609c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FetchUserAddressesWorker$doWork$1(FetchUserAddressesWorker fetchUserAddressesWorker, c<? super FetchUserAddressesWorker$doWork$1> cVar) {
        super(cVar);
        this.f18608b = fetchUserAddressesWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18607a = obj;
        this.f18609c |= Integer.MIN_VALUE;
        return this.f18608b.w(this);
    }
}
