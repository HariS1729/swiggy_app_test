package in.swiggy.android.swiggylynx.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.lifecycle.l0;
import bp0.f;
import bp0.k;
import cg0.n;
import cg0.o;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import dagger.android.support.DaggerAppCompatActivity;
import fi0.a;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.commonsui.view.errorview.ErrorView;
import in.swiggy.android.commonsui.view.toolbar.AdvancedToolbar;
import in.swiggy.android.swiggylynx.R;
import in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs;
import in.swiggy.android.swiggylynx.plugin.SwiggyLynxPluginData;
import in.swiggy.android.swiggylynx.plugin.location.LocationPlugin;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.AmazonPlugin;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.PermissionsPlugin;
import in.swiggy.android.swiggylynx.ui.LynxActivity$phonePeSdk$2;
import in.swiggy.android.swiggylynx.utils.IllegalHostException;
import in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import jz.c;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import okhttp3.OkHttpClient;
import os.g0;
import os.u;
import os.v;
import pm0.e;
import wh0.d;
import wh0.h;
import wh0.j;
import wh0.l;
import wx.u7;

@Instrumented
/* compiled from: LynxActivity.kt */
public final class LynxActivity extends DaggerAppCompatActivity implements ILynxViewUpdateHandler, fi0.a, e, d {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public static boolean f19514r0;
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public static boolean f19515s0;
    public OkHttpClient A;
    public wd0.e B;
    public pg0.a C;
    public ks.d D;
    private final Stack<SwiggyLynxWebView> E = new Stack<>();
    private final f F = b.b(LynxActivity$phonePeSdk$2.f19549a);
    public String G;
    public String H;
    public Set<? extends SwiggyLynxPluginData> I;
    public Map<String, String> K;
    private int L = -9;
    /* access modifiers changed from: private */
    public boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private String Q = "";
    private String R = "";
    private String S = "";
    private sm0.d T;
    private boolean U;
    private boolean V;
    private boolean W = true;

    /* renamed from: c  reason: collision with root package name */
    public c f19516c;

    /* renamed from: c0  reason: collision with root package name */
    private String f19517c0;

    /* renamed from: d  reason: collision with root package name */
    public ps.b f19518d;

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f19519e;

    /* renamed from: f  reason: collision with root package name */
    public ef0.e f19520f;

    /* renamed from: g  reason: collision with root package name */
    public cf0.i f19521g;

    /* renamed from: h  reason: collision with root package name */
    public jr.a f19522h;

    /* renamed from: i  reason: collision with root package name */
    public n f19523i;
    public og0.a j;
    public fr.e k;

    /* renamed from: l  reason: collision with root package name */
    public us.f f19524l;

    /* renamed from: m  reason: collision with root package name */
    public ru.c f19525m;
    public nq.d<lg0.b> n;

    /* renamed from: n0  reason: collision with root package name */
    private lg0.b f19526n0;

    /* renamed from: o  reason: collision with root package name */
    public o f19527o;

    /* renamed from: o0  reason: collision with root package name */
    public ei0.e f19528o0;

    /* renamed from: p  reason: collision with root package name */
    public uh0.a f19529p;

    /* renamed from: p0  reason: collision with root package name */
    private final in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.a f19530p0 = new PermissionsPlugin(this);
    public BehaviorProcessor<LaunchCroutonData> q;

    /* renamed from: q0  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f19531q0 = new h(this);

    /* renamed from: r  reason: collision with root package name */
    public BehaviorProcessor<Boolean> f19532r;

    /* renamed from: s  reason: collision with root package name */
    public PublishProcessor<Integer> f19533s;
    public PublishProcessor<String> t;

    /* renamed from: u  reason: collision with root package name */
    public PublishProcessor<String> f19534u;
    public ky.a v;

    /* renamed from: w  reason: collision with root package name */
    public ef0.f f19535w;

    /* renamed from: x  reason: collision with root package name */
    public pw.a f19536x;

    /* renamed from: y  reason: collision with root package name */
    public os.a f19537y;

    /* renamed from: z  reason: collision with root package name */
    private SwiggyLynxWebView f19538z;

    /* compiled from: LynxActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final boolean a() {
            return LynxActivity.f19514r0;
        }

        public final void b(boolean z11) {
            LynxActivity.f19515s0 = z11;
        }
    }

    /* compiled from: LynxActivity.kt */
    public static final class b extends TypeToken<ArrayList<String>> {
        b() {
        }
    }

    private final void A2(int i11, int i12) {
        Class<j> cls = j.class;
        u2();
        String b11 = ((j) new androidx.navigation.e(s.b(cls), new LynxActivity$processIntent$$inlined$navArgs$1(this)).getValue()).b();
        if (b11 != null) {
            F2(b11);
        }
        String d11 = ((j) new androidx.navigation.e(s.b(cls), new LynxActivity$processIntent$$inlined$navArgs$2(this)).getValue()).d();
        if (d11 != null) {
            G2(d11);
        }
        String e11 = ((j) new androidx.navigation.e(s.b(cls), new LynxActivity$processIntent$$inlined$navArgs$3(this)).getValue()).e();
        if (e11 != null) {
            J2(e11);
        }
        String f11 = ((j) new androidx.navigation.e(s.b(cls), new LynxActivity$processIntent$$inlined$navArgs$4(this)).getValue()).f();
        if (f11 != null) {
            String upperCase = f11.toUpperCase();
            p.i(upperCase, "this as java.lang.String).toUpperCase()");
            k0(true, upperCase, new LynxActivity$processIntent$4$1(this));
        }
        if (((j) new androidx.navigation.e(s.b(cls), new LynxActivity$processIntent$$inlined$navArgs$5(this)).getValue()).g()) {
            if (Build.VERSION.SDK_INT <= 29) {
                getWindow().addFlags(768);
            } else {
                getWindow().clearFlags(67108864);
                getWindow().addFlags(134217728);
                getWindow().getDecorView().setSystemUiVisibility(1024);
                getWindow().setStatusBarColor(0);
                getWindow().setNavigationBarColor(0);
            }
            E2(x.m(B1(), new Pair("statusbarheight", String.valueOf(i11))));
            E2(x.m(B1(), new Pair("bottomoffset", String.valueOf(i12))));
        }
        T2();
    }

    private final void B2() {
        if (f19514r0) {
            f19514r0 = false;
            us.f M1 = M1();
            SwiggyLynxCorePlugin.a aVar = SwiggyLynxCorePlugin.Companion;
            M1.d0(aVar.a());
            M1().j0(this);
            aVar.c("");
        }
    }

    private final void C2(Bundle bundle) {
        if (Z1().g(bundle) && s2()) {
            l.b.f19964a.a(this.f19538z, Z1().getState());
            di0.p.c(N1(), Z1(), "lynx_activity");
            Z1().reset();
        }
    }

    /* access modifiers changed from: private */
    public static final void O2(lp0.a aVar, View view) {
        p.j(aVar, "$backClickAction");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void P2(lp0.a aVar, View view) {
        p.j(aVar, "$backClickAction");
        aVar.invoke();
    }

    private final LynxActivity$phonePeSdk$2.a R1() {
        return (LynxActivity$phonePeSdk$2.a) this.F.getValue();
    }

    private final void R2() {
        int i11 = R.id.errorContainer;
        ErrorView errorView = (ErrorView) findViewById(i11);
        if (errorView != null) {
            errorView.setErrorType(2);
        }
        ErrorView errorView2 = (ErrorView) findViewById(i11);
        if (errorView2 != null) {
            errorView2.setVisibility(0);
        }
        ErrorView errorView3 = (ErrorView) findViewById(i11);
        if (errorView3 != null) {
            errorView3.setActionClickListener(new LynxActivity$showGenericError$1(this));
        }
    }

    private final void S2(Intent intent) {
        Z1().h(AmazonPlugin.Companion.a(intent));
    }

    private final void T2() {
        lg0.b bVar;
        DeliveryRatingClickEventNavArgs a11 = ((j) new androidx.navigation.e(s.b(j.class), new LynxActivity$trackRatingSource$$inlined$navArgs$1(this)).getValue()).a();
        if (a11 != null && (bVar = this.f19526n0) != null) {
            bVar.N1(a11);
        }
    }

    private final ArrayList<String> f2() {
        String string = X1().getString("white_listed_domains_for_headers", "[\"swiggy.com\", \"swig.gy\", \"d1.swiggyops.de\",\"u4.swiggyops.de\",\"staging-stores.swiggyops.de\", \"sf.swiggyops.de\",\"gifting-ui-ui-cont.uat.singapore.swig.gy\", \"ofo-service.u4.singapore.swig.gy\", \"social-ofo-mweb.sf.singapore.swig.gy\", \"social-ofo-mweb.u4.singapore.swig.gy\", \"social-ofo-mweb.uat.singapore.swig.gy\", \"nyee-mweb.uat.singapore.swig.gy\", \"staging.swiggy.com\", \"reviews.swiggy.com\", \"portal.stg.swiggyops.de\", \"sw-moments-new-onboard-loader-mweb.u4.singapore.swig.gy\", \"swiggy.cloud\", \"sw-moments-gifter-flow-mweb.u4.singapore.swig.gy\" ]");
        Type type = new b().getType();
        Gson i11 = g0.i();
        Object fromJson = !(i11 instanceof Gson) ? i11.fromJson(string, type) : GsonInstrumentation.fromJson(i11, string, type);
        p.i(fromJson, "getGson().fromJson(listJson, type)");
        return (ArrayList) fromJson;
    }

    /* access modifiers changed from: private */
    public static final void h2(LynxActivity lynxActivity) {
        String str;
        String str2;
        Resources resources;
        DisplayMetrics displayMetrics;
        Class<LynxActivity> cls = LynxActivity.class;
        p.j(lynxActivity, "this$0");
        SwiggyLynxWebView swiggyLynxWebView = lynxActivity.f19538z;
        if (swiggyLynxWebView != null) {
            Rect rect = new Rect();
            swiggyLynxWebView.getWindowVisibleDisplayFrame(rect);
            int height = swiggyLynxWebView.getHeight() - (rect.bottom - rect.top);
            Context context = swiggyLynxWebView.getContext();
            float f11 = 1.0f;
            if (!(context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                f11 = displayMetrics.density;
            }
            if (height > lynxActivity.getResources().getDimensionPixelSize(in.swiggy.android.dash.R.dimen.dimen_50dp)) {
                try {
                    SwiggyLynxWebView u12 = lynxActivity.u1();
                    if (u12 != null) {
                        u12.evaluateJavascript("javascript: keyboardStateChanged(true, " + (((float) height) / f11) + ')', (ValueCallback) null);
                    }
                } catch (Exception e11) {
                    if (!cls.isAnonymousClass()) {
                        str2 = cls.getSimpleName();
                        if (str2.length() > 23) {
                            p.i(str2, "name");
                            str2 = str2.substring(0, 23);
                            p.i(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str2, "{\n            val name =… first 23 chars\n        }");
                    } else {
                        String name = cls.getName();
                        if (name.length() > 23) {
                            p.i(name, "name");
                            name = name.substring(name.length() - 23, name.length());
                            p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str2, "{\n            val name =…/ last 23 chars\n        }");
                    }
                    u.h(str2, e11);
                }
            } else {
                try {
                    SwiggyLynxWebView u13 = lynxActivity.u1();
                    if (u13 != null) {
                        u13.evaluateJavascript("javascript: keyboardStateChanged(false, 0)", (ValueCallback) null);
                    }
                } catch (Exception e12) {
                    if (!cls.isAnonymousClass()) {
                        str = cls.getSimpleName();
                        if (str.length() > 23) {
                            p.i(str, "name");
                            str = str.substring(0, 23);
                            p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str, "{\n            val name =… first 23 chars\n        }");
                    } else {
                        String name2 = cls.getName();
                        if (name2.length() > 23) {
                            p.i(name2, "name");
                            name2 = name2.substring(name2.length() - 23, name2.length());
                            p.i(name2, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str, "{\n            val name =…/ last 23 chars\n        }");
                    }
                    u.h(str, e12);
                }
            }
        }
    }

    private final void i2(Throwable th2) {
        String str;
        T t11;
        boolean z11;
        Class<LynxActivity> cls = LynxActivity.class;
        if (!cls.isAnonymousClass()) {
            str = cls.getSimpleName();
            if (str.length() > 23) {
                p.i(str, "name");
                str = str.substring(0, 23);
                p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =… first 23 chars\n        }");
        } else {
            String name = cls.getName();
            if (name.length() > 23) {
                p.i(name, "name");
                name = name.substring(name.length() - 23, name.length());
                p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =…/ last 23 chars\n        }");
        }
        u.h(str, th2);
        u2();
        Iterator<T> it2 = o2().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it2.next();
            np.a aVar = (np.a) t11;
            if (!(aVar instanceof sg0.b) || !((sg0.b) aVar).c()) {
                z11 = false;
                continue;
            } else {
                z11 = true;
                continue;
            }
            if (z11) {
                break;
            }
        }
        np.a aVar2 = (np.a) t11;
        if (aVar2 != null) {
            ((sg0.b) aVar2).p(true);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: private */
    public final void j2() {
        ConstraintLayout constraintLayout;
        int i11 = R.id.header;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(i11);
        boolean z11 = false;
        if (constraintLayout2 != null && constraintLayout2.getVisibility() == 0) {
            z11 = true;
        }
        if (z11 && (constraintLayout = (ConstraintLayout) findViewById(i11)) != null) {
            constraintLayout.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k2() {
        /*
            r8 = this;
            io.reactivex.processors.BehaviorProcessor r0 = r8.V1()
            java.lang.Object r0 = r0.B0()
            r1 = r0
            in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData r1 = (in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData) r1
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            r2 = r0
            goto L_0x001f
        L_0x0010:
            in.swiggy.android.tejas.oldapi.network.responses.RefundsStatusDetails r2 = r1.getRefundStatusDetails()
            if (r2 != 0) goto L_0x0017
            goto L_0x000e
        L_0x0017:
            boolean r2 = r2.isUserRefundStatusChanged()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x001f:
            boolean r2 = js.c.h(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0037
            if (r1 != 0) goto L_0x002a
        L_0x0028:
            r4 = r0
            goto L_0x003e
        L_0x002a:
            in.swiggy.android.tejas.oldapi.network.responses.RefundsStatusDetails r2 = r1.getRefundStatusDetails()
            if (r2 != 0) goto L_0x0031
            goto L_0x0028
        L_0x0031:
            r4 = 2
            in.swiggy.android.tejas.oldapi.network.responses.RefundsStatusDetails r2 = in.swiggy.android.tejas.oldapi.network.responses.RefundsStatusDetails.copy$default(r2, r3, r0, r4, r0)
            goto L_0x003d
        L_0x0037:
            in.swiggy.android.tejas.oldapi.network.responses.RefundsStatusDetails r2 = new in.swiggy.android.tejas.oldapi.network.responses.RefundsStatusDetails
            r4 = 3
            r2.<init>(r3, r0, r4, r0)
        L_0x003d:
            r4 = r2
        L_0x003e:
            io.reactivex.processors.BehaviorProcessor r2 = r8.U1()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.D0(r3)
            io.reactivex.processors.BehaviorProcessor r7 = r8.V1()
            if (r1 != 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData r0 = in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData.copy$default(r1, r2, r3, r4, r5, r6)
        L_0x0056:
            if (r0 != 0) goto L_0x0063
            in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData r0 = new in.swiggy.android.tejas.oldapi.network.responses.LaunchCroutonData
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0063:
            r7.D0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.ui.LynxActivity.k2():void");
    }

    private final void l2() {
        sm0.c cVar;
        boolean e11 = p.e(X1().getString("enable_genie_loader_lottie", "true"), "true");
        if (this.N) {
            ViewDataBinding i11 = g.i(getLayoutInflater(), in.swiggy.android.web.R.layout.view_instamart_loader, this.f19538z, true);
            p.i(i11, "inflate(this.layoutInfla…his.currentWebView, true)");
            sm0.c cVar2 = new sm0.c(X1(), R0(), A1());
            ((qm0.g) i11).x0(cVar2);
            cVar = cVar2;
        } else if (e11 && this.P) {
            ViewDataBinding i12 = g.i(getLayoutInflater(), R.layout.view_genie_loader, this.f19538z, true);
            p.i(i12, "inflate(this.layoutInfla…his.currentWebView, true)");
            sm0.a aVar = new sm0.a();
            ((qm0.e) i12).x0(aVar);
            cVar = aVar;
        } else if (this.O) {
            ViewDataBinding i13 = g.i(getLayoutInflater(), R.layout.view_handpicked_loader, this.f19538z, true);
            p.i(i13, "inflate(this.layoutInfla…his.currentWebView, true)");
            qg0.a aVar2 = new qg0.a();
            ((mg0.i) i13).x0(aVar2);
            cVar = aVar2;
        } else {
            ViewDataBinding i14 = g.i(getLayoutInflater(), in.swiggy.android.dash.R.layout.view_web_loading, this.f19538z, true);
            p.i(i14, "inflate(this.layoutInfla…his.currentWebView, true)");
            sm0.d dVar = new sm0.d();
            ((u7) i14).x0(dVar);
            cVar = dVar;
        }
        this.T = cVar;
    }

    private final void m2() {
        SwiggyLynxWebView swiggyLynxWebView;
        ViewTreeObserver viewTreeObserver;
        if (f19515s0 && (swiggyLynxWebView = this.f19538z) != null && (viewTreeObserver = swiggyLynxWebView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f19531q0);
        }
    }

    private final void n2(SwiggyLynxWebView swiggyLynxWebView) {
        this.E.push(swiggyLynxWebView);
        SwiggyLynxWebView swiggyLynxWebView2 = this.f19538z;
        if (swiggyLynxWebView2 != null) {
            swiggyLynxWebView2.setViewUpdateHandler(this);
        }
        l lVar = l.f19962a;
        String a22 = a2();
        ef0.e b22 = b2();
        ps.b s12 = s1();
        n F1 = F1();
        String e22 = e2();
        ef0.f g22 = g2();
        SharedPreferences X1 = X1();
        bf0.a B2 = f().B();
        p.i(B2, "cartService.cart");
        lVar.a(a22, b22, s12, F1, e22, g22, X1, B2, this.f19538z, r1());
        List<np.a> o22 = o2();
        SwiggyLynxWebView swiggyLynxWebView3 = this.f19538z;
        if (swiggyLynxWebView3 != null) {
            Object[] array = o22.toArray(new np.a[0]);
            p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            np.a[] aVarArr = (np.a[]) array;
            swiggyLynxWebView3.setPlugins((np.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
        SwiggyLynxWebView swiggyLynxWebView4 = this.f19538z;
        if (swiggyLynxWebView4 != null) {
            swiggyLynxWebView4.setWhiteListedDomains(f2());
        }
        SwiggyLynxWebView swiggyLynxWebView5 = this.f19538z;
        if (swiggyLynxWebView5 != null) {
            swiggyLynxWebView5.setWebChromeClient(d2());
        }
        SwiggyLynxWebView swiggyLynxWebView6 = this.f19538z;
        if (swiggyLynxWebView6 != null) {
            SharedPreferences X12 = X1();
            ef0.f g23 = g2();
            Gson i11 = g0.i();
            p.i(i11, "getGson()");
            swiggyLynxWebView6.setWebViewClient(new fi0.d(this, this, X12, g23, i11, O1(), s1(), N1()));
        }
    }

    private final boolean o1(Context context) {
        String string = j3.b.a(context).getString("enable_chat_bubble_v6", "true");
        if (j3.b.a(context).getInt("chat_open_count", 0) > 3 || !p.e("true", string) || Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context)) {
            return false;
        }
        return true;
    }

    private final List<np.a> o2() {
        ArrayList arrayList = new ArrayList();
        for (SwiggyLynxPluginData swiggyLynxPluginData : T1()) {
            if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.SwiggyLynxCorePluginData) {
                LynxPluginHelperKt.a(this, ((SwiggyLynxPluginData.SwiggyLynxCorePluginData) swiggyLynxPluginData).a(), arrayList, u1(), E1());
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.PaymentLynxPluginData) {
                LynxPluginHelperKt.c(this, ((SwiggyLynxPluginData.PaymentLynxPluginData) swiggyLynxPluginData).a(), arrayList, R0());
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.EmpathyLynxPluginData) {
                LynxPluginHelperKt.d(((SwiggyLynxPluginData.EmpathyLynxPluginData) swiggyLynxPluginData).a(), arrayList);
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.DashPluginData) {
                LynxPluginHelperKt.b(this, ((SwiggyLynxPluginData.DashPluginData) swiggyLynxPluginData).a(), arrayList);
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.PermissionPluginData) {
                arrayList.add(this.f19530p0);
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.LocationPluginData) {
                arrayList.add(new LocationPlugin(this, F1(), M1()));
            }
        }
        return arrayList;
    }

    private final void p2() {
        this.f19526n0 = (lg0.b) new l0(this).a(lg0.b.class);
        I1().injectMembers(this.f19526n0);
        lg0.b bVar = this.f19526n0;
        if (bVar != null) {
            bVar.init();
        }
    }

    private final boolean q2(String str) {
        if (!StringsKt__StringsKt.Q(str, "conversations", true) || !o1(this)) {
            return false;
        }
        return true;
    }

    private final boolean r2(String str) {
        return StringsKt__StringsKt.Q(str, "conversations", true);
    }

    private final boolean s2() {
        String string = X1().getString("android_enable_webview_refresh_handling_lynx_activity", "false");
        if (string == null) {
            string = "";
        }
        return p.e(string, "true");
    }

    private final void u2() {
        Map<String, String> map;
        LynxData c11 = ((j) new androidx.navigation.e(s.b(j.class), new LynxActivity$loadPlugins$$inlined$navArgs$1(this)).getValue()).c();
        K2(c11.getUrl());
        if (c11.getAddDefaultHeaders()) {
            map = x.l(c11.getHeaders(), x1().a());
        } else {
            map = c11.getHeaders();
        }
        E2(map);
        H2(c11.getPluginSet());
        I2(c11.getRequestCode());
        N2(B1().containsKey("x-web-checkout-flow") ? String.valueOf(B1().get("x-web-checkout-flow")) : "");
        if (c11.getInitiatePhonePeSDK()) {
            R1().a(this);
        }
    }

    private final void v2() {
        boolean e11 = p.e(b2().getCustomerId(), this.f19517c0);
        this.W = e11;
        if (this.O) {
            l.f19962a.h(this.f19538z, e11);
        }
    }

    /* access modifiers changed from: private */
    public static final WindowInsets w2(LynxActivity lynxActivity, Bundle bundle, View view, WindowInsets windowInsets) {
        p.j(lynxActivity, "this$0");
        p.j(view, "v");
        p.j(windowInsets, "insets");
        int a11 = v.a((float) windowInsets.getSystemWindowInsetTop(), lynxActivity.getApplicationContext());
        int a12 = v.a((float) windowInsets.getSystemWindowInsetBottom(), lynxActivity.getApplicationContext());
        view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        ms.h.c(new wh0.i(lynxActivity, a11, a12, bundle), do0.a.a());
        return windowInsets;
    }

    /* access modifiers changed from: private */
    public static final k x2(LynxActivity lynxActivity, int i11, int i12, Bundle bundle) {
        p.j(lynxActivity, "this$0");
        lynxActivity.A2(i11, i12);
        View findViewById = lynxActivity.findViewById(R.id.defaultLynxView);
        p.i(findViewById, "findViewById(R.id.defaultLynxView)");
        lynxActivity.n2((SwiggyLynxWebView) findViewById);
        ILynxViewUpdateHandler.DefaultImpls.a(lynxActivity, lynxActivity.a2(), lynxActivity.B1(), false, false, false, (String) null, (String) null, false, 252, (Object) null);
        lynxActivity.C2(bundle);
        return k.f22762a;
    }

    public final ru.c A1() {
        ru.c cVar = this.f19525m;
        if (cVar != null) {
            return cVar;
        }
        p.B("fontService");
        return null;
    }

    public final Map<String, String> B1() {
        Map<String, String> map = this.K;
        if (map != null) {
            return map;
        }
        p.B("headers");
        return null;
    }

    public HashMap<String, String> B5() {
        return a.C0223a.a(this);
    }

    public final PublishProcessor<String> C1() {
        PublishProcessor<String> publishProcessor = this.f19534u;
        if (publishProcessor != null) {
            return publishProcessor;
        }
        p.B("hideRestoSubmitFeedback");
        return null;
    }

    public void D() {
        super.onBackPressed();
    }

    public final String D1() {
        return this.S;
    }

    public final void D2(SwiggyLynxWebView swiggyLynxWebView) {
        this.f19538z = swiggyLynxWebView;
    }

    public final PublishProcessor<Integer> E1() {
        PublishProcessor<Integer> publishProcessor = this.f19533s;
        if (publishProcessor != null) {
            return publishProcessor;
        }
        p.B("limitErrorProcessor");
        return null;
    }

    public final void E2(Map<String, String> map) {
        p.j(map, "<set-?>");
        this.K = map;
    }

    public final n F1() {
        n nVar = this.f19523i;
        if (nVar != null) {
            return nVar;
        }
        p.B("locationContext");
        return null;
    }

    public final void F2(String str) {
        p.j(str, "<set-?>");
        this.S = str;
    }

    public final Stack<SwiggyLynxWebView> G1() {
        return this.E;
    }

    public final void G2(String str) {
        p.j(str, "<set-?>");
        this.Q = str;
    }

    public final void H2(Set<? extends SwiggyLynxPluginData> set) {
        p.j(set, "<set-?>");
        this.I = set;
    }

    public void H7(String str, String str2, String str3, String str4) {
        a.C0223a.f(this, str, str2, str3, str4);
    }

    public final nq.d<lg0.b> I1() {
        nq.d<lg0.b> dVar = this.n;
        if (dVar != null) {
            return dVar;
        }
        p.B("lynxActivityViewModelMembersInjector");
        return null;
    }

    public final void I2(int i11) {
        this.L = i11;
    }

    public final void J2(String str) {
        p.j(str, "<set-?>");
        this.R = str;
    }

    public final fr.e K1() {
        fr.e eVar = this.k;
        if (eVar != null) {
            return eVar;
        }
        p.B("mSwiggyEventLogger");
        return null;
    }

    public final void K2(String str) {
        p.j(str, "<set-?>");
        this.G = str;
    }

    public final uh0.a L1() {
        uh0.a aVar = this.f19529p;
        if (aVar != null) {
            return aVar;
        }
        p.B("mSwiggyLynxInterface");
        return null;
    }

    public final void L2(ei0.e eVar) {
        p.j(eVar, "<set-?>");
        this.f19528o0 = eVar;
    }

    public final us.f M1() {
        us.f fVar = this.f19524l;
        if (fVar != null) {
            return fVar;
        }
        p.B("navigationContext");
        return null;
    }

    public Context N0() {
        return this;
    }

    public final jr.a N1() {
        jr.a aVar = this.f19522h;
        if (aVar != null) {
            return aVar;
        }
        p.B("newrelicPerformanceUtils");
        return null;
    }

    public final void N2(String str) {
        p.j(str, "<set-?>");
        this.H = str;
    }

    public final OkHttpClient O1() {
        OkHttpClient okHttpClient = this.A;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        p.B("okhttp");
        return null;
    }

    public final wd0.e P1() {
        wd0.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        p.B("oneClickService");
        return null;
    }

    public final String Q1() {
        return this.Q;
    }

    public eo0.a R0() {
        return new eo0.a();
    }

    public void S1(boolean z11, WebResourceRequest webResourceRequest, zp.d dVar) {
        CharSequence a11;
        this.V = z11;
        if (z11) {
            boolean z12 = false;
            if (!s1().isNetworkAvailable()) {
                int i11 = R.id.errorContainer;
                ErrorView errorView = (ErrorView) findViewById(i11);
                if (errorView != null) {
                    errorView.setErrorType(0);
                }
                ErrorView errorView2 = (ErrorView) findViewById(i11);
                if (errorView2 != null) {
                    errorView2.setVisibility(0);
                }
                ErrorView errorView3 = (ErrorView) findViewById(i11);
                if (errorView3 != null) {
                    errorView3.setActionClickListener(new LynxActivity$showError$1(this));
                }
            } else {
                SwiggyLynxWebView swiggyLynxWebView = this.f19538z;
                if (!(swiggyLynxWebView != null && swiggyLynxWebView.j(webResourceRequest, dVar))) {
                    if (p.e(X1().getString("handle_received_error", "false"), "true")) {
                        if (!(dVar == null || (a11 = dVar.a()) == null || !a11.equals("HTTPError"))) {
                            z12 = true;
                        }
                        if (!z12) {
                            R2();
                        }
                    } else {
                        R2();
                    }
                }
            }
            k0(true, "", new LynxActivity$showError$2(this));
            return;
        }
        ErrorView errorView4 = (ErrorView) findViewById(R.id.errorContainer);
        if (errorView4 != null) {
            errorView4.setVisibility(8);
        }
    }

    public final Set<SwiggyLynxPluginData> T1() {
        Set<? extends SwiggyLynxPluginData> set = this.I;
        if (set != null) {
            return set;
        }
        p.B("plugins");
        return null;
    }

    public final BehaviorProcessor<Boolean> U1() {
        BehaviorProcessor<Boolean> behaviorProcessor = this.f19532r;
        if (behaviorProcessor != null) {
            return behaviorProcessor;
        }
        p.B("refundCrouton");
        return null;
    }

    public final BehaviorProcessor<LaunchCroutonData> V1() {
        BehaviorProcessor<LaunchCroutonData> behaviorProcessor = this.q;
        if (behaviorProcessor != null) {
            return behaviorProcessor;
        }
        p.B("refundStatus");
        return null;
    }

    public final PublishProcessor<String> W1() {
        PublishProcessor<String> publishProcessor = this.t;
        if (publishProcessor != null) {
            return publishProcessor;
        }
        p.B("searchSubmitFeedback");
        return null;
    }

    public final SharedPreferences X1() {
        SharedPreferences sharedPreferences = this.f19519e;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        p.B("sharedPreferences");
        return null;
    }

    public final String Y1() {
        return this.R;
    }

    public final pg0.a Z1() {
        pg0.a aVar = this.C;
        if (aVar != null) {
            return aVar;
        }
        p.B("stateManager");
        return null;
    }

    public void a0(boolean z11) {
        this.U = z11;
        if (!z11) {
            sm0.d dVar = this.T;
            if (dVar != null) {
                dVar.b();
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.loaderContainer);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else if (f19515s0) {
            sm0.d dVar2 = this.T;
            if (dVar2 != null) {
                dVar2.c();
            }
        } else {
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.loaderContainer);
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
    }

    public final String a2() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        p.B("url");
        return null;
    }

    @TargetApi(21)
    public void a6(WebChromeClient.FileChooserParams fileChooserParams, xm0.a aVar, int i11, pm0.f fVar, SharedPreferences sharedPreferences) {
        a.C0223a.c(this, fileChooserParams, aVar, i11, fVar, sharedPreferences);
    }

    public final ef0.e b2() {
        ef0.e eVar = this.f19520f;
        if (eVar != null) {
            return eVar;
        }
        p.B(LogSubCategory.Action.USER);
        return null;
    }

    public final o c2() {
        o oVar = this.f19527o;
        if (oVar != null) {
            return oVar;
        }
        p.B("userLocationManager");
        return null;
    }

    public final ei0.e d2() {
        ei0.e eVar = this.f19528o0;
        if (eVar != null) {
            return eVar;
        }
        p.B("webChromeClient");
        return null;
    }

    public final String e2() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        p.B("webFlow");
        return null;
    }

    public final cf0.i f() {
        cf0.i iVar = this.f19521g;
        if (iVar != null) {
            return iVar;
        }
        p.B("cartService");
        return null;
    }

    public final ef0.f g2() {
        ef0.f fVar = this.f19535w;
        if (fVar != null) {
            return fVar;
        }
        p.B("xpExperimentContext");
        return null;
    }

    public Context i6() {
        return this;
    }

    public void k0(boolean z11, String str, lp0.a<k> aVar) {
        p.j(str, "title");
        p.j(aVar, "backClickAction");
        View findViewById = findViewById(R.id.toolbar);
        if (z11) {
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.header);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            if (findViewById instanceof AdvancedToolbar) {
                AdvancedToolbar advancedToolbar = (AdvancedToolbar) findViewById;
                advancedToolbar.setTitle((CharSequence) str);
                advancedToolbar.setNavigationOnClickListener(new wh0.f(aVar));
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.header);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        if (findViewById instanceof AdvancedToolbar) {
            AdvancedToolbar advancedToolbar2 = (AdvancedToolbar) findViewById;
            advancedToolbar2.setTitle((CharSequence) null);
            advancedToolbar2.setNavigationOnClickListener(new wh0.g(aVar));
        }
    }

    public void n1() {
        dt.g.f53443a.a(this, new LynxActivity$addBackPressDispatcherCallBack$1(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i11, int i12, Intent intent) {
        SwiggyLynxWebView swiggyLynxWebView = this.f19538z;
        if (swiggyLynxWebView != null) {
            swiggyLynxWebView.n(i11, i12, intent);
        }
        d2().a(i11, i12, intent);
        di0.p.b(N1(), this.f19538z, i11, i12, "lynx_activity");
        super.onActivityResult(i11, i12, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p2();
        lg0.b bVar = this.f19526n0;
        if (bVar != null) {
            bVar.P1();
        }
        Z1().c(bundle);
        try {
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new wh0.e(this, bundle));
            setContentView(R.layout.activity_lynx);
            if (this.f19528o0 == null) {
                L2(new ei0.e(this, this, X1()));
            }
            this.f19538z = (SwiggyLynxWebView) findViewById(R.id.defaultLynxView);
            this.N = getIntent().getBooleanExtra("isInstamart", false);
            this.O = getIntent().getBooleanExtra("isHandPicked", false);
            this.P = getIntent().getBooleanExtra("isGenie", false);
            String stringExtra = getIntent().getStringExtra("orderJson");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            this.Q = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("launchScreen");
            if (stringExtra2 == null) {
                stringExtra2 = str;
            }
            this.R = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("source");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            this.S = str;
            f19515s0 = getIntent().getBooleanExtra("show_dash_loaders", false);
            m2();
            this.f19517c0 = b2().getCustomerId();
            SwiggyLynxWebView swiggyLynxWebView = this.f19538z;
            if (swiggyLynxWebView != null) {
                swiggyLynxWebView.setNewrelicPerformanceUtils(N1());
            }
        } catch (Throwable th2) {
            i2(th2);
        }
        n1();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        SwiggyLynxWebView swiggyLynxWebView;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        B2();
        p1();
        if (!(!f19515s0 || (swiggyLynxWebView = this.f19538z) == null || (viewTreeObserver = swiggyLynxWebView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f19531q0);
        }
        if (this.L == 1123 && !this.U) {
            k2();
        }
        this.N = false;
        this.O = false;
        f19515s0 = false;
        R0().dispose();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            S2(intent);
            SwiggyLynxWebView u12 = u1();
            if (u12 != null) {
                u12.o(intent);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        v2();
        M1().j0(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        p.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Z1().b(bundle);
    }

    public final void p1() {
        Object systemService = getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public final void q1() {
        if (this.U || this.V) {
            super.onBackPressed();
            return;
        }
        SwiggyLynxWebView swiggyLynxWebView = this.f19538z;
        if (swiggyLynxWebView != null) {
            swiggyLynxWebView.evaluateJavascript("javascript: handleHardwareBack()", (ValueCallback) null);
        }
    }

    public final os.a r1() {
        os.a aVar = this.f19537y;
        if (aVar != null) {
            return aVar;
        }
        p.B("appBuildDetails");
        return null;
    }

    public final ps.b s1() {
        ps.b bVar = this.f19518d;
        if (bVar != null) {
            return bVar;
        }
        p.B("contextService");
        return null;
    }

    public void t0(String str, Map<String, String> map, boolean z11, boolean z12, boolean z13, String str2, String str3, boolean z14) {
        WebSettings webSettings;
        p.j(str, "url");
        p.j(map, "additionalHeaders");
        if (z11) {
            SwiggyLynxWebView swiggyLynxWebView = new SwiggyLynxWebView(this);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.webContainer);
            if (frameLayout != null) {
                frameLayout.addView(swiggyLynxWebView);
            }
            this.f19538z = swiggyLynxWebView;
            n2(swiggyLynxWebView);
        }
        Map l11 = x.l(B1(), map);
        ArrayList<String> f22 = f2();
        String a11 = xp.a.f53337a.a(str);
        if (p.e(a11, "invalid")) {
            u.h("LynxActivity", new IllegalHostException(str));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = f22.iterator();
        while (true) {
            webSettings = null;
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (o.w(a11, (String) next, false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        this.M = q2(str);
        boolean r22 = r2(str);
        f19514r0 = r22;
        if (r22) {
            M1().A();
        }
        l2();
        if (!(!arrayList.isEmpty()) || p.e(a11, "invalid")) {
            SwiggyLynxWebView swiggyLynxWebView2 = this.f19538z;
            if (swiggyLynxWebView2 != null) {
                swiggyLynxWebView2.l(str, new HashMap(), z12);
            }
        } else {
            SwiggyLynxWebView swiggyLynxWebView3 = this.f19538z;
            if (swiggyLynxWebView3 != null) {
                webSettings = swiggyLynxWebView3.getSettings();
            }
            if (webSettings != null) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
            SwiggyLynxWebView swiggyLynxWebView4 = this.f19538z;
            if (swiggyLynxWebView4 != null) {
                swiggyLynxWebView4.l(str, SwiggyLynxWebView.Companion.a(l11), z12);
            }
            SwiggyLynxWebView swiggyLynxWebView5 = this.f19538z;
            if (swiggyLynxWebView5 != null) {
                swiggyLynxWebView5.setWebChromeClient(d2());
            }
        }
        SwiggyLynxWebView swiggyLynxWebView6 = this.f19538z;
        if (swiggyLynxWebView6 != null) {
            swiggyLynxWebView6.t(X1());
        }
        if (z13 && str3 != null) {
            ILynxViewUpdateHandler.DefaultImpls.b(this, true, (String) null, new LynxActivity$loadUrl$backClickAction$1(this, str3), 2, (Object) null);
        }
        a0(true);
    }

    public final pw.a t1() {
        pw.a aVar = this.f19536x;
        if (aVar != null) {
            return aVar;
        }
        p.B("crossPollinationDataManager");
        return null;
    }

    public final SwiggyLynxWebView u1() {
        return this.f19538z;
    }

    public final ky.a v1() {
        ky.a aVar = this.v;
        if (aVar != null) {
            return aVar;
        }
        p.B("dashPostHandler");
        return null;
    }

    public final c w1() {
        c cVar = this.f19516c;
        if (cVar != null) {
            return cVar;
        }
        p.B("deepLinkHandler");
        return null;
    }

    public void w9(Uri uri) {
        a.C0223a.e(this, uri);
    }

    public void x0() {
        finish();
    }

    public final og0.a x1() {
        og0.a aVar = this.j;
        if (aVar != null) {
            return aVar;
        }
        p.B("defaultHeaders");
        return null;
    }

    public void y1() {
        a.C0223a.b(this);
    }

    public void y2() {
        finish();
    }

    public final ks.d z1() {
        ks.d dVar = this.D;
        if (dVar != null) {
            return dVar;
        }
        p.B("featureFlags");
        return null;
    }

    public final void z2(String str) {
        p.j(str, "link");
        if (StringsKt__StringsKt.S(str, "explore", false, 2, (Object) null)) {
            W1().B0(str);
            x0();
        } else if (StringsKt__StringsKt.S(str, "food-page", false, 2, (Object) null)) {
            C1().B0(str);
            x0();
        }
    }
}
