package in.swiggy.android.reactnative.dinersone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import cg0.n;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.newrelic.agent.android.NewRelic;
import fr.e;
import in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs;
import in.swiggy.android.swiggylynx.ui.LynxActivity;
import in.swiggy.android.swiggylynx.ui.LynxData;
import ir.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jz.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import os.g0;
import os.u;
import se0.d;
import ue0.g;
import ue0.h;
import ue0.k;
import ue0.l;
import us.f;
import wh0.j;

/* compiled from: DinersOneModule.kt */
public final class DinersOneModule extends ReactContextBaseJavaModule {
    private c deepLinkHandler;
    private og0.a defaultHeaders;
    private k dinersFragmentHandler;
    private l dinersHandler;
    private n locationContext;
    private final ReactContext mReactContext;
    private final String moduleName = "DinersOneModule";
    private f navigation;
    private String newRelicAPIErrorEventName = "api_error";
    private String newRelicAPILoadEventName = "api_load";
    private String newRelicAPITableName = "dineout_custom_client_event";
    private String newRelicTagName = "NewrelicPerformanceUtils";
    private jr.a newrelicPerformanceUtils;
    private SharedPreferences sharedPreferences;
    private b swiggyEventHandler;
    private e swiggyEventLogger;

    /* compiled from: DinersOneModule.kt */
    public static final class a implements hd0.c {
        a() {
        }

        public /* synthetic */ void a(Context context) {
            hd0.b.a(this, context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DinersOneModule(ReactApplicationContext reactApplicationContext, n nVar, f fVar, c cVar, og0.a aVar, b bVar, e eVar, SharedPreferences sharedPreferences2, k kVar, l lVar) {
        super(reactApplicationContext);
        p.j(reactApplicationContext, "reactContext");
        this.locationContext = nVar;
        this.navigation = fVar;
        this.deepLinkHandler = cVar;
        this.defaultHeaders = aVar;
        this.swiggyEventHandler = bVar;
        this.swiggyEventLogger = eVar;
        this.sharedPreferences = sharedPreferences2;
        this.dinersFragmentHandler = kVar;
        this.dinersHandler = lVar;
        this.mReactContext = reactApplicationContext;
        this.newrelicPerformanceUtils = new jr.c(reactApplicationContext, "true");
    }

    private final void clearFoodCartCookie(String str) {
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            Object[] array = new Regex(";").i(cookie, 0).toArray(new String[0]);
            p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                Object[] array2 = new Regex("=").i(strArr[i11], 0).toArray(new String[0]);
                p.h(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr2 = (String[]) array2;
                if (p.e(StringsKt__StringsKt.i1(strArr2[0]).toString(), "x-web-checkout-flow")) {
                    instance.setCookie(str, p.s(strArr2[0], "=;"));
                    return;
                }
                i11 = i12;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: toggleBottomBar$lambda-9$lambda-8  reason: not valid java name */
    public static final void m5toggleBottomBar$lambda9$lambda8(DinersOneModule dinersOneModule, Activity activity, boolean z11) {
        p.j(dinersOneModule, "this$0");
        p.j(activity, "$it");
        f fVar = dinersOneModule.navigation;
        if (fVar != null) {
            fVar.J(activity, z11);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: toggleStatusBar$lambda-11  reason: not valid java name */
    public static final void m6toggleStatusBar$lambda11(DinersOneModule dinersOneModule, boolean z11) {
        p.j(dinersOneModule, "this$0");
        Activity currentActivity = dinersOneModule.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity != null) {
            vt.c.f53915a.d(!z11, fragmentActivity);
        }
    }

    @ReactMethod
    public final void fetchCurrentLocation(Callback callback) {
        p.j(callback, "callback");
        callback.invoke(DinersOneUtils.e(this.locationContext));
    }

    public String getName() {
        return this.moduleName;
    }

    public final jr.a getNewrelicPerformanceUtils() {
        return this.newrelicPerformanceUtils;
    }

    @ReactMethod
    public final void hideSplashScreen() {
        d.f19868a.c(getCurrentActivity());
    }

    @ReactMethod
    public final void isNetworkAvailable(Promise promise) {
        p.j(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(Boolean.valueOf(g0.s(this.mReactContext)));
    }

    @ReactMethod
    public final void launchApplyCoupon(String str, double d11) {
        Activity currentActivity;
        f fVar;
        p.j(str, "restId");
        ReactContext reactContext = this.mReactContext;
        if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null && (fVar = this.navigation) != null) {
            fVar.G(currentActivity, 3, "cart", str, d11, Boolean.TRUE);
        }
    }

    @ReactMethod
    public final void launchDeeplink(String str) {
        p.j(str, "deeplinkUri");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(603979776);
        c cVar = this.deepLinkHandler;
        if (cVar != null) {
            Activity currentActivity = getCurrentActivity();
            Objects.requireNonNull(currentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            cVar.a(intent, (AppCompatActivity) currentActivity, true);
        }
    }

    @ReactMethod
    public final void launchSuperV3LandingPage(String str) {
        f fVar;
        p.j(str, "url");
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity != null && (fVar = this.navigation) != null) {
            fVar.d(currentActivity, str);
        }
    }

    @ReactMethod
    public final void logAPIErrorPerfMonitor(String str, String str2, String str3) {
        p.j(str, "screenName");
        p.j(str2, "queryName");
        p.j(str3, "status");
        boolean z11 = true;
        if (!(str.length() == 0)) {
            if (!(str2.length() == 0)) {
                if (str3.length() != 0) {
                    z11 = false;
                }
                if (!z11 && !lr.a.f53004a.c(str3)) {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("status", str3);
                        hashMap.put("screen", str);
                        hashMap.put("query_name", str2);
                        NewRelic.recordCustomEvent(this.newRelicAPITableName, this.newRelicAPIErrorEventName, hashMap);
                    } catch (Throwable th2) {
                        u.h(this.newRelicTagName, th2);
                    }
                }
            }
        }
    }

    @ReactMethod
    public final void logAPILoadPerfMonitor(String str, String str2, String str3) {
        p.j(str, "screenName");
        p.j(str2, "queryName");
        p.j(str3, "time");
        boolean z11 = true;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("screen", str);
                    hashMap.put("query_name", str2);
                    hashMap.put("time_in_millis", Long.valueOf(Long.parseLong(str3)));
                    NewRelic.recordCustomEvent(this.newRelicAPITableName, this.newRelicAPILoadEventName, hashMap);
                } catch (Throwable th2) {
                    u.h(this.newRelicTagName, th2);
                }
            }
        }
    }

    @ReactMethod
    public final void logClevertapEvent(String str, ReadableMap readableMap) {
        Iterator<Map.Entry<String, Object>> it2;
        HashMap hashMap = new HashMap();
        if (readableMap == null) {
            it2 = null;
        } else {
            it2 = readableMap.getEntryIterator();
        }
        if (it2 != null) {
            while (it2.hasNext()) {
                Map.Entry next = it2.next();
                hashMap.put(next.getKey(), next.getValue());
            }
        }
        e eVar = this.swiggyEventLogger;
        if (eVar != null) {
            eVar.J(hashMap, str);
        }
    }

    @ReactMethod
    public final void logClickEvent(String str, String str2, String str3, int i11, String str4) {
        b bVar = this.swiggyEventHandler;
        gr.f k = bVar == null ? null : bVar.k(str, str2, str3, i11, str4);
        b bVar2 = this.swiggyEventHandler;
        if (bVar2 != null) {
            bVar2.j(k);
        }
    }

    @ReactMethod
    public final void logImpression(String str, String str2, String str3, int i11, String str4) {
        b bVar = this.swiggyEventHandler;
        gr.f k = bVar == null ? null : bVar.k(str, str2, str3, i11, str4);
        b bVar2 = this.swiggyEventHandler;
        if (bVar2 != null) {
            bVar2.i(k);
        }
    }

    @ReactMethod
    public final void logNative(String str) {
        p.j(str, "str");
        Log.d("logNative: ", str);
    }

    @ReactMethod
    public final void logScreenViewed(String str) {
        b bVar = this.swiggyEventHandler;
        if (bVar != null) {
            bVar.f(str);
        }
    }

    @ReactMethod
    public final void openLocationSearch() {
        f fVar;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (fVar = this.navigation) != null) {
            fVar.D(currentActivity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r1 = r1.getString("web_payment_url", "");
     */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openPaymentWebView(com.facebook.react.bridge.ReadableMap r23) {
        /*
            r22 = this;
            r0 = r22
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            og0.a r1 = r0.defaultHeaders
            if (r1 != 0) goto L_0x000c
            goto L_0x0016
        L_0x000c:
            java.util.HashMap r1 = r1.a()
            if (r1 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r5.putAll(r1)
        L_0x0016:
            r10 = 0
            if (r23 != 0) goto L_0x001b
            r1 = r10
            goto L_0x001f
        L_0x001b:
            java.util.Iterator r1 = r23.getEntryIterator()
        L_0x001f:
            if (r1 == 0) goto L_0x003d
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r5.put(r3, r2)
            goto L_0x0021
        L_0x003d:
            in.swiggy.android.swiggylynx.plugin.SwiggyLynxPluginData$PaymentLynxPluginData r1 = new in.swiggy.android.swiggylynx.plugin.SwiggyLynxPluginData$PaymentLynxPluginData
            r1.<init>(r10)
            java.util.Set r6 = kotlin.collections.c0.a(r1)
            android.content.SharedPreferences r1 = r0.sharedPreferences
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x004e
        L_0x004c:
            r11 = r2
            goto L_0x0058
        L_0x004e:
            java.lang.String r3 = "web_payment_url"
            java.lang.String r1 = r1.getString(r3, r2)
            if (r1 != 0) goto L_0x0057
            goto L_0x004c
        L_0x0057:
            r11 = r1
        L_0x0058:
            boolean r1 = in.swiggy.android.commons.extension.StringExtensionsKt.d(r11)
            if (r1 == 0) goto L_0x0060
            r2 = r11
            goto L_0x0063
        L_0x0060:
            java.lang.String r1 = "https://payments.swiggy.com"
            r2 = r1
        L_0x0063:
            in.swiggy.android.swiggylynx.ui.LynxData r13 = new in.swiggy.android.swiggylynx.ui.LynxData
            r3 = 0
            r4 = 1
            r7 = 0
            r8 = 32
            r9 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.clearFoodCartCookie(r11)
            com.facebook.react.bridge.ReactContext r1 = r0.mReactContext
            android.app.Activity r1 = r1.getCurrentActivity()
            if (r1 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            in.swiggy.android.reactnative.dinersone.DinersOneModule$a r2 = new in.swiggy.android.reactnative.dinersone.DinersOneModule$a
            r2.<init>()
            r2.a(r1)
        L_0x0083:
            com.facebook.react.bridge.ReactContext r1 = r0.mReactContext
            android.app.Activity r1 = r1.getCurrentActivity()
            if (r1 != 0) goto L_0x008c
            goto L_0x00bd
        L_0x008c:
            int r2 = r13.getRequestCode()
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<in.swiggy.android.swiggylynx.ui.LynxActivity> r4 = in.swiggy.android.swiggylynx.ui.LynxActivity.class
            r3.<init>(r1, r4)
            wh0.j r4 = new wh0.j
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 126(0x7e, float:1.77E-43)
            r21 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            android.os.Bundle r4 = r4.h()
            r3.putExtras(r4)
            r4 = -9
            if (r2 != r4) goto L_0x00ba
            r1.startActivity(r3, r10)
            goto L_0x00bd
        L_0x00ba:
            r1.startActivityForResult(r3, r2, r10)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.reactnative.dinersone.DinersOneModule.openPaymentWebView(com.facebook.react.bridge.ReadableMap):void");
    }

    @ReactMethod
    public final void openStaticWebView(String str) {
        p.j(str, "url");
        f fVar = this.navigation;
        if (fVar != null) {
            fVar.x(this.mReactContext, str);
        }
    }

    @ReactMethod
    public final void openWebView(String str) {
        Activity currentActivity;
        String str2 = str;
        p.j(str2, "url");
        LynxData lynxData = new LynxData(str2, true, 2, (Map) null, (Set) null, (Intent) null, 56, (i) null);
        ReactContext reactContext = this.mReactContext;
        if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null) {
            int requestCode = lynxData.getRequestCode();
            Intent intent = new Intent(currentActivity, LynxActivity.class);
            intent.putExtras(new j(lynxData, false, (DeliveryRatingClickEventNavArgs) null, (String) null, (String) null, (String) null, (String) null, 126, (i) null).h());
            if (requestCode == -9) {
                currentActivity.startActivity(intent, (Bundle) null);
            } else {
                currentActivity.startActivityForResult(intent, requestCode, (Bundle) null);
            }
        }
    }

    public final void setNewrelicPerformanceUtils(jr.a aVar) {
        p.j(aVar, "<set-?>");
        this.newrelicPerformanceUtils = aVar;
    }

    @ReactMethod
    public final void startPerfMonitor(String str, String str2) {
        p.j(str, "screenName");
        p.j(str2, "eventName");
        this.newrelicPerformanceUtils.c(String.valueOf(str), String.valueOf(str2));
    }

    @ReactMethod
    public final void stopInitialLoadTrace(String str, String str2) {
        p.j(str, "screenName");
        p.j(str2, "eventName");
        Activity currentActivity = getCurrentActivity();
        DinersOneActivity dinersOneActivity = currentActivity instanceof DinersOneActivity ? (DinersOneActivity) currentActivity : null;
        if (dinersOneActivity != null && !dinersOneActivity.g1()) {
            Long d12 = dinersOneActivity.d1();
            getNewrelicPerformanceUtils().i(str2, System.currentTimeMillis() - (d12 == null ? 0 : d12.longValue()), new LinkedHashMap());
            dinersOneActivity.l1();
        }
    }

    @ReactMethod
    public final void stopPerfMonitor(String str, String str2) {
        p.j(str, "screenName");
        p.j(str2, "eventName");
        this.newrelicPerformanceUtils.k(String.valueOf(str), String.valueOf(str2));
    }

    @ReactMethod
    public final void toggleBottomBar(boolean z11) {
        Activity currentActivity;
        k kVar = this.dinersFragmentHandler;
        boolean z12 = false;
        if (kVar != null && kVar.X()) {
            z12 = true;
        }
        if (z12 && (currentActivity = getCurrentActivity()) != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, currentActivity, z11));
        }
    }

    @ReactMethod
    public final void toggleStatusBar(boolean z11) {
        k kVar = this.dinersFragmentHandler;
        boolean z12 = false;
        if (!(kVar != null && kVar.X())) {
            l lVar = this.dinersHandler;
            if (lVar != null && lVar.h0()) {
                z12 = true;
            }
            if (!z12) {
                return;
            }
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new h(this, z11));
        }
    }

    @ReactMethod
    public final void unMountActivity() {
        bp0.k kVar;
        Activity currentActivity;
        k kVar2 = this.dinersFragmentHandler;
        if (kVar2 == null) {
            kVar = null;
        } else {
            kVar2.m();
            kVar = bp0.k.f22762a;
        }
        if (kVar == null && (currentActivity = this.mReactContext.getCurrentActivity()) != null) {
            currentActivity.onBackPressed();
            bp0.k kVar3 = bp0.k.f22762a;
        }
    }
}
