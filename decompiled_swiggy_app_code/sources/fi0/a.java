package fi0;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import com.brentvatne.react.ReactVideoViewManager;
import java.util.HashMap;
import kotlin.jvm.internal.p;
import pm0.f;
import pm0.l;
import zp.d;

/* compiled from: IWebViewClientCommunicationHandler.kt */
public interface a extends l {

    /* renamed from: fi0.a$a  reason: collision with other inner class name */
    /* compiled from: IWebViewClientCommunicationHandler.kt */
    public static final class C0223a {
        public static HashMap<String, String> a(a aVar) {
            p.j(aVar, "this");
            return l.a.e(aVar);
        }

        public static void b(a aVar) {
            p.j(aVar, "this");
        }

        @TargetApi(21)
        public static void c(a aVar, WebChromeClient.FileChooserParams fileChooserParams, xm0.a aVar2, int i11, f fVar, SharedPreferences sharedPreferences) {
            p.j(aVar, "this");
            p.j(fileChooserParams, "fileChooserParams");
            p.j(aVar2, "uriWrapper");
            p.j(fVar, "swiggyWebChromeClient");
            p.j(sharedPreferences, "sharedPreferences");
            l.a.h(aVar, fileChooserParams, aVar2, i11, fVar, sharedPreferences);
        }

        public static /* synthetic */ void d(a aVar, boolean z11, WebResourceRequest webResourceRequest, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    webResourceRequest = null;
                }
                if ((i11 & 4) != 0) {
                    dVar = null;
                }
                aVar.S1(z11, webResourceRequest, dVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
        }

        public static void e(a aVar, Uri uri) {
            p.j(aVar, "this");
            p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
            l.a.l(aVar, uri);
        }

        public static void f(a aVar, String str, String str2, String str3, String str4) {
            p.j(aVar, "this");
            p.j(str, "to");
            l.a.o(aVar, str, str2, str3, str4);
        }
    }

    void S1(boolean z11, WebResourceRequest webResourceRequest, d dVar);

    void a0(boolean z11);

    void y1();
}
