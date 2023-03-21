package in.swiggy.android.tejas.feature.launch.prelaunch;

import ao0.d;
import eo0.b;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.network.requests.PostablePreLaunchRequest;
import in.swiggy.android.tejas.oldapi.network.responses.PreLaunchData;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.PreLaunchResponseHandler;
import kotlin.jvm.internal.p;
import wo0.a;

/* compiled from: PreLaunchManager.kt */
public final class PreLaunchManager {
    private final IPreLaunchAPI api;

    public PreLaunchManager(IPreLaunchAPI iPreLaunchAPI) {
        p.j(iPreLaunchAPI, "api");
        this.api = iPreLaunchAPI;
    }

    /* access modifiers changed from: private */
    /* renamed from: firePreLaunchApi$lambda-1  reason: not valid java name */
    public static final void m29firePreLaunchApi$lambda1(PreLaunchResponseHandler preLaunchResponseHandler, SwiggyApiResponse swiggyApiResponse) {
        p.j(preLaunchResponseHandler, "$preLaunchResponseHandler");
        if (swiggyApiResponse != null) {
            preLaunchResponseHandler.handleResponse(swiggyApiResponse);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: firePreLaunchApi$lambda-2  reason: not valid java name */
    public static final void m30firePreLaunchApi$lambda2(PreLaunchResponseHandler preLaunchResponseHandler, Throwable th2) {
        p.j(preLaunchResponseHandler, "$preLaunchResponseHandler");
        p.i(th2, "it");
        preLaunchResponseHandler.handleError(th2);
    }

    public final b firePreLaunchApi(PostablePreLaunchRequest postablePreLaunchRequest, PreLaunchResponseHandler preLaunchResponseHandler) {
        p.j(postablePreLaunchRequest, "postableLaunchRequest");
        p.j(preLaunchResponseHandler, "preLaunchResponseHandler");
        d<SwiggyApiResponse<PreLaunchData>> Q = this.api.getPreLaunchData(postablePreLaunchRequest).m0(a.c()).Q(do0.a.a());
        p.i(Q, "api.getPreLaunchData(pos…dSchedulers.mainThread())");
        b h02 = Q.h0(new wi0.a(preLaunchResponseHandler), new wi0.b(preLaunchResponseHandler));
        p.i(h02, "observable.subscribe({\n …andleError(it)\n        })");
        return h02;
    }
}
