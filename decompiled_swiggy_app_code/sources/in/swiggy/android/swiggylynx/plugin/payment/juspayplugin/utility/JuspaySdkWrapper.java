package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility;

import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import bp0.h;
import bp0.k;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.reactnativecommunity.webview.RNCWebViewManager;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import in.swiggy.android.payment.utility.PaymentUtils;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickVSCRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickVSCResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentResponsePayload;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayActionTypesKt;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayCardTxnRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayCredWalletTxnRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayEligibilityRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayInitRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayInitWithClientAuthTokenRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayListWalletRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayNetBankingRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayTxnRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayVSCRequest;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayWalletTxnRequest;
import in.swiggy.android.tejas.payment.model.juspay.response.JuspayBaseResponse;
import in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse;
import in.swiggy.android.tejas.payment.model.juspay.response.JuspayListWalletResponse;
import in.swiggy.android.tejas.payment.model.juspay.response.JuspayTransactionResponse;
import in.swiggy.android.tejas.payment.model.juspay.response.JuspayWalletDelinkResponse;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import io.reactivex.processors.BehaviorProcessor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import org.json.JSONArray;
import org.json.JSONObject;
import os.g0;
import os.o;
import os.u;
import zp.b;

@Instrumented
/* compiled from: JuspaySdkWrapper.kt */
public class JuspaySdkWrapper {
    public static final a Companion = new a((i) null);

    /* renamed from: z  reason: collision with root package name */
    private static final List<String> f19245z = k.m("AUTHORIZATION_FAILED", "AUTHENTICATION_FAILED", "JUSPAY_DECLINED");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f19246a;

    /* renamed from: b  reason: collision with root package name */
    private final ef0.e f19247b;

    /* renamed from: c  reason: collision with root package name */
    private final jr.a f19248c;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f19249d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19250e;

    /* renamed from: f  reason: collision with root package name */
    private JSONArray f19251f = new JSONArray();

    /* renamed from: g  reason: collision with root package name */
    private final bp0.f f19252g = b.b(new JuspaySdkWrapper$juspayPaymentService$2(this));

    /* renamed from: h  reason: collision with root package name */
    private final bp0.f f19253h = b.b(new JuspaySdkWrapper$geekStatsPrefs$2(this));

    /* renamed from: i  reason: collision with root package name */
    private String f19254i = "";
    private String j = "";
    private String k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f19255l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f19256m = "";
    private in.swiggy.android.swiggylynx.model.b n;

    /* renamed from: o  reason: collision with root package name */
    private in.swiggy.android.swiggylynx.model.b f19257o;

    /* renamed from: p  reason: collision with root package name */
    private in.swiggy.android.swiggylynx.model.b f19258p;
    private in.swiggy.android.swiggylynx.model.b q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19259r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<String, String> f19260s = new LinkedHashMap();
    private final BehaviorProcessor<List<JuspayListWalletResponse.Payload.Data>> t;

    /* renamed from: u  reason: collision with root package name */
    private final BehaviorProcessor<Boolean> f19261u;
    private final BehaviorProcessor<Boolean> v;

    /* renamed from: w  reason: collision with root package name */
    private final BehaviorProcessor<Boolean> f19262w;

    /* renamed from: x  reason: collision with root package name */
    private fh0.a f19263x;

    /* renamed from: y  reason: collision with root package name */
    private final HashMap<String, fh0.a> f19264y;

    /* compiled from: JuspaySdkWrapper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class b extends TypeToken<JuspayWalletDelinkResponse> {
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class c extends TypeToken<JuspayEligibilityResponse> {
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class d extends TypeToken<JuspayListWalletResponse> {
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class e extends TypeToken<JuspayTransactionResponse> {
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class f extends TypeToken<JuspayTransactionResponse> {
    }

    /* compiled from: JuspaySdkWrapper.kt */
    public static final class g extends HyperPaymentsCallbackAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JuspaySdkWrapper f19269a;

        g(JuspaySdkWrapper juspaySdkWrapper) {
            this.f19269a = juspaySdkWrapper;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[Catch:{ Exception -> 0x00c6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0089 A[Catch:{ Exception -> 0x00c6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ Exception -> 0x00c6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x009c A[Catch:{ Exception -> 0x00c6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2 A[Catch:{ Exception -> 0x00c6 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onEvent(org.json.JSONObject r5, in.juspay.hypersdk.data.JuspayResponseHandler r6) {
            /*
                r4 = this;
                java.lang.String r6 = "payload"
                if (r5 == 0) goto L_0x00f2
                java.lang.String r0 = "event"
                java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r1 = "process_result"
                boolean r0 = kotlin.jvm.internal.p.e(r0, r1)     // Catch:{ Exception -> 0x00c6 }
                if (r0 == 0) goto L_0x00f2
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r0 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                r0.M(r5)     // Catch:{ Exception -> 0x00c6 }
                org.json.JSONObject r0 = r5.optJSONObject(r6)     // Catch:{ Exception -> 0x00c6 }
                r1 = 0
                if (r0 != 0) goto L_0x0020
            L_0x001e:
                r0 = r1
                goto L_0x002d
            L_0x0020:
                org.json.JSONObject r0 = r0.optJSONObject(r6)     // Catch:{ Exception -> 0x00c6 }
                if (r0 != 0) goto L_0x0027
                goto L_0x001e
            L_0x0027:
                java.lang.String r2 = "action"
                java.lang.String r0 = r0.optString(r2)     // Catch:{ Exception -> 0x00c6 }
            L_0x002d:
                if (r0 == 0) goto L_0x0083
                int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00c6 }
                r3 = -2040554890(0xffffffff865f9a76, float:-4.2055118E-35)
                if (r2 == r3) goto L_0x006b
                r3 = -1242452858(0xffffffffb5f1ac86, float:-1.800611E-6)
                if (r2 == r3) goto L_0x0052
                r3 = -930847859(0xffffffffc884638d, float:-271132.4)
                if (r2 == r3) goto L_0x0043
                goto L_0x0083
            L_0x0043:
                java.lang.String r2 = "eligibility"
                boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00c6 }
                if (r0 != 0) goto L_0x004c
                goto L_0x0083
            L_0x004c:
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r0 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                r0.w(r5)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x0083
            L_0x0052:
                java.lang.String r2 = "VIES_DELETE_CARD"
                boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00c6 }
                if (r0 != 0) goto L_0x005b
                goto L_0x0083
            L_0x005b:
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r0 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                in.swiggy.android.swiggylynx.model.b r2 = r0.i()     // Catch:{ Exception -> 0x00c6 }
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r3 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                io.reactivex.processors.BehaviorProcessor r3 = r3.j()     // Catch:{ Exception -> 0x00c6 }
                r0.y(r5, r2, r3)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x0083
            L_0x006b:
                java.lang.String r2 = "VIES_DISENROLL"
                boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00c6 }
                if (r0 != 0) goto L_0x0074
                goto L_0x0083
            L_0x0074:
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r0 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                in.swiggy.android.swiggylynx.model.b r2 = r0.g()     // Catch:{ Exception -> 0x00c6 }
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r3 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                io.reactivex.processors.BehaviorProcessor r3 = r3.h()     // Catch:{ Exception -> 0x00c6 }
                r0.y(r5, r2, r3)     // Catch:{ Exception -> 0x00c6 }
            L_0x0083:
                org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch:{ Exception -> 0x00c6 }
                if (r6 != 0) goto L_0x008a
                goto L_0x0090
            L_0x008a:
                java.lang.String r0 = "requestId"
                java.lang.String r1 = r6.optString(r0)     // Catch:{ Exception -> 0x00c6 }
            L_0x0090:
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r6 = r6.l()     // Catch:{ Exception -> 0x00c6 }
                boolean r6 = kotlin.jvm.internal.p.e(r1, r6)     // Catch:{ Exception -> 0x00c6 }
                if (r6 == 0) goto L_0x00a2
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                r6.x(r5)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x00f2
            L_0x00a2:
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r6 = r6.u()     // Catch:{ Exception -> 0x00c6 }
                boolean r6 = kotlin.jvm.internal.p.e(r1, r6)     // Catch:{ Exception -> 0x00c6 }
                if (r6 == 0) goto L_0x00b4
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                r6.z(r5)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x00f2
            L_0x00b4:
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r6 = r6.k()     // Catch:{ Exception -> 0x00c6 }
                boolean r6 = kotlin.jvm.internal.p.e(r1, r6)     // Catch:{ Exception -> 0x00c6 }
                if (r6 == 0) goto L_0x00f2
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a     // Catch:{ Exception -> 0x00c6 }
                r6.v(r5)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x00f2
            L_0x00c6:
                r5 = move-exception
                com.google.firebase.crashlytics.a r6 = com.google.firebase.crashlytics.a.a()
                r6.d(r5)
                r6 = 1
                kotlin.Pair[] r6 = new kotlin.Pair[r6]
                r0 = 0
                java.lang.String r5 = r5.getMessage()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r1 = "jsupay_generic_error"
                kotlin.Pair r5 = bp0.h.a(r1, r5)
                r6[r0] = r5
                java.util.Map r5 = kotlin.collections.x.j(r6)
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r6 = r4.f19269a
                java.lang.String r0 = "juspay_genereic_error_event"
                r6.K(r0, r5)
                in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper r5 = r4.f19269a
                r5.R()
            L_0x00f2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper.g.onEvent(org.json.JSONObject, in.juspay.hypersdk.data.JuspayResponseHandler):void");
        }
    }

    public JuspaySdkWrapper(FragmentActivity fragmentActivity, ef0.e eVar, jr.a aVar, SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        p.j(fragmentActivity, "fragmentActivity");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(aVar, "newrelicPerformanceUtils");
        p.j(sharedPreferences, "preferences");
        this.f19246a = fragmentActivity;
        this.f19247b = eVar;
        this.f19248c = aVar;
        this.f19249d = sharedPreferences;
        BehaviorProcessor<List<JuspayListWalletResponse.Payload.Data>> z02 = BehaviorProcessor.z0();
        p.i(z02, "create<List<JuspayListWa…Response.Payload.Data>>()");
        this.t = z02;
        BehaviorProcessor<Boolean> z03 = BehaviorProcessor.z0();
        p.i(z03, "create<Boolean>()");
        this.f19261u = z03;
        BehaviorProcessor<Boolean> z04 = BehaviorProcessor.z0();
        p.i(z04, "create<Boolean>()");
        this.v = z04;
        BehaviorProcessor<Boolean> z05 = BehaviorProcessor.z0();
        p.i(z05, "create<Boolean>()");
        this.f19262w = z05;
        this.f19264y = new HashMap<>();
        this.f19250e = p.e(this.f19249d.getString("android_enable_juspay_logger", "true"), "true");
        try {
            jSONArray = new JSONArray(this.f19249d.getString("android_juspay_allowed_keys", "[\"action\",\"status\",\"errorCode\",\"event\",\"error\", \"clientId\",\"merchantId\", \"authType\", \"endUrls\"]"));
        } catch (Exception unused) {
            jSONArray = new JSONArray();
        }
        this.f19251f = jSONArray;
    }

    public static /* synthetic */ void I(JuspaySdkWrapper juspaySdkWrapper, String str, String str2, String str3, boolean z11, String str4, int i11, Object obj) {
        if (obj == null) {
            juspaySdkWrapper.H(str, str2, str3, (i11 & 8) != 0 ? false : z11, str4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initiateWithClientAuthToken");
    }

    /* access modifiers changed from: private */
    public final void K(String str, Map<String, String> map) {
        map.put("payment_platform", "web");
        this.f19248c.b(str, map);
        o.b(m(), "juspay_errors", str, map);
    }

    /* access modifiers changed from: private */
    public final void M(JSONObject jSONObject) {
        if (this.f19250e) {
            JSONObject n11 = PaymentUtils.n(jSONObject, this.f19251f, "lynx", PaymentUtils.LogType.RESPONSE);
            jr.a aVar = this.f19248c;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = h.a("juspay_sdk_response", !(n11 instanceof JSONObject) ? n11.toString() : JSONObjectInstrumentation.toString(n11));
            aVar.a("juspay_sdk_request_response_event_v2", x.h(pairArr));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r5 = r5.getViesCheckType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityResponsePayload N(java.util.List<in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse.Payload.CardData> r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.l.u(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x000f:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r11.next()
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData r1 = (in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse.Payload.CardData) r1
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails r2 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType r3 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$CheckType
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$ViesCheckType r4 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.EligibilityDetails$ViesCheckType
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$CheckType r5 = r1.getCheckType()
            r6 = 0
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r5 = r6
            goto L_0x0035
        L_0x002a:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$ViesCheckType r5 = r5.getViesCheckType()
            if (r5 != 0) goto L_0x0031
            goto L_0x0028
        L_0x0031:
            java.lang.String r5 = r5.getResponseMsg()
        L_0x0035:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$CheckType r7 = r1.getCheckType()
            if (r7 != 0) goto L_0x003d
        L_0x003b:
            r7 = r6
            goto L_0x0048
        L_0x003d:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$ViesCheckType r7 = r7.getViesCheckType()
            if (r7 != 0) goto L_0x0044
            goto L_0x003b
        L_0x0044:
            java.lang.Boolean r7 = r7.getExpired()
        L_0x0048:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$CheckType r8 = r1.getCheckType()
            if (r8 != 0) goto L_0x0050
        L_0x004e:
            r8 = r6
            goto L_0x005b
        L_0x0050:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$ViesCheckType r8 = r8.getViesCheckType()
            if (r8 != 0) goto L_0x0057
            goto L_0x004e
        L_0x0057:
            java.lang.Boolean r8 = r8.getEnrolled()
        L_0x005b:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$CheckType r9 = r1.getCheckType()
            if (r9 != 0) goto L_0x0062
            goto L_0x006d
        L_0x0062:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayEligibilityResponse$Payload$CardData$ViesCheckType r9 = r9.getViesCheckType()
            if (r9 != 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            java.lang.Boolean r6 = r9.getEligibility()
        L_0x006d:
            r4.<init>(r5, r7, r8, r6)
            r3.<init>(r4)
            java.lang.String r4 = r1.getCardBin()
            java.lang.String r1 = r1.getCardAlias()
            r2.<init>(r3, r4, r1)
            r0.add(r2)
            goto L_0x000f
        L_0x0082:
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityResponsePayload r11 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityResponsePayload
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper.N(java.util.List):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityResponsePayload");
    }

    private final void P(OneClickVSCRequestPayload oneClickVSCRequestPayload, fh0.a aVar, l<? super String, k> lVar) {
        String b11 = oneClickVSCRequestPayload.b();
        String d11 = oneClickVSCRequestPayload.d();
        String a11 = oneClickVSCRequestPayload.c().a();
        String str = "";
        if (a11 == null) {
            a11 = str;
        }
        String b12 = oneClickVSCRequestPayload.c().b();
        if (b12 == null) {
            b12 = str;
        }
        String c11 = oneClickVSCRequestPayload.c().c();
        if (c11 != null) {
            str = c11;
        }
        JuspayVSCRequest juspayVSCRequest = new JuspayVSCRequest(new JuspayVSCRequest.Payload(b11, d11, new JuspayVSCRequest.Card(a11, b12, str)));
        lVar.invoke(juspayVSCRequest.get_requestId());
        this.f19264y.put(juspayVSCRequest.get_requestId(), aVar);
        Gson i11 = g0.i();
        JSONObject jSONObject = new JSONObject(!(i11 instanceof Gson) ? i11.toJson((Object) juspayVSCRequest) : GsonInstrumentation.toJson(i11, (Object) juspayVSCRequest));
        if (this.f19259r) {
            q().process(jSONObject);
        }
        L(jSONObject);
    }

    private final String s(String str) {
        in.swiggy.android.swiggylynx.model.b bVar = this.f19258p;
        String str2 = null;
        if (p.e(str, bVar == null ? null : bVar.a())) {
            in.swiggy.android.swiggylynx.model.b bVar2 = this.f19258p;
            if (bVar2 != null) {
                str2 = bVar2.b();
            }
            if (str2 == null) {
                return "";
            }
        } else {
            in.swiggy.android.swiggylynx.model.b bVar3 = this.q;
            if (!p.e(str, bVar3 == null ? null : bVar3.a())) {
                return "";
            }
            in.swiggy.android.swiggylynx.model.b bVar4 = this.q;
            if (bVar4 != null) {
                str2 = bVar4.b();
            }
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }

    private final String t() {
        if (p.e(this.f19249d.getString("android_enable_visa_one_click", "false"), "false")) {
            return null;
        }
        return this.f19249d.getString("android_safety_net_api_key", "");
    }

    public final HyperPaymentsCallbackAdapter A() {
        return new g(this);
    }

    public final void B(String str, String str2, String str3) {
        p.j(str, PaymentConstants.MERCHANT_ID_CAMEL);
        p.j(str2, PaymentConstants.ENV);
        p.j(str3, "requestId");
        if (!this.f19259r) {
            String s11 = p.s(str, "_android");
            String customerId = this.f19247b.getCustomerId();
            p.i(customerId, "user.customerId");
            JuspayInitRequest juspayInitRequest = new JuspayInitRequest(new JuspayInitRequest.Payload(str, s11, customerId, str2, "initiate", false, t(), 32, (i) null));
            Gson i11 = g0.i();
            JSONObject jSONObject = new JSONObject(!(i11 instanceof Gson) ? i11.toJson((Object) juspayInitRequest) : GsonInstrumentation.toJson(i11, (Object) juspayInitRequest));
            q().initiate(jSONObject, A());
            L(jSONObject);
            this.f19259r = true;
            this.f19254i = str3;
        }
    }

    public final void C(JuspayRequestParams juspayRequestParams, String str, fh0.a aVar) {
        String str2 = str;
        fh0.a aVar2 = aVar;
        p.j(juspayRequestParams, CardTypeAdapterFactory.DATA);
        p.j(str2, "requestId");
        p.j(aVar2, "juspayCommunicationHelper");
        this.f19254i = str2;
        this.f19263x = aVar2;
        F(new JuspayCardTxnRequest(new JuspayCardTxnRequest.Payload(JuspayActionTypesKt.CARD_TRANSACTION, juspayRequestParams.m(), juspayRequestParams.n(), juspayRequestParams.o(), juspayRequestParams.h(), String.valueOf(juspayRequestParams.g()), juspayRequestParams.j(), juspayRequestParams.a(), j.d(juspayRequestParams.q()), juspayRequestParams.f(), juspayRequestParams.d(), juspayRequestParams.e(), juspayRequestParams.r(), juspayRequestParams.c(), juspayRequestParams.s(), juspayRequestParams.l(), juspayRequestParams.k())));
    }

    public final void D(JuspayRequestParams juspayRequestParams, String str, fh0.a aVar) {
        p.j(juspayRequestParams, CardTypeAdapterFactory.DATA);
        p.j(str, "requestId");
        p.j(aVar, "juspayCommunicationHelper");
        this.f19254i = str;
        this.f19263x = aVar;
        F(new JuspayCredWalletTxnRequest(new JuspayCredWalletTxnRequest.Payload(JuspayActionTypesKt.APP_PAY_TRANSACTION, PaymentType.JUSPAY_CRED_WALLET, juspayRequestParams.n(), PaymentType.JUSPAY_CRED_WALLET, juspayRequestParams.i(), (String) null)));
    }

    public final void E(JuspayRequestParams juspayRequestParams, String str, fh0.a aVar) {
        p.j(juspayRequestParams, CardTypeAdapterFactory.DATA);
        p.j(str, "requestId");
        p.j(aVar, "juspayCommunicationHelper");
        this.f19254i = str;
        this.f19263x = aVar;
        if (juspayRequestParams.b() != null) {
            F(new JuspayNetBankingRequest(new JuspayNetBankingRequest.Payload(JuspayActionTypesKt.NET_BANKING, juspayRequestParams.b(), juspayRequestParams.n(), new String[]{juspayRequestParams.q()})));
        }
    }

    public final void F(JuspayTxnRequest juspayTxnRequest) {
        p.j(juspayTxnRequest, CardTypeAdapterFactory.DATA);
        this.j = juspayTxnRequest.get_requestId();
        this.f19255l = juspayTxnRequest.getPayload().getOrderId();
        Gson i11 = g0.i();
        JSONObject jSONObject = new JSONObject(!(i11 instanceof Gson) ? i11.toJson((Object) juspayTxnRequest) : GsonInstrumentation.toJson(i11, (Object) juspayTxnRequest));
        q().process(jSONObject);
        L(jSONObject);
    }

    public final void G(JuspayRequestParams juspayRequestParams, String str, fh0.a aVar) {
        p.j(juspayRequestParams, CardTypeAdapterFactory.DATA);
        p.j(str, "requestId");
        p.j(aVar, "juspayCommunicationHelper");
        this.f19254i = str;
        this.f19263x = aVar;
        F(new JuspayWalletTxnRequest(new JuspayWalletTxnRequest.Payload(JuspayActionTypesKt.JUSPAY_WALLET_TXN, PaymentType.JUSPAY_PAYPAL_WALLET, juspayRequestParams.n(), new String[]{juspayRequestParams.q()}, this.f19260s.get(juspayRequestParams.p()), juspayRequestParams.i(), true, "ANDROID_PAYPAL")));
    }

    public final void H(String str, String str2, String str3, boolean z11, String str4) {
        String str5 = str;
        String str6 = str3;
        p.j(str, PaymentConstants.MERCHANT_ID_CAMEL);
        p.j(str2, PaymentConstants.ENV);
        p.j(str6, "requestId");
        p.j(str4, "authToken");
        if (!this.f19259r) {
            String s11 = p.s(str, "_android");
            String customerId = this.f19247b.getCustomerId();
            p.i(customerId, "user.customerId");
            JuspayInitWithClientAuthTokenRequest juspayInitWithClientAuthTokenRequest = new JuspayInitWithClientAuthTokenRequest(new JuspayInitWithClientAuthTokenRequest.Payload(str, s11, customerId, str2, "initiate", false, str4, t(), 32, (i) null));
            Gson i11 = g0.i();
            JSONObject jSONObject = new JSONObject(!(i11 instanceof Gson) ? i11.toJson((Object) juspayInitWithClientAuthTokenRequest) : GsonInstrumentation.toJson(i11, (Object) juspayInitWithClientAuthTokenRequest));
            q().initiate(jSONObject, A());
            L(jSONObject);
            this.f19259r = true;
            this.f19254i = str6;
        }
    }

    public final void J(JuspayListWalletRequest juspayListWalletRequest) {
        p.j(juspayListWalletRequest, CardTypeAdapterFactory.DATA);
        this.k = juspayListWalletRequest.get_requestId();
        Gson i11 = g0.i();
        JSONObject jSONObject = new JSONObject(!(i11 instanceof Gson) ? i11.toJson((Object) juspayListWalletRequest) : GsonInstrumentation.toJson(i11, (Object) juspayListWalletRequest));
        q().process(jSONObject);
        L(jSONObject);
    }

    public final void L(JSONObject jSONObject) {
        p.j(jSONObject, "attribute");
        if (this.f19250e) {
            JSONObject n11 = PaymentUtils.n(jSONObject, this.f19251f, "lynx", PaymentUtils.LogType.REQUEST);
            jr.a aVar = this.f19248c;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = h.a("juspay_sdk_request", !(n11 instanceof JSONObject) ? n11.toString() : JSONObjectInstrumentation.toString(n11));
            aVar.a("juspay_sdk_request_response_event_v2", x.h(pairArr));
        }
    }

    public final boolean O() {
        return q().onBackPressed();
    }

    public final void Q(String str) {
        p.j(str, "requestId");
        if (str.length() > 0) {
            JuspayEligibilityResponsePayload juspayEligibilityResponsePayload = new JuspayEligibilityResponsePayload(false, (String) null, (String) null);
            fh0.a aVar = this.f19264y.get(str);
            if (aVar != null) {
                b.a.a(aVar, str, 0, (String) null, juspayEligibilityResponsePayload, JuspayEligibilityResponsePayload.Companion.serializer(), 2, (Object) null);
            }
            this.f19264y.remove(str);
        }
    }

    public final void R() {
        fh0.a aVar = this.f19263x;
        if (aVar != null) {
            aVar.a(this.f19254i, RNCWebViewManager.COMMAND_CLEAR_HISTORY, (String) null, new JuspayMakePaymentResponsePayload("FAILURE", this.f19255l), JuspayMakePaymentResponsePayload.Companion.serializer());
        }
    }

    public final void S(in.swiggy.android.swiggylynx.model.b bVar) {
        this.n = bVar;
    }

    public final void T(in.swiggy.android.swiggylynx.model.b bVar) {
        this.f19257o = bVar;
    }

    public final JuspayEligibilityResponsePayload U(List<JuspayEligibilityResponse.Payload.AppsData> list) {
        p.j(list, "appsDataList");
        String str = null;
        if (!list.isEmpty()) {
            for (JuspayEligibilityResponse.Payload.AppsData paymentMethodsEligibility : list) {
                List<JuspayEligibilityResponse.Payload.AppsData.PaymentMethods> paymentMethodsEligibility2 = paymentMethodsEligibility.getPaymentMethodsEligibility();
                if (!(paymentMethodsEligibility2 == null || paymentMethodsEligibility2.isEmpty())) {
                    for (JuspayEligibilityResponse.Payload.AppsData.PaymentMethods next : paymentMethodsEligibility2) {
                        if (p.e(next.getPaymentMethod(), PaymentType.JUSPAY_CRED_WALLET)) {
                            boolean isEligible = next.isEligible();
                            JuspayEligibilityResponse.Payload.AppsData.PaymentMethods.Layoutdata layout = next.getLayout();
                            if (layout != null) {
                                str = layout.getSubText();
                            }
                            return new JuspayEligibilityResponsePayload(isEligible, str, next.getFlowType());
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public final void V() {
        if (this.f19259r) {
            this.f19259r = false;
            q().terminate();
        }
    }

    public final void d(OneClickVSCRequestPayload oneClickVSCRequestPayload, String str, fh0.a aVar) {
        p.j(oneClickVSCRequestPayload, CardTypeAdapterFactory.DATA);
        p.j(str, "requestId");
        p.j(aVar, "juspayCommunicationHelper");
        P(oneClickVSCRequestPayload, aVar, new JuspaySdkWrapper$deEnrollOneClick$1(this, str));
    }

    public final void e(OneClickVSCRequestPayload oneClickVSCRequestPayload, String str, fh0.a aVar) {
        p.j(oneClickVSCRequestPayload, CardTypeAdapterFactory.DATA);
        p.j(str, "requestId");
        p.j(aVar, "juspayCommunicationHelper");
        P(oneClickVSCRequestPayload, aVar, new JuspaySdkWrapper$deleteOneClick$1(this, str));
    }

    public final void f(JuspayEligibilityRequest juspayEligibilityRequest, String str, fh0.a aVar) {
        p.j(juspayEligibilityRequest, CardTypeAdapterFactory.DATA);
        p.j(str, "requestId");
        p.j(aVar, "juspayCommunicationHelper");
        try {
            in.swiggy.android.swiggylynx.model.b bVar = new in.swiggy.android.swiggylynx.model.b(str, juspayEligibilityRequest.get_requestId());
            if (juspayEligibilityRequest.isCredRequest()) {
                this.f19258p = bVar;
            } else if (juspayEligibilityRequest.isOneClickRequest()) {
                this.q = bVar;
            }
            this.f19264y.put(str, aVar);
            Gson i11 = g0.i();
            JSONObject jSONObject = new JSONObject(!(i11 instanceof Gson) ? i11.toJson((Object) juspayEligibilityRequest) : GsonInstrumentation.toJson(i11, (Object) juspayEligibilityRequest));
            if (this.f19259r) {
                q().process(jSONObject);
            }
            L(jSONObject);
        } catch (Exception e11) {
            u.h("JuspaySdkWrapper", e11);
        }
    }

    public final in.swiggy.android.swiggylynx.model.b g() {
        return this.n;
    }

    public final BehaviorProcessor<Boolean> h() {
        return this.v;
    }

    public final in.swiggy.android.swiggylynx.model.b i() {
        return this.f19257o;
    }

    public final BehaviorProcessor<Boolean> j() {
        return this.f19262w;
    }

    public final String k() {
        return this.f19256m;
    }

    public final String l() {
        return this.k;
    }

    public final SharedPreferences m() {
        return (SharedPreferences) this.f19253h.getValue();
    }

    public final HyperServices n() {
        return new HyperServices(this.f19246a);
    }

    public final fh0.a o() {
        return this.f19263x;
    }

    public final Map<String, String> p() {
        return this.f19260s;
    }

    public final HyperServices q() {
        return (HyperServices) this.f19252g.getValue();
    }

    public final String r() {
        return this.f19254i;
    }

    public final String u() {
        return this.j;
    }

    public final void v(JSONObject jSONObject) {
        Object obj;
        Boolean bool;
        JuspayBaseResponse.Payload payload;
        JuspayBaseResponse.Payload payload2;
        JuspayBaseResponse.Payload payload3;
        p.j(jSONObject, CardTypeAdapterFactory.DATA);
        boolean z11 = jSONObject instanceof JSONObject;
        String jSONObject2 = !z11 ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
        p.i(jSONObject2, "data.toString()");
        String str = null;
        try {
            Gson j11 = g0.j();
            p.i(j11, "getGsonBinaryBooleanSerializer()");
            Type type = new b().getType();
            obj = !(j11 instanceof Gson) ? j11.fromJson(jSONObject2, type) : GsonInstrumentation.fromJson(j11, jSONObject2, type);
        } catch (Throwable th2) {
            u.h("Extension", th2);
            obj = null;
        }
        JuspayWalletDelinkResponse juspayWalletDelinkResponse = (JuspayWalletDelinkResponse) obj;
        if (juspayWalletDelinkResponse == null || (payload3 = juspayWalletDelinkResponse.getPayload()) == null) {
            bool = null;
        } else {
            bool = payload3.getError();
        }
        if (js.c.e(bool)) {
            this.f19261u.onNext(Boolean.TRUE);
        } else {
            BehaviorProcessor<Boolean> behaviorProcessor = this.f19261u;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delink error occurred: message ->");
            sb2.append((juspayWalletDelinkResponse == null || (payload2 = juspayWalletDelinkResponse.getPayload()) == null) ? null : payload2.getErrorMessage());
            sb2.append(" code ->");
            if (!(juspayWalletDelinkResponse == null || (payload = juspayWalletDelinkResponse.getPayload()) == null)) {
                str = payload.getErrorCode();
            }
            sb2.append(str);
            behaviorProcessor.onError(new Exception(sb2.toString()));
        }
        u.b("JuspaySdkWrapper", !z11 ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject));
    }

    public final void w(JSONObject jSONObject) {
        Object obj;
        JuspayBaseResponse.Payload payload;
        List<JuspayEligibilityResponse.Payload.AppsData> list;
        Boolean bool;
        JuspayEligibilityResponsePayload juspayEligibilityResponsePayload;
        OneClickEligibilityResponsePayload oneClickEligibilityResponsePayload;
        JuspayEligibilityResponse.Payload payload2;
        List<JuspayEligibilityResponse.Payload.CardData> cardsData;
        JuspayEligibilityResponse.Payload payload3;
        p.j(jSONObject, CardTypeAdapterFactory.DATA);
        JSONObject optJSONObject = jSONObject.optJSONObject(PaymentConstants.PAYLOAD);
        String str = null;
        String optString = optJSONObject == null ? null : optJSONObject.optString("requestId");
        if (optString == null) {
            optString = "";
        }
        String jSONObjectInstrumentation = JSONObjectInstrumentation.toString(jSONObject);
        p.i(jSONObjectInstrumentation, "data.toString()");
        try {
            Gson j11 = g0.j();
            p.i(j11, "getGsonBinaryBooleanSerializer()");
            Type type = new c().getType();
            obj = !(j11 instanceof Gson) ? j11.fromJson(jSONObjectInstrumentation, type) : GsonInstrumentation.fromJson(j11, jSONObjectInstrumentation, type);
        } catch (Throwable th2) {
            u.h("Extension", th2);
            obj = null;
        }
        JuspayEligibilityResponse juspayEligibilityResponse = (JuspayEligibilityResponse) obj;
        if (juspayEligibilityResponse == null) {
            payload = null;
        } else {
            payload = juspayEligibilityResponse.getPayload();
        }
        if (payload == null || (payload3 = (JuspayEligibilityResponse.Payload) payload.getData()) == null) {
            list = null;
        } else {
            list = payload3.getAppsData();
        }
        String s11 = s(optString);
        if (payload == null) {
            bool = null;
        } else {
            bool = payload.getError();
        }
        if (js.c.e(bool)) {
            if (list == null) {
                juspayEligibilityResponsePayload = null;
            } else {
                juspayEligibilityResponsePayload = U(list);
            }
            if (payload == null || (payload2 = (JuspayEligibilityResponse.Payload) payload.getData()) == null || (cardsData = payload2.getCardsData()) == null) {
                oneClickEligibilityResponsePayload = null;
            } else {
                oneClickEligibilityResponsePayload = N(cardsData);
            }
            in.swiggy.android.swiggylynx.model.b bVar = this.f19258p;
            if (!p.e(bVar == null ? null : bVar.b(), s11) || juspayEligibilityResponsePayload == null) {
                in.swiggy.android.swiggylynx.model.b bVar2 = this.q;
                if (bVar2 != null) {
                    str = bVar2.b();
                }
                if (!p.e(str, s11) || oneClickEligibilityResponsePayload == null) {
                    Q(s11);
                    return;
                }
                fh0.a aVar = this.f19264y.get(s11);
                if (aVar != null) {
                    b.a.a(aVar, s11, 0, (String) null, oneClickEligibilityResponsePayload, OneClickEligibilityResponsePayload.Companion.serializer(), 2, (Object) null);
                }
                this.f19264y.remove(s11);
                return;
            }
            SharedPreferences.Editor edit = this.f19249d.edit();
            Gson i11 = g0.i();
            edit.putString("juspay_eligibility_cached", !(i11 instanceof Gson) ? i11.toJson((Object) juspayEligibilityResponsePayload) : GsonInstrumentation.toJson(i11, (Object) juspayEligibilityResponsePayload)).apply();
            fh0.a aVar2 = this.f19264y.get(s11);
            if (aVar2 != null) {
                b.a.a(aVar2, s11, 0, (String) null, juspayEligibilityResponsePayload, JuspayEligibilityResponsePayload.Companion.serializer(), 2, (Object) null);
            }
            this.f19264y.remove(s11);
            return;
        }
        Q(s11);
    }

    public final void x(JSONObject jSONObject) {
        Object obj;
        String str;
        JuspayBaseResponse.Payload payload;
        List<JuspayListWalletResponse.Payload.Data> list;
        Boolean bool;
        String errorMessage;
        T t11;
        JuspayListWalletResponse.Payload payload2;
        JSONObject jSONObject2 = jSONObject;
        p.j(jSONObject2, CardTypeAdapterFactory.DATA);
        String jSONObject3 = !(jSONObject2 instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
        p.i(jSONObject3, "data.toString()");
        try {
            Gson j11 = g0.j();
            p.i(j11, "getGsonBinaryBooleanSerializer()");
            Type type = new d().getType();
            obj = !(j11 instanceof Gson) ? j11.fromJson(jSONObject3, type) : GsonInstrumentation.fromJson(j11, jSONObject3, type);
        } catch (Throwable th2) {
            u.h("Extension", th2);
            obj = null;
        }
        JuspayListWalletResponse juspayListWalletResponse = (JuspayListWalletResponse) obj;
        if (juspayListWalletResponse == null) {
            str = null;
        } else {
            str = js.c.c(juspayListWalletResponse);
        }
        u.b("JuspaySdkWrapper", String.valueOf(str));
        if (juspayListWalletResponse == null) {
            payload = null;
        } else {
            payload = juspayListWalletResponse.getPayload();
        }
        if (payload == null || (payload2 = (JuspayListWalletResponse.Payload) payload.getData()) == null) {
            list = null;
        } else {
            list = payload2.getWalletsList();
        }
        if (payload == null) {
            bool = null;
        } else {
            bool = payload.getError();
        }
        if (js.c.e(bool)) {
            if (list != null) {
                for (JuspayListWalletResponse.Payload.Data data : list) {
                    try {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t11 = null;
                                break;
                            }
                            t11 = it2.next();
                            if (p.e(((JuspayListWalletResponse.Payload.Data) t11).getWalletName(), PaymentType.JUSPAY_PAYPAL_WALLET)) {
                                break;
                            }
                        }
                        JuspayListWalletResponse.Payload.Data data2 = (JuspayListWalletResponse.Payload.Data) t11;
                        String token = data2 == null ? null : data2.getToken();
                        if (token != null) {
                            if (token.length() > 0) {
                                p().put(PaymentType.JUSPAY_PAYPAL_WALLET, token);
                            }
                        }
                        fh0.a o11 = o();
                        if (o11 != null) {
                            b.a.a(o11, r(), 0, (String) null, new JuspayMakePaymentResponsePayload("SUCCESS", this.f19255l), JuspayMakePaymentResponsePayload.Companion.serializer(), 2, (Object) null);
                        }
                    } catch (Exception unused) {
                        R();
                    }
                }
            }
            BehaviorProcessor<List<JuspayListWalletResponse.Payload.Data>> behaviorProcessor = this.t;
            if (list == null) {
                list = k.j();
            }
            behaviorProcessor.onNext(list);
            return;
        }
        Pair[] pairArr = new Pair[1];
        String str2 = "no error message";
        if (!(payload == null || (errorMessage = payload.getErrorMessage()) == null)) {
            str2 = errorMessage;
        }
        pairArr[0] = h.a("juspay_sdk_error", str2);
        K("juspay_sdk_error_event", x.j(pairArr));
        R();
    }

    public final void y(JSONObject jSONObject, in.swiggy.android.swiggylynx.model.b bVar, BehaviorProcessor<Boolean> behaviorProcessor) {
        Object obj;
        Boolean bool;
        JuspayBaseResponse.Payload payload;
        JuspayBaseResponse.Payload payload2;
        String str;
        JuspayBaseResponse.Payload payload3;
        JuspayBaseResponse.Payload payload4;
        JuspayTransactionResponse.Payload payload5;
        String status;
        JuspayBaseResponse.Payload payload6;
        p.j(jSONObject, CardTypeAdapterFactory.DATA);
        p.j(behaviorProcessor, "vscUpdateBehavior");
        if (bVar != null) {
            String a11 = bVar.a();
            boolean z11 = jSONObject instanceof JSONObject;
            String jSONObject2 = !z11 ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
            p.i(jSONObject2, "data.toString()");
            String str2 = null;
            try {
                Gson j11 = g0.j();
                p.i(j11, "getGsonBinaryBooleanSerializer()");
                Type type = new e().getType();
                obj = !(j11 instanceof Gson) ? j11.fromJson(jSONObject2, type) : GsonInstrumentation.fromJson(j11, jSONObject2, type);
            } catch (Throwable th2) {
                u.h("Extension", th2);
                obj = null;
            }
            JuspayTransactionResponse juspayTransactionResponse = (JuspayTransactionResponse) obj;
            if (juspayTransactionResponse == null || (payload6 = juspayTransactionResponse.getPayload()) == null) {
                bool = null;
            } else {
                bool = payload6.getError();
            }
            if (js.c.e(bool)) {
                boolean z12 = false;
                if (!(juspayTransactionResponse == null || (payload4 = juspayTransactionResponse.getPayload()) == null || (payload5 = (JuspayTransactionResponse.Payload) payload4.getData()) == null || (status = payload5.getStatus()) == null)) {
                    z12 = status.equals("SUCCESS");
                }
                OneClickVSCResponsePayload oneClickVSCResponsePayload = new OneClickVSCResponsePayload(z12);
                fh0.a aVar = this.f19264y.get(a11);
                if (aVar != null) {
                    b.a.a(aVar, bVar.b(), 0, (String) null, oneClickVSCResponsePayload, OneClickVSCResponsePayload.Companion.serializer(), 2, (Object) null);
                }
                behaviorProcessor.onNext(Boolean.TRUE);
                behaviorProcessor.onNext(Boolean.FALSE);
            } else {
                fh0.a aVar2 = this.f19264y.get(a11);
                if (aVar2 != null) {
                    String b11 = bVar.b();
                    if (juspayTransactionResponse == null || (payload3 = juspayTransactionResponse.getPayload()) == null) {
                        str = null;
                    } else {
                        str = payload3.getErrorMessage();
                    }
                    if (str == null) {
                        str = "";
                    }
                    mp.a aVar3 = mp.a.f53029a;
                    aVar2.c(b11, 1, str, aVar3, aVar3.a());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("VIES error occurred: message ->");
                sb2.append((juspayTransactionResponse == null || (payload2 = juspayTransactionResponse.getPayload()) == null) ? null : payload2.getErrorMessage());
                sb2.append(" code ->");
                if (!(juspayTransactionResponse == null || (payload = juspayTransactionResponse.getPayload()) == null)) {
                    str2 = payload.getErrorCode();
                }
                sb2.append(str2);
                behaviorProcessor.onError(new Exception(sb2.toString()));
            }
            this.f19264y.remove(a11);
            u.b("JuspaySdkWrapper", !z11 ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.p.j(r10, r0)
            boolean r0 = r10 instanceof org.json.JSONObject
            if (r0 != 0) goto L_0x000e
            java.lang.String r10 = r10.toString()
            goto L_0x0012
        L_0x000e:
            java.lang.String r10 = com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation.toString(r10)
        L_0x0012:
            java.lang.String r0 = "data.toString()"
            kotlin.jvm.internal.p.i(r10, r0)
            r0 = 0
            com.google.gson.Gson r1 = os.g0.j()     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "getGsonBinaryBooleanSerializer()"
            kotlin.jvm.internal.p.i(r1, r2)     // Catch:{ all -> 0x0038 }
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper$f r2 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper$f     // Catch:{ all -> 0x0038 }
            r2.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ all -> 0x0038 }
            boolean r3 = r1 instanceof com.google.gson.Gson     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x0033
            java.lang.Object r10 = r1.fromJson((java.lang.String) r10, (java.lang.reflect.Type) r2)     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0033:
            java.lang.Object r10 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r1, (java.lang.String) r10, (java.lang.reflect.Type) r2)     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r10 = move-exception
            java.lang.String r1 = "Extension"
            os.u.h(r1, r10)
            r10 = r0
        L_0x003f:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayTransactionResponse r10 = (in.swiggy.android.tejas.payment.model.juspay.response.JuspayTransactionResponse) r10
            if (r10 != 0) goto L_0x0045
            r10 = r0
            goto L_0x0049
        L_0x0045:
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayBaseResponse$Payload r10 = r10.getPayload()
        L_0x0049:
            if (r10 == 0) goto L_0x017a
            java.lang.Boolean r1 = r10.getError()
            boolean r1 = js.c.e(r1)
            java.lang.String r2 = "order_id"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0142
            in.swiggy.android.tejas.payment.model.juspay.response.BasePayloadJuspay r10 = r10.getData()
            in.swiggy.android.tejas.payment.model.juspay.response.JuspayTransactionResponse$Payload r10 = (in.swiggy.android.tejas.payment.model.juspay.response.JuspayTransactionResponse.Payload) r10
            if (r10 == 0) goto L_0x013e
            java.util.List<java.lang.String> r1 = f19245z
            boolean r6 = r1 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0070
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x008f
        L_0x0070:
            java.util.Iterator r1 = r1.iterator()
        L_0x0074:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r10.getStatus()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            boolean r6 = kotlin.text.StringsKt__StringsKt.S(r6, r7, r5, r3, r0)
            if (r6 == 0) goto L_0x0074
            r0 = 1
        L_0x008f:
            java.lang.String r1 = "juspay_sdk_transaction_error_event"
            java.lang.String r6 = "juspay_transaction_error"
            if (r0 == 0) goto L_0x00b9
            kotlin.Pair[] r0 = new kotlin.Pair[r3]
            java.lang.String r10 = r10.getStatus()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            kotlin.Pair r10 = bp0.h.a(r6, r10)
            r0[r5] = r10
            java.lang.String r10 = r9.f19255l
            kotlin.Pair r10 = bp0.h.a(r2, r10)
            r0[r4] = r10
            java.util.Map r10 = kotlin.collections.x.j(r0)
            r9.K(r1, r10)
            r9.R()
            goto L_0x017d
        L_0x00b9:
            java.lang.String r0 = r10.getStatus()
            java.lang.String r7 = "USER_ABORTED"
            boolean r0 = kotlin.jvm.internal.p.e(r0, r7)
            if (r0 == 0) goto L_0x00e9
            kotlin.Pair[] r0 = new kotlin.Pair[r3]
            java.lang.String r10 = r10.getStatus()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            kotlin.Pair r10 = bp0.h.a(r6, r10)
            r0[r5] = r10
            java.lang.String r10 = r9.f19255l
            kotlin.Pair r10 = bp0.h.a(r2, r10)
            r0[r4] = r10
            java.util.Map r10 = kotlin.collections.x.j(r0)
            r9.K(r1, r10)
            r9.R()
            goto L_0x017d
        L_0x00e9:
            java.lang.String r0 = r10.getStatus()
            java.lang.String r7 = "CHARGED"
            boolean r0 = kotlin.jvm.internal.p.e(r0, r7)
            if (r0 != 0) goto L_0x0118
            kotlin.Pair[] r0 = new kotlin.Pair[r3]
            java.lang.String r10 = r10.getStatus()
            if (r10 != 0) goto L_0x00ff
            java.lang.String r10 = "null status message"
        L_0x00ff:
            kotlin.Pair r10 = bp0.h.a(r6, r10)
            r0[r5] = r10
            java.lang.String r10 = r9.f19255l
            kotlin.Pair r10 = bp0.h.a(r2, r10)
            r0[r4] = r10
            java.util.Map r10 = kotlin.collections.x.j(r0)
            r9.K(r1, r10)
            r9.R()
            goto L_0x017d
        L_0x0118:
            java.lang.String r0 = r10.getStatus()
            java.lang.String r10 = r10.getOrderId()
            if (r0 == 0) goto L_0x017d
            if (r10 == 0) goto L_0x017d
            fh0.a r1 = r9.f19263x
            if (r1 != 0) goto L_0x0129
            goto L_0x017d
        L_0x0129:
            java.lang.String r2 = r9.f19254i
            r3 = 0
            r4 = 0
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentResponsePayload r5 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentResponsePayload
            r5.<init>(r0, r10)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentResponsePayload$Companion r10 = in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentResponsePayload.Companion
            kotlinx.serialization.KSerializer r6 = r10.serializer()
            r7 = 2
            r8 = 0
            zp.b.a.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017d
        L_0x013e:
            r9.R()
            goto L_0x017d
        L_0x0142:
            java.lang.String r0 = r10.getErrorMessage()
            r1 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = "no error message"
        L_0x014d:
            java.lang.String r6 = "juspay_sdk_error"
            kotlin.Pair r0 = bp0.h.a(r6, r0)
            r1[r5] = r0
            java.lang.String r0 = r9.f19255l
            kotlin.Pair r0 = bp0.h.a(r2, r0)
            r1[r4] = r0
            java.lang.String r10 = r10.getErrorCode()
            if (r10 != 0) goto L_0x0165
            java.lang.String r10 = "empty error code"
        L_0x0165:
            java.lang.String r0 = "juspay_sdk_error_code"
            kotlin.Pair r10 = bp0.h.a(r0, r10)
            r1[r3] = r10
            java.util.Map r10 = kotlin.collections.x.j(r1)
            java.lang.String r0 = "juspay_sdk_error_event"
            r9.K(r0, r10)
            r9.R()
            goto L_0x017d
        L_0x017a:
            r9.R()
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper.z(org.json.JSONObject):void");
    }
}
