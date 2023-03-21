package ah0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.login.LoginRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import mh0.d;

/* compiled from: ILoginPlugin.kt */
public interface a extends d {
    public static final C0215a Companion = C0215a.f18080a;

    /* renamed from: ah0.a$a  reason: collision with other inner class name */
    /* compiled from: ILoginPlugin.kt */
    public static final class C0215a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0215a f18080a = new C0215a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f18081b = new np.b("LOGIN", LoginRequestPayload.Companion.serializer());

        private C0215a() {
        }

        public final np.b a() {
            return f18081b;
        }
    }

    /* compiled from: ILoginPlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
            d.a.a(aVar);
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
                aVar.Q((LoginRequestPayload) aVar2.a(), aVar2.b(), bVar, iLynxViewUpdateHandler);
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

        public static void f(a aVar, int i11, int i12, Intent intent) {
            p.j(aVar, "this");
            d.a.d(aVar, i11, i12, intent);
        }

        public static void g(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
            d.a.e(aVar, intent);
        }
    }

    void Q(LoginRequestPayload loginRequestPayload, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler);
}
