package in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer;

import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.transformer.ITransformer;

/* compiled from: GoogleReverseGeocodeTransformer.kt */
public final class GoogleReverseGeocodeTransformer extends GooglePlaceTransformer implements ITransformer<GooglePlaceList, GeocodedAddress> {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r0 == null ? false : !r0.isEmpty()) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress transform(in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList r4) {
        /*
            r3 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.p.j(r4, r0)
            java.util.List r0 = r4.getPlaces()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            java.util.List r0 = r4.getPlaces()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x001a
        L_0x0015:
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r0 = 0
            if (r1 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r4 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            java.util.List r4 = r4.getPlaces()
            if (r4 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            java.lang.Object r4 = r4.get(r2)
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace r4 = (in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace) r4
            if (r4 != 0) goto L_0x0036
        L_0x0035:
            return r0
        L_0x0036:
            r3.process(r4)
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress r0 = new in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress
            r0.<init>((in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer.GoogleReverseGeocodeTransformer.transform(in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList):in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress");
    }
}
