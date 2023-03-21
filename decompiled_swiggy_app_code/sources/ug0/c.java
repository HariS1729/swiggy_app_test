package ug0;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.appcompat.app.AppCompatActivity;
import bp0.k;
import cg0.n;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import ef0.e;
import ef0.f;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.GetLocalCartRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartItem;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2;
import in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2RequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CustomizeCartResponsePayload;
import in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CustomizeLocalCartRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.UpdateLocalCartRequestPayload;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressSortingWeight;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.cart.CartItems;
import in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCart;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCartItem;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCartSubscriptionItem;
import in.swiggy.android.tejas.oldapi.models.cart.detip.DETipDetails;
import in.swiggy.android.tejas.oldapi.models.cart.detip.DETipDetailsRequest;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.oldapi.models.menu.AddonGroup;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Variants;
import in.swiggy.android.tejas.oldapi.models.menu.VariantsV2;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import in.swiggy.android.tejas.oldapi.network.responses.ReviewedCartResponse;
import in.swiggy.android.tejas.oldapi.utils.CryptoUtils;
import ir.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.json.JsonElement;
import mb0.n1;
import ms.h;
import os.u;
import ug0.d;
import zp.b;
import zp.d;

@Instrumented
/* compiled from: CartPluginV2.kt */
public final class c implements d {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final AppCompatActivity f19910b;

    /* renamed from: c  reason: collision with root package name */
    private ze0.a f19911c;

    /* renamed from: d  reason: collision with root package name */
    private final n1 f19912d;

    /* renamed from: e  reason: collision with root package name */
    private cf0.i f19913e;

    /* renamed from: f  reason: collision with root package name */
    private final e f19914f;

    /* renamed from: g  reason: collision with root package name */
    private final n f19915g;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f19916h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedPreferences f19917i;
    private final lp0.a<k> j;
    private final eo0.a k;

    /* renamed from: l  reason: collision with root package name */
    private final jr.a f19918l;

    /* renamed from: m  reason: collision with root package name */
    private final b f19919m;
    private final f n;

    /* renamed from: o  reason: collision with root package name */
    private final String f19920o;

    /* renamed from: p  reason: collision with root package name */
    private final String f19921p;
    private final e q;

    /* renamed from: r  reason: collision with root package name */
    private zp.b f19922r;

    /* renamed from: s  reason: collision with root package name */
    private zp.b f19923s;
    private String t;

    /* renamed from: u  reason: collision with root package name */
    private final Map<String, Integer> f19924u = new LinkedHashMap();
    private boolean v = true;

    /* renamed from: w  reason: collision with root package name */
    private String f19925w = "";

    /* compiled from: CartPluginV2.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public c(AppCompatActivity appCompatActivity, ze0.a aVar, n1 n1Var, cf0.i iVar, e eVar, n nVar, Class<?> cls, SharedPreferences sharedPreferences, lp0.a<k> aVar2, eo0.a aVar3, jr.a aVar4, b bVar, f fVar, String str, String str2, e eVar2) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        ze0.a aVar5 = aVar;
        n1 n1Var2 = n1Var;
        cf0.i iVar2 = iVar;
        e eVar3 = eVar;
        n nVar2 = nVar;
        Class<?> cls2 = cls;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        lp0.a<k> aVar6 = aVar2;
        eo0.a aVar7 = aVar3;
        jr.a aVar8 = aVar4;
        b bVar2 = bVar;
        f fVar2 = fVar;
        String str3 = str2;
        e eVar4 = eVar2;
        p.j(appCompatActivity2, "activity");
        p.j(aVar5, "cart");
        p.j(n1Var2, "lynxUIComponent");
        p.j(iVar2, "cartService");
        p.j(eVar3, LogSubCategory.Action.USER);
        p.j(nVar2, "locationContext");
        p.j(cls2, "clazz");
        p.j(sharedPreferences2, "sharedPreferences");
        p.j(aVar6, "loadUrlWithoutParams");
        p.j(aVar7, "subscriptions");
        p.j(aVar8, "newrelicPerformanceUtils");
        p.j(bVar2, "mSwiggyEventHandler");
        p.j(fVar2, "xpExperimentContext");
        p.j(str3, "initialUrl");
        p.j(eVar4, "appHelper");
        this.f19910b = appCompatActivity2;
        this.f19911c = aVar5;
        this.f19912d = n1Var2;
        this.f19913e = iVar2;
        this.f19914f = eVar3;
        this.f19915g = nVar2;
        this.f19916h = cls2;
        this.f19917i = sharedPreferences2;
        this.j = aVar6;
        this.k = aVar7;
        this.f19918l = aVar8;
        this.f19919m = bVar2;
        this.n = fVar2;
        this.f19920o = str;
        this.f19921p = str3;
        this.q = eVar4;
    }

    private final go0.a Y0(zp.b bVar, String str) {
        return new a(this, bVar, str);
    }

    /* access modifiers changed from: private */
    public static final void Z0(c cVar, zp.b bVar, String str) {
        p.j(cVar, "this$0");
        p.j(bVar, "$responseHandler");
        p.j(str, "$requestId");
        cVar.k.c(h.d(new b(cVar, bVar, str), 500, TimeUnit.MILLISECONDS, do0.a.a()));
    }

    /* access modifiers changed from: private */
    public static final Boolean a1(c cVar, zp.b bVar, String str) {
        p.j(cVar, "this$0");
        p.j(bVar, "$responseHandler");
        p.j(str, "$requestId");
        cVar.b1(bVar, str);
        return Boolean.TRUE;
    }

    private final void i1(WebResourceRequest webResourceRequest, d dVar, boolean z11) {
        CharSequence charSequence;
        Uri uri;
        Map<String, String> map;
        Map<String, String> requestHeaders;
        String str = null;
        u.b("CartPluginV2", String.valueOf(dVar == null ? null : dVar.a()));
        HashMap hashMap = new HashMap();
        String str2 = "";
        if (dVar == null || (charSequence = dVar.a()) == null) {
            charSequence = str2;
        }
        hashMap.put("web_cart_switched_to_native_flow_error_message", charSequence);
        if (webResourceRequest == null) {
            uri = null;
        } else {
            uri = webResourceRequest.getUrl();
        }
        hashMap.put("web_cart_switched_to_native_url", String.valueOf(uri));
        if (webResourceRequest == null) {
            map = null;
        } else {
            map = webResourceRequest.getRequestHeaders();
        }
        if (!(map == null || map.isEmpty())) {
            if (!(webResourceRequest == null || (requestHeaders = webResourceRequest.getRequestHeaders()) == null)) {
                str = requestHeaders.get("Referer");
            }
            if (str != null) {
                str2 = str;
            }
            hashMap.put("web_cart_switched_to_native_referer", str2);
        }
        if (z11) {
            this.f19918l.b("web_cart_switched_to_native_flow", hashMap);
        } else {
            this.f19918l.b("web_cart_switched_to_native_flow_false_alarm", hashMap);
        }
    }

    static /* synthetic */ void j1(c cVar, WebResourceRequest webResourceRequest, d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        cVar.i1(webResourceRequest, dVar, z11);
    }

    public void E0(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, zp.b bVar) {
        p.j(openSuperV2RequestPayload, "openSuperV2RequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19922r = bVar;
        this.t = str;
        String valueOf = String.valueOf(this.f19915g.getLatitude());
        String valueOf2 = String.valueOf(this.f19915g.getLongitude());
        this.q.c(openSuperV2RequestPayload.b() + "&lat=" + valueOf + "&lng=" + valueOf2 + "&internal=true", this.f19910b);
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        d.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void L(GetLocalCartRequestPayload getLocalCartRequestPayload, String str, zp.b bVar) {
        Location y11;
        p.j(getLocalCartRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (this.f19911c.isEmpty()) {
            mp.a aVar = mp.a.f53029a;
            b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
            return;
        }
        int i11 = this.f19917i.getInt("planID", 0);
        if (i11 == 0 || !this.f19914f.o0()) {
            this.f19911c.I(0);
        } else {
            this.f19911c.I(i11);
        }
        CartItems w11 = ((bf0.c) this.f19911c).w();
        if (w11 != null) {
            ze0.a aVar2 = this.f19911c;
            w11.orderComment = aVar2.f20046c;
            String str2 = aVar2.f20047d;
            if (str2 != null) {
                w11.cutleryComments = str2;
            }
            e eVar = this.q;
            String city = this.f19915g.getCity();
            if (city == null) {
                city = "";
            }
            if (eVar.r(city) && (y11 = this.f19915g.y()) != null) {
                w11.userLiveLat = Double.valueOf(y11.getLatitude());
                w11.userLiveLng = Double.valueOf(y11.getLongitude());
            }
            b.a.a(bVar, str, 0, (String) null, w11, wg0.a.f19950a, 6, (Object) null);
        }
    }

    public void M(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, zp.b bVar) {
        p.j(addNewAddressRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19922r = bVar;
        this.t = str;
        this.q.u(this.f19912d);
    }

    public void U0(CustomizeLocalCartRequestPayload customizeLocalCartRequestPayload, String str, zp.b bVar) {
        p.j(customizeLocalCartRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (customizeLocalCartRequestPayload.b().d() != null) {
            String valueOf = String.valueOf(customizeLocalCartRequestPayload.b().d());
            Gson e12 = e1();
            Class cls = ReviewedCartItem.class;
            MenuItemInCart menuItemInCart = ((ReviewedCartItem) (!(e12 instanceof Gson) ? e12.fromJson(valueOf, cls) : GsonInstrumentation.fromJson(e12, valueOf, cls))).getMenuItemInCart();
            this.f19923s = bVar;
            String str2 = menuItemInCart.getMenuItem().mId;
            p.i(str2, "menuItemInCart.menuItem.mId");
            this.f19925w = str2;
            LinkedHashMap linkedHashMap = this.f19911c.f20044a.f18528a.get(menuItemInCart.getMenuItem().mId);
            this.f19924u.clear();
            if (linkedHashMap != null) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Map<String, Integer> map = this.f19924u;
                    Object key = entry.getKey();
                    p.i(key, "menuitem.key");
                    map.put(key, Integer.valueOf(((MenuItemInCart) entry.getValue()).getQuantity()));
                }
            }
            Restaurant restaurant = new Restaurant();
            restaurant.mName = customizeLocalCartRequestPayload.b().c().b();
            restaurant.mId = customizeLocalCartRequestPayload.b().c().a();
            if (customizeLocalCartRequestPayload.b().b()) {
                e eVar = this.q;
                p.i(menuItemInCart, "menuItemInCart");
                eVar.n(menuItemInCart, restaurant, Y0(bVar, str));
            } else if (this.f19911c.l0(menuItemInCart)) {
                e eVar2 = this.q;
                p.i(menuItemInCart, "menuItemInCart");
                eVar2.b(menuItemInCart, Y0(bVar, str));
            }
        }
    }

    public void X(UpdateLocalCartRequestPayload updateLocalCartRequestPayload, String str, zp.b bVar) {
        p.j(updateLocalCartRequestPayload, "updatePayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (k1(updateLocalCartRequestPayload)) {
            mp.a aVar = mp.a.f53029a;
            b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
            return;
        }
        mp.a aVar2 = mp.a.f53029a;
        bVar.c(str, 1, "Bad data received for UPDATE_LOCAL_CART request", aVar2, aVar2.a());
    }

    public void a(lp.b bVar, String str, zp.b bVar2, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        p(false);
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093 A[EDGE_INSN: B:24:0x0093->B:19:0x0093 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b1(zp.b r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "responseHandler"
            kotlin.jvm.internal.p.j(r11, r0)
            java.lang.String r0 = "requestId"
            kotlin.jvm.internal.p.j(r12, r0)
            zp.b r0 = r10.f19923s
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            r0 = 0
            java.lang.String r1 = r10.f19925w
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.p.e(r1, r2)
            r2 = 1
            if (r1 != 0) goto L_0x0093
            ze0.a r1 = r10.f19911c
            in.swiggy.android.repositories.cart.data.a r1 = r1.f20044a
            java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart>> r1 = r1.f18528a
            java.lang.String r3 = r10.f19925w
            java.lang.Object r1 = r1.get(r3)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            if (r1 == 0) goto L_0x0093
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0033:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r10.f19924u
            java.lang.Object r5 = r3.getValue()
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r5 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r5
            java.lang.String r5 = r5.getCustomizationHash()
            boolean r4 = r4.containsKey(r5)
            java.lang.String r5 = "menuItemInNewCart.value"
            if (r4 != 0) goto L_0x0061
            java.lang.Object r0 = r3.getValue()
            kotlin.jvm.internal.p.i(r0, r5)
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r0 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r0
            r10.c1(r11, r12, r0)
        L_0x005f:
            r0 = 1
            goto L_0x0093
        L_0x0061:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r10.f19924u
            java.lang.Object r6 = r3.getValue()
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r6 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r6
            java.lang.String r6 = r6.getCustomizationHash()
            java.lang.Object r4 = r4.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r6 = r3.getValue()
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r6 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r6
            int r6 = r6.getQuantity()
            if (r4 != 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0033
        L_0x0086:
            java.lang.Object r0 = r3.getValue()
            kotlin.jvm.internal.p.i(r0, r5)
            in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart r0 = (in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart) r0
            r10.c1(r11, r12, r0)
            goto L_0x005f
        L_0x0093:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r10.f19924u
            r1.clear()
            if (r0 != 0) goto L_0x00b2
            r4 = 0
            r5 = 0
            r6 = 0
            gq0.l0 r7 = new gq0.l0
            mp.a r0 = mp.a.f53029a
            kotlinx.serialization.KSerializer r0 = r0.a()
            r7.<init>(r0)
            r8 = 6
            r9 = 0
            r2 = r11
            r3 = r12
            zp.b.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 0
            r10.f19923s = r11
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.c.b1(zp.b, java.lang.String):void");
    }

    public boolean c() {
        return true;
    }

    public final void c1(zp.b bVar, String str, MenuItemInCart menuItemInCart) {
        p.j(bVar, "responseHandler");
        p.j(str, "requestId");
        p.j(menuItemInCart, "menuItemInCart");
        CustomizeCartResponsePayload customizeCartResponsePayload = new CustomizeCartResponsePayload((List) null, (List) null, 3, (i) null);
        HashMap<String, List<Addon>> addons = menuItemInCart.getAddons();
        Map<String, Variation> variants = menuItemInCart.getVariants();
        ArrayList arrayList = new ArrayList();
        if (addons != null && !addons.isEmpty()) {
            for (Map.Entry next : addons.entrySet()) {
                p.i(next, "menuItemInCartAddons.entries");
                String str2 = (String) next.getKey();
                for (Addon addon : (List) next.getValue()) {
                    p.i(str2, HttpRequest.HEADER_KEY);
                    CartAddon cartAddon = r10;
                    CartAddon cartAddon2 = new CartAddon(str2, addon.mId, addon.mPrice, addon.mName);
                    arrayList.add(cartAddon);
                }
            }
        }
        customizeCartResponsePayload.a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        if (variants != null && !variants.isEmpty()) {
            for (Map.Entry next2 : variants.entrySet()) {
                String str3 = (String) next2.getKey();
                Variation variation = (Variation) next2.getValue();
                GroupVariation2 groupVariation2 = new GroupVariation2((Double) null, (Long) null, (String) null, (Long) null, 15, (i) null);
                p.i(str3, HttpRequest.HEADER_KEY);
                groupVariation2.c(Long.valueOf(Long.parseLong(str3)));
                String str4 = variation.mId;
                groupVariation2.d(str4 == null ? null : Long.valueOf(Long.parseLong(str4)));
                groupVariation2.f(Double.valueOf(variation.mPrice));
                groupVariation2.e(variation.mName);
                arrayList2.add(groupVariation2);
            }
        }
        customizeCartResponsePayload.b(arrayList2);
        b.a.a(bVar, str, 0, (String) null, customizeCartResponsePayload, CustomizeCartResponsePayload.Companion.serializer(), 6, (Object) null);
        this.f19923s = null;
    }

    public final ze0.a d1() {
        return this.f19911c;
    }

    public final Gson e1() {
        GsonBuilder lenient = new GsonBuilder().serializeNulls().setLenient();
        Class cls = Boolean.TYPE;
        lenient.registerTypeAdapter(cls, new ns.a());
        lenient.registerTypeAdapter(cls, new ns.a());
        Gson create = lenient.create();
        p.i(create, "gsonBuilder.create()");
        return create;
    }

    public final ir.b f1() {
        return this.f19919m;
    }

    public final zp.b g1() {
        return this.f19922r;
    }

    public void h() {
        d.b.a(this);
    }

    /* renamed from: h1 */
    public ArrayList<np.b> T() {
        return d.b.b(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
        Uri uri;
        String str = this.f19920o;
        if (str != null && p.e(str, "cart")) {
            if (webResourceRequest == null) {
                uri = null;
            } else {
                uri = webResourceRequest.getUrl();
            }
            if (o.N(String.valueOf(uri), this.f19921p, false, 2, (Object) null)) {
                j1(this, webResourceRequest, dVar, false, 4, (Object) null);
                p(true);
                return true;
            }
            i1(webResourceRequest, dVar, false);
        }
        return false;
    }

    public final boolean k1(UpdateLocalCartRequestPayload updateLocalCartRequestPayload) {
        AddressSortingWeight addressSortingWeight;
        ReviewedCart reviewedCart;
        List<JsonElement> k11;
        double d11;
        boolean z11;
        p.j(updateLocalCartRequestPayload, "updatePayload");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap<String, LinkedHashMap<String, MenuItemInCart>> linkedHashMap2 = this.f19911c.f20044a.f18528a;
        p.i(linkedHashMap2, "cart.cartData.cartContainer");
        for (Map.Entry<String, LinkedHashMap<String, MenuItemInCart>> value : linkedHashMap2.entrySet()) {
            Object value2 = value.getValue();
            p.i(value2, "menuItemIdInCart.value");
            for (Map.Entry entry : ((Map) value2).entrySet()) {
                Object key = entry.getKey();
                p.i(key, "menuItemHashInCart.key");
                Object value3 = entry.getValue();
                p.i(value3, "menuItemHashInCart.value");
                linkedHashMap.put(key, value3);
            }
        }
        this.f19913e.b();
        if (updateLocalCartRequestPayload.b().q() != null) {
            String valueOf = String.valueOf(updateLocalCartRequestPayload.b().q());
            Gson e12 = e1();
            Class cls = Address.class;
            this.f19911c.f20044a.f18538m = (Address) (!(e12 instanceof Gson) ? e12.fromJson(valueOf, cls) : GsonInstrumentation.fromJson(e12, valueOf, cls));
        } else {
            this.f19911c.f20044a.f18538m = this.f19914f.getAddressById(updateLocalCartRequestPayload.b().a());
        }
        this.f19911c.f20044a.k = updateLocalCartRequestPayload.b().u() == 1;
        this.f19911c.f20046c = updateLocalCartRequestPayload.b().l();
        this.f19911c.f20047d = updateLocalCartRequestPayload.b().f();
        this.f19911c.f20044a.f18542s = updateLocalCartRequestPayload.b().d();
        if (updateLocalCartRequestPayload.b().g() != null) {
            String valueOf2 = String.valueOf(updateLocalCartRequestPayload.b().g());
            Gson e13 = e1();
            Class cls2 = DETipDetails.class;
            DETipDetails dETipDetails = (DETipDetails) (!(e13 instanceof Gson) ? e13.fromJson(valueOf2, cls2) : GsonInstrumentation.fromJson(e13, valueOf2, cls2));
            DETipDetailsRequest dETipDetailsRequest = new DETipDetailsRequest();
            if (dETipDetails == null) {
                d11 = 0.0d;
            } else {
                d11 = dETipDetails.getAmount();
            }
            dETipDetailsRequest.setAmount(d11);
            if (dETipDetails == null) {
                z11 = false;
            } else {
                z11 = dETipDetails.getOptIn();
            }
            dETipDetailsRequest.setOptIn(z11);
            this.f19911c.f20044a.f18543u = dETipDetailsRequest;
        }
        List<CartItem> i11 = updateLocalCartRequestPayload.b().i();
        if (i11 != null) {
            for (CartItem next : i11) {
                MenuItemInCart menuItemInCart = new MenuItemInCart();
                MenuItem menuItem = new MenuItem();
                String customizationHash = CryptoUtils.getCustomizationHash(String.valueOf(next.i()), next.a(), next.l());
                if (linkedHashMap.containsKey(customizationHash)) {
                    MenuItemInCart menuItemInCart2 = (MenuItemInCart) linkedHashMap.get(customizationHash);
                    menuItem = menuItemInCart2 == null ? null : menuItemInCart2.getMenuItem();
                    if (menuItem == null) {
                        menuItem = new MenuItem();
                    }
                }
                List<JsonElement> f11 = next.f();
                if (f11 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (JsonElement obj : f11) {
                        Gson e14 = e1();
                        String obj2 = obj.toString();
                        Class cls3 = AddonGroup.class;
                        arrayList.add((AddonGroup) (!(e14 instanceof Gson) ? e14.fromJson(obj2, cls3) : GsonInstrumentation.fromJson(e14, obj2, cls3)));
                    }
                    menuItem.mAddonGroups = arrayList;
                }
                if (next.g() != null) {
                    String valueOf3 = String.valueOf(next.g());
                    if (js.c.e(Boolean.valueOf(valueOf3.length() == 0))) {
                        Gson e15 = e1();
                        Class cls4 = Variants.class;
                        menuItem.mVariants = (Variants) (!(e15 instanceof Gson) ? e15.fromJson(valueOf3, cls4) : GsonInstrumentation.fromJson(e15, valueOf3, cls4));
                    }
                }
                if (next.h() != null) {
                    String valueOf4 = String.valueOf(next.h());
                    if (js.c.e(Boolean.valueOf(valueOf4.length() == 0))) {
                        Gson e16 = e1();
                        Class cls5 = VariantsV2.class;
                        menuItem.setVariantsV2((VariantsV2) (!(e16 instanceof Gson) ? e16.fromJson(valueOf4, cls5) : GsonInstrumentation.fromJson(e16, valueOf4, cls5)));
                    }
                }
                menuItem.mId = String.valueOf(next.i());
                menuItem.mRewardType = next.k();
                menuItemInCart.setSubTotal(next.d());
                menuItemInCart.setSubTotalDiscount(next.e());
                if (next.b() > 0.0d) {
                    menuItem.setPrice(next.b());
                }
                menuItemInCart.setMenuItem(menuItem);
                menuItemInCart.setFinalPrice(next.c());
                Integer j11 = next.j();
                if (j11 != null) {
                    d1().N(menuItemInCart.getMenuItem(), j11.intValue(), next.a(), next.l(), "", menuItemInCart.getFinalPrice());
                }
            }
        }
        if (!(updateLocalCartRequestPayload.b().k() == null || (k11 = updateLocalCartRequestPayload.b().k()) == null)) {
            if (!k11.isEmpty()) {
                String obj3 = k11.get(0).toString();
                Gson e17 = e1();
                Class cls6 = ReviewedCartSubscriptionItem.class;
                Object fromJson = !(e17 instanceof Gson) ? e17.fromJson(obj3, cls6) : GsonInstrumentation.fromJson(e17, obj3, cls6);
                in.swiggy.android.repositories.cart.data.a aVar = this.f19911c.f20044a;
                Long planId = ((ReviewedCartSubscriptionItem) fromJson).getPlanId();
                aVar.q = planId == null ? 0 : (int) planId.longValue();
            } else if (i11 != null && (!i11.isEmpty())) {
                this.f19917i.edit().putBoolean("isPlanAdded", false).apply();
                this.f19917i.edit().putInt("planID", 0).apply();
            }
        }
        in.swiggy.android.repositories.cart.data.a aVar2 = this.f19911c.f20044a;
        String o11 = updateLocalCartRequestPayload.b().o();
        String p11 = updateLocalCartRequestPayload.b().p();
        String n11 = updateLocalCartRequestPayload.b().n();
        Integer v11 = updateLocalCartRequestPayload.b().v();
        aVar2.n = RestaurantMetaData.getInstance(o11, p11, "", n11, false, v11 != null && v11.intValue() == 1);
        Restaurant restaurant = new Restaurant();
        restaurant.mName = updateLocalCartRequestPayload.b().p();
        restaurant.mId = updateLocalCartRequestPayload.b().o();
        restaurant.mImagePath = updateLocalCartRequestPayload.b().n();
        if (updateLocalCartRequestPayload.b().c() != null) {
            String valueOf5 = String.valueOf(updateLocalCartRequestPayload.b().c());
            Gson e18 = e1();
            Class cls7 = AddressSortingWeight.class;
            addressSortingWeight = (AddressSortingWeight) (!(e18 instanceof Gson) ? e18.fromJson(valueOf5, cls7) : GsonInstrumentation.fromJson(e18, valueOf5, cls7));
        } else {
            addressSortingWeight = null;
        }
        ReviewedCartResponse reviewedCartResponse = this.f19911c.f20044a.f18540p;
        if (reviewedCartResponse == null || (reviewedCart = reviewedCartResponse.mReviewedCart) == null) {
            ReviewedCartResponse reviewedCartResponse2 = new ReviewedCartResponse(0, "");
            ReviewedCart reviewedCart2 = new ReviewedCart();
            reviewedCart2.cartId = String.valueOf(updateLocalCartRequestPayload.b().e());
            reviewedCart2.mCouponCode = updateLocalCartRequestPayload.b().j();
            reviewedCart2.mRestaurant = restaurant;
            reviewedCart2.discountMessage = updateLocalCartRequestPayload.b().h();
            reviewedCart2.addressSortingWeight = addressSortingWeight;
            reviewedCart2.originalCartId = String.valueOf(updateLocalCartRequestPayload.b().m());
            reviewedCartResponse2.mReviewedCart = reviewedCart2;
            this.f19911c.f20044a.f18540p = reviewedCartResponse2;
        } else {
            reviewedCart.cartId = String.valueOf(updateLocalCartRequestPayload.b().e());
            this.f19911c.f20044a.f18540p.mReviewedCart.mCouponCode = updateLocalCartRequestPayload.b().j();
            ReviewedCart reviewedCart3 = this.f19911c.f20044a.f18540p.mReviewedCart;
            reviewedCart3.mRestaurant = restaurant;
            reviewedCart3.discountMessage = updateLocalCartRequestPayload.b().h();
            ReviewedCart reviewedCart4 = this.f19911c.f20044a.f18540p.mReviewedCart;
            reviewedCart4.addressSortingWeight = addressSortingWeight;
            reviewedCart4.originalCartId = String.valueOf(updateLocalCartRequestPayload.b().m());
        }
        Boolean b11 = updateLocalCartRequestPayload.b().b();
        in.swiggy.android.repositories.cart.data.a aVar3 = this.f19911c.f20044a;
        aVar3.t = b11;
        aVar3.f18545x = updateLocalCartRequestPayload.b().r();
        this.f19911c.f20044a.f18547z = updateLocalCartRequestPayload.b().t();
        this.f19911c.f20044a.A = updateLocalCartRequestPayload.b().s();
        this.f19913e.a();
        this.q.t(this);
        return true;
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return d.b.d(this, iLynxViewUpdateHandler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        r13 = r13.f18540p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            r11 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r13 != r0) goto L_0x0073
            r3 = 297(0x129, float:4.16E-43)
            if (r12 != r3) goto L_0x0073
            if (r14 == 0) goto L_0x0073
            java.lang.String r12 = "superV2SelectedPlanId"
            java.lang.String r12 = r14.getStringExtra(r12)
            if (r12 == 0) goto L_0x014c
            java.lang.CharSequence r13 = kotlin.text.StringsKt__StringsKt.i1(r12)
            java.lang.String r13 = r13.toString()
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x0023
            r13 = 1
            goto L_0x0024
        L_0x0023:
            r13 = 0
        L_0x0024:
            if (r13 == 0) goto L_0x014c
            in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2ResponsePayload r7 = new in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2ResponsePayload
            r7.<init>(r12)
            int r12 = java.lang.Integer.parseInt(r12)
            android.content.SharedPreferences r13 = r11.f19917i
            android.content.SharedPreferences$Editor r13 = r13.edit()
            java.lang.String r14 = "isPlanAdded"
            android.content.SharedPreferences$Editor r13 = r13.putBoolean(r14, r1)
            r13.apply()
            android.content.SharedPreferences r13 = r11.f19917i
            android.content.SharedPreferences$Editor r13 = r13.edit()
            java.lang.String r14 = "planID"
            android.content.SharedPreferences$Editor r13 = r13.putInt(r14, r12)
            r13.apply()
            cf0.i r13 = r11.f19913e
            bf0.a r13 = r13.B()
            r13.I(r12)
            java.lang.String r4 = r11.t
            if (r4 != 0) goto L_0x005c
            goto L_0x014c
        L_0x005c:
            zp.b r3 = r11.g1()
            if (r3 != 0) goto L_0x0064
            goto L_0x014c
        L_0x0064:
            r5 = 0
            r6 = 0
            in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2ResponsePayload$Companion r12 = in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2ResponsePayload.Companion
            kotlinx.serialization.KSerializer r8 = r12.serializer()
            r9 = 6
            r10 = 0
            zp.b.a.a(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x014c
        L_0x0073:
            if (r13 != r0) goto L_0x00b4
            r3 = 146(0x92, float:2.05E-43)
            if (r12 != r3) goto L_0x00b4
            if (r14 == 0) goto L_0x00b4
            ug0.e r12 = r11.q
            android.os.Bundle r13 = r14.getExtras()
            in.swiggy.android.tejas.feature.address.model.Address r12 = r12.p(r13)
            in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload r7 = new in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload
            if (r12 != 0) goto L_0x008b
            r12 = r2
            goto L_0x008f
        L_0x008b:
            java.lang.String r12 = r12.getId()
        L_0x008f:
            if (r12 != 0) goto L_0x0093
            java.lang.String r12 = ""
        L_0x0093:
            r13 = 2
            r7.<init>((java.lang.String) r12, (in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext) r2, (int) r13, (kotlin.jvm.internal.i) r2)
            java.lang.String r4 = r11.t
            if (r4 != 0) goto L_0x009d
            goto L_0x014c
        L_0x009d:
            zp.b r3 = r11.g1()
            if (r3 != 0) goto L_0x00a5
            goto L_0x014c
        L_0x00a5:
            r5 = 0
            r6 = 0
            in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload$Companion r12 = in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload.Companion
            kotlinx.serialization.KSerializer r8 = r12.serializer()
            r9 = 6
            r10 = 0
            zp.b.a.a(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x014c
        L_0x00b4:
            if (r13 != r0) goto L_0x010d
            r13 = 291(0x123, float:4.08E-43)
            if (r12 != r13) goto L_0x010d
            if (r14 == 0) goto L_0x010d
            ug0.e r12 = r11.q
            android.os.Bundle r13 = r14.getExtras()
            java.lang.String r12 = r12.q(r13)
            in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponResponsePayload r7 = new in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponResponsePayload
            r7.<init>(r12)
            ef0.e r13 = r11.f19914f
            boolean r13 = r13.o0()
            if (r13 == 0) goto L_0x014c
            boolean r13 = r11.v
            if (r13 != 0) goto L_0x00f3
            ze0.a r13 = r11.f19911c
            in.swiggy.android.repositories.cart.data.a r13 = r13.f20044a
            if (r13 != 0) goto L_0x00df
        L_0x00dd:
            r13 = r2
            goto L_0x00e6
        L_0x00df:
            in.swiggy.android.tejas.oldapi.network.responses.ReviewedCartResponse r13 = r13.f18540p
            if (r13 != 0) goto L_0x00e4
            goto L_0x00dd
        L_0x00e4:
            in.swiggy.android.tejas.oldapi.models.cart.ReviewedCart r13 = r13.mReviewedCart
        L_0x00e6:
            if (r13 != 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r13.mCouponCode = r12
        L_0x00eb:
            lp0.a<bp0.k> r12 = r11.j
            r12.invoke()
            r11.v = r1
            goto L_0x014c
        L_0x00f3:
            java.lang.String r4 = r11.t
            if (r4 != 0) goto L_0x00f8
            goto L_0x014c
        L_0x00f8:
            zp.b r3 = r11.g1()
            if (r3 != 0) goto L_0x00ff
            goto L_0x014c
        L_0x00ff:
            r5 = 0
            r6 = 0
            in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponResponsePayload$Companion r12 = in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponResponsePayload.Companion
            kotlinx.serialization.KSerializer r8 = r12.serializer()
            r9 = 6
            r10 = 0
            zp.b.a.a(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x014c
        L_0x010d:
            r13 = 341(0x155, float:4.78E-43)
            if (r12 != r13) goto L_0x012d
            ze0.a r12 = r11.f19911c
            java.util.List r12 = r12.l()
            java.lang.String r13 = "cart.mealItemsInCart"
            kotlin.jvm.internal.p.i(r12, r13)
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r1
            if (r12 == 0) goto L_0x0127
            r11.p(r1)
            goto L_0x014c
        L_0x0127:
            lp0.a<bp0.k> r12 = r11.j
            r12.invoke()
            goto L_0x014c
        L_0x012d:
            java.lang.String r4 = r11.t
            if (r4 != 0) goto L_0x0132
            goto L_0x014c
        L_0x0132:
            zp.b r3 = r11.g1()
            if (r3 != 0) goto L_0x0139
            goto L_0x014c
        L_0x0139:
            r5 = 0
            r6 = 0
            r7 = 0
            gq0.l0 r8 = new gq0.l0
            mp.a r12 = mp.a.f53029a
            kotlinx.serialization.KSerializer r12 = r12.a()
            r8.<init>(r12)
            r9 = 2
            r10 = 0
            zp.b.a.a(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x014c:
            r11.t = r2
            r11.f19922r = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.c.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onNewIntent(Intent intent) {
        d.b.e(this, intent);
    }

    public void p(boolean z11) {
        this.q.o(this.f19910b);
    }

    @SuppressLint({"VisibleForTests"})
    public void s0(ApplyCouponRequestPayload applyCouponRequestPayload, String str, zp.b bVar) {
        p.j(applyCouponRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (!this.f19914f.o0()) {
            this.v = false;
        }
        this.f19922r = bVar;
        this.t = str;
        this.q.s(this.f19912d, 291, "cart", applyCouponRequestPayload.c(), applyCouponRequestPayload.b());
    }

    public void x(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, zp.b bVar) {
        p.j(openSuperV2RequestPayload, "openSuperV2RequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19922r = bVar;
        this.t = str;
        this.q.c(p.s(openSuperV2RequestPayload.b(), "&fromCart=true"), this.f19910b);
    }

    public void x0(GetLocalCartRequestPayload getLocalCartRequestPayload, String str, zp.b bVar) {
        p.j(getLocalCartRequestPayload, "getCartRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        int i11 = this.f19911c.f20044a.q;
        this.f19913e.b();
        this.f19911c.f20044a.q = i11;
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }
}
