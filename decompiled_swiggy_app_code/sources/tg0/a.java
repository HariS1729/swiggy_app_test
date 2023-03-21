package tg0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressDirectionsRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import mh0.d;

/* compiled from: IAddressPlugin.kt */
public interface a extends d {
    public static final C0245a Companion = C0245a.f19888a;

    /* renamed from: tg0.a$a  reason: collision with other inner class name */
    /* compiled from: IAddressPlugin.kt */
    public static final class C0245a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0245a f19888a = new C0245a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19889b = new np.b("EDIT_ADDRESS", EditAddressRequestPayload.Companion.serializer());

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19890c = new np.b("EDIT_DIRECTIONS_TO_REACH", EditAddressDirectionsRequestPayload.Companion.serializer());

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f19891d = new np.b("GENERIC_ADD_NEW_ADDRESS", AddNewAddressRequestPayload.Companion.serializer());

        private C0245a() {
        }

        public final np.b a() {
            return f19889b;
        }

        public final np.b b() {
            return f19890c;
        }

        public final np.b c() {
            return f19891d;
        }
    }

    /* compiled from: IAddressPlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
            d.a.a(aVar);
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            C0245a aVar2 = a.Companion;
            return k.f(aVar2.a(), aVar2.b(), aVar2.c());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0245a aVar3 = a.Companion;
            if (p.e(c11, aVar3.a())) {
                aVar.S((EditAddressRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.b())) {
                aVar.R0((EditAddressDirectionsRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.c())) {
                aVar.F0((AddNewAddressRequestPayload) aVar2.a(), aVar2.b(), bVar);
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

    void F0(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, zp.b bVar);

    void R0(EditAddressDirectionsRequestPayload editAddressDirectionsRequestPayload, String str, zp.b bVar);

    void S(EditAddressRequestPayload editAddressRequestPayload, String str, zp.b bVar);
}
