package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import fp0.c;
import in.swiggy.android.tejas.BuildConfig;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.dao.RemoteDataSource;
import in.swiggy.android.tejas.feature.google.directions.DirectionsModule;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsReqResponseKt;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsGoogleApi;
import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsSwiggyApi;
import in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer;
import in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: DirectionsRemoteDataSource.kt */
public final class DirectionsRemoteDataSource implements RemoteDataSource<DirectionsRequest, DirectionsResponse> {
    private final IDirectionsGoogleApi googleApi;
    private final GoogleDirectionsTransformer googleDirectionsTransformer;
    private final IDirectionsSwiggyApi swiggyApi;
    private final SwiggyDirectionsTransformer swiggyDirectionsTransformer;
    private final UrlSigner urlSigner;

    public DirectionsRemoteDataSource(IDirectionsGoogleApi iDirectionsGoogleApi, IDirectionsSwiggyApi iDirectionsSwiggyApi, UrlSigner urlSigner2, GoogleDirectionsTransformer googleDirectionsTransformer2, SwiggyDirectionsTransformer swiggyDirectionsTransformer2) {
        p.j(iDirectionsGoogleApi, "googleApi");
        p.j(iDirectionsSwiggyApi, "swiggyApi");
        p.j(urlSigner2, "urlSigner");
        p.j(googleDirectionsTransformer2, "googleDirectionsTransformer");
        p.j(swiggyDirectionsTransformer2, "swiggyDirectionsTransformer");
        this.googleApi = iDirectionsGoogleApi;
        this.swiggyApi = iDirectionsSwiggyApi;
        this.urlSigner = urlSigner2;
        this.googleDirectionsTransformer = googleDirectionsTransformer2;
        this.swiggyDirectionsTransformer = swiggyDirectionsTransformer2;
    }

    /* access modifiers changed from: private */
    public final d<Response<DirectionsResponse>> getGoogleRemoteDirections(DirectionsRequest directionsRequest) {
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.googleApi.getDirections(this.urlSigner.getDirectionsSignedUrl(DirectionsModule.GOOGLE_API_END_POINT, directionsRequest.getDeliveryBoyLatLng(), directionsRequest.getCustomerLatLng(), directionsRequest.getWayPoints(), BuildConfig.GOOGLE_CLIENT_ID, BuildConfig.GOOGLE_CLIENT_KEY)), false, (IErrorChecker) null, this.googleDirectionsTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 52, (Object) null);
    }

    private final d<Response<DirectionsResponse>> getSwiggyRemoteDirections(DirectionsRequest directionsRequest) {
        return f.v(ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.swiggyApi.getDirections(DirectionsReqResponseKt.getSwiggyDirectionsRequest(directionsRequest)), false, (IErrorChecker) null, this.swiggyDirectionsTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null), new DirectionsRemoteDataSource$getSwiggyRemoteDirections$1(this, directionsRequest, (c<? super DirectionsRemoteDataSource$getSwiggyRemoteDirections$1>) null));
    }

    public d<Response<DirectionsResponse>> getRemoteResponse(DirectionsRequest directionsRequest) {
        p.j(directionsRequest, "requestParams");
        if (directionsRequest.getSwiggyDirectionsXpValue()) {
            return getSwiggyRemoteDirections(directionsRequest);
        }
        return getGoogleRemoteDirections(directionsRequest);
    }
}
