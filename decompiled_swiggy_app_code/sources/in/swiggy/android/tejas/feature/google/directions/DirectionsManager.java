package in.swiggy.android.tejas.feature.google.directions;

import ao0.s;
import com.google.android.gms.maps.model.LatLng;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirection;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirection;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsLocationInfo;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsReqResponseKt;
import in.swiggy.android.tejas.feature.google.directionscache.api.SwiggyDirectionsRequest;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import js.c;
import kotlin.jvm.internal.p;
import retrofit2.Response;

/* compiled from: DirectionsManager.kt */
public final class DirectionsManager {
    private final String baseUrl;
    private final IDirectionsAPI directionsApi;
    private final ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> googleResponseTransformer;
    private final IDirectionsSwiggyApi swiggyDirectionsApi;
    private final ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> swiggyResponseTransformer;
    private final UrlSigner urlSigner;

    public DirectionsManager(String str, IDirectionsAPI iDirectionsAPI, IDirectionsSwiggyApi iDirectionsSwiggyApi, UrlSigner urlSigner2, ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> iTransformer, ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> iTransformer2) {
        p.j(str, "baseUrl");
        p.j(iDirectionsAPI, "directionsApi");
        p.j(iDirectionsSwiggyApi, "swiggyDirectionsApi");
        p.j(urlSigner2, "urlSigner");
        p.j(iTransformer, "googleResponseTransformer");
        p.j(iTransformer2, "swiggyResponseTransformer");
        this.baseUrl = str;
        this.directionsApi = iDirectionsAPI;
        this.swiggyDirectionsApi = iDirectionsSwiggyApi;
        this.urlSigner = urlSigner2;
        this.googleResponseTransformer = iTransformer;
        this.swiggyResponseTransformer = iTransformer2;
    }

    /* access modifiers changed from: private */
    /* renamed from: getDirections$lambda-1  reason: not valid java name */
    public static final boolean m18getDirections$lambda1(Response response) {
        p.j(response, "response");
        return response.isSuccessful();
    }

    /* access modifiers changed from: private */
    /* renamed from: getDirections$lambda-2  reason: not valid java name */
    public static final SwiggyDirectionsResponse m19getDirections$lambda2(Response response) {
        p.j(response, "response");
        return (SwiggyDirectionsResponse) response.body();
    }

    /* access modifiers changed from: private */
    /* renamed from: getDirections$lambda-3  reason: not valid java name */
    public static final boolean m20getDirections$lambda3(SwiggyDirectionsResponse swiggyDirectionsResponse) {
        p.j(swiggyDirectionsResponse, "response");
        List<SwiggyDirection> directions = swiggyDirectionsResponse.getDirections();
        return c.h(directions == null ? null : Boolean.valueOf(!directions.isEmpty()));
    }

    /* access modifiers changed from: private */
    /* renamed from: getDirections$lambda-4  reason: not valid java name */
    public static final boolean m21getDirections$lambda4(Response response) {
        p.j(response, "response");
        return response.isSuccessful();
    }

    /* access modifiers changed from: private */
    /* renamed from: getDirections$lambda-5  reason: not valid java name */
    public static final GoogleDirectionsResponse m22getDirections$lambda5(Response response) {
        p.j(response, "response");
        return (GoogleDirectionsResponse) response.body();
    }

    /* access modifiers changed from: private */
    /* renamed from: getDirections$lambda-6  reason: not valid java name */
    public static final boolean m23getDirections$lambda6(GoogleDirectionsResponse googleDirectionsResponse) {
        p.j(googleDirectionsResponse, "response");
        List<GoogleDirection> directions = googleDirectionsResponse.getDirections();
        return c.h(directions == null ? null : Boolean.valueOf(!directions.isEmpty()));
    }

    public final s<ArrayList<ArrayList<LatLng>>> getDirections(LatLng latLng, LatLng latLng2, List<LatLng> list, String str, String str2, boolean z11) {
        p.j(latLng, "origin");
        p.j(latLng2, "destination");
        p.j(list, "intermediateLatlngs");
        p.j(str, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(str2, "clientKey");
        if (z11) {
            IDirectionsSwiggyApi iDirectionsSwiggyApi = this.swiggyDirectionsApi;
            DirectionsLocationInfo directionsLocationInfo = new DirectionsLocationInfo(DirectionsReqResponseKt.toLocationInfo(latLng));
            DirectionsLocationInfo directionsLocationInfo2 = new DirectionsLocationInfo(DirectionsReqResponseKt.toLocationInfo(latLng2));
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new DirectionsLocationInfo(DirectionsReqResponseKt.toLocationInfo(list.get(i11))));
            }
            s<R> n = iDirectionsSwiggyApi.getDirections(new SwiggyDirectionsRequest("Swiggy-Android", directionsLocationInfo, directionsLocationInfo2, arrayList)).z(h.f20226a).N(d.f20222a).z(f.f20224a).d0().n(new b(this.swiggyResponseTransformer));
            p.i(n, "{\n            swiggyDire…mer::transform)\n        }");
            return n;
        }
        s<R> n11 = this.directionsApi.getDirections(this.urlSigner.getDirectionsSignedUrl(this.baseUrl, latLng, latLng2, list, str, str2)).z(g.f20225a).N(c.f20221a).z(e.f20223a).d0().n(new a(this.googleResponseTransformer));
        p.i(n11, "{\n            directions…mer::transform)\n        }");
        return n11;
    }
}
