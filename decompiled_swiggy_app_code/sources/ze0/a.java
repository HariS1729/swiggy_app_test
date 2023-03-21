package ze0;

import af0.b;
import android.text.TextUtils;
import ao0.d;
import cg0.n;
import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCartMeal;
import in.swiggy.android.tejas.oldapi.models.cart.UserFlowInfo;
import in.swiggy.android.tejas.oldapi.models.meals.GroupItemInMeal;
import in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import in.swiggy.android.tejas.oldapi.models.order.OrderDetailsMeal;
import in.swiggy.android.tejas.oldapi.models.order.OrderDetailsMealGroup;
import in.swiggy.android.tejas.oldapi.models.order.OrderItem;
import in.swiggy.android.tejas.oldapi.utils.CryptoUtils;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import os.d0;
import os.u;
import os.z;

/* compiled from: Cart */
public abstract class a implements bf0.a, b {
    protected static final String j = "a";
    @SerializedName("cartData")

    /* renamed from: a  reason: collision with root package name */
    public in.swiggy.android.repositories.cart.data.a f20044a;

    /* renamed from: b  reason: collision with root package name */
    public transient n f20045b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f20046c;

    /* renamed from: d  reason: collision with root package name */
    public transient String f20047d;

    /* renamed from: e  reason: collision with root package name */
    protected transient PublishProcessor<MenuItemInCart> f20048e;

    /* renamed from: f  reason: collision with root package name */
    protected transient PublishProcessor<MealItemInCart> f20049f;

    /* renamed from: g  reason: collision with root package name */
    protected transient PublishProcessor<MenuItemInCart> f20050g;

    /* renamed from: h  reason: collision with root package name */
    private transient PublishProcessor<Integer> f20051h;

    /* renamed from: i  reason: collision with root package name */
    protected transient PublishProcessor<MenuItemInCart> f20052i;

    public a() {
        this.f20046c = "";
        this.f20047d = null;
        this.f20048e = PublishProcessor.z0();
        this.f20049f = PublishProcessor.z0();
        this.f20050g = PublishProcessor.z0();
        this.f20051h = PublishProcessor.z0();
        this.f20052i = PublishProcessor.z0();
        this.f20044a = new in.swiggy.android.repositories.cart.data.a();
    }

    private GroupItemInMeal g0(String str, List<OrderItem> list) {
        LinkedHashMap<String, LinkedHashMap<String, MenuItemInCart>> linkedHashMap = new LinkedHashMap<>();
        GroupItemInMeal groupItemInMeal = new GroupItemInMeal();
        groupItemInMeal.groupId = str;
        for (OrderItem next : list) {
            MenuItemInCart menuItemInCart = new MenuItemInCart();
            menuItemInCart.setMenuItem(next.getMenuItem());
            menuItemInCart.setSelectedAddons(next.getAddonHashMap());
            menuItemInCart.setSelectedVariants(next.getVariantsHashMap());
            menuItemInCart.setNotes("");
            menuItemInCart.updateQuantityBy(next.mQuantity);
            String customizationHash = CryptoUtils.getCustomizationHash(next.getMenuItem().mId, next.getAddonHashMap(), next.getVariantsHashMap());
            LinkedHashMap linkedHashMap2 = linkedHashMap.get(next.getMenuItem().mId);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            linkedHashMap2.put(customizationHash, menuItemInCart);
            linkedHashMap.put(next.getMenuItem().mId, linkedHashMap2);
        }
        groupItemInMeal.cartContainer = linkedHashMap;
        return groupItemInMeal;
    }

    private MenuItemInCart j0(MenuItemInCart menuItemInCart) {
        if (l0(menuItemInCart)) {
            return (MenuItemInCart) this.f20044a.f18528a.get(menuItemInCart.getMenuItem().mId).get(menuItemInCart.getCustomizationHash());
        }
        return null;
    }

    private void o0(MenuItemInCart menuItemInCart) {
        this.f20050g.onNext(menuItemInCart);
    }

    private void p0(MealItemInCart mealItemInCart) {
        E0();
        this.f20049f.onNext(mealItemInCart);
        n0();
    }

    private void q0(MealItemInCart mealItemInCart) {
        E0();
        this.f20049f.onNext(mealItemInCart);
        n0();
    }

    private void r0(MenuItemInCart menuItemInCart) {
        if (Y() == 1) {
            o0(menuItemInCart);
        }
        t0(menuItemInCart);
    }

    private void s0(MenuItemInCart menuItemInCart) {
        if (Y() == 1) {
            o0(menuItemInCart);
        }
        t0(menuItemInCart);
    }

    private void t0(MenuItemInCart menuItemInCart) {
        this.f20048e.onNext(menuItemInCart);
    }

    private void u0(MenuItemInCart menuItemInCart) {
        t0(menuItemInCart);
    }

    private void v0(MenuItemInCart menuItemInCart) {
        MenuItem menuItem = menuItemInCart.getMenuItem();
        if (l0(menuItemInCart)) {
            Map map = this.f20044a.f18528a.get(menuItem.mId);
            if (map != null && !map.isEmpty()) {
                map.remove(menuItemInCart.getCustomizationHash());
                if (map.isEmpty()) {
                    this.f20044a.f18528a.remove(menuItem.mId);
                }
            }
            E0();
            n0();
            u0(menuItemInCart);
        }
    }

    private void x0() {
        LinkedHashMap<String, LinkedHashMap<String, MenuItemInCart>> linkedHashMap = this.f20044a.f18528a;
        boolean z11 = true;
        boolean z12 = linkedHashMap != null && !linkedHashMap.isEmpty();
        LinkedHashMap<String, LinkedHashMap<String, MealItemInCart>> linkedHashMap2 = this.f20044a.f18529b;
        if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
            z11 = false;
        }
        if (z12) {
            for (LinkedHashMap<String, MenuItemInCart> values : this.f20044a.f18528a.values()) {
                for (MenuItemInCart u02 : values.values()) {
                    u0(u02);
                }
            }
            this.f20044a.f18528a.clear();
        }
        if (z11) {
            for (LinkedHashMap<String, MealItemInCart> values2 : this.f20044a.f18529b.values()) {
                for (MealItemInCart q02 : values2.values()) {
                    q0(q02);
                }
            }
            this.f20044a.f18529b.clear();
        }
        this.f20044a = new in.swiggy.android.repositories.cart.data.a();
        if (z12) {
            n0();
        }
    }

    public int A() {
        return d();
    }

    public d<MenuItemInCart> A0() {
        if (this.f20048e == null) {
            this.f20048e = PublishProcessor.z0();
        }
        return this.f20048e;
    }

    public d<Integer> B0() {
        return this.f20051h;
    }

    public int C(MenuItemInCart menuItemInCart) {
        MenuItemInCart j02;
        if (!l0(menuItemInCart) || (j02 = j0(menuItemInCart)) == null) {
            return 0;
        }
        return j02.getQuantity();
    }

    public d<MenuItemInCart> C0() {
        if (this.f20052i == null) {
            this.f20052i = PublishProcessor.z0();
        }
        return this.f20052i;
    }

    public void D(MenuItem menuItem) {
        if (this.f20044a.f18528a.containsKey(menuItem.mId)) {
            for (MenuItemInCart menuItem2 : this.f20044a.f18528a.get(menuItem.mId).values()) {
                menuItem2.setMenuItem(menuItem);
            }
        }
    }

    public d<MealItemInCart> D0() {
        if (this.f20049f == null) {
            this.f20049f = PublishProcessor.z0();
        }
        return this.f20049f;
    }

    public void E(RestaurantMetaData restaurantMetaData) {
        if (restaurantMetaData == null) {
            this.f20044a.n = null;
        } else if (a() == 0) {
            this.f20044a.n = restaurantMetaData;
        } else {
            RestaurantMetaData restaurantMetaData2 = this.f20044a.n;
            if (restaurantMetaData2 == null || !d0.g(restaurantMetaData2.getId()) || this.f20044a.n.getId().equalsIgnoreCase(restaurantMetaData.getId())) {
                u.b(j, "Skip this restaurant data setting as same data is being set");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void E0() {
        float f11 = 0.0f;
        double d11 = 0.0d;
        int i11 = 0;
        for (LinkedHashMap<String, MenuItemInCart> values : this.f20044a.f18528a.values()) {
            for (MenuItemInCart menuItemInCart : values.values()) {
                if (!(menuItemInCart == null || menuItemInCart.getMenuItem() == null || menuItemInCart.getMenuItem().isFreebie())) {
                    f11 = (float) (((double) f11) + menuItemInCart.getAmount());
                    i11 += menuItemInCart.getQuantity();
                    d11 += menuItemInCart.getLocalSubTotal();
                }
            }
        }
        for (LinkedHashMap<String, MealItemInCart> values2 : this.f20044a.f18529b.values()) {
            for (MealItemInCart mealItemInCart : values2.values()) {
                f11 = (float) (((double) f11) + mealItemInCart.getLocalTotalAmount());
                d11 += mealItemInCart.getLocalDiscountedTotal();
                i11 += mealItemInCart.getQuantity();
            }
        }
        this.f20044a.f18530c = z.e((double) f11);
        in.swiggy.android.repositories.cart.data.a aVar = this.f20044a;
        aVar.f18531d = i11;
        aVar.f18533f = z.e(aVar.f18530c);
        this.f20044a.f18537l = z.e(d11);
    }

    public double F() {
        return this.f20044a.f18533f;
    }

    public void F0(MenuItem menuItem, int i11, HashMap<String, List<Addon>> hashMap, HashMap<String, Variation> hashMap2, String str) {
        if (menuItem != null && menuItem.isFreebie()) {
            return;
        }
        if (i11 <= 0) {
            MenuItemInCart menuItemInCart = new MenuItemInCart();
            menuItemInCart.setMenuItem(menuItem);
            menuItemInCart.setSelectedAddons(hashMap);
            menuItemInCart.setSelectedVariants(hashMap2);
            menuItemInCart.setNotes(str);
            t(menuItemInCart);
            return;
        }
        String str2 = j;
        u.b(str2, "Updating " + i11 + " items in cartData for:" + menuItem);
        MenuItemInCart menuItemInCart2 = null;
        String customizationHash = CryptoUtils.getCustomizationHash(menuItem.mId, hashMap, hashMap2);
        boolean z11 = false;
        if (x(menuItem) && (menuItemInCart2 = (MenuItemInCart) this.f20044a.f18528a.get(menuItem.mId).get(customizationHash)) != null) {
            z11 = true;
        }
        if (z11) {
            menuItemInCart2.setQuantity(i11);
        } else {
            menuItemInCart2 = new MenuItemInCart();
            menuItemInCart2.setMenuItem(menuItem);
            menuItemInCart2.setSelectedAddons(hashMap);
            menuItemInCart2.setSelectedVariants(hashMap2);
            menuItemInCart2.setNotes(str);
            menuItemInCart2.updateQuantityBy(i11);
            LinkedHashMap linkedHashMap = this.f20044a.f18528a.get(menuItem.mId);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(customizationHash, menuItemInCart2);
            this.f20044a.f18528a.put(menuItem.mId, linkedHashMap);
        }
        E0();
        r0(menuItemInCart2);
        n0();
    }

    public void G0(OrderDetailsMeal orderDetailsMeal) {
        LinkedHashMap<String, GroupItemInMeal> linkedHashMap = new LinkedHashMap<>();
        for (OrderDetailsMealGroup next : orderDetailsMeal.mMealItems) {
            if (next.mGroupMealItems.size() > 0) {
                GroupItemInMeal g02 = g0(next.mMealGroupId, next.mGroupMealItems);
                linkedHashMap.put(g02.calculateGroupHash(), g02);
            }
        }
        MealItemInCart mealItemInCart = new MealItemInCart();
        mealItemInCart.mealId = orderDetailsMeal.mMealItemID;
        mealItemInCart.mGroups = linkedHashMap;
        U(mealItemInCart);
    }

    public void H0(MealItemInCart mealItemInCart, int i11) {
        mealItemInCart.setQuantity(i11);
        if (i11 <= 0) {
            s(mealItemInCart);
        }
        p0(mealItemInCart);
    }

    public void I(int i11) {
        this.f20044a.q = i11;
    }

    public void I0() {
        x0();
        this.f20046c = "";
        this.f20047d = null;
    }

    public void K(UserFlowInfo userFlowInfo) {
        this.f20044a.v = userFlowInfo;
    }

    public int L(MenuItem menuItem) {
        int i11 = 0;
        if (x(menuItem)) {
            for (MenuItemInCart menuItemInCart : this.f20044a.f18528a.get(menuItem.mId).values()) {
                if (menuItemInCart != null) {
                    i11 += menuItemInCart.getQuantity();
                }
            }
        }
        return i11;
    }

    public List<MenuItemInCart> M() {
        ArrayList arrayList = new ArrayList();
        for (LinkedHashMap<String, MenuItemInCart> values : this.f20044a.f18528a.values()) {
            for (MenuItemInCart add : values.values()) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    public void N(MenuItem menuItem, int i11, HashMap<String, List<Addon>> hashMap, Map<String, Variation> map, String str, double d11) {
        if (i11 <= 0) {
            MenuItemInCart menuItemInCart = new MenuItemInCart();
            menuItemInCart.setMenuItem(menuItem);
            menuItemInCart.setSelectedAddons(hashMap);
            menuItemInCart.setSelectedVariants(map);
            menuItemInCart.setNotes(str);
            v0(menuItemInCart);
            return;
        }
        String str2 = j;
        u.b(str2, "Updating " + i11 + " items in cartData for:" + menuItem);
        MenuItemInCart menuItemInCart2 = null;
        String customizationHash = CryptoUtils.getCustomizationHash(menuItem.mId, hashMap, map);
        boolean z11 = false;
        if (x(menuItem) && (menuItemInCart2 = (MenuItemInCart) this.f20044a.f18528a.get(menuItem.mId).get(customizationHash)) != null) {
            z11 = true;
        }
        if (z11) {
            menuItemInCart2.setQuantity(menuItemInCart2.getQuantity() + i11);
        } else {
            menuItemInCart2 = new MenuItemInCart();
            menuItemInCart2.setMenuItem(menuItem);
            menuItemInCart2.setQuantity(i11);
            menuItemInCart2.updateSelectedAddons(hashMap);
            menuItemInCart2.updateSelectedVariants(map);
            menuItemInCart2.setNotes(str);
            if (d11 > 0.0d) {
                menuItemInCart2.setFinalPrice(d11);
            }
            LinkedHashMap linkedHashMap = this.f20044a.f18528a.get(menuItem.mId);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(customizationHash, menuItemInCart2);
            this.f20044a.f18528a.put(menuItem.mId, linkedHashMap);
        }
        E0();
        s0(menuItemInCart2);
        n0();
    }

    public String O() {
        return this.f20046c;
    }

    public int P() {
        return this.f20044a.f18528a.size();
    }

    public void Q(Long l11) {
        this.f20044a.f18541r = l11.longValue();
    }

    public List<MenuItemInCart> R(MenuItem menuItem) {
        ArrayList arrayList = new ArrayList();
        if (x(menuItem)) {
            for (MenuItemInCart menuItemInCart : this.f20044a.f18528a.get(menuItem.mId).values()) {
                if (!(menuItemInCart == null || menuItemInCart.getMenuItem() == null || menuItemInCart.getMenuItem().isFreebie())) {
                    arrayList.add(menuItemInCart);
                }
            }
        }
        return arrayList;
    }

    public void S(MenuItem menuItem) {
        MenuItemInCart i02;
        int quantity;
        if (x(menuItem) && (i02 = i0(menuItem)) != null && i02.getQuantity() - 1 >= 0) {
            u(menuItem, quantity);
        }
    }

    public void T(String str) {
        this.f20047d = str;
    }

    public void U(MealItemInCart mealItemInCart) {
        String hashOfMeal = mealItemInCart.hashOfMeal(mealItemInCart.mealId);
        LinkedHashMap linkedHashMap = this.f20044a.f18529b.get(mealItemInCart.mealId);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (linkedHashMap.containsKey(hashOfMeal)) {
            MealItemInCart mealItemInCart2 = (MealItemInCart) linkedHashMap.get(hashOfMeal);
            mealItemInCart2.setQuantity(mealItemInCart2.getQuantity() + 1);
        } else {
            mealItemInCart.setQuantity(mealItemInCart.getQuantity() + 1);
            linkedHashMap.put(hashOfMeal, mealItemInCart);
            this.f20044a.f18529b.put(mealItemInCart.mealId, linkedHashMap);
        }
        p0(mealItemInCart);
    }

    public boolean V(String str) {
        return !TextUtils.isEmpty(getRestaurantId()) && !str.equals(getRestaurantId()) && (a() > 0 || b0() > 0);
    }

    public double W() {
        return this.f20044a.f18544w;
    }

    public boolean X(MealItemInCart mealItemInCart) {
        Map map;
        if (!this.f20044a.f18529b.containsKey(mealItemInCart.mealId) || (map = this.f20044a.f18529b.get(mealItemInCart.mealId)) == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    public int Y() {
        return this.f20044a.f18531d;
    }

    public MenuItemInCart Z(MenuItem menuItem) {
        if (!x(menuItem) || this.f20044a.f18528a.get(menuItem.mId).values().size() != 1) {
            return null;
        }
        return (MenuItemInCart) this.f20044a.f18528a.get(menuItem.mId).values().iterator().next();
    }

    public int a() {
        LinkedHashMap<String, LinkedHashMap<String, MenuItemInCart>> linkedHashMap = this.f20044a.f18528a;
        int i11 = 0;
        if (linkedHashMap != null) {
            for (LinkedHashMap<String, MenuItemInCart> size : linkedHashMap.values()) {
                i11 += size.size();
            }
        }
        return i11;
    }

    public double a0() {
        E0();
        return this.f20044a.f18537l;
    }

    public int b(MenuItem menuItem) {
        LinkedHashMap linkedHashMap;
        if (!x(menuItem) || (linkedHashMap = this.f20044a.f18528a.get(menuItem.mId)) == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public int b0() {
        LinkedHashMap<String, LinkedHashMap<String, MealItemInCart>> linkedHashMap = this.f20044a.f18529b;
        int i11 = 0;
        if (linkedHashMap != null) {
            for (LinkedHashMap<String, MealItemInCart> size : linkedHashMap.values()) {
                i11 += size.size();
            }
        }
        return i11;
    }

    public void c(MenuItemInCart menuItemInCart) {
        MenuItemInCart j02;
        if (menuItemInCart != null && menuItemInCart.getMenuItem() != null) {
            MenuItem menuItem = menuItemInCart.getMenuItem();
            if (!menuItem.isCustomisable()) {
                S(menuItem);
            } else if (l0(menuItemInCart) && (j02 = j0(menuItemInCart)) != null) {
                int quantity = j02.getQuantity() - 1;
                if (quantity > 0) {
                    j02.setQuantity(quantity);
                    E0();
                    n0();
                    t0(menuItemInCart);
                } else if (quantity == 0) {
                    t(menuItemInCart);
                }
            }
        }
    }

    public String c0() {
        if (TextUtils.isEmpty(this.f20047d)) {
            return this.f20046c;
        }
        return this.f20047d.concat(this.f20046c);
    }

    public int d() {
        int i11 = 0;
        for (Map.Entry<String, LinkedHashMap<String, MenuItemInCart>> value : this.f20044a.f18528a.entrySet()) {
            for (MenuItemInCart menuItemInCart : ((LinkedHashMap) value.getValue()).values()) {
                if (!(menuItemInCart == null || menuItemInCart.getMenuItem() == null || menuItemInCart.getMenuItem().isFreebie())) {
                    i11 += menuItemInCart.getQuantity();
                }
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, MealItemInCart>> value2 : this.f20044a.f18529b.entrySet()) {
            for (MealItemInCart mealItemInCart : ((LinkedHashMap) value2.getValue()).values()) {
                if (mealItemInCart != null) {
                    i11 += mealItemInCart.getQuantity();
                }
            }
        }
        return i11;
    }

    public String e() {
        if (i() == null) {
            return "";
        }
        return i().getCoverImage();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart e0(in.swiggy.android.tejas.oldapi.models.menu.MenuItem r3) {
        /*
            r2 = this;
            boolean r0 = r2.x(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0031
            in.swiggy.android.repositories.cart.data.a r0 = r2.f20044a
            java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart>> r0 = r0.f18528a
            java.lang.String r3 = r3.mId
            java.lang.Object r3 = r0.get(r3)
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            if (r3 == 0) goto L_0x0031
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0031
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r3.next()
            r1 = r0
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r1 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r1
            goto L_0x0023
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ze0.a.e0(in.swiggy.android.tejas.oldapi.models.menu.MenuItem):in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart");
    }

    public void f(MenuItemInCart menuItemInCart) {
        MenuItem menuItem = menuItemInCart.getMenuItem();
        if (menuItem == null) {
            return;
        }
        if (menuItem.isCustomisable()) {
            N(menuItem, 1, menuItemInCart.getAddons(), menuItemInCart.getVariants(), menuItemInCart.getNotes(), 0.0d);
            return;
        }
        r(menuItem);
    }

    public String f0() {
        return this.f20047d;
    }

    public void g(String str) {
        this.f20046c = str;
    }

    public Address getDeliveryAddress() {
        return this.f20044a.f18538m;
    }

    public String getRestaurantId() {
        if (i() == null) {
            return "";
        }
        return i().getId();
    }

    public String getRestaurantName() {
        if (i() == null) {
            return "";
        }
        return i().getName();
    }

    public void h(boolean z11) {
        this.f20044a.t = Boolean.valueOf(z11);
    }

    public MealItemInCart h0(ReviewedCartMeal reviewedCartMeal) {
        String mealHash = reviewedCartMeal.getMealHash();
        Map map = this.f20044a.f18529b.get(reviewedCartMeal.mMealItemID);
        if (map.containsKey(mealHash)) {
            return (MealItemInCart) map.get(mealHash);
        }
        return null;
    }

    public RestaurantMetaData i() {
        return this.f20044a.n;
    }

    public MenuItemInCart i0(MenuItem menuItem) {
        if (x(menuItem)) {
            return (MenuItemInCart) this.f20044a.f18528a.get(menuItem.mId).get(menuItem.getCustomizationHash());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f20044a.f18529b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty() {
        /*
            r1 = this;
            in.swiggy.android.repositories.cart.data.a r0 = r1.f20044a
            java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart>> r0 = r0.f18528a
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0019
        L_0x000c:
            in.swiggy.android.repositories.cart.data.a r0 = r1.f20044a
            java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart>> r0 = r0.f18529b
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze0.a.isEmpty():boolean");
    }

    public void j(Address address) {
        this.f20044a.f18538m = address;
    }

    public boolean k() {
        RestaurantMetaData restaurantMetaData;
        in.swiggy.android.repositories.cart.data.a aVar = this.f20044a;
        if (aVar == null || (restaurantMetaData = aVar.n) == null) {
            return false;
        }
        return restaurantMetaData.isSld();
    }

    public boolean k0() {
        return i() != null && i().isCafe;
    }

    public List<MealItemInCart> l() {
        ArrayList arrayList = new ArrayList();
        for (LinkedHashMap<String, MealItemInCart> values : this.f20044a.f18529b.values()) {
            for (MealItemInCart add : values.values()) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    public boolean l0(MenuItemInCart menuItemInCart) {
        MenuItem menuItem = menuItemInCart.getMenuItem();
        if (!x(menuItem) || this.f20044a.f18528a.get(menuItem.mId).get(menuItemInCart.getCustomizationHash()) == null) {
            return false;
        }
        return true;
    }

    public UserFlowInfo m() {
        in.swiggy.android.repositories.cart.data.a aVar = this.f20044a;
        if (aVar.v == null) {
            aVar.v = new UserFlowInfo();
        }
        return this.f20044a.v;
    }

    public boolean m0() {
        boolean z11 = !isEmpty() && this.f20044a.f18528a.size() > 0;
        for (LinkedHashMap<String, MenuItemInCart> values : this.f20044a.f18528a.values()) {
            for (MenuItemInCart menuItem : values.values()) {
                if (!menuItem.getMenuItem().isFreebie()) {
                    z11 = false;
                }
            }
        }
        return z11;
    }

    public void n(MenuItem menuItem) {
        if (this.f20044a.f18528a.containsKey(menuItem.mId)) {
            for (MenuItemInCart menuItemInCart : this.f20044a.f18528a.get(menuItem.mId).values()) {
                if (!(menuItemInCart == null || menuItemInCart.getMenuItem() == null)) {
                    menuItemInCart.getMenuItem().nudgeType = menuItem.nudgeType;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void n0() {
        this.f20051h.onNext(Integer.valueOf(A()));
    }

    public void o(MealItemInCart mealItemInCart) {
        if (X(mealItemInCart)) {
            MealItemInCart mealItemInCart2 = (MealItemInCart) this.f20044a.f18529b.get(mealItemInCart.mealId).get(mealItemInCart.getHashKey());
            if (mealItemInCart2 != null) {
                H0(mealItemInCart2, mealItemInCart2.getQuantity() - 1);
            }
        }
    }

    public void p(double d11) {
        this.f20044a.f18544w = d11;
    }

    public void q(MealItemInCart mealItemInCart) {
        U(mealItemInCart);
    }

    public void r(MenuItem menuItem) {
        if (!x(menuItem) || i0(menuItem) == null) {
            u(menuItem, 1);
        } else {
            u(menuItem, i0(menuItem).getQuantity() + 1);
        }
    }

    public void s(MealItemInCart mealItemInCart) {
        HashMap hashMap = this.f20044a.f18529b.get(mealItemInCart.mealId);
        hashMap.remove(mealItemInCart.getHashKey());
        if (hashMap.size() <= 0) {
            this.f20044a.f18529b.remove(mealItemInCart.mealId);
        }
        p0(mealItemInCart);
        if (isEmpty() && m0()) {
            x0();
        }
    }

    public void t(MenuItemInCart menuItemInCart) {
        v0(menuItemInCart);
        if (isEmpty() || m0()) {
            x0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(in.swiggy.android.tejas.oldapi.models.menu.MenuItem r4, int r5) {
        /*
            r3 = this;
            if (r5 > 0) goto L_0x0006
            r3.w0(r4)
            return
        L_0x0006:
            java.lang.String r0 = j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " items in cartData for:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            os.u.b(r0, r1)
            boolean r0 = r3.x(r4)
            if (r0 != 0) goto L_0x0049
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r0 = new in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart
            r0.<init>()
            r0.setMenuItem(r4)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = r4.getCustomizationHash()
            r1.put(r2, r0)
            in.swiggy.android.repositories.cart.data.a r2 = r3.f20044a
            java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart>> r2 = r2.f18528a
            java.lang.String r4 = r4.mId
            r2.put(r4, r1)
            r4 = 1
            goto L_0x005f
        L_0x0049:
            in.swiggy.android.repositories.cart.data.a r0 = r3.f20044a
            java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart>> r0 = r0.f18528a
            java.lang.String r1 = r4.mId
            java.lang.Object r0 = r0.get(r1)
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.String r4 = r4.mId
            java.lang.Object r4 = r0.get(r4)
            r0 = r4
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r0 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r0
            r4 = 0
        L_0x005f:
            r0.setQuantity(r5)
            r3.E0()
            r3.n0()
            if (r4 == 0) goto L_0x006e
            r3.r0(r0)
            goto L_0x0071
        L_0x006e:
            r3.t0(r0)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze0.a.u(in.swiggy.android.tejas.oldapi.models.menu.MenuItem, int):void");
    }

    public int v() {
        return this.f20044a.f18531d;
    }

    public void w0(MenuItem menuItem) {
        if (x(menuItem)) {
            MenuItemInCart i02 = i0(menuItem);
            this.f20044a.f18528a.remove(menuItem.mId);
            E0();
            n0();
            u0(i02);
        }
        if (isEmpty() || m0()) {
            x0();
        }
    }

    public boolean x(MenuItem menuItem) {
        Map map;
        if (!this.f20044a.f18528a.containsKey(menuItem.mId) || (map = this.f20044a.f18528a.get(menuItem.mId)) == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean y() {
        Boolean bool = this.f20044a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void y0(boolean z11) {
        this.f20044a.k = z11;
    }

    public void z() {
        this.f20044a.q = 0;
    }

    public d<MenuItemInCart> z0() {
        if (this.f20050g == null) {
            this.f20050g = PublishProcessor.z0();
        }
        return this.f20050g;
    }

    public a(in.swiggy.android.repositories.cart.data.a aVar) {
        this.f20046c = "";
        this.f20047d = null;
        this.f20048e = PublishProcessor.z0();
        this.f20049f = PublishProcessor.z0();
        this.f20050g = PublishProcessor.z0();
        this.f20051h = PublishProcessor.z0();
        this.f20052i = PublishProcessor.z0();
        this.f20044a = aVar;
    }
}
