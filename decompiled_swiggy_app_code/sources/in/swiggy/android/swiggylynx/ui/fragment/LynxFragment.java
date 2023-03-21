package in.swiggy.android.swiggylynx.ui.fragment;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.r;
import bp0.k;
import cg0.n;
import com.google.gson.Gson;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import di0.d;
import fi0.a;
import hd0.c;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.commons.utils.GeneralUtilsKt;
import in.swiggy.android.commonsui.view.errorview.ErrorView;
import in.swiggy.android.commonsui.view.toolbar.AdvancedToolbar;
import in.swiggy.android.dash.R;
import in.swiggy.android.swiggylynx.plugin.SwiggyLynxPluginData;
import in.swiggy.android.swiggylynx.ui.LynxData;
import in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView;
import in.swiggy.android.swiggylynx.ui.fragment.eventhandler.LynxFragmentEventHandler;
import in.swiggy.android.swiggylynx.ui.fragment.utils.LynxFragmentPluginHelperKt;
import in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel;
import in.swiggy.android.swiggylynx.utils.IllegalHostException;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import io.reactivex.processors.PublishProcessor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import javax.inject.Provider;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import lp0.l;
import mg0.e;
import os.g0;
import os.u;
import pq.f;
import wh0.d;
import wx.u7;
import xh0.h;
import xh0.j;
import xh0.l;
import xh0.m;

/* compiled from: LynxFragment.kt */
public final class LynxFragment extends f implements ILynxViewUpdateHandler, fi0.a, d, c, tr.c, tr.d, tr.b {
    public static final a Companion = new a((i) null);
    private final bp0.f A = b.b(new LynxFragment$keyboardStateHandler$2(this));
    private final ViewTreeObserver.OnGlobalLayoutListener B = new xh0.f(this);
    private l<? super String, k> C;

    /* renamed from: c  reason: collision with root package name */
    public e f19557c;

    /* renamed from: d  reason: collision with root package name */
    private PopUpWidgetCrossButtonPosition f19558d;

    /* renamed from: e  reason: collision with root package name */
    public Provider<LynxFragmentViewModel> f19559e;

    /* renamed from: f  reason: collision with root package name */
    private final bp0.f f19560f = GeneralUtilsKt.n(new LynxFragment$special$$inlined$viewModel$1(this, s.b(LynxFragmentViewModel.class), this));

    /* renamed from: g  reason: collision with root package name */
    private final Stack<SwiggyLynxWebView> f19561g = new Stack<>();

    /* renamed from: h  reason: collision with root package name */
    public yh0.a f19562h;

    /* renamed from: i  reason: collision with root package name */
    public fi0.d f19563i;
    private ei0.e j;
    public xh0.a k;

    /* renamed from: l  reason: collision with root package name */
    public uh0.a f19564l;

    /* renamed from: m  reason: collision with root package name */
    public n f19565m;
    public ps.b n;

    /* renamed from: o  reason: collision with root package name */
    public SharedPreferences f19566o;

    /* renamed from: p  reason: collision with root package name */
    public ef0.e f19567p;
    public cf0.i q;

    /* renamed from: r  reason: collision with root package name */
    public ky.a f19568r;

    /* renamed from: s  reason: collision with root package name */
    public ef0.f f19569s;
    public jr.a t;

    /* renamed from: u  reason: collision with root package name */
    public wd0.e f19570u;
    public os.a v;

    /* renamed from: w  reason: collision with root package name */
    public PublishProcessor<String> f19571w;

    /* renamed from: x  reason: collision with root package name */
    public PublishProcessor<String> f19572x;

    /* renamed from: y  reason: collision with root package name */
    public ks.d f19573y;

    /* renamed from: z  reason: collision with root package name */
    private l<? super Long, k> f19574z;

    /* compiled from: LynxFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: LynxFragment.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19580a;

        static {
            int[] iArr = new int[PopUpWidgetCrossButtonPosition.values().length];
            iArr[PopUpWidgetCrossButtonPosition.TOP_LEFT.ordinal()] = 1;
            iArr[PopUpWidgetCrossButtonPosition.TOP_RIGHT.ordinal()] = 2;
            f19580a = iArr;
        }
    }

    private final void C1() {
        SwiggyLynxWebView C0;
        Bundle arguments = getArguments();
        if (js.c.h(arguments == null ? null : Boolean.valueOf(arguments.getBoolean("isInstamart", false))) && (C0 = C0()) != null) {
            C0.evaluateJavascript("javascript: BUILD_IM_CART()", (ValueCallback) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(LynxFragment lynxFragment, xh0.l lVar) {
        p.j(lynxFragment, "this$0");
        if (lVar instanceof l.b) {
            lynxFragment.m0(((l.b) lVar).a());
        } else if (lVar instanceof l.a) {
            lynxFragment.K1(((l.a) lVar).a());
        }
    }

    private final void K1(boolean z11) {
        if (h1().F1() != null && z11) {
            t1();
            if (!Z0().empty()) {
                SwiggyLynxWebView pop = Z0().pop();
                pop.getViewTreeObserver().removeOnGlobalLayoutListener(this.B);
                z0().L.removeView(pop);
            }
        }
    }

    private final void L1() {
        Integer D1;
        Window window;
        if (z1() && (D1 = h1().D1()) != null) {
            int intValue = D1.intValue();
            FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void T1(lp0.a aVar, View view) {
        p.j(aVar, "$backClickAction");
        aVar.invoke();
    }

    private final di0.d U0() {
        return (di0.d) this.A.getValue();
    }

    /* access modifiers changed from: private */
    public static final void U1(lp0.a aVar, View view) {
        p.j(aVar, "$backClickAction");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void V1(lp0.l lVar, String str) {
        p.j(lVar, "$isShown");
        lVar.invoke(Boolean.valueOf(!o.u(str, "false", false)));
    }

    private final void W1() {
        ErrorView errorView = z0().E;
        errorView.setErrorType(2);
        errorView.setVisibility(0);
        errorView.setActionClickListener(new LynxFragment$showGenericError$1$1(this));
    }

    private final void m0(m mVar) {
        ei0.e eVar;
        String str;
        Class<a> cls = a.class;
        Context context = getContext();
        if (context != null) {
            SwiggyLynxWebView swiggyLynxWebView = new SwiggyLynxWebView(context);
            z0().L.addView(swiggyLynxWebView);
            Z0().push(swiggyLynxWebView);
            swiggyLynxWebView.setViewUpdateHandler(this);
            wh0.l lVar = wh0.l.f19962a;
            String d11 = mVar.d();
            ef0.e g12 = g1();
            ps.b B0 = B0();
            n Y0 = Y0();
            String e11 = mVar.e();
            ef0.f l12 = l1();
            SharedPreferences e12 = e1();
            bf0.a B2 = A0().B();
            p.i(B2, "cartService.cart");
            lVar.a(d11, g12, B0, Y0, e11, l12, e12, B2, swiggyLynxWebView, u0());
            if (z1()) {
                swiggyLynxWebView.getViewTreeObserver().addOnGlobalLayoutListener(this.B);
            }
            List<np.a> x12 = x1(mVar);
            ArrayList<String> O1 = h1().O1();
            String a11 = xp.a.f53337a.a(mVar.d());
            if (p.e(a11, "invalid")) {
                if (!Companion.getClass().isAnonymousClass()) {
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
                u.h(str, new IllegalHostException(mVar.d()));
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = O1.iterator();
            while (true) {
                eVar = null;
                if (it2.hasNext()) {
                    T next = it2.next();
                    if (o.w(a11, (String) next, false, 2, (Object) null)) {
                        arrayList.add(next);
                    }
                } else {
                    try {
                        break;
                    } catch (Exception e13) {
                        r1(e13, x12);
                        return;
                    }
                }
            }
            Object[] array = x12.toArray(new np.a[0]);
            p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            np.a[] aVarArr = (np.a[]) array;
            swiggyLynxWebView.setPlugins((np.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
            swiggyLynxWebView.setWhiteListedDomains(h1().O1());
            swiggyLynxWebView.setWebViewClient(k1());
            if (!(!arrayList.isEmpty()) || p.e(a11, "invalid")) {
                lp0.l<? super String, k> lVar2 = this.C;
                if (lVar2 != null) {
                    lVar2.invoke(mVar.d());
                }
                swiggyLynxWebView.l(mVar.d(), new HashMap(), mVar.a());
            } else {
                ei0.e eVar2 = this.j;
                if (eVar2 == null) {
                    p.B("chromeClient");
                } else {
                    eVar = eVar2;
                }
                swiggyLynxWebView.setWebChromeClient(eVar);
                swiggyLynxWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                lp0.l<? super String, k> lVar3 = this.C;
                if (lVar3 != null) {
                    lVar3.invoke(mVar.d());
                }
                swiggyLynxWebView.l(mVar.d(), mVar.b(), mVar.a());
            }
            swiggyLynxWebView.t(h1().getSharedPreferences());
            swiggyLynxWebView.setNewrelicPerformanceUtils(G0().m());
            a0(true);
        }
    }

    /* access modifiers changed from: private */
    public static final void m1(LynxFragment lynxFragment) {
        SwiggyLynxWebView C0;
        String str;
        String str2;
        Resources resources;
        DisplayMetrics displayMetrics;
        p.j(lynxFragment, "this$0");
        if (lynxFragment.isVisible() && lynxFragment.isResumed() && (C0 = lynxFragment.C0()) != null) {
            Rect rect = new Rect();
            C0.getWindowVisibleDisplayFrame(rect);
            int height = C0.getHeight() - (rect.bottom - rect.top);
            Context context = C0.getContext();
            float f11 = 1.0f;
            if (!(context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                f11 = displayMetrics.density;
            }
            if (height > lynxFragment.getResources().getDimensionPixelSize(R.dimen.dimen_50dp)) {
                try {
                    SwiggyLynxWebView C02 = lynxFragment.C0();
                    if (C02 != null) {
                        C02.evaluateJavascript("javascript: keyboardStateChanged(true, " + (((float) height) / f11) + ')', (ValueCallback) null);
                        k kVar = k.f22762a;
                    }
                } catch (Exception e11) {
                    if (!LynxFragment.class.isAnonymousClass()) {
                        str2 = LynxFragment.class.getSimpleName();
                        if (str2.length() > 23) {
                            p.i(str2, "name");
                            str2 = str2.substring(0, 23);
                            p.i(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str2, "{\n            val name =… first 23 chars\n        }");
                    } else {
                        String name = LynxFragment.class.getName();
                        if (name.length() > 23) {
                            p.i(name, "name");
                            name = name.substring(name.length() - 23, name.length());
                            p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str2, "{\n            val name =…/ last 23 chars\n        }");
                    }
                    u.h(str2, e11);
                    k kVar2 = k.f22762a;
                }
            } else {
                try {
                    SwiggyLynxWebView C03 = lynxFragment.C0();
                    if (C03 != null) {
                        C03.evaluateJavascript("javascript: keyboardStateChanged(false, 0)", (ValueCallback) null);
                        k kVar3 = k.f22762a;
                    }
                } catch (Exception e12) {
                    if (!LynxFragment.class.isAnonymousClass()) {
                        str = LynxFragment.class.getSimpleName();
                        if (str.length() > 23) {
                            p.i(str, "name");
                            str = str.substring(0, 23);
                            p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str, "{\n            val name =… first 23 chars\n        }");
                    } else {
                        String name2 = LynxFragment.class.getName();
                        if (name2.length() > 23) {
                            p.i(name2, "name");
                            name2 = name2.substring(name2.length() - 23, name2.length());
                            p.i(name2, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        p.i(str, "{\n            val name =…/ last 23 chars\n        }");
                    }
                    u.h(str, e12);
                    k kVar4 = k.f22762a;
                }
            }
        }
    }

    private final void n0() {
        sm0.d d11 = V0().d();
        if (d11 instanceof sm0.c) {
            ViewDataBinding i11 = g.i(getLayoutInflater(), in.swiggy.android.web.R.layout.view_instamart_loader, z0().F, true);
            p.i(i11, "inflate(\n               …rue\n                    )");
            sm0.d d12 = V0().d();
            Objects.requireNonNull(d12, "null cannot be cast to non-null type in.swiggy.android.web.loader.InstamartLoaderViewModel");
            ((qm0.g) i11).x0((sm0.c) d12);
        } else if (d11 instanceof sm0.a) {
            if (p.e(e1().getString("enable_genie_loader_lottie", "true"), "true")) {
                ViewDataBinding i12 = g.i(getLayoutInflater(), in.swiggy.android.web.R.layout.view_genie_loader, z0().F, true);
                p.i(i12, "inflate(\n               …                        )");
                sm0.d d13 = V0().d();
                Objects.requireNonNull(d13, "null cannot be cast to non-null type in.swiggy.android.web.loader.GenieLoaderViewModel");
                ((qm0.e) i12).x0((sm0.a) d13);
                return;
            }
            ViewDataBinding i13 = g.i(getLayoutInflater(), R.layout.view_web_loading, z0().F, true);
            p.i(i13, "inflate(\n               …rue\n                    )");
            ((u7) i13).x0(V0().d());
        } else if (d11 != null) {
            ViewDataBinding i14 = g.i(getLayoutInflater(), R.layout.view_web_loading, z0().F, true);
            p.i(i14, "inflate(\n               …r, true\n                )");
            ((u7) i14).x0(V0().d());
        }
    }

    private final void o1() {
        PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition = this.f19558d;
        int i11 = popUpWidgetCrossButtonPosition == null ? -1 : b.f19580a[popUpWidgetCrossButtonPosition.ordinal()];
        if (i11 == 1) {
            z0().C.setVisibility(0);
        } else if (i11 == 2) {
            z0().B.setVisibility(0);
        }
        z0().C.setOnClickListener(new xh0.c(this));
        z0().B.setOnClickListener(new xh0.b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p0() {
        /*
            r4 = this;
            xh0.a r0 = r4.V0()
            sm0.d r0 = r0.d()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x001c
        L_0x000e:
            androidx.databinding.ObservableBoolean r0 = r0.a()
            if (r0 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            boolean r0 = r0.g()
            if (r0 != r1) goto L_0x000c
            r0 = 1
        L_0x001c:
            if (r0 != 0) goto L_0x0039
            mg0.e r0 = r4.z0()
            in.swiggy.android.commonsui.view.errorview.ErrorView r0 = r0.E
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r4.C0()
            if (r0 != 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            r2 = 0
            java.lang.String r3 = "javascript: handleHardwareBack()"
            r0.evaluateJavascript(r3, r2)
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.ui.fragment.LynxFragment.p0():boolean");
    }

    /* access modifiers changed from: private */
    public static final void p1(LynxFragment lynxFragment, View view) {
        p.j(lynxFragment, "this$0");
        lynxFragment.x0();
    }

    /* access modifiers changed from: private */
    public static final void q1(LynxFragment lynxFragment, View view) {
        p.j(lynxFragment, "this$0");
        lynxFragment.x0();
    }

    private final void r1(Exception exc, List<? extends np.a> list) {
        String str;
        T t11;
        boolean z11;
        if (!LynxFragment.class.isAnonymousClass()) {
            str = LynxFragment.class.getSimpleName();
            if (str.length() > 23) {
                p.i(str, "name");
                str = str.substring(0, 23);
                p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =… first 23 chars\n        }");
        } else {
            String name = LynxFragment.class.getName();
            if (name.length() > 23) {
                p.i(name, "name");
                name = name.substring(name.length() - 23, name.length());
                p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =…/ last 23 chars\n        }");
        }
        u.h(str, exc);
        Iterator<T> it2 = list.iterator();
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
            D();
        }
    }

    private final void s1() {
        di0.d U0 = U0();
        SwiggyLynxWebView C0 = C0();
        if (U0.h(C0 == null ? null : C0.getUrl())) {
            U0().c();
        } else {
            U0().g();
        }
    }

    private final void t1() {
        if (z0().G.getVisibility() == 0) {
            z0().G.setVisibility(8);
        }
    }

    private final void v1(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        sm0.d dVar;
        Boolean bool5 = Boolean.TRUE;
        if (p.e(bool, bool5)) {
            dVar = new sm0.c(G0().getSharedPreferences(), R0(), G0().a());
        } else if (p.e(bool4, bool5)) {
            dVar = new sm0.a();
        } else {
            dVar = p.e(bool2, bool5) ? new sm0.d() : null;
        }
        P1(new j(dVar));
        if (bool3 != null && bool3.booleanValue()) {
            V0().a(true);
        }
    }

    private final void w1() {
        if (this.j == null) {
            this.j = new ei0.e(this, this, e1());
        }
    }

    private final List<np.a> x1(m mVar) {
        ArrayList arrayList = new ArrayList();
        for (SwiggyLynxPluginData swiggyLynxPluginData : h1().I1()) {
            if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.SwiggyLynxCorePluginData) {
                LynxFragmentPluginHelperKt.b(this, mVar.d(), mVar.e(), (Intent) null, arrayList, ((xh0.i) new androidx.navigation.e(s.b(xh0.i.class), new LynxFragment$initialisePlugins$lambda8$$inlined$navArgs$1(this)).getValue()).b());
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.DashPluginData) {
                LynxFragmentPluginHelperKt.c(this, mVar.d(), arrayList);
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.PaymentLynxPluginData) {
                LynxFragmentPluginHelperKt.d(this, ((SwiggyLynxPluginData.PaymentLynxPluginData) swiggyLynxPluginData).a(), arrayList, mVar.d());
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.PermissionPluginData) {
                LynxFragmentPluginHelperKt.a(this, arrayList);
            } else if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.LocationPluginData) {
                arrayList.add(new yg0.b(this, Y0(), G0().k()));
            }
        }
        return arrayList;
    }

    private final boolean z1() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("show_dash_loaders", false);
    }

    public final cf0.i A0() {
        cf0.i iVar = this.q;
        if (iVar != null) {
            return iVar;
        }
        p.B("cartService");
        return null;
    }

    public final boolean A1() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("isExternalWidget", false);
    }

    public final ps.b B0() {
        ps.b bVar = this.n;
        if (bVar != null) {
            return bVar;
        }
        p.B("contextService");
        return null;
    }

    public final boolean B1() {
        return this.k != null;
    }

    public HashMap<String, String> B5() {
        return a.C0223a.a(this);
    }

    public final SwiggyLynxWebView C0() {
        if (!this.f19561g.isEmpty()) {
            return this.f19561g.peek();
        }
        return null;
    }

    public void D() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public final void D1(Intent intent) {
        SwiggyLynxWebView C0;
        if (intent != null && (C0 = C0()) != null) {
            C0.o(intent);
        }
    }

    public final ky.a E0() {
        ky.a aVar = this.f19568r;
        if (aVar != null) {
            return aVar;
        }
        p.B("dashPostOrderHandler");
        return null;
    }

    public final void E1(LynxData lynxData, String str) {
        p.j(lynxData, "lynxData");
        p.j(str, "bottomBarDeeplink");
        SwiggyLynxWebView C0 = C0();
        h1().f2(lynxData, C0 == null ? null : C0.getUrl(), str);
    }

    public final void F1(String str) {
        p.j(str, "link");
        if (StringsKt__StringsKt.S(str, "explore", false, 2, (Object) null)) {
            d1().B0(str);
            x0();
        } else if (StringsKt__StringsKt.S(str, "food-page", false, 2, (Object) null)) {
            J0().B0(str);
            x0();
        }
    }

    public final yh0.a G0() {
        yh0.a aVar = this.f19562h;
        if (aVar != null) {
            return aVar;
        }
        p.B("dependencies");
        return null;
    }

    public final ks.d H0() {
        ks.d dVar = this.f19573y;
        if (dVar != null) {
            return dVar;
        }
        p.B("featureFlags");
        return null;
    }

    public void H7(String str, String str2, String str3, String str4) {
        a.C0223a.f(this, str, str2, str3, str4);
    }

    public void I1() {
        getChildFragmentManager().a1();
    }

    public final PublishProcessor<String> J0() {
        PublishProcessor<String> publishProcessor = this.f19572x;
        if (publishProcessor != null) {
            return publishProcessor;
        }
        p.B("hideRestoSubmitFeedback");
        return null;
    }

    public final void M1(e eVar) {
        p.j(eVar, "<set-?>");
        this.f19557c = eVar;
    }

    public Context N0() {
        return getContext();
    }

    public final void N1(lp0.l<? super Long, k> lVar) {
        this.f19574z = lVar;
    }

    public final void O1(boolean z11) {
        h1().S1().b(z11);
    }

    public final void P1(xh0.a aVar) {
        p.j(aVar, "<set-?>");
        this.k = aVar;
    }

    public final void Q1(lp0.l<? super String, k> lVar) {
        p.j(lVar, "callback");
        this.C = lVar;
    }

    public eo0.a R0() {
        return h1().A1();
    }

    public final void R1(fi0.d dVar) {
        p.j(dVar, "<set-?>");
        this.f19563i = dVar;
    }

    public void S1(boolean z11, WebResourceRequest webResourceRequest, zp.d dVar) {
        CharSequence a11;
        ErrorView errorView = z0().E;
        if (z11) {
            boolean z12 = false;
            if (!G0().g().isNetworkAvailable()) {
                errorView.setErrorType(0);
                errorView.setVisibility(0);
                errorView.setActionClickListener(new LynxFragment$showError$1$1(this));
                return;
            }
            SwiggyLynxWebView C0 = C0();
            if (C0 != null && C0.j(webResourceRequest, dVar)) {
                return;
            }
            if (p.e(G0().getSharedPreferences().getString("handle_received_error", "false"), "true")) {
                if (!(dVar == null || (a11 = dVar.a()) == null || !a11.equals("HTTPError"))) {
                    z12 = true;
                }
                if (!z12) {
                    W1();
                    return;
                }
                return;
            }
            W1();
            return;
        }
        errorView.setVisibility(8);
    }

    public boolean T() {
        if (isVisible()) {
            return h1().S1().a();
        }
        return false;
    }

    public final xh0.a V0() {
        xh0.a aVar = this.k;
        if (aVar != null) {
            return aVar;
        }
        p.B("loader");
        return null;
    }

    public final n Y0() {
        n nVar = this.f19565m;
        if (nVar != null) {
            return nVar;
        }
        p.B("locationContext");
        return null;
    }

    public final Stack<SwiggyLynxWebView> Z0() {
        return this.f19561g;
    }

    public void a0(boolean z11) {
        if (B1()) {
            z0().x0(V0());
            V0().c(z11);
        }
    }

    public final uh0.a a1() {
        uh0.a aVar = this.f19564l;
        if (aVar != null) {
            return aVar;
        }
        p.B("mSwiggyLynxInterface");
        return null;
    }

    @TargetApi(21)
    public void a6(WebChromeClient.FileChooserParams fileChooserParams, xm0.a aVar, int i11, pm0.f fVar, SharedPreferences sharedPreferences) {
        a.C0223a.c(this, fileChooserParams, aVar, i11, fVar, sharedPreferences);
    }

    public final jr.a b1() {
        jr.a aVar = this.t;
        if (aVar != null) {
            return aVar;
        }
        p.B("newrelicPerformanceUtils");
        return null;
    }

    public final wd0.e c1() {
        wd0.e eVar = this.f19570u;
        if (eVar != null) {
            return eVar;
        }
        p.B("oneClickService");
        return null;
    }

    public final PublishProcessor<String> d1() {
        PublishProcessor<String> publishProcessor = this.f19571w;
        if (publishProcessor != null) {
            return publishProcessor;
        }
        p.B("searchSubmitFeedback");
        return null;
    }

    public final SharedPreferences e1() {
        SharedPreferences sharedPreferences = this.f19566o;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        p.B("sharedPreferences");
        return null;
    }

    public final String f1() {
        return h1().L1().g();
    }

    public final ef0.e g1() {
        ef0.e eVar = this.f19567p;
        if (eVar != null) {
            return eVar;
        }
        p.B(LogSubCategory.Action.USER);
        return null;
    }

    public void h(boolean z11) {
        h1().l2(z11);
    }

    public final LynxFragmentViewModel h1() {
        return (LynxFragmentViewModel) this.f19560f.getValue();
    }

    public Context i6() {
        return getContext();
    }

    public final Provider<LynxFragmentViewModel> j1() {
        Provider<LynxFragmentViewModel> provider = this.f19559e;
        if (provider != null) {
            return provider;
        }
        p.B("viewModelProvider");
        return null;
    }

    public void k0(boolean z11, String str, lp0.a<k> aVar) {
        p.j(str, "title");
        p.j(aVar, "backClickAction");
        AdvancedToolbar advancedToolbar = z0().K;
        p.i(advancedToolbar, "binding.toolbar");
        if (z11) {
            z0().G.setVisibility(0);
            advancedToolbar.setTitle((CharSequence) str);
            advancedToolbar.setNavigationOnClickListener(new xh0.e(aVar));
            return;
        }
        z0().G.setVisibility(8);
        advancedToolbar.setTitle((CharSequence) null);
        advancedToolbar.setNavigationOnClickListener(new xh0.d(aVar));
    }

    public final fi0.d k1() {
        fi0.d dVar = this.f19563i;
        if (dVar != null) {
            return dVar;
        }
        p.B("webViewClient");
        return null;
    }

    public void l(String str, String str2, lp0.l<? super Boolean, k> lVar) {
        p.j(str, "clickedTabIdentifier");
        p.j(lVar, "isShown");
        String str3 = "javascript: allowNativeBottomBarExit('" + h1().B1(str, str2) + "')";
        SwiggyLynxWebView C0 = C0();
        if (C0 != null) {
            C0.evaluateJavascript(str3, new xh0.g(lVar));
        }
    }

    public final ef0.f l1() {
        ef0.f fVar = this.f19569s;
        if (fVar != null) {
            return fVar;
        }
        p.B("xpExperimentContext");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r0 = r0.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n1() {
        /*
            r6 = this;
            boolean r0 = r6.isVisible()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            int r0 = r0.p0()
            r2 = 1
            if (r0 <= 0) goto L_0x001b
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            r0.d1()
            return r2
        L_0x001b:
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r6.C0()
            r3 = 0
            r4 = 2
            if (r0 != 0) goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0035
        L_0x0025:
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            java.lang.String r5 = "custom_back=true"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r0, r5, r1, r4, r3)
            if (r0 != r2) goto L_0x0023
            r0 = 1
        L_0x0035:
            if (r0 != 0) goto L_0x006c
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r6.C0()
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x004f
        L_0x003f:
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x0046
            goto L_0x003d
        L_0x0046:
            java.lang.String r5 = "play-game"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r0, r5, r1, r4, r3)
            if (r0 != r2) goto L_0x003d
            r0 = 1
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            goto L_0x006c
        L_0x0052:
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r6.C0()
            if (r0 != 0) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            boolean r0 = r0.canGoBack()
            if (r0 != r2) goto L_0x0060
            r1 = 1
        L_0x0060:
            if (r1 == 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel r0 = r6.h1()
            boolean r2 = r0.P1()
            goto L_0x0070
        L_0x006c:
            boolean r2 = r6.p0()
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.ui.fragment.LynxFragment.n1():boolean");
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        SwiggyLynxWebView C0 = C0();
        if (C0 != null) {
            C0.n(i11, i12, intent);
        }
        ei0.e eVar = this.j;
        if (eVar == null) {
            p.B("chromeClient");
            eVar = null;
        }
        eVar.a(i11, i12, intent);
        super.onActivityResult(i11, i12, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.j(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        Serializable serializable = null;
        Boolean valueOf = arguments == null ? null : Boolean.valueOf(arguments.getBoolean("isInstamart", false));
        Boolean valueOf2 = Boolean.valueOf(z1());
        Boolean valueOf3 = Boolean.valueOf(A1());
        Bundle arguments2 = getArguments();
        v1(valueOf, valueOf2, valueOf3, arguments2 == null ? null : Boolean.valueOf(arguments2.getBoolean("isGenie", false)));
        ViewDataBinding i11 = g.i(layoutInflater, in.swiggy.android.swiggylynx.R.layout.fragment_lynx, viewGroup, false);
        p.i(i11, "inflate(inflater, R.layo…t_lynx, container, false)");
        M1((e) i11);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            serializable = arguments3.getSerializable("cross_button_postion");
        }
        this.f19558d = (PopUpWidgetCrossButtonPosition) serializable;
        View G = z0().G();
        p.i(G, "binding.root");
        return G;
    }

    public void onPause() {
        SwiggyLynxWebView C0;
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        SwiggyLynxWebView C02 = C0();
        if (C02 != null) {
            C02.onPause();
        }
        if (!(!z1() || (C0 = C0()) == null || (viewTreeObserver = C0.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.B);
        }
        L1();
    }

    public void onResume() {
        String g11;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        super.onResume();
        SwiggyLynxWebView C0 = C0();
        if (C0 != null) {
            C0.onResume();
        }
        if (z1()) {
            SwiggyLynxWebView C02 = C0();
            if (!(C02 == null || (viewTreeObserver2 = C02.getViewTreeObserver()) == null)) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.B);
            }
            SwiggyLynxWebView C03 = C0();
            if (!(C03 == null || (viewTreeObserver = C03.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnGlobalLayoutListener(this.B);
            }
        }
        C1();
        if (!A1() && (g11 = h1().L1().g()) != null) {
            vt.c cVar = vt.c.f53915a;
            cVar.d(!cVar.c(dt.c.f(g11, 0, 1, (Object) null)), getActivity());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        p.j(view, "view");
        super.onViewCreated(view, bundle);
        n0();
        w1();
        Context requireContext = requireContext();
        p.i(requireContext, "requireContext()");
        SharedPreferences sharedPreferences = h1().getSharedPreferences();
        ef0.f i02 = h1().i0();
        Gson i11 = g0.i();
        p.i(i11, "getGson()");
        R1(new fi0.d(this, requireContext, sharedPreferences, i02, i11, G0().n(), h1().g(), b1()));
        h1().E1().j(getViewLifecycleOwner(), new h(this));
        h1().h2(((xh0.i) new androidx.navigation.e(s.b(xh0.i.class), new LynxFragment$onViewCreated$$inlined$navArgs$1(this)).getValue()).a(), false);
        ai0.a aVar = new ai0.a(this);
        r viewLifecycleOwner = getViewLifecycleOwner();
        p.i(viewLifecycleOwner, "viewLifecycleOwner");
        new LynxFragmentEventHandler(aVar, viewLifecycleOwner).b(h1().C1());
        z0().z0(h1());
        FragmentActivity activity = getActivity();
        Integer num = null;
        if (!(activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null)) {
            num = Integer.valueOf(attributes.softInputMode);
        }
        h1().k2(num);
        if (this.f19558d != null) {
            o1();
        }
        if (A1()) {
            z0().I.setVisibility(8);
        } else {
            h1().init();
        }
        U0().e(getActivity(), d.a.b.f18270a);
    }

    public void t0(String str, Map<String, String> map, boolean z11, boolean z12, boolean z13, String str2, String str3, boolean z14) {
        p.j(str, "url");
        p.j(map, "additionalHeaders");
        a0(true);
        h1().g2(str, z12, map, z11, str3);
        if (z13 && str3 != null) {
            ILynxViewUpdateHandler.DefaultImpls.b(this, true, (String) null, new LynxFragment$loadUrl$1(this, str3), 2, (Object) null);
        }
    }

    public final void u(String str) {
        p.j(str, "hexColor");
        h1().m2(str);
        if (!A1()) {
            vt.c cVar = vt.c.f53915a;
            cVar.d(!cVar.c(dt.c.f(str, 0, 1, (Object) null)), getActivity());
        }
    }

    public final os.a u0() {
        os.a aVar = this.v;
        if (aVar != null) {
            return aVar;
        }
        p.B("appBuildDetails");
        return null;
    }

    public /* synthetic */ void u1(Context context) {
        hd0.b.a(this, context);
    }

    public void w9(Uri uri) {
        a.C0223a.e(this, uri);
    }

    public void x0() {
        this.f19561g.clear();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            lp0.l<? super Long, k> lVar = this.f19574z;
            if (lVar == null) {
                us.f k11 = G0().k();
                if (k11 != null) {
                    k11.t(activity);
                }
            } else if (lVar != null) {
                lVar.invoke(150L);
            }
        }
    }

    public void y1() {
        s1();
    }

    public final e z0() {
        e eVar = this.f19557c;
        if (eVar != null) {
            return eVar;
        }
        p.B("binding");
        return null;
    }
}
