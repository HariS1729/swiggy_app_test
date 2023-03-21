package eh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.JuspayEligibilityRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickEligibilityRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.OneClickVSCRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit.JustpayInitRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaytransaction.JuspayMakePaymentRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaywalletinit.InitJuspayWalletRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp.b;
import zp.d;

/* compiled from: IJuspayPlugin.kt */
public interface a extends np.a {
    public static final C0220a Companion = C0220a.f18289a;

    /* renamed from: eh0.a$a  reason: collision with other inner class name */
    /* compiled from: IJuspayPlugin.kt */
    public static final class C0220a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0220a f18289a = new C0220a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f18290b = new np.b("IS_JUSPAY_AVAILABLE", (cq0.a) null, 2, (i) null);

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f18291c = new np.b("JUSPAY_INIT", JustpayInitRequestPayload.Companion.serializer());

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f18292d;

        /* renamed from: e  reason: collision with root package name */
        private static final np.b f18293e;

        /* renamed from: f  reason: collision with root package name */
        private static final np.b f18294f;

        /* renamed from: g  reason: collision with root package name */
        private static final np.b f18295g = new np.b("INIT_JUSPAY_WALLET", InitJuspayWalletRequestPayload.Companion.serializer());

        /* renamed from: h  reason: collision with root package name */
        private static final np.b f18296h;

        /* renamed from: i  reason: collision with root package name */
        private static final np.b f18297i = new np.b("GET_CRED_ELIGIBILTY", JuspayEligibilityRequestPayload.Companion.serializer());
        private static final np.b j = new np.b("GET_CRED_ELIGIBILTY_FROM_APP_CACHE", (cq0.a) null, 2, (i) null);
        private static final np.b k;

        /* renamed from: l  reason: collision with root package name */
        private static final np.b f18298l = new np.b("GET_ONE_CLICK_CARD_ELIGIBILITY", OneClickEligibilityRequestPayload.Companion.serializer());

        /* renamed from: m  reason: collision with root package name */
        private static final np.b f18299m;
        private static final np.b n;

        /* renamed from: o  reason: collision with root package name */
        private static final np.b f18300o;

        /* renamed from: p  reason: collision with root package name */
        private static final np.b f18301p;

        static {
            JuspayMakePaymentRequestPayload.Companion companion = JuspayMakePaymentRequestPayload.Companion;
            f18292d = new np.b("PAY_USING_JUSPAY_NB", companion.serializer());
            f18293e = new np.b("PAY_USING_SAVED_CARD", companion.serializer());
            f18294f = new np.b("PAY_USING_JUSPAY_NEW_CARD", companion.serializer());
            f18296h = new np.b("PAY_USING_JUSPAY_WALLET", companion.serializer());
            k = new np.b("PAY_USING_JUSPAY_WALLET_CRED", companion.serializer());
            OneClickVSCRequestPayload.Companion companion2 = OneClickVSCRequestPayload.Companion;
            f18299m = new np.b("ONE_CLICK_DE_ENROLL", companion2.serializer());
            n = new np.b("DELETE_CARD", companion2.serializer());
            b.C0657b bVar = lp.b.Companion;
            f18300o = new np.b("TRANSACTION_CONFIRMED_EVENT", bVar.a());
            f18301p = new np.b("TRANSACTION_FAILED_EVENT", bVar.a());
        }

        private C0220a() {
        }

        public final np.b a() {
            return f18297i;
        }

        public final np.b b() {
            return j;
        }

        public final np.b c() {
            return f18298l;
        }

        public final np.b d() {
            return f18295g;
        }

        public final np.b e() {
            return f18290b;
        }

        public final np.b f() {
            return f18291c;
        }

        public final np.b g() {
            return n;
        }

        public final np.b h() {
            return f18299m;
        }

        public final np.b i() {
            return f18292d;
        }

        public final np.b j() {
            return f18294f;
        }

        public final np.b k() {
            return f18296h;
        }

        public final np.b l() {
            return k;
        }

        public final np.b m() {
            return f18293e;
        }

        public final np.b n() {
            return f18300o;
        }

        public final np.b o() {
            return f18301p;
        }
    }

    /* compiled from: IJuspayPlugin.kt */
    public static final class b {
        public static ArrayList<np.b> a(a aVar) {
            p.j(aVar, "this");
            C0220a aVar2 = a.Companion;
            return k.f(aVar2.e(), aVar2.f(), aVar2.i(), aVar2.m(), aVar2.j(), aVar2.d(), aVar2.k(), aVar2.a(), aVar2.b(), aVar2.l(), aVar2.c(), aVar2.h(), aVar2.g(), aVar2.n(), aVar2.o());
        }

        public static void b(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0220a aVar3 = a.Companion;
            if (p.e(c11, aVar3.e())) {
                aVar.Z(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.f())) {
                aVar.V((JustpayInitRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.i())) {
                aVar.G((JuspayMakePaymentRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
            } else {
                if (p.e(c11, aVar3.m()) ? true : p.e(c11, aVar3.j())) {
                    aVar.E((JuspayMakePaymentRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.d())) {
                    aVar.b0((InitJuspayWalletRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.k())) {
                    aVar.U((JuspayMakePaymentRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.a())) {
                    aVar.w((JuspayEligibilityRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.b())) {
                    aVar.O0(aVar2.a(), aVar2.b(), bVar);
                } else if (p.e(c11, aVar3.l())) {
                    aVar.n0((JuspayMakePaymentRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.c())) {
                    aVar.q((OneClickEligibilityRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.h())) {
                    aVar.y((OneClickVSCRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.g())) {
                    aVar.l0((OneClickVSCRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.n())) {
                    aVar.t(aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                } else if (p.e(c11, aVar3.o())) {
                    aVar.t(aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
                }
            }
        }

        public static boolean c(a aVar, WebResourceRequest webResourceRequest, d dVar) {
            p.j(aVar, "this");
            return false;
        }

        public static void d(a aVar, int i11, int i12, Intent intent) {
            p.j(aVar, "this");
        }

        public static void e(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
        }
    }

    void E(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void G(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void O0(lp.b bVar, String str, zp.b bVar2);

    void U(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void V(JustpayInitRequestPayload justpayInitRequestPayload, String str, zp.b bVar);

    void Z(lp.b bVar, String str, zp.b bVar2);

    void b0(InitJuspayWalletRequestPayload initJuspayWalletRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void l0(OneClickVSCRequestPayload oneClickVSCRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void n0(JuspayMakePaymentRequestPayload juspayMakePaymentRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void q(OneClickEligibilityRequestPayload oneClickEligibilityRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void t(lp.b bVar, String str, zp.b bVar2, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void w(JuspayEligibilityRequestPayload juspayEligibilityRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void y(OneClickVSCRequestPayload oneClickVSCRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);
}
