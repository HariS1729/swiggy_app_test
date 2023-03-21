package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.c;
import com.newrelic.agent.android.harvest.HarvestTimer;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Calendar;

/* compiled from: TwilightManager */
class n {

    /* renamed from: d  reason: collision with root package name */
    private static n f1621d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1622a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f1623b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1624c = new a();

    /* compiled from: TwilightManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f1625a;

        /* renamed from: b  reason: collision with root package name */
        long f1626b;

        /* renamed from: c  reason: collision with root package name */
        long f1627c;

        /* renamed from: d  reason: collision with root package name */
        long f1628d;

        /* renamed from: e  reason: collision with root package name */
        long f1629e;

        /* renamed from: f  reason: collision with root package name */
        long f1630f;

        a() {
        }
    }

    n(Context context, LocationManager locationManager) {
        this.f1622a = context;
        this.f1623b = locationManager;
    }

    static n a(Context context) {
        if (f1621d == null) {
            Context applicationContext = context.getApplicationContext();
            f1621d = new n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1621d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c11 = c.c(this.f1622a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c(LogSubCategory.ApiCall.NETWORK) : null;
        if (c.c(this.f1622a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c11 == null) ? location != null ? location : c11 : location.getTime() > c11.getTime() ? location : c11;
    }

    private Location c(String str) {
        try {
            if (this.f1623b.isProviderEnabled(str)) {
                return this.f1623b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e11) {
            Log.d("TwilightManager", "Failed to get last known location", e11);
            return null;
        }
    }

    private boolean e() {
        return this.f1624c.f1630f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.f1624c;
        long currentTimeMillis = System.currentTimeMillis();
        m b11 = m.b();
        m mVar = b11;
        mVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b11.f1618a;
        mVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z11 = b11.f1620c == 1;
        long j12 = b11.f1619b;
        long j13 = j11;
        long j14 = b11.f1618a;
        long j15 = j12;
        boolean z12 = z11;
        b11.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j16 = b11.f1619b;
        if (j15 == -1 || j14 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j14 ? 0 + j16 : currentTimeMillis > j15 ? 0 + j14 : 0 + j15) + HarvestTimer.DEFAULT_HARVEST_PERIOD;
        }
        aVar.f1625a = z12;
        aVar.f1626b = j13;
        aVar.f1627c = j15;
        aVar.f1628d = j14;
        aVar.f1629e = j16;
        aVar.f1630f = j;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f1624c;
        if (e()) {
            return aVar.f1625a;
        }
        Location b11 = b();
        if (b11 != null) {
            f(b11);
            return aVar.f1625a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i11 = Calendar.getInstance().get(11);
        return i11 < 6 || i11 >= 22;
    }
}
