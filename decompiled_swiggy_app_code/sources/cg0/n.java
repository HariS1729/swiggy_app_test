package cg0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import ao0.d;
import ao0.l;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.j;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Task;
import eo0.b;
import fg0.a;
import go0.g;
import in.swiggy.android.swiggylocation.utils.LocationBundle;
import in.swiggy.android.swiggylocation.utils.LocationPermissionState;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.DsDefaultingInstrumentationParams;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePrediction;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePredictionList;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.location.model.AddressAttribute;
import in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource;
import in.swiggy.android.tejas.feature.order.legacy.model.Order;
import in.swiggy.android.tejas.oldapi.models.enums.LocationType;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ILocationContext */
public interface n extends a {
    l<Boolean> A1();

    GooglePlacePrediction A2();

    void B1();

    ig0.a B2();

    void C(Address address);

    BehaviorProcessor<Location> C0();

    boolean C1();

    void D2(GeocodedAddress geocodedAddress);

    void E2();

    GeocodedAddress F();

    String F0();

    d<Location> F1(boolean z11);

    void G(LocationManager locationManager, SharedPreferences sharedPreferences);

    Address G0();

    void G1(Address address);

    boolean G2();

    String H();

    void H0(boolean z11);

    @SuppressLint({"MissingPermission"})
    void H1(Activity activity, int i11, g<LocationPermissionState> gVar, AtomicBoolean atomicBoolean, Boolean bool);

    void I1(g<Boolean> gVar);

    boolean J0();

    void J1(Address address);

    Location K();

    d<Location> L1();

    boolean M0();

    boolean M1(Location location);

    long N0();

    l<Double> O0();

    void P(eo0.a aVar, g<LocationPermissionState> gVar, Activity activity, go0.a aVar2, go0.a aVar3, go0.a aVar4, int i11, AtomicBoolean atomicBoolean, go0.a aVar5, Boolean bool);

    BehaviorProcessor<Boolean> P1();

    lp0.l<Location, Boolean> Q1(LocationGps locationGps);

    String R();

    Boolean R1(Context context);

    LocationRequest S();

    GooglePlace S0();

    DsDefaultingInstrumentationParams T0();

    float V();

    boolean V0();

    void V1(Location location, o oVar);

    d<GooglePlacePredictionList> W0(String str, LatLngBounds latLngBounds);

    void W1();

    boolean X(Location location);

    void X0();

    BehaviorProcessor<Boolean> X1();

    boolean Y0();

    boolean Y1(Location location);

    boolean Z0(LocationManager locationManager);

    void Z1(GooglePlace googlePlace);

    void a1(LocationType locationType);

    d<GooglePlace> b2(String str);

    PublishProcessor<Boolean> d1();

    void e1(SplashHalfCardTriggerSource splashHalfCardTriggerSource);

    void f0(boolean z11);

    l<ig0.d> f1();

    boolean f2(LocationManager locationManager);

    LocationBundle g0();

    float getAccuracy();

    String getAddressId();

    String getAreaName();

    String getCity();

    double getLatitude();

    Location getLocation();

    double getLongitude();

    o h();

    d<ig0.a> h0();

    void h2(boolean z11);

    int i();

    float i1();

    String i2();

    int j1();

    String k();

    boolean l(Location location);

    String l0();

    void m0(o oVar);

    LatLngBounds m1(SharedPreferences sharedPreferences);

    void m2(boolean z11);

    PublishProcessor<Location> n1();

    AddressAttribute o2();

    void p(double d11, double d12);

    Address p0();

    BehaviorProcessor<Location> p1();

    void q(o oVar, AtomicBoolean atomicBoolean);

    BehaviorProcessor<Location> q0();

    void q1(double d11, double d12);

    BehaviorProcessor<Location> q2();

    long s2();

    String t();

    int t0();

    Address t1();

    b u(LocationManager locationManager, o oVar, SharedPreferences sharedPreferences);

    String u1();

    Task<j> u2();

    BehaviorProcessor<Location> v();

    void v0(Location location);

    LocationType w();

    void w0(boolean z11);

    void w1(Address address);

    BehaviorProcessor<Boolean> w2();

    void x1(GooglePlacePrediction googlePlacePrediction);

    Location y();

    void y0(boolean z11);

    void z();

    boolean z1(Order order);

    void z2();
}
