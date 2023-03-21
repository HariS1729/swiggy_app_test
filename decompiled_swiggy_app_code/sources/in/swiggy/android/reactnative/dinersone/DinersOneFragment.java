package in.swiggy.android.reactnative.dinersone;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ao0.r;
import cg0.n;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.e;
import com.facebook.react.views.text.h;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import in.swiggy.android.dls.R;
import in.swiggy.android.swiggylynx.ui.LynxData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.i;
import mb0.r0;
import org.json.JSONException;
import org.json.JSONObject;
import os.u;
import pq.f;
import se.i;
import se.m;
import se.p;
import se0.g;
import ue0.k;
import ue0.l;

/* compiled from: DinersOneFragment.kt */
public final class DinersOneFragment extends f implements com.facebook.react.modules.core.b, e, k, tr.c, tr.d {
    public static final a C = new a((i) null);
    private r A;
    private final bp0.f B;

    /* renamed from: c  reason: collision with root package name */
    private p f18461c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public se.i f18462d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.react.modules.core.f f18463e;

    /* renamed from: f  reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f18464f;

    /* renamed from: g  reason: collision with root package name */
    private i.k f18465g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18466h = true;

    /* renamed from: i  reason: collision with root package name */
    public og0.a f18467i;
    public n j;
    public th0.a k;

    /* renamed from: l  reason: collision with root package name */
    public kg0.a f18468l;

    /* renamed from: m  reason: collision with root package name */
    public r0 f18469m;
    public se0.a n;

    /* renamed from: o  reason: collision with root package name */
    public us.f f18470o;

    /* renamed from: p  reason: collision with root package name */
    public jz.c f18471p;
    public ir.b q;

    /* renamed from: r  reason: collision with root package name */
    public fr.e f18472r;

    /* renamed from: s  reason: collision with root package name */
    public SharedPreferences f18473s;
    public ef0.e t;

    /* renamed from: u  reason: collision with root package name */
    private eo0.a f18474u = new eo0.a();
    public lp0.a<bp0.k> v;

    /* renamed from: w  reason: collision with root package name */
    private Long f18475w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f18476x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final eo0.a f18477y = new eo0.a();

    /* renamed from: z  reason: collision with root package name */
    private r f18478z;

    /* compiled from: DinersOneFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final DinersOneFragment a(String str, lp0.a<bp0.k> aVar) {
            kotlin.jvm.internal.p.j(str, "deeplink");
            kotlin.jvm.internal.p.j(aVar, "defaultBackPressed");
            Bundle bundle = new Bundle();
            bundle.putString("deeplinkInfo", str);
            DinersOneFragment dinersOneFragment = new DinersOneFragment();
            dinersOneFragment.setArguments(bundle);
            dinersOneFragment.U0(aVar);
            return dinersOneFragment;
        }
    }

    /* compiled from: GeneralUtils.kt */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f18479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DinersOneFragment f18480b;

        public b(Object obj, DinersOneFragment dinersOneFragment) {
            this.f18479a = obj;
            this.f18480b = dinersOneFragment;
        }

        public final void run() {
            se.i iVar = (se.i) this.f18479a;
            se.i h02 = this.f18480b.f18462d;
            if (h02 != null) {
                h02.Q();
            }
        }
    }

    /* compiled from: GeneralUtils.kt */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f18481a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f18482b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DinersOneFragment f18483c;

        public c(Object obj, FragmentActivity fragmentActivity, DinersOneFragment dinersOneFragment) {
            this.f18481a = obj;
            this.f18482b = fragmentActivity;
            this.f18483c = dinersOneFragment;
        }

        public final void run() {
            String str;
            se.i iVar = (se.i) this.f18481a;
            try {
                iVar.U(this.f18482b);
                vt.c.f53915a.d(true, this.f18483c.getActivity());
            } catch (Error e11) {
                if (!iVar.getClass().isAnonymousClass()) {
                    str = iVar.getClass().getSimpleName();
                    if (str.length() > 23) {
                        kotlin.jvm.internal.p.i(str, "name");
                        str = str.substring(0, 23);
                        kotlin.jvm.internal.p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    kotlin.jvm.internal.p.i(str, "{\n            val name =… first 23 chars\n        }");
                } else {
                    String name = iVar.getClass().getName();
                    if (name.length() > 23) {
                        kotlin.jvm.internal.p.i(name, "name");
                        name = name.substring(name.length() - 23, name.length());
                        kotlin.jvm.internal.p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    kotlin.jvm.internal.p.i(str, "{\n            val name =…/ last 23 chars\n        }");
                }
                u.h(str, e11);
            }
        }
    }

    /* compiled from: GeneralUtils.kt */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f18484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f18485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DinersOneFragment f18486c;

        public d(Object obj, FragmentActivity fragmentActivity, DinersOneFragment dinersOneFragment) {
            this.f18484a = obj;
            this.f18485b = fragmentActivity;
            this.f18486c = dinersOneFragment;
        }

        public final void run() {
            ((se.i) this.f18484a).W(this.f18485b, this.f18486c);
        }
    }

    public DinersOneFragment() {
        r c11 = wo0.a.c();
        kotlin.jvm.internal.p.i(c11, "io()");
        this.f18478z = c11;
        r a11 = do0.a.a();
        kotlin.jvm.internal.p.i(a11, "mainThread()");
        this.A = a11;
        this.B = b.b(new DinersOneFragment$locationListenerUseCase$2(this));
    }

    private final View A0() {
        Context requireContext = requireContext();
        kotlin.jvm.internal.p.i(requireContext, "requireContext()");
        Context applicationContext = requireContext.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        this.f18461c = new p(requireContext);
        ArrayList<m> a11 = new se.f(application).a();
        kotlin.jvm.internal.p.i(a11, "PackageList(application).packages");
        a11.add(new ue0.i(j0(), this.f18470o, this.f18471p, this.f18467i, this.q, this.f18472r, this.f18473s, this, (l) null));
        a11.add(new com.microsoft.codepush.react.a("ZrK-KyAjQKIuewBwqIPkwOLb_lmaidVYKMx4B", application, false));
        a11.add(new g(j0(), this.f18470o, this.f18471p, this.f18473s, this.t, this.f18474u, this.f18475w));
        this.f18462d = se.i.u().d(application).f(requireActivity()).e("index.android.bundle").j("index").a(a11).h(com.microsoft.codepush.react.a.i()).k(false).g(LifecycleState.RESUMED).b();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString("deeplinkInfo");
        bundle2.putString("webHostUrl", LynxData.DEFAULT_URL);
        bundle2.putString("dinersProxyUrl", "https://dinersone-proxy.swiggy.com/v2/graphql");
        bundle2.putString("helpCenterUrl", "https://www.swiggy.com/help/conversations");
        bundle.putBundle("swiggyHeaders", z0());
        bundle.putBundle("buildConfig", bundle2);
        if (string != null) {
            bundle.putString("deeplinkInfo", string);
        }
        bundle.putBoolean("hideBackButton", true);
        p pVar = this.f18461c;
        if (pVar != null) {
            pVar.o(this.f18462d, "DinersOne", bundle);
        }
        ue0.e eVar = new ue0.e(this);
        this.f18465g = eVar;
        se.i iVar = this.f18462d;
        if (iVar != null) {
            iVar.r(eVar);
        }
        vt.c.f53915a.d(false, getActivity());
        return this.f18461c;
    }

    /* access modifiers changed from: private */
    public static final void B0(DinersOneFragment dinersOneFragment, ReactContext reactContext) {
        kotlin.jvm.internal.p.j(dinersOneFragment, "this$0");
        dinersOneFragment.f18464f = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    private final void C0() {
        this.f18477y.d(m0().o().m0(this.f18478z).Q(this.A).e0(1).h0(new ue0.c(this), ue0.d.f29035a));
        m0().q();
    }

    /* access modifiers changed from: private */
    public static final void E0(Throwable th2) {
    }

    /* access modifiers changed from: private */
    public static final void G0(DinersOneFragment dinersOneFragment, Location location) {
        kotlin.jvm.internal.p.j(dinersOneFragment, "this$0");
        us.f fVar = dinersOneFragment.f18470o;
        if (fVar != null) {
            FragmentActivity requireActivity = dinersOneFragment.requireActivity();
            kotlin.jvm.internal.p.i(requireActivity, "requireActivity()");
            Location location2 = dinersOneFragment.j0().getLocation();
            kotlin.jvm.internal.p.i(location2, "locationContext.location");
            fVar.Z(requireActivity, location2);
        }
    }

    private final void H0() {
        Context requireContext = requireContext();
        kotlin.jvm.internal.p.i(requireContext, "requireContext()");
        h.c().a(requireContext, "Basis Grotesque Pro Regular", R.font.basis_grotesque_pro_regular);
        h.c().a(requireContext, "Basis Grotesque Pro Bold", R.font.basis_grotesque_pro_bold);
        h.c().a(requireContext, "Basis Grotesque Pro Black", R.font.basis_grotesque_pro_black);
        h.c().a(requireContext, "Basis Grotesque Pro Medium", R.font.basis_grotesque_pro_medium);
        h.c().a(requireContext, "ProximaNovaCond-Bold", R.font.proxima_nova_condensed_bold);
        h.c().a(requireContext, "ProximaNovaCond-Extrabld", R.font.proxima_nova_condensed_extrabold);
        h.c().a(requireContext, "ProximaNovaCond-Black", R.font.proxima_nova_condensed_black);
        h.c().a(requireContext, "ProximaNova-SemiBold", R.font.proxima_nova_condensed_semibold);
        h.c().a(requireContext, "Sacramento Regular", in.swiggy.android.reactnative.R.font.sacramento_regular);
    }

    private final di0.n m0() {
        return (di0.n) this.B.getValue();
    }

    private final Bundle z0() {
        og0.a aVar = this.f18467i;
        HashMap<String, String> a11 = aVar == null ? null : aVar.a();
        if (a11 != null) {
            return se0.h.a(a11);
        }
        return new Bundle();
    }

    public final void J0(Bundle bundle) {
        String string;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        if (bundle != null && (string = bundle.getString("DEEPLINK_INFO_EVENT")) != null && (rCTDeviceEventEmitter = this.f18464f) != null) {
            rCTDeviceEventEmitter.emit("DEEPLINK_INFO_EVENT", string);
        }
    }

    @TargetApi(23)
    public void S0(String[] strArr, int i11, com.facebook.react.modules.core.f fVar) {
        kotlin.jvm.internal.p.j(strArr, "permissions");
        kotlin.jvm.internal.p.j(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f18463e = fVar;
        requestPermissions(strArr, i11);
    }

    public boolean T() {
        return this.f18476x;
    }

    public final void U0(lp0.a<bp0.k> aVar) {
        kotlin.jvm.internal.p.j(aVar, "<set-?>");
        this.v = aVar;
    }

    public boolean X() {
        return this.f18466h;
    }

    public void h(boolean z11) {
        this.f18466h = z11;
    }

    public final lp0.a<bp0.k> i0() {
        lp0.a<bp0.k> aVar = this.v;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.p.B("defaultBackPressed");
        return null;
    }

    public final boolean j() {
        se.i iVar = this.f18462d;
        if (iVar == null) {
            return false;
        }
        if (iVar != null) {
            new Handler(Looper.getMainLooper()).post(new b(iVar, this));
        }
        return true;
    }

    public final n j0() {
        n nVar = this.j;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.p.B("locationContext");
        return null;
    }

    public void m() {
        j();
    }

    public final kg0.a n0() {
        kg0.a aVar = this.f18468l;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.p.B("locationRefreshUtils");
        return null;
    }

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
                    DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.f18464f;
                    if (rCTDeviceEventEmitter != null) {
                        rCTDeviceEventEmitter.emit("PAYMENT_SUCCESSFUL", string);
                    }
                } catch (JSONException e11) {
                    u.c(e11.getMessage());
                }
            } else {
                DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2 = this.f18464f;
                if (rCTDeviceEventEmitter2 != null) {
                    rCTDeviceEventEmitter2.emit("PAYMENT_SUCCESSFUL", "");
                }
            }
        } else if (i11 == 297) {
            if (intent != null) {
                str = intent.getStringExtra("superV2SelectedPlanId");
            }
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter3 = this.f18464f;
            if (rCTDeviceEventEmitter3 != null) {
                rCTDeviceEventEmitter3.emit("DINERS_PLAN_SELECTION_SUCCESSFULL", str);
            }
        } else if (i12 == -1 && i11 == 3 && intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                str = extras.getString("OffersActivityV2.selectedCoupon");
            }
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter4 = this.f18464f;
            if (rCTDeviceEventEmitter4 != null) {
                rCTDeviceEventEmitter4.emit("APPLY_COUPON_SUCCESSFUL", str);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        this.f18475w = Long.valueOf(System.currentTimeMillis());
        super.onCreate((Bundle) null);
        H0();
        if (bundle == null) {
            se0.d.g(se0.d.f19868a, requireActivity(), false, false, true, 6, (Object) null);
        }
        SoLoader.g(requireContext(), false);
        com.facebook.react.modules.network.g.g(this.n);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.p.j(layoutInflater, "inflater");
        C0();
        return A0();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18477y.dispose();
        se.i iVar = this.f18462d;
        if (iVar != null) {
            if (iVar != null) {
                iVar.S(requireActivity());
            }
            se.i iVar2 = this.f18462d;
            if (iVar2 != null) {
                iVar2.A();
            }
            this.f18462d = null;
        }
        p pVar = this.f18461c;
        if (pVar != null) {
            if (pVar != null) {
                pVar.q();
            }
            this.f18461c = null;
        }
        se.i iVar3 = this.f18462d;
        if (iVar3 != null) {
            if (iVar3 != null) {
                iVar3.f0(this.f18465g);
            }
            this.f18462d = null;
        }
        this.f18474u.dispose();
        this.f18473s = null;
        Runtime.getRuntime().gc();
    }

    public void onPause() {
        se.i iVar;
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null && (iVar = this.f18462d) != null) {
            new Handler(Looper.getMainLooper()).post(new c(iVar, activity, this));
        }
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.p.j(strArr, "permissions");
        kotlin.jvm.internal.p.j(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        com.facebook.react.modules.core.f fVar = this.f18463e;
        if (fVar != null && fVar != null) {
            fVar.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    public void onResume() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        se.i iVar;
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (iVar = this.f18462d) == null)) {
            new Handler(Looper.getMainLooper()).post(new d(iVar, activity, this));
        }
        if (this.f18464f != null) {
            if (!(j0() == null || (rCTDeviceEventEmitter = this.f18464f) == null)) {
                n j02 = j0();
                kotlin.jvm.internal.p.g(j02);
                rCTDeviceEventEmitter.emit("LOCATION_UPDATE_EVENT", DinersOneUtils.e(j02));
            }
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2 = this.f18464f;
            if (rCTDeviceEventEmitter2 != null) {
                rCTDeviceEventEmitter2.emit("DINEOUT_FOCUS_EVENT", Boolean.TRUE);
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f18461c == null) {
            A0();
        }
    }

    public final r0 p0() {
        r0 r0Var = this.f18469m;
        if (r0Var != null) {
            return r0Var;
        }
        kotlin.jvm.internal.p.B("resourceService");
        return null;
    }

    public final th0.a u0() {
        th0.a aVar = this.k;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.p.B("schedulerProvider");
        return null;
    }

    public void z() {
        i0().invoke();
    }
}
