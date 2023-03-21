package jh0;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import com.phonepe.intent.sdk.api.TransactionRequest;
import com.phonepe.intent.sdk.api.TransactionRequestBuilder;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.isphonepeavailable.IsPhonePeAvailableResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe.PhonePeMakePaymentRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe.PhonePeMakePaymentResponsePayload;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import jh0.a;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mb0.n1;
import os.u;
import wh0.d;
import zp.b;

/* compiled from: PhonePePlugin.kt */
public class b implements a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final d f19632b;

    /* renamed from: c  reason: collision with root package name */
    private final jr.a f19633c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f19634d;

    /* renamed from: e  reason: collision with root package name */
    private final n1 f19635e;

    /* renamed from: f  reason: collision with root package name */
    private zp.b f19636f;

    /* renamed from: g  reason: collision with root package name */
    private String f19637g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f19638h = "";

    /* compiled from: PhonePePlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(d dVar, jr.a aVar, boolean z11, n1 n1Var) {
        p.j(dVar, "lynxViewComponent");
        p.j(aVar, "newrelicPerformanceUtils");
        this.f19632b = dVar;
        this.f19633c = aVar;
        this.f19634d = z11;
        this.f19635e = n1Var;
    }

    private final void X0(Exception exc) {
        u.b("PhonePePlugin", exc.getMessage());
        HashMap hashMap = new HashMap();
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        hashMap.put(PushMessageHelper.ERROR_MESSAGE, message);
        hashMap.put("payment_platform", "web");
        this.f19633c.b("phone_pe_init_error", hashMap);
        u.h("PhonePePlugin", exc);
        Z0();
    }

    private final void Y0(PhonePePreRequisites phonePePreRequisites) {
        TransactionRequest transactionRequest;
        Intent intent = null;
        u.b("PhonePePlugin", p.s("data -> ", phonePePreRequisites == null ? null : phonePePreRequisites.e()));
        if (phonePePreRequisites != null) {
            HashMap hashMap = new HashMap();
            String e11 = phonePePreRequisites.e();
            if (e11 == null) {
                e11 = "";
            }
            hashMap.put("X-CALLBACK-URL", e11);
            hashMap.put("X-CALLBACK-MODE", HttpRequest.METHOD_POST);
            try {
                transactionRequest = new TransactionRequestBuilder().setData(String.valueOf(phonePePreRequisites.b())).setChecksum(String.valueOf(phonePePreRequisites.c())).setUrl(String.valueOf(phonePePreRequisites.a())).setHeaders(hashMap).build();
            } catch (Exception e12) {
                X0(e12);
                transactionRequest = null;
            }
            if (transactionRequest != null) {
                try {
                    if (c.h(phonePePreRequisites.f())) {
                        Context N0 = this.f19632b.N0();
                        if (N0 != null) {
                            String d11 = phonePePreRequisites.d();
                            if (d11 != null) {
                                intent = PhonePe.getImplicitIntent(N0, transactionRequest, d11);
                            }
                        }
                    } else {
                        intent = PhonePe.getTransactionIntent(transactionRequest);
                    }
                    if (this.f19634d) {
                        if (intent != null) {
                            n1 c11 = c();
                            if (c11 != null) {
                                c11.G(intent, 977);
                            }
                        }
                    } else if (intent != null) {
                        p().startActivityForResult(intent, 977);
                    }
                } catch (PhonePeInitException e13) {
                    X0(e13);
                }
            }
        } else {
            zp.b bVar = this.f19636f;
            if (bVar != null) {
                String str = this.f19638h;
                mp.a aVar = mp.a.f53029a;
                bVar.c(str, 1, "empty phonepe requisite data", aVar, aVar.a());
            }
        }
    }

    private final void Z0() {
        zp.b bVar = this.f19636f;
        if (bVar != null) {
            bVar.a(this.f19638h, RNCWebViewManager.COMMAND_CLEAR_HISTORY, (String) null, new PhonePeMakePaymentResponsePayload("FAILURE", this.f19637g), PhonePeMakePaymentResponsePayload.Companion.serializer());
        }
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void N(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, "isUpiAvailableRequestPayload");
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        b.a.a(bVar2, str, 0, (String) null, new IsPhonePeAvailableResponsePayload(true), IsPhonePeAvailableResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    /* renamed from: W0 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public final n1 c() {
        return this.f19635e;
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
        return a.b.e(this, webResourceRequest, dVar);
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        zp.b bVar;
        if (i11 == 977 && (bVar = this.f19636f) != null) {
            b.a.a(bVar, this.f19638h, 0, (String) null, new PhonePeMakePaymentResponsePayload("SUCCESS", this.f19637g), PhonePeMakePaymentResponsePayload.Companion.serializer(), 2, (Object) null);
        }
    }

    public void onNewIntent(Intent intent) {
        a.b.f(this, intent);
    }

    public final d p() {
        return this.f19632b;
    }

    public void z0(PhonePeMakePaymentRequestPayload phonePeMakePaymentRequestPayload, String str, zp.b bVar) {
        p.j(phonePeMakePaymentRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19636f = bVar;
        this.f19638h = str;
        this.f19637g = phonePeMakePaymentRequestPayload.b();
        Y0(phonePeMakePaymentRequestPayload.c());
    }
}
