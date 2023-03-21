package in.swiggy.android.tejas.feature.launch.aggregated;

import ao0.d;
import eo0.b;
import go0.a;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.network.requests.PostableAggregatedLaunchRequest;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.LaunchResponseHandler;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.UserResponseHandler;
import kotlin.jvm.internal.p;
import retrofit2.Response;

/* compiled from: AggregatedLaunchManager.kt */
public final class AggregatedLaunchManager {
    private final IAggregatedLaunchAPI api;

    public AggregatedLaunchManager(IAggregatedLaunchAPI iAggregatedLaunchAPI) {
        p.j(iAggregatedLaunchAPI, "api");
        this.api = iAggregatedLaunchAPI;
    }

    public static /* synthetic */ b fireAggregatedLaunchApi$default(AggregatedLaunchManager aggregatedLaunchManager, LaunchResponseHandler launchResponseHandler, SwiggyBaseResponseHandler swiggyBaseResponseHandler, UserResponseHandler userResponseHandler, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, boolean z11, a aVar, int i11, Object obj) {
        return aggregatedLaunchManager.fireAggregatedLaunchApi(launchResponseHandler, swiggyBaseResponseHandler, userResponseHandler, postableAggregatedLaunchRequest, (i11 & 16) != 0 ? false : z11, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: fireAggregatedLaunchApi$lambda-1  reason: not valid java name */
    public static final void m27fireAggregatedLaunchApi$lambda1(LaunchResponseHandler launchResponseHandler, SwiggyBaseResponseHandler swiggyBaseResponseHandler, UserResponseHandler userResponseHandler, Response response) {
        p.j(launchResponseHandler, "$foodLaunchResponseHandler");
        p.j(swiggyBaseResponseHandler, "$dashLaunchResponseHandler");
        p.j(userResponseHandler, "$userLaunchResponseHandler");
        AggregatedLaunchResponse aggregatedLaunchResponse = (AggregatedLaunchResponse) response.body();
        if (aggregatedLaunchResponse != null) {
            if (aggregatedLaunchResponse.getFoodLaunchData() != null) {
                launchResponseHandler.handleResponse(aggregatedLaunchResponse.copyFoodWithModifiedStatusCode());
            }
            if (aggregatedLaunchResponse.getDashLaunchData() != null) {
                swiggyBaseResponseHandler.handleResponse(aggregatedLaunchResponse.copyDashWithModifiedStatusCode());
            }
            if (aggregatedLaunchResponse.getUserLaunchData() != null) {
                userResponseHandler.handleResponse(aggregatedLaunchResponse.copyUserDataWithStatusCode());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fireAggregatedLaunchApi$lambda-2  reason: not valid java name */
    public static final void m28fireAggregatedLaunchApi$lambda2(Throwable th2) {
        d.x(th2);
    }

    public final b fireAggregatedLaunchApi(LaunchResponseHandler launchResponseHandler, SwiggyBaseResponseHandler<SwiggyApiResponse<LaunchResponse>> swiggyBaseResponseHandler, UserResponseHandler userResponseHandler, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, boolean z11, a aVar) {
        p.j(launchResponseHandler, "foodLaunchResponseHandler");
        p.j(swiggyBaseResponseHandler, "dashLaunchResponseHandler");
        p.j(userResponseHandler, "userLaunchResponseHandler");
        p.j(postableAggregatedLaunchRequest, "postableLaunchRequest");
        p.j(aVar, "completedListener");
        d<Response<AggregatedLaunchResponse>> Q = this.api.getAggregatedLaunchData(z11, postableAggregatedLaunchRequest).m0(wo0.a.c()).Q(do0.a.a());
        p.i(Q, "api.getAggregatedLaunchD…dSchedulers.mainThread())");
        b i02 = Q.i0(new a(launchResponseHandler, swiggyBaseResponseHandler, userResponseHandler), b.f20259a, aVar);
        p.i(i02, "observable.subscribe({\n …    }, completedListener)");
        return i02;
    }
}
