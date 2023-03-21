package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirection;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponseKt;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;
import okhttp3.ResponseBody;

/* compiled from: SwiggyDirectionsTransformer.kt */
public final class SwiggyDirectionsTransformer extends DirectionsTransformer<SwiggyDirectionsResponse, DirectionsResponse> {
    /* access modifiers changed from: protected */
    public d<Response<DirectionsResponse>> execute(SwiggyDirectionsResponse swiggyDirectionsResponse) {
        if ((swiggyDirectionsResponse == null ? null : swiggyDirectionsResponse.getDirections()) != null) {
            List<SwiggyDirection> directions = swiggyDirectionsResponse.getDirections();
            boolean z11 = false;
            if (directions != null && directions.isEmpty()) {
                z11 = true;
            }
            if (!z11) {
                return f.x(new SwiggyDirectionsTransformer$execute$1(swiggyDirectionsResponse, this, new ArrayList(), (c<? super SwiggyDirectionsTransformer$execute$1>) null));
            }
        }
        return f.y(ResponseTransformerManager.buildFailureResponse$default(ResponseTransformerManager.INSTANCE, (retrofit2.Response) null, (Object) null, (ResponseBody) null, SwiggyDirectionsResponseKt.SWIGGY_DIRECTIONS_ERROR, 7, (Object) null));
    }
}
