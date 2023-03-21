package in.swiggy.android.tejas.feature.google.directions.transformer;

import com.google.android.gms.maps.model.LatLng;
import i20.t;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirection;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionPolyline;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import js.c;
import kotlin.jvm.internal.p;

/* compiled from: GoogleDirectionsTransformer.kt */
public final class GoogleDirectionsTransformer implements ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> {
    private final DirectionsTransformerUtil directionsTransformerUtil;

    public GoogleDirectionsTransformer(DirectionsTransformerUtil directionsTransformerUtil2) {
        p.j(directionsTransformerUtil2, "directionsTransformerUtil");
        this.directionsTransformerUtil = directionsTransformerUtil2;
    }

    public ArrayList<ArrayList<LatLng>> transform(GoogleDirectionsResponse googleDirectionsResponse) {
        List<GoogleDirection> directions;
        p.j(googleDirectionsResponse, t.V);
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        List<GoogleDirection> directions2 = googleDirectionsResponse.getDirections();
        if (c.h(directions2 == null ? null : Boolean.valueOf(!directions2.isEmpty())) && (directions = googleDirectionsResponse.getDirections()) != null) {
            for (GoogleDirection directionPolyline : directions) {
                DirectionsTransformerUtil directionsTransformerUtil2 = this.directionsTransformerUtil;
                GoogleDirectionPolyline directionPolyline2 = directionPolyline.getDirectionPolyline();
                arrayList.add(directionsTransformerUtil2.getInterpolatedPath(directionPolyline2 == null ? null : directionPolyline2.getEncodedPolyline()));
            }
        }
        return arrayList;
    }
}
