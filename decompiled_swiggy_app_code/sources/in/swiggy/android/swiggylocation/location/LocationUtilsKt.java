package in.swiggy.android.swiggylocation.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.os.CountDownTimer;
import android.os.SystemClock;
import bp0.f;
import bp0.k;
import cg0.n;
import cg0.u0;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import lp0.l;
import okhttp3.internal.http2.Http2Connection;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;

/* compiled from: LocationUtils.kt */
public final class LocationUtilsKt {
    public static final String a(LatLng latLng) {
        p.j(latLng, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(latLng.f43937a);
        sb2.append(',');
        sb2.append(latLng.f43938b);
        return sb2.toString();
    }

    public static final String b(Location location) {
        p.j(location, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(location.getLatitude());
        sb2.append(',');
        sb2.append(location.getLongitude());
        return sb2.toString();
    }

    public static final f<CountDownTimer> c(long j, long j11, lp0.p<? super Long, ? super Integer, k> pVar, l<? super Long, k> lVar, Integer num) {
        p.j(pVar, "onTick");
        return b.b(new LocationUtilsKt$initCountDownTimer$1(j, j11, num, lVar, pVar));
    }

    public static /* synthetic */ f d(long j, long j11, lp0.p pVar, l lVar, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1000;
        }
        return c(j, j11, pVar, (i11 & 8) != 0 ? null : lVar, (i11 & 16) != 0 ? null : num);
    }

    @SuppressLint({"MissingPermission"})
    public static final d<LocationEvent> e(com.google.android.gms.location.d dVar, n nVar, LocationManager locationManager, LocationGps locationGps) {
        p.j(dVar, "<this>");
        p.j(nVar, "locationContext");
        p.j(locationManager, "locationManager");
        p.j(locationGps, "locationGps");
        return kotlinx.coroutines.flow.f.x(new LocationUtilsKt$locationFlow$1(locationGps, dVar, nVar, locationManager, (c<? super LocationUtilsKt$locationFlow$1>) null));
    }

    public static final u0 f(Location location, LocationGps locationGps, boolean z11, String str) {
        p.j(location, "<this>");
        p.j(locationGps, "xpFlag");
        p.j(str, "originalPing");
        return new u0(b(location), (String) null, String.valueOf(i(location)), z11 ? PDPrintFieldAttributeObject.CHECKED_STATE_ON : PDPrintFieldAttributeObject.CHECKED_STATE_OFF, locationGps, str, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 32706, (i) null);
    }

    public static /* synthetic */ u0 g(Location location, LocationGps locationGps, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            str = "no";
        }
        return f(location, locationGps, z11, str);
    }

    @SuppressLint({"MissingPermission"})
    public static final d<LocationEvent> h(com.google.android.gms.location.d dVar, n nVar, LocationManager locationManager, LocationGps locationGps) {
        p.j(dVar, "<this>");
        p.j(nVar, "locationContext");
        p.j(locationManager, "locationManager");
        p.j(locationGps, "locationGps");
        return kotlinx.coroutines.flow.f.e(new LocationUtilsKt$singleLocation$1(dVar, nVar, locationGps, locationManager, (c<? super LocationUtilsKt$singleLocation$1>) null));
    }

    public static final long i(Location location) {
        p.j(location, "<this>");
        return (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }
}
