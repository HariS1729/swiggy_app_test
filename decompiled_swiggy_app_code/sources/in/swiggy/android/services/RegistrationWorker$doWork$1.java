package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.RegistrationWorker", f = "RegistrationWorker.kt", l = {75}, m = "doWork")
/* compiled from: RegistrationWorker.kt */
final class RegistrationWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18663a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f18664b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RegistrationWorker f18665c;

    /* renamed from: d  reason: collision with root package name */
    int f18666d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationWorker$doWork$1(RegistrationWorker registrationWorker, c<? super RegistrationWorker$doWork$1> cVar) {
        super(cVar);
        this.f18665c = registrationWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18664b = obj;
        this.f18666d |= Integer.MIN_VALUE;
        return this.f18665c.w(this);
    }
}
