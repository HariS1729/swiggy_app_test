package in.swiggy.android.tejas.feature.cancellation;

import ao0.s;
import ao0.u;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.commons.exceptions.NetworkConnectionException;
import in.swiggy.android.commons.exceptions.SwiggyExpiredTokenException;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.cancellation.ICancelOnlyApi;
import in.swiggy.android.tejas.utils.SwiggyRxSchedulers;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.ResponseBody;
import os.g0;
import retrofit2.HttpException;

@Instrumented
/* compiled from: CancelOnlyManager.kt */
public final class CancelOnlyManager {
    private final ICancelOnlyApi api;

    public CancelOnlyManager(ICancelOnlyApi iCancelOnlyApi) {
        p.j(iCancelOnlyApi, "api");
        this.api = iCancelOnlyApi;
    }

    /* access modifiers changed from: private */
    /* renamed from: cancelOnlyApi$lambda-1  reason: not valid java name */
    public static final Response m11cancelOnlyApi$lambda1(retrofit2.Response response) {
        Response response2;
        p.j(response, "rxResponse");
        SwiggyApiResponse swiggyApiResponse = (SwiggyApiResponse) response.body();
        if (swiggyApiResponse == null) {
            response2 = null;
        } else if (response.isSuccessful() && swiggyApiResponse.isResponseOkForBoth()) {
            response2 = Response.Companion.success$default(Response.Companion, swiggyApiResponse, (Boolean) null, (Integer) null, 6, (Object) null);
        } else if (swiggyApiResponse.isSessionInValid()) {
            response2 = Response.Companion.failure$default(Response.Companion, new Error.ExpiredTokenError(swiggyApiResponse.getStatusMessage()), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null);
        } else {
            response2 = Response.Companion.failure$default(Response.Companion, new Error.InternalError(swiggyApiResponse.getStatusTitle(), swiggyApiResponse.getStatusMessage(), swiggyApiResponse.getStatusCode()), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null);
        }
        return response2 == null ? Response.Companion.failure$default(Response.Companion, new Error.InternalError((String) null, (String) null, (Integer) null, 7, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null) : response2;
    }

    /* access modifiers changed from: private */
    /* renamed from: cancelOnlyApi$lambda-2  reason: not valid java name */
    public static final u m12cancelOnlyApi$lambda2(Throwable th2) {
        ResponseBody errorBody;
        p.j(th2, "it");
        String str = null;
        if (th2 instanceof HttpException) {
            retrofit2.Response<?> response = ((HttpException) th2).response();
            if (!(response == null || (errorBody = response.errorBody()) == null)) {
                str = errorBody.string();
            }
            Gson i11 = g0.i();
            Class cls = SwiggyBaseResponse.class;
            return s.m(Response.Companion.failure$default(Response.Companion, new Error.InternalError((String) null, ((SwiggyBaseResponse) (!(i11 instanceof Gson) ? i11.fromJson(str, cls) : GsonInstrumentation.fromJson(i11, str, cls))).getStatusMessage(), (Integer) null, 5, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null));
        } else if (th2 instanceof SwiggyExpiredTokenException) {
            return s.m(Response.Companion.failure$default(Response.Companion, new Error.ExpiredTokenError((String) null, 1, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null));
        } else {
            if (th2 instanceof NetworkConnectionException) {
                return s.m(Response.Companion.failure$default(Response.Companion, new Error.NoNetworkError(), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null));
            }
            return s.m(Response.Companion.failure$default(Response.Companion, new Error.UnhandledExceptionError(th2, (String) null, 2, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null));
        }
    }

    public final s<Response<SwiggyApiResponse<CancelOnlyResponse>>> cancelOnlyApi(String str) {
        p.j(str, "orderId");
        s<Response<SwiggyApiResponse<CancelOnlyResponse>>> d11 = ICancelOnlyApi.DefaultImpls.cancelOnly$default(this.api, str, (CancelOnlyRequest) null, 2, (Object) null).n(b.f20215a).q(a.f20214a).d(SwiggyRxSchedulers.INSTANCE.applySingleSchedulers$tejas_release());
        p.i(d11, "api.cancelOnly(orderId)\n….applySingleSchedulers())");
        return d11;
    }
}
