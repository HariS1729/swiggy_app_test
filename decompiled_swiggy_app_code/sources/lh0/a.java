package lh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mh0.d;

/* compiled from: IRestEmpathyPlugin.kt */
public interface a extends d {
    public static final C0233a Companion = C0233a.f19675a;

    /* renamed from: lh0.a$a  reason: collision with other inner class name */
    /* compiled from: IRestEmpathyPlugin.kt */
    public static final class C0233a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0233a f19675a = new C0233a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19676b = new np.b("GET_RESTAURANT_EMPATHY_DATA", (cq0.a) null, 2, (i) null);

        private C0233a() {
        }

        public final np.b a() {
            return f19676b;
        }
    }

    /* compiled from: IRestEmpathyPlugin.kt */
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
                aVar.d0(aVar2.a(), aVar2.b(), bVar);
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

    void d0(lp.b bVar, String str, zp.b bVar2);
}
