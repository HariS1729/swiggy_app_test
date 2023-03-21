package in.swiggy.android.services;

import androidx.work.ListenableWorker;
import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.DefaultingAddressInfo;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import os.m;
import os.u;
import wp0.j0;

@d(c = "in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$2", f = "FetchUserDefaultingAddressesWorker.kt", l = {65}, m = "invokeSuspend")
/* compiled from: FetchUserDefaultingAddressesWorker.kt */
final class FetchUserDefaultingAddressesWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18619a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FetchUserDefaultingAddressesWorker f18620b;

    /* compiled from: FetchUserDefaultingAddressesWorker.kt */
    static final class a implements e<Response<? extends SwiggyApiResponse<GetAddressDefaultingResponseData>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FetchUserDefaultingAddressesWorker f18621a;

        a(FetchUserDefaultingAddressesWorker fetchUserDefaultingAddressesWorker) {
            this.f18621a = fetchUserDefaultingAddressesWorker;
        }

        /* renamed from: a */
        public final Object emit(Response<SwiggyApiResponse<GetAddressDefaultingResponseData>> response, c<? super k> cVar) {
            ListenableWorker.a a11;
            DefaultingAddressInfo defaultingInfo;
            Double proximityWeight;
            if (response instanceof Response.Success) {
                m.b("New Defaulting Logic addressUseCase : Api Success");
                ef0.e F = this.f18621a.f18615i;
                Response.Success success = (Response.Success) response;
                GetAddressDefaultingResponseData getAddressDefaultingResponseData = (GetAddressDefaultingResponseData) ((SwiggyApiResponse) success.getResponse()).getData();
                int defaultingType = getAddressDefaultingResponseData == null ? 1 : getAddressDefaultingResponseData.getDefaultingType();
                GetAddressDefaultingResponseData getAddressDefaultingResponseData2 = (GetAddressDefaultingResponseData) ((SwiggyApiResponse) success.getResponse()).getData();
                double d11 = -1.266d;
                if (!(getAddressDefaultingResponseData2 == null || (defaultingInfo = getAddressDefaultingResponseData2.getDefaultingInfo()) == null || (proximityWeight = defaultingInfo.getProximityWeight()) == null)) {
                    d11 = proximityWeight.doubleValue();
                }
                Double b11 = kotlin.coroutines.jvm.internal.a.b(d11);
                GetAddressDefaultingResponseData getAddressDefaultingResponseData3 = (GetAddressDefaultingResponseData) ((SwiggyApiResponse) success.getResponse()).getData();
                List<Address> addresses = getAddressDefaultingResponseData3 == null ? null : getAddressDefaultingResponseData3.getAddresses();
                if (addresses == null) {
                    addresses = k.j();
                }
                F.d0(defaultingType, b11, addresses);
                ListenableWorker.a c11 = ListenableWorker.a.c();
                if (c11 == b.d()) {
                    return c11;
                }
            } else if ((response instanceof Response.Failure) && (a11 = ListenableWorker.a.a()) == b.d()) {
                return a11;
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FetchUserDefaultingAddressesWorker$doWork$2(FetchUserDefaultingAddressesWorker fetchUserDefaultingAddressesWorker, c<? super FetchUserDefaultingAddressesWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18620b = fetchUserDefaultingAddressesWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new FetchUserDefaultingAddressesWorker$doWork$2(this.f18620b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super ListenableWorker.a> cVar) {
        return ((FetchUserDefaultingAddressesWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f18619a;
        if (i11 == 0) {
            g.b(obj);
            if (this.f18620b.f18615i.o0()) {
                String customerId = this.f18620b.f18615i.getCustomerId();
                kotlin.jvm.internal.p.i(customerId, "user.customerId");
                if (customerId.length() > 0) {
                    kotlinx.coroutines.flow.d invoke = this.f18620b.j.invoke(FetchUserDefaultingAddressesWorker.k.a());
                    a aVar = new a(this.f18620b);
                    this.f18619a = 1;
                    if (invoke.collect(aVar, this) == d11) {
                        return d11;
                    }
                }
            }
            return ListenableWorker.a.a();
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                u.h("LocationDefaultingContext", th2);
                return ListenableWorker.a.a();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ListenableWorker.a.c();
    }
}
