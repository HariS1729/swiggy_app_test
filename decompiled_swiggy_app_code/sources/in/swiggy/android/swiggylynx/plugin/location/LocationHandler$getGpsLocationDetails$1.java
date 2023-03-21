package in.swiggy.android.swiggylynx.plugin.location;

import android.location.Location;
import bp0.g;
import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.h;
import wp0.j0;
import wp0.t1;
import wp0.u0;

@d(c = "in.swiggy.android.swiggylynx.plugin.location.LocationHandler$getGpsLocationDetails$1", f = "LocationHandler.kt", l = {144, 146}, m = "invokeSuspend")
/* compiled from: LocationHandler.kt */
final class LocationHandler$getGpsLocationDetails$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f19137a;

    /* renamed from: b  reason: collision with root package name */
    int f19138b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Location f19139c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LocationHandler f19140d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<GeocodedAddress, k> f19141e;

    @d(c = "in.swiggy.android.swiggylynx.plugin.location.LocationHandler$getGpsLocationDetails$1$1", f = "LocationHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: in.swiggy.android.swiggylynx.plugin.location.LocationHandler$getGpsLocationDetails$1$1  reason: invalid class name */
    /* compiled from: LocationHandler.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f19142a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(lVar, geocodedAddress, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = b.d();
            if (this.f19142a == 0) {
                g.b(obj);
                lVar.invoke(geocodedAddress);
                return k.f22762a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationHandler$getGpsLocationDetails$1(Location location, LocationHandler locationHandler, l<? super GeocodedAddress, k> lVar, c<? super LocationHandler$getGpsLocationDetails$1> cVar) {
        super(2, cVar);
        this.f19139c = location;
        this.f19140d = locationHandler;
        this.f19141e = lVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LocationHandler$getGpsLocationDetails$1(this.f19139c, this.f19140d, this.f19141e, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((LocationHandler$getGpsLocationDetails$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        LatLng latLng;
        Object d11 = b.d();
        int i11 = this.f19138b;
        if (i11 == 0) {
            g.b(obj);
            latLng = new LatLng(this.f19139c.getLatitude(), this.f19139c.getLongitude());
            ReverseGeoCodeManager k = this.f19140d.f19133g;
            this.f19137a = latLng;
            this.f19138b = 1;
            obj = ReverseGeoCodeManager.e(k, latLng, (String) null, this, 2, (Object) null);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            latLng = (LatLng) this.f19137a;
            g.b(obj);
        } else if (i11 == 2) {
            g.b(obj);
            return k.f22762a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final GeocodedAddress geocodedAddress = (GeocodedAddress) obj;
        this.f19140d.H(latLng, geocodedAddress);
        t1 c11 = u0.c();
        final l<GeocodedAddress, k> lVar = this.f19141e;
        AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        this.f19137a = null;
        this.f19138b = 2;
        if (h.g(c11, r32, this) == d11) {
            return d11;
        }
        return k.f22762a;
    }
}
