package in.swiggy.android.swiggylocation.location;

import android.location.LocationManager;
import androidx.appcompat.app.AppCompatActivity;
import bp0.f;
import cg0.m;
import cg0.n;
import com.google.android.gms.location.d;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.jvm.internal.p;

/* compiled from: CoroutineLocationProvider.kt */
public final class CoroutineLocationProvider implements m {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatActivity f18802b;

    /* renamed from: c  reason: collision with root package name */
    private final f f18803c = b.b(new CoroutineLocationProvider$fusedProviderClient$2(this));

    public CoroutineLocationProvider(AppCompatActivity appCompatActivity) {
        p.j(appCompatActivity, "activity");
        this.f18802b = appCompatActivity;
    }

    private final d c() {
        Object value = this.f18803c.getValue();
        p.i(value, "<get-fusedProviderClient>(...)");
        return (d) value;
    }

    public kotlinx.coroutines.flow.d<LocationEvent> a(n nVar, LocationManager locationManager, LocationGps locationGps) {
        kotlinx.coroutines.flow.d<LocationEvent> dVar;
        p.j(nVar, "locationContext");
        p.j(locationManager, "locationManager");
        p.j(locationGps, "locationGps");
        if (locationGps.getLocAccuracy() <= 0.0f || locationGps.getLocAttempts() <= 1) {
            dVar = LocationUtilsKt.h(c(), nVar, locationManager, locationGps);
        } else {
            dVar = LocationUtilsKt.e(c(), nVar, locationManager, locationGps);
        }
        return kotlinx.coroutines.flow.f.A(dVar, DispatchProviderKt.a().D());
    }
}
