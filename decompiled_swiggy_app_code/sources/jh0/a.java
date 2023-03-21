package jh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.payusingphonepe.PhonePeMakePaymentRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import mh0.d;

/* compiled from: IPhonePePlugin.kt */
public interface a extends d {
    public static final C0230a Companion = C0230a.f19629a;

    /* renamed from: jh0.a$a  reason: collision with other inner class name */
    /* compiled from: IPhonePePlugin.kt */
    public static final class C0230a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0230a f19629a = new C0230a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19630b = new np.b("IS_PHONEPE_SDK_AVAILABLE", lp.b.Companion.a());

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19631c = new np.b("MAKE_PAYMENT_USING_PHONEPE", PhonePeMakePaymentRequestPayload.Companion.serializer());

        private C0230a() {
        }

        public final np.b a() {
            return f19630b;
        }

        public final np.b b() {
            return f19631c;
        }
    }

    /* compiled from: IPhonePePlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
            d.a.a(aVar);
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            C0230a aVar2 = a.Companion;
            return k.f(aVar2.a(), aVar2.b());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0230a aVar3 = a.Companion;
            if (p.e(c11, aVar3.a())) {
                aVar.N(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.b())) {
                aVar.z0((PhonePeMakePaymentRequestPayload) aVar2.a(), aVar2.b(), bVar);
            }
        }

        public static boolean d(a aVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            return d.a.b(aVar, iLynxViewUpdateHandler);
        }

        public static boolean e(a aVar, WebResourceRequest webResourceRequest, zp.d dVar) {
            p.j(aVar, "this");
            return d.a.c(aVar, webResourceRequest, dVar);
        }

        public static void f(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
            d.a.e(aVar, intent);
        }
    }

    void N(lp.b bVar, String str, zp.b bVar2);

    void z0(PhonePeMakePaymentRequestPayload phonePeMakePaymentRequestPayload, String str, zp.b bVar);
}
