package in.swiggy.android.swiggylynx.plugin.location;

import bp0.k;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LocationHandler.kt */
/* synthetic */ class LocationHandler$onLocationChanged$3 extends FunctionReferenceImpl implements l<GeocodedAddress, k> {
    LocationHandler$onLocationChanged$3(Object obj) {
        super(1, obj, LocationHandler.class, "onGeocodeSavedAddress", "onGeocodeSavedAddress(Lin/swiggy/android/tejas/feature/google/googlereversegeocode/model/GeocodedAddress;)V", 0);
    }

    public final void h(GeocodedAddress geocodedAddress) {
        p.j(geocodedAddress, "p0");
        ((LocationHandler) this.receiver).t(geocodedAddress);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((GeocodedAddress) obj);
        return k.f22762a;
    }
}
