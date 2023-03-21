package in.swiggy.android.reactnative.dinersone;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.l0;
import cg0.n;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.b;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dagger.android.support.DaggerAppCompatActivity;
import in.swiggy.android.dls.R;
import in.swiggy.android.swiggylynx.ui.LynxData;
import java.util.ArrayList;
import java.util.HashMap;
import jz.c;
import org.json.JSONException;
import org.json.JSONObject;
import os.u;
import se.i;
import se.m;
import se.p;
import se0.d;
import se0.g;
import se0.h;
import ue0.k;
import ue0.l;

/* compiled from: DinersOneActivity.kt */
public final class DinersOneActivity extends DaggerAppCompatActivity implements b, e, l {

    /* renamed from: c  reason: collision with root package name */
    private p f18446c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public i f18447d;

    /* renamed from: e  reason: collision with root package name */
    private f f18448e;

    /* renamed from: f  reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f18449f;

    /* renamed from: g  reason: collision with root package name */
    private i.k f18450g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18451h;

    /* renamed from: i  reason: collision with root package name */
    public og0.a f18452i;
    public n j;
    public se0.a k;

    /* renamed from: l  reason: collision with root package name */
    public us.f f18453l;

    /* renamed from: m  reason: collision with root package name */
    public c f18454m;
    public ir.b n;

    /* renamed from: o  reason: collision with root package name */
    public fr.e f18455o;

    /* renamed from: p  reason: collision with root package name */
    public SharedPreferences f18456p;
    public ef0.e q;

    /* renamed from: r  reason: collision with root package name */
    private eo0.a f18457r = new eo0.a();

    /* renamed from: s  reason: collision with root package name */
    private Long f18458s;
    private boolean t;

    /* compiled from: GeneralUtils.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f18459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DinersOneActivity f18460b;

        public a(Object obj, DinersOneActivity dinersOneActivity) {
            this.f18459a = obj;
            this.f18460b = dinersOneActivity;
        }

        public final void run() {
            i iVar = (i) this.f18459a;
            i c12 = this.f18460b.f18447d;
            if (c12 != null) {
                c12.Q();
            }
        }
    }

    private final Bundle f1() {
        og0.a aVar = this.f18452i;
        HashMap<String, String> a11 = aVar == null ? null : aVar.a();
        if (a11 != null) {
            return h.a(a11);
        }
        return new Bundle();
    }

    private final void h1() {
        this.f18446c = new p(this);
        ArrayList<m> a11 = new se.f(getApplication()).a();
        kotlin.jvm.internal.p.i(a11, "PackageList(application).packages");
        a11.add(new ue0.i(this.j, this.f18453l, this.f18454m, this.f18452i, this.n, this.f18455o, this.f18456p, (k) null, this));
        a11.add(new com.microsoft.codepush.react.a("ZrK-KyAjQKIuewBwqIPkwOLb_lmaidVYKMx4B", getApplicationContext(), false));
        a11.add(new g(this.j, this.f18453l, this.f18454m, this.f18456p, this.q, this.f18457r, this.f18458s));
        this.f18447d = i.u().d(getApplication()).f(this).e("index.android.bundle").j("index").a(a11).h(com.microsoft.codepush.react.a.i()).k(false).g(LifecycleState.RESUMED).b();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Intent intent = getIntent();
        Uri data = intent == null ? null : intent.getData();
        bundle2.putString("webHostUrl", LynxData.DEFAULT_URL);
        bundle2.putString("dinersProxyUrl", "https://dinersone-proxy.swiggy.com/v2/graphql");
        bundle2.putString("helpCenterUrl", "https://www.swiggy.com/help/conversations");
        bundle.putBundle("swiggyHeaders", f1());
        bundle.putBundle("buildConfig", bundle2);
        if (data != null) {
            bundle.putString("deeplinkInfo", data.toString());
        }
        bundle.putBoolean("hideBackButton", false);
        p pVar = this.f18446c;
        if (pVar != null) {
            pVar.o(this.f18447d, "DinersOne", bundle);
        }
        setContentView((View) this.f18446c);
        ue0.a aVar = new ue0.a(this);
        this.f18450g = aVar;
        i iVar = this.f18447d;
        if (iVar != null) {
            iVar.r(aVar);
        }
        p pVar2 = this.f18446c;
        if (pVar2 != null) {
            DinersOneUtils.f18488a.b(pVar2, false, false, false, true);
        }
    }

    /* access modifiers changed from: private */
    public static final void j1(DinersOneActivity dinersOneActivity, ReactContext reactContext) {
        kotlin.jvm.internal.p.j(dinersOneActivity, "this$0");
        dinersOneActivity.f18449f = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    private final void k1() {
        com.facebook.react.views.text.h.c().a(this, "Basis Grotesque Pro Regular", R.font.basis_grotesque_pro_regular);
        com.facebook.react.views.text.h.c().a(this, "Basis Grotesque Pro Bold", R.font.basis_grotesque_pro_bold);
        com.facebook.react.views.text.h.c().a(this, "Basis Grotesque Pro Black", R.font.basis_grotesque_pro_black);
        com.facebook.react.views.text.h.c().a(this, "Basis Grotesque Pro Medium", R.font.basis_grotesque_pro_medium);
        com.facebook.react.views.text.h.c().a(this, "ProximaNovaCond-Bold", R.font.proxima_nova_condensed_bold);
        com.facebook.react.views.text.h.c().a(this, "ProximaNovaCond-Extrabld", R.font.proxima_nova_condensed_extrabold);
        com.facebook.react.views.text.h.c().a(this, "ProximaNovaCond-Black", R.font.proxima_nova_condensed_black);
        com.facebook.react.views.text.h.c().a(this, "ProximaNova-SemiBold", R.font.proxima_nova_condensed_semibold);
        com.facebook.react.views.text.h.c().a(this, "Sacramento Regular", in.swiggy.android.reactnative.R.font.sacramento_regular);
    }

    @TargetApi(23)
    public void S0(String[] strArr, int i11, f fVar) {
        kotlin.jvm.internal.p.j(strArr, "permissions");
        kotlin.jvm.internal.p.j(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f18448e = fVar;
        requestPermissions(strArr, i11);
    }

    public final Long d1() {
        return this.f18458s;
    }

    public final boolean g1() {
        return this.t;
    }

    public boolean h0() {
        return this.f18451h;
    }

    public final void l1() {
        this.t = true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        String str = null;
        if (i11 == 1) {
            if (i12 == -1) {
                if (intent != null) {
                    str = intent.getStringExtra("trackOrderJson");
                }
                try {
                    String string = new JSONObject(str).getJSONArray("orders").getJSONObject(0).getString("order_id");
                    DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.f18449f;
                    if (rCTDeviceEventEmitter != null) {
                        rCTDeviceEventEmitter.emit("PAYMENT_SUCCESSFUL", string);
                    }
                } catch (JSONException e11) {
                    u.c(e11.getMessage());
                }
            } else {
                DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2 = this.f18449f;
                if (rCTDeviceEventEmitter2 != null) {
                    rCTDeviceEventEmitter2.emit("PAYMENT_SUCCESSFUL", "");
                }
            }
        } else if (i11 == 297) {
            if (intent != null) {
                str = intent.getStringExtra("superV2SelectedPlanId");
            }
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter3 = this.f18449f;
            if (rCTDeviceEventEmitter3 != null) {
                rCTDeviceEventEmitter3.emit("DINERS_PLAN_SELECTION_SUCCESSFULL", str);
            }
        } else if (i12 == -1 && i11 == 3 && intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                str = extras.getString("OffersActivityV2.selectedCoupon");
            }
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter4 = this.f18449f;
            if (rCTDeviceEventEmitter4 != null) {
                rCTDeviceEventEmitter4.emit("APPLY_COUPON_SUCCESSFUL", str);
            }
        }
    }

    public void onBackPressed() {
        i iVar = this.f18447d;
        if (iVar == null) {
            super.onBackPressed();
        } else if (iVar != null) {
            new Handler(Looper.getMainLooper()).post(new a(iVar, this));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f18458s = Long.valueOf(System.currentTimeMillis());
        super.onCreate((Bundle) null);
        Window window = getWindow();
        if (window != null) {
            l0.b(window, false);
            window.setStatusBarColor(0);
        }
        k1();
        d.g(d.f19868a, this, false, false, false, 14, (Object) null);
        SoLoader.g(this, false);
        com.facebook.react.modules.network.g.g(this.k);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f18447d;
        if (iVar != null) {
            if (iVar != null) {
                iVar.S(this);
            }
            i iVar2 = this.f18447d;
            if (iVar2 != null) {
                iVar2.A();
            }
            this.f18447d = null;
        }
        p pVar = this.f18446c;
        if (pVar != null) {
            if (pVar != null) {
                pVar.q();
            }
            this.f18446c = null;
        }
        i iVar3 = this.f18447d;
        if (iVar3 != null) {
            if (iVar3 != null) {
                iVar3.f0(this.f18450g);
            }
            this.f18447d = null;
        }
        this.f18457r.dispose();
        this.f18456p = null;
        Runtime.getRuntime().gc();
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        i iVar;
        kotlin.jvm.internal.p.j(keyEvent, "event");
        if (i11 != 82 || (iVar = this.f18447d) == null) {
            return super.onKeyUp(i11, keyEvent);
        }
        if (iVar == null) {
            return true;
        }
        iVar.i0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.p.j(intent, "intent");
        super.onNewIntent(intent);
        if (intent.getData() != null) {
            Uri data = intent.getData();
            if (StringsKt__StringsKt.S(String.valueOf(data), "swiggydiners", false, 2, (Object) null)) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("url", String.valueOf(data));
                DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.f18449f;
                if (rCTDeviceEventEmitter != null) {
                    rCTDeviceEventEmitter.emit("url", createMap);
                    return;
                }
                return;
            }
            setIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18451h = false;
        i iVar = this.f18447d;
        if (iVar != null && iVar != null) {
            iVar.U(this);
        }
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.p.j(strArr, "permissions");
        kotlin.jvm.internal.p.j(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        f fVar = this.f18448e;
        if (fVar != null && fVar != null) {
            fVar.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18451h = true;
        i iVar = this.f18447d;
        if (!(iVar == null || iVar == null)) {
            iVar.W(this, this);
        }
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.f18449f;
        if (rCTDeviceEventEmitter != null) {
            n nVar = this.j;
            if (!(nVar == null || rCTDeviceEventEmitter == null)) {
                kotlin.jvm.internal.p.g(nVar);
                rCTDeviceEventEmitter.emit("LOCATION_UPDATE_EVENT", DinersOneUtils.e(nVar));
            }
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2 = this.f18449f;
            if (rCTDeviceEventEmitter2 != null) {
                rCTDeviceEventEmitter2.emit("DINEOUT_FOCUS_EVENT", Boolean.TRUE);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f18446c == null) {
            h1();
        }
    }

    public void z() {
        super.onBackPressed();
    }
}
