package in.swiggy.android.reactnative;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import cg0.n;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import ef0.e;
import eo0.a;
import eo0.b;
import in.swiggy.android.reactnative.dinersone.DinersOneUtils;
import java.util.LinkedHashMap;
import java.util.Objects;
import jz.c;
import kotlin.jvm.internal.p;
import os.u;
import se0.d;
import se0.h;
import us.f;

/* compiled from: SwiggyRNModule.kt */
public final class SwiggyRNModule extends ReactContextBaseJavaModule {
    private Long mAppStartTime;
    private c mDeeplinkHandler;
    private n mLocationContext;
    private f mNavigation;
    private final ReactContext mReactContext;
    private SharedPreferences mSharedPreferences;
    private a mSubscriptions;
    private e mUser;
    private final String moduleName = "SwiggyRNModule";
    public jr.a newrelicPerformanceUtils;
    private boolean traceEventFired;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwiggyRNModule(ReactApplicationContext reactApplicationContext, n nVar, f fVar, c cVar, SharedPreferences sharedPreferences, e eVar, a aVar, Long l11) {
        super(reactApplicationContext);
        p.j(reactApplicationContext, "reactContext");
        this.mLocationContext = nVar;
        this.mNavigation = fVar;
        this.mDeeplinkHandler = cVar;
        this.mSharedPreferences = sharedPreferences;
        this.mUser = eVar;
        this.mSubscriptions = aVar;
        this.mAppStartTime = l11;
        this.mReactContext = reactApplicationContext;
        setNewrelicPerformanceUtils(new jr.c(reactApplicationContext, "true"));
    }

    /* access modifiers changed from: private */
    /* renamed from: openLogin$lambda-0  reason: not valid java name */
    public static final void m3openLogin$lambda0(e eVar, Callback callback, Boolean bool) {
        p.j(callback, "$callback");
        if (eVar.o0()) {
            callback.invoke(h.b(eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openLogin$lambda-1  reason: not valid java name */
    public static final void m4openLogin$lambda1(Throwable th2) {
        u.h("React native Login Failed", th2);
    }

    @ReactMethod
    public final void exit() {
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.onBackPressed();
        }
    }

    @ReactMethod
    public final void fetchCurrentLocation(Callback callback) {
        p.j(callback, "callback");
        callback.invoke(DinersOneUtils.e(this.mLocationContext));
    }

    @SuppressLint({"CommitPrefEdits"})
    @ReactMethod
    public final void forceRefreshHomeScreen() {
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences != null) {
            js.a.b(sharedPreferences, "home_screen_force_refresh_flag", Boolean.TRUE);
        }
    }

    public String getName() {
        return this.moduleName;
    }

    public final jr.a getNewrelicPerformanceUtils() {
        jr.a aVar = this.newrelicPerformanceUtils;
        if (aVar != null) {
            return aVar;
        }
        p.B("newrelicPerformanceUtils");
        return null;
    }

    @ReactMethod
    public final void hideSplashScreen() {
        if (getCurrentActivity() != null) {
            d dVar = d.f19868a;
            Activity currentActivity = getCurrentActivity();
            p.g(currentActivity);
            dVar.c(currentActivity);
        }
    }

    @ReactMethod
    public final void launchDeeplink(String str) {
        p.j(str, "deeplinkUri");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(603979776);
        c cVar = this.mDeeplinkHandler;
        if (cVar != null) {
            Activity currentActivity = getCurrentActivity();
            Objects.requireNonNull(currentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            cVar.a(intent, (AppCompatActivity) currentActivity, true);
        }
    }

    @ReactMethod
    public final void openLogin(Callback callback) {
        p.j(callback, "callback");
        Activity currentActivity = getCurrentActivity();
        e eVar = this.mUser;
        if (currentActivity != null && eVar != null) {
            f fVar = this.mNavigation;
            if (fVar != null) {
                fVar.b0(currentActivity);
            }
            b h02 = eVar.g1().m0(wo0.a.c()).Q(do0.a.a()).h0(new se0.e(eVar, callback), se0.f.f28632a);
            a aVar = this.mSubscriptions;
            if (aVar != null) {
                aVar.c(h02);
            }
        }
    }

    public final void setNewrelicPerformanceUtils(jr.a aVar) {
        p.j(aVar, "<set-?>");
        this.newrelicPerformanceUtils = aVar;
    }

    @ReactMethod
    public final void startPerfMonitor(String str) {
        p.j(str, "eventName");
        getNewrelicPerformanceUtils().c("", str);
    }

    @ReactMethod
    public final void stopInitialLoadTrace(String str) {
        p.j(str, "eventName");
        if (!this.traceEventFired) {
            Long l11 = this.mAppStartTime;
            getNewrelicPerformanceUtils().i(str, System.currentTimeMillis() - (l11 == null ? 0 : l11.longValue()), new LinkedHashMap());
            this.traceEventFired = true;
        }
    }

    @ReactMethod
    public final void stopPerfMonitor(String str) {
        p.j(str, "eventName");
        getNewrelicPerformanceUtils().k("", str);
    }
}
