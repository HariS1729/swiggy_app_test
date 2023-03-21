package cf0;

import af0.e;
import android.content.SharedPreferences;
import bp0.k;
import cg0.n;
import in.swiggy.android.repositories.cart.interfaces.ICartValidator$CartValidationFailType;
import in.swiggy.android.tejas.feature.address.model.AddressTag;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuVariation;
import in.swiggy.android.tejas.oldapi.models.cart.CartType;
import in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData;
import in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.oldapi.models.order.OrderDetailsMeal;
import in.swiggy.android.tejas.oldapi.models.order.OrderItem;
import in.swiggy.android.tejas.oldapi.models.reorder.ReorderCardData;
import in.swiggy.android.tejas.oldapi.models.reorder.ReorderCartItem;
import in.swiggy.android.tejas.oldapi.models.reorder.ReorderRestaurant;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import lp0.l;
import os.u;

/* compiled from: CartService */
public class h implements i, af0.b, e {

    /* renamed from: w  reason: collision with root package name */
    protected static final String f18099w = "h";

    /* renamed from: a  reason: collision with root package name */
    protected CartType f18100a;

    /* renamed from: b  reason: collision with root package name */
    protected CartType f18101b;

    /* renamed from: c  reason: collision with root package name */
    protected ze0.a f18102c;

    /* renamed from: d  reason: collision with root package name */
    protected ze0.b f18103d;

    /* renamed from: e  reason: collision with root package name */
    protected ye0.a f18104e;

    /* renamed from: f  reason: collision with root package name */
    protected ye0.b f18105f;

    /* renamed from: g  reason: collision with root package name */
    protected n f18106g;

    /* renamed from: h  reason: collision with root package name */
    protected SharedPreferences f18107h;

    /* renamed from: i  reason: collision with root package name */
    private eo0.a f18108i = new eo0.a();
    private String j;
    private String k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public transient Map<String, PublishProcessor<MenuItemInCart>> f18109l = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public transient Map<String, PublishProcessor<MealItemInCart>> f18110m = new HashMap();
    private transient List<af0.a> n = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public transient PublishProcessor<MenuItemInCart> f18111o = PublishProcessor.z0();

    /* renamed from: p  reason: collision with root package name */
    private transient PublishProcessor<Integer> f18112p = PublishProcessor.z0();
    protected transient PublishProcessor<MenuItemInCart> q = PublishProcessor.z0();

    /* renamed from: r  reason: collision with root package name */
    private transient PublishProcessor<CartType> f18113r = PublishProcessor.z0();

    /* renamed from: s  reason: collision with root package name */
    private transient PublishProcessor<Boolean> f18114s = PublishProcessor.z0();
    private transient List<af0.d> t = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public transient Map<String, PublishProcessor<LocalInstamartItem>> f18115u = new HashMap();
    private transient PublishProcessor<Void> v = PublishProcessor.z0();

    /* compiled from: CartService */
    class a extends io.reactivex.subscribers.b<MenuItemInCart> {
        a() {
        }

        /* renamed from: c */
        public void onNext(MenuItemInCart menuItemInCart) {
            if (menuItemInCart != null && menuItemInCart.getMenuItem() != null && h.this.f18109l.containsKey(menuItemInCart.getMenuItem().mId)) {
                ((PublishProcessor) h.this.f18109l.get(menuItemInCart.getMenuItem().mId)).onNext(menuItemInCart);
                h.this.q.onNext(menuItemInCart);
            }
        }

        public void onComplete() {
        }

        public void onError(Throwable th2) {
            u.h(h.f18099w, th2);
        }
    }

    /* compiled from: CartService */
    class b extends io.reactivex.subscribers.b<MenuItemInCart> {
        b() {
        }

        /* renamed from: c */
        public void onNext(MenuItemInCart menuItemInCart) {
            h.this.f18111o.onNext(menuItemInCart);
        }

        public void onComplete() {
        }

        public void onError(Throwable th2) {
        }
    }

    /* compiled from: CartService */
    class c extends io.reactivex.subscribers.b<MealItemInCart> {
        c() {
        }

        /* renamed from: c */
        public void onNext(MealItemInCart mealItemInCart) {
            if (mealItemInCart != null && mealItemInCart.mealId != null && h.this.f18110m.containsKey(mealItemInCart.mealId)) {
                ((PublishProcessor) h.this.f18110m.get(mealItemInCart.mealId)).onNext(mealItemInCart);
            }
        }

        public void onComplete() {
        }

        public void onError(Throwable th2) {
        }
    }

    /* compiled from: CartService */
    class d extends io.reactivex.subscribers.b<LocalInstamartItem> {
        d() {
        }

        /* renamed from: c */
        public void onNext(LocalInstamartItem localInstamartItem) {
            if (localInstamartItem != null && h.this.f18115u.containsKey(localInstamartItem.getItemId())) {
                ((PublishProcessor) h.this.f18115u.get(localInstamartItem.getItemId())).onNext(localInstamartItem);
                h.this.j0();
            }
        }

        public void onComplete() {
        }

        public void onError(Throwable th2) {
            u.h(h.f18099w, th2);
        }
    }

    public h(ye0.a aVar, ye0.b bVar, SharedPreferences sharedPreferences) {
        CartType cartType = CartType.REGULAR;
        this.f18100a = cartType;
        this.f18101b = cartType;
        this.f18104e = aVar;
        this.f18105f = bVar;
        this.f18107h = sharedPreferences;
        b0(cartType, true);
    }

    private void a0() {
        ze0.b bVar = (ze0.b) this.f18105f.a();
        this.f18103d = bVar;
        if (bVar == null) {
            n0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ k c0(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation) {
        this.f18103d.m(martMenuItem, martMenuVariation, (l<? super ICartValidator$CartValidationFailType, k>) null);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0(CartType cartType, boolean z11) {
        this.f18102c = (ze0.a) this.f18104e.a(this.f18101b);
        this.f18113r.onNext(cartType);
        if (z11) {
            a0();
        }
        o0();
        i0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e0(MenuItemInCart menuItemInCart) throws Exception {
        if (menuItemInCart != null && menuItemInCart.getMenuItem() != null && this.f18109l.containsKey(menuItemInCart.getMenuItem().mId)) {
            this.f18109l.get(menuItemInCart.getMenuItem().mId).onNext(menuItemInCart);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0(Integer num) throws Exception {
        k0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h0(k kVar) throws Exception {
        j0();
    }

    private void i0() {
        if (this.n != null) {
            for (int i11 = 0; i11 < this.n.size(); i11++) {
                this.n.get(i11).V0();
            }
        }
    }

    /* access modifiers changed from: private */
    public void j0() {
        if (this.t != null) {
            for (int i11 = 0; i11 < this.t.size(); i11++) {
                this.t.get(i11).a();
            }
        }
    }

    private void k0() {
        if (this.f18102c.isEmpty() || this.f18102c.m0()) {
            l0();
        }
        this.f18112p.onNext(Integer.valueOf(B().v()));
        i0();
    }

    private void l0() {
        SharedPreferences sharedPreferences = this.f18107h;
        if (sharedPreferences != null && sharedPreferences.contains("CART_FROM_REORDER")) {
            this.f18107h.edit().remove("CART_FROM_REORDER").apply();
        }
    }

    private void n0() {
        this.f18103d = new ze0.b();
    }

    public bf0.a B() {
        return this.f18102c;
    }

    public void D(ReorderCardData reorderCardData) {
        if (this.f18101b == CartType.REGULAR) {
            List<ReorderCartItem> restaurantItemList = reorderCardData.getRestaurantItemList();
            b();
            if (reorderCardData.getRestaurant() != null && restaurantItemList != null && !restaurantItemList.isEmpty()) {
                ReorderRestaurant restaurant = reorderCardData.getRestaurant();
                B().E(RestaurantMetaData.getInstance(restaurant.getId(), restaurant.getName(), restaurant.getRestaurantArea(), reorderCardData.getRestaurant().getCloudinaryImageId(), reorderCardData.isCafeOrder(), false));
                for (int i11 = 0; i11 < restaurantItemList.size(); i11++) {
                    ReorderCartItem reorderCartItem = restaurantItemList.get(i11);
                    this.f18102c.F0(reorderCartItem.getMenuItem(), reorderCartItem.getQuantity().intValue(), reorderCartItem.getAddonHashMap(), reorderCartItem.getVariantsHashMap(), "");
                }
            }
        }
    }

    public int E() {
        ze0.a aVar = this.f18102c;
        if (aVar == null || aVar.getDeliveryAddress() == null || this.f18102c.getDeliveryAddress().getAnnotationTagString() == null) {
            return 26;
        }
        String annotationTagString = this.f18102c.getDeliveryAddress().getAnnotationTagString();
        annotationTagString.hashCode();
        if (annotationTagString.equals(AddressTag.TypeString.HOME_TAG_STRING)) {
            return 21;
        }
        if (!annotationTagString.equals(AddressTag.TypeString.WORK_TAG_STRING)) {
            return 26;
        }
        return 31;
    }

    public void F() {
        Map<String, PublishProcessor<MenuItemInCart>> map = this.f18109l;
        if (map != null) {
            Iterator<Map.Entry<String, PublishProcessor<MenuItemInCart>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (!((PublishProcessor) it2.next().getValue()).A0()) {
                    it2.remove();
                }
            }
        }
    }

    public void G(Order order) {
        if (this.f18101b == CartType.REGULAR) {
            List<OrderItem> list = order.mOrderItems;
            b();
            B().E(RestaurantMetaData.getInstance(order.mRestaurantId, order.mRestaurantName, order.mRestaurantArea, order.mRestaurantCoverImageId, order.isCafeOrder(), false));
            for (OrderDetailsMeal G0 : order.mMealItems) {
                this.f18102c.G0(G0);
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                OrderItem orderItem = list.get(i11);
                this.f18102c.F0(orderItem.getMenuItem(), orderItem.mQuantity, orderItem.getAddonHashMap(), orderItem.getVariantsHashMap(), "");
            }
        }
    }

    public ao0.d<MenuItemInCart> H() {
        if (this.q == null) {
            this.q = PublishProcessor.z0();
        }
        return this.q;
    }

    public void I(String str) {
        this.k = str;
    }

    public PublishProcessor<Boolean> J() {
        return this.f18114s;
    }

    public ao0.d<MenuItemInCart> K(String str) {
        if (this.f18109l == null) {
            this.f18109l = new HashMap();
        }
        if (!this.f18109l.containsKey(str)) {
            this.f18109l.put(str, PublishProcessor.z0());
        }
        return this.f18109l.get(str);
    }

    public void N(MenuItem menuItem, int i11, HashMap<String, List<Addon>> hashMap, Map<String, Variation> map, String str, double d11) {
        this.f18102c.N(menuItem, i11, hashMap, map, str, d11);
    }

    public void S(MenuItem menuItem) {
        this.f18102c.S(menuItem);
    }

    public void U(MealItemInCart mealItemInCart) {
        this.f18102c.U(mealItemInCart);
    }

    /* access modifiers changed from: protected */
    public void Z() {
        if (this.f18102c != null) {
            this.f18108i.e();
        }
    }

    public void a() {
        this.f18104e.b(this.f18101b);
    }

    public void b() {
        this.f18102c.I0();
        this.f18104e.c(this.f18101b);
    }

    /* access modifiers changed from: protected */
    public void b0(CartType cartType, boolean z11) {
        Z();
        this.f18100a = this.f18101b;
        this.f18101b = cartType;
        Executors.newSingleThreadExecutor().execute(new f(this, cartType, z11));
        if (!z11 && this.f18103d == null) {
            n0();
        }
    }

    public void c(MenuItemInCart menuItemInCart) {
        this.f18102c.c(menuItemInCart);
    }

    public void d() {
        this.f18105f.d();
    }

    public void e() {
        this.f18103d.b();
        this.f18105f.e();
    }

    public void f(MenuItemInCart menuItemInCart) {
        this.f18102c.f(menuItemInCart);
    }

    public void g(af0.a aVar) {
        if (!this.n.contains(aVar)) {
            this.n.add(aVar);
        }
    }

    public CartType getCartType() {
        CartType cartType = this.f18101b;
        return cartType == null ? CartType.REGULAR : cartType;
    }

    public bf0.b getInstamartCart() {
        return this.f18103d;
    }

    public void i(String str) {
        this.j = str;
    }

    public void k(af0.d dVar) {
        this.t.remove(dVar);
    }

    public void l(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation) {
        this.f18103d.l(martMenuItem, martMenuVariation);
    }

    public void m(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation, l<? super ICartValidator$CartValidationFailType, k> lVar) {
        new l(this.f18103d, martMenuItem.getStoreInfo().getStoreDetails(), martMenuVariation, new g(this, martMenuItem, martMenuVariation), lVar).f();
    }

    public void m0() {
        this.f18104e.b(CartType.REGULAR);
    }

    public ao0.d<LocalInstamartItem> n(String str) {
        if (this.f18115u == null) {
            this.f18115u = new HashMap();
        }
        if (!this.f18115u.containsKey(str)) {
            this.f18115u.put(str, PublishProcessor.z0());
        }
        return this.f18115u.get(str);
    }

    public void o(MealItemInCart mealItemInCart) {
        this.f18102c.o(mealItemInCart);
    }

    /* access modifiers changed from: protected */
    public void o0() {
        this.f18108i.c((eo0.b) this.f18102c.A0().S().Q(do0.a.a()).o0(new a()));
        this.f18108i.c((eo0.b) this.f18102c.z0().Q(do0.a.a()).o0(new b()));
        this.f18108i.c((eo0.b) this.f18102c.D0().S().Q(do0.a.a()).o0(new c()));
        this.f18108i.c(this.f18102c.C0().S().Q(do0.a.a()).h0(new b(this), e.f12927a));
        this.f18108i.c(this.f18102c.B0().S().Q(do0.a.a()).g0(new c(this)));
        this.f18108i.c(this.f18103d.w().S().Q(do0.a.a()).g0(new d(this)));
        this.f18108i.c((eo0.b) this.f18103d.v().S().Q(do0.a.a()).o0(new d()));
    }

    public ao0.d<Integer> p() {
        return this.f18112p;
    }

    public void q(MealItemInCart mealItemInCart) {
        this.f18102c.q(mealItemInCart);
    }

    public void r(MenuItem menuItem) {
        this.f18102c.r(menuItem);
    }

    public void s(MealItemInCart mealItemInCart) {
        this.f18102c.s(mealItemInCart);
    }

    public void t(MenuItemInCart menuItemInCart) {
        this.f18102c.t(menuItemInCart);
    }

    public void u(MenuItem menuItem, int i11) {
        this.f18102c.u(menuItem, i11);
    }

    public bf0.a v(CartType cartType) {
        if (this.f18101b == cartType) {
            return this.f18102c;
        }
        l0();
        b0(cartType, false);
        return this.f18102c;
    }

    public ao0.d<MenuItemInCart> w() {
        return this.f18111o;
    }

    public void x(af0.d dVar) {
        if (!this.t.contains(dVar)) {
            this.t.add(dVar);
        }
    }

    public Boolean y() {
        SharedPreferences sharedPreferences = this.f18107h;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.getBoolean("CART_FROM_REORDER", false));
        }
        return Boolean.FALSE;
    }

    public void z(af0.a aVar) {
        this.n.remove(aVar);
    }
}
