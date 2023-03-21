package yg0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import java.util.List;
import kotlin.jvm.internal.p;
import lp.b;
import zp.d;

/* compiled from: ILocationPlugin.kt */
public interface a extends np.a {
    public static final C0252a Companion = C0252a.f20029a;

    /* renamed from: yg0.a$a  reason: collision with other inner class name */
    /* compiled from: ILocationPlugin.kt */
    public static final class C0252a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0252a f20029a = new C0252a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final np.b f20030b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final np.b f20031c;

        static {
            b.C0657b bVar = lp.b.Companion;
            f20030b = new np.b("GET_SELECTED_LOCATION", bVar.a());
            f20031c = new np.b("OPEN_LOCATION_SEARCH", bVar.a());
        }

        private C0252a() {
        }
    }

    /* compiled from: ILocationPlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
        }

        public static List<np.b> b(a aVar) {
            p.j(aVar, "this");
            return k.f(C0252a.f20030b, C0252a.f20031c);
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            if (p.e(c11, C0252a.f20030b)) {
                aVar.Q0(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, C0252a.f20031c)) {
                aVar.r(aVar2.a(), aVar2.b(), bVar);
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

    void Q0(lp.b bVar, String str, zp.b bVar2);

    void r(lp.b bVar, String str, zp.b bVar2);
}
