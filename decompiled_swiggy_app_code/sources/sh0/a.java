package sh0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.WebResourceRequest;
import cg0.n;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import java.util.ArrayList;
import js.c;
import kotlin.jvm.internal.p;
import ks.d;

/* compiled from: ITnsPlugin.kt */
public interface a extends np.a {
    public static final C0244a Companion = C0244a.f19883a;

    /* renamed from: sh0.a$a  reason: collision with other inner class name */
    /* compiled from: ITnsPlugin.kt */
    public static final class C0244a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0244a f19883a = new C0244a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19884b = new np.b("GET_TNS_SIGNAL", lp.b.Companion.a());

        private C0244a() {
        }

        public final np.b a() {
            return f19884b;
        }

        public final np.a b(d dVar, SharedPreferences sharedPreferences, n nVar, ps.b bVar) {
            p.j(dVar, "featureFlags");
            p.j(sharedPreferences, "sharedPreferences");
            p.j(nVar, "locationContext");
            p.j(bVar, "contextService");
            if (!c.q(dVar.b("android_enable_tns_plugin"), false, 1, (Object) null)) {
                return null;
            }
            return new b(sharedPreferences, bVar, nVar);
        }
    }

    /* compiled from: ITnsPlugin.kt */
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
                aVar.e0(aVar2.a(), aVar2.b(), bVar);
            }
        }

        public static boolean d(a aVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            return false;
        }

        public static boolean e(a aVar, WebResourceRequest webResourceRequest, zp.d dVar) {
            p.j(aVar, "this");
            return false;
        }

        public static void f(a aVar, int i11, int i12, Intent intent) {
            p.j(aVar, "this");
        }

        public static void g(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
        }
    }

    void e0(lp.b bVar, String str, zp.b bVar2);
}
