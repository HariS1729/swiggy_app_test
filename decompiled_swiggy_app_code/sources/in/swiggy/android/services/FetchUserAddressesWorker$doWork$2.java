package in.swiggy.android.services;

import androidx.work.ListenableWorker;
import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import in.swiggy.android.tejas.feature.address.v2.usecase.GetAllAddressUseCase;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import os.u;
import wp0.j0;

@d(c = "in.swiggy.android.services.FetchUserAddressesWorker$doWork$2", f = "FetchUserAddressesWorker.kt", l = {54}, m = "invokeSuspend")
/* compiled from: FetchUserAddressesWorker.kt */
final class FetchUserAddressesWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FetchUserAddressesWorker f18611b;

    /* compiled from: FetchUserAddressesWorker.kt */
    static final class a implements e<Response<? extends SwiggyApiResponse<AllAddress>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FetchUserAddressesWorker f18612a;

        a(FetchUserAddressesWorker fetchUserAddressesWorker) {
            this.f18612a = fetchUserAddressesWorker;
        }

        /* renamed from: a */
        public final Object emit(Response<SwiggyApiResponse<AllAddress>> response, c<? super k> cVar) {
            ListenableWorker.a a11;
            if (response instanceof Response.Success) {
                ef0.e F = this.f18612a.f18606i;
                AllAddress allAddress = (AllAddress) ((SwiggyApiResponse) ((Response.Success) response).getResponse()).getData();
                List addresses = allAddress == null ? null : allAddress.getAddresses();
                if (addresses == null) {
                    addresses = k.j();
                }
                F.c2(addresses);
            } else if ((response instanceof Response.Failure) && (a11 = ListenableWorker.a.a()) == b.d()) {
                return a11;
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FetchUserAddressesWorker$doWork$2(FetchUserAddressesWorker fetchUserAddressesWorker, c<? super FetchUserAddressesWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18611b = fetchUserAddressesWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new FetchUserAddressesWorker$doWork$2(this.f18611b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super ListenableWorker.a> cVar) {
        return ((FetchUserAddressesWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f18610a;
        if (i11 == 0) {
            g.b(obj);
            u.b("FetchUserAddressesWorker", "user.isLoggedIn " + this.f18611b.f18606i.o0() + " user.customerId " + this.f18611b.f18606i.getCustomerId());
            if (this.f18611b.f18606i.o0()) {
                String customerId = this.f18611b.f18606i.getCustomerId();
                kotlin.jvm.internal.p.i(customerId, "user.customerId");
                if (customerId.length() > 0) {
                    GetAllAddressUseCase E = this.f18611b.j;
                    String customerId2 = this.f18611b.f18606i.getCustomerId();
                    kotlin.jvm.internal.p.i(customerId2, "user.customerId");
                    kotlinx.coroutines.flow.d invoke = E.invoke(customerId2);
                    a aVar = new a(this.f18611b);
                    this.f18610a = 1;
                    if (invoke.collect(aVar, this) == d11) {
                        return d11;
                    }
                }
            }
            u.b("FetchUserAddressesWorker", "Skipping fetch addresses, because user is not logged in");
            return ListenableWorker.a.a();
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                u.h("FetchUserAddressesWorker", th2);
                return ListenableWorker.a.a();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ListenableWorker.a.c();
    }
}
