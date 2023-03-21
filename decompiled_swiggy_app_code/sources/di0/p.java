package di0;

import in.swiggy.android.swiggylynx.model.PaymentType;
import in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView;
import java.util.HashMap;
import jr.a;

/* compiled from: NewRelicEventLogger.kt */
public final class p {
    private static final void a(a aVar, String str, int i11, int i12, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_code", Integer.valueOf(i11));
        hashMap.put("result_code", Integer.valueOf(i12));
        hashMap.put("source", str2);
        aVar.a(str, hashMap);
    }

    public static final void b(a aVar, SwiggyLynxWebView swiggyLynxWebView, int i11, int i12, String str) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        kotlin.jvm.internal.p.j(str, "source");
        if (swiggyLynxWebView != null) {
            a(aVar, "web_cart_activity_result", i11, i12, str);
        } else {
            a(aVar, "web_cart_killed", i11, i12, str);
        }
    }

    public static final void c(a aVar, pg0.a aVar2, String str) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        kotlin.jvm.internal.p.j(aVar2, "stateManager");
        kotlin.jvm.internal.p.j(str, "source");
        HashMap hashMap = new HashMap();
        a d11 = aVar2.d();
        int i11 = -999;
        hashMap.put("request_code", Integer.valueOf(d11 == null ? -999 : d11.a()));
        a d12 = aVar2.d();
        if (d12 != null) {
            i11 = d12.b();
        }
        hashMap.put("result_code", Integer.valueOf(i11));
        hashMap.put("source", str);
        PaymentType paymentType = aVar2.getPaymentType();
        String identifier = paymentType == null ? null : paymentType.getIdentifier();
        if (identifier == null) {
            identifier = "";
        }
        hashMap.put("payment_method", identifier);
        aVar.a("web_cart_refresh_handle", hashMap);
    }
}
