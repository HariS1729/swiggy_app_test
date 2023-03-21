package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirection;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;
import okhttp3.ResponseBody;

/* compiled from: GoogleDirectionsTransformer.kt */
public final class GoogleDirectionsTransformer extends DirectionsTransformer<GoogleDirectionsResponse, DirectionsResponse> {
    /* access modifiers changed from: protected */
    public d<Response<DirectionsResponse>> execute(GoogleDirectionsResponse googleDirectionsResponse) {
        String str = null;
        if ((googleDirectionsResponse == null ? null : googleDirectionsResponse.getDirections()) != null) {
            List<GoogleDirection> directions = googleDirectionsResponse.getDirections();
            boolean z11 = false;
            if (directions != null && directions.isEmpty()) {
                z11 = true;
            }
            if (!z11) {
                return f.x(new GoogleDirectionsTransformer$execute$1(googleDirectionsResponse, this, new ArrayList(), (c<? super GoogleDirectionsTransformer$execute$1>) null));
            }
        }
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        if (googleDirectionsResponse != null) {
            str = googleDirectionsResponse.getStatus();
        }
        return f.y(ResponseTransformerManager.buildFailureResponse$default(responseTransformerManager, (retrofit2.Response) null, (Object) null, (ResponseBody) null, str, 7, (Object) null));
    }
}
