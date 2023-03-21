package in.swiggy.android.swiggylocation.location;

import android.location.Location;
import android.location.LocationManager;
import cg0.n;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import yp0.q;
import zj.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f18903a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f18904b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LocationGps f18905c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LocationManager f18906d;

    public /* synthetic */ e(q qVar, n nVar, LocationGps locationGps, LocationManager locationManager) {
        this.f18903a = qVar;
        this.f18904b = nVar;
        this.f18905c = locationGps;
        this.f18906d = locationManager;
    }

    public final void onSuccess(Object obj) {
        LocationUtilsKt$singleLocation$1.i(this.f18903a, this.f18904b, this.f18905c, this.f18906d, (Location) obj);
    }
}
