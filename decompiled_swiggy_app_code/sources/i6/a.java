package i6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.newrelic.agent.android.payload.PayloadController;
import zj.f;

/* compiled from: LocationServiceImpl */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static a f15122f;

    /* renamed from: a  reason: collision with root package name */
    private final d f15123a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b6.d f15124b;

    /* renamed from: c  reason: collision with root package name */
    private final g f15125c = new C0139a();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Location f15126d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Context f15127e;

    /* renamed from: i6.a$a  reason: collision with other inner class name */
    /* compiled from: LocationServiceImpl */
    class C0139a extends g {
        C0139a() {
        }

        public void onLocationResult(LocationResult locationResult) {
            if (a.this.f15124b != null) {
                a.this.f15124b.a(locationResult.M());
            }
        }
    }

    /* compiled from: LocationServiceImpl */
    class b implements f<Location> {
        b() {
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            if (location != null) {
                Location unused = a.this.f15126d = location;
            }
        }
    }

    private a(Context context) {
        this.f15127e = context;
        this.f15123a = i.b(context.getApplicationContext());
    }

    public static a d(Context context) {
        if (f15122f == null) {
            f15122f = new a(context);
        }
        return f15122f;
    }

    @SuppressLint({"MissingPermission"})
    public Location a() {
        try {
            this.f15123a.b().i(new b());
        } catch (NoClassDefFoundError e11) {
            e11.getMessage();
        }
        return this.f15126d;
    }

    public void e(b6.d dVar) {
        this.f15124b = dVar;
    }

    public boolean f() {
        return ((LocationManager) this.f15127e.getSystemService("location")).isProviderEnabled("gps");
    }

    @SuppressLint({"MissingPermission"})
    public void g() {
        try {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.H0(PayloadController.PAYLOAD_COLLECTOR_TIMEOUT);
            locationRequest.x0(1000);
            locationRequest.N0(500);
            locationRequest.S0(100);
            new LocationSettingsRequest.a().a(locationRequest);
            this.f15123a.d(locationRequest, this.f15125c, Looper.getMainLooper());
        } catch (NoClassDefFoundError e11) {
            e11.getMessage();
        }
    }

    public void h() {
        try {
            d dVar = this.f15123a;
            if (dVar != null) {
                dVar.c(this.f15125c);
            }
        } catch (NoClassDefFoundError e11) {
            e11.getMessage();
        }
    }
}
