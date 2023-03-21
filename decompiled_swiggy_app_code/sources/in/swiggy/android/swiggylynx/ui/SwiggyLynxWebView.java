package in.swiggy.android.swiggylynx.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.swiggy.lynx.view.LynxWebView;
import com.swiggy.lynx.webinterface.WebInterfaceUtility;
import hq0.f;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import os.u;
import p4.b;

/* compiled from: SwiggyLynxWebView.kt */
public final class SwiggyLynxWebView extends LynxWebView {
    public static final a Companion = new a((i) null);

    /* renamed from: h  reason: collision with root package name */
    private jr.a f19554h;

    /* compiled from: SwiggyLynxWebView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        private final String b(String str) {
            return new Regex("([\\n\\r])").g(str, "");
        }

        public final Map<String, String> a(Map<String, String> map) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    a aVar = SwiggyLynxWebView.Companion;
                    String b11 = aVar.b((String) next.getKey());
                    if (next.getValue() != null) {
                        hashMap.put(b11, aVar.b((String) next.getValue()));
                    }
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwiggyLynxWebView(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
    }

    public static final Map<String, String> s(Map<String, String> map) {
        return Companion.a(map);
    }

    private final void u(String str) {
        String str2;
        JsonElement jsonElement;
        JsonPrimitive l11;
        WebInterfaceUtility webInterfaceUtility = WebInterfaceUtility.f52050a;
        JsonObject jsonObject = (JsonObject) b.c(webInterfaceUtility.a(str), SwiggyLynxWebView$logRequestNR$jsonObject$1.f19555a);
        String str3 = null;
        if (jsonObject == null) {
            str2 = null;
        } else {
            str2 = (String) b.c(webInterfaceUtility.c(jsonObject), SwiggyLynxWebView$logRequestNR$requestId$1$1.f19556a);
        }
        if (!(jsonObject == null || (jsonElement = (JsonElement) jsonObject.get("type")) == null || (l11 = f.l(jsonElement)) == null)) {
            str3 = l11.f();
        }
        if (str2 != null && str3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("request_id", str2);
            hashMap.put("request_type", str3);
            jr.a aVar = this.f19554h;
            if (aVar != null) {
                aVar.a("payment_web_native_bridge_request", hashMap);
            }
        }
    }

    private final void v(String str, int i11, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("status_code", Integer.valueOf(i11));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("status_message", str2);
        jr.a aVar = this.f19554h;
        if (aVar != null) {
            aVar.a("payment_web_native_bridge_response", hashMap);
        }
    }

    public <T> void a(String str, int i11, String str2, T t, KSerializer<T> kSerializer) {
        p.j(str, "requestId");
        p.j(kSerializer, "payloadStrategy");
        v(str, i11, str2);
        super.a(str, i11, str2, t, kSerializer);
    }

    public void addJavascriptInterface(Object obj, String str) {
        p.j(obj, "object");
        p.j(str, "name");
        super.addJavascriptInterface(obj, str);
    }

    public void b(String str) {
        p.j(str, "requestJson");
        u(str);
        u.b("SwiggyLynxWebView", str);
        super.b(str);
    }

    public <T> void c(String str, int i11, String str2, T t, KSerializer<T> kSerializer) {
        p.j(str, "requestId");
        p.j(kSerializer, "payloadStrategy");
        v(str, i11, str2);
        super.c(str, i11, str2, t, kSerializer);
    }

    public final jr.a getNewrelicPerformanceUtils() {
        return this.f19554h;
    }

    public void k() {
        try {
            super.k();
            WebView.setWebContentsDebuggingEnabled(false);
            if (Build.VERSION.SDK_INT >= 29) {
                getSettings().setForceDark(0);
            }
            j3.b.a(getContext().getApplicationContext()).edit().putString("userAgent", getSettings().getUserAgentString()).apply();
        } catch (Exception e11) {
            u.h("SwiggyLynxWebView", e11);
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        p.j(str, "url");
        p.j(map, "additionalHttpHeaders");
        super.loadUrl(str, Companion.a(map));
    }

    public void postUrl(String str, byte[] bArr) {
        p.j(str, "url");
        p.j(bArr, PaymentConstants.POST_DATA);
        super.postUrl(str, bArr);
    }

    public final void r() {
        super.k();
    }

    public final void setNewrelicPerformanceUtils(jr.a aVar) {
        this.f19554h = aVar;
    }

    public void setOverScrollMode(int i11) {
        try {
            super.setOverScrollMode(i11);
        } catch (Exception e11) {
            u.h("SwiggyLynxWebView", e11);
        }
    }

    public final void t(SharedPreferences sharedPreferences) {
        p.j(sharedPreferences, "sharedPreferences");
        if (p.e(sharedPreferences.getString("system_font_disable", "false"), "true")) {
            getSettings().setTextZoom(100);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwiggyLynxWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.j(context, LogCategory.CONTEXT);
    }
}
