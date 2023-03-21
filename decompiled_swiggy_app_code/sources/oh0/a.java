package oh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.OpenShareSheetPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.ShareRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.whatsapp.WhatsappSharePayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import mh0.d;

/* compiled from: ISharePlugin.kt */
public interface a extends d {
    public static final C0238a Companion = C0238a.f19806a;

    /* renamed from: oh0.a$a  reason: collision with other inner class name */
    /* compiled from: ISharePlugin.kt */
    public static final class C0238a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0238a f19806a = new C0238a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19807b = new np.b("SHARE_ON_SOCIAL_MEDIA", ShareRequestPayload.Companion.serializer());

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19808c = new np.b("WHATSAPP_SHARE", WhatsappSharePayload.Companion.serializer());

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f19809d = new np.b("OPEN_SHARE_SHEET", OpenShareSheetPayload.Companion.serializer());

        private C0238a() {
        }

        public final np.b a() {
            return f19809d;
        }

        public final np.b b() {
            return f19807b;
        }

        public final np.b c() {
            return f19808c;
        }
    }

    /* compiled from: ISharePlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
            d.a.a(aVar);
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            C0238a aVar2 = a.Companion;
            return k.f(aVar2.b(), aVar2.c(), aVar2.a());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0238a aVar3 = a.Companion;
            if (p.e(c11, aVar3.b())) {
                aVar.q0((ShareRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.c())) {
                aVar.Y((WhatsappSharePayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.a())) {
                aVar.h0((OpenShareSheetPayload) aVar2.a(), aVar2.b(), bVar);
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

    void Y(WhatsappSharePayload whatsappSharePayload, String str, zp.b bVar);

    void h0(OpenShareSheetPayload openShareSheetPayload, String str, zp.b bVar);

    void q0(ShareRequestPayload shareRequestPayload, String str, zp.b bVar);
}
