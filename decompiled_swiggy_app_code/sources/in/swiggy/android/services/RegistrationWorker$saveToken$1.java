package in.swiggy.android.services;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.services.RegistrationWorker$saveToken$1", f = "RegistrationWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: RegistrationWorker.kt */
final class RegistrationWorker$saveToken$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18667a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RegistrationWorker f18668b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f18669c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationWorker$saveToken$1(RegistrationWorker registrationWorker, String str, c<? super RegistrationWorker$saveToken$1> cVar) {
        super(2, cVar);
        this.f18668b = registrationWorker;
        this.f18669c = str;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new RegistrationWorker$saveToken$1(this.f18668b, this.f18669c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((RegistrationWorker$saveToken$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18667a == 0) {
            g.b(obj);
            this.f18668b.j.edit().putString("token", this.f18669c).apply();
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
