package in.swiggy.android.swiggylocation.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import androidx.databinding.k;
import ao0.d;
import cg0.h0;
import cg0.i0;
import cg0.j0;
import cg0.k0;
import cg0.l0;
import cg0.m0;
import cg0.n;
import cg0.n0;
import cg0.o;
import cg0.o0;
import cg0.p0;
import cg0.q0;
import cg0.r0;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import ig0.b;
import ig0.e;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.DsAddressModel;
import in.swiggy.android.tejas.feature.address.model.DsDefaultingInstrumentationParams;
import in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes;
import in.swiggy.android.tejas.feature.location.model.SplashScreenTriggerSource;
import in.swiggy.android.tejas.oldapi.models.SimpleLocation;
import in.swiggy.android.tejas.oldapi.models.intdef.TrackOrderState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import ms.f;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import os.g0;
import os.m;
import os.u;

@Instrumented
/* compiled from: LocationContextExtension.kt */
public final class LocationContextExtensionKt {

    /* compiled from: LocationContextExtension.kt */
    public static final class a extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Location f18808b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f18809c;

        a(b bVar, Location location, o oVar) {
            this.f18807a = bVar;
            this.f18808b = location;
            this.f18809c = oVar;
        }

        public void a(k kVar, int i11) {
            p.j(kVar, "sender");
            m.b("New Defaulting Logic isNewDefaultingApiCalled on api success : true");
            LocationContextExtensionKt.V(this.f18807a, this.f18808b, this.f18809c);
        }
    }

    /* access modifiers changed from: private */
    public static final void A(b bVar, long j, SimpleLocation simpleLocation) {
        p.j(bVar, "$this_fetchLocation");
        Location convertToLocation = simpleLocation.convertToLocation();
        u.b("LOCRES", "makeCurrentGpsRequest accuracy " + simpleLocation.getAccuracy() + " location " + convertToLocation);
        if (!bVar.X(convertToLocation)) {
            m.b(p.s("New Defaulting Logic valid location : ", convertToLocation));
            bVar.P3(SimpleLocation.fromLocation(convertToLocation));
            bVar.b4(System.currentTimeMillis() - j);
            bVar.V1(convertToLocation, bVar.h());
            boolean f11 = bVar.h().f(bVar);
            bVar.T = f11;
            m.b(p.s("New Defaulting Logic launchNux : ", Boolean.valueOf(f11)));
            if (f11) {
                bVar.H.onNext(Boolean.TRUE);
            } else if (!bVar.f18879p0.b()) {
                e eVar = bVar.f18882r0;
                p.i(eVar, "xpValueFetcher");
                if (!R(bVar, eVar)) {
                    bVar.m3();
                }
            }
        } else {
            m.b("invalid location");
            bVar.A3(System.currentTimeMillis() - j, bVar.h(), false);
        }
        bVar.X = false;
    }

    /* access modifiers changed from: private */
    public static final void B(b bVar, long j, Throwable th2) {
        p.j(bVar, "$this_fetchLocation");
        m.b("timeout occurred");
        bVar.f18868i0 = true;
        u.h("LocationContext", th2);
        bVar.A3(System.currentTimeMillis() - j, bVar.h(), true);
        bVar.X = false;
    }

    /* access modifiers changed from: private */
    public static final SimpleLocation C(b bVar, Location location) {
        p.j(bVar, "$this_fetchLocation");
        p.j(location, "it");
        SimpleLocation fromLocation = SimpleLocation.fromLocation(location);
        bVar.j4(fromLocation);
        return fromLocation;
    }

    /* access modifiers changed from: private */
    public static final boolean D(b bVar, Location location) {
        p.j(bVar, "$this_fetchLocation");
        p.j(location, "it");
        bVar.k4(location);
        boolean M1 = bVar.M1(location);
        m.b(p.s("fastCurrentLocation : ", Boolean.valueOf(M1)));
        if (!M1) {
            b.b(location);
        }
        return M1;
    }

    /* access modifiers changed from: private */
    public static final SimpleLocation E(b bVar, Location location) {
        p.j(bVar, "$this_fetchLocation");
        p.j(location, "it");
        SimpleLocation fromLocation = SimpleLocation.fromLocation(location);
        bVar.j4(fromLocation);
        return fromLocation;
    }

    /* access modifiers changed from: private */
    public static final boolean F(b bVar, Location location) {
        p.j(bVar, "$this_fetchLocation");
        p.j(location, "it");
        bVar.k4(location);
        boolean M1 = bVar.M1(location);
        m.b(p.s("updatedLocation : ", Boolean.valueOf(M1)));
        if (!M1) {
            b.a(location);
        }
        return M1;
    }

    public static final ArrayList<Address> G(ArrayList<Address> arrayList, double d11) {
        p.j(arrayList, "addresses");
        ArrayList<Address> arrayList2 = new ArrayList<>();
        Iterator<Address> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Address next = it2.next();
            next.getHaversineDistance();
            if (Double.compare(next.getHaversineDistance(), d11) <= 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final ArrayList<Address> H(ArrayList<Address> arrayList, double d11) {
        p.j(arrayList, "addressListWithInRange");
        ArrayList<Address> arrayList2 = new ArrayList<>();
        Iterator<Address> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Address next = it2.next();
            if (Double.compare(next.getHaversineDistance(), d11) <= 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final Address I(SharedPreferences sharedPreferences, boolean z11, e eVar) {
        Address address;
        p.j(sharedPreferences, "sharedPreferences");
        p.j(eVar, "xpValueFetcher");
        boolean z12 = false;
        if (c.q(eVar.a("gps_off_default_address_experiment", SafeJsonPrimitive.NULL_STRING), false, 1, (Object) null) && c.h(Boolean.valueOf(z11))) {
            try {
                String string = sharedPreferences.getString("gps_off_location_attributes", "");
                if (string != null) {
                    if (string.length() == 0) {
                        z12 = true;
                    }
                    if (!z12) {
                        Gson i11 = g0.i();
                        Class cls = GpsOffLocationAttributes.class;
                        GpsOffLocationAttributes gpsOffLocationAttributes = (GpsOffLocationAttributes) (!(i11 instanceof Gson) ? i11.fromJson(string, cls) : GsonInstrumentation.fromJson(i11, string, cls));
                        if (gpsOffLocationAttributes == null || (address = gpsOffLocationAttributes.lastDeliveredAddress) == null) {
                            return null;
                        }
                        return address;
                    }
                }
            } catch (Exception e11) {
                u.h("LocationContext", e11);
            }
        }
        return null;
    }

    public static final String J(e eVar) {
        p.j(eVar, "xpValueFetcher");
        return eVar.a("enable_half_card_single_click_to_proceed", SafeJsonPrimitive.NULL_STRING);
    }

    public static final String K(e eVar) {
        p.j(eVar, "xpValueFetcher");
        return eVar.a("enable_ds_defaulting_model", SafeJsonPrimitive.NULL_STRING);
    }

    public static final int L(e eVar) {
        p.j(eVar, "xpValueFetcher");
        return c.u(eVar.a("ds_defaulting_model_variant_id", TrackOrderState.ORDER_PICKED_UP), 3);
    }

    public static final double M(ArrayList<Address> arrayList, int i11) {
        p.j(arrayList, "addresses");
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0).getHaversineDistance();
        }
        double d11 = (double) ((i11 * (size + 1)) / 100);
        double floor = d11 - Math.floor(d11);
        if (d11 < 1.0d) {
            return arrayList.get(0).getHaversineDistance();
        }
        if (d11 >= ((double) size)) {
            return arrayList.get(size - 1).getHaversineDistance();
        }
        double haversineDistance = arrayList.get(((int) Math.floor(d11)) - 1).getHaversineDistance();
        return haversineDistance + (floor * (arrayList.get((int) Math.floor(d11)).getHaversineDistance() - haversineDistance));
    }

    public static final String N(SharedPreferences sharedPreferences) {
        p.j(sharedPreferences, "sharedPreferences");
        return String.valueOf(sharedPreferences.getString("addressDefaultingTraceId", ""));
    }

    public static final void O(b bVar, Location location, o oVar) {
        b bVar2 = bVar;
        Location location2 = location;
        o oVar2 = oVar;
        p.j(bVar2, "locationContext");
        p.j(location2, "currentLocation");
        p.j(oVar2, "userLocationManager");
        DsDefaultingInstrumentationParams dsDefaultingInstrumentationParams = new DsDefaultingInstrumentationParams((Double) null, (Integer) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (Double) null, (String) null, (Boolean) null, (String) null, (ArrayList) null, 2047, (i) null);
        bVar2.f18885t0 = dsDefaultingInstrumentationParams;
        dsDefaultingInstrumentationParams.setTraceId(N(bVar.R2()));
        bVar2.l4(SplashScreenTriggerSource.DS_MODEL_GPS_ON);
        e eVar = bVar2.f18882r0;
        p.i(eVar, "locationContext.xpValueFetcher");
        if (S(bVar2, eVar)) {
            V(bVar, location, oVar);
            return;
        }
        bVar2.f18885t0.setCacheResponseUsed(Boolean.FALSE);
        if (bVar2.S.g()) {
            m.b("New Defaulting Logic isNewDefaultingApiCalled : true");
            V(bVar, location, oVar);
            return;
        }
        m.b("New Defaulting Logic observeForever : added");
        bVar2.S.h(new a(bVar2, location2, oVar2));
    }

    public static final boolean P(SharedPreferences sharedPreferences) {
        p.j(sharedPreferences, "sharedPreferences");
        return c.p(sharedPreferences.getString("feature_new_area_enabled", "true"), true);
    }

    public static final boolean Q(n nVar, e eVar) {
        p.j(nVar, "locationContext");
        p.j(eVar, "xpValueFetcher");
        return c.p(nVar.i2(), false) && nVar.t0() == 1;
    }

    public static final boolean R(n nVar, e eVar) {
        p.j(nVar, "locationContext");
        p.j(eVar, "xpValueFetcher");
        int t02 = nVar.t0();
        if (c.p(nVar.i2(), false)) {
            return t02 == 1 || t02 == 2;
        }
        return false;
    }

    public static final boolean S(n nVar, e eVar) {
        p.j(nVar, "locationContext");
        p.j(eVar, "xpValueFetcher");
        return c.p(nVar.i2(), false) && nVar.t0() == 2;
    }

    public static final void T(b bVar) {
        p.j(bVar, "<this>");
        e eVar = bVar.f18882r0;
        p.i(eVar, "xpValueFetcher");
        bVar.f18890w0 = K(eVar);
        e eVar2 = bVar.f18882r0;
        p.i(eVar2, "xpValueFetcher");
        bVar.f18892x0 = L(eVar2);
    }

    public static final void U(SharedPreferences sharedPreferences, ILocationEventManager iLocationEventManager, e eVar, List<Address> list) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(iLocationEventManager, "locationEventManager");
        p.j(eVar, "xpValueFetcher");
        p.j(list, "sortedAddressList");
        f.n(new LocationContextExtensionKt$prepareGpsOffLocationAttributes$1(eVar, sharedPreferences, list, iLocationEventManager));
    }

    public static final void V(b bVar, Location location, o oVar) {
        p.j(bVar, "locationContext");
        p.j(location, "currentLocation");
        p.j(oVar, "userLocationManager");
        ArrayList arrayList = new ArrayList(oVar.k());
        int defaultingType = oVar.getDefaultingType();
        double proximityWeight = oVar.getProximityWeight();
        bVar.f18885t0.setProximityWeight(Double.valueOf(proximityWeight));
        bVar.f18885t0.setLastCacheSyncTimestamp(bVar.R2().getString("last_ds_defaulting_api_called_timestamp", ""));
        m.b(p.s("New Defaulting Logic unSortedAddressList : ", Integer.valueOf(arrayList.size())));
        m.b(p.s("New Defaulting Logic DefaultingType : ", Integer.valueOf(oVar.getDefaultingType())));
        m.b(p.s("New Defaulting Logic ProximityWeight : ", Double.valueOf(oVar.getProximityWeight())));
        if (arrayList.isEmpty()) {
            bVar.n4(location);
            bVar.p1().onNext(location);
        } else if (defaultingType == 1) {
            t(bVar, location, arrayList, proximityWeight);
        } else if (defaultingType != 2) {
            t(bVar, location, arrayList, proximityWeight);
        } else {
            u(bVar, location, arrayList, proximityWeight);
        }
    }

    public static final void W(b bVar, SharedPreferences sharedPreferences) {
        p.j(bVar, "<this>");
        p.j(sharedPreferences, "sharedPreferences");
        if (bVar.f18879p0.b()) {
            bVar.k = 1;
            bVar.j = 3;
            return;
        }
        bVar.j = c.w(sharedPreferences.getString("gps_timeout_in_seconds", TrackOrderState.ORDER_DELIVERED), Long.parseLong(TrackOrderState.ORDER_DELIVERED));
        bVar.k = c.u(sharedPreferences.getString("android_gps_retry_count_threshold", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES), Integer.parseInt(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES));
    }

    public static final String X(e eVar) {
        p.j(eVar, "xpValueFetcher");
        return eVar.a("enable_gps_off_two_step_flow", SafeJsonPrimitive.NULL_STRING);
    }

    public static final ArrayList<Address> Y(Location location, ArrayList<Address> arrayList) {
        p.j(location, "currentLocation");
        p.j(arrayList, "unSortedAddressList");
        if (arrayList.size() == 1) {
            arrayList.get(0).setHaversineDistance((double) location.distanceTo(arrayList.get(0).getLocation()));
        } else {
            o.y(arrayList, new i0(location));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final int Z(Location location, Address address, Address address2) {
        p.j(location, "$currentLocation");
        float distanceTo = location.distanceTo(address.getLocation());
        address.setHaversineDistance((double) distanceTo);
        float distanceTo2 = location.distanceTo(address2.getLocation());
        address2.setHaversineDistance((double) distanceTo2);
        return Float.compare(distanceTo, distanceTo2);
    }

    public static final ArrayList<Address> m(double d11, ArrayList<Address> arrayList) {
        p.j(arrayList, "addressListWithProximityScore");
        if (arrayList.size() == 1) {
            Address address = arrayList.get(0);
            p.i(address, "addressListWithProximityScore[0]");
            arrayList.get(0).setFinalSortScore(p(d11, address));
        } else {
            o.y(arrayList, new h0(d11));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final int n(double d11, Address address, Address address2) {
        p.i(address, "address1");
        double p11 = p(d11, address);
        address.setFinalSortScore(p11);
        p.i(address2, "address2");
        double p12 = p(d11, address2);
        address2.setFinalSortScore(p12);
        return Double.compare(p11, p12);
    }

    public static final ArrayList<Address> o(List<Address> list, double d11) {
        p.j(list, "tenPercentileAddresses");
        ArrayList<Address> arrayList = new ArrayList<>();
        for (Address next : list) {
            next.setProximityScore(next.getHaversineDistance() / d11);
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final double p(double d11, Address address) {
        p.j(address, "address");
        return address.getWeightedOrderShareScore() + (d11 * address.getProximityScore());
    }

    public static final boolean q(SharedPreferences sharedPreferences, e eVar) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(eVar, "xpValueFetcher");
        boolean q = c.q(eVar.a("gps_off_default_address_experiment", SafeJsonPrimitive.NULL_STRING), false, 1, (Object) null);
        String string = sharedPreferences.getString("gps_off_location_attributes", "");
        if (!q) {
            return false;
        }
        if (!(string == null || string.length() == 0)) {
            return true;
        }
        return false;
    }

    public static final void r(b bVar, e eVar, dg0.b bVar2, boolean z11, o oVar, SharedPreferences sharedPreferences) {
        p.j(bVar, "<this>");
        p.j(eVar, "xpValueFetcher");
        p.j(bVar2, "locationDefaultingContext");
        p.j(oVar, "userLocationManager");
        p.j(sharedPreferences, "sharedPreferences");
        if (Q(bVar, eVar) && oVar.h()) {
            Context context = bVar.f18887u0;
            p.i(context, LogCategory.CONTEXT);
            bVar2.a(context, z11, oVar, sharedPreferences, new LocationContextExtensionKt$checkXpVariantAndHitNewDefaultingApi$1(bVar));
        }
    }

    public static final void s(b bVar, o oVar, Location location) {
        p.j(bVar, "<this>");
        p.j(oVar, "userLocationManager");
        p.j(location, "currentLocation");
        if (oVar.h()) {
            e eVar = bVar.f18882r0;
            p.i(eVar, "xpValueFetcher");
            if (R(bVar, eVar)) {
                m.b(p.s("New Defaulting Logic Started :", location));
                O(bVar, location, oVar);
                return;
            }
            bVar.S3(location, oVar);
            return;
        }
        bVar.l4(SplashScreenTriggerSource.NO_SAVED_ADDRESS);
        bVar.n4(location);
        bVar.p1().onNext(location);
    }

    public static final void t(b bVar, Location location, ArrayList<Address> arrayList, double d11) {
        p.j(bVar, "locationContext");
        p.j(location, "currentLocation");
        p.j(arrayList, "unSortedAddressList");
        try {
            double accuracy = ((double) location.getAccuracy()) + 1000.0d;
            m.b(p.s("New Defaulting Logic consideredCircleRadius : ", Double.valueOf(accuracy)));
            ArrayList<Address> Y = Y(location, arrayList);
            m.b(p.s("New Defaulting Logic unSortedAddressList : ", arrayList));
            m.b(p.s("New Defaulting Logic sortedAddressList Size : ", Integer.valueOf(Y.size())));
            if (Y.isEmpty()) {
                bVar.n4(location);
                bVar.p1().onNext(location);
                return;
            }
            double haversineDistance = ((Address) s.h0(Y)).getHaversineDistance();
            m.b(p.s("New Defaulting Logic maxHaversineDistance : ", Double.valueOf(haversineDistance)));
            ArrayList<Address> G = G(Y, accuracy);
            m.b(p.s("New Defaulting Logic Addresses in 1000 mtrs range : ", G));
            m.b(p.s("New Defaulting Logic in 1000 mtrs range : ", Integer.valueOf(G.size())));
            bVar.f18885t0.setTotalAddressBeforeNPercentile(Integer.valueOf(G.size()));
            if (G.isEmpty()) {
                bVar.n4(location);
                bVar.p1().onNext(location);
                return;
            }
            bVar.f18885t0.setNPercentileValue(Integer.valueOf(bVar.f18888v0));
            double M = M(G, bVar.f18888v0);
            bVar.f18885t0.setNPercentileDistance(Double.valueOf(M));
            m.b(p.s("New Defaulting Logic nPercentileDistance : ", Double.valueOf(M)));
            ArrayList<Address> H = H(G, M);
            int size = H.size();
            bVar.f18885t0.setAddressAfterNPercentile(Integer.valueOf(size));
            m.b(p.s("New Defaulting Logic nPercentileDistance : ", Integer.valueOf(size)));
            m.b(p.s("New Defaulting Logic nPercentileAddresses : ", H));
            ArrayList<Address> o11 = o(H, haversineDistance);
            m.b(p.s("New Defaulting Logic addressListWithProximityScore : ", o11));
            ArrayList<Address> m11 = m(d11, o11);
            Iterator<Address> it2 = m11.iterator();
            while (it2.hasNext()) {
                Address next = it2.next();
                bVar.f18885t0.getFinalAddressList().add(new DsAddressModel(next.getId(), Double.valueOf(next.getWeightedOrderShareScore()), Double.valueOf(next.getProximityScore()), Double.valueOf(next.getFinalSortScore())));
            }
            m.b(p.s("New Defaulting Logic addressListWithFinalSortScore : ", m11));
            Address address = (Address) s.h0(m11);
            m.b(p.s("New Defaulting Logic defaultingAddress : ", address));
            bVar.f18885t0.setFinalProximityScore(Double.valueOf(address.getProximityScore()));
            bVar.f18885t0.setFinalSortScore(Double.valueOf(address.getFinalSortScore()));
            m.b(p.s("New Defaulting Logic finalSortScore : ", Double.valueOf(address.getFinalSortScore())));
            bVar.o4(location, address, m11);
            bVar.p1().onNext(location);
        } catch (Exception unused) {
            bVar.n4(location);
            bVar.p1().onNext(location);
        }
    }

    public static final void u(b bVar, Location location, List<Address> list, double d11) {
        p.j(bVar, "locationContext");
        p.j(location, "currentLocation");
        p.j(list, "unSortedList");
        ArrayList arrayList = new ArrayList(list);
        bVar.o4(location, (Address) s.h0(arrayList), arrayList);
    }

    @SuppressLint({"MissingPermission"})
    public static final eo0.b v(b bVar, long j) {
        d<R> dVar;
        p.j(bVar, "<this>");
        d<R> N = bVar.z3().o().z(new r0(bVar)).N(new l0(bVar));
        p.i(N, "reactiveLocationProvider…stKnownLocation(this) } }");
        d<R> N2 = bVar.z3().i().z(new p0(bVar)).N(new k0(bVar));
        p.i(N2, "reactiveLocationProvider…stKnownLocation(this) } }");
        d<R> N3 = bVar.L1().z(new q0(bVar)).N(o0.f12973a);
        p.i(N3, "updatedCurrentGpsLocatio…cation.fromLocation(it) }");
        if (bVar.f18881r) {
            dVar = d.P(N, N2, N3);
        } else {
            dVar = d.O(N, N3);
        }
        p.i(dVar, "if (enableFastCurrentLoc…edLocationFlowable)\n    }");
        eo0.b h02 = dVar.p0(1).s0(bVar.j, TimeUnit.SECONDS).c0(new m0(bVar, N3)).m0(wo0.a.c()).Q(wo0.a.c()).h0(new cg0.g0(bVar, j), new j0(bVar, j));
        p.i(h02, "locationProviderFlowable…ogress = false\n        })");
        return h02;
    }

    /* access modifiers changed from: private */
    public static final boolean w(b bVar, Location location) {
        p.j(bVar, "$this_fetchLocation");
        p.j(location, "it");
        bVar.k4(location);
        boolean M1 = bVar.M1(location);
        m.b(p.s("lastKnownLocation : ", Boolean.valueOf(M1)));
        if (!M1) {
            b.b(location);
        }
        return M1;
    }

    /* access modifiers changed from: private */
    public static final SimpleLocation x(Location location) {
        p.j(location, "it");
        return SimpleLocation.fromLocation(location);
    }

    /* access modifiers changed from: private */
    public static final nr0.a y(b bVar, d dVar, d dVar2) {
        p.j(bVar, "$this_fetchLocation");
        p.j(dVar, "$updatedLocationFlowable");
        p.j(dVar2, "it");
        return dVar2.B(new n0(bVar, dVar));
    }

    /* access modifiers changed from: private */
    public static final nr0.a z(b bVar, d dVar, Throwable th2) {
        p.j(bVar, "$this_fetchLocation");
        p.j(dVar, "$updatedLocationFlowable");
        p.j(th2, "error");
        int i11 = bVar.f18869j0;
        if (i11 >= bVar.k || !(th2 instanceof TimeoutException)) {
            return d.x(th2);
        }
        bVar.f18869j0 = i11 + 1;
        return d.M(dVar);
    }
}
