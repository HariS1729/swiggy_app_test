package in.swiggy.android.swiggylynx.plugin.dash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import cg0.n;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import fr.e;
import hq0.k;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.dash.imageImport.ImageImportFragment;
import in.swiggy.android.dash.web.kyc.KYCFlowHelper;
import in.swiggy.android.payment.CartObject;
import in.swiggy.android.payment.PaymentSource;
import in.swiggy.android.payment.SwiggyPaymentActivity;
import in.swiggy.android.swiggylynx.R;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2RequestPayload;
import in.swiggy.android.swiggylynx.plugin.dash.currentaddress.CurrentAddressPayload;
import in.swiggy.android.swiggylynx.plugin.dash.imageupload.ImageUploadPayload;
import in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload;
import in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartUpdateLocalCartPayload;
import in.swiggy.android.swiggylynx.plugin.dash.kyc.KycInitPayload;
import in.swiggy.android.swiggylynx.plugin.dash.payment.DashPaymentPayload;
import in.swiggy.android.swiggylynx.plugin.dash.trackevent.TrackEventPayload;
import in.swiggy.android.tejas.feature.instamart.model.GetIMCartResponse;
import in.swiggy.android.tejas.feature.timeline.model.Destination;
import in.swiggy.android.tejas.payment.model.payment.response.Callout;
import in.swiggy.android.tejas.payment.model.payment.response.Callouts;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.g0;
import os.u;
import us.f;
import ut.q;
import xd0.j;
import xg0.a;
import zp.b;
import zp.d;

@Instrumented
/* compiled from: DashPlugin.kt */
public class DashPlugin implements xg0.a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final FragmentActivity f19078b;

    /* renamed from: c  reason: collision with root package name */
    private final ILynxViewUpdateHandler f19079c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedPreferences f19080d;

    /* renamed from: e  reason: collision with root package name */
    private final e f19081e;

    /* renamed from: f  reason: collision with root package name */
    private final f f19082f;

    /* renamed from: g  reason: collision with root package name */
    private final n f19083g;

    /* renamed from: h  reason: collision with root package name */
    private final ef0.e f19084h;

    /* renamed from: i  reason: collision with root package name */
    private final eo0.a f19085i;
    private final og0.a j;
    private final String k;

    /* renamed from: l  reason: collision with root package name */
    private final jr.a f19086l;

    /* renamed from: m  reason: collision with root package name */
    private final cf0.i f19087m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private zp.b f19088o;

    /* renamed from: p  reason: collision with root package name */
    private final hq0.a f19089p = k.b((hq0.a) null, DashPlugin$json$1.f19090a, 1, (Object) null);

    /* compiled from: DashPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: DashPlugin.kt */
    public static final class b extends TypeToken<List<? extends Callout>> {
        b() {
        }
    }

    public DashPlugin(FragmentActivity fragmentActivity, ILynxViewUpdateHandler iLynxViewUpdateHandler, SharedPreferences sharedPreferences, e eVar, f fVar, n nVar, ef0.e eVar2, eo0.a aVar, og0.a aVar2, String str, jr.a aVar3, cf0.i iVar) {
        p.j(fragmentActivity, "activity");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        p.j(sharedPreferences, "appSharedPreferences");
        p.j(eVar, "swiggyEventLogger");
        p.j(nVar, "locationContext");
        p.j(eVar2, LogSubCategory.Action.USER);
        p.j(aVar, "subscriptions");
        p.j(aVar2, "defaultHeaders");
        p.j(str, "url");
        p.j(aVar3, "newrelicPerformanceUtils");
        p.j(iVar, "cartService");
        this.f19078b = fragmentActivity;
        this.f19079c = iLynxViewUpdateHandler;
        this.f19080d = sharedPreferences;
        this.f19081e = eVar;
        this.f19082f = fVar;
        this.f19083g = nVar;
        this.f19084h = eVar2;
        this.f19085i = aVar;
        this.j = aVar2;
        this.k = str;
        this.f19086l = aVar3;
        this.f19087m = iVar;
    }

    private final void d1(String str) {
        String e11 = mh0.a.f19753a.e(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(e11));
        this.f19078b.startActivity(intent);
    }

    private final void e1(d dVar) {
        CharSequence a11;
        u.b("DashPlugin", String.valueOf(dVar == null ? null : dVar.a()));
        HashMap hashMap = new HashMap();
        CharSequence charSequence = "";
        if (!(dVar == null || (a11 = dVar.a()) == null)) {
            charSequence = a11;
        }
        hashMap.put("web_payment_switched_to_old_DashWebView", charSequence);
        this.f19086l.b("web_payment_switched_to_old_dash_flow", hashMap);
    }

    /* access modifiers changed from: private */
    public final Callouts f1(String str) {
        try {
            Type type = new b().getType();
            Gson i11 = g0.i();
            List list = (List) (!(i11 instanceof Gson) ? i11.fromJson(str, type) : GsonInstrumentation.fromJson(i11, str, type));
            p.i(list, "object : TypeToken<List<…tsJson, it)\n            }");
            return new Callouts(list);
        } catch (Exception e11) {
            u.h("callout_parse_failed", e11);
            return null;
        }
    }

    public void A(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        bf0.b instamartCart = this.f19087m.getInstamartCart();
        InstamartGetLocalCartPayload instamartGetLocalCartPayload = new InstamartGetLocalCartPayload(instamartCart.d(), instamartCart.p(), instamartCart.getCouponCode(), instamartCart.i(), instamartCart.s(), instamartCart.t(), instamartCart.r(), instamartCart.j());
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_payload", this.f19089p.c(lp.b.Companion.a(), bVar));
        hq0.a aVar = this.f19089p;
        InstamartGetLocalCartPayload.Companion companion = InstamartGetLocalCartPayload.Companion;
        hashMap.put("response_payload", aVar.c(companion.serializer(), instamartGetLocalCartPayload));
        this.f19086l.a("im_get_local_cart_nr_event", hashMap);
        b.a.a(bVar2, str, 0, (String) null, instamartGetLocalCartPayload, companion.serializer(), 6, (Object) null);
    }

    public void B(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, zp.b bVar) {
        p.j(addNewAddressRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.n = str;
        this.f19088o = bVar;
        f fVar = this.f19082f;
        if (fVar != null) {
            fVar.s(this.f19078b, addNewAddressRequestPayload.c());
        }
    }

    public void C(InstamartUpdateLocalCartPayload instamartUpdateLocalCartPayload, String str, zp.b bVar) {
        p.j(instamartUpdateLocalCartPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19080d.edit().putBoolean("IM_SHOULD_NOT_MAKE_API_CALL", true).apply();
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_payload", this.f19089p.c(InstamartUpdateLocalCartPayload.Companion.serializer(), instamartUpdateLocalCartPayload));
        this.f19086l.a("im_update_local_cart_nr_event", hashMap);
        bf0.b instamartCart = this.f19087m.getInstamartCart();
        GetIMCartResponse b11 = instamartUpdateLocalCartPayload.b();
        instamartCart.h(b11 == null ? null : b11.getData());
        this.f19087m.d();
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void I0(ImageUploadPayload imageUploadPayload, String str, zp.b bVar) {
        p.j(imageUploadPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        q.f53911a.b(R.id.webContainer, this.f19078b, new DashPlugin$processGoogleImageUpload$1(imageUploadPayload, str, bVar, this), ImageImportFragment.f60967l.c());
    }

    public void J(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_payload", this.f19089p.c(lp.b.Companion.a(), bVar));
        this.f19086l.a("im_clear_local_cart_nr_event", hashMap);
        this.f19087m.getInstamartCart().b();
        this.f19087m.d();
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public void N0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        b.a.a(bVar2, str, 0, (String) null, new CurrentAddressPayload(String.valueOf(this.f19083g.F0())), CurrentAddressPayload.Companion.serializer(), 6, (Object) null);
    }

    public void W(TrackEventPayload trackEventPayload, String str, zp.b bVar) {
        p.j(trackEventPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        ms.f.n(new DashPlugin$processTrackEvent$1(trackEventPayload, this));
    }

    public final FragmentActivity X0() {
        return this.f19078b;
    }

    /* access modifiers changed from: protected */
    public final CartObject Y0(String str) {
        p.j(str, "serviceLine");
        String customerId = this.f19084h.getCustomerId();
        p.i(customerId, "user.customerId");
        String D0 = this.f19084h.D0();
        p.i(D0, "user.email");
        String phoneNumber = this.f19084h.getPhoneNumber();
        p.i(phoneNumber, "user.phoneNumber");
        CartObject cartObject = new CartObject(0.0d, 0.0d, Destination.TYPE_STORE, (String) null, 0, (String) null, (String) null, customerId, D0, phoneNumber);
        cartObject.J(j.f82472a.f());
        cartObject.M(Destination.TYPE_STORE);
        cartObject.O(str);
        return cartObject;
    }

    public final f Z0() {
        return this.f19082f;
    }

    public final zp.b a1() {
        return this.f19088o;
    }

    /* renamed from: b1 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void c1(String str, String str2, Callouts callouts) {
        p.j(str, "paymentLinkId");
        p.j(str2, "serviceLine");
        String str3 = str;
        SwiggyPaymentActivity.k.t(this.f19078b, 4, str3, false, PaymentSource.GENERIC, Y0(str2), callouts, str2);
    }

    public final void g1(String str) {
        this.n = str;
    }

    public void h() {
        a.b.a(this);
    }

    public final void h1(zp.b bVar) {
        this.f19088o = bVar;
    }

    public void i(KycInitPayload kycInitPayload, String str, zp.b bVar) {
        p.j(kycInitPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.n = str;
        this.f19088o = bVar;
        new KYCFlowHelper(this.f19078b, "", "", (WebView) null, kycInitPayload.b(), this.f19080d, this.f19084h).b0(this.n, this.f19088o);
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        e1(dVar);
        p(true);
        return false;
    }

    public void k(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, zp.b bVar) {
        p.j(openSuperV2RequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.n = str;
        this.f19088o = bVar;
        f fVar = this.f19082f;
        if (fVar != null) {
            fVar.d(this.f19078b, openSuperV2RequestPayload.b());
        }
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Bundle] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            if (r12 != r0) goto L_0x0019
            r2 = 297(0x129, float:4.16E-43)
            if (r11 != r2) goto L_0x0019
            java.lang.String r11 = r10.n
            zp.b r12 = r10.f19088o
            if (r13 != 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            android.os.Bundle r1 = r13.getExtras()
        L_0x0013:
            in.swiggy.android.swiggylynx.plugin.dash.DashPlugin$onActivityResult$1 r13 = in.swiggy.android.swiggylynx.plugin.dash.DashPlugin$onActivityResult$1.f19095a
            js.c.n(r11, r12, r1, r13)
            goto L_0x005d
        L_0x0019:
            r2 = 4
            if (r11 != r2) goto L_0x002c
            if (r13 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            java.lang.String r11 = "orderJobId"
            java.lang.String r1 = r13.getStringExtra(r11)
        L_0x0025:
            if (r1 != 0) goto L_0x0028
            goto L_0x005d
        L_0x0028:
            r10.d1(r1)
            goto L_0x005d
        L_0x002c:
            if (r12 != r0) goto L_0x005d
            r12 = 146(0x92, float:2.05E-43)
            if (r11 != r12) goto L_0x005d
            if (r13 == 0) goto L_0x005d
            us.f r11 = r10.f19082f
            if (r11 != 0) goto L_0x003a
            r11 = r1
            goto L_0x003e
        L_0x003a:
            java.lang.String r11 = r11.k(r13)
        L_0x003e:
            in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload r6 = new in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload
            r12 = 2
            r6.<init>((java.lang.String) r11, (in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext) r1, (int) r12, (kotlin.jvm.internal.i) r1)
            java.lang.String r3 = r10.n
            if (r3 != 0) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            zp.b r2 = r10.a1()
            if (r2 != 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            r4 = 0
            r5 = 0
            in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload$Companion r11 = in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload.Companion
            kotlinx.serialization.KSerializer r7 = r11.serializer()
            r8 = 6
            r9 = 0
            zp.b.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.dash.DashPlugin.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onNewIntent(Intent intent) {
        a.b.e(this, intent);
    }

    public void p(boolean z11) {
    }

    public void s(ImageUploadPayload imageUploadPayload, String str, zp.b bVar) {
        p.j(imageUploadPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        q.f53911a.b(R.id.webContainer, this.f19078b, new DashPlugin$processImageUpload$1(imageUploadPayload, str, bVar, this), ImageImportFragment.f60967l.c());
    }

    public void v0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        try {
            DashPaymentPayload dashPaymentPayload = (DashPaymentPayload) bVar;
            ms.f.n(new DashPlugin$makeDashPayment$1(this, bVar, dashPaymentPayload.c(), dashPaymentPayload.d()));
        } catch (Exception e11) {
            String message = e11.getMessage();
            mp.a aVar = mp.a.f53029a;
            bVar2.c(str, 1, message, aVar, aVar.a());
        }
    }
}
