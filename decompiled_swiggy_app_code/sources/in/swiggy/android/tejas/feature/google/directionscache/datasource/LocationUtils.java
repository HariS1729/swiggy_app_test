package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import android.location.Location;
import androidx.core.util.d;
import com.google.android.gms.maps.model.LatLng;
import en.b;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class LocationUtils {
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    public static /* synthetic */ d findNearestPoint$default(LocationUtils locationUtils, LatLng latLng, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLng = null;
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        return locationUtils.findNearestPoint(latLng, list);
    }

    public final Location convertLatLngToLocation(LatLng latLng) {
        p.j(latLng, "latLng");
        Location location = new Location("someLoc");
        location.setLatitude(latLng.f43937a);
        location.setLongitude(latLng.f43938b);
        return location;
    }

    public final float distanceBetweenLatLng(LatLng latLng, LatLng latLng2) {
        p.j(latLng, "startLatLng");
        p.j(latLng2, "endLatLng");
        return convertLatLngToLocation(latLng).distanceTo(convertLatLngToLocation(latLng2));
    }

    public final float distanceTo(LatLng latLng, LatLng latLng2) {
        p.j(latLng, "<this>");
        if (latLng2 == null) {
            return 0.0f;
        }
        return toLocation(latLng).distanceTo(toLocation(latLng2));
    }

    public final d<LatLng, Integer> findNearestPoint(LatLng latLng, List<LatLng> list) {
        LatLng latLng2 = latLng;
        List<LatLng> list2 = list;
        if (latLng2 == null || list2 == null) {
            return new d<>(null, -1);
        }
        int size = list.size();
        LatLng latLng3 = latLng2;
        double d11 = -1.0d;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            boolean z11 = true;
            if (i11 >= size) {
                break;
            }
            int i13 = i11 + 1;
            LatLng latLng4 = list2.get(i11);
            if (i13 >= list.size()) {
                break;
            }
            double c11 = b.c(latLng2, latLng4, list2.get(i13));
            if (d11 != -1.0d) {
                z11 = false;
            }
            if (z11 || c11 < d11) {
                latLng3 = findNearestPoint(latLng2, latLng4, list2.get(i13));
                i12 = i11;
                i11 = i13;
                d11 = c11;
            } else {
                i11 = i13;
            }
        }
        if (i12 >= 0) {
            int size2 = list.size();
            double d12 = -1.0d;
            int i14 = i12;
            while (i12 < size2) {
                int i15 = i12 + 1;
                double distanceBetweenLatLng = (double) distanceBetweenLatLng(list2.get(i12), latLng3);
                if ((d12 == -1.0d) || distanceBetweenLatLng < d12) {
                    i14 = i12;
                    d12 = distanceBetweenLatLng;
                }
                i12 = i15;
            }
            i12 = i14;
        }
        return new d<>(latLng3, Integer.valueOf(i12));
    }

    public final Location toLocation(LatLng latLng) {
        p.j(latLng, "<this>");
        Location location = new Location("Darth");
        location.setLatitude(latLng.f43937a);
        location.setLongitude(latLng.f43938b);
        return location;
    }

    private final LatLng findNearestPoint(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (p.e(latLng2, latLng3)) {
            return latLng2;
        }
        double radians = Math.toRadians(latLng.f43937a);
        double radians2 = Math.toRadians(latLng.f43938b);
        double radians3 = Math.toRadians(latLng2.f43937a);
        double radians4 = Math.toRadians(latLng2.f43938b);
        double radians5 = Math.toRadians(latLng3.f43937a) - radians3;
        double radians6 = Math.toRadians(latLng3.f43938b) - radians4;
        double d11 = (((radians - radians3) * radians5) + ((radians2 - radians4) * radians6)) / ((radians5 * radians5) + (radians6 * radians6));
        if (d11 <= 0.0d) {
            return latLng2;
        }
        if (d11 >= 1.0d) {
            return latLng3;
        }
        double d12 = latLng2.f43937a;
        double d13 = d12 + ((latLng3.f43937a - d12) * d11);
        double d14 = latLng2.f43938b;
        return new LatLng(d13, d14 + (d11 * (latLng3.f43938b - d14)));
    }
}
