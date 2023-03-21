package in.swiggy.android.swiggylocation.location;

import android.location.Location;
import androidx.core.util.d;
import com.google.android.gms.maps.model.LatLng;
import en.b;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LocationUtils */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static long f18901a;

    private static Location a(LatLng latLng) {
        Location location = new Location("someLoc");
        location.setLatitude(latLng.f43937a);
        location.setLongitude(latLng.f43938b);
        return location;
    }

    public static float b(LatLng latLng, LatLng latLng2) {
        return a(latLng).distanceTo(a(latLng2));
    }

    public static d<LatLng, Integer> c(LatLng latLng, List<LatLng> list) {
        int i11 = -1;
        if (latLng == null || list == null) {
            return new d<>(latLng, -1);
        }
        int i12 = 0;
        LatLng latLng2 = latLng;
        double d11 = -1.0d;
        while (i12 < list.size()) {
            LatLng latLng3 = list.get(i12);
            int i13 = i12 + 1;
            if (i13 >= list.size()) {
                break;
            }
            double c11 = b.c(latLng, latLng3, list.get(i13));
            if (d11 == -1.0d || c11 < d11) {
                latLng2 = d(latLng, latLng3, list.get(i13));
                i11 = i12;
                d11 = c11;
            }
            i12 = i13;
        }
        if (i11 >= 0) {
            int i14 = i11;
            double d12 = -1.0d;
            while (i11 < list.size()) {
                double b11 = (double) b(list.get(i11), latLng2);
                if (d12 == -1.0d || b11 < d12) {
                    i14 = i11;
                    d12 = b11;
                }
                i11++;
            }
            i11 = i14;
        }
        return new d<>(latLng2, Integer.valueOf(i11));
    }

    private static LatLng d(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
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

    static List<Address> e(List<Address> list, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Address next : list) {
            Integer sortScore = next.getSortScore();
            if (sortScore != null && sortScore.intValue() <= i11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static int f(List<Address> list, Address address) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                Address address2 = list.get(i11);
                if (address != null && address2 != null && address.getId().equals(address2.getId())) {
                    return i11 + 1;
                }
            }
        }
        return -1;
    }

    public static int g(List<Address> list, String str) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                Address address = list.get(i11);
                if (str != null && address != null && str.equals(address.getId())) {
                    return i11 + 1;
                }
            }
        }
        return -1;
    }

    public static String h() {
        return String.valueOf(System.currentTimeMillis() - f18901a);
    }

    static Address i(List<Address> list, int i11) {
        for (Address next : list) {
            Integer sortScore = next.getSortScore();
            if (sortScore != null && sortScore.intValue() <= i11) {
                return next;
            }
        }
        return null;
    }

    public static boolean j(LatLng latLng) {
        return (latLng == null || latLng.f43937a == 0.0d || latLng.f43938b == 0.0d) ? false : true;
    }

    public static boolean k(Location location, Location location2, int i11) {
        if (location == null && location2 == null) {
            return true;
        }
        if (location == null || location2 == null) {
            return false;
        }
        double doubleValue = BigDecimal.valueOf(location.getLatitude()).setScale(i11, RoundingMode.HALF_UP).doubleValue();
        double doubleValue2 = BigDecimal.valueOf(location2.getLatitude()).setScale(i11, RoundingMode.HALF_UP).doubleValue();
        double doubleValue3 = BigDecimal.valueOf(location.getLongitude()).setScale(i11, RoundingMode.HALF_UP).doubleValue();
        double doubleValue4 = BigDecimal.valueOf(location2.getLongitude()).setScale(i11, RoundingMode.HALF_UP).doubleValue();
        if (Double.compare(doubleValue, doubleValue2) == 0 && Double.compare(doubleValue3, doubleValue4) == 0) {
            return true;
        }
        return false;
    }

    public static void l() {
        f18901a = System.currentTimeMillis();
    }
}
