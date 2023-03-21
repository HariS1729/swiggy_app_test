package qh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.submitfeedback.SubmitFeedbackPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import mh0.d;

/* compiled from: ISubmitFeedbackPlugin.kt */
public interface a extends d {
    public static final C0241a Companion = C0241a.f19854a;

    /* renamed from: qh0.a$a  reason: collision with other inner class name */
    /* compiled from: ISubmitFeedbackPlugin.kt */
    public static final class C0241a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0241a f19854a = new C0241a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19855b = new np.b("SUBMIT_FEEDBACK", SubmitFeedbackPayload.Companion.serializer());

        private C0241a() {
        }

        public final np.b a() {
            return f19855b;
        }
    }

    /* compiled from: ISubmitFeedbackPlugin.kt */
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
                aVar.g((SubmitFeedbackPayload) aVar2.a(), aVar2.b(), bVar);
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

    void g(SubmitFeedbackPayload submitFeedbackPayload, String str, zp.b bVar);
}
