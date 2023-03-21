package in.swiggy.android.tejas.feature.google.directions.transformer;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DirectionsTransformerUtil.kt */
public final class DirectionsTransformerUtil {
    private final float computeDistance(LatLng latLng, LatLng latLng2) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double d11 = latLng3.f43937a;
        double d12 = latLng3.f43938b;
        double d13 = latLng4.f43937a;
        double d14 = (latLng4.f43938b * 0.017453292519943295d) - (d12 * 0.017453292519943295d);
        double atan = Math.atan(Math.tan(d11 * 0.017453292519943295d) * 0.996647189328169d);
        double atan2 = Math.atan(0.996647189328169d * Math.tan(d13 * 0.017453292519943295d));
        double cos = Math.cos(atan);
        double cos2 = Math.cos(atan2);
        double sin = Math.sin(atan);
        double sin2 = Math.sin(atan2);
        double d15 = cos * cos2;
        double d16 = sin * sin2;
        double d17 = d14;
        int i11 = 0;
        double d18 = 0.0d;
        double d19 = 0.0d;
        double d21 = 0.0d;
        while (i11 < 20) {
            i11++;
            double cos3 = Math.cos(d17);
            double sin3 = Math.sin(d17);
            double d22 = cos2 * sin3;
            double d23 = (cos * sin2) - ((sin * cos2) * cos3);
            double d24 = sin;
            double sqrt = Math.sqrt((d22 * d22) + (d23 * d23));
            double d25 = sin2;
            double d26 = d16 + (cos3 * d15);
            d19 = Math.atan2(sqrt, d26);
            double d27 = (sqrt > 0.0d ? 1 : (sqrt == 0.0d ? 0 : -1)) == 0 ? 0.0d : (sin3 * d15) / sqrt;
            double d28 = 1.0d - (d27 * d27);
            double d29 = (d28 > 0.0d ? 1 : (d28 == 0.0d ? 0 : -1)) == 0 ? 0.0d : d26 - ((d16 * 2.0d) / d28);
            double d31 = 0.006739496756586903d * d28;
            double d32 = cos;
            double d33 = cos2;
            double d34 = (d31 / 1024.0d) * ((d31 * (((74.0d - (47.0d * d31)) * d31) - 0.03125d)) + 256.0d);
            double d35 = 2.0955066698943685E-4d * d28 * (((4.0d - (d28 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d36 = d29 * d29;
            double d37 = d14 + ((1.0d - d35) * 0.0033528106718309896d * d27 * (d19 + (sqrt * d35 * (d29 + (d35 * d26 * (((2.0d * d29) * d29) - 4.0d))))));
            d18 = ((double) 1) + ((d31 / 16384.0d) * (((((double) -768) + ((320.0d - (175.0d * d31)) * d31)) * d31) + 4096.0d));
            d21 = d34 * sqrt * (d29 + ((d34 / 4.0d) * ((((d36 * 2.0d) - 4.0d) * d26) - ((((d34 / 6.0d) * d29) * (((sqrt * 4.0d) * sqrt) - 1.5d)) * ((d36 * 4.0d) - 1.5d)))));
            if (Math.abs((d37 - d17) / d37) < 1.0E-12d) {
                break;
            }
            sin = d24;
            sin2 = d25;
            d17 = d37;
            cos = d32;
            cos2 = d33;
        }
        return (float) (6356752.3142d * d18 * (d19 - d21));
    }

    private final List<LatLng> decodeEncodedPolyLine(String str) {
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            int length = str.length();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length) {
                int i16 = 1;
                int i17 = 0;
                while (true) {
                    i11 = i13 + 1;
                    int charAt = (str.charAt(i13) - '?') - 1;
                    i16 += charAt << i17;
                    i17 += 5;
                    if (charAt < 31) {
                        break;
                    }
                    i13 = i11;
                }
                int i18 = ((i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1) + i14;
                int i19 = 1;
                int i21 = 0;
                while (true) {
                    i12 = i11 + 1;
                    int charAt2 = (str.charAt(i11) - '?') - 1;
                    i19 += charAt2 << i21;
                    i21 += 5;
                    if (charAt2 < 31) {
                        break;
                    }
                    i11 = i12;
                }
                int i22 = i19 & 1;
                int i23 = i19 >> 1;
                if (i22 != 0) {
                    i23 = ~i23;
                }
                i15 += i23;
                arrayList.add(new LatLng(((double) i18) * 1.0E-5d, ((double) i15) * 1.0E-5d));
                i14 = i18;
                i13 = i12;
            }
        }
        return arrayList;
    }

    private final LatLng interpolate(float f11, LatLng latLng, LatLng latLng2) {
        double d11 = latLng2.f43937a;
        double d12 = latLng.f43937a;
        double d13 = (double) f11;
        double d14 = ((d11 - d12) * d13) + d12;
        double d15 = latLng2.f43938b;
        double d16 = latLng.f43938b;
        return new LatLng(d14, ((d15 - d16) * d13) + d16);
    }

    public final ArrayList<LatLng> getInterpolatedPath(String str) {
        List<LatLng> decodeEncodedPolyLine = decodeEncodedPolyLine(str);
        ArrayList<LatLng> arrayList = new ArrayList<>();
        int size = decodeEncodedPolyLine.size();
        int i11 = 1;
        while (i11 < size) {
            int i12 = i11 + 1;
            LatLng latLng = decodeEncodedPolyLine.get(i11 - 1);
            LatLng latLng2 = decodeEncodedPolyLine.get(i11);
            float computeDistance = computeDistance(latLng, latLng2) / ((float) 5);
            int i13 = (int) computeDistance;
            if (1 <= i13) {
                int i14 = 1;
                while (true) {
                    int i15 = i14 + 1;
                    arrayList.add(interpolate(((float) i14) / computeDistance, latLng, latLng2));
                    if (i14 == i13) {
                        break;
                    }
                    i14 = i15;
                }
            }
            i11 = i12;
        }
        return arrayList;
    }
}
