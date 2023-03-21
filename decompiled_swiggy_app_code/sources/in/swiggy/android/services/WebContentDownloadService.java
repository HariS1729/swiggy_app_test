package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import d4.a;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.components.AbstractWorker;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import in.swiggy.android.tejas.oldapi.models.WebViewResourceResponse;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.WebViewResourceResponseHandler;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mf0.y0;
import mf0.z0;
import os.u;
import pc0.t;

/* compiled from: WebContentDownloadService.kt */
public final class WebContentDownloadService extends AbstractWorker {

    /* renamed from: l  reason: collision with root package name */
    public static final a f18698l = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f18699m = 8;
    /* access modifiers changed from: private */
    public final SharedPreferences k;

    /* compiled from: WebContentDownloadService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context) {
            p.j(context, LogCategory.CONTEXT);
            d4.a a11 = new a.C0116a().b(NetworkType.CONNECTED).a();
            p.i(a11, "Builder()\n              …\n                .build()");
            e b11 = ((c.a) new c.a(WebContentDownloadService.class).e(a11)).b();
            p.i(b11, "Builder(WebContentDownlo…\n                .build()");
            n.k(context).i("WebContentDownloadService", ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* compiled from: WebContentDownloadService.kt */
    public static final class b extends WebViewResourceResponseHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebContentDownloadService f18700a;

        b(WebContentDownloadService webContentDownloadService) {
            this.f18700a = webContentDownloadService;
        }

        public void handleSuccessfulResponse(WebViewResourceResponse webViewResourceResponse) {
            p.j(webViewResourceResponse, "resourceResponse");
            String string = this.f18700a.k.getString("helpcenter_webview_resource_version", "");
            boolean z11 = false;
            if (string != null && o.x(string, webViewResourceResponse.version, true)) {
                z11 = true;
            }
            if (!z11) {
                t90.c cVar = new t90.c(this.f18700a.getContext(), this.f18700a.k, webViewResourceResponse.urls.size(), webViewResourceResponse.version, "helpcenter_webview_resource_version");
                if (this.f18700a.k.getBoolean("has_valid_file_storage", true) || cVar.c() != null) {
                    for (String next : webViewResourceResponse.urls) {
                        ((t) this.f18700a.y()).getDownloaderGeneratedApiService().downloadFileByUrl(next).B(cVar.h(next)).m0(wo0.a.c()).Q(do0.a.a()).k0(cVar.e());
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebContentDownloadService(Context context, WorkerParameters workerParameters, SharedPreferences sharedPreferences, IApiGeneratedService iApiGeneratedService) {
        super(context, workerParameters, iApiGeneratedService);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(iApiGeneratedService, "apiGeneratedService");
        this.k = sharedPreferences;
    }

    /* access modifiers changed from: private */
    public static final void E(Throwable th2) {
        u.h("WebContentDownloadService", th2);
    }

    /* access modifiers changed from: private */
    public static final void F() {
    }

    public ListenableWorker.a w() {
        try {
            y().getWebViewResources(new b(this), z0.f26733a, y0.f26732a);
        } catch (Throwable th2) {
            u.h("WebContentDownloadService", th2);
        }
        ListenableWorker.a c11 = ListenableWorker.a.c();
        p.i(c11, "success()");
        return c11;
    }
}
