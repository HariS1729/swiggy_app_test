package in.swiggy.android.tejas.feature.google.directions.transformer;

import com.google.android.gms.maps.model.LatLng;
import i20.t;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionPolyline;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirection;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import js.c;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyDirectionsTransformer.kt */
public final class SwiggyDirectionsTransformer implements ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> {
    private final DirectionsTransformerUtil directionsTransformerUtil;

    public SwiggyDirectionsTransformer(DirectionsTransformerUtil directionsTransformerUtil2) {
        p.j(directionsTransformerUtil2, "directionsTransformerUtil");
        this.directionsTransformerUtil = directionsTransformerUtil2;
    }

    public ArrayList<ArrayList<LatLng>> transform(SwiggyDirectionsResponse swiggyDirectionsResponse) {
        List<SwiggyDirection> directions;
        p.j(swiggyDirectionsResponse, t.V);
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        List<SwiggyDirection> directions2 = swiggyDirectionsResponse.getDirections();
        if (c.h(directions2 == null ? null : Boolean.valueOf(!directions2.isEmpty())) && (directions = swiggyDirectionsResponse.getDirections()) != null) {
            for (SwiggyDirection directionPolyline : directions) {
                DirectionsTransformerUtil directionsTransformerUtil2 = this.directionsTransformerUtil;
                GoogleDirectionPolyline directionPolyline2 = directionPolyline.getDirectionPolyline();
                arrayList.add(directionsTransformerUtil2.getInterpolatedPath(directionPolyline2 == null ? null : directionPolyline2.getEncodedPolyline()));
            }
        }
        return arrayList;
    }
}
