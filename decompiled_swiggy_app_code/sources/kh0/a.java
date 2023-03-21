package kh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.isupiavailable.IsUpiAvailableRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction.UpiTransactionRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import zp.d;

/* compiled from: IUpiPlugin.kt */
public interface a extends np.a {
    public static final C0231a Companion = C0231a.f19650a;

    /* renamed from: kh0.a$a  reason: collision with other inner class name */
    /* compiled from: IUpiPlugin.kt */
    public static final class C0231a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0231a f19650a = new C0231a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19651b = new np.b("IS_UPI_INTENT_METHOD_AVAILABLE", IsUpiAvailableRequestPayload.Companion.serializer());

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19652c = new np.b("PAY_USING_UPI_INTENT", UpiTransactionRequestPayload.Companion.serializer());

        private C0231a() {
        }

        public final np.b a() {
            return f19651b;
        }

        public final np.b b() {
            return f19652c;
        }
    }

    /* compiled from: IUpiPlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            C0231a aVar2 = a.Companion;
            return k.f(aVar2.a(), aVar2.b());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0231a aVar3 = a.Companion;
            if (p.e(c11, aVar3.a())) {
                aVar.v((IsUpiAvailableRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.b())) {
                aVar.M0((UpiTransactionRequestPayload) aVar2.a(), aVar2.b(), bVar);
            }
        }

        public static boolean d(a aVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            return false;
        }

        public static boolean e(a aVar, WebResourceRequest webResourceRequest, d dVar) {
            p.j(aVar, "this");
            return false;
        }

        public static void f(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
        }
    }

    void M0(UpiTransactionRequestPayload upiTransactionRequestPayload, String str, zp.b bVar);

    void v(IsUpiAvailableRequestPayload isUpiAvailableRequestPayload, String str, zp.b bVar);
}
