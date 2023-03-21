package eh0;

import ae0.b;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.WebResourceRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import eh0.a;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.payment.utility.placeorder.PlaceOrderUtility;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.isjuspayavailable.IsJuspayAvailableResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickVSCRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaywalletinit.InitJuspayWalletRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayActionTypesKt;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayEligibilityRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayListWalletRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.g0;
import os.u;
import wd0.e;
import zp.b;
import zp.d;

@Instrumented
/* compiled from: JuspayPlugin.kt */
public final class f implements a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f18302b;

    /* renamed from: c  reason: collision with root package name */
    private final JuspaySdkWrapper f18303c;

    /* renamed from: d  reason: collision with root package name */
    private final eo0.a f18304d;

    /* renamed from: e  reason: collision with root package name */
    private final e f18305e;

    /* compiled from: JuspayPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: JuspayPlugin.kt */
    public static final class b extends TypeToken<Map<String, ? extends Boolean>> {
        b() {
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class c extends TypeToken<JuspayEligibilityResponsePayload> {
    }

    public f(SharedPreferences sharedPreferences, JuspaySdkWrapper juspaySdkWrapper, eo0.a aVar, e eVar) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(juspaySdkWrapper, "juspaySdkWrapper");
        p.j(aVar, "subscriptions");
        p.j(eVar, "oneClickService");
        this.f18302b = sharedPreferences;
        this.f18303c = juspaySdkWrapper;
        this.f18304d = aVar;
        this.f18305e = eVar;
    }

    private final Map<String, Boolean> Y0() {
        boolean z11;
        String string = this.f18302b.getString("payment_config", "{\n        \"credEnabled\":false,\n        \"cardEnabled\": false,\n        \"netBankingEnabled\":false,\n        \"nativeUpiEnabled\":false\n    }");
        if (string == null) {
            string = "";
        }
        Type type = new b().getType();
        p.i(type, "object : TypeToken<Map<String, Boolean>>() {}.type");
        try {
            Gson i11 = g0.i();
            Object fromJson = !(i11 instanceof Gson) ? i11.fromJson(string, type) : GsonInstrumentation.fromJson(i11, string, type);
            p.i(fromJson, "getGson().fromJson<Map<S…>(paymentConfig, mapType)");
            Map map = (Map) fromJson;
            LinkedHashMap linkedHashMap = new LinkedHashMap(w.b(map.size()));
            for (Object next : map.entrySet()) {
                Object key = ((Map.Entry) next).getKey();
                try {
                    z11 = ((Boolean) ((Map.Entry) next).getValue()).booleanValue();
                } catch (Exception e11) {
                    u.h("JuspayPlugin", e11);
                    z11 = false;
                }
                linkedHashMap.put(key, Boolean.valueOf(z11));
            }
            return linkedHashMap;
        } catch (Exception e12) {
            u.h("JuspayPlugin", e12);
            return new HashMap();
        }
    }

    private final void a1(String str, String str2, String str3, String str4) {
        if (str4 == null || str4.length() == 0) {
            this.f18303c.B(str, str2, str3);
        } else {
            JuspaySdkWrapper.I(this.f18303c, str, str2, str3, false, str4, 8, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean b1(Boolean bool) {
        p.j(bool, "isTrue");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void c1(f fVar, Boolean bool) {
        p.j(fVar, "this$0");
        fVar.f18305e.a(new b.a(true));
    }

    /* access modifiers changed from: private */
    public static final boolean d1(Boolean bool) {
        p.j(bool, "isTrue");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void e1(f fVar, Boolean bool) {
        p.j(fVar, "this$0");
        fVar.f18305e.a(new b.a(true));
    }

    public void E(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(juspayMakePaymentRequestPayload, "juspayMakePaymentRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18303c.C(juspayMakePaymentRequestPayload.b(), str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public void G(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(juspayMakePaymentRequestPayload, "juspayMakePaymentRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18303c.E(juspayMakePaymentRequestPayload.b(), str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.b(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void O0(lp.b bVar, String str, zp.b bVar2) {
        JuspayEligibilityResponsePayload juspayEligibilityResponsePayload;
        Object obj;
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        String string = this.f18302b.getString("juspay_eligibility_cached", "");
        if (!(string == null || o.A(string))) {
            try {
                Gson j = g0.j();
                p.i(j, "getGsonBinaryBooleanSerializer()");
                Type type = new c().getType();
                obj = !(j instanceof Gson) ? j.fromJson(string, type) : GsonInstrumentation.fromJson(j, string, type);
            } catch (Throwable th2) {
                u.h("Extension", th2);
                obj = null;
            }
            juspayEligibilityResponsePayload = (JuspayEligibilityResponsePayload) obj;
            if (juspayEligibilityResponsePayload == null) {
                juspayEligibilityResponsePayload = new JuspayEligibilityResponsePayload(false, (String) null, (String) null);
            }
        } else {
            juspayEligibilityResponsePayload = new JuspayEligibilityResponsePayload(false, (String) null, (String) null);
        }
        b.a.a(bVar2, str, 0, (String) null, juspayEligibilityResponsePayload, JuspayEligibilityResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    public void U(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(juspayMakePaymentRequestPayload, "juspayMakePaymentRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18303c.G(juspayMakePaymentRequestPayload.b(), str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public void V(JustpayInitRequestPayload justpayInitRequestPayload, String str, zp.b bVar) {
        p.j(justpayInitRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        a1(justpayInitRequestPayload.d(), justpayInitRequestPayload.c(), str, justpayInitRequestPayload.b());
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    public void Z(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        b.a.a(bVar2, str, 0, (String) null, new IsJuspayAvailableResponsePayload(p.e("true", this.f18302b.getString("android_enable_juspay_sdk", "true")), Y0()), IsJuspayAvailableResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    /* renamed from: Z0 */
    public ArrayList<np.b> T() {
        return a.b.a(this);
    }

    public void b0(InitJuspayWalletRequestPayload initJuspayWalletRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(initJuspayWalletRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18303c.J(new JuspayListWalletRequest(new JuspayListWalletRequest.Payload((String) null, initJuspayWalletRequestPayload.b(), false, 5, (i) null)));
    }

    public void h() {
        this.f18303c.V();
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        return a.b.c(this, webResourceRequest, dVar);
    }

    public void l0(OneClickVSCRequestPayload oneClickVSCRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(oneClickVSCRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18304d.c(this.f18303c.j().z(e.f55722a).g0(new c(this)));
        this.f18303c.e(oneClickVSCRequestPayload, str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        return this.f18303c.O();
    }

    public void n0(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(juspayMakePaymentRequestPayload, "juspayMakePaymentRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18303c.D(juspayMakePaymentRequestPayload.b(), str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        a.b.d(this, i11, i12, intent);
    }

    public void onNewIntent(Intent intent) {
        a.b.e(this, intent);
    }

    public void q(OneClickEligibilityRequestPayload oneClickEligibilityRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        ArrayList arrayList;
        p.j(oneClickEligibilityRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        List<CardDetail> c11 = oneClickEligibilityRequestPayload.c();
        if (c11 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(l.u(c11, 10));
            for (CardDetail cardDetail : c11) {
                arrayList2.add(new JuspayEligibilityRequest.Payload.CardsData.CardDetail(cardDetail.a(), cardDetail.b(), cardDetail.c()));
            }
            arrayList = arrayList2;
        }
        JuspayEligibilityRequest.Payload.CardsData cardsData = new JuspayEligibilityRequest.Payload.CardsData(arrayList);
        String b11 = oneClickEligibilityRequestPayload.b();
        if (b11 == null) {
            b11 = "";
        }
        this.f18303c.f(new JuspayEligibilityRequest(new JuspayEligibilityRequest.Payload(JuspayActionTypesKt.ELIGIBILITY, "", b11, cardsData)), str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public void t(lp.b bVar, String str, zp.b bVar2, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18305e.a(new b.a(false, 1, (i) null));
    }

    public void w(JuspayEligibilityRequestPayload juspayEligibilityRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(juspayEligibilityRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        List d11 = j.d(PlaceOrderUtility.D.a());
        JuspayEligibilityRequest.Payload.AppsData.PaymentMethods.Udf udf = new JuspayEligibilityRequest.Payload.AppsData.PaymentMethods.Udf(false, false, false, true, 7, (i) null);
        Object[] array = d11.toArray(new String[0]);
        p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array2 = j.d(new JuspayEligibilityRequest.Payload.AppsData.PaymentMethods((String[]) array, (String) null, udf, 2, (i) null)).toArray(new JuspayEligibilityRequest.Payload.AppsData.PaymentMethods[0]);
        p.h(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f18303c.f(new JuspayEligibilityRequest(new JuspayEligibilityRequest.Payload(JuspayActionTypesKt.ELIGIBILITY, juspayEligibilityRequestPayload.c(), juspayEligibilityRequestPayload.b(), new JuspayEligibilityRequest.Payload.AppsData((JuspayEligibilityRequest.Payload.AppsData.PaymentMethods[]) array2))), str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }

    public void y(OneClickVSCRequestPayload oneClickVSCRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(oneClickVSCRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        this.f18304d.c(this.f18303c.h().z(d.f55721a).g0(new b(this)));
        this.f18303c.d(oneClickVSCRequestPayload, str, new fh0.a(iLynxViewUpdateHandler, bVar));
    }
}
