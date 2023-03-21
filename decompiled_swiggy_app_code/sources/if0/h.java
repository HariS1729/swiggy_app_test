package if0;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.preference.PreferenceManager;
import com.google.gson.annotations.SerializedName;
import df0.a;
import ef0.c;
import fg0.d;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.models.listing.SortOption;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import in.swiggy.android.tejas.oldapi.network.responses.RestaurantListResponseData;
import io.reactivex.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.List;
import os.d0;
import os.u;

/* compiled from: RestaurantsContext */
public class h extends d implements c {
    private static final String v = "h";

    /* renamed from: d  reason: collision with root package name */
    private transient SwiggyApiResponse<RestaurantListResponseData> f18377d;
    @SerializedName("mSelectedRestaurant")

    /* renamed from: e  reason: collision with root package name */
    private Restaurant f18378e;

    /* renamed from: f  reason: collision with root package name */
    private transient List<SortOption> f18379f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private transient BehaviorProcessor<Location> f18380g = BehaviorProcessor.z0();

    /* renamed from: h  reason: collision with root package name */
    private transient String f18381h = "";

    /* renamed from: i  reason: collision with root package name */
    private transient boolean f18382i = true;
    private transient boolean j = true;
    private transient boolean k = true;

    /* renamed from: l  reason: collision with root package name */
    private transient SharedPreferences f18383l = null;

    /* renamed from: m  reason: collision with root package name */
    private transient String f18384m = "NORMAL";
    private transient BehaviorProcessor<a> n = BehaviorProcessor.z0();

    /* renamed from: o  reason: collision with root package name */
    private transient BehaviorProcessor<Boolean> f18385o = BehaviorProcessor.z0();
    @SerializedName("vegFilterAppliedCount")

    /* renamed from: p  reason: collision with root package name */
    private int f18386p = 0;
    private int q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f18387r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f18388s = 0;
    private int t = 0;

    /* renamed from: u  reason: collision with root package name */
    private transient boolean f18389u = true;

    public h(Context context) {
        super(context);
        a3(context);
        this.f18383l = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void B() {
        this.f18386p++;
    }

    public void B0(a aVar) {
        this.n.onNext(aVar);
    }

    public boolean D1() {
        return this.f18387r < 5;
    }

    public boolean E0() {
        return this.f18388s < 3;
    }

    public ao0.d<a> E1() {
        return this.n;
    }

    public boolean I0(boolean z11) {
        return this.f18386p >= 2 && z11;
    }

    public void I2() {
        this.q++;
    }

    public boolean K0() {
        return this.q >= 2;
    }

    public void M() {
        this.f18386p = 0;
        this.f18389u = true;
    }

    /* access modifiers changed from: protected */
    public String N2() {
        return v;
    }

    /* access modifiers changed from: protected */
    public Object O2() {
        return this;
    }

    /* access modifiers changed from: protected */
    public String P2() {
        return "restaurantsContext";
    }

    public void U0(int i11) {
        int i12 = this.t;
        if (i12 < 2) {
            this.t = i12 + i11;
            a();
        }
    }

    public void W() {
        this.f18385o.onNext(Boolean.TRUE);
    }

    public Location Y() {
        return this.f18380g.B0();
    }

    public boolean a0() {
        return this.t < 2;
    }

    public void a3(Context context) {
        h hVar = (h) super.T2(h.class);
        if (hVar != null) {
            this.f18378e = hVar.f18378e;
            this.f18377d = hVar.f18377d;
            this.f18386p = hVar.f18386p;
            this.q = hVar.q;
            this.f18387r = hVar.f18387r;
            this.f18388s = hVar.f18388s;
            this.t = hVar.t;
            return;
        }
        u.k(v, "No restaurant context to load");
    }

    public void b() {
        b3();
        super.b();
    }

    public void b0(boolean z11) {
        this.f18389u = z11;
    }

    public void b3() {
        this.f18378e = null;
        this.f18377d = null;
    }

    public void h1() {
        if (this.j) {
            this.f18383l.edit().putInt("swiggy_longdistance_count_shown", this.f18383l.getInt("swiggy_longdistance_count_shown", 0) + 1).apply();
            this.j = false;
        }
    }

    public void j() {
        this.f18387r = 5;
        a();
    }

    public void n() {
        this.q = 0;
    }

    public void n0() {
        if (this.k) {
            this.f18383l.edit().putInt("swiggy_longdistance_toggle_count_shown", this.f18383l.getInt("swiggy_longdistance_toggle_count_shown", 0) + 1).apply();
            this.k = false;
        }
    }

    public void p2() {
        this.f18388s++;
        a();
    }

    public void r0() {
        int i11 = this.f18387r;
        if (i11 < 5) {
            this.f18387r = i11 + 1;
            a();
        }
    }

    public ao0.d<Location> s1() {
        return this.f18380g;
    }

    public String v2() {
        if (d0.e(this.f18381h)) {
            return "";
        }
        return this.f18381h;
    }

    public int x0() {
        if (this.f18382i && this.f18383l.getInt("swiggy_assured_count_shown", 0) >= this.f18383l.getInt("assured_longdistance_onboarding_count", 2)) {
            return 1;
        }
        return 0;
    }

    public void y1(Location location, String str) {
        this.f18380g.onNext(location);
        this.f18381h = str;
    }
}
