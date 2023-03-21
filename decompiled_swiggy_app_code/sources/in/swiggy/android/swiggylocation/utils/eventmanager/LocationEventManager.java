package in.swiggy.android.swiggylocation.utils.eventmanager;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import in.swiggy.android.tejas.feature.location.model.AddressAttribute;
import in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes;
import in.swiggy.android.tejas.feature.location.model.HalfCardAttributes;
import in.swiggy.android.tejas.feature.location.model.LocationCommonAttributes;

/* compiled from: LocationEventManager.kt */
public final class LocationEventManager implements ILocationEventManager {
    @SerializedName("location-common-attributes")

    /* renamed from: a  reason: collision with root package name */
    private LocationCommonAttributes f18921a;
    @SerializedName("half-card-details")

    /* renamed from: b  reason: collision with root package name */
    private HalfCardAttributes f18922b;
    @SerializedName("default-address")

    /* renamed from: c  reason: collision with root package name */
    private AddressAttribute f18923c;
    @SerializedName("changed-address")

    /* renamed from: d  reason: collision with root package name */
    private AddressAttribute f18924d;
    @SerializedName("cart-default-address")

    /* renamed from: e  reason: collision with root package name */
    private AddressAttribute f18925e;
    @SerializedName("cart-changed-address")

    /* renamed from: f  reason: collision with root package name */
    private AddressAttribute f18926f;
    @SerializedName("final-address")

    /* renamed from: g  reason: collision with root package name */
    private AddressAttribute f18927g;
    @SerializedName("last_order_details")

    /* renamed from: h  reason: collision with root package name */
    private GpsOffLocationAttributes f18928h;
    @SerializedName("xp_flag_two_steps")

    /* renamed from: i  reason: collision with root package name */
    private String f18929i = SafeJsonPrimitive.NULL_STRING;
    @SerializedName("flow_id")
    private String j;
    @SerializedName("xp_enable_half_card_single_click_to_proceed")
    private String k;

    public void B(GpsOffLocationAttributes gpsOffLocationAttributes) {
        this.f18928h = gpsOffLocationAttributes;
    }

    public void G3(AddressAttribute addressAttribute) {
        this.f18923c = addressAttribute;
    }

    public void J0(String str) {
        this.j = str;
    }

    public void V2(String str) {
        this.f18929i = str;
    }

    public void f0(String str) {
        this.k = str;
    }

    public void g1(LocationCommonAttributes locationCommonAttributes) {
        this.f18921a = locationCommonAttributes;
    }

    public void m2(HalfCardAttributes halfCardAttributes) {
        this.f18922b = halfCardAttributes;
    }

    public void r2(AddressAttribute addressAttribute) {
        this.f18926f = addressAttribute;
    }

    public void r3(AddressAttribute addressAttribute) {
        this.f18925e = addressAttribute;
    }

    public void u(AddressAttribute addressAttribute) {
        this.f18924d = addressAttribute;
    }

    public void x3(AddressAttribute addressAttribute) {
        this.f18927g = addressAttribute;
    }

    public LocationCommonAttributes z1() {
        return this.f18921a;
    }
}
