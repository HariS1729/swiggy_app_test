package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import bp0.h;
import bp0.k;
import cg0.n;
import cg0.o;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.g;
import com.google.android.gms.location.j;
import com.google.android.gms.tasks.Task;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.plugin.core.CoreRequestPlugin;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import di0.q;
import ef0.e;
import ef0.f;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.dash.web.WebFragment;
import in.swiggy.android.swiggylynx.R;
import in.swiggy.android.swiggylynx.model.WebViewLastState;
import in.swiggy.android.swiggylynx.plugin.accessibility.AccessibilityEnabledResponsePayload;
import in.swiggy.android.swiggylynx.plugin.account.VerifyMobileNumberPayload;
import in.swiggy.android.swiggylynx.plugin.dash.phoneContact.PhoneResponsePayload;
import in.swiggy.android.swiggylynx.plugin.statusbar.StatusBarColorChangePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.closeWebViewWithParams.CloseWebViewWithParamsRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.GetUnreadConversationsPayloadData;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.giftingpersonalizedmessage.UserFlowInfoRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.launchBrowser.LaunchBrowserPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.screencapturing.StartStopScreenCapturing;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.sendClevertapEvent.SendClevertapEventRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.toggleBottomBarViewParams.ToggleBottomBarViewRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.updateConversation.UpdateConversationIdRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.userinfo.UserInfoResponsePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.vibrate.VibratePayload;
import in.swiggy.android.swiggylynx.ui.LynxActivity;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.chathead.models.Aggregation;
import in.swiggy.android.tejas.feature.chathead.models.Conversations;
import in.swiggy.android.tejas.oldapi.models.cart.FlowData;
import io.reactivex.processors.PublishProcessor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import lp0.l;
import mh0.b;
import mh0.m;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import os.g0;
import os.u;
import zp.b;

@Instrumented
/* compiled from: SwiggyLynxCorePlugin.kt */
public class SwiggyLynxCorePlugin extends CoreRequestPlugin implements mh0.b {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */
    public static String O = "";
    private final String A;
    private final String B;
    private final uh0.a C;
    private final f D;
    private final jr.a E;
    private final pw.a F;
    private final pg0.a G;
    private final String H;
    private final PublishProcessor<Integer> I;
    private final os.a J;
    private int K;
    private String L;
    private zp.b M;
    private final hq0.a N;

    /* renamed from: f  reason: collision with root package name */
    private final AppCompatActivity f19381f;

    /* renamed from: g  reason: collision with root package name */
    private final jz.c f19382g;

    /* renamed from: h  reason: collision with root package name */
    private final WebView f19383h;

    /* renamed from: i  reason: collision with root package name */
    private final e f19384i;
    private final n j;
    private final fr.e k;

    /* renamed from: l  reason: collision with root package name */
    private final Class<?> f19385l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedPreferences f19386m;
    private final ps.b n;

    /* renamed from: o  reason: collision with root package name */
    private final us.f f19387o;

    /* renamed from: p  reason: collision with root package name */
    private final fi0.a f19388p;
    private final lp0.a<k> q;

    /* renamed from: r  reason: collision with root package name */
    private final lp0.a<k> f19389r;

    /* renamed from: s  reason: collision with root package name */
    private final bf0.a f19390s;
    private final String t;

    /* renamed from: u  reason: collision with root package name */
    private final l<mh0.c, k> f19391u;
    private final Intent v;

    /* renamed from: w  reason: collision with root package name */
    private final String f19392w;

    /* renamed from: x  reason: collision with root package name */
    private final eo0.a f19393x;

    /* renamed from: y  reason: collision with root package name */
    private final o f19394y;

    /* renamed from: z  reason: collision with root package name */
    private final String f19395z;

    /* compiled from: SwiggyLynxCorePlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a() {
            return SwiggyLynxCorePlugin.O;
        }

        public final boolean b(f fVar, SharedPreferences sharedPreferences) {
            p.j(fVar, "xpExperimentContext");
            p.j(sharedPreferences, "appSharedPreferences");
            return p.e("true", fVar.u0("checkout_ux4_reskin", "false")) && p.e("true", sharedPreferences.getString("android_enable_UX4_for_web_cart_payment", "false"));
        }

        public final void c(String str) {
            p.j(str, "<set-?>");
            SwiggyLynxCorePlugin.O = str;
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class b extends TypeToken<List<? extends Aggregation>> {
    }

    /* compiled from: SwiggyLynxCorePlugin.kt */
    public static final class c extends TypeToken<HashMap<String, Object>> {
        c() {
        }
    }

    /* compiled from: SwiggyLynxCorePlugin.kt */
    public static final class d extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f19396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SwiggyLynxCorePlugin f19397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ zp.b f19399d;

        d(Activity activity, SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, zp.b bVar) {
            this.f19396a = activity;
            this.f19397b = swiggyLynxCorePlugin;
            this.f19398c = str;
            this.f19399d = bVar;
        }

        /* access modifiers changed from: private */
        public static final void b(SwiggyLynxCorePlugin swiggyLynxCorePlugin, Location location, String str, zp.b bVar, Task task) {
            p.j(swiggyLynxCorePlugin, "this$0");
            p.j(str, "$requestId");
            p.j(bVar, "$responseHandler");
            p.j(task, "it");
            swiggyLynxCorePlugin.P1(location, str, bVar);
        }

        public void onLocationResult(LocationResult locationResult) {
            Location location;
            if (locationResult != null && locationResult.P().get(0) != null && (location = locationResult.P().get(0)) != null) {
                com.google.android.gms.location.i.a(this.f19396a).c(this).b(new mh0.o(this.f19397b, location, this.f19398c, this.f19399d));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwiggyLynxCorePlugin(AppCompatActivity appCompatActivity, jz.c cVar, WebView webView, e eVar, n nVar, fr.e eVar2, Class cls, SharedPreferences sharedPreferences, ps.b bVar, us.f fVar, fi0.a aVar, lp0.a aVar2, lp0.a aVar3, bf0.a aVar4, String str, l lVar, Intent intent, String str2, eo0.a aVar5, o oVar, String str3, String str4, String str5, uh0.a aVar6, f fVar2, jr.a aVar7, pw.a aVar8, pg0.a aVar9, String str6, PublishProcessor publishProcessor, os.a aVar10, int i11, i iVar) {
        this(appCompatActivity, cVar, webView, eVar, nVar, eVar2, cls, sharedPreferences, bVar, fVar, aVar, aVar2, aVar3, aVar4, str, lVar, intent, str2, aVar5, oVar, str3, str4, str5, aVar6, fVar2, aVar7, aVar8, (i11 & 134217728) != 0 ? null : aVar9, (i11 & 268435456) != 0 ? null : str6, (i11 & 536870912) != 0 ? null : publishProcessor, aVar10);
    }

    public static /* synthetic */ void E1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, boolean z11, String str2, zp.b bVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            swiggyLynxCorePlugin.D1(str, z11, str2, bVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchDeeplink");
    }

    private final void F1(HashMap<String, Object> hashMap, String str) {
        this.k.J(hashMap, str);
    }

    private final void G1(NavigateToScreenRequestPayload navigateToScreenRequestPayload, Exception exc) {
        this.E.a("navigate_to_screen_errors", x.j(h.a("link", navigateToScreenRequestPayload.b()), h.a("params", navigateToScreenRequestPayload.c()), h.a("type", navigateToScreenRequestPayload.d()), h.a("exception", b.b(exc))));
    }

    private final void H1(String str) {
        in.swiggy.android.commons.utils.rxpermissions.a.g(this.f19381f).v("android.permission.CALL_PHONE").Q(do0.a.a()).h0(new mh0.g(str, this), mh0.h.f26744a);
    }

    /* access modifiers changed from: private */
    public static final void I1(String str, SwiggyLynxCorePlugin swiggyLynxCorePlugin, Boolean bool) {
        p.j(str, "$uri");
        p.j(swiggyLynxCorePlugin, "this$0");
        p.i(bool, "granted");
        if (bool.booleanValue()) {
            swiggyLynxCorePlugin.f19381f.startActivity(new Intent("android.intent.action.CALL", Uri.parse(str)));
            return;
        }
        swiggyLynxCorePlugin.f19381f.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
    }

    /* access modifiers changed from: private */
    public static final void J1(Throwable th2) {
        u.h("SwiggyLynxCorePlugin", th2);
    }

    private final void K1(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        AppCompatActivity appCompatActivity = this.f19381f;
        appCompatActivity.startActivity(Intent.createChooser(intent, appCompatActivity.getResources().getString(R.string.send_email)));
    }

    /* access modifiers changed from: private */
    public static final void L1(InputMethodManager inputMethodManager, SwiggyLynxCorePlugin swiggyLynxCorePlugin) {
        p.j(swiggyLynxCorePlugin, "this$0");
        if (!(inputMethodManager != null && inputMethodManager.isAcceptingText())) {
            WebView webView = swiggyLynxCorePlugin.f19383h;
            if (webView != null) {
                webView.requestFocus();
            }
            if (inputMethodManager != null) {
                inputMethodManager.toggleSoftInput(1, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final k M1(String str, JsonObject jsonObject, SendClevertapEventRequestPayload sendClevertapEventRequestPayload, SwiggyLynxCorePlugin swiggyLynxCorePlugin) {
        p.j(sendClevertapEventRequestPayload, "$sendClevertapEventRequestPayload");
        p.j(swiggyLynxCorePlugin, "this$0");
        if (!(str == null || jsonObject == null)) {
            try {
                Type type = new c().getType();
                Gson i11 = g0.i();
                String jsonObject2 = sendClevertapEventRequestPayload.c().toString();
                Object fromJson = !(i11 instanceof Gson) ? i11.fromJson(jsonObject2, type) : GsonInstrumentation.fromJson(i11, jsonObject2, type);
                p.i(fromJson, "getGson()\n              ….params.toString(), type)");
                swiggyLynxCorePlugin.F1((HashMap) fromJson, sendClevertapEventRequestPayload.b());
            } catch (Exception e11) {
                u.h("ClevertapClient", e11);
            }
        }
        return k.f22762a;
    }

    /* access modifiers changed from: private */
    public static final void N1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, lp.b bVar) {
        p.j(swiggyLynxCorePlugin, "this$0");
        p.j(bVar, "$payload");
        swiggyLynxCorePlugin.K = vt.c.f53915a.a(dt.c.f(((StatusBarColorChangePayload) bVar).b(), 0, 1, (Object) null), swiggyLynxCorePlugin.f19381f);
    }

    private final void O1(String str, zp.b bVar) {
        b.a.a(bVar, str, 0, (String) null, new tp.b(-1.0d, -1.0d), tp.b.f53228c.a(), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void P1(Location location, String str, zp.b bVar) {
        double d11;
        double d12 = -1.0d;
        if (location == null) {
            d11 = -1.0d;
        } else {
            d11 = location.getLongitude();
        }
        if (location != null) {
            d12 = location.getLatitude();
        }
        b.a.a(bVar, str, 0, (String) null, new tp.b(d11, d12), tp.b.f53228c.a(), 6, (Object) null);
    }

    private final void U1(NavigateToScreenRequestPayload navigateToScreenRequestPayload) {
        JsonPrimitive l11;
        String f11;
        JsonElement jsonElement = (JsonElement) hq0.f.k(navigateToScreenRequestPayload.c()).get("shouldCloseWebview");
        if (jsonElement != null && (l11 = hq0.f.l(jsonElement)) != null && (f11 = hq0.f.f(l11)) != null && p.e(f11, "true")) {
            l1().setResult(0, new Intent());
            o1().invoke();
        }
    }

    private final void W1(String str, zp.b bVar) {
        v1(str, bVar);
    }

    @SuppressLint({"MissingPermission"})
    private final void p1(String str, zp.b bVar) {
        Task<j> u22 = this.j.u2();
        u22.i(new mh0.n(this, str, bVar));
        u22.f(new mh0.l(this));
        AppCompatActivity appCompatActivity = this.f19381f;
        if (appCompatActivity != null) {
            com.google.android.gms.location.i.a(appCompatActivity).b().d(appCompatActivity, m.f26754a);
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, zp.b bVar, j jVar) {
        p.j(swiggyLynxCorePlugin, "this$0");
        p.j(str, "$requestId");
        p.j(bVar, "$responseHandler");
        js.c.o(swiggyLynxCorePlugin.f19381f, jVar, new SwiggyLynxCorePlugin$getGpsLocation$1$1(swiggyLynxCorePlugin, str, bVar));
    }

    /* access modifiers changed from: private */
    public static final void r1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, Exception exc) {
        AppCompatActivity appCompatActivity;
        p.j(swiggyLynxCorePlugin, "this$0");
        p.j(exc, "e");
        if ((exc instanceof ResolvableApiException) && (appCompatActivity = swiggyLynxCorePlugin.f19381f) != null) {
            try {
                ((ResolvableApiException) exc).startResolutionForResult(appCompatActivity, 294);
            } catch (IntentSender.SendIntentException e11) {
                u.h(WebFragment.E.a(), e11);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void s1(Exception exc) {
        p.j(exc, "failed");
        u.h(WebFragment.E.a(), exc);
    }

    private final void v1(String str, zp.b bVar) {
        String[] strArr;
        if (this.f19381f != null) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.f25661a = true;
            if (Build.VERSION.SDK_INT >= 31) {
                strArr = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION"};
            }
            this.f19393x.c(in.swiggy.android.commons.utils.rxpermissions.a.g(this.f19381f).w((String[]) Arrays.copyOf(strArr, strArr.length)).Q(do0.a.a()).h0(new mh0.f(this, str, bVar, ref$BooleanRef), new mh0.e(this, str, bVar)));
        }
    }

    /* access modifiers changed from: private */
    public static final void w1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, zp.b bVar, Ref$BooleanRef ref$BooleanRef, ss.a aVar) {
        p.j(swiggyLynxCorePlugin, "this$0");
        p.j(str, "$requestId");
        p.j(bVar, "$responseHandler");
        p.j(ref$BooleanRef, "$executePermissionNotGrantedFlow");
        if (aVar.f53212b) {
            if (aVar.f53211a.equals("android.permission.ACCESS_FINE_LOCATION")) {
                swiggyLynxCorePlugin.p1(str, bVar);
            }
        } else if (ref$BooleanRef.f25661a) {
            ref$BooleanRef.f25661a = false;
            swiggyLynxCorePlugin.O1(str, bVar);
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, zp.b bVar, Throwable th2) {
        p.j(swiggyLynxCorePlugin, "this$0");
        p.j(str, "$requestId");
        p.j(bVar, "$responseHandler");
        swiggyLynxCorePlugin.O1(str, bVar);
    }

    public void A0(tp.a aVar, String str, zp.b bVar) {
        p.j(aVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        W1(str, bVar);
    }

    /* access modifiers changed from: protected */
    public final zp.b A1() {
        return this.M;
    }

    public void B0(UserFlowInfoRequestPayload userFlowInfoRequestPayload, String str, zp.b bVar) {
        p.j(userFlowInfoRequestPayload, "userFlowInfoRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19390s.m().setCartSourceFlowType(userFlowInfoRequestPayload.b());
        UserFlowInfoRequestPayload.FlowData c11 = userFlowInfoRequestPayload.c();
        FlowData flowData = new FlowData();
        flowData.setMessageId(c11.c());
        flowData.setRecipientName(c11.d());
        flowData.setCreatedTs(c11.a());
        flowData.setExpiredTs(c11.b());
        n1().m().setFlowData(flowData);
        Q1(str, bVar);
    }

    /* renamed from: B1 */
    public ArrayList<np.b> T() {
        return b.C0234b.a(this);
    }

    public void C0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        Intent intent = new Intent();
        intent.putExtra("clearCart", true);
        this.f19381f.setResult(0, intent);
        this.q.invoke();
        Q1(str, bVar2);
    }

    public final e C1() {
        return this.f19384i;
    }

    public void D(LaunchBrowserPayload launchBrowserPayload, String str, zp.b bVar) {
        p.j(launchBrowserPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        String b11 = launchBrowserPayload.b();
        if (b11 != null) {
            try {
                l1().startActivity(bz.h.a(l1(), b11));
            } catch (Exception e11) {
                u.h("SwiggyLynxCorePlugin", e11);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r1 != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1(java.lang.String r11, boolean r12, java.lang.String r13, zp.b r14) {
        /*
            r10 = this;
            java.lang.String r0 = "requestId"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "responseHandler"
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            if (r11 != 0) goto L_0x0010
            goto L_0x001f
        L_0x0010:
            java.lang.String r3 = "tel"
            boolean r3 = kotlin.text.StringsKt__StringsKt.S(r11, r3, r1, r0, r2)
            if (r3 == 0) goto L_0x001f
            r10.H1(r11)
            r10.Q1(r13, r14)
            return
        L_0x001f:
            if (r11 != 0) goto L_0x0022
            goto L_0x0041
        L_0x0022:
            java.lang.String r3 = "mailto:"
            boolean r4 = kotlin.text.StringsKt__StringsKt.S(r11, r3, r1, r0, r2)
            if (r4 == 0) goto L_0x0041
            java.lang.String r12 = kotlin.text.StringsKt__StringsKt.U0(r11, r3, r2, r0, r2)
            java.lang.String r1 = "?"
            java.lang.String r12 = kotlin.text.StringsKt__StringsKt.c1(r12, r1, r2, r0, r2)
            java.lang.String r1 = "subject="
            java.lang.String r11 = kotlin.text.StringsKt__StringsKt.U0(r11, r1, r2, r0, r2)
            r10.K1(r12, r11)
            r10.Q1(r13, r14)
            return
        L_0x0041:
            java.lang.String r3 = "android.intent.action.VIEW"
            if (r12 == 0) goto L_0x0089
            r12 = 1
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r4 = 0
            goto L_0x0053
        L_0x004a:
            java.lang.String r4 = "http"
            boolean r4 = kotlin.text.o.N(r11, r4, r1, r0, r2)
            if (r4 != r12) goto L_0x0048
            r4 = 1
        L_0x0053:
            if (r4 != 0) goto L_0x0063
            if (r11 != 0) goto L_0x0058
            goto L_0x0061
        L_0x0058:
            java.lang.String r4 = "swiggy://"
            boolean r0 = kotlin.text.o.N(r11, r4, r1, r0, r2)
            if (r0 != r12) goto L_0x0061
            r1 = 1
        L_0x0061:
            if (r1 == 0) goto L_0x0089
        L_0x0063:
            android.content.Intent r5 = new android.content.Intent
            androidx.appcompat.app.AppCompatActivity r12 = r10.f19381f
            java.lang.Class<?> r0 = r10.f19385l
            r5.<init>(r12, r0)
            r5.setAction(r3)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r5.setData(r11)
            r11 = 603979776(0x24000000, float:2.7755576E-17)
            r5.addFlags(r11)
            jz.c r4 = r10.f19382g
            androidx.appcompat.app.AppCompatActivity r6 = r10.f19381f
            r7 = 0
            r8 = 4
            r9 = 0
            jz.c.a.a(r4, r5, r6, r7, r8, r9)
            r10.Q1(r13, r14)
            goto L_0x009d
        L_0x0089:
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r3)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r12.setData(r11)
            androidx.appcompat.app.AppCompatActivity r11 = r10.f19381f
            r11.startActivity(r12)
            r10.Q1(r13, r14)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin.D1(java.lang.String, boolean, java.lang.String, zp.b):void");
    }

    public void F(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        b.a.a(bVar2, str, 0, (String) null, new AccessibilityEnabledResponsePayload(String.valueOf(this.n.i())), AccessibilityEnabledResponsePayload.Companion.serializer(), 6, (Object) null);
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        b.C0234b.b(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void I(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        this.f19381f.runOnUiThread(new mh0.j(this, bVar));
    }

    public void J0(ToggleBottomBarViewRequestPayload toggleBottomBarViewRequestPayload, String str, zp.b bVar) {
        p.j(toggleBottomBarViewRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    public void K(lp.b bVar, String str, zp.b bVar2) {
        lp.b bVar3 = bVar;
        p.j(bVar, PaymentConstants.PAYLOAD);
        String str2 = str;
        p.j(str2, "requestId");
        zp.b bVar4 = bVar2;
        p.j(bVar4, "responseHandler");
        b.a.a(bVar4, str2, 0, (String) null, wh0.l.f19962a.g(this.f19392w, this.f19384i, this.n, this.j, this.t, this.D, this.f19386m, this.f19390s, this.J), GetSwiggyHeaderResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    public void K0(qp.a aVar, String str, zp.b bVar) {
        p.j(aVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (!this.f19381f.isFinishing()) {
            super.e(aVar, str, bVar);
            return;
        }
        mp.a aVar2 = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar2, aVar2.a(), 6, (Object) null);
    }

    public void L0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        this.f19388p.a0(true);
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public void O(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        b.a.a(bVar2, str, 0, (String) null, new IsLocationEnabledPayload(this.C.h(this.j)), IsLocationEnabledPayload.Companion.serializer(), 2, (Object) null);
    }

    public void P(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        this.f19388p.a0(false);
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [kotlinx.serialization.json.JsonElement] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P0(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload r12, java.lang.String r13, zp.b r14) {
        /*
            r11 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "requestId"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "responseHandler"
            kotlin.jvm.internal.p.j(r14, r0)
            java.lang.String r0 = r12.d()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r1 = "DEEPLINK"
            boolean r0 = kotlin.jvm.internal.p.e(r0, r1)     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x007d
            kotlinx.serialization.json.JsonElement r0 = r12.c()     // Catch:{ Exception -> 0x0081 }
            boolean r1 = r0 instanceof kotlinx.serialization.json.JsonObject     // Catch:{ Exception -> 0x0081 }
            r2 = 0
            if (r1 == 0) goto L_0x0027
            kotlinx.serialization.json.JsonObject r0 = (kotlinx.serialization.json.JsonObject) r0     // Catch:{ Exception -> 0x0081 }
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x0037
        L_0x002e:
            java.lang.String r4 = "refresh"
            boolean r0 = r0.containsKey(r4)     // Catch:{ Exception -> 0x0081 }
            if (r0 != r1) goto L_0x002c
            r0 = 1
        L_0x0037:
            if (r0 == 0) goto L_0x0053
            android.content.Intent r13 = new android.content.Intent     // Catch:{ Exception -> 0x0081 }
            r13.<init>()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r14 = ".deepLink"
            java.lang.String r0 = r12.b()     // Catch:{ Exception -> 0x0081 }
            r13.putExtra(r14, r0)     // Catch:{ Exception -> 0x0081 }
            androidx.appcompat.app.AppCompatActivity r14 = r11.f19381f     // Catch:{ Exception -> 0x0081 }
            r0 = -1
            r14.setResult(r0, r13)     // Catch:{ Exception -> 0x0081 }
            lp0.a<bp0.k> r13 = r11.q     // Catch:{ Exception -> 0x0081 }
            r13.invoke()     // Catch:{ Exception -> 0x0081 }
            return
        L_0x0053:
            java.lang.String r5 = r12.b()     // Catch:{ Exception -> 0x0081 }
            r6 = 0
            r9 = 2
            r10 = 0
            r4 = r11
            r7 = r13
            r8 = r14
            E1(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0081 }
            kotlinx.serialization.json.JsonElement r13 = r12.c()     // Catch:{ Exception -> 0x0081 }
            boolean r14 = r13 instanceof kotlinx.serialization.json.JsonObject     // Catch:{ Exception -> 0x0081 }
            if (r14 == 0) goto L_0x006b
            r2 = r13
            kotlinx.serialization.json.JsonObject r2 = (kotlinx.serialization.json.JsonObject) r2     // Catch:{ Exception -> 0x0081 }
        L_0x006b:
            if (r2 != 0) goto L_0x006f
        L_0x006d:
            r1 = 0
            goto L_0x0077
        L_0x006f:
            java.lang.String r13 = "shouldCloseWebview"
            boolean r13 = r2.containsKey(r13)     // Catch:{ Exception -> 0x0081 }
            if (r13 != r1) goto L_0x006d
        L_0x0077:
            if (r1 == 0) goto L_0x0085
            r11.U1(r12)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x007d:
            r11.u1(r12, r13, r14)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r13 = move-exception
            r11.G1(r12, r13)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin.P0(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload, java.lang.String, zp.b):void");
    }

    public final void Q1(String str, zp.b bVar) {
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    public void R(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        ClipboardManager clipboardManager = (ClipboardManager) androidx.core.content.a.j(this.f19381f, ClipboardManager.class);
        ClipData newPlainText = ClipData.newPlainText("label", ((CopyToClipBoardPayload) bVar).b());
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public final void R1(int i11) {
        this.K = i11;
    }

    /* access modifiers changed from: protected */
    public final void S1(String str) {
        this.L = str;
    }

    public void T0(StartStopScreenCapturing startStopScreenCapturing, String str, zp.b bVar) {
        p.j(startStopScreenCapturing, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        q.f18281a.c(X0(), this.f19381f, startStopScreenCapturing.b());
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void T1(zp.b bVar) {
        this.M = bVar;
    }

    public void V0(WebViewLastState webViewLastState, String str, zp.b bVar) {
        p.j(webViewLastState, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        pg0.a aVar = this.G;
        if (aVar != null) {
            aVar.a(webViewLastState);
        }
        mp.a aVar2 = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar2, aVar2.a(), 2, (Object) null);
    }

    @SuppressLint({"MissingPermission"})
    public final void V1(Activity activity, e eVar, String str, zp.b bVar) {
        p.j(activity, "activity");
        p.j(eVar, "mUser");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        com.google.android.gms.location.i.a(activity).d(this.j.S(), new d(activity, this, str, bVar), (Looper) null);
    }

    public void a0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        this.L = str;
        this.M = bVar2;
        this.f19381f.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), 5);
    }

    public boolean c() {
        return this.v != null;
    }

    public void d(wp.a aVar, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(aVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        LynxActivity.Companion.b(false);
        super.d(aVar, str, bVar, iLynxViewUpdateHandler);
    }

    public void f(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        WebView webView = this.f19383h;
        if (webView != null) {
            webView.clearHistory();
        }
        Q1(str, bVar2);
    }

    public void f0(CloseWebViewWithParamsRequestPayload closeWebViewWithParamsRequestPayload, String str, zp.b bVar) {
        boolean z11;
        p.j(closeWebViewWithParamsRequestPayload, "closeWebViewWithParamsRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (this.f19386m.contains("payment_pending")) {
            this.f19386m.edit().remove("payment_pending").apply();
        }
        Intent intent = new Intent();
        Map<String, String> b11 = closeWebViewWithParamsRequestPayload.b();
        boolean z12 = false;
        if (!b11.isEmpty()) {
            z11 = false;
            for (Map.Entry next : b11.entrySet()) {
                intent.putExtra((String) next.getKey(), (String) next.getValue());
                if (p.e(next.getKey(), "isBreachResolved") && p.e(next.getValue(), "true")) {
                    z12 = true;
                } else if (p.e(next.getKey(), "isCurrentDeviceLoggedOut") && p.e(next.getValue(), "true")) {
                    z11 = true;
                }
            }
            l1().setResult(-1, intent);
        } else {
            z11 = false;
        }
        if (z12) {
            if (!z11) {
                PublishProcessor<Integer> publishProcessor = this.I;
                if (publishProcessor != null) {
                    publishProcessor.B0(1);
                }
            } else {
                PublishProcessor<Integer> publishProcessor2 = this.I;
                if (publishProcessor2 != null) {
                    publishProcessor2.B0(-1);
                }
            }
        }
        this.q.invoke();
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public void g0(SendClevertapEventRequestPayload sendClevertapEventRequestPayload, String str, zp.b bVar) {
        p.j(sendClevertapEventRequestPayload, "sendClevertapEventRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        ms.h.c(new mh0.k(sendClevertapEventRequestPayload.b(), sendClevertapEventRequestPayload.c(), sendClevertapEventRequestPayload, this), wo0.a.c());
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
        if (!c()) {
            return super.i0(webResourceRequest, dVar);
        }
        p(true);
        return true;
    }

    public void j(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        AppCompatActivity appCompatActivity = this.f19381f;
        Vibrator vibrator = null;
        Object systemService = appCompatActivity == null ? null : appCompatActivity.getSystemService("vibrator");
        if (systemService instanceof Vibrator) {
            vibrator = (Vibrator) systemService;
        }
        if (vibrator != null && vibrator.hasVibrator()) {
            VibratePayload vibratePayload = (VibratePayload) bVar;
            long c11 = vibratePayload.c();
            if (Build.VERSION.SDK_INT < 26) {
                vibrator.vibrate(c11);
            } else {
                int i11 = -1;
                String b11 = vibratePayload.b();
                if (vibrator.hasAmplitudeControl()) {
                    if (b11.length() > 0) {
                        i11 = m1(b11);
                    }
                }
                vibrator.vibrate(VibrationEffect.createOneShot(c11, i11));
            }
            mp.a aVar = mp.a.f53029a;
            b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
        }
    }

    public void j0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        ArrayList arrayList = new ArrayList();
        rp0.f fVar = null;
        String string = this.f19386m.getString("multi_chat_data", (String) null);
        if (string != null) {
            Gson i11 = g0.i();
            p.i(i11, "getGson()");
            Type type = new b().getType();
            List list = (List) (!(i11 instanceof Gson) ? i11.fromJson(string, type) : GsonInstrumentation.fromJson(i11, string, type));
            if (list != null) {
                fVar = k.k(list);
            }
            p.g(fVar);
            int f11 = fVar.f();
            int g11 = fVar.g();
            if (f11 <= g11) {
                while (true) {
                    int i12 = f11 + 1;
                    List<Conversations> conversations = ((Aggregation) list.get(f11)).getConversations();
                    if (conversations == null) {
                        conversations = k.j();
                    }
                    int i13 = 0;
                    int size = conversations.size();
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        Conversations conversations2 = conversations.get(i13);
                        arrayList.add(new UnreadConversationsData(conversations2.getId(), conversations2.getAvatarUrl(), conversations2.getText(), conversations2.getType(), conversations2.getRead(), conversations2.getUpdatedAt()));
                        i13 = i14;
                    }
                    if (f11 == g11) {
                        break;
                    }
                    f11 = i12;
                }
            }
        }
        b.a.a(bVar2, str, 0, (String) null, new GetUnreadConversationsPayloadData(arrayList), GetUnreadConversationsPayloadData.Companion.serializer(), 2, (Object) null);
    }

    public void l(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        AppCompatActivity appCompatActivity = this.f19381f;
        InputMethodManager inputMethodManager = null;
        Object systemService = appCompatActivity == null ? null : appCompatActivity.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new mh0.i(inputMethodManager, this), 1000);
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public final AppCompatActivity l1() {
        return this.f19381f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m0(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsRequestPayload r21, java.lang.String r22, zp.b r23) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "payload"
            r2 = r21
            kotlin.jvm.internal.p.j(r2, r1)
            java.lang.String r1 = "requestId"
            r3 = r22
            kotlin.jvm.internal.p.j(r3, r1)
            java.lang.String r1 = "responseHandler"
            r4 = r23
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = r21.b()
            java.lang.String r5 = "CP_HOMEPAGE_TAKEOVER"
            boolean r1 = kotlin.jvm.internal.p.e(r1, r5)
            if (r1 == 0) goto L_0x0042
            r1 = 0
            r5 = 0
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload r13 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = r0.H
            r11 = 7
            r12 = 0
            r6 = r13
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (kotlin.jvm.internal.i) r12)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload$Companion r2 = in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload.Companion
            kotlinx.serialization.KSerializer r7 = r2.serializer()
            r8 = 6
            r2 = r23
            r3 = r22
            r4 = r1
            zp.b.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0042:
            java.lang.String r1 = r21.b()
            java.lang.String r2 = "CP_INTERVENTION_TIMESTAMPS"
            boolean r1 = kotlin.jvm.internal.p.e(r1, r2)
            r2 = 0
            if (r1 == 0) goto L_0x00a9
            pw.a r1 = r0.F
            qw.a r12 = new qw.a
            r6 = 0
            r7 = 0
            pw.a$a r5 = r1.a()
            if (r5 != 0) goto L_0x005d
            r8 = r2
            goto L_0x0066
        L_0x005d:
            long r8 = r5.a()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r8 = r5
        L_0x0066:
            pw.a$a r1 = r1.b()
            if (r1 != 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            long r1 = r1.a()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x0075:
            r9 = r2
            r10 = 3
            r11 = 0
            r5 = r12
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (java.lang.Long) r8, (java.lang.Long) r9, (int) r10, (kotlin.jvm.internal.i) r11)
            r1 = 0
            r5 = 0
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload r6 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload
            r14 = 0
            r15 = 0
            r16 = 0
            hq0.a r2 = r0.N
            qw.a$b r7 = qw.a.f59462e
            kotlinx.serialization.KSerializer r7 = r7.a()
            java.lang.String r17 = r2.c(r7, r12)
            r18 = 7
            r19 = 0
            r13 = r6
            r13.<init>((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (kotlin.jvm.internal.i) r19)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload$Companion r2 = in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload.Companion
            kotlinx.serialization.KSerializer r7 = r2.serializer()
            r8 = 6
            r9 = 0
            r2 = r23
            r3 = r22
            r4 = r1
            zp.b.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00a9:
            com.google.gson.Gson r1 = os.g0.i()
            java.lang.String r5 = r0.f19395z
            java.lang.Class<ih0.b> r6 = ih0.b.class
            boolean r7 = r1 instanceof com.google.gson.Gson
            if (r7 != 0) goto L_0x00ba
            java.lang.Object r1 = r1.fromJson((java.lang.String) r5, r6)
            goto L_0x00be
        L_0x00ba:
            java.lang.Object r1 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r1, (java.lang.String) r5, r6)
        L_0x00be:
            ih0.b r1 = (ih0.b) r1
            if (r1 != 0) goto L_0x00c4
            goto L_0x012f
        L_0x00c4:
            java.lang.String r5 = r1.b()
            java.lang.String r6 = "SUBSCRIPTION"
            r7 = 1
            boolean r5 = kotlin.text.o.x(r5, r6, r7)
            if (r5 == 0) goto L_0x0108
            java.util.List r5 = r1.a()
            r6 = 0
            if (r5 != 0) goto L_0x00da
        L_0x00d8:
            r7 = 0
            goto L_0x00e1
        L_0x00da:
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r7
            if (r5 != r7) goto L_0x00d8
        L_0x00e1:
            java.lang.String r5 = ""
            if (r7 == 0) goto L_0x0105
            java.util.List r1 = r1.a()
            java.lang.Object r1 = r1.get(r6)
            ih0.a r1 = (ih0.a) r1
            ih0.a$a r1 = r1.a()
            if (r1 != 0) goto L_0x00f6
            goto L_0x0105
        L_0x00f6:
            in.swiggy.android.tejas.feature.search.models.network.response.suggestions.SearchSuggestionResponseItem$Cta r1 = r1.a()
            if (r1 != 0) goto L_0x00fd
            goto L_0x0105
        L_0x00fd:
            java.lang.String r1 = r1.getLink()
            if (r1 != 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r5 = r1
        L_0x0105:
            java.lang.String r1 = "DEEPLINK"
            goto L_0x010e
        L_0x0108:
            java.lang.String r2 = r0.f19395z
            java.lang.String r1 = "SCREEN"
            java.lang.String r5 = "TRACK"
        L_0x010e:
            r7 = r1
            r9 = r2
            r8 = r5
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload r1 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload
            r10 = 0
            r11 = 8
            r12 = 0
            r6 = r1
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (kotlin.jvm.internal.i) r12)
            r5 = 0
            r6 = 0
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload$Companion r2 = in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload.Companion
            kotlinx.serialization.KSerializer r7 = r2.serializer()
            r8 = 6
            r9 = 0
            r2 = r23
            r3 = r22
            r4 = r5
            r5 = r6
            r6 = r1
            zp.b.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin.m0(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsRequestPayload, java.lang.String, zp.b):void");
    }

    public final int m1(String str) {
        p.j(str, "amplitudeStr");
        if (str.equals("heavy")) {
            return OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT;
        }
        return str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM) ? 120 : 30;
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        boolean n11 = super.n(iLynxViewUpdateHandler);
        if (n11) {
            vt.c.f53915a.a(this.K, this.f19381f);
        }
        return n11;
    }

    public final bf0.a n1() {
        return this.f19390s;
    }

    public void o(SetLocationRequestPayload setLocationRequestPayload, String str, zp.b bVar) {
        p.j(setLocationRequestPayload, "setLocationRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        String i11 = setLocationRequestPayload.i();
        boolean z11 = false;
        if (!(i11 == null || i11.length() == 0)) {
            Address address = new Address();
            address.setLatitude(setLocationRequestPayload.k());
            address.setLongitude(setLocationRequestPayload.l());
            address.setCity(setLocationRequestPayload.e());
            address.setArea(setLocationRequestPayload.d());
            address.setAddressString(setLocationRequestPayload.b());
            address.setId(setLocationRequestPayload.i());
            address.setFlatNo(setLocationRequestPayload.h());
            address.setLandmark(setLocationRequestPayload.j());
            address.setAnnotationString(setLocationRequestPayload.c());
            address.setSortScore(setLocationRequestPayload.o());
            address.setName(setLocationRequestPayload.m());
            address.setContactNumber(setLocationRequestPayload.f());
            address.setReverseGeoCodeFailed(Boolean.valueOf(setLocationRequestPayload.n() == 1));
            if (setLocationRequestPayload.g() == 1) {
                z11 = true;
            }
            address.setDefault(z11);
            this.j.G1(address);
        } else {
            Location location = new Location("");
            location.setLatitude(setLocationRequestPayload.k());
            location.setLongitude(setLocationRequestPayload.l());
            this.j.h2(true);
            this.j.V1(location, this.f19394y);
            this.j.v().onNext(location);
            this.j.q0().D0(location);
            this.j.p1().onNext(location);
            this.j.n1().onNext(location);
        }
        Q1(str, bVar);
    }

    public final lp0.a<k> o1() {
        return this.q;
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        zp.b A1;
        super.onActivityResult(i11, i12, intent);
        if (i11 != 5) {
            if (i11 == 99 && i12 == -1) {
                this.q.invoke();
            }
        } else if (i12 == -1 && intent != null) {
            Pair<String, String> a11 = os.d.f53085a.a(this.f19381f, intent);
            PhoneResponsePayload phoneResponsePayload = new PhoneResponsePayload(a11.c(), a11.d());
            String str = this.L;
            if (str != null && (A1 = A1()) != null) {
                b.a.a(A1, str, 0, (String) null, phoneResponsePayload, PhoneResponsePayload.Companion.serializer(), 6, (Object) null);
            }
        }
    }

    public void p(boolean z11) {
        if (c()) {
            this.f19381f.startActivity(this.v);
        }
        this.f19381f.finish();
    }

    public void p0(UpdateConversationIdRequestPayload updateConversationIdRequestPayload, String str, zp.b bVar) {
        p.j(updateConversationIdRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        O = updateConversationIdRequestPayload.b();
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public void t0(VerifyMobileNumberPayload verifyMobileNumberPayload, String str, zp.b bVar) {
        us.f y12;
        p.j(verifyMobileNumberPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        String b11 = verifyMobileNumberPayload.b();
        if (b11 != null && (y12 = y1()) != null) {
            y12.H(l1(), b11, "webEditProfile", 99);
        }
    }

    public final l<mh0.c, k> t1() {
        return this.f19391u;
    }

    public void u(lp.b bVar, String str, zp.b bVar2) {
        UserInfoResponsePayload userInfoResponsePayload;
        p.j(bVar, "userInfoRequestPayload");
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        if (this.f19384i.o0()) {
            String customerId = this.f19384i.getCustomerId();
            p.i(customerId, "user.customerId");
            String name = this.f19384i.getName();
            p.i(name, "user.name");
            String phoneNumber = this.f19384i.getPhoneNumber();
            p.i(phoneNumber, "user.phoneNumber");
            String D0 = this.f19384i.D0();
            p.i(D0, "user.email");
            userInfoResponsePayload = new UserInfoResponsePayload(customerId, name, phoneNumber, D0, this.f19384i.L0());
        } else {
            userInfoResponsePayload = new UserInfoResponsePayload(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES, "", "", "", false);
        }
        b.a.a(bVar2, str, 0, (String) null, userInfoResponsePayload, UserInfoResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025f, code lost:
        r0 = hq0.f.l(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u1(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload r12, java.lang.String r13, zp.b r14) {
        /*
            r11 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "requestId"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "responseHandler"
            kotlin.jvm.internal.p.j(r14, r0)
            java.lang.String r0 = r12.b()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 0
            switch(r1) {
                case -335088979: goto L_0x02a8;
                case -288114315: goto L_0x0241;
                case 2061088: goto L_0x01f6;
                case 2067288: goto L_0x01af;
                case 2223327: goto L_0x0197;
                case 2362719: goto L_0x010e;
                case 80083243: goto L_0x0037;
                case 1251256962: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x02c0
        L_0x001e:
            java.lang.String r1 = "ORDER_DETAIL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x02c0
        L_0x0028:
            java.lang.String r2 = r11.z1(r12)
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r11
            r4 = r13
            r5 = r14
            E1(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02c0
        L_0x0037:
            java.lang.String r13 = "TRACK"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L_0x0041
            goto L_0x02c0
        L_0x0041:
            kotlinx.serialization.json.JsonElement r13 = r12.c()
            boolean r14 = r13 instanceof kotlinx.serialization.json.JsonObject
            if (r14 == 0) goto L_0x004c
            kotlinx.serialization.json.JsonObject r13 = (kotlinx.serialization.json.JsonObject) r13
            goto L_0x004d
        L_0x004c:
            r13 = r3
        L_0x004d:
            java.lang.String r14 = "data"
            r0 = 1
            if (r13 != 0) goto L_0x0054
        L_0x0052:
            r1 = 0
            goto L_0x005b
        L_0x0054:
            boolean r1 = r13.containsKey(r14)
            if (r1 != r0) goto L_0x0052
            r1 = 1
        L_0x005b:
            if (r1 == 0) goto L_0x0064
            java.lang.Object r14 = r13.get(r14)
            kotlinx.serialization.json.JsonElement r14 = (kotlinx.serialization.json.JsonElement) r14
            goto L_0x0065
        L_0x0064:
            r14 = r3
        L_0x0065:
            java.lang.String r1 = "orderId"
            if (r13 != 0) goto L_0x006b
        L_0x0069:
            r4 = 0
            goto L_0x0072
        L_0x006b:
            boolean r4 = r13.containsKey(r1)
            if (r4 != r0) goto L_0x0069
            r4 = 1
        L_0x0072:
            if (r4 == 0) goto L_0x00dd
            java.lang.Object r14 = r13.get(r1)
            kotlinx.serialization.json.JsonElement r14 = (kotlinx.serialization.json.JsonElement) r14
            if (r14 != 0) goto L_0x007e
        L_0x007c:
            r6 = r3
            goto L_0x008a
        L_0x007e:
            kotlinx.serialization.json.JsonPrimitive r14 = hq0.f.l(r14)
            if (r14 != 0) goto L_0x0085
            goto L_0x007c
        L_0x0085:
            java.lang.String r14 = hq0.f.f(r14)
            r6 = r14
        L_0x008a:
            java.lang.String r14 = "hideMakePaymentButton"
            boolean r1 = r13.containsKey(r14)
            if (r1 == 0) goto L_0x00d0
            kotlinx.serialization.json.JsonObject r13 = hq0.f.k(r13)
            java.lang.Object r13 = r13.get(r14)
            kotlinx.serialization.json.JsonElement r13 = (kotlinx.serialization.json.JsonElement) r13
            if (r13 != 0) goto L_0x009f
            goto L_0x00f0
        L_0x009f:
            kotlinx.serialization.json.JsonPrimitive r13 = hq0.f.l(r13)
            if (r13 != 0) goto L_0x00a6
            goto L_0x00f0
        L_0x00a6:
            java.lang.String r13 = hq0.f.f(r13)
            if (r13 != 0) goto L_0x00ad
            goto L_0x00f0
        L_0x00ad:
            java.lang.String r14 = "true"
            boolean r13 = kotlin.jvm.internal.p.e(r13, r14)
            if (r13 == 0) goto L_0x00c1
            uh0.a r13 = r11.C
            androidx.appcompat.app.AppCompatActivity r14 = r11.l1()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.d(r14, r6, r2, r1)
            goto L_0x00f0
        L_0x00c1:
            uh0.a r4 = r11.C
            androidx.appcompat.app.AppCompatActivity r5 = r11.l1()
            r7 = 0
            r8 = 0
            r9 = 8
            r10 = 0
            uh0.a.C0246a.a(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00f0
        L_0x00d0:
            uh0.a r4 = r11.C
            androidx.appcompat.app.AppCompatActivity r5 = r11.f19381f
            r7 = 0
            r8 = 0
            r9 = 8
            r10 = 0
            uh0.a.C0246a.a(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00f0
        L_0x00dd:
            if (r14 == 0) goto L_0x00f0
            uh0.a r13 = r11.C
            androidx.appcompat.app.AppCompatActivity r1 = r11.f19381f
            kotlinx.serialization.json.JsonPrimitive r14 = (kotlinx.serialization.json.JsonPrimitive) r14
            java.lang.String r14 = r14.f()
            java.lang.String r4 = r11.A
            java.lang.String r5 = r11.B
            r13.f(r1, r14, r4, r5)
        L_0x00f0:
            kotlinx.serialization.json.JsonElement r13 = r12.c()
            boolean r14 = r13 instanceof kotlinx.serialization.json.JsonObject
            if (r14 == 0) goto L_0x00fb
            r3 = r13
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3
        L_0x00fb:
            if (r3 != 0) goto L_0x00fe
            goto L_0x0107
        L_0x00fe:
            java.lang.String r13 = "shouldCloseWebview"
            boolean r13 = r3.containsKey(r13)
            if (r13 != r0) goto L_0x0107
            r2 = 1
        L_0x0107:
            if (r2 == 0) goto L_0x02c0
            r11.U1(r12)
            goto L_0x02c0
        L_0x010e:
            java.lang.String r1 = "MENU"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0118
            goto L_0x02c0
        L_0x0118:
            kotlinx.serialization.json.JsonElement r0 = r12.c()
            kotlinx.serialization.json.JsonObject r0 = hq0.f.k(r0)
            java.lang.String r1 = "id"
            java.lang.Object r0 = r0.get(r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 != 0) goto L_0x012c
        L_0x012a:
            r0 = r3
            goto L_0x0137
        L_0x012c:
            kotlinx.serialization.json.JsonPrimitive r0 = hq0.f.l(r0)
            if (r0 != 0) goto L_0x0133
            goto L_0x012a
        L_0x0133:
            java.lang.String r0 = hq0.f.f(r0)
        L_0x0137:
            kotlinx.serialization.json.JsonElement r1 = r12.c()
            kotlinx.serialization.json.JsonObject r1 = hq0.f.k(r1)
            java.lang.String r2 = "query"
            java.lang.Object r1 = r1.get(r2)
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            if (r1 != 0) goto L_0x014b
        L_0x0149:
            r1 = r3
            goto L_0x0156
        L_0x014b:
            kotlinx.serialization.json.JsonPrimitive r1 = hq0.f.l(r1)
            if (r1 != 0) goto L_0x0152
            goto L_0x0149
        L_0x0152:
            java.lang.String r1 = hq0.f.f(r1)
        L_0x0156:
            kotlinx.serialization.json.JsonElement r12 = r12.c()
            kotlinx.serialization.json.JsonObject r12 = hq0.f.k(r12)
            java.lang.String r2 = "source"
            java.lang.Object r12 = r12.get(r2)
            kotlinx.serialization.json.JsonElement r12 = (kotlinx.serialization.json.JsonElement) r12
            if (r12 != 0) goto L_0x0169
            goto L_0x0174
        L_0x0169:
            kotlinx.serialization.json.JsonPrimitive r12 = hq0.f.l(r12)
            if (r12 != 0) goto L_0x0170
            goto L_0x0174
        L_0x0170:
            java.lang.String r3 = hq0.f.f(r12)
        L_0x0174:
            if (r0 != 0) goto L_0x0178
            goto L_0x02c0
        L_0x0178:
            lp0.l r12 = r11.t1()
            if (r12 != 0) goto L_0x017f
            goto L_0x0192
        L_0x017f:
            mh0.c r2 = new mh0.c
            bf0.a r4 = r11.n1()
            boolean r4 = r4.y()
            r2.<init>(r0, r4, r1, r3)
            java.lang.Object r12 = r12.invoke(r2)
            bp0.k r12 = (bp0.k) r12
        L_0x0192:
            r11.Q1(r13, r14)
            goto L_0x02c0
        L_0x0197:
            java.lang.String r12 = "HOME"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x01a1
            goto L_0x02c0
        L_0x01a1:
            lp0.a<bp0.k> r12 = r11.f19389r
            if (r12 != 0) goto L_0x01a7
            goto L_0x02c0
        L_0x01a7:
            r12.invoke()
            r11.Q1(r13, r14)
            goto L_0x02c0
        L_0x01af:
            java.lang.String r1 = "CHAT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b9
            goto L_0x02c0
        L_0x01b9:
            kotlinx.serialization.json.JsonElement r12 = r12.c()
            kotlinx.serialization.json.JsonObject r12 = hq0.f.k(r12)
            java.lang.String r0 = "url"
            java.lang.Object r12 = r12.get(r0)
            kotlinx.serialization.json.JsonElement r12 = (kotlinx.serialization.json.JsonElement) r12
            if (r12 != 0) goto L_0x01cc
            goto L_0x01d7
        L_0x01cc:
            kotlinx.serialization.json.JsonPrimitive r12 = hq0.f.l(r12)
            if (r12 != 0) goto L_0x01d3
            goto L_0x01d7
        L_0x01d3:
            java.lang.String r3 = hq0.f.f(r12)
        L_0x01d7:
            if (r3 != 0) goto L_0x01db
            goto L_0x02c0
        L_0x01db:
            mh0.a r12 = mh0.a.f19753a
            java.lang.String r5 = r12.a(r3)
            us.f r12 = r11.y1()
            if (r12 != 0) goto L_0x01e8
            goto L_0x01eb
        L_0x01e8:
            r12.A()
        L_0x01eb:
            r6 = 0
            r9 = 2
            r10 = 0
            r4 = r11
            r7 = r13
            r8 = r14
            E1(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02c0
        L_0x01f6:
            java.lang.String r1 = "CART"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0200
            goto L_0x02c0
        L_0x0200:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            kotlinx.serialization.json.JsonElement r12 = r12.c()
            kotlinx.serialization.json.JsonObject r12 = hq0.f.k(r12)
            java.lang.String r1 = "refresh"
            java.lang.Object r12 = r12.get(r1)
            kotlinx.serialization.json.JsonElement r12 = (kotlinx.serialization.json.JsonElement) r12
            if (r12 != 0) goto L_0x0218
            goto L_0x0227
        L_0x0218:
            kotlinx.serialization.json.JsonPrimitive r12 = hq0.f.l(r12)
            if (r12 != 0) goto L_0x021f
            goto L_0x0227
        L_0x021f:
            boolean r12 = hq0.f.d(r12)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
        L_0x0227:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = kotlin.jvm.internal.p.e(r3, r12)
            java.lang.String r1 = "refreshCart"
            r0.putExtra(r1, r12)
            androidx.appcompat.app.AppCompatActivity r12 = r11.f19381f
            r12.setResult(r2, r0)
            lp0.a<bp0.k> r12 = r11.q
            r12.invoke()
            r11.Q1(r13, r14)
            goto L_0x02c0
        L_0x0241:
            java.lang.String r1 = "COLLECTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x024b
            goto L_0x02c0
        L_0x024b:
            kotlinx.serialization.json.JsonElement r0 = r12.c()
            kotlinx.serialization.json.JsonObject r0 = hq0.f.k(r0)
            java.lang.String r1 = "collectionId"
            java.lang.Object r0 = r0.get(r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 != 0) goto L_0x025f
        L_0x025d:
            r0 = r3
            goto L_0x026a
        L_0x025f:
            kotlinx.serialization.json.JsonPrimitive r0 = hq0.f.l(r0)
            if (r0 != 0) goto L_0x0266
            goto L_0x025d
        L_0x0266:
            java.lang.String r0 = hq0.f.f(r0)
        L_0x026a:
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x026f
            r0 = r1
        L_0x026f:
            kotlinx.serialization.json.JsonElement r12 = r12.c()
            kotlinx.serialization.json.JsonObject r12 = hq0.f.k(r12)
            java.lang.String r4 = "restaurantId"
            java.lang.Object r12 = r12.get(r4)
            kotlinx.serialization.json.JsonElement r12 = (kotlinx.serialization.json.JsonElement) r12
            if (r12 != 0) goto L_0x0282
            goto L_0x028d
        L_0x0282:
            kotlinx.serialization.json.JsonPrimitive r12 = hq0.f.l(r12)
            if (r12 != 0) goto L_0x0289
            goto L_0x028d
        L_0x0289:
            java.lang.String r3 = hq0.f.f(r12)
        L_0x028d:
            if (r3 != 0) goto L_0x0290
            goto L_0x0291
        L_0x0290:
            r1 = r3
        L_0x0291:
            uh0.a r12 = r11.C
            androidx.appcompat.app.AppCompatActivity r3 = r11.f19381f
            java.lang.String r4 = r11.B
            r12.c(r3, r0, r1, r4)
            androidx.appcompat.app.AppCompatActivity r12 = r11.f19381f
            r12.setResult(r2)
            lp0.a<bp0.k> r12 = r11.q
            r12.invoke()
            r11.Q1(r13, r14)
            goto L_0x02c0
        L_0x02a8:
            java.lang.String r12 = "REFUND_HISTORY"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x02b1
            goto L_0x02c0
        L_0x02b1:
            mh0.a r12 = mh0.a.f19753a
            java.lang.String r1 = r12.d()
            r2 = 0
            r5 = 2
            r6 = 0
            r0 = r11
            r3 = r13
            r4 = r14
            E1(r0, r1, r2, r3, r4, r5, r6)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin.u1(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload, java.lang.String, zp.b):void");
    }

    public void w0(lp.b bVar, String str, zp.b bVar2) {
        Intent intent;
        String packageName;
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        Context applicationContext = this.f19381f.getApplicationContext();
        String str2 = "in.swiggy.android";
        if (!(applicationContext == null || (packageName = applicationContext.getPackageName()) == null)) {
            str2 = packageName;
        }
        try {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse(p.s("package:", str2)));
        } catch (ActivityNotFoundException e11) {
            Intent intent2 = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
            u.h("SwiggyLynxCorePlugin", e11);
            intent = intent2;
        }
        this.f19381f.startActivity(intent);
    }

    public void y0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        this.f19381f.setResult(-1, new Intent());
        this.q.invoke();
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public final us.f y1() {
        return this.f19387o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r0 = hq0.f.l(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String z1(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload r6) {
        /*
            r5 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.p.j(r6, r0)
            kotlinx.serialization.json.JsonElement r0 = r6.c()
            kotlinx.serialization.json.JsonObject r0 = hq0.f.k(r0)
            java.lang.String r1 = "id"
            java.lang.Object r0 = r0.get(r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            r1 = 0
            if (r0 != 0) goto L_0x001a
        L_0x0018:
            r0 = r1
            goto L_0x0025
        L_0x001a:
            kotlinx.serialization.json.JsonPrimitive r0 = hq0.f.l(r0)
            if (r0 != 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            java.lang.String r0 = hq0.f.f(r0)
        L_0x0025:
            kotlinx.serialization.json.JsonElement r2 = r6.c()
            kotlinx.serialization.json.JsonObject r2 = hq0.f.k(r2)
            java.lang.String r3 = "tenant"
            java.lang.Object r2 = r2.get(r3)
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            if (r2 != 0) goto L_0x0039
        L_0x0037:
            r2 = r1
            goto L_0x0044
        L_0x0039:
            kotlinx.serialization.json.JsonPrimitive r2 = hq0.f.l(r2)
            if (r2 != 0) goto L_0x0040
            goto L_0x0037
        L_0x0040:
            java.lang.String r2 = hq0.f.f(r2)
        L_0x0044:
            kotlinx.serialization.json.JsonElement r6 = r6.c()
            kotlinx.serialization.json.JsonObject r6 = hq0.f.k(r6)
            java.lang.String r3 = "expandRefund"
            java.lang.Object r6 = r6.get(r3)
            kotlinx.serialization.json.JsonElement r6 = (kotlinx.serialization.json.JsonElement) r6
            if (r6 != 0) goto L_0x0058
        L_0x0056:
            r6 = r1
            goto L_0x0063
        L_0x0058:
            kotlinx.serialization.json.JsonPrimitive r6 = hq0.f.l(r6)
            if (r6 != 0) goto L_0x005f
            goto L_0x0056
        L_0x005f:
            java.lang.Boolean r6 = hq0.f.e(r6)
        L_0x0063:
            if (r0 != 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r3 = "SW-FOOD"
            if (r6 != 0) goto L_0x006b
            goto L_0x007d
        L_0x006b:
            r6.booleanValue()
            mh0.a r1 = mh0.a.f19753a
            if (r2 != 0) goto L_0x0074
            r4 = r3
            goto L_0x0075
        L_0x0074:
            r4 = r2
        L_0x0075:
            boolean r6 = r6.booleanValue()
            java.lang.String r1 = r1.c(r0, r4, r6)
        L_0x007d:
            if (r1 != 0) goto L_0x0089
            mh0.a r6 = mh0.a.f19753a
            if (r2 != 0) goto L_0x0084
            r2 = r3
        L_0x0084:
            java.lang.String r6 = r6.b(r0, r2)
            r1 = r6
        L_0x0089:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin.z1(in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload):java.lang.String");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwiggyLynxCorePlugin(AppCompatActivity appCompatActivity, jz.c cVar, WebView webView, e eVar, n nVar, fr.e eVar2, Class<?> cls, SharedPreferences sharedPreferences, ps.b bVar, us.f fVar, fi0.a aVar, lp0.a<k> aVar2, lp0.a<k> aVar3, bf0.a aVar4, String str, l<? super mh0.c, k> lVar, Intent intent, String str2, eo0.a aVar5, o oVar, String str3, String str4, String str5, uh0.a aVar6, f fVar2, jr.a aVar7, pw.a aVar8, pg0.a aVar9, String str6, PublishProcessor<Integer> publishProcessor, os.a aVar10) {
        super(appCompatActivity);
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        jz.c cVar2 = cVar;
        e eVar3 = eVar;
        n nVar2 = nVar;
        fr.e eVar4 = eVar2;
        Class<?> cls2 = cls;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        ps.b bVar2 = bVar;
        fi0.a aVar11 = aVar;
        lp0.a<k> aVar12 = aVar2;
        bf0.a aVar13 = aVar4;
        String str7 = str;
        String str8 = str2;
        eo0.a aVar14 = aVar5;
        String str9 = str3;
        p.j(appCompatActivity2, "activity");
        p.j(cVar2, "deepLinkHandler");
        p.j(eVar3, LogSubCategory.Action.USER);
        p.j(nVar2, "locationContext");
        p.j(eVar4, "mSwiggyEventLogger");
        p.j(cls2, "clazz");
        p.j(sharedPreferences2, "appSharedPreferences");
        p.j(bVar2, "contextService");
        p.j(aVar11, "webViewClientCommunicationHandler");
        p.j(aVar12, "closeFunction");
        p.j(aVar13, "cart");
        p.j(str7, "webFlow");
        p.j(str8, "urlForGetHeaders");
        p.j(aVar14, "subscriptions");
        p.j(oVar, "userLocationManager");
        p.j(str3, "orderJsonString");
        p.j(str4, "source");
        p.j(str5, "launchScreenName");
        p.j(aVar6, "mSwiggyLynxInterface");
        p.j(fVar2, "xpExperimentContext");
        p.j(aVar7, "newrelicPerformanceUtils");
        p.j(aVar8, "crossPollinationDataManager");
        p.j(aVar10, "appBuildDetails");
        this.f19381f = appCompatActivity2;
        this.f19382g = cVar2;
        this.f19383h = webView;
        this.f19384i = eVar3;
        this.j = nVar2;
        this.k = eVar4;
        this.f19385l = cls2;
        this.f19386m = sharedPreferences2;
        this.n = bVar2;
        this.f19387o = fVar;
        this.f19388p = aVar11;
        this.q = aVar12;
        this.f19389r = aVar3;
        this.f19390s = aVar13;
        this.t = str7;
        this.f19391u = lVar;
        this.v = intent;
        this.f19392w = str8;
        this.f19393x = aVar14;
        this.f19394y = oVar;
        this.f19395z = str3;
        this.A = str4;
        this.B = str5;
        this.C = aVar6;
        this.D = fVar2;
        this.E = aVar7;
        this.F = aVar8;
        this.G = aVar9;
        this.H = str6;
        this.I = publishProcessor;
        this.J = aVar10;
        this.N = hq0.k.b((hq0.a) null, SwiggyLynxCorePlugin$json$1.f19403a, 1, (Object) null);
    }
}
