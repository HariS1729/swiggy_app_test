package wh0;

import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import cg0.n;
import ef0.e;
import ef0.f;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload;
import in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.enums.LocationType;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.ServiceLineTypes;
import kotlin.Triple;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;

/* compiled from: LynxJSHelper.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f19962a = new l();

    /* compiled from: LynxJSHelper.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final GetSwiggyHeaderResponsePayload f19963a;

        public a(GetSwiggyHeaderResponsePayload getSwiggyHeaderResponsePayload) {
            p.j(getSwiggyHeaderResponsePayload, "swiggyHeaderResponsePayload");
            this.f19963a = getSwiggyHeaderResponsePayload;
        }

        @JavascriptInterface
        public final String getSwiggyHeaders() {
            return hq0.a.f23147b.c(GetSwiggyHeaderResponsePayload.Companion.serializer(), this.f19963a);
        }
    }

    /* compiled from: LynxJSHelper.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19964a = new b();

        /* compiled from: LynxJSHelper.kt */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f19965a;

            public a(String str) {
                p.j(str, PaymentConstants.PAYLOAD);
                this.f19965a = str;
            }

            @JavascriptInterface
            public final String getWebViewLastState() {
                return this.f19965a;
            }
        }

        private b() {
        }

        public final void a(SwiggyLynxWebView swiggyLynxWebView, String str) {
            p.j(str, "statePayload");
            if (swiggyLynxWebView != null) {
                swiggyLynxWebView.addJavascriptInterface(new a(str), "__webview_state__");
            }
        }
    }

    private l() {
    }

    private final Triple<String, String, Address> b(n nVar) {
        Address address;
        String R = nVar.R();
        String str = "";
        if (nVar.w() == LocationType.ADDRESS) {
            address = nVar.p0();
            if (address != null) {
                str = address.getId();
            }
        } else {
            address = null;
        }
        return new Triple<>(R, str, address);
    }

    private final String c(n nVar) {
        Location K = nVar.K();
        if (K == null) {
            return "0.0,0.0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.getLatitude());
        sb2.append(',');
        sb2.append(K.getLongitude());
        return sb2.toString();
    }

    private final String d() {
        String str = Build.MODEL;
        p.i(str, "model");
        String g11 = new Regex("\\s").g(str, "");
        p.i(g11, "model");
        return g11;
    }

    private final String e(String str, SharedPreferences sharedPreferences) {
        boolean z11 = false;
        if (!o.N(str, "https://payments-staging.swiggy.com", false, 2, (Object) null)) {
            return "";
        }
        String string = sharedPreferences.getString("payment-secret-key", "");
        if (string == null || o.A(string)) {
            z11 = true;
        }
        if (!z11) {
            return string;
        }
        return "";
    }

    private final String f(bf0.a aVar, n nVar) {
        if (aVar.getDeliveryAddress() != null) {
            return String.valueOf(aVar.getDeliveryAddress().getId());
        }
        String addressId = nVar.getAddressId();
        return addressId == null ? "" : addressId;
    }

    public final void a(String str, e eVar, ps.b bVar, n nVar, String str2, f fVar, SharedPreferences sharedPreferences, bf0.a aVar, SwiggyLynxWebView swiggyLynxWebView, os.a aVar2) {
        SwiggyLynxWebView swiggyLynxWebView2 = swiggyLynxWebView;
        p.j(str, "url");
        e eVar2 = eVar;
        p.j(eVar, LogSubCategory.Action.USER);
        ps.b bVar2 = bVar;
        p.j(bVar2, "contextService");
        n nVar2 = nVar;
        p.j(nVar2, "locationContext");
        String str3 = str2;
        p.j(str3, "webFlow");
        f fVar2 = fVar;
        p.j(fVar2, "xpExperimentContext");
        SharedPreferences sharedPreferences2 = sharedPreferences;
        p.j(sharedPreferences2, "sharedPreferences");
        bf0.a aVar3 = aVar;
        p.j(aVar3, "cart");
        os.a aVar4 = aVar2;
        p.j(aVar4, "appBuildDetails");
        GetSwiggyHeaderResponsePayload g11 = g(str, eVar, bVar2, nVar2, str3, fVar2, sharedPreferences2, aVar3, aVar4);
        g11.c(eVar.getTid());
        g11.b(eVar.getSessionId());
        g11.a(eVar.getDeviceId());
        if (swiggyLynxWebView2 != null) {
            swiggyLynxWebView2.addJavascriptInterface(new a(g11), "__native_headers__");
        }
    }

    public final GetSwiggyHeaderResponsePayload g(String str, e eVar, ps.b bVar, n nVar, String str2, f fVar, SharedPreferences sharedPreferences, bf0.a aVar, os.a aVar2) {
        GetSwiggyHeaderResponsePayload getSwiggyHeaderResponsePayload;
        String str3;
        String str4 = str;
        n nVar2 = nVar;
        f fVar2 = fVar;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        bf0.a aVar3 = aVar;
        p.j(str4, "url");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(bVar, "contextService");
        p.j(nVar2, "locationContext");
        p.j(str2, "webFlow");
        p.j(fVar2, "xpExperimentContext");
        p.j(sharedPreferences2, "sharedPreferences");
        p.j(aVar3, "cart");
        p.j(aVar2, "appBuildDetails");
        if (eVar.o0()) {
            String tid = eVar.getTid();
            String sessionId = eVar.getSessionId();
            String deviceId = eVar.getDeviceId();
            String customerId = eVar.getCustomerId();
            String c11 = c(nVar2);
            String token = eVar.getToken();
            p.i(token, "user.token");
            String valueOf = String.valueOf(aVar2.h());
            String swuid = eVar.getSwuid();
            p.i(swuid, "user.swuid");
            String valueOf2 = String.valueOf(nVar.F0());
            String str5 = Build.VERSION.RELEASE;
            p.i(str5, "RELEASE");
            String d11 = d();
            String f11 = f(aVar3, nVar2);
            String e11 = e(str4, sharedPreferences2);
            String d12 = b(nVar2).d();
            String e12 = b(nVar2).e();
            String valueOf3 = String.valueOf(nVar.getLatitude());
            String valueOf4 = String.valueOf(nVar.getLongitude());
            Address g11 = b(nVar2).g();
            String name = g11 == null ? null : g11.getName();
            Address g12 = b(nVar2).g();
            String contactNumber = g12 == null ? null : g12.getContactNumber();
            Address g13 = b(nVar2).g();
            getSwiggyHeaderResponsePayload = new GetSwiggyHeaderResponsePayload(tid, sessionId, deviceId, customerId, c11, token, valueOf, swuid, valueOf2, "Swiggy-Android", "an", "4.26.0", str5, d11, f11, "1", ServiceLineTypes.TYPE_FOOD, "Regular", "false", str2, e11, d12, e12, valueOf3, valueOf4, name, contactNumber, g13 == null ? null : g13.getAnnotationTagStringIdentifier(), String.valueOf(SwiggyLynxCorePlugin.Companion.b(fVar2, sharedPreferences2)), sharedPreferences2.getString("userAgent", ""), String.valueOf(bVar.i()));
        } else {
            String c12 = c(nVar2);
            String token2 = eVar.getToken();
            p.i(token2, "user.token");
            String valueOf5 = String.valueOf(aVar2.h());
            String swuid2 = eVar.getSwuid();
            p.i(swuid2, "user.swuid");
            String valueOf6 = String.valueOf(nVar.F0());
            String str6 = Build.VERSION.RELEASE;
            p.i(str6, "RELEASE");
            String d13 = d();
            String addressId = nVar.getAddressId();
            if (addressId == null) {
                str3 = "";
            } else {
                str3 = addressId;
            }
            getSwiggyHeaderResponsePayload = new GetSwiggyHeaderResponsePayload((String) null, (String) null, (String) null, (String) null, c12, token2, valueOf5, swuid2, valueOf6, "Swiggy-Android", "an", "4.26.0", str6, d13, str3, "1", ServiceLineTypes.TYPE_FOOD, "Regular", "false", str2, e(str4, sharedPreferences2), b(nVar2).d(), b(nVar2).e(), String.valueOf(nVar.getLatitude()), String.valueOf(nVar.getLongitude()), (String) null, (String) null, (String) null, String.valueOf(SwiggyLynxCorePlugin.Companion.b(fVar2, sharedPreferences2)), sharedPreferences2.getString("userAgent", ""), String.valueOf(bVar.i()));
        }
        return getSwiggyHeaderResponsePayload;
    }

    public final void h(SwiggyLynxWebView swiggyLynxWebView, boolean z11) {
        if (z11) {
            if (swiggyLynxWebView != null) {
                swiggyLynxWebView.evaluateJavascript("javascript: LOGIN_STATE_CHANGED(true)", (ValueCallback) null);
            }
        } else if (swiggyLynxWebView != null) {
            swiggyLynxWebView.evaluateJavascript("javascript: LOGIN_STATE_CHANGED(false)", (ValueCallback) null);
        }
    }
}
