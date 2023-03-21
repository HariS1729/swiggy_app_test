package in.swiggy.android.tejas.feature.google.directionscache.api;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsReqResponse.kt */
public final class DirectionsReqResponseKt {
    public static final SwiggyDirectionsRequest getSwiggyDirectionsRequest(DirectionsRequest directionsRequest) {
        p.j(directionsRequest, "<this>");
        DirectionsLocationInfo directionsLocationInfo = new DirectionsLocationInfo(toLocationInfo(directionsRequest.getDeliveryBoyLatLng()));
        DirectionsLocationInfo directionsLocationInfo2 = new DirectionsLocationInfo(toLocationInfo(directionsRequest.getCustomerLatLng()));
        int size = directionsRequest.getWayPoints().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DirectionsLocationInfo(toLocationInfo(directionsRequest.getWayPoints().get(i11))));
        }
        return new SwiggyDirectionsRequest("Swiggy-Android", directionsLocationInfo, directionsLocationInfo2, arrayList);
    }

    public static final LocationInfo toLocationInfo(LatLng latLng) {
        p.j(latLng, "<this>");
        return new LocationInfo(latLng.f43937a, latLng.f43938b);
    }
}
