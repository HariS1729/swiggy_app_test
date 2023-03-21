package in.swiggy.android.swiggylocation.location;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.databinding.ObservableBoolean;
import cg0.a0;
import cg0.b0;
import cg0.c0;
import cg0.d0;
import cg0.e0;
import cg0.f0;
import cg0.j1;
import cg0.n;
import cg0.o;
import cg0.v;
import cg0.w;
import cg0.x;
import cg0.y;
import cg0.z;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.i;
import com.google.android.gms.location.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Task;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import fg0.d;
import go0.g;
import ig0.e;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.swiggylocation.R;
import in.swiggy.android.swiggylocation.utils.LocationBundle;
import in.swiggy.android.swiggylocation.utils.LocationPermissionState;
import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressSortingWeight;
import in.swiggy.android.tejas.feature.address.model.DsDefaultingInstrumentationParams;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePrediction;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePredictionList;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.OperationalCityBounds;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.location.model.AddressAttribute;
import in.swiggy.android.tejas.feature.location.model.HalfCardAttributes;
import in.swiggy.android.tejas.feature.location.model.HalfCardTriggerSource;
import in.swiggy.android.tejas.feature.location.model.LocationAddressConfig;
import in.swiggy.android.tejas.feature.location.model.LocationAddressWPConfig;
import in.swiggy.android.tejas.feature.location.model.LocationCommonAttributes;
import in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource;
import in.swiggy.android.tejas.feature.location.model.SplashScreenTriggerSource;
import in.swiggy.android.tejas.feature.order.legacy.model.Order;
import in.swiggy.android.tejas.feature.search.transformers.LocationAddressConfigTransformer;
import in.swiggy.android.tejas.oldapi.models.SimpleLocation;
import in.swiggy.android.tejas.oldapi.models.enums.LocationType;
import in.swiggy.android.tejas.oldapi.models.intdef.TrackOrderState;
import in.swiggy.android.tejas.oldapi.utils.Constants;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import lp0.l;
import ms.f;
import ms.h;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import os.g0;
import os.m;
import os.u;

@Instrumented
/* compiled from: LocationContext */
public class b extends d implements n {
    @SerializedName("boundsList")
    private ArrayList<LatLngBounds> A;
    @SerializedName("mDefaultingBundle")
    private ig0.a B;
    private transient BehaviorProcessor<Location> C = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Location> D = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Location> E = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Location> F = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Location> G = BehaviorProcessor.z0();
    protected transient BehaviorProcessor<Boolean> H = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Location> I = BehaviorProcessor.z0();
    private transient BehaviorProcessor<ig0.a> J = BehaviorProcessor.z0();
    private transient PublishProcessor<Boolean> K = PublishProcessor.z0();
    private transient PublishProcessor<Boolean> L = PublishProcessor.z0();
    private transient PublishProcessor<Location> M = PublishProcessor.z0();
    private transient BehaviorProcessor<ig0.d> N = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Double> O = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Boolean> P = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Boolean> Q = BehaviorProcessor.z0();
    private transient BehaviorProcessor<Boolean> R = BehaviorProcessor.z0();
    protected final transient ObservableBoolean S = new ObservableBoolean(false);
    protected transient boolean T = false;
    private boolean U;
    private transient boolean V;
    private transient boolean W;
    protected transient boolean X;
    private transient OperationalCityBounds Y;
    private transient LocationRequest Z;

    /* renamed from: a0  reason: collision with root package name */
    private transient j1 f18854a0;

    /* renamed from: b0  reason: collision with root package name */
    private transient GooglePlacePrediction f18855b0;

    /* renamed from: c0  reason: collision with root package name */
    private transient String f18856c0;

    /* renamed from: d  reason: collision with root package name */
    private transient boolean f18857d = false;

    /* renamed from: d0  reason: collision with root package name */
    private transient ILocationEventManager f18858d0;

    /* renamed from: e  reason: collision with root package name */
    private transient boolean f18859e = false;

    /* renamed from: e0  reason: collision with root package name */
    private transient o f18860e0;

    /* renamed from: f  reason: collision with root package name */
    private transient Location f18861f = null;

    /* renamed from: f0  reason: collision with root package name */
    private transient boolean f18862f0;

    /* renamed from: g  reason: collision with root package name */
    private transient SimpleLocation f18863g = null;

    /* renamed from: g0  reason: collision with root package name */
    private transient boolean f18864g0;

    /* renamed from: h  reason: collision with root package name */
    private transient float f18865h = 200.0f;

    /* renamed from: h0  reason: collision with root package name */
    private transient LocationBundle f18866h0;

    /* renamed from: i  reason: collision with root package name */
    private transient long f18867i = 600000;

    /* renamed from: i0  reason: collision with root package name */
    protected transient boolean f18868i0;
    protected transient long j = 4;

    /* renamed from: j0  reason: collision with root package name */
    protected transient int f18869j0;
    protected transient int k = 0;

    /* renamed from: k0  reason: collision with root package name */
    private transient long f18870k0;

    /* renamed from: l  reason: collision with root package name */
    private transient float f18871l = 500.0f;

    /* renamed from: l0  reason: collision with root package name */
    final transient String f18872l0;

    /* renamed from: m  reason: collision with root package name */
    private transient float f18873m = 100.0f;

    /* renamed from: m0  reason: collision with root package name */
    private transient String f18874m0;
    private transient int n = 100;

    /* renamed from: n0  reason: collision with root package name */
    private transient String f18875n0;

    /* renamed from: o  reason: collision with root package name */
    private transient int f18876o = 25;

    /* renamed from: o0  reason: collision with root package name */
    private transient AddressAttribute f18877o0;

    /* renamed from: p  reason: collision with root package name */
    private transient float f18878p = 500.0f;

    /* renamed from: p0  reason: collision with root package name */
    protected transient kg0.a f18879p0;
    private transient g<Boolean> q;

    /* renamed from: q0  reason: collision with root package name */
    protected boolean f18880q0;

    /* renamed from: r  reason: collision with root package name */
    protected transient boolean f18881r = false;

    /* renamed from: r0  reason: collision with root package name */
    protected transient e f18882r0;

    /* renamed from: s  reason: collision with root package name */
    protected transient boolean f18883s = false;

    /* renamed from: s0  reason: collision with root package name */
    protected transient dg0.b f18884s0;
    @SerializedName("mGooglePlace")
    private GooglePlace t;

    /* renamed from: t0  reason: collision with root package name */
    protected transient DsDefaultingInstrumentationParams f18885t0;
    @SerializedName("mGeocodedAddress")

    /* renamed from: u  reason: collision with root package name */
    private GeocodedAddress f18886u;

    /* renamed from: u0  reason: collision with root package name */
    protected transient Context f18887u0;
    @SerializedName("mCurrentAddress")
    private Address v;

    /* renamed from: v0  reason: collision with root package name */
    protected transient int f18888v0;
    @SerializedName("mCurrentGPSLocation")

    /* renamed from: w  reason: collision with root package name */
    private SimpleLocation f18889w;

    /* renamed from: w0  reason: collision with root package name */
    protected transient String f18890w0;
    @SerializedName("mLastDeliveredAddress")

    /* renamed from: x  reason: collision with root package name */
    private Address f18891x;

    /* renamed from: x0  reason: collision with root package name */
    protected transient int f18892x0;
    @SerializedName("mLastUsedGooglePlace")

    /* renamed from: y  reason: collision with root package name */
    private GooglePlace f18893y;

    /* renamed from: y0  reason: collision with root package name */
    private transient eo0.b f18894y0;
    @SerializedName("mCurrentLocationType")

    /* renamed from: z  reason: collision with root package name */
    private LocationType f18895z;

    /* compiled from: LocationContext */
    class a extends com.google.android.gms.location.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f18896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f18897b;

        a(Activity activity, AtomicBoolean atomicBoolean) {
            this.f18896a = activity;
            this.f18897b = atomicBoolean;
        }

        public void onLocationResult(LocationResult locationResult) {
            Location location;
            if (locationResult != null && !locationResult.P().isEmpty() && locationResult.P().get(0) != null && (location = locationResult.P().get(0)) != null) {
                i.a(this.f18896a).c(this).b(a.f18853a);
                b.this.c4(location, this.f18897b);
            }
        }
    }

    /* renamed from: in.swiggy.android.swiggylocation.location.b$b  reason: collision with other inner class name */
    /* compiled from: LocationContext */
    static /* synthetic */ class C0228b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18899a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f18900b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource[] r0 = in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18900b = r0
                r1 = 1
                in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource r2 = in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource.SAVED_ADDRESS_SPLASH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f18900b     // Catch:{ NoSuchFieldError -> 0x001d }
                in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource r3 = in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource.LOCATION_AREA_SPLASH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f18900b     // Catch:{ NoSuchFieldError -> 0x0028 }
                in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource r4 = in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource.ADDRESS_HALF_CARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                in.swiggy.android.tejas.oldapi.models.enums.LocationType[] r3 = in.swiggy.android.tejas.oldapi.models.enums.LocationType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f18899a = r3
                in.swiggy.android.tejas.oldapi.models.enums.LocationType r4 = in.swiggy.android.tejas.oldapi.models.enums.LocationType.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f18899a     // Catch:{ NoSuchFieldError -> 0x0043 }
                in.swiggy.android.tejas.oldapi.models.enums.LocationType r3 = in.swiggy.android.tejas.oldapi.models.enums.LocationType.SEARCH     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f18899a     // Catch:{ NoSuchFieldError -> 0x004d }
                in.swiggy.android.tejas.oldapi.models.enums.LocationType r1 = in.swiggy.android.tejas.oldapi.models.enums.LocationType.GPS     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylocation.location.b.C0228b.<clinit>():void");
        }
    }

    public b(Context context, String str, ILocationEventManager iLocationEventManager, kg0.a aVar, e eVar, dg0.b bVar) {
        super(context);
        boolean z11 = Build.VERSION.SDK_INT <= 28;
        this.U = z11;
        this.V = z11;
        this.W = false;
        this.X = false;
        this.f18854a0 = null;
        this.f18860e0 = null;
        this.f18862f0 = true;
        this.f18864g0 = false;
        this.f18866h0 = null;
        this.f18868i0 = false;
        this.f18869j0 = 0;
        this.f18870k0 = 0;
        this.f18874m0 = "none";
        this.f18875n0 = "none";
        this.f18877o0 = null;
        this.f18880q0 = false;
        this.f18888v0 = Integer.parseInt("50");
        this.f18890w0 = SafeJsonPrimitive.NULL_STRING;
        this.f18892x0 = 3;
        this.f18894y0 = null;
        Q3(context);
        this.f18887u0 = context;
        this.f18856c0 = str;
        this.f18858d0 = iLocationEventManager;
        this.f18872l0 = UUID.randomUUID().toString();
        this.f18879p0 = aVar;
        this.f18882r0 = eVar;
        this.f18884s0 = bVar;
        LocationContextExtensionKt.T(this);
        V3();
    }

    private void B3(Location location, List<Address> list, List<Address> list2, boolean z11) {
        if (list.get(0).getSortScore() == null) {
            l4(SplashScreenTriggerSource.NO_SORT_SCORE);
            f4(location, list, list2);
            return;
        }
        List<Address> e11 = c.e(list, this.n);
        m.b("activeSavedAddresses : " + e11.toString());
        int size = e11.size();
        if (size == 0) {
            m.b("zero active saved address");
            i4(z11 ? HalfCardTriggerSource.MULTIPLE_SAVED_INNER_ZERO_ACTIVE : HalfCardTriggerSource.MULTIPLE_SAVED_OUTER_ZERO_ACTIVE);
            if (this.f18879p0.b()) {
                this.f18879p0.j(location, list2.get(0), list, SplashHalfCardTriggerSource.ADDRESS_HALF_CARD);
            } else {
                m4(location, list2.get(0), list);
            }
        } else if (size != 1) {
            m.b("more than one active saved address");
            m.b("recentActiveAddressUpperBound : " + this.f18876o);
            Address i11 = c.i(e11, this.f18876o);
            if (i11 != null) {
                m.b("most active address : " + i11.toString());
                l4(z11 ? SplashScreenTriggerSource.MULTIPLE_INNER_MULTIPLE_ACTIVE_SINGLE_MOST_ACTIVE : SplashScreenTriggerSource.MULTIPLE_OUTER_MULTIPLE_ACTIVE_SINGLE_MOST_ACTIVE);
                if (this.f18879p0.b()) {
                    this.f18879p0.j(location, i11, list2, SplashHalfCardTriggerSource.SAVED_ADDRESS_SPLASH);
                } else {
                    o4(location, i11, list2);
                }
            } else {
                m.b("no most active address");
                i4(z11 ? HalfCardTriggerSource.MULTIPLE_SAVED_INNER_MULTIPLE_ACTIVE_ZERO_MOST_ACTIVE : HalfCardTriggerSource.MULTIPLE_SAVED_OUTER_MULTIPLE_ACTIVE_ZERO_MOST_ACTIVE);
                if (this.f18879p0.b()) {
                    this.f18879p0.j(location, list2.get(0), list, SplashHalfCardTriggerSource.ADDRESS_HALF_CARD);
                } else {
                    m4(location, list2.get(0), list);
                }
            }
        } else {
            m.b("one active saved address");
            l4(z11 ? SplashScreenTriggerSource.MULTIPLE_INNER_SINGLE_ACTIVE : SplashScreenTriggerSource.MULTIPLE_OUTER_SINGLE_ACTIVE);
            if (this.f18879p0.b()) {
                this.f18879p0.j(location, e11.get(0), list2, SplashHalfCardTriggerSource.SAVED_ADDRESS_SPLASH);
            } else {
                o4(location, e11.get(0), list2);
            }
        }
    }

    private boolean C3(Location location) {
        return System.currentTimeMillis() - location.getTime() <= this.f18867i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean D3(LocationGps locationGps, Location location) {
        return Boolean.valueOf(M1(location) && (locationGps == null || locationGps.getLocAccuracy() <= 0.0f || location.getAccuracy() <= locationGps.getLocAccuracy()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E3(AtomicBoolean atomicBoolean, Activity activity, Location location) {
        SimpleLocation fromLocation = SimpleLocation.fromLocation(location);
        j4(fromLocation);
        if (location != null) {
            P3(fromLocation);
            c4(location, atomicBoolean);
            return;
        }
        p4(activity, atomicBoolean);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F3(Boolean bool, Activity activity, AtomicBoolean atomicBoolean, j jVar) {
        if (bool.booleanValue() && jVar != null && jVar.f().x0()) {
            i.a(activity).b().g(activity, new w(this, atomicBoolean, activity));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void G3(Activity activity, int i11, g gVar, Exception exc) {
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).startResolutionForResult(activity, i11);
            } catch (ActivityNotFoundException | IntentSender.SendIntentException e11) {
                u.h("LocationContext", e11);
            }
        } else {
            f.g(gVar, LocationPermissionState.LOCATION_NOT_GRANTED);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Location I3(boolean z11, Location location) throws Exception {
        u.b("LOCRES", "lastKnownLocation " + location.getAccuracy() + " " + location + " isGpsLocationAccurate " + M1(location));
        if (M1(location)) {
            v0(location);
            return location;
        } else if (!z11) {
            return location;
        } else {
            return t3();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J3(Activity activity, int i11, g gVar, AtomicBoolean atomicBoolean, Boolean bool, go0.a aVar, AtomicBoolean atomicBoolean2, boolean z11, go0.a aVar2, go0.a aVar3, ss.a aVar4) throws Exception {
        if (aVar4.f53212b) {
            if (aVar4.f53211a.equals("android.permission.ACCESS_FINE_LOCATION")) {
                H1(activity, i11, gVar, atomicBoolean, bool);
                f.g(gVar, LocationPermissionState.FINE_LOCATION_GRANTED);
                try {
                    aVar.run();
                } catch (Exception e11) {
                    u.h("LocationContext", e11);
                }
            }
        } else if (atomicBoolean2.get()) {
            atomicBoolean2.set(false);
            boolean y11 = androidx.core.app.b.y(activity, "android.permission.ACCESS_FINE_LOCATION");
            if (in.swiggy.android.commons.utils.rxpermissions.a.g(activity.getApplication()).h("android.permission.ACCESS_COARSE_LOCATION")) {
                f.g(gVar, LocationPermissionState.COARSE_LOCATION_GRANTED);
            } else {
                f.g(gVar, LocationPermissionState.LOCATION_NOT_GRANTED);
            }
            if (!y11 && !z11) {
                aVar2.run();
            }
            aVar3.run();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K3(g gVar, go0.a aVar, Throwable th2) throws Exception {
        f.g(gVar, LocationPermissionState.LOCATION_NOT_GRANTED);
        try {
            aVar.run();
        } catch (Exception e11) {
            u.h("LocationContext", e11);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean L3(Location location) {
        return Boolean.valueOf(M1(location));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean M3(Context context) throws Exception {
        this.Y = R3(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N3(Location location) throws Exception {
    }

    private OperationalCityBounds R3(Context context) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.default_latlng_bounds), StandardCharsets.UTF_8));
        Gson i11 = g0.i();
        Class cls = OperationalCityBounds.class;
        return (OperationalCityBounds) (!(i11 instanceof Gson) ? i11.fromJson((Reader) bufferedReader, cls) : GsonInstrumentation.fromJson(i11, (Reader) bufferedReader, cls));
    }

    private void T3(Location location) {
        o3();
        this.E.D0(location);
    }

    private void U3(SharedPreferences sharedPreferences) {
        LocationAddressConfigTransformer locationAddressConfigTransformer = new LocationAddressConfigTransformer();
        String string = sharedPreferences.getString("android_location_address_config", "{\"outerRadius\":\"500\",\"innerRadius\":\"100\",\"activeAddress\":\"100\",\"recentAddress\":\"25\",\"cartAddressRadius\":\"500\"}");
        Gson i11 = g0.i();
        Class cls = LocationAddressWPConfig.class;
        LocationAddressConfig locationAddressConfig = (LocationAddressConfig) locationAddressConfigTransformer.transform((LocationAddressWPConfig) (!(i11 instanceof Gson) ? i11.fromJson(string, cls) : GsonInstrumentation.fromJson(i11, string, cls)));
        if (locationAddressConfig != null) {
            this.f18871l = locationAddressConfig.getOuterRadius();
            this.f18873m = locationAddressConfig.getInnerRadius();
            this.n = locationAddressConfig.getActiveAddressUpperBound();
            this.f18876o = locationAddressConfig.getRecentActiveRadiusUpperBound();
            this.f18878p = locationAddressConfig.getCartAddressRadius();
        }
    }

    private void V3() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(M2());
        try {
            this.f18865h = Float.parseFloat(defaultSharedPreferences.getString("android_default_location_gps_distance_in_mtrs", "200"));
            this.f18867i = Long.parseLong(defaultSharedPreferences.getString("android_gps_last_known_location_time_threshold_in_min", "10")) * 60 * 1000;
            this.j = Long.parseLong(defaultSharedPreferences.getString("gps_timeout_in_seconds", TrackOrderState.ORDER_DELIVERED));
            this.k = Integer.parseInt(defaultSharedPreferences.getString("android_gps_retry_count_threshold", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES));
            this.f18881r = Boolean.parseBoolean(defaultSharedPreferences.getString("enable_fast_current_location_provider", "false"));
            this.f18883s = Boolean.parseBoolean(defaultSharedPreferences.getString("enable_connect_disconnect_for_location_updates", "false"));
            this.f18888v0 = Integer.parseInt(defaultSharedPreferences.getString("nth_percentile_value_ds_defaulting", "50"));
            U3(defaultSharedPreferences);
        } catch (Exception unused) {
            u.d("LocationContext", "Exception on parsing");
        }
    }

    private void X3() {
        this.f18869j0 = 0;
        this.f18870k0 = 0;
        ig0.b.c();
    }

    private void e4() {
        this.P.D0(Boolean.valueOf(!R1(M2()).booleanValue()));
    }

    private void f4(Location location, List<Address> list, List<Address> list2) {
        Address address = list.get(0);
        for (Address next : list) {
            float distanceTo = location.distanceTo(next.getLocation());
            if (address != null && distanceTo < location.distanceTo(address.getLocation())) {
                address = next;
            }
        }
        m.b("setting closest address in case of login when sort score is not available");
        o4(location, address, list2);
    }

    private void h4() {
        this.f18880q0 = true;
        if (!this.f18859e) {
            i4(HalfCardTriggerSource.GPS_OFF);
        } else if (this.f18868i0) {
            i4(HalfCardTriggerSource.GPS_TIME_OUT);
        } else {
            i4(HalfCardTriggerSource.GPS_PERMISSION_OFF);
        }
    }

    private void i4(String str) {
        this.f18874m0 = str;
    }

    private void n3(List<Address> list) {
        AddressAttribute addressAttribute = new AddressAttribute();
        this.f18877o0 = addressAttribute;
        Address address = this.v;
        if (address != null) {
            addressAttribute.Id = address.getId();
            this.f18877o0.lat = Double.valueOf(this.v.getLatitude());
            this.f18877o0.lng = Double.valueOf(this.v.getLongitude());
            this.f18877o0.addressRank = Integer.valueOf(c.f(list, this.v));
            this.f18877o0.addressScore = Double.valueOf(this.f18860e0.j(this.v, getLocation(), this.f18860e0.e()));
        } else {
            SimpleLocation simpleLocation = this.f18889w;
            if (simpleLocation != null) {
                addressAttribute.lat = Double.valueOf(simpleLocation.getLatitude());
                this.f18877o0.lng = Double.valueOf(this.f18889w.getLongitude());
            }
        }
        this.f18858d0.G3(this.f18877o0);
        if (!this.f18879p0.b()) {
            this.Q.onNext(Boolean.TRUE);
        }
    }

    private void o3() {
        if (this.E == null) {
            synchronized (b.class) {
                if (this.E == null) {
                    this.E = BehaviorProcessor.z0();
                }
            }
        }
    }

    private void p3(List<Address> list) {
        HalfCardAttributes halfCardAttributes = new HalfCardAttributes();
        halfCardAttributes.halfCardSource = this.f18874m0;
        if (list != null && !list.isEmpty()) {
            halfCardAttributes.addressList = new ArrayList<>();
            if (list.size() > 0) {
                halfCardAttributes.addressList.add(s3(list.get(0), 1));
            }
            if (list.size() > 1) {
                halfCardAttributes.addressList.add(s3(list.get(1), 2));
            }
        }
        this.f18858d0.m2(halfCardAttributes);
    }

    private void p4(Activity activity, AtomicBoolean atomicBoolean) {
        atomicBoolean.set(false);
        i.a(activity).d(this.Z, new a(activity, atomicBoolean), (Looper) null);
    }

    private void q3() {
        if (this.f18866h0 == null) {
            LocationBundle locationBundle = new LocationBundle();
            this.f18866h0 = locationBundle;
            locationBundle.e(this.f18859e);
        }
    }

    private void r3(Location location, List<Address> list, boolean z11) {
        LocationCommonAttributes locationCommonAttributes = new LocationCommonAttributes();
        locationCommonAttributes.gpsEnabled = Boolean.valueOf(this.f18859e);
        if (location != null) {
            locationCommonAttributes.gpsLat = Double.valueOf(location.getLatitude());
            locationCommonAttributes.gpsLng = Double.valueOf(location.getLongitude());
            locationCommonAttributes.gpsInaccuracy = Float.valueOf(location.getAccuracy());
            locationCommonAttributes.gpsStaleInMillis = Long.valueOf(System.currentTimeMillis() - location.getTime());
        }
        locationCommonAttributes.addressLocationExperiment = Boolean.TRUE;
        locationCommonAttributes.appSessionId = this.f18872l0;
        if (this.f18859e) {
            locationCommonAttributes.defaultAddressLogic = z11 ? "splash" : "hc";
        } else if (LocationContextExtensionKt.q(R2(), this.f18882r0)) {
            locationCommonAttributes.defaultAddressLogic = "last-order-location";
        } else {
            locationCommonAttributes.defaultAddressLogic = this.B.e();
        }
        locationCommonAttributes.instanceId = this.f18872l0;
        if (z11) {
            locationCommonAttributes.splashSource = this.f18875n0;
            this.f18858d0.m2((HalfCardAttributes) null);
        } else {
            locationCommonAttributes.splashSource = null;
            p3(list);
            this.f18858d0.f0(LocationContextExtensionKt.J(this.f18882r0));
        }
        locationCommonAttributes.XpFlagDsModelGpsOn = this.f18890w0;
        locationCommonAttributes.xpVariant = String.valueOf(this.f18892x0);
        locationCommonAttributes.traceId = LocationContextExtensionKt.N(R2());
        locationCommonAttributes.defaultingTimeInMillis = c.h();
        this.f18858d0.g1(locationCommonAttributes);
        this.f18858d0.V2(LocationContextExtensionKt.X(this.f18882r0));
        n3(list);
        this.W = false;
    }

    private ig0.a u3(o oVar, boolean z11) {
        String str;
        int i11 = C0228b.f18899a[this.f18895z.ordinal()];
        if (i11 != 1) {
            str = i11 != 2 ? "-" : "last-known-location";
        } else {
            Address c11 = oVar.c();
            str = (c11 == null || !(c11.getAnnotationTag() == 2 || c11.getAnnotationTag() == 1)) ? "saved-address" : "annotation-h-w";
        }
        return new ig0.a(str, getLatitude(), getLongitude(), v3(z11), this.f18874m0, this.W);
    }

    private String v3(boolean z11) {
        return z11 ? "GPS_TIMEOUT" : x3();
    }

    private String w3() {
        GeocodedAddress geocodedAddress = this.f18886u;
        if (geocodedAddress != null) {
            if (!TextUtils.isEmpty(geocodedAddress.getSubLocality())) {
                return this.f18886u.getSubLocality();
            }
            GeocodedAddress geocodedAddress2 = this.f18886u;
            if (geocodedAddress2 != null && !TextUtils.isEmpty(geocodedAddress2.getPremises())) {
                return this.f18886u.getPremises();
            }
            GeocodedAddress geocodedAddress3 = this.f18886u;
            if (geocodedAddress3 != null && !TextUtils.isEmpty(geocodedAddress3.getAreaAndState())) {
                return this.f18886u.getAreaAndState();
            }
            GeocodedAddress geocodedAddress4 = this.f18886u;
            if (geocodedAddress4 != null && !TextUtils.isEmpty(geocodedAddress4.getName())) {
                return this.f18886u.getName();
            }
            GeocodedAddress geocodedAddress5 = this.f18886u;
            if (geocodedAddress5 != null && !TextUtils.isEmpty(geocodedAddress5.getArea())) {
                return this.f18886u.getArea();
            }
        }
        return "";
    }

    private String x3() {
        return String.valueOf(this.f18859e);
    }

    private l<Location, Boolean> y3() {
        return new c0(this);
    }

    public ao0.l<Boolean> A1() {
        return this.P.w0();
    }

    public GooglePlacePrediction A2() {
        return this.f18855b0;
    }

    /* access modifiers changed from: protected */
    public void A3(long j11, o oVar, boolean z11) {
        this.N.D0(new ig0.d(((double) j11) / 1000.0d, z11, this.W));
        Y3(oVar, z11);
    }

    public void B1() {
        f.g(this.q, Boolean.TRUE);
        this.q = null;
    }

    public ig0.a B2() {
        return this.B;
    }

    public void C(Address address) {
        i4("none");
        this.B = new ig0.a("user-clicked-saved-address", address.getLatitude(), address.getLongitude(), x3(), this.f18874m0, this.W);
    }

    public BehaviorProcessor<Location> C0() {
        return this.F;
    }

    public boolean C1() {
        return this.X;
    }

    public void D2(GeocodedAddress geocodedAddress) {
        this.f18886u = geocodedAddress;
        this.f18895z = LocationType.GPS;
        this.t = null;
        a();
        this.K.onNext(Boolean.TRUE);
    }

    public void E2() {
        v().onNext(t3());
        C0().onNext(t3());
        p1().onNext(t3());
        X1().onNext(Boolean.FALSE);
    }

    public GeocodedAddress F() {
        return this.f18886u;
    }

    public String F0() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return address.getDisplayableAddress();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getDisplayableAddress();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null) {
                return googlePlace.getAddressString();
            }
        } else {
            GeocodedAddress geocodedAddress = this.f18886u;
            if (geocodedAddress != null) {
                return geocodedAddress.getDisplayableAddress();
            }
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null) {
                return googlePlace2.getAddressString();
            }
        }
        return "";
    }

    public ao0.d<Location> F1(boolean z11) {
        if (in.swiggy.android.commons.utils.rxpermissions.a.g(M2()).h("android.permission.ACCESS_FINE_LOCATION")) {
            return z3().o().N(new a0(this, z11));
        }
        return ao0.d.M(t3());
    }

    public void G(LocationManager locationManager, SharedPreferences sharedPreferences) {
        LocationContextExtensionKt.r(this, this.f18882r0, this.f18884s0, f2(locationManager), this.f18860e0, sharedPreferences);
    }

    public Address G0() {
        return LocationContextExtensionKt.I(R2(), this.f18880q0, this.f18882r0);
    }

    public void G1(Address address) {
        J1(address);
        C(address);
        E2();
        this.G.onNext(getLocation());
    }

    public boolean G2() {
        return this.V;
    }

    public String H() {
        return getAreaName();
    }

    public void H0(boolean z11) {
        this.W = z11;
    }

    @SuppressLint({"MissingPermission"})
    public void H1(Activity activity, int i11, g<LocationPermissionState> gVar, AtomicBoolean atomicBoolean, Boolean bool) {
        Task<j> u22 = u2();
        u22.g(activity, new v(this, bool, activity, atomicBoolean));
        u22.d(activity, new e0(activity, i11, gVar));
        i.a(activity).b().d(activity, f0.f12952a);
    }

    public void I1(g<Boolean> gVar) {
        this.q = gVar;
    }

    public boolean J0() {
        return this.f18862f0;
    }

    public void J1(Address address) {
        this.v = address;
        if (address != null) {
            this.f18895z = LocationType.ADDRESS;
            this.f18891x = null;
        }
        a();
    }

    public Location K() {
        Location B0;
        Location location = new Location("");
        location.setLatitude(0.0d);
        location.setLongitude(0.0d);
        if (q2().C0() && (B0 = q2().B0()) != null) {
            double latitude = B0.getLatitude();
            double longitude = B0.getLongitude();
            LatLng latLng = Constants.FAILURE_DEFAULT_LOCATION;
            if (latitude != latLng.f43937a) {
                location.setLatitude(latitude);
            }
            if (longitude != latLng.f43938b) {
                location.setLongitude(longitude);
            }
        }
        return location;
    }

    public ao0.d<Location> L1() {
        return z3().u(S(), y3(), this.f18883s);
    }

    public boolean M0() {
        return this.f18868i0;
    }

    public boolean M1(Location location) {
        return location != null && !X(location) && C3(location);
    }

    public long N0() {
        return this.f18870k0;
    }

    /* access modifiers changed from: protected */
    public String N2() {
        return "LocationContext";
    }

    public ao0.l<Double> O0() {
        return this.O.w0();
    }

    /* access modifiers changed from: protected */
    public Object O2() {
        return this;
    }

    public void P(eo0.a aVar, g<LocationPermissionState> gVar, Activity activity, go0.a aVar2, go0.a aVar3, go0.a aVar4, int i11, AtomicBoolean atomicBoolean, go0.a aVar5, Boolean bool) {
        String[] strArr;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        if (in.swiggy.android.commons.utils.rxpermissions.a.g(activity.getApplication()).h("android.permission.ACCESS_FINE_LOCATION")) {
            try {
                aVar2.run();
            } catch (Exception e11) {
                u.h("LocationContext", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            strArr = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        } else {
            strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION"};
        }
        eo0.a aVar6 = aVar;
        aVar.c(in.swiggy.android.commons.utils.rxpermissions.a.g(activity).w(strArr).Q(do0.a.a()).h0(new x(this, activity, i11, gVar, atomicBoolean, bool, aVar3, atomicBoolean2, androidx.core.app.b.y(activity, "android.permission.ACCESS_FINE_LOCATION"), aVar5, aVar4), new cg0.u(gVar, aVar4)));
    }

    public BehaviorProcessor<Boolean> P1() {
        return this.R;
    }

    /* access modifiers changed from: protected */
    public String P2() {
        return "locationContext";
    }

    public void P3(SimpleLocation simpleLocation) {
        if (simpleLocation.equals(this.f18863g)) {
            this.f18857d = true;
        }
    }

    public l<Location, Boolean> Q1(LocationGps locationGps) {
        return new d0(this, locationGps);
    }

    public void Q3(Context context) {
        b bVar = (b) super.T2(b.class);
        if (bVar != null) {
            this.t = bVar.t;
            this.f18886u = bVar.f18886u;
            this.f18889w = bVar.f18889w;
            this.v = bVar.v;
            this.f18891x = bVar.f18891x;
            this.f18893y = bVar.f18893y;
            this.f18895z = bVar.f18895z;
        } else {
            u.k("LocationContext", "No location context to load");
        }
        h.b(new b0(this, context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = p0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String R() {
        /*
            r2 = this;
            in.swiggy.android.tejas.oldapi.models.enums.LocationType r0 = r2.w()
            in.swiggy.android.tejas.oldapi.models.enums.LocationType r1 = in.swiggy.android.tejas.oldapi.models.enums.LocationType.ADDRESS
            if (r0 != r1) goto L_0x0013
            in.swiggy.android.tejas.feature.address.model.Address r0 = r2.p0()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.getAnnotationTagStringDisplay()
            goto L_0x0015
        L_0x0013:
            java.lang.String r0 = ""
        L_0x0015:
            boolean r1 = os.d0.e(r0)
            if (r1 == 0) goto L_0x0029
            android.content.SharedPreferences r1 = r2.R2()
            boolean r1 = in.swiggy.android.swiggylocation.location.LocationContextExtensionKt.P(r1)
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r2.H()
        L_0x0029:
            boolean r1 = os.d0.e(r0)
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = r2.u1()
        L_0x0033:
            boolean r1 = os.d0.e(r0)
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = r2.F0()
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylocation.location.b.R():java.lang.String");
    }

    public Boolean R1(Context context) {
        return Boolean.valueOf(in.swiggy.android.commons.utils.rxpermissions.a.g(context).h("android.permission.ACCESS_FINE_LOCATION"));
    }

    public LocationRequest S() {
        if (this.Z == null) {
            this.Z = LocationRequest.M().S0(100).x0(0).H0(0).O0(1);
        }
        return this.Z;
    }

    public GooglePlace S0() {
        return this.f18893y;
    }

    /* access modifiers changed from: protected */
    public void S3(Location location, o oVar) {
        List<Address> g11 = oVar.g(location, (List<Address>) null, (AddressSortingWeight) null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float j11 = os.o.j(PreferenceManager.getDefaultSharedPreferences(M2()));
        if (j11 == 0.0f) {
            j11 = location.getAccuracy();
        }
        float f11 = this.f18873m + j11;
        float f12 = this.f18871l + j11;
        m.b("location inaccuracy in case of splash and hc : " + j11);
        if (g11 == null || g11.isEmpty()) {
            m.b("address list is null");
            l4(SplashScreenTriggerSource.NO_SAVED_ADDRESS);
            if (this.f18879p0.b()) {
                this.f18879p0.j(location, (Address) null, (List<Address>) null, SplashHalfCardTriggerSource.LOCATION_AREA_SPLASH);
            } else {
                n4(location);
            }
        } else {
            for (Address next : g11) {
                float distanceTo = location.distanceTo(next.getLocation());
                m.b("currentToAddressDistance for " + next.getAnnotationTagString() + " : " + distanceTo);
                if (distanceTo < f12) {
                    arrayList.add(next);
                }
                if (distanceTo < f11) {
                    arrayList2.add(next);
                }
            }
            m.b("inner list : " + arrayList2.toString());
            m.b("outer list : " + arrayList.toString());
            if (!arrayList.isEmpty()) {
                m.b("saved address(es) within 500 m");
                if (!arrayList2.isEmpty()) {
                    m.b("saved address(es) within 100 m");
                    if (arrayList2.size() == 1) {
                        m.b("single saved address within 100 m");
                        l4(SplashScreenTriggerSource.SINGLE_INNER_CIRCLE_ADDRESS);
                        if (this.f18879p0.b()) {
                            this.f18879p0.j(location, (Address) arrayList2.get(0), g11, SplashHalfCardTriggerSource.SAVED_ADDRESS_SPLASH);
                        } else {
                            o4(location, (Address) arrayList2.get(0), g11);
                        }
                    } else {
                        m.b("multiple saved address within 100 m");
                        B3(location, arrayList2, g11, true);
                    }
                } else {
                    m.b("no saved address within 100 m but in 100-500 m");
                    if (arrayList.size() == 1) {
                        m.b("single saved addresses within 100-500 m");
                        l4(SplashScreenTriggerSource.SINGLE_OUTER_CIRCLE_ADDRESS);
                        if (this.f18879p0.b()) {
                            this.f18879p0.j(location, (Address) arrayList.get(0), g11, SplashHalfCardTriggerSource.SAVED_ADDRESS_SPLASH);
                        } else {
                            o4(location, (Address) arrayList.get(0), g11);
                        }
                    } else {
                        m.b("multiple saved addresses within 100-500 m");
                        B3(location, arrayList, g11, false);
                    }
                }
            } else {
                m.b("no saved address within 500 m");
                l4(SplashScreenTriggerSource.NO_SAVED_ADDRESS_WITHIN_OUTER_CIRCLE);
                if (this.f18879p0.b()) {
                    this.f18879p0.j(location, (Address) null, (List<Address>) null, SplashHalfCardTriggerSource.LOCATION_AREA_SPLASH);
                } else {
                    n4(location);
                }
            }
        }
        if (this.f18879p0.b()) {
            this.R.onNext(Boolean.TRUE);
        }
    }

    public DsDefaultingInstrumentationParams T0() {
        return this.f18885t0;
    }

    public float V() {
        return os.o.j(R2());
    }

    public boolean V0() {
        return this.T;
    }

    public void V1(Location location, o oVar) {
        if (location == null) {
            Address c11 = oVar.c();
            oVar.d(c11);
            J1(c11);
            if (c11 != null) {
                m.a("dl default address : " + c11.getLocation());
                m.a("dl default address tag : " + c11.getAnnotationTagStringDisplay());
            }
            g4((Location) null);
            if (!this.f18864g0) {
                q3();
                this.f18866h0.g(true);
                T3(getLocation());
                return;
            }
            z();
            return;
        }
        LocationContextExtensionKt.s(this, oVar, location);
    }

    public ao0.d<GooglePlacePredictionList> W0(String str, LatLngBounds latLngBounds) {
        return z3().p(str, latLngBounds);
    }

    public void W1() {
        R2().edit().putLong("gps_recorded_time", System.currentTimeMillis()).apply();
    }

    public void W3() {
        u.b("LocationContext", "Resetting location");
        this.t = null;
        this.f18886u = null;
        this.f18889w = null;
        this.v = null;
        this.f18891x = null;
        this.f18893y = null;
        this.f18895z = null;
        this.f18855b0 = null;
    }

    public boolean X(Location location) {
        return location == null || (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d);
    }

    public void X0() {
        this.E = null;
    }

    public BehaviorProcessor<Boolean> X1() {
        return this.H;
    }

    public boolean Y0() {
        double latitude = getLatitude();
        LatLng latLng = Constants.FAILURE_DEFAULT_LOCATION;
        return (latitude == latLng.f43937a && getLongitude() == latLng.f43938b) || (getLatitude() == 0.0d && getLongitude() == 0.0d);
    }

    public boolean Y1(Location location) {
        return X(location);
    }

    public void Y3(o oVar, boolean z11) {
        V1((Location) null, oVar);
        h4();
        boolean f11 = oVar.f(this);
        this.T = f11;
        m.b("New Defaulting Logic shouldLaunchChoosePlace : " + f11);
        if (f11) {
            this.H.onNext(Boolean.TRUE);
            Z3(new ig0.a("pick-location", 0.0d, 0.0d, x3(), this.f18874m0, this.W));
        } else {
            this.D.onNext(getLocation());
            Z3(u3(oVar, z11));
        }
        List<Address> g11 = oVar.g(getLocation(), (List<Address>) null, (AddressSortingWeight) null);
        LocationContextExtensionKt.U(R2(), this.f18858d0, this.f18882r0, g11);
        r3((Location) null, g11, false);
    }

    public boolean Z0(LocationManager locationManager) {
        if (!locationManager.getAllProviders().contains("gps") || !locationManager.getAllProviders().contains(LogSubCategory.ApiCall.NETWORK)) {
            return false;
        }
        if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled(LogSubCategory.ApiCall.NETWORK)) {
            return true;
        }
        return false;
    }

    public void Z1(GooglePlace googlePlace) {
        this.f18893y = googlePlace;
        if (googlePlace != null) {
            this.f18895z = LocationType.SEARCH;
            this.f18891x = null;
            this.v = null;
        }
        a();
    }

    public void Z3(ig0.a aVar) {
        this.B = aVar;
        this.J.onNext(aVar);
    }

    public void a1(LocationType locationType) {
        if (this.f18895z != locationType) {
            this.f18895z = locationType;
            a();
        }
    }

    public void a4(Address address) {
        Z3(new ig0.a(this.f18857d ? "last-known-location-saved-address" : "gps-saved-address", address.getLocation().getLatitude(), address.getLocation().getLongitude(), x3(), this.f18874m0, this.W));
    }

    public void b() {
        super.b();
        W3();
    }

    public ao0.d<GooglePlace> b2(String str) {
        return z3().j(str);
    }

    /* access modifiers changed from: protected */
    public void b4(long j11) {
        this.f18870k0 = j11;
        this.O.D0(Double.valueOf(((double) j11) / 1000.0d));
    }

    public void c4(Location location, AtomicBoolean atomicBoolean) {
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            w0(true);
            h2(true);
            V1(location, this.f18860e0);
            this.C.onNext(location);
            W1();
            this.D.onNext(location);
            this.G.onNext(location);
            this.M.onNext(location);
        }
    }

    public PublishProcessor<Boolean> d1() {
        return this.L;
    }

    public void d4(Location location) {
        Z3(new ig0.a(this.f18857d ? "last-known-location-new-area" : "gps-new-area", location.getLatitude(), location.getLongitude(), x3(), this.f18874m0, this.W));
    }

    public void e1(SplashHalfCardTriggerSource splashHalfCardTriggerSource) {
        Location c11 = this.f18879p0.c();
        Address f11 = this.f18879p0.f();
        List<Address> k11 = this.f18879p0.k();
        boolean z11 = false;
        if (splashHalfCardTriggerSource != null) {
            int i11 = C0228b.f18900b[splashHalfCardTriggerSource.ordinal()];
            if (i11 == 1) {
                o4(c11, f11, k11);
            } else if (i11 == 2) {
                n4(c11);
            } else if (i11 == 3) {
                m4(c11, f11, k11);
            }
            z11 = true;
        }
        r3(c11, k11, z11);
    }

    public void f0(boolean z11) {
        this.f18862f0 = z11;
    }

    public ao0.l<ig0.d> f1() {
        return this.N.w0();
    }

    public boolean f2(LocationManager locationManager) {
        return R1(M2()).booleanValue() && Z0(locationManager);
    }

    public LocationBundle g0() {
        return this.f18866h0;
    }

    public void g4(Location location) {
        this.f18889w = SimpleLocation.fromLocation(location);
        if (location != null) {
            this.f18895z = LocationType.GPS;
            this.v = null;
            this.f18891x = null;
            this.t = null;
            this.f18886u = null;
        }
        a();
    }

    public float getAccuracy() {
        Location location = this.f18861f;
        if (location != null) {
            return location.getAccuracy();
        }
        return -1000.0f;
    }

    public String getAddressId() {
        if (this.f18895z == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                try {
                    return address.getId();
                } catch (NumberFormatException e11) {
                    e11.printStackTrace();
                }
            } else {
                Address address2 = this.f18891x;
                if (address2 != null) {
                    return address2.getId();
                }
            }
        }
        return "";
    }

    public String getAreaName() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return address.getArea();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getArea();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null) {
                return googlePlace.getSecondLevelName();
            }
        } else if (this.f18886u != null) {
            return w3();
        } else {
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null) {
                return googlePlace2.getTitle();
            }
        }
        return "";
    }

    public String getCity() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return address.getCity();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getCity();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null) {
                return googlePlace.getCity();
            }
        } else {
            GeocodedAddress geocodedAddress = this.f18886u;
            if (geocodedAddress != null) {
                return geocodedAddress.getCity();
            }
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null) {
                return googlePlace2.getCity();
            }
        }
        return "";
    }

    public double getLatitude() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return address.getLatitude();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getLatitude();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null && googlePlace.isLatLngValid()) {
                return this.f18893y.getLatitude();
            }
        } else {
            GeocodedAddress geocodedAddress = this.f18886u;
            if (geocodedAddress != null) {
                return geocodedAddress.getLatitude();
            }
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null && googlePlace2.isLatLngValid()) {
                return this.t.getLatitude();
            }
            SimpleLocation simpleLocation = this.f18889w;
            if (simpleLocation != null && this.f18895z == LocationType.GPS) {
                return simpleLocation.getLatitude();
            }
        }
        return 0.0d;
    }

    public Location getLocation() {
        Location location = new Location("");
        location.setLatitude(getLatitude());
        location.setLongitude(getLongitude());
        return location;
    }

    public double getLongitude() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return address.getLongitude();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getLongitude();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null && googlePlace.isLatLngValid()) {
                return this.f18893y.getLongitude();
            }
        } else {
            GeocodedAddress geocodedAddress = this.f18886u;
            if (geocodedAddress != null) {
                return geocodedAddress.getLongitude();
            }
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null && googlePlace2.isLatLngValid()) {
                return this.t.getLongitude();
            }
            SimpleLocation simpleLocation = this.f18889w;
            if (simpleLocation != null && this.f18895z == LocationType.GPS) {
                return simpleLocation.getLongitude();
            }
        }
        return 0.0d;
    }

    public o h() {
        return this.f18860e0;
    }

    public ao0.d<ig0.a> h0() {
        if (this.J == null) {
            this.J = BehaviorProcessor.z0();
        }
        return this.J;
    }

    public void h2(boolean z11) {
        this.f18864g0 = z11;
    }

    public int i() {
        return this.f18869j0;
    }

    public float i1() {
        return this.f18878p;
    }

    public String i2() {
        return this.f18890w0;
    }

    public int j1() {
        Location location;
        if (!this.f18859e || (location = this.f18861f) == null) {
            return 0;
        }
        return M1(location) ? 1 : 2;
    }

    public void j4(SimpleLocation simpleLocation) {
        this.f18863g = simpleLocation;
    }

    public String k() {
        return this.f18874m0;
    }

    /* access modifiers changed from: protected */
    public void k4(Location location) {
        this.f18861f = location;
    }

    public boolean l(Location location) {
        List<Address> k11 = this.f18860e0.k();
        float j11 = os.o.j(PreferenceManager.getDefaultSharedPreferences(M2()));
        if (j11 == 0.0f) {
            j11 = location.getAccuracy();
        }
        float f11 = this.f18871l + j11;
        if (k11 == null || k11.isEmpty()) {
            return false;
        }
        for (Address location2 : k11) {
            if (location.distanceTo(location2.getLocation()) < f11) {
                return true;
            }
        }
        return false;
    }

    public String l0() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return address.getDisplayableAddressContentDescription();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getDisplayableAddressContentDescription();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null) {
                return googlePlace.getTitle();
            }
        } else {
            GeocodedAddress geocodedAddress = this.f18886u;
            if (geocodedAddress != null) {
                return geocodedAddress.getDisplayableAddressContentDescription();
            }
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null) {
                return googlePlace2.getTitle();
            }
        }
        return "";
    }

    public void l4(String str) {
        this.f18875n0 = str;
    }

    public void m0(o oVar) {
        if (this.f18860e0 == null) {
            this.f18860e0 = oVar;
        }
    }

    public LatLngBounds m1(SharedPreferences sharedPreferences) {
        OperationalCityBounds operationalCityBounds;
        ArrayList<LatLngBounds> arrayList = this.A;
        if (arrayList == null || arrayList.isEmpty()) {
            String string = sharedPreferences.getString("operational_city_bounds", (String) null);
            if (os.d0.e(string)) {
                operationalCityBounds = this.Y;
            } else {
                Gson i11 = g0.i();
                Class cls = OperationalCityBounds.class;
                operationalCityBounds = (OperationalCityBounds) (!(i11 instanceof Gson) ? i11.fromJson(string, cls) : GsonInstrumentation.fromJson(i11, string, cls));
            }
            this.A = operationalCityBounds.getLatLngBoundsList();
        }
        LatLng latLng = new LatLng(getLatitude(), getLongitude());
        for (int i12 = 0; i12 < this.A.size(); i12++) {
            LatLngBounds latLngBounds = this.A.get(i12);
            if (latLngBounds.P(latLng)) {
                return latLngBounds;
            }
        }
        return Constants.BOUNDS_INDIA;
    }

    public void m2(boolean z11) {
        this.V = z11;
    }

    /* access modifiers changed from: protected */
    public void m3() {
        Location location = getLocation();
        this.C.onNext(location);
        W1();
        this.D.onNext(location);
    }

    public void m4(Location location, Address address, List<Address> list) {
        this.f18860e0.d(address);
        J1(address);
        a1(LocationType.ADDRESS);
        if (this.f18864g0 || this.f18879p0.b()) {
            z();
        } else {
            a4(address);
            q3();
            this.f18866h0.d(list);
            this.f18866h0.g(true);
            T3(getLocation());
            r3(location, list, false);
        }
        if (this.f18879p0.b()) {
            m3();
        }
    }

    public PublishProcessor<Location> n1() {
        return this.M;
    }

    public void n4(Location location) {
        z();
        this.f18860e0.d((Address) null);
        g4(location);
        if (!this.f18864g0 && !this.f18879p0.b()) {
            d4(location);
            T3(location);
            r3(location, (List<Address>) null, true);
        }
        if (this.f18879p0.b()) {
            m3();
        }
    }

    public AddressAttribute o2() {
        return this.f18877o0;
    }

    public void o4(Location location, Address address, List<Address> list) {
        z();
        this.f18860e0.d(address);
        J1(address);
        a1(LocationType.ADDRESS);
        if (!this.f18864g0 && !this.f18879p0.b()) {
            a4(address);
            T3(location);
            r3(location, list, true);
        }
        if (this.f18879p0.b()) {
            m3();
        }
    }

    public void p(double d11, double d12) {
        i4("none");
        this.B = new ig0.a("user-clicked-new-area", d11, d12, x3(), this.f18874m0, this.W);
    }

    public Address p0() {
        return this.v;
    }

    public BehaviorProcessor<Location> p1() {
        return this.G;
    }

    public void q(o oVar, AtomicBoolean atomicBoolean) {
        z();
        atomicBoolean.set(false);
        oVar.d(oVar.c());
        if (this.f18864g0) {
            J1(oVar.c());
            g4((Location) null);
        }
        d1().onNext(Boolean.FALSE);
    }

    public BehaviorProcessor<Location> q0() {
        o3();
        return this.E;
    }

    public void q1(double d11, double d12) {
        i4("none");
        this.B = new ig0.a("user-clicked-recent-searches", d11, d12, x3(), this.f18874m0, this.W);
    }

    public BehaviorProcessor<Location> q2() {
        return this.C;
    }

    public long s2() {
        return R2().getLong("gps_recorded_time", 0);
    }

    public AddressAttribute s3(Address address, Integer num) {
        AddressAttribute addressAttribute = new AddressAttribute();
        addressAttribute.Id = address.getId();
        addressAttribute.lat = Double.valueOf(address.getLatitude());
        addressAttribute.lng = Double.valueOf(address.getLongitude());
        addressAttribute.addressScore = Double.valueOf(address.getSortScore() == null ? 0.0d : address.getSortScore().doubleValue());
        addressAttribute.addressRank = num;
        addressAttribute.nudgeFlag = null;
        return addressAttribute;
    }

    public String t() {
        return this.f18872l0;
    }

    public int t0() {
        return this.f18892x0;
    }

    public Address t1() {
        return this.f18891x;
    }

    public Location t3() {
        return new Location("");
    }

    public String toString() {
        Gson i11 = g0.i();
        return !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
    }

    @SuppressLint({"MissingPermission"})
    public eo0.b u(LocationManager locationManager, o oVar, SharedPreferences sharedPreferences) {
        c.l();
        G(locationManager, sharedPreferences);
        z2();
        h2(false);
        if (!in.swiggy.android.commons.utils.rxpermissions.a.g(M2()).h("android.permission.ACCESS_FINE_LOCATION") || !Z0(locationManager) || sharedPreferences.getBoolean("first_app_launch_after_install", true)) {
            m.b("no location permission or gps off");
            w0(false);
            e4();
            m.b("New Defaulting Logic location permission Granted : " + Z0(locationManager));
            Y3(oVar, false);
            this.f18894y0 = ao0.d.M(new Location("")).m0(wo0.a.c()).h0(y.f13000a, z.f13001a);
        } else {
            this.X = true;
            long currentTimeMillis = System.currentTimeMillis();
            w0(true);
            X3();
            m.b("New Defaulting Logic location permission Granted : " + Z0(locationManager));
            LocationContextExtensionKt.W(this, sharedPreferences);
            this.f18894y0 = LocationContextExtensionKt.v(this, currentTimeMillis);
        }
        return this.f18894y0;
    }

    public String u1() {
        LocationType locationType = this.f18895z;
        if (locationType == LocationType.ADDRESS) {
            Address address = this.v;
            if (address != null) {
                return os.d0.e(address.getSubLocality()) ? this.v.getArea() : this.v.getSubLocality();
            }
            Address address2 = this.f18891x;
            if (address2 != null) {
                return address2.getArea();
            }
        } else if (locationType == LocationType.SEARCH) {
            GooglePlace googlePlace = this.f18893y;
            if (googlePlace != null) {
                return googlePlace.getTitle();
            }
        } else {
            GeocodedAddress geocodedAddress = this.f18886u;
            if (geocodedAddress != null) {
                return os.d0.g(geocodedAddress.getSubLocality()) ? this.f18886u.getSubLocality() : this.f18886u.getLocality();
            }
            GooglePlace googlePlace2 = this.t;
            if (googlePlace2 != null) {
                return googlePlace2.getTitle();
            }
        }
        return "";
    }

    public Task<j> u2() {
        return i.c(M2()).a(new LocationSettingsRequest.a().a(S()).b());
    }

    public BehaviorProcessor<Location> v() {
        return this.D;
    }

    public void v0(Location location) {
        this.f18889w = SimpleLocation.fromLocation(location);
        a();
    }

    public LocationType w() {
        return this.f18895z;
    }

    public void w0(boolean z11) {
        this.f18859e = z11;
    }

    public void w1(Address address) {
        this.f18891x = address;
        if (address != null) {
            this.f18895z = LocationType.ADDRESS;
            this.v = address;
        }
        a();
    }

    public BehaviorProcessor<Boolean> w2() {
        return this.Q;
    }

    public void x1(GooglePlacePrediction googlePlacePrediction) {
        this.f18855b0 = googlePlacePrediction;
    }

    public Location y() {
        SimpleLocation simpleLocation = this.f18889w;
        if (simpleLocation != null) {
            return simpleLocation.convertToLocation();
        }
        return null;
    }

    public void y0(boolean z11) {
        this.T = z11;
    }

    public void z() {
        this.f18866h0 = null;
    }

    public boolean z1(Order order) {
        if (order == null || order.getDeliveryAddress() == null || this.f18861f == null) {
            return false;
        }
        Address deliveryAddress = order.getDeliveryAddress();
        float[] fArr = new float[3];
        Location.distanceBetween(deliveryAddress.getLatitude(), deliveryAddress.getLongitude(), this.f18861f.getLatitude(), this.f18861f.getLongitude(), fArr);
        if (((double) fArr[0]) < 20.0d) {
            return true;
        }
        return false;
    }

    public void z2() {
        eo0.b bVar = this.f18894y0;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public j1 z3() {
        if (this.f18854a0 == null) {
            synchronized (b.class) {
                if (this.f18854a0 == null) {
                    this.f18854a0 = new j1(M2(), this.f18856c0, i.b(M2()));
                }
            }
        }
        return this.f18854a0;
    }
}
