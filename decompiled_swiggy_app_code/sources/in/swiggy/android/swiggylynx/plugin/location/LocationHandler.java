package in.swiggy.android.swiggylynx.plugin.location;

import ag0.d;
import android.location.Location;
import androidx.databinding.ObservableField;
import androidx.databinding.k;
import cg0.n;
import com.google.android.gms.maps.model.LatLng;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateType;
import ef0.e;
import fp0.c;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.PostableUpdateAddress;
import in.swiggy.android.tejas.feature.address.model.UpdateAddress;
import in.swiggy.android.tejas.feature.address.v2.usecase.UpdateAddressUseCase;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.oldapi.models.enums.LocationType;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.f;
import lp0.l;
import os.d0;
import os.u;
import wp0.j0;
import wp0.k1;
import wp0.u0;
import yg0.g;
import yg0.h;
import yg0.j;

/* compiled from: LocationHandler.kt */
public final class LocationHandler {
    public static final b Companion = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final n f19127a;

    /* renamed from: b  reason: collision with root package name */
    private final eo0.a f19128b;

    /* renamed from: c  reason: collision with root package name */
    private final kg0.a f19129c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final e f19130d;

    /* renamed from: e  reason: collision with root package name */
    private final UpdateAddressUseCase f19131e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f19132f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final ReverseGeoCodeManager f19133g;

    /* renamed from: h  reason: collision with root package name */
    private k1 f19134h;

    /* renamed from: i  reason: collision with root package name */
    private Location f19135i;
    private final ObservableField<Location> j;

    /* compiled from: LocationHandler.kt */
    public static final class a extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocationHandler f19136a;

        a(LocationHandler locationHandler) {
            this.f19136a = locationHandler;
        }

        public void a(k kVar, int i11) {
            Location g11;
            p.j(kVar, "sender");
            if (this.f19136a.q() && (g11 = this.f19136a.r().g()) != null) {
                this.f19136a.v(g11);
            }
        }
    }

    /* compiled from: LocationHandler.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public LocationHandler(n nVar, eo0.a aVar, kg0.a aVar2, e eVar, UpdateAddressUseCase updateAddressUseCase, j0 j0Var, ReverseGeoCodeManager reverseGeoCodeManager) {
        p.j(nVar, "locationContext");
        p.j(aVar, "subscriptions");
        p.j(aVar2, "locationRefreshUtils");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(updateAddressUseCase, "updateAddressUseCase");
        p.j(j0Var, "coroutineScope");
        p.j(reverseGeoCodeManager, "reverseGeoCodeManager");
        this.f19127a = nVar;
        this.f19128b = aVar;
        this.f19129c = aVar2;
        this.f19130d = eVar;
        this.f19131e = updateAddressUseCase;
        this.f19132f = j0Var;
        this.f19133g = reverseGeoCodeManager;
        ObservableField<Location> observableField = new ObservableField<>();
        this.j = observableField;
        observableField.h(new a(this));
    }

    /* access modifiers changed from: private */
    public static final void A(Throwable th2) {
        u.h("LocationHandler", th2);
    }

    /* access modifiers changed from: private */
    public static final boolean B(LocationHandler locationHandler, Location location) {
        p.j(locationHandler, "this$0");
        p.j(location, "location");
        return !locationHandler.f19127a.X(location);
    }

    /* access modifiers changed from: private */
    public static final void C(LocationHandler locationHandler, Location location) {
        p.j(locationHandler, "this$0");
        p.j(location, "currentLocation");
        if (!locationHandler.f19129c.b()) {
            locationHandler.f19129c.g(true);
            locationHandler.w(location);
        }
    }

    /* access modifiers changed from: private */
    public static final void D(Throwable th2) {
        u.h("LocationHandler", th2);
    }

    /* access modifiers changed from: private */
    public static final boolean E(LocationHandler locationHandler, Location location) {
        p.j(locationHandler, "this$0");
        p.j(location, "location");
        return !locationHandler.f19127a.X(location);
    }

    /* access modifiers changed from: private */
    public static final void F(LocationHandler locationHandler, Location location) {
        p.j(locationHandler, "this$0");
        if (!locationHandler.f19129c.b()) {
            p.i(location, "currentLocation");
            locationHandler.w(location);
        }
    }

    /* access modifiers changed from: private */
    public static final void G(Throwable th2) {
        u.h("LocationHandler", th2);
    }

    /* access modifiers changed from: private */
    public final void H(LatLng latLng, GeocodedAddress geocodedAddress) {
        if (d.r(d.y(latLng))) {
            geocodedAddress.setLatitude(latLng.f43937a);
            geocodedAddress.setLongitude(latLng.f43938b);
        }
    }

    /* access modifiers changed from: private */
    public final boolean q() {
        if (!this.f19127a.X(this.j.g()) && !this.f19127a.Y1(this.j.g())) {
            return true;
        }
        return false;
    }

    private final void s(Location location, l<? super GeocodedAddress, bp0.k> lVar) {
        k1 unused = j.d(this.f19132f, u0.b(), (CoroutineStart) null, new LocationHandler$getGpsLocationDetails$1(location, this, lVar, (c<? super LocationHandler$getGpsLocationDetails$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void t(GeocodedAddress geocodedAddress) {
        PostableUpdateAddress postableUpdateAddress;
        if (d0.g(geocodedAddress.getCity()) && this.f19130d.o0()) {
            k1 k1Var = this.f19134h;
            if (k1Var != null) {
                k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
            }
            if (this.f19127a.w() == LocationType.ADDRESS) {
                Address p02 = this.f19127a.p0();
                if (p02 != null) {
                    p02.setCity(geocodedAddress.getCity());
                }
                if (p02 == null || (postableUpdateAddress = p02.generatePostableUpdatableAddressV2()) == null) {
                    postableUpdateAddress = null;
                } else {
                    postableUpdateAddress.setUserId(this.f19130d.getCustomerId());
                    postableUpdateAddress.setLaunchSource("geocode_edit_address_screen");
                }
                if (postableUpdateAddress != null) {
                    this.f19134h = f.B(f.E(this.f19131e.invoke(new UpdateAddress(postableUpdateAddress, UpdateType.UNRECOGNIZED)), new LocationHandler$onGeocodeSavedAddress$1$1(this, p02, (c<? super LocationHandler$onGeocodeSavedAddress$1$1>) null)), this.f19132f);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void u(GeocodedAddress geocodedAddress) {
        GooglePlace S0;
        if (d0.g(geocodedAddress.getCity()) && this.f19130d.o0() && this.f19127a.w() == LocationType.SEARCH && (S0 = this.f19127a.S0()) != null) {
            S0.setCity(geocodedAddress.getCity());
            this.f19130d.a();
        }
    }

    /* access modifiers changed from: private */
    public final void v(Location location) {
        GooglePlace S0;
        if (this.f19127a.w() == LocationType.GPS) {
            s(location, LocationHandler$onLocationChanged$1.f19148a);
        } else if (this.f19127a.w() == LocationType.SEARCH && (S0 = this.f19127a.S0()) != null && d0.e(S0.getCity())) {
            s(location, new LocationHandler$onLocationChanged$2(this));
        }
        if (this.f19127a.w() == LocationType.ADDRESS && d0.e(this.f19127a.getCity())) {
            s(location, new LocationHandler$onLocationChanged$3(this));
        }
    }

    private final void w(Location location) {
        this.f19135i = this.j.g();
        this.j.j(location);
    }

    /* access modifiers changed from: private */
    public static final boolean y(LocationHandler locationHandler, Location location) {
        p.j(locationHandler, "this$0");
        p.j(location, "location");
        return !locationHandler.f19127a.X(location);
    }

    /* access modifiers changed from: private */
    public static final void z(LocationHandler locationHandler, Location location) {
        p.j(locationHandler, "this$0");
        p.j(location, "location");
        locationHandler.f19127a.m2(false);
        locationHandler.w(location);
    }

    public final ObservableField<Location> r() {
        return this.j;
    }

    public final void x() {
        this.f19128b.c(this.f19127a.v().z(new yg0.k(this)).Q(do0.a.a()).h0(new yg0.e(this), h.f30037a));
        this.f19128b.c(this.f19127a.p1().z(new j(this)).Q(do0.a.a()).h0(new yg0.d(this), g.f30036a));
        this.f19128b.c(this.f19127a.C0().z(new yg0.i(this)).Q(do0.a.a()).h0(new yg0.c(this), yg0.f.f30035a));
    }
}
