package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin;

import ae0.b;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.appcompat.app.AppCompatActivity;
import bp0.k;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import di0.q;
import fr.e;
import gh0.a;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PaymentPendingRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.walletplugin.WalletPlugin;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.order.legacy.model.PaymentMethodData;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCart;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.ServiceLineTypes;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jz.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import os.g0;
import os.u;
import us.f;
import wh0.d;
import zp.b;

@Instrumented
/* compiled from: PaymentCorePlugin.kt */
public final class PaymentCorePlugin implements gh0.a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final AppCompatActivity f19272b;

    /* renamed from: c  reason: collision with root package name */
    private String f19273c;

    /* renamed from: d  reason: collision with root package name */
    private final bf0.a f19274d;

    /* renamed from: e  reason: collision with root package name */
    private final eo0.a f19275e;

    /* renamed from: f  reason: collision with root package name */
    private final e f19276f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedPreferences f19277g;

    /* renamed from: h  reason: collision with root package name */
    private final jr.a f19278h;

    /* renamed from: i  reason: collision with root package name */
    private final f f19279i;
    private final l<Intent, k> j;
    private final boolean k;

    /* renamed from: l  reason: collision with root package name */
    private final c f19280l;

    /* renamed from: m  reason: collision with root package name */
    private final d f19281m;
    private final wd0.e n;

    /* renamed from: o  reason: collision with root package name */
    private final ky.a f19282o;

    /* renamed from: p  reason: collision with root package name */
    private String f19283p;
    private final ef0.e q;

    /* compiled from: PaymentCorePlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class b extends TypeToken<PaymentMethodData> {
    }

    public PaymentCorePlugin(AppCompatActivity appCompatActivity, String str, bf0.a aVar, eo0.a aVar2, e eVar, SharedPreferences sharedPreferences, jr.a aVar3, f fVar, l<? super Intent, k> lVar, boolean z11, c cVar, d dVar, wd0.e eVar2, ky.a aVar4, String str2, ef0.e eVar3) {
        bf0.a aVar5 = aVar;
        eo0.a aVar6 = aVar2;
        e eVar4 = eVar;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        jr.a aVar7 = aVar3;
        c cVar2 = cVar;
        d dVar2 = dVar;
        wd0.e eVar5 = eVar2;
        String str3 = str2;
        ef0.e eVar6 = eVar3;
        p.j(appCompatActivity, "activity");
        p.j(aVar5, "cart");
        p.j(aVar6, "subscriptions");
        p.j(eVar4, "mSwiggyEventLogger");
        p.j(sharedPreferences2, "appSharedPreferences");
        p.j(aVar7, "newrelicPerformanceUtils");
        p.j(cVar2, "deepLinkHandler");
        p.j(dVar2, "lynxViewComponent");
        p.j(eVar5, "oneClickService");
        p.j(str3, "initialUrl");
        p.j(eVar6, LogSubCategory.Action.USER);
        this.f19272b = appCompatActivity;
        this.f19273c = str;
        this.f19274d = aVar5;
        this.f19275e = aVar6;
        this.f19276f = eVar4;
        this.f19277g = sharedPreferences2;
        this.f19278h = aVar7;
        this.f19279i = fVar;
        this.j = lVar;
        this.k = z11;
        this.f19280l = cVar2;
        this.f19281m = dVar2;
        this.n = eVar5;
        this.f19282o = aVar4;
        this.f19283p = str3;
        this.q = eVar6;
    }

    private final void c1(OrderFailedRequestPayload orderFailedRequestPayload) {
        String str;
        String str2;
        String c11;
        String e11;
        Object obj = null;
        String valueOf = String.valueOf(orderFailedRequestPayload == null ? null : orderFailedRequestPayload.d());
        try {
            Gson j11 = g0.j();
            p.i(j11, "getGsonBinaryBooleanSerializer()");
            Type type = new b().getType();
            obj = !(j11 instanceof Gson) ? j11.fromJson(valueOf, type) : GsonInstrumentation.fromJson(j11, valueOf, type);
        } catch (Throwable th2) {
            u.h("Extension", th2);
        }
        PaymentMethodData paymentMethodData = (PaymentMethodData) obj;
        HashMap hashMap = new HashMap();
        String str3 = "NULL";
        if (orderFailedRequestPayload == null || (str = orderFailedRequestPayload.b()) == null) {
            str = str3;
        }
        hashMap.put("Error Text", str);
        if (paymentMethodData == null || (str2 = paymentMethodData.getPaymentCode()) == null) {
            str2 = str3;
        }
        hashMap.put("Payment Method", str2);
        String str4 = "0.0";
        if (!(orderFailedRequestPayload == null || (e11 = orderFailedRequestPayload.e()) == null)) {
            str4 = e11;
        }
        hashMap.put("Total Bill Paid", str4);
        if (!(orderFailedRequestPayload == null || (c11 = orderFailedRequestPayload.c()) == null)) {
            str3 = c11;
        }
        hashMap.put("Order ID", str3);
        this.f19276f.J(hashMap, "Food Order Payment Failed");
    }

    private final void d1(WebResourceRequest webResourceRequest, zp.d dVar, boolean z11) {
        CharSequence charSequence;
        Uri uri;
        Map<String, String> map;
        Map<String, String> requestHeaders;
        String str = null;
        u.b("PaymentCorePlugin", String.valueOf(dVar == null ? null : dVar.a()));
        HashMap hashMap = new HashMap();
        String str2 = "";
        if (dVar == null || (charSequence = dVar.a()) == null) {
            charSequence = str2;
        }
        hashMap.put("web_payment_switched_to_native_flow_error_message", charSequence);
        if (webResourceRequest == null) {
            uri = null;
        } else {
            uri = webResourceRequest.getUrl();
        }
        hashMap.put("web_payment_switched_to_native_url", String.valueOf(uri));
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
            hashMap.put("web_payment_switched_to_native_referer", str2);
        }
        if (z11) {
            this.f19278h.b("web_payment_switched_to_native_flow", hashMap);
        } else {
            this.f19278h.b("web_payment_switched_to_native_flow_false_alarm", hashMap);
        }
    }

    static /* synthetic */ void e1(PaymentCorePlugin paymentCorePlugin, WebResourceRequest webResourceRequest, zp.d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        paymentCorePlugin.d1(webResourceRequest, dVar, z11);
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void H0(PostOrderRequestPayload postOrderRequestPayload, String str, zp.b bVar) {
        p.j(postOrderRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (o.x(this.f19273c, ServiceLineTypes.TYPE_DASH, true)) {
            this.f19277g.edit().putBoolean("fire_launch_api_after_order_placed", true).apply();
            this.f19277g.edit().putBoolean("log_dash_order_confirmed", true).apply();
            X0();
        }
        if (q.f18281a.b(postOrderRequestPayload)) {
            this.n.a(b.c.f78510d);
        }
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    public void S0(OrderFailedRequestPayload orderFailedRequestPayload, String str, zp.b bVar) {
        p.j(orderFailedRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        c1(orderFailedRequestPayload);
        X0();
        if (q.f18281a.a(orderFailedRequestPayload)) {
            this.n.a(b.c.f78510d);
        }
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r6.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W0(ih0.b r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
        L_0x0003:
            r1 = 0
            goto L_0x0010
        L_0x0005:
            java.util.List r1 = r6.a()
            if (r1 != 0) goto L_0x000c
            goto L_0x0003
        L_0x000c:
            int r1 = r1.size()
        L_0x0010:
            if (r1 <= 0) goto L_0x004e
            r1 = 0
            if (r6 != 0) goto L_0x0018
        L_0x0016:
            r3 = r1
            goto L_0x003a
        L_0x0018:
            java.util.List r6 = r6.a()
            if (r6 != 0) goto L_0x001f
            goto L_0x0016
        L_0x001f:
            java.lang.Object r6 = r6.get(r0)
            ih0.a r6 = (ih0.a) r6
            if (r6 != 0) goto L_0x0028
            goto L_0x0016
        L_0x0028:
            ih0.a$a r6 = r6.a()
            if (r6 != 0) goto L_0x002f
            goto L_0x0016
        L_0x002f:
            java.lang.Long r6 = r6.c()
            if (r6 != 0) goto L_0x0036
            goto L_0x0016
        L_0x0036:
            long r3 = r6.longValue()
        L_0x003a:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x004e
            android.content.SharedPreferences r6 = r5.f19277g
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r0 = 1
            java.lang.String r1 = "refresh_home_after_super_payment"
            android.content.SharedPreferences$Editor r6 = r6.putBoolean(r1, r0)
            r6.apply()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.PaymentCorePlugin.W0(ih0.b):void");
    }

    public final void X0() {
        this.f19277g.edit().remove("last_order_category").remove("payment_pending").remove("last_order_business_line").apply();
    }

    public final AppCompatActivity Y0() {
        return this.f19272b;
    }

    public final bf0.a Z0() {
        return this.f19274d;
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

    public final d a1() {
        return this.f19281m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload r27, java.lang.String r28, zp.b r29) {
        /*
            r26 = this;
            r0 = r26
            java.lang.String r1 = "payload"
            r2 = r27
            kotlin.jvm.internal.p.j(r2, r1)
            java.lang.String r1 = "requestId"
            r3 = r28
            kotlin.jvm.internal.p.j(r3, r1)
            java.lang.String r1 = "responseHandler"
            r4 = r29
            kotlin.jvm.internal.p.j(r4, r1)
            r26.X0()
            android.content.SharedPreferences r1 = r0.f19277g
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r5 = "fire_launch_api_after_order_placed"
            r6 = 1
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r5, r6)
            r1.apply()
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            kotlinx.serialization.json.JsonObject r1 = r27.d()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "trackOrderJson"
            r9.putExtra(r5, r1)
            java.lang.String r1 = r0.f19273c
            java.lang.String r5 = "source"
            r9.putExtra(r5, r1)
            java.lang.String r1 = "launchScreen"
            java.lang.String r5 = "payment"
            r9.putExtra(r1, r5)
            com.google.gson.Gson r1 = os.g0.i()
            kotlinx.serialization.json.JsonObject r5 = r27.d()
            java.lang.String r5 = r5.toString()
            java.lang.Class<ih0.b> r7 = ih0.b.class
            boolean r8 = r1 instanceof com.google.gson.Gson
            if (r8 != 0) goto L_0x0061
            java.lang.Object r1 = r1.fromJson((java.lang.String) r5, r7)
            goto L_0x0065
        L_0x0061:
            java.lang.Object r1 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r1, (java.lang.String) r5, r7)
        L_0x0065:
            ih0.b r1 = (ih0.b) r1
            java.util.List r5 = r1.a()
            r7 = 0
            if (r5 != 0) goto L_0x0070
        L_0x006e:
            r5 = 0
            goto L_0x0078
        L_0x0070:
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r6
            if (r5 != r6) goto L_0x006e
            r5 = 1
        L_0x0078:
            java.lang.String r8 = ""
            if (r5 == 0) goto L_0x009d
            java.util.List r5 = r1.a()
            java.lang.Object r5 = r5.get(r7)
            ih0.a r5 = (ih0.a) r5
            ih0.a$a r5 = r5.a()
            if (r5 != 0) goto L_0x008d
            goto L_0x009d
        L_0x008d:
            in.swiggy.android.tejas.feature.search.models.network.response.suggestions.SearchSuggestionResponseItem$Cta r5 = r5.b()
            if (r5 != 0) goto L_0x0094
            goto L_0x009d
        L_0x0094:
            java.lang.String r5 = r5.getLink()
            if (r5 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r11 = r5
            goto L_0x009e
        L_0x009d:
            r11 = r8
        L_0x009e:
            java.lang.String r5 = r1.b()
            java.lang.String r10 = "SUBSCRIPTION"
            boolean r5 = kotlin.text.o.x(r5, r10, r6)
            r15 = 0
            if (r5 == 0) goto L_0x00d9
            fr.e r5 = r0.f19276f
            java.util.List r12 = r1.a()
            if (r12 != 0) goto L_0x00b5
        L_0x00b3:
            r12 = r15
            goto L_0x00c9
        L_0x00b5:
            java.lang.Object r12 = r12.get(r7)
            ih0.a r12 = (ih0.a) r12
            if (r12 != 0) goto L_0x00be
            goto L_0x00b3
        L_0x00be:
            ih0.a$a r12 = r12.a()
            if (r12 != 0) goto L_0x00c5
            goto L_0x00b3
        L_0x00c5:
            java.lang.Long r12 = r12.c()
        L_0x00c9:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            ef0.e r13 = r0.q
            java.lang.String r13 = r13.x2()
            if (r13 != 0) goto L_0x00d6
            r13 = r8
        L_0x00d6:
            r5.E(r12, r13)
        L_0x00d9:
            r0.W0(r1)
            boolean r5 = r0.k
            if (r5 == 0) goto L_0x00eb
            lp0.l<android.content.Intent, bp0.k> r1 = r0.j
            if (r1 != 0) goto L_0x00e6
            goto L_0x022e
        L_0x00e6:
            r1.invoke(r9)
            goto L_0x022e
        L_0x00eb:
            java.lang.String r5 = r1.b()
            boolean r5 = kotlin.text.o.x(r5, r10, r6)
            r14 = -1
            if (r5 == 0) goto L_0x0166
            int r5 = r11.length()
            if (r5 <= 0) goto L_0x00fe
            r5 = 1
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            if (r5 == 0) goto L_0x0166
            androidx.appcompat.app.AppCompatActivity r1 = r0.f19272b
            kotlinx.serialization.json.JsonObject r2 = r27.d()
            java.lang.String r20 = r2.toString()
            java.lang.String r2 = r0.f19273c
            if (r2 != 0) goto L_0x0112
            r22 = r8
            goto L_0x0114
        L_0x0112:
            r22 = r2
        L_0x0114:
            in.swiggy.android.swiggylynx.ui.LynxData r2 = new in.swiggy.android.swiggylynx.ui.LynxData
            r12 = 0
            r13 = 0
            r5 = 0
            r6 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            r10 = r2
            r7 = -1
            r14 = r5
            r5 = r15
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            int r6 = r2.getRequestCode()
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<in.swiggy.android.swiggylynx.ui.LynxActivity> r9 = in.swiggy.android.swiggylynx.ui.LynxActivity.class
            r8.<init>(r1, r9)
            wh0.j r9 = new wh0.j
            r18 = 0
            r19 = 0
            r24 = 6
            r25 = 0
            java.lang.String r21 = "payment"
            java.lang.String r23 = ""
            r16 = r9
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.os.Bundle r2 = r9.h()
            r8.putExtras(r2)
            r2 = -9
            if (r6 != r2) goto L_0x0157
            r1.startActivity(r8, r5)
            goto L_0x015a
        L_0x0157:
            r1.startActivityForResult(r8, r6, r5)
        L_0x015a:
            androidx.appcompat.app.AppCompatActivity r1 = r0.f19272b
            r1.setResult(r7)
            wh0.d r1 = r0.f19281m
            r1.x0()
            goto L_0x022e
        L_0x0166:
            r5 = -1
            java.lang.String r11 = r1.b()
            boolean r10 = kotlin.text.o.x(r11, r10, r6)
            if (r10 == 0) goto L_0x01f8
            java.util.List r10 = r1.a()
            if (r10 != 0) goto L_0x0179
        L_0x0177:
            r10 = 0
            goto L_0x01a4
        L_0x0179:
            java.lang.Object r10 = r10.get(r7)
            ih0.a r10 = (ih0.a) r10
            if (r10 != 0) goto L_0x0182
            goto L_0x0177
        L_0x0182:
            ih0.a$a r10 = r10.a()
            if (r10 != 0) goto L_0x0189
            goto L_0x0177
        L_0x0189:
            in.swiggy.android.tejas.feature.search.models.network.response.suggestions.SearchSuggestionResponseItem$Cta r10 = r10.a()
            if (r10 != 0) goto L_0x0190
            goto L_0x0177
        L_0x0190:
            java.lang.String r10 = r10.getLink()
            if (r10 != 0) goto L_0x0197
            goto L_0x0177
        L_0x0197:
            int r10 = r10.length()
            if (r10 != 0) goto L_0x019f
            r10 = 1
            goto L_0x01a0
        L_0x019f:
            r10 = 0
        L_0x01a0:
            r10 = r10 ^ r6
            if (r10 != r6) goto L_0x0177
            r10 = 1
        L_0x01a4:
            if (r10 == 0) goto L_0x01f8
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r2 = "refreshLandingPage"
            r12.putExtra(r2, r6)
            java.lang.String r2 = "android.intent.action.VIEW"
            r12.setAction(r2)
            java.util.List r1 = r1.a()
            if (r1 != 0) goto L_0x01bc
            goto L_0x01db
        L_0x01bc:
            java.lang.Object r1 = r1.get(r7)
            ih0.a r1 = (ih0.a) r1
            if (r1 != 0) goto L_0x01c5
            goto L_0x01db
        L_0x01c5:
            ih0.a$a r1 = r1.a()
            if (r1 != 0) goto L_0x01cc
            goto L_0x01db
        L_0x01cc:
            in.swiggy.android.tejas.feature.search.models.network.response.suggestions.SearchSuggestionResponseItem$Cta r1 = r1.a()
            if (r1 != 0) goto L_0x01d3
            goto L_0x01db
        L_0x01d3:
            java.lang.String r1 = r1.getLink()
            if (r1 != 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r8 = r1
        L_0x01db:
            android.net.Uri r1 = android.net.Uri.parse(r8)
            r12.setData(r1)
            r1 = 603979776(0x24000000, float:2.7755576E-17)
            r12.addFlags(r1)
            jz.c r11 = r0.f19280l
            androidx.appcompat.app.AppCompatActivity r13 = r0.f19272b
            r14 = 0
            r15 = 4
            r16 = 0
            jz.c.a.a(r11, r12, r13, r14, r15, r16)
            wh0.d r1 = r0.f19281m
            r1.x0()
            goto L_0x022e
        L_0x01f8:
            java.lang.String r1 = r0.f19273c
            java.lang.String r7 = "DASH"
            boolean r1 = kotlin.text.o.x(r1, r7, r6)
            if (r1 == 0) goto L_0x0224
            ky.a r7 = r0.f19282o
            if (r7 != 0) goto L_0x0207
            goto L_0x022e
        L_0x0207:
            androidx.appcompat.app.AppCompatActivity r8 = r26.Y0()
            in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.PaymentCorePlugin$processPostOrderEventRequest$3$1 r10 = new in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.PaymentCorePlugin$processPostOrderEventRequest$3$1
            wh0.d r1 = r26.a1()
            r10.<init>(r1)
            kotlinx.serialization.json.JsonObject r11 = r27.d()
            java.lang.String r12 = r27.b()
            java.lang.Boolean r13 = r27.c()
            r7.a(r8, r9, r10, r11, r12, r13)
            goto L_0x022e
        L_0x0224:
            androidx.appcompat.app.AppCompatActivity r1 = r0.f19272b
            r1.setResult(r5, r9)
            wh0.d r1 = r0.f19281m
            r1.x0()
        L_0x022e:
            r1 = 0
            r5 = 0
            mp.a r6 = mp.a.f53029a
            kotlinx.serialization.KSerializer r7 = r6.a()
            r8 = 2
            r9 = 0
            r2 = r29
            r3 = r28
            r4 = r1
            zp.b.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.PaymentCorePlugin.b(in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload, java.lang.String, zp.b):void");
    }

    /* renamed from: b1 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public boolean c() {
        return true;
    }

    public void c0(lp.b bVar, String str, zp.b bVar2) {
        Integer estimatedSla;
        lp.b bVar3 = bVar;
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        if (this.f19274d.B() != null) {
            ReviewedCart B = this.f19274d.B();
            if (B != null) {
                Restaurant restaurant = B.mRestaurant;
                p.i(restaurant, "it.mRestaurant");
                int A = Z0().A();
                Address deliveryAddress = Z0().getDeliveryAddress();
                int i11 = 0;
                if (!(deliveryAddress == null || (estimatedSla = deliveryAddress.getEstimatedSla()) == null)) {
                    i11 = estimatedSla.intValue();
                }
                Integer valueOf = Integer.valueOf(i11);
                Address deliveryAddress2 = Z0().getDeliveryAddress();
                b.a.a(bVar2, str, 0, (String) null, new GetCheckoutInfoResponsePayload(restaurant, A, valueOf, deliveryAddress2 == null ? null : deliveryAddress2.getSlaMessageString(), Z0().getDeliveryAddress(), B.mCouponCode, B.discountMessage, Z0().c0()), GetCheckoutInfoResponsePayload.Companion.serializer(), 6, (Object) null);
                return;
            }
            return;
        }
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public final void f1(String str) {
        p.j(str, "businessLine");
        this.f19277g.edit().putString("last_order_business_line", str).apply();
    }

    public final void g1(String str) {
        p.j(str, "category");
        this.f19277g.edit().putString("last_order_category", str).apply();
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
        Uri uri;
        String str = this.f19273c;
        if (str == null || !p.e(str, "payment")) {
            return false;
        }
        if (webResourceRequest == null) {
            uri = null;
        } else {
            uri = webResourceRequest.getUrl();
        }
        if (o.N(String.valueOf(uri), this.f19283p, false, 2, (Object) null)) {
            e1(this, webResourceRequest, dVar, false, 4, (Object) null);
            p(true);
            return true;
        }
        d1(webResourceRequest, dVar, false);
        return false;
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        a.b.e(this, i11, i12, intent);
    }

    public void onNewIntent(Intent intent) {
        a.b.f(this, intent);
    }

    public void p(boolean z11) {
        Intent intent = new Intent();
        intent.putExtra("switchToNative", true);
        intent.putExtra("switchToNative_automatic", z11);
        this.f19272b.setResult(0, intent);
        this.f19281m.x0();
    }

    public void r0(PaymentPendingRequestPayload paymentPendingRequestPayload, String str, zp.b bVar) {
        p.j(paymentPendingRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        Gson i11 = g0.i();
        String json = !(i11 instanceof Gson) ? i11.toJson((Object) paymentPendingRequestPayload) : GsonInstrumentation.toJson(i11, (Object) paymentPendingRequestPayload);
        p.i(json, "getGson().toJson(payload)");
        this.f19277g.edit().putString("payment_pending", json).apply();
        g1(paymentPendingRequestPayload.c());
        f1(paymentPendingRequestPayload.b());
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    public void u0(SendLinkAccountStatusRequestPayload sendLinkAccountStatusRequestPayload, String str, zp.b bVar) {
        p.j(sendLinkAccountStatusRequestPayload, "sendLinkAccountStatusRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        String b11 = sendLinkAccountStatusRequestPayload.b();
        if (b11 != null && p.e(sendLinkAccountStatusRequestPayload.d(), "ACCOUNTS")) {
            Intent putExtra = new Intent().putExtra("response", new WalletPlugin.Companion.ActivityResponseData("link-wallet", sendLinkAccountStatusRequestPayload.c(), b11));
            p.i(putExtra, "Intent().putExtra(Wallet…in.PORTAL_RESPONSE, data)");
            Y0().setResult(-1, putExtra);
            Y0().finish();
        }
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentCorePlugin(AppCompatActivity appCompatActivity, String str, bf0.a aVar, eo0.a aVar2, e eVar, SharedPreferences sharedPreferences, jr.a aVar3, f fVar, l lVar, boolean z11, c cVar, d dVar, wd0.e eVar2, ky.a aVar4, String str2, ef0.e eVar3, int i11, i iVar) {
        this(appCompatActivity, str, aVar, aVar2, eVar, sharedPreferences, aVar3, fVar, lVar, z11, cVar, dVar, eVar2, (i11 & 8192) != 0 ? null : aVar4, str2, eVar3);
    }
}
