package in.swiggy.android.repositories.cart.data;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData;
import in.swiggy.android.tejas.oldapi.models.cart.UserFlowInfo;
import in.swiggy.android.tejas.oldapi.models.cart.detip.DETipDetailsRequest;
import in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.network.responses.ReviewedCartResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: CartData */
public class a {
    @SerializedName("should_refresh_menu")
    public Boolean A;
    @SerializedName("cart_container")

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashMap<String, LinkedHashMap<String, MenuItemInCart>> f18528a = new LinkedHashMap<>();
    @SerializedName("meal_data")

    /* renamed from: b  reason: collision with root package name */
    public LinkedHashMap<String, LinkedHashMap<String, MealItemInCart>> f18529b = new LinkedHashMap<>();
    @SerializedName("sub_total")

    /* renamed from: c  reason: collision with root package name */
    public double f18530c;
    @SerializedName("total_order_count")

    /* renamed from: d  reason: collision with root package name */
    public int f18531d;
    @SerializedName("tax_amount")

    /* renamed from: e  reason: collision with root package name */
    public double f18532e;
    @SerializedName("total_amount")

    /* renamed from: f  reason: collision with root package name */
    public double f18533f;
    @SerializedName("restaurant_id")

    /* renamed from: g  reason: collision with root package name */
    String f18534g;
    @SerializedName("restaurant_name")

    /* renamed from: h  reason: collision with root package name */
    String f18535h;
    @SerializedName("restaurant_cover_image")

    /* renamed from: i  reason: collision with root package name */
    public String f18536i;
    @SerializedName("restaurant_area")
    String j;
    @SerializedName("is_discount")
    public boolean k;
    @SerializedName("local_total_including_discount")

    /* renamed from: l  reason: collision with root package name */
    public double f18537l;
    @SerializedName("delivery_address")

    /* renamed from: m  reason: collision with root package name */
    public Address f18538m;
    @SerializedName("restaurant")
    public RestaurantMetaData n;
    @SerializedName("freebie_ids")

    /* renamed from: o  reason: collision with root package name */
    public HashMap<String, String> f18539o = new HashMap<>();
    @SerializedName("reviewed_cart_response")

    /* renamed from: p  reason: collision with root package name */
    public ReviewedCartResponse f18540p;
    @SerializedName("subscription_plan_id")
    public int q;
    @SerializedName("removed_plan_ids")

    /* renamed from: r  reason: collision with root package name */
    public long f18541r;
    @SerializedName("batch_opt_in")

    /* renamed from: s  reason: collision with root package name */
    public Boolean f18542s;
    @SerializedName("address_nudge_check")
    public Boolean t;
    @SerializedName("tipDetails")

    /* renamed from: u  reason: collision with root package name */
    public DETipDetailsRequest f18543u;
    @SerializedName("user_flow_info")
    public UserFlowInfo v;
    @SerializedName("mov_savings")

    /* renamed from: w  reason: collision with root package name */
    public double f18544w = 0.0d;
    @SerializedName("selected_drop_off_instruction_ids")

    /* renamed from: x  reason: collision with root package name */
    public List<String> f18545x;
    @SerializedName("is_away_location")

    /* renamed from: y  reason: collision with root package name */
    public boolean f18546y;
    @SerializedName("selected_sla_option")

    /* renamed from: z  reason: collision with root package name */
    public String f18547z = null;
}
