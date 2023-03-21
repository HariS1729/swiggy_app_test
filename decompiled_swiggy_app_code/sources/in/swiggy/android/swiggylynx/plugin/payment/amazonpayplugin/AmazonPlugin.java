package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin;

import amazonpay.silentpay.APayError;
import amazonpay.silentpay.ProcessChargeResponse;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.WebResourceRequest;
import bh0.a;
import ch0.c;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import hq0.k;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.CheckChargeStatusData;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.PayUsingAmazonRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.ProceedToPayData;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata.AmazonPayAvailableResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata.GetWalletBalanceResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata.PayUsingWalletResponsePayload;
import in.swiggy.android.tejas.feature.payment.AmazonPaymentMeta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import zp.b;
import zp.d;

/* compiled from: AmazonPlugin.kt */
public final class AmazonPlugin implements bh0.a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final ch0.a f19161b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f19162c;

    /* renamed from: d  reason: collision with root package name */
    private final jr.a f19163d;

    /* renamed from: e  reason: collision with root package name */
    private String f19164e;

    /* renamed from: f  reason: collision with root package name */
    private zp.b f19165f;

    /* renamed from: g  reason: collision with root package name */
    private String f19166g;

    /* renamed from: h  reason: collision with root package name */
    private final hq0.a f19167h = k.b((hq0.a) null, AmazonPlugin$json$1.f19170a, 1, (Object) null);

    /* compiled from: AmazonPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a(Intent intent) {
            p.j(intent, "intent");
            try {
                if (!intent.getBooleanExtra("amazonPayProcessChargeResponse", false)) {
                    return null;
                }
                ProcessChargeResponse e11 = ProcessChargeResponse.e(intent);
                if (e11 == null) {
                    return null;
                }
                return e11.f();
            } catch (Exception e12) {
                u.h("AmazonPlugin", e12);
                return null;
            }
        }
    }

    /* compiled from: AmazonPlugin.kt */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zp.b f19168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19169b;

        b(zp.b bVar, String str) {
            this.f19168a = bVar;
            this.f19169b = str;
        }

        public void a(String str) {
            b.a.a(this.f19168a, this.f19169b, 0, (String) null, new GetWalletBalanceResponsePayload((Float) null, false), GetWalletBalanceResponsePayload.Companion.serializer(), 2, (Object) null);
        }

        public void onSuccess(String str) {
            b.a.a(this.f19168a, this.f19169b, 0, (String) null, new GetWalletBalanceResponsePayload(str == null ? null : Float.valueOf(Float.parseFloat(str)), true), GetWalletBalanceResponsePayload.Companion.serializer(), 2, (Object) null);
        }
    }

    public AmazonPlugin(ch0.a aVar, SharedPreferences sharedPreferences, jr.a aVar2) {
        p.j(aVar, "amazonPayUtility");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(aVar2, "newrelicPerformanceUtils");
        this.f19161b = aVar;
        this.f19162c = sharedPreferences;
        this.f19163d = aVar2;
    }

    private final void X0(String str, Map<String, String> map) {
        this.f19163d.b(str, map);
    }

    private final void Y0(String str, zp.b bVar) {
        if (this.f19162c.getBoolean("amazonPayLinked", false)) {
            this.f19161b.n(new b(bVar, str));
            return;
        }
        b.a.a(bVar, str, 0, (String) null, new GetWalletBalanceResponsePayload((Float) null, false), GetWalletBalanceResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    /* renamed from: W0 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public final void Z0(PayUsingAmazonRequestPayload payUsingAmazonRequestPayload, String str, zp.b bVar) {
        p.j(payUsingAmazonRequestPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (payUsingAmazonRequestPayload.b() != null) {
            CheckChargeStatusData checkChargeStatusData = (CheckChargeStatusData) p().d(CheckChargeStatusData.Companion.serializer(), payUsingAmazonRequestPayload.b());
            c().p(new AmazonPaymentMeta(checkChargeStatusData.c(), checkChargeStatusData.a(), checkChargeStatusData.b(), 0, 8, (i) null), new AmazonPlugin$processCheckChargeStatus$1$1(bVar, str), new AmazonPlugin$processCheckChargeStatus$1$2(bVar, str));
        }
    }

    public final void a1(String str, zp.b bVar) {
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        Y0(str, bVar);
    }

    public final void b1(String str, zp.b bVar) {
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        b.a.a(bVar, str, 0, (String) null, new AmazonPayAvailableResponsePayload(p.e("true", this.f19162c.getString("android_enable_amazon_sdk", "true"))), AmazonPayAvailableResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    public final ch0.a c() {
        return this.f19161b;
    }

    public final void c1(String str, zp.b bVar) {
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19165f = bVar;
        this.f19166g = str;
        this.f19161b.o();
    }

    public final void d1(PayUsingAmazonRequestPayload payUsingAmazonRequestPayload, String str, zp.b bVar) {
        p.j(payUsingAmazonRequestPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (payUsingAmazonRequestPayload.b() != null) {
            ProceedToPayData proceedToPayData = (ProceedToPayData) p().d(ProceedToPayData.Companion.serializer(), payUsingAmazonRequestPayload.b());
            e1(proceedToPayData.b().c());
            g1(bVar);
            f1(str);
            c().l(new AmazonPaymentMeta(proceedToPayData.b().d(), proceedToPayData.b().a(), proceedToPayData.b().b(), 0, 8, (i) null));
        }
    }

    public final void e1(String str) {
        this.f19164e = str;
    }

    public final void f1(String str) {
        this.f19166g = str;
    }

    public final void g1(zp.b bVar) {
        this.f19165f = bVar;
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        return a.b.e(this, webResourceRequest, dVar);
    }

    public void m(PayUsingAmazonRequestPayload payUsingAmazonRequestPayload, String str, zp.b bVar) {
        p.j(payUsingAmazonRequestPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        try {
            String c11 = payUsingAmazonRequestPayload.c();
            switch (c11.hashCode()) {
                case -1304064034:
                    if (c11.equals("LINK_WALLET")) {
                        c1(str, bVar);
                        return;
                    }
                    return;
                case -296881771:
                    if (c11.equals("PROCEED_TO_PAY")) {
                        d1(payUsingAmazonRequestPayload, str, bVar);
                        return;
                    }
                    return;
                case -25132858:
                    if (c11.equals("CHECK_CHARGE_STATUS")) {
                        Z0(payUsingAmazonRequestPayload, str, bVar);
                        return;
                    }
                    return;
                case 1372471742:
                    if (c11.equals("IS_AMAZON_SDK_AVAILABLE")) {
                        b1(str, bVar);
                        return;
                    }
                    return;
                case 1825644211:
                    if (c11.equals("GET_BALANCE")) {
                        a1(str, bVar);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            mp.a aVar = mp.a.f53029a;
            bVar.c(str, 1, message, aVar, aVar.a());
        }
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 888) {
            APayError b11 = APayError.b(intent);
            if (b11 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                APayError.ErrorType c11 = b11.c();
                if (c11 != null) {
                    linkedHashMap.put("amazonpay_error_type_linking", c11.name());
                }
                String message = b11.getMessage();
                if (message != null) {
                    linkedHashMap.put("amazonpay_error_message_linking", message);
                }
                X0("amazonpay_error_linking_event", linkedHashMap);
            }
            String str = this.f19166g;
            zp.b bVar = this.f19165f;
            if (str != null && bVar != null) {
                this.f19162c.edit().putBoolean("amazonPayLinked", true).apply();
                Y0(str, bVar);
            }
        }
    }

    public void onNewIntent(Intent intent) {
        p.j(intent, "intent");
        boolean booleanExtra = intent.getBooleanExtra("amazonPayProcessChargeResponse", false);
        String str = this.f19164e;
        String str2 = this.f19166g;
        zp.b bVar = this.f19165f;
        if (booleanExtra && str != null && str2 != null && bVar != null) {
            ProcessChargeResponse e11 = ProcessChargeResponse.e(intent);
            if (e11 == null || e11.f() == null) {
                mp.a aVar = mp.a.f53029a;
                bVar.a(str2, 2001, (String) null, aVar, aVar.a());
                return;
            }
            String f11 = e11.f();
            p.i(f11, "amazonPayProcessChargeResponse.transactionId");
            b.a.a(bVar, str2, 0, (String) null, new PayUsingWalletResponsePayload("SUCCESS", str, f11), PayUsingWalletResponsePayload.Companion.serializer(), 2, (Object) null);
            this.f19164e = null;
            this.f19165f = null;
            this.f19166g = null;
        }
    }

    public final hq0.a p() {
        return this.f19167h;
    }
}
