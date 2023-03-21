package in.swiggy.android.repositories.saveablecontexts;

import android.content.SharedPreferences;
import android.location.Location;
import cg0.n;
import cg0.o;
import ef0.e;
import if0.k;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.swiggylocation.location.b;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressSortingWeight;
import java.util.ArrayList;
import java.util.List;
import js.c;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.p;

/* compiled from: UserLocationManager.kt */
public final class UserLocationManager implements o {

    /* renamed from: a  reason: collision with root package name */
    private final e f18548a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f18549b;

    public UserLocationManager(n nVar, e eVar, SharedPreferences sharedPreferences) {
        p.j(nVar, "locationContext");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(sharedPreferences, "sharedPreferences");
        this.f18548a = eVar;
        this.f18549b = sharedPreferences;
        nVar.m0(this);
    }

    /* access modifiers changed from: private */
    public static final int b(UserLocationManager userLocationManager, Location location, AddressSortingWeight addressSortingWeight, Address address, Address address2) {
        p.j(userLocationManager, "this$0");
        p.j(location, "$currentLocation");
        p.j(addressSortingWeight, "$finalAddressSortingWeight");
        p.i(address, "address1");
        double j = userLocationManager.j(address, location, addressSortingWeight);
        p.i(address2, "address2");
        return Double.compare(j, userLocationManager.j(address2, location, addressSortingWeight));
    }

    public Address c() {
        return this.f18548a.c();
    }

    public void d(Address address) {
        this.f18548a.d(address);
    }

    public AddressSortingWeight e() {
        return this.f18548a.e();
    }

    public boolean f(b bVar) {
        p.j(bVar, "locationContext");
        return c.h(Boolean.valueOf(this.f18548a.s0(bVar)));
    }

    public List<Address> g(Location location, List<Address> list, AddressSortingWeight addressSortingWeight) {
        ArrayList arrayList;
        p.j(location, "currentLocation");
        if (list == null) {
            arrayList = new ArrayList(this.f18548a.z0());
        } else {
            arrayList = new ArrayList(list);
        }
        if (!ig0.c.b("android_address_sorting_enabled", "true", this.f18549b)) {
            return this.f18548a.k2(arrayList);
        }
        if (addressSortingWeight == null) {
            addressSortingWeight = this.f18548a.e();
        }
        if (addressSortingWeight == null) {
            return this.f18548a.k2(arrayList);
        }
        o.y(arrayList, new k(this, location, addressSortingWeight));
        return arrayList;
    }

    public String getCustomerId() {
        String customerId = this.f18548a.getCustomerId();
        p.i(customerId, "user.customerId");
        return customerId;
    }

    public int getDefaultingType() {
        if (this.f18548a.getDefaultingType() == 0) {
            return 1;
        }
        return this.f18548a.getDefaultingType();
    }

    public double getProximityWeight() {
        Double proximityWeight = this.f18548a.getProximityWeight();
        p.i(proximityWeight, "user.proximityWeight");
        return proximityWeight.doubleValue();
    }

    public boolean h() {
        return this.f18548a.o0();
    }

    public void i(int i11, double d11, List<Address> list) {
        p.j(list, "addressList");
        this.f18548a.d0(i11, Double.valueOf(d11), list);
    }

    public double j(Address address, Location location, AddressSortingWeight addressSortingWeight) {
        Double d11;
        p.j(address, "address");
        p.j(location, "currentLocation");
        double distanceTo = ((double) location.distanceTo(address.getLocation())) / 1000.0d;
        Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
        ref$DoubleRef.f25662a = Double.MAX_VALUE;
        Double d12 = null;
        if (addressSortingWeight == null) {
            d11 = null;
        } else {
            d11 = addressSortingWeight.getLocationWeight();
        }
        Integer sortScore = address.getSortScore();
        if (addressSortingWeight != null) {
            d12 = addressSortingWeight.getAddressWeight();
        }
        c.n(d11, sortScore, d12, new UserLocationManager$getAddressWeightedScore$1(ref$DoubleRef, distanceTo));
        return ref$DoubleRef.f25662a;
    }

    public List<Address> k() {
        return this.f18548a.z0();
    }
}
