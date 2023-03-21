package if0;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import cg0.n;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import ef0.e;
import fg0.d;
import ig0.c;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressSortingWeight;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressExp;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceGeometry;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceLocation;
import in.swiggy.android.tejas.feature.user.CommunicationSubscriptionData;
import in.swiggy.android.tejas.feature.user.UnBoxingDataResponse;
import in.swiggy.android.tejas.feature.user.UserDataOptionalMap;
import in.swiggy.android.tejas.feature.user.UserSuperDataResponse;
import in.swiggy.android.tejas.feature.user.UserSuperDetailsValue;
import in.swiggy.android.tejas.feature.user.enums.SuperVersion;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.enums.LocationType;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import in.swiggy.android.tejas.oldapi.utils.Constants;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import os.a;
import os.d0;
import os.u;

@Instrumented
/* compiled from: User */
public class j extends d implements e {
    public static final Pattern S = Pattern.compile("\\b\\d{6}\\b");
    private static final String T = j.class.getSimpleName();
    private static final AddressSortingWeight U = new AddressSortingWeight(Double.valueOf(0.9d), Double.valueOf(0.1d));
    @SerializedName("defaulting_type")
    private int A;
    @SerializedName("proximity_weight")
    private Double B;
    public CommunicationSubscriptionData C;
    private transient boolean D = false;
    private transient boolean E = false;
    private int F = -1;
    private boolean G = false;
    private UserSuperDataResponse H;
    private UnBoxingDataResponse I;
    private transient a J;
    private transient IAddressExp K;
    private transient PublishProcessor<Boolean> L = PublishProcessor.z0();
    private transient PublishProcessor<String> M = PublishProcessor.z0();
    private transient PublishProcessor<Boolean> N = PublishProcessor.z0();
    private transient PublishProcessor<Boolean> O = PublishProcessor.z0();
    private transient PublishSubject<Boolean> P = PublishSubject.b();
    private transient PublishProcessor<Boolean> Q = PublishProcessor.z0();
    private transient PublishProcessor<String> R = PublishProcessor.z0();
    @SerializedName("userName")

    /* renamed from: d  reason: collision with root package name */
    private String f18390d;
    @SerializedName("phoneNumber")

    /* renamed from: e  reason: collision with root package name */
    private String f18391e;
    @SerializedName("email")

    /* renamed from: f  reason: collision with root package name */
    private String f18392f;
    @SerializedName("customerId")

    /* renamed from: g  reason: collision with root package name */
    private String f18393g;
    @SerializedName("addressList")

    /* renamed from: h  reason: collision with root package name */
    private List<Address> f18394h = Collections.synchronizedList(new ArrayList());
    @SerializedName("userType")

    /* renamed from: i  reason: collision with root package name */
    private String f18395i = "NOT_SUPER";
    @SerializedName("referral")
    private String j = "";
    @SerializedName("mobileVerified")
    private String k;
    @SerializedName("emailVerified")

    /* renamed from: l  reason: collision with root package name */
    private String f18396l;
    @SerializedName("tid")

    /* renamed from: m  reason: collision with root package name */
    private String f18397m;
    @SerializedName("token")
    private String n;
    @SerializedName("swuid")

    /* renamed from: o  reason: collision with root package name */
    private String f18398o;
    @SerializedName("sessionId")

    /* renamed from: p  reason: collision with root package name */
    private String f18399p = "";
    @SerializedName("journeyId")
    private String q = "";
    @SerializedName("userSuperDetails")

    /* renamed from: r  reason: collision with root package name */
    private UserSuperDetailsValue f18400r;
    @SerializedName("authToken")

    /* renamed from: s  reason: collision with root package name */
    private String f18401s;
    @SerializedName("recent_searches_explore")
    private LinkedList<String> t = new LinkedList<>();
    @SerializedName("smsCode")

    /* renamed from: u  reason: collision with root package name */
    private String f18402u;
    @SerializedName("recentSearches")
    private LinkedList<GooglePlace> v = new LinkedList<>();
    @SerializedName("addressClickedCountMap")

    /* renamed from: w  reason: collision with root package name */
    private HashMap<String, Integer> f18403w = new HashMap<>();
    @SerializedName("migrationDone")

    /* renamed from: x  reason: collision with root package name */
    private boolean f18404x;
    @SerializedName("swiggyPayEnabled")

    /* renamed from: y  reason: collision with root package name */
    private boolean f18405y;
    @SerializedName("address_sort")

    /* renamed from: z  reason: collision with root package name */
    private AddressSortingWeight f18406z = U;

    public j(Context context, a aVar, IAddressExp iAddressExp) {
        super(context);
        i3(context);
        this.J = aVar;
        this.K = iAddressExp;
    }

    private Location c3(GooglePlaceLocation googlePlaceLocation) {
        if (googlePlaceLocation == null) {
            return null;
        }
        Location location = new Location("");
        location.setLatitude(googlePlaceLocation.getLatitude());
        location.setLongitude(googlePlaceLocation.getLongitude());
        return location;
    }

    private boolean f3(Address address) {
        Calendar instance = Calendar.getInstance();
        int i11 = instance.get(11);
        int i12 = instance.get(7);
        boolean z11 = i12 > 1 && i12 < 7 && i11 >= 10 && i11 <= 19;
        if ((address.getAnnotationTag() != 2 || !z11) && (address.getAnnotationTag() != 1 || z11)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int h3(Address address, Address address2) {
        Integer num = this.f18403w.get(address.getId());
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = this.f18403w.get(address2.getId());
        int intValue2 = num2 != null ? num2.intValue() : 0;
        if (intValue < intValue2) {
            return 1;
        }
        if (intValue > intValue2) {
            return -1;
        }
        return 0;
    }

    private boolean j3() {
        b bVar = (b) super.T2(b.class);
        this.f18404x = true;
        if (bVar == null || !bVar.r()) {
            return false;
        }
        this.f18392f = bVar.f();
        this.f18390d = bVar.i();
        this.f18391e = bVar.j();
        this.f18397m = bVar.o();
        this.n = bVar.p();
        this.f18401s = bVar.d();
        this.f18393g = bVar.e();
        this.f18394h = bVar.c();
        this.v = bVar.k();
        this.f18399p = bVar.m();
        this.f18395i = bVar.q();
        this.j = bVar.l();
        this.k = bVar.h();
        this.f18396l = bVar.g();
        this.f18398o = bVar.n();
        return true;
    }

    private boolean k3(n nVar) {
        try {
            Address d32 = d3();
            Address t12 = nVar.t1();
            Address p02 = nVar.p0();
            Address G0 = nVar.G0();
            this.G = true;
            if (G0 != null) {
                nVar.J1(G0);
                nVar.a1(LocationType.ADDRESS);
                return false;
            }
            if (d32 != null) {
                nVar.J1(d32);
            } else if (t12 != null) {
                nVar.J1(t12);
            } else if (p02 != null) {
                nVar.a1(LocationType.ADDRESS);
            } else if (nVar.y() != null) {
                nVar.a1(LocationType.GPS);
                nVar.C0().onNext(nVar.y());
                return false;
            } else if (nVar.S0() == null) {
                return true;
            } else {
                nVar.a1(LocationType.SEARCH);
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private boolean l3(n nVar) {
        try {
            this.G = true;
            if (nVar.y() != null) {
                nVar.a1(LocationType.GPS);
                nVar.C0().onNext(nVar.y());
                return false;
            } else if (nVar.S0() != null) {
                nVar.a1(LocationType.SEARCH);
                return false;
            } else if (nVar.F() == null) {
                return true;
            } else {
                nVar.Z1(nVar.F().toGooglePlace());
                nVar.a1(LocationType.SEARCH);
                return false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public boolean A() {
        return this.D;
    }

    public void A0(boolean z11) {
        this.Q.onNext(Boolean.valueOf(z11));
    }

    public Boolean C2() {
        String str = this.f18395i;
        if (str != null) {
            return Boolean.valueOf(str.equals("WAS_SUPER"));
        }
        return null;
    }

    public boolean D() {
        boolean z11;
        synchronized (this.f18394h) {
            z11 = false;
            List<Address> list = this.f18394h;
            if (list != null && !list.isEmpty()) {
                Iterator<Address> it2 = this.f18394h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().getAnnotationTag() == 2) {
                            z11 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return z11;
    }

    public String D0() {
        return this.f18392f;
    }

    public ao0.d<String> E() {
        return this.M;
    }

    public boolean F2() {
        return !TextUtils.isEmpty(this.n);
    }

    public List<GooglePlace> H2(String str) {
        String lowerCase = str.toLowerCase();
        ArrayList arrayList = new ArrayList();
        for (GooglePlace next : I()) {
            if (next.toString().toLowerCase().contains(lowerCase)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<GooglePlace> I() {
        return this.v;
    }

    public boolean J(Address address) {
        if (address == null || (address.getAnnotationTag() != 1 && address.getAnnotationTag() != 2)) {
            return false;
        }
        return true;
    }

    public Boolean J2() {
        String str = this.f18395i;
        if (str != null) {
            return Boolean.valueOf(str.equals(Constants.SUPER_TAG));
        }
        return null;
    }

    public UnBoxingDataResponse L() {
        return this.I;
    }

    public boolean L0() {
        return g3() && this.H.getUserStatus().equals(Constants.SUPER_TAG);
    }

    public int N() {
        return this.F;
    }

    public UserSuperDataResponse N1() {
        return this.H;
    }

    /* access modifiers changed from: protected */
    public String N2() {
        return T;
    }

    public void O() {
        this.E = false;
    }

    public void O1() {
        this.E = true;
        PublishProcessor<Boolean> publishProcessor = this.L;
        Boolean bool = Boolean.TRUE;
        publishProcessor.onNext(bool);
        this.O.onNext(bool);
    }

    /* access modifiers changed from: protected */
    public Object O2() {
        return this;
    }

    public boolean P0() {
        return b3();
    }

    /* access modifiers changed from: protected */
    public String P2() {
        return LogSubCategory.Action.USER;
    }

    public CommunicationSubscriptionData Q() {
        return this.C;
    }

    public List<Address> Q0(String str) {
        String lowerCase = str.toLowerCase();
        ArrayList arrayList = new ArrayList();
        for (Address next : z0()) {
            if ((next.getDisplayableAddress() + next.getAnnotationTagStringDisplay()).toLowerCase().contains(lowerCase)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean R0() {
        return Constants.SUPER_TAG.equals(this.f18395i);
    }

    public void T1(String str) {
        this.q = str;
    }

    public PublishSubject<Boolean> U1() {
        return this.P;
    }

    public boolean Z() {
        return !TextUtils.isEmpty(this.f18401s);
    }

    public void a2(CommunicationSubscriptionData communicationSubscriptionData) {
        this.C = communicationSubscriptionData;
    }

    public void b() {
        m3();
    }

    public void b1(String str) {
        this.R.onNext(str);
    }

    public boolean b3() {
        return !TextUtils.isEmpty(this.f18398o);
    }

    public Address c() {
        Address address;
        Address next;
        synchronized (this.f18394h) {
            boolean a11 = c.a("android_quarantine_active", "false", M2());
            address = null;
            List<Address> list = this.f18394h;
            if (list != null && !list.isEmpty()) {
                Iterator<Address> it2 = this.f18394h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    if (!a11) {
                        if (next.getAnnotationTag() != 2 || !f3(next)) {
                            if (next.getAnnotationTag() == 1 && f3(next)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (next.getAnnotationTag() == 1) {
                        break;
                    }
                }
                address = next;
                if (address == null) {
                    address = this.f18394h.get(0);
                }
            }
        }
        return address;
    }

    public boolean c0() {
        return !TextUtils.isEmpty(this.f18397m);
    }

    public Boolean c1() {
        String str = this.f18395i;
        if (str != null) {
            return Boolean.valueOf(str.equals("NOT_SUPER"));
        }
        return null;
    }

    public void c2(List<Address> list) {
        synchronized (this.f18394h) {
            if (list != null) {
                List<Address> list2 = this.f18394h;
                if (list2 != null) {
                    list2.clear();
                } else {
                    this.f18394h = new ArrayList();
                }
                for (Address next : list) {
                    if (next.getAnnotationTagString().isEmpty()) {
                        next.setAnnotationString("Other");
                    }
                    next.setAnnotationTag(next.getAnnotationTag());
                    this.f18394h.add(next);
                }
            }
            Collections.sort(this.f18394h);
            a();
        }
    }

    public void d(Address address) {
        synchronized (this.f18394h) {
            Address address2 = null;
            if (address != null) {
                for (Address next : this.f18394h) {
                    next.setDefault(false);
                    if (next.getId().equals(address.getId())) {
                        address2 = next;
                    }
                }
                if (address2 != null) {
                    address2.setDefault(true);
                    address2.getAnnotationTagString();
                    if (address2.getAnnotationTagString().isEmpty()) {
                        address2.setAnnotationString("Other");
                    }
                    address2.setAnnotationTag(address2.getAnnotationTag());
                }
            } else {
                for (Address address3 : this.f18394h) {
                    address3.setDefault(false);
                }
            }
            a();
        }
    }

    public void d0(int i11, Double d11, List<Address> list) {
        this.A = i11;
        this.B = d11;
        c2(list);
    }

    public void d2() {
        this.D = false;
        this.N.B0(Boolean.FALSE);
        this.F = -1;
    }

    public Address d3() {
        Address address;
        synchronized (this.f18394h) {
            address = null;
            Iterator<Address> it2 = this.f18394h.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Address next = it2.next();
                if (next.isDefault()) {
                    address = next;
                    break;
                }
            }
        }
        return address;
    }

    public AddressSortingWeight e() {
        return this.f18406z;
    }

    public boolean e0() {
        return this.I != null;
    }

    public Boolean e2() {
        return Boolean.valueOf(e3().equals(SuperVersion.SUPER_V3.name()));
    }

    public String e3() {
        UserSuperDataResponse userSuperDataResponse = this.H;
        if (userSuperDataResponse == null || userSuperDataResponse.getSuperVersion() == null) {
            return SuperVersion.DEFAULT.name();
        }
        return this.H.getSuperVersion();
    }

    public void f() {
        this.f18395i = Constants.SUPER_TAG;
    }

    public boolean g() {
        return this.f18405y;
    }

    public ao0.d<Boolean> g1() {
        return this.L;
    }

    public void g2(String str) {
        this.M.onNext(str);
    }

    public boolean g3() {
        UserSuperDataResponse userSuperDataResponse = this.H;
        return (userSuperDataResponse == null || userSuperDataResponse.getCta() == null || this.H.getCta().getLink() == null || this.H.getCta().getLink().isEmpty()) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.address.model.Address getAddressById(java.lang.String r6) {
        /*
            r5 = this;
            java.util.List<in.swiggy.android.tejas.feature.address.model.Address> r0 = r5.f18394h
            monitor-enter(r0)
            boolean r1 = os.d0.e(r6)     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r1 != 0) goto L_0x003d
            java.util.List r1 = r5.z0()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.List r1 = r5.z0()     // Catch:{ all -> 0x003f }
            int r1 = r1.size()     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001b
            goto L_0x003d
        L_0x001b:
            java.util.List r1 = r5.z0()     // Catch:{ all -> 0x003f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003f }
        L_0x0023:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x003f }
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x003f }
            in.swiggy.android.tejas.feature.address.model.Address r3 = (in.swiggy.android.tejas.feature.address.model.Address) r3     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.getId()     // Catch:{ all -> 0x003f }
            boolean r4 = r4.equalsIgnoreCase(r6)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r3
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r2
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r2
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: if0.j.getAddressById(java.lang.String):in.swiggy.android.tejas.feature.address.model.Address");
    }

    public String getAuthToken() {
        String str = this.f18401s;
        return str != null ? str : "";
    }

    public String getCustomerId() {
        String str = this.f18393g;
        return str == null ? "" : str;
    }

    public int getDefaultingType() {
        return this.A;
    }

    public String getDeviceId() {
        if (d0.g(this.J.g())) {
            return this.J.g();
        }
        return this.f18398o;
    }

    public String getName() {
        return this.f18390d;
    }

    public String getPhoneNumber() {
        return this.f18391e;
    }

    public Double getProximityWeight() {
        Double d11 = this.B;
        if (d11 == null || d11.doubleValue() == 0.0d) {
            return Double.valueOf(-1.266d);
        }
        return this.B;
    }

    public String getSessionId() {
        return this.f18399p;
    }

    public String getSwuid() {
        if (d0.g(this.J.g())) {
            return this.J.g();
        }
        if (!b3()) {
            SharedPreferences sharedPreferences = null;
            if (M2() != null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(M2().getApplicationContext());
                this.f18398o = sharedPreferences.getString(HttpRequest.SWIGGY_HEADER_UID, "");
            }
            String str = this.f18398o;
            if ((str == null || str.isEmpty()) && M2() != null) {
                this.f18398o = Settings.Secure.getString(M2().getContentResolver(), "android_id");
            }
            String str2 = this.f18398o;
            if (str2 == null || str2.trim().isEmpty()) {
                this.f18398o = UUID.randomUUID().toString();
            }
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(HttpRequest.SWIGGY_HEADER_UID, this.f18398o).apply();
            }
        }
        return this.f18398o;
    }

    public String getTid() {
        return this.f18397m;
    }

    public String getToken() {
        String str = this.n;
        return str == null ? "" : str;
    }

    public String i0() {
        return this.j;
    }

    public void i3(Context context) {
        j jVar = (j) super.T2(j.class);
        if (jVar != null) {
            boolean z11 = jVar.f18404x;
            this.f18404x = z11;
            if (z11 || !j3()) {
                this.f18392f = jVar.f18392f;
                this.f18390d = jVar.f18390d;
                this.f18391e = jVar.f18391e;
                this.f18397m = jVar.f18397m;
                this.n = jVar.n;
                this.f18401s = jVar.f18401s;
                this.f18393g = jVar.f18393g;
                this.f18394h = jVar.f18394h;
                this.v = jVar.v;
                this.f18399p = jVar.f18399p;
                this.f18395i = jVar.f18395i;
                this.j = jVar.j;
                this.k = jVar.k;
                this.f18396l = jVar.f18396l;
                this.f18398o = jVar.f18398o;
            }
            LinkedList<String> linkedList = jVar.t;
            if (linkedList == null) {
                this.t = new LinkedList<>();
            } else {
                this.t = linkedList;
            }
            HashMap<String, Integer> hashMap = jVar.f18403w;
            if (hashMap == null) {
                this.f18403w = new HashMap<>();
            } else {
                this.f18403w = hashMap;
            }
            if (this.t == null) {
                this.t = new LinkedList<>();
            }
            if (this.v == null) {
                this.v = new LinkedList<>();
            }
            List<Address> list = this.f18394h;
            if (list == null) {
                this.f18394h = new ArrayList();
            } else {
                synchronized (list) {
                    for (Address next : this.f18394h) {
                        next.getAnnotationTagString();
                        if (next.getAnnotationTagString().isEmpty()) {
                            next.setAnnotationString("Other");
                        }
                        next.setAnnotationTag(next.getAnnotationTag());
                    }
                    Collections.sort(this.f18394h);
                }
            }
            if (this.f18400r == null) {
                this.f18400r = jVar.f18400r;
            }
            this.f18405y = jVar.f18405y;
            AddressSortingWeight addressSortingWeight = jVar.f18406z;
            if (addressSortingWeight != null) {
                this.f18406z = addressSortingWeight;
            }
            this.C = jVar.C;
            return;
        }
        u.k(T, "No user class to load");
    }

    public void j0(boolean z11) {
        this.G = z11;
    }

    public void j2(GooglePlace googlePlace) {
        if (googlePlace != null) {
            boolean z11 = true;
            if (this.v == null) {
                this.v = new LinkedList<>();
            }
            Iterator it2 = this.v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                GooglePlace googlePlace2 = (GooglePlace) it2.next();
                if (googlePlace2.getPlaceId() != null && googlePlace2.getPlaceId().equals(googlePlace.getPlaceId())) {
                    break;
                }
                GooglePlaceGeometry geometry = googlePlace2.getGeometry();
                GooglePlaceGeometry geometry2 = googlePlace.getGeometry();
                if (!(geometry == null || geometry2 == null)) {
                    GooglePlaceLocation location = geometry.getLocation();
                    GooglePlaceLocation location2 = geometry2.getLocation();
                    if (!(location == null || location2 == null || !in.swiggy.android.swiggylocation.location.c.k(c3(location), c3(location2), 4))) {
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                if (this.v.size() == 10) {
                    this.v.removeLast();
                }
                this.v.addFirst(googlePlace);
                a();
            }
        }
    }

    public void k0(int i11) {
        this.F = i11;
        this.D = true;
        this.N.onNext(Boolean.TRUE);
    }

    public void k1(Address address) {
        synchronized (this.f18394h) {
            if (!this.f18394h.contains(address)) {
                this.f18394h.add(address);
                Collections.sort(this.f18394h);
                a();
            }
        }
    }

    public List<Address> k2(List<Address> list) {
        Collections.sort(list, new i(this));
        return list;
    }

    public PublishProcessor<Boolean> l1() {
        return this.O;
    }

    public void l2() {
        this.f18405y = true;
    }

    public ao0.d<Boolean> m() {
        return this.N;
    }

    public void m3() {
        this.f18391e = "";
        this.f18402u = "";
        this.f18390d = "";
        this.f18392f = "";
        this.f18397m = "";
        this.n = "";
        this.f18393g = "";
        setSessionId("");
        this.f18396l = "";
        this.k = "";
        List<Address> list = this.f18394h;
        if (list != null) {
            list.clear();
        }
        LinkedList<GooglePlace> linkedList = this.v;
        if (linkedList != null) {
            linkedList.clear();
        }
        LinkedList<String> linkedList2 = this.t;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        O();
        PublishProcessor<Boolean> publishProcessor = this.L;
        Boolean bool = Boolean.FALSE;
        publishProcessor.onNext(bool);
        this.O.onNext(bool);
        this.f18395i = "";
        this.f18405y = false;
        super.b();
    }

    public boolean n2() {
        return this.G;
    }

    public ao0.d<String> o() {
        return this.R.I();
    }

    public boolean o0() {
        return c0() && F2();
    }

    public String o1(String str) {
        this.f18391e = str;
        return str;
    }

    public String r() {
        return this.q;
    }

    public void r1(Address address) {
        synchronized (this.f18394h) {
            Address address2 = null;
            Iterator<Address> it2 = this.f18394h.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Address next = it2.next();
                if (next.getId().equals(address.getId())) {
                    address2 = next;
                    break;
                }
            }
            if (address2 != null) {
                List<Address> list = this.f18394h;
                list.set(list.indexOf(address2), address);
            }
            Collections.sort(this.f18394h);
            a();
        }
    }

    public boolean s() {
        boolean z11;
        synchronized (this.f18394h) {
            z11 = false;
            List<Address> list = this.f18394h;
            if (list != null && !list.isEmpty()) {
                Iterator<Address> it2 = this.f18394h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().getAnnotationTag() == 1) {
                            z11 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return z11;
    }

    public boolean s0(n nVar) {
        if (o0()) {
            return k3(nVar);
        }
        return l3(nVar);
    }

    public void setAuthToken(String str) {
        this.f18401s = str;
    }

    public void setSessionId(String str) {
        this.f18399p = str;
    }

    public void setTid(String str) {
        this.f18397m = str;
    }

    public void t2(SwiggyApiResponse<UserResponseData> swiggyApiResponse) {
        if (swiggyApiResponse != null && swiggyApiResponse.getData() != null) {
            UserResponseData data = swiggyApiResponse.getData();
            this.f18390d = data.mName;
            this.f18392f = data.mEmail;
            this.f18391e = data.mPhoneNumber;
            this.f18397m = swiggyApiResponse.getTid();
            this.n = data.mToken;
            this.f18393g = data.mCustomerId;
            this.j = data.mReferralCode;
            this.k = data.mMobileVerified;
            this.f18396l = data.mEmailVerified;
            AddressSortingWeight addressSortingWeight = data.addressSortingWeight;
            if (addressSortingWeight != null) {
                this.f18406z = addressSortingWeight;
            }
            UserSuperDataResponse userSuperDataResponse = data.mSuperData;
            this.H = userSuperDataResponse;
            this.C = data.communicationSubscriptionData;
            this.I = data.unBoxingDataResponse;
            if (userSuperDataResponse == null || userSuperDataResponse.getUserStatus() == null) {
                this.f18395i = "NOT_SUPER";
            } else {
                this.f18395i = this.H.getUserStatus();
            }
            UserDataOptionalMap userDataOptionalMap = data.mOptionalMap;
            if (userDataOptionalMap != null) {
                this.f18400r = userDataOptionalMap.getSuperDetailsValue();
                this.f18405y = userDataOptionalMap.getSwiggyPayEnabled();
            }
            a();
        }
    }

    public String toString() {
        return GsonInstrumentation.toJson(new Gson(), (Object) this);
    }

    public void v1(String str) {
        this.f18402u = str;
    }

    public boolean x() {
        return this.E;
    }

    public String x2() {
        return this.f18395i;
    }

    public void y2(Address address) {
        Integer num = this.f18403w.get(address.getId());
        this.f18403w.put(address.getId(), Integer.valueOf(((num != null ? num.intValue() : 0) + 1) % 100));
    }

    public List<Address> z0() {
        return Collections.unmodifiableList(this.f18394h);
    }
}
