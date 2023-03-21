package mh0;

import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.model.WebViewLastState;
import in.swiggy.android.swiggylynx.plugin.account.VerifyMobileNumberPayload;
import in.swiggy.android.swiggylynx.plugin.statusbar.StatusBarColorChangePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.CopyToClipBoardPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.closeWebViewWithParams.CloseWebViewWithParamsRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.giftingpersonalizedmessage.UserFlowInfoRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.launchBrowser.LaunchBrowserPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.screencapturing.StartStopScreenCapturing;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.sendClevertapEvent.SendClevertapEventRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.toggleBottomBarViewParams.ToggleBottomBarViewRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.updateConversation.UpdateConversationIdRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.vibrate.VibratePayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import lp.b;
import op.a;

/* compiled from: ISwiggyLynxCorePlugin.kt */
public interface b extends op.a, sg0.b {
    public static final a Companion = a.f19754a;

    /* compiled from: ISwiggyLynxCorePlugin.kt */
    public static final class a {
        private static final np.b A = new np.b("TOGGLE_NATIVE_BOTTOM_BAR", ToggleBottomBarViewRequestPayload.Companion.serializer());
        private static final np.b B = new np.b("WEBVIEW_LAST_STATE", WebViewLastState.Companion.serializer());
        private static final np.b C = new np.b("SCREEN_CAPTURING", StartStopScreenCapturing.Companion.serializer());
        private static final np.b D;

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f19754a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19755b = new np.b("NAVIGATE_TO_SCREEN", NavigateToScreenRequestPayload.Companion.serializer());

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19756c;

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f19757d;

        /* renamed from: e  reason: collision with root package name */
        private static final np.b f19758e = new np.b("CLOSE_WEBVIEW", CloseWebViewWithParamsRequestPayload.Companion.serializer());

        /* renamed from: f  reason: collision with root package name */
        private static final np.b f19759f;

        /* renamed from: g  reason: collision with root package name */
        private static final np.b f19760g;

        /* renamed from: h  reason: collision with root package name */
        private static final np.b f19761h = new np.b("SEND_CLEVERTAP_EVENT", SendClevertapEventRequestPayload.Companion.serializer());

        /* renamed from: i  reason: collision with root package name */
        private static final np.b f19762i;
        private static final np.b j;
        private static final np.b k;

        /* renamed from: l  reason: collision with root package name */
        private static final np.b f19763l = new np.b("UPDATE_CONVERSATION_ID", UpdateConversationIdRequestPayload.Companion.serializer());

        /* renamed from: m  reason: collision with root package name */
        private static final np.b f19764m = new np.b("DIALOG_ALERT", qp.a.f53157d.a());
        private static final np.b n = new np.b("VIBRATE", VibratePayload.Companion.serializer());

        /* renamed from: o  reason: collision with root package name */
        private static final np.b f19765o = new np.b("COPY_TEXT_TO_CLIPBOARD", CopyToClipBoardPayload.Companion.serializer());

        /* renamed from: p  reason: collision with root package name */
        private static final np.b f19766p = new np.b("STATUS_BAR_CHANGE", StatusBarColorChangePayload.Companion.serializer());
        private static final np.b q;

        /* renamed from: r  reason: collision with root package name */
        private static final np.b f19767r = new np.b("LAUNCH_BROWSER", LaunchBrowserPayload.Companion.serializer());

        /* renamed from: s  reason: collision with root package name */
        private static final np.b f19768s;
        private static final np.b t = new np.b("SET_LOCATION", SetLocationRequestPayload.Companion.serializer());

        /* renamed from: u  reason: collision with root package name */
        private static final np.b f19769u = new np.b("SET_RECIPIENT_INFO", UserFlowInfoRequestPayload.Companion.serializer());
        private static final np.b v;

        /* renamed from: w  reason: collision with root package name */
        private static final np.b f19770w = new np.b("VERIFY_MOBILE_NUMBER", VerifyMobileNumberPayload.Companion.serializer());

        /* renamed from: x  reason: collision with root package name */
        private static final np.b f19771x;

        /* renamed from: y  reason: collision with root package name */
        private static final np.b f19772y;

        /* renamed from: z  reason: collision with root package name */
        private static final np.b f19773z = new np.b("GET_NEXT_STEP_DETAILS", GetNextStepDetailsRequestPayload.Companion.serializer());

        static {
            b.C0657b bVar = lp.b.Companion;
            f19756c = new np.b("GET_USER_INFO", bVar.a());
            f19757d = new np.b("CLEAR_CART", bVar.a());
            f19759f = new np.b("GET_SWIGGY_HEADERS", bVar.a());
            f19760g = new np.b("CLEAR_WEB_HISTORY", bVar.a());
            f19762i = new np.b("HIDE_LOADER", bVar.a());
            j = new np.b("SHOW_LOADER", bVar.a());
            k = new np.b("GET_SUPPORT_UNREAD_CONVERSATION_DATA", bVar.a());
            q = new np.b("LAUNCH_SOFT_KEYBOARD", bVar.a());
            f19768s = new np.b("IS_ACCESSIBILITY_ENABLED", bVar.a());
            v = new np.b("PHONE_CONTACT", bVar.a());
            f19771x = new np.b("LOGOUT", bVar.a());
            f19772y = new np.b("SWIGGY_APP_SETTINGS", bVar.a());
            D = new np.b("IS_LOCATION_ENABLED", bVar.a());
        }

        private a() {
        }

        public final np.b A() {
            return f19770w;
        }

        public final np.b B() {
            return n;
        }

        public final np.b C() {
            return B;
        }

        public final np.b a() {
            return f19772y;
        }

        public final np.b b() {
            return f19757d;
        }

        public final np.b c() {
            return f19760g;
        }

        public final np.b d() {
            return f19758e;
        }

        public final np.b e() {
            return f19765o;
        }

        public final np.b f() {
            return f19764m;
        }

        public final np.b g() {
            return f19773z;
        }

        public final np.b h() {
            return k;
        }

        public final np.b i() {
            return f19759f;
        }

        public final np.b j() {
            return f19756c;
        }

        public final np.b k() {
            return f19762i;
        }

        public final np.b l() {
            return f19768s;
        }

        public final np.b m() {
            return D;
        }

        public final np.b n() {
            return f19767r;
        }

        public final np.b o() {
            return q;
        }

        public final np.b p() {
            return f19771x;
        }

        public final np.b q() {
            return f19755b;
        }

        public final np.b r() {
            return v;
        }

        public final np.b s() {
            return C;
        }

        public final np.b t() {
            return f19761h;
        }

        public final np.b u() {
            return t;
        }

        public final np.b v() {
            return f19769u;
        }

        public final np.b w() {
            return j;
        }

        public final np.b x() {
            return f19766p;
        }

        public final np.b y() {
            return A;
        }

        public final np.b z() {
            return f19763l;
        }
    }

    /* renamed from: mh0.b$b  reason: collision with other inner class name */
    /* compiled from: ISwiggyLynxCorePlugin.kt */
    public static final class C0234b {
        public static ArrayList<np.b> a(b bVar) {
            p.j(bVar, "this");
            ArrayList<np.b> arrayList = new ArrayList<>();
            a aVar = b.Companion;
            arrayList.add(aVar.q());
            arrayList.add(aVar.j());
            arrayList.add(aVar.b());
            arrayList.add(aVar.d());
            arrayList.add(aVar.i());
            arrayList.add(aVar.c());
            arrayList.add(aVar.t());
            arrayList.add(aVar.h());
            arrayList.add(aVar.z());
            arrayList.add(aVar.k());
            arrayList.add(aVar.w());
            arrayList.add(aVar.f());
            arrayList.add(aVar.B());
            arrayList.add(aVar.e());
            arrayList.add(aVar.x());
            arrayList.add(aVar.o());
            arrayList.add(aVar.n());
            arrayList.add(aVar.l());
            arrayList.add(aVar.u());
            arrayList.add(aVar.v());
            arrayList.add(aVar.r());
            arrayList.add(aVar.p());
            arrayList.add(aVar.A());
            arrayList.add(aVar.a());
            arrayList.add(aVar.g());
            arrayList.add(aVar.y());
            arrayList.add(aVar.C());
            arrayList.add(aVar.s());
            arrayList.add(aVar.m());
            arrayList.addAll(a.b.a(bVar));
            return arrayList;
        }

        public static void b(b bVar, lp.a aVar, zp.b bVar2, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(bVar, "this");
            p.j(aVar, "request");
            p.j(bVar2, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar.c();
            a aVar2 = b.Companion;
            if (p.e(c11, aVar2.q())) {
                bVar.P0((NavigateToScreenRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.j())) {
                bVar.u(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.b())) {
                bVar.C0(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.d())) {
                bVar.f0((CloseWebViewWithParamsRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.i())) {
                bVar.K(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.c())) {
                bVar.f(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.t())) {
                bVar.g0((SendClevertapEventRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.h())) {
                bVar.j0(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.z())) {
                bVar.p0((UpdateConversationIdRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.k())) {
                bVar.P(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.w())) {
                bVar.L0(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.f())) {
                bVar.K0((qp.a) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.B())) {
                bVar.j(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.e())) {
                bVar.R(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.x())) {
                bVar.I(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.o())) {
                bVar.l(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.n())) {
                bVar.D((LaunchBrowserPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.l())) {
                bVar.F(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.A())) {
                bVar.t0((VerifyMobileNumberPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.p())) {
                bVar.y0(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.u())) {
                bVar.o((SetLocationRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.v())) {
                bVar.B0((UserFlowInfoRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.r())) {
                bVar.a0(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.a())) {
                bVar.w0(aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.g())) {
                bVar.m0((GetNextStepDetailsRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.y())) {
                bVar.J0((ToggleBottomBarViewRequestPayload) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.C())) {
                bVar.V0((WebViewLastState) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.s())) {
                bVar.T0((StartStopScreenCapturing) aVar.a(), aVar.b(), bVar2);
            } else if (p.e(c11, aVar2.m())) {
                bVar.O(aVar.a(), aVar.b(), bVar2);
            } else {
                a.b.b(bVar, aVar, bVar2, iLynxViewUpdateHandler);
            }
        }
    }

    void B0(UserFlowInfoRequestPayload userFlowInfoRequestPayload, String str, zp.b bVar);

    void C0(lp.b bVar, String str, zp.b bVar2);

    void D(LaunchBrowserPayload launchBrowserPayload, String str, zp.b bVar);

    void F(lp.b bVar, String str, zp.b bVar2);

    void I(lp.b bVar, String str, zp.b bVar2);

    void J0(ToggleBottomBarViewRequestPayload toggleBottomBarViewRequestPayload, String str, zp.b bVar);

    void K(lp.b bVar, String str, zp.b bVar2);

    void K0(qp.a aVar, String str, zp.b bVar);

    void L0(lp.b bVar, String str, zp.b bVar2);

    void O(lp.b bVar, String str, zp.b bVar2);

    void P(lp.b bVar, String str, zp.b bVar2);

    void P0(NavigateToScreenRequestPayload navigateToScreenRequestPayload, String str, zp.b bVar);

    void R(lp.b bVar, String str, zp.b bVar2);

    void T0(StartStopScreenCapturing startStopScreenCapturing, String str, zp.b bVar);

    void V0(WebViewLastState webViewLastState, String str, zp.b bVar);

    void a0(lp.b bVar, String str, zp.b bVar2);

    void f(lp.b bVar, String str, zp.b bVar2);

    void f0(CloseWebViewWithParamsRequestPayload closeWebViewWithParamsRequestPayload, String str, zp.b bVar);

    void g0(SendClevertapEventRequestPayload sendClevertapEventRequestPayload, String str, zp.b bVar);

    void j(lp.b bVar, String str, zp.b bVar2);

    void j0(lp.b bVar, String str, zp.b bVar2);

    void l(lp.b bVar, String str, zp.b bVar2);

    void m0(GetNextStepDetailsRequestPayload getNextStepDetailsRequestPayload, String str, zp.b bVar);

    void o(SetLocationRequestPayload setLocationRequestPayload, String str, zp.b bVar);

    void p0(UpdateConversationIdRequestPayload updateConversationIdRequestPayload, String str, zp.b bVar);

    void t0(VerifyMobileNumberPayload verifyMobileNumberPayload, String str, zp.b bVar);

    void u(lp.b bVar, String str, zp.b bVar2);

    void w0(lp.b bVar, String str, zp.b bVar2);

    void y0(lp.b bVar, String str, zp.b bVar2);
}
