package p5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import b6.c;
import co.hyperverge.crashguard.CrashGuard;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Product;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region;
import co.hyperverge.hypersnapsdk.objects.d;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import v5.d;
import w5.h;
import w5.l;
import w5.n;
import w5.o;
import z5.e;
import z5.g;

/* compiled from: HyperSnapSDK */
public class a {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f16241c = "co.hyperverge.hypersnapsdk.HyperSnapSDK";

    /* renamed from: d  reason: collision with root package name */
    private static d f16242d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static a f16243e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f16244f;

    /* renamed from: a  reason: collision with root package name */
    private boolean f16245a = false;

    /* renamed from: b  reason: collision with root package name */
    private c f16246b;

    /* renamed from: p5.a$a  reason: collision with other inner class name */
    /* compiled from: HyperSnapSDK */
    class C0168a implements d.b {
        C0168a() {
        }

        public void a(HVError hVError) {
            String a11 = a.f16241c;
            Log.e(a11, "onError: " + hVError.getErrorMessage());
            n.w().g(h.a());
            n.w().o(true);
        }

        public void onSuccess() {
            n.w().o(true);
        }
    }

    /* compiled from: HyperSnapSDK */
    class b implements d.b {
        b() {
        }

        public void a(HVError hVError) {
            a.this.l();
        }

        public void onSuccess() {
            a.this.l();
        }
    }

    private a() {
    }

    public static void A(Boolean bool) {
        f16242d.setShouldLogOnlyErrors(bool.booleanValue());
    }

    public static void B(boolean z11) {
        f16242d.setShouldReturnRawResponse(z11);
    }

    private void b(Context context) {
        n.w().d(n.w().j(context));
        co.hyperverge.hypersnapsdk.objects.d s11 = s();
        HashMap hashMap = new HashMap();
        hashMap.put("hv_app_id", s11.getAppId());
        hashMap.put("hv_hs_sdk_version", "3.6.23");
        co.hyperverge.hypersnapsdk.objects.c hyperKYCConfigs = s11.getHyperKYCConfigs();
        if (hyperKYCConfigs != null) {
            HashMap<String, String> hyperKYCValueMap = hyperKYCConfigs.getHyperKYCValueMap();
            for (String next : hyperKYCValueMap.values()) {
                hashMap.put(next, hyperKYCValueMap.get(next));
            }
        }
        if (g.p(context)) {
            try {
                CrashGuard.h(context).j(n(), p(), new CrashGuard.b(Collections.singletonList(i()), hashMap));
            } catch (Exception | NoClassDefFoundError e11) {
                String str = f16241c;
                String message = e11.getMessage();
                Objects.requireNonNull(message);
                Log.e(str, message);
            }
        }
    }

    private void c(Context context, HyperSnapParams$Region hyperSnapParams$Region) {
        try {
            n.w().k(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e11) {
            String str = f16241c;
            String message = e11.getMessage();
            Objects.requireNonNull(message);
            Log.e(str, message);
            n.w().j(context).a(e11);
        }
        n.w().f(context.getPackageName());
        if (hyperSnapParams$Region == HyperSnapParams$Region.INDIA) {
            n.w().n(n.w().v());
        } else if (hyperSnapParams$Region == HyperSnapParams$Region.ASIA_PACIFIC) {
            n.w().n(n.w().q());
        }
    }

    private void d(Context context, co.hyperverge.hypersnapsdk.objects.d dVar) {
        if (!w()) {
            o(context);
        }
        if (dVar.isShouldActivateDeviceBlocklist()) {
            w5.a.a().b(context);
        }
        l.a(context);
        m(context);
        j(context);
        r();
        this.f16245a = true;
        n.w().a(context).o();
    }

    @Deprecated
    private static void e(Context context, String str, String str2, HyperSnapParams$Region hyperSnapParams$Region, HyperSnapParams$Product hyperSnapParams$Product, String str3) {
        f16242d.setAppId(str);
        f16242d.setAppKey(str2);
        f16242d.setHyperSnapRegion(hyperSnapParams$Region);
        if (hyperSnapParams$Region == HyperSnapParams$Region.India) {
            f16242d.setHyperSnapRegion(HyperSnapParams$Region.INDIA);
        } else if (hyperSnapParams$Region == HyperSnapParams$Region.AsiaPacific) {
            f16242d.setHyperSnapRegion(HyperSnapParams$Region.ASIA_PACIFIC);
        }
        f16242d.setHyperSnapProduct(hyperSnapParams$Product);
        if (!e.a(str3)) {
            f16242d.setAccessToken(str3);
        }
        f16244f = true;
        t().u(context, f16242d, (c) null);
    }

    private void f(co.hyperverge.hypersnapsdk.objects.d dVar) {
        v5.d.c().f(dVar.getAppId(), false, new b());
    }

    private void g(String str, int i11) {
        if (this.f16246b != null) {
            HVError hVError = new HVError();
            hVError.setErrorCode(i11);
            hVError.setErrorMessage(str);
            this.f16246b.a(hVError);
            if (t().s() != null && t().s().isShouldUseRemoteConfig() && y5.a.a().c() != null) {
                y5.a.a().c().a(hVError, false);
            }
        }
    }

    private String i() {
        co.hyperverge.hypersnapsdk.objects.c hyperKYCConfigs = s().getHyperKYCConfigs();
        return (hyperKYCConfigs == null || TextUtils.isEmpty(hyperKYCConfigs.getSentryFilter())) ? "co.hyperverge" : hyperKYCConfigs.getSentryFilter();
    }

    private void j(Context context) {
        n.w().e(new j6.a(context));
    }

    private boolean k(Context context, co.hyperverge.hypersnapsdk.objects.d dVar) {
        if (context == null) {
            g("Context object should not be null", 6);
            return false;
        } else if (dVar == null) {
            g("HyperSnapSDKConfig object should not be null", 6);
            return false;
        } else if (e.a(dVar.getAppId())) {
            g("appId is compulsory", 6);
            return false;
        } else {
            boolean a11 = e.a(dVar.getAppKey());
            boolean a12 = e.a(dVar.getAccessToken());
            if (a11 && a12) {
                g("Either appKey or accessToken are empty/null; Set either of them", 6);
                return false;
            } else if (!a11 && !a12) {
                g("Set either appKey or appId, not both", 6);
                return false;
            } else if (dVar.getHyperSnapRegion() == null || !(dVar.getHyperSnapRegion() == HyperSnapParams$Region.INDIA || dVar.getHyperSnapRegion() == HyperSnapParams$Region.ASIA_PACIFIC)) {
                g("Invalid region", 6);
                return false;
            } else if (!dVar.isShouldUseLocation() || q(context)) {
                return true;
            } else {
                g("Location permission not available while location config is set to true", 8);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"LogNotTimber"})
    public void l() {
        v5.d.c().e("3.6.23", new C0168a());
    }

    private void m(Context context) {
        try {
            n.w().h(new q5.a(context));
            n.w().p(true);
        } catch (Exception | NoClassDefFoundError e11) {
            String str = f16241c;
            String message = e11.getMessage();
            Objects.requireNonNull(message);
            Log.e(str, message);
            n.w().j(context).a(e11);
            n.w().p(false);
        }
    }

    private String n() {
        co.hyperverge.hypersnapsdk.objects.c hyperKYCConfigs = s().getHyperKYCConfigs();
        return (hyperKYCConfigs == null || TextUtils.isEmpty(hyperKYCConfigs.getSentryEndPoint())) ? "https://5f0c7fd2678f44beba342ffbd306984e@o435277.ingest.sentry.io/api/6019750/store/" : hyperKYCConfigs.getSentryEndPoint();
    }

    private void o(Context context) {
        try {
            f5.a.c(context.getApplicationContext(), 2);
            n.w().i(true);
        } catch (NoClassDefFoundError e11) {
            String str = f16241c;
            String message = e11.getMessage();
            Objects.requireNonNull(message);
            Log.e(str, message);
            n.w().j(context).a(e11);
            n.w().i(false);
        } catch (MissingLibraryException | UnsatisfiedLinkError e12) {
            String str2 = f16241c;
            String message2 = e12.getMessage();
            Objects.requireNonNull(message2);
            Log.e(str2, message2);
            n.w().j(context).a(e12);
            n.w().l(true);
        }
    }

    private String p() {
        co.hyperverge.hypersnapsdk.objects.c hyperKYCConfigs = s().getHyperKYCConfigs();
        return (hyperKYCConfigs == null || TextUtils.isEmpty(hyperKYCConfigs.getSentryKey())) ? "5f0c7fd2678f44beba342ffbd306984e" : hyperKYCConfigs.getSentryKey();
    }

    private boolean q(Context context) {
        return androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void r() {
        c cVar = this.f16246b;
        if (cVar != null) {
            cVar.onSuccess();
            if (t().s().isShouldUseRemoteConfig()) {
                y5.a.a().c().a((HVError) null, true);
            }
        }
    }

    public static a t() {
        if (f16243e == null) {
            f16243e = new a();
        }
        return f16243e;
    }

    public static void v(Context context, String str, String str2, HyperSnapParams$Region hyperSnapParams$Region) {
        e(context, str, str2, hyperSnapParams$Region, HyperSnapParams$Product.FACEID, (String) null);
    }

    public static boolean x() {
        return t().w();
    }

    public static boolean y() {
        if (x()) {
            return !TextUtils.isEmpty(o.r());
        }
        return false;
    }

    public static void z(int i11, int i12, int i13) {
        f16242d.setConnectTimeOut(i11);
        f16242d.setReadTimeOut(i12);
        f16242d.setWriteTimeOut(i13);
    }

    public co.hyperverge.hypersnapsdk.objects.d s() {
        return f16242d;
    }

    public void u(Context context, co.hyperverge.hypersnapsdk.objects.d dVar, c cVar) {
        f16242d = dVar;
        this.f16246b = cVar;
        if (k(context, dVar)) {
            b(context);
            c(context, dVar.getHyperSnapRegion());
            o.e(context);
            if (dVar.isShouldUseRemoteConfig()) {
                f(dVar);
            } else {
                n.w().b();
                l();
            }
            d(context, dVar);
        }
    }

    public boolean w() {
        return this.f16245a;
    }
}
