package in.swiggy.android.swiggylynx.plugin.location;

import bp0.k;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LocationHandler.kt */
final class LocationHandler$onLocationChanged$1 extends Lambda implements l<GeocodedAddress, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final LocationHandler$onLocationChanged$1 f19148a = new LocationHandler$onLocationChanged$1();

    LocationHandler$onLocationChanged$1() {
        super(1);
    }

    public final void a(GeocodedAddress geocodedAddress) {
        p.j(geocodedAddress, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((GeocodedAddress) obj);
        return k.f22762a;
    }
}
