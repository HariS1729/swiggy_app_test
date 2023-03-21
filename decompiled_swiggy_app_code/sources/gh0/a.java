package gh0;

import android.content.Intent;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending.PaymentPendingRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus.SendLinkAccountStatusRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: IPaymentCorePlugin.kt */
public interface a extends np.a, sg0.b {
    public static final C0224a Companion = C0224a.f18336a;

    /* renamed from: gh0.a$a  reason: collision with other inner class name */
    /* compiled from: IPaymentCorePlugin.kt */
    public static final class C0224a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0224a f18336a = new C0224a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f18337b;

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f18338c = new np.b("ORDER_FAILED_EVENT", OrderFailedRequestPayload.Companion.serializer());

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f18339d = new np.b("GET_CHECKOUT_META_INFO", (cq0.a) null, 2, (i) null);

        /* renamed from: e  reason: collision with root package name */
        private static final np.b f18340e = new np.b("SWITCH_TO_NATIVE_PAYMENT", (cq0.a) null, 2, (i) null);

        /* renamed from: f  reason: collision with root package name */
        private static final np.b f18341f;

        /* renamed from: g  reason: collision with root package name */
        private static final np.b f18342g = new np.b("PAYMENT_IN_PENDING_STATE", PaymentPendingRequestPayload.Companion.serializer());

        /* renamed from: h  reason: collision with root package name */
        private static final np.b f18343h = new np.b("SEND_LINK_ACCOUNT_STATUS", SendLinkAccountStatusRequestPayload.Companion.serializer());

        static {
            PostOrderRequestPayload.Companion companion = PostOrderRequestPayload.Companion;
            f18337b = new np.b("POST_ORDER_EVENT", companion.serializer());
            f18341f = new np.b("ORDER_CONFIRMED_EVENT", companion.serializer());
        }

        private C0224a() {
        }

        public final np.b a() {
            return f18339d;
        }

        public final np.b b() {
            return f18341f;
        }

        public final np.b c() {
            return f18338c;
        }

        public final np.b d() {
            return f18342g;
        }

        public final np.b e() {
            return f18337b;
        }

        public final np.b f() {
            return f18343h;
        }

        public final np.b g() {
            return f18340e;
        }
    }

    /* compiled from: IPaymentCorePlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            C0224a aVar2 = a.Companion;
            return k.f(aVar2.e(), aVar2.c(), aVar2.a(), aVar2.g(), aVar2.b(), aVar2.d(), aVar2.f());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0224a aVar3 = a.Companion;
            if (p.e(c11, aVar3.e())) {
                aVar.b((PostOrderRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.c())) {
                aVar.S0((OrderFailedRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.a())) {
                aVar.c0(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.g())) {
                aVar.a(aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
            } else if (p.e(c11, aVar3.b())) {
                aVar.H0((PostOrderRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.d())) {
                aVar.r0((PaymentPendingRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.f())) {
                aVar.u0((SendLinkAccountStatusRequestPayload) aVar2.a(), aVar2.b(), bVar);
            }
        }

        public static boolean d(a aVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            return false;
        }

        public static void e(a aVar, int i11, int i12, Intent intent) {
            p.j(aVar, "this");
        }

        public static void f(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
        }
    }

    void H0(PostOrderRequestPayload postOrderRequestPayload, String str, zp.b bVar);

    void S0(OrderFailedRequestPayload orderFailedRequestPayload, String str, zp.b bVar);

    void a(lp.b bVar, String str, zp.b bVar2, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void b(PostOrderRequestPayload postOrderRequestPayload, String str, zp.b bVar);

    void c0(lp.b bVar, String str, zp.b bVar2);

    void r0(PaymentPendingRequestPayload paymentPendingRequestPayload, String str, zp.b bVar);

    void u0(SendLinkAccountStatusRequestPayload sendLinkAccountStatusRequestPayload, String str, zp.b bVar);
}
