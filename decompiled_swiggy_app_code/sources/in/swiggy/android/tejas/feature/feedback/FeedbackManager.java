package in.swiggy.android.tejas.feature.feedback;

import ao0.s;
import in.swiggy.android.tejas.IDashAPI;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import kotlin.jvm.internal.p;
import ni0.b;
import ni0.c;
import ni0.d;
import retrofit2.Response;

/* compiled from: FeedbackManager.kt */
public final class FeedbackManager {
    private final IDashAPI dashAPI;

    public FeedbackManager(IDashAPI iDashAPI) {
        p.j(iDashAPI, "dashAPI");
        this.dashAPI = iDashAPI;
    }

    /* access modifiers changed from: private */
    /* renamed from: sendFeedback$lambda-0  reason: not valid java name */
    public static final boolean m15sendFeedback$lambda0(Response response) {
        p.j(response, "response");
        return response.isSuccessful();
    }

    /* access modifiers changed from: private */
    /* renamed from: sendFeedback$lambda-1  reason: not valid java name */
    public static final boolean m16sendFeedback$lambda1(Response response) {
        p.j(response, "response");
        return response.body() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: sendFeedback$lambda-2  reason: not valid java name */
    public static final Boolean m17sendFeedback$lambda2(Response response) {
        Integer statusCode;
        p.j(response, "response");
        SwiggyApiResponse swiggyApiResponse = (SwiggyApiResponse) response.body();
        boolean z11 = false;
        if (!(swiggyApiResponse == null || (statusCode = swiggyApiResponse.getStatusCode()) == null || statusCode.intValue() != 0)) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    public final s<Boolean> sendFeedback(FeedbackRequestBody feedbackRequestBody) {
        p.j(feedbackRequestBody, "feedbackRequestBody");
        s<R> n = this.dashAPI.sendFeedback(feedbackRequestBody).z(c.f27090a).z(d.f27091a).d0().n(b.f27089a);
        p.i(n, "dashAPI.sendFeedback(fee…body()?.statusCode == 0 }");
        return n;
    }
}
