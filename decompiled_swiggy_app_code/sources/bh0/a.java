package bh0;

import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata.PayUsingAmazonRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import zp.d;

/* compiled from: IAmazonPlugin.kt */
public interface a extends np.a {
    public static final C0216a Companion = C0216a.f18088a;

    /* renamed from: bh0.a$a  reason: collision with other inner class name */
    /* compiled from: IAmazonPlugin.kt */
    public static final class C0216a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0216a f18088a = new C0216a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f18089b = new np.b("PAY_USING_AMAZON_PAY", PayUsingAmazonRequestPayload.Companion.serializer());

        private C0216a() {
        }

        public final np.b a() {
            return f18089b;
        }
    }

    /* compiled from: IAmazonPlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            return k.f(a.Companion.a());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            if (p.e(aVar2.c(), a.Companion.a())) {
                aVar.m((PayUsingAmazonRequestPayload) aVar2.a(), aVar2.b(), bVar);
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
    }

    void m(PayUsingAmazonRequestPayload payUsingAmazonRequestPayload, String str, zp.b bVar);
}
