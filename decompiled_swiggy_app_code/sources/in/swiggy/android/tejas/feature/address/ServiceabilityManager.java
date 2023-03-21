package in.swiggy.android.tejas.feature.address;

import ao0.s;
import gi0.a;
import gi0.b;
import gi0.c;
import in.swiggy.android.tejas.IDashAPI;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;
import retrofit2.Response;

/* compiled from: ServiceabilityManager.kt */
public final class ServiceabilityManager {
    private final IDashAPI api;
    private final ITransformer<SwiggyApiResponse<String>, Boolean> transformer;

    public ServiceabilityManager(IDashAPI iDashAPI, ITransformer<SwiggyApiResponse<String>, Boolean> iTransformer) {
        p.j(iDashAPI, "api");
        p.j(iTransformer, "transformer");
        this.api = iDashAPI;
        this.transformer = iTransformer;
    }

    /* access modifiers changed from: private */
    /* renamed from: getServiceability$lambda-0  reason: not valid java name */
    public static final boolean m8getServiceability$lambda0(Response response) {
        p.j(response, "response");
        return response.isSuccessful();
    }

    /* access modifiers changed from: private */
    /* renamed from: getServiceability$lambda-1  reason: not valid java name */
    public static final SwiggyApiResponse m9getServiceability$lambda1(Response response) {
        p.j(response, "response");
        return (SwiggyApiResponse) response.body();
    }

    /* access modifiers changed from: private */
    /* renamed from: getServiceability$lambda-2  reason: not valid java name */
    public static final Boolean m10getServiceability$lambda2(ServiceabilityManager serviceabilityManager, SwiggyApiResponse swiggyApiResponse) {
        p.j(serviceabilityManager, "this$0");
        p.j(swiggyApiResponse, "response");
        return serviceabilityManager.transformer.transform(swiggyApiResponse);
    }

    public final s<Boolean> getServiceability(String str, double d11, double d12) {
        p.j(str, "storeId");
        s<R> n = this.api.checkServiceability(str, d11, d12).z(c.f55993a).d0().n(b.f55992a).n(new a(this));
        p.i(n, "api.checkServiceability(…mer.transform(response) }");
        return n;
    }
}
