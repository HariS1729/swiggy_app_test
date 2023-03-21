package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.FetchUserDefaultingAddressesWorker", f = "FetchUserDefaultingAddressesWorker.kt", l = {62}, m = "doWork")
/* compiled from: FetchUserDefaultingAddressesWorker.kt */
final class FetchUserDefaultingAddressesWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f18616a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FetchUserDefaultingAddressesWorker f18617b;

    /* renamed from: c  reason: collision with root package name */
    int f18618c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FetchUserDefaultingAddressesWorker$doWork$1(FetchUserDefaultingAddressesWorker fetchUserDefaultingAddressesWorker, c<? super FetchUserDefaultingAddressesWorker$doWork$1> cVar) {
        super(cVar);
        this.f18617b = fetchUserDefaultingAddressesWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18616a = obj;
        this.f18618c |= Integer.MIN_VALUE;
        return this.f18617b.w(this);
    }
}
