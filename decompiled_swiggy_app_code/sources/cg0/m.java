package cg0;

import android.location.LocationManager;
import androidx.appcompat.app.AppCompatActivity;
import in.swiggy.android.swiggylocation.location.CoroutineLocationProvider;
import in.swiggy.android.swiggylocation.location.LocationEvent;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: CoroutineLocationProvider.kt */
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18178a = a.f18179a;

    /* compiled from: CoroutineLocationProvider.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f18179a = new a();

        private a() {
        }

        public final m a(AppCompatActivity appCompatActivity) {
            p.j(appCompatActivity, "activity");
            return new CoroutineLocationProvider(appCompatActivity);
        }
    }

    d<LocationEvent> a(n nVar, LocationManager locationManager, LocationGps locationGps);
}
