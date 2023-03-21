package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.components.AbstractWorker;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import in.swiggy.android.tejas.oldapi.models.WebViewResourceResponse;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.WebViewResourceResponseHandler;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mf0.h0;
import mf0.i0;
import os.u;
import pc0.t;
import t90.c;

/* compiled from: SuperContentDownloadService.kt */
public final class SuperContentDownloadService extends AbstractWorker {

    /* renamed from: l  reason: collision with root package name */
    public static final a f18672l = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f18673m = 8;
    /* access modifiers changed from: private */
    public final SharedPreferences k;

    /* compiled from: SuperContentDownloadService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: SuperContentDownloadService.kt */
    public static final class b extends WebViewResourceResponseHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SuperContentDownloadService f18674a;

        b(SuperContentDownloadService superContentDownloadService) {
            this.f18674a = superContentDownloadService;
        }

        public void handleSuccessfulResponse(WebViewResourceResponse webViewResourceResponse) {
            p.j(webViewResourceResponse, "resourceResponse");
            String string = this.f18674a.k.getString("super_webview_resource_version", "");
            u.b("SuperContentDownloadService", webViewResourceResponse.toString());
            if (!o.x(string, webViewResourceResponse.version, true)) {
                c cVar = new c(this.f18674a.getContext(), this.f18674a.k, webViewResourceResponse.urls.size(), webViewResourceResponse.version, "super_webview_resource_version");
                if (this.f18674a.k.getBoolean("has_valid_file_storage", true) || cVar.c() != null) {
                    for (String next : webViewResourceResponse.urls) {
                        ((t) this.f18674a.y()).getDownloaderGeneratedApiService().downloadFileByUrl(next).B(cVar.h(next)).m0(wo0.a.c()).Q(do0.a.a()).k0(cVar.e());
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuperContentDownloadService(Context context, WorkerParameters workerParameters, SharedPreferences sharedPreferences, IApiGeneratedService iApiGeneratedService) {
        super(context, workerParameters, iApiGeneratedService);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(iApiGeneratedService, "apiGeneratedService");
        this.k = sharedPreferences;
    }

    /* access modifiers changed from: private */
    public static final void E(Throwable th2) {
        u.h("SuperContentDownloadService", th2);
    }

    /* access modifiers changed from: private */
    public static final void F() {
    }

    public ListenableWorker.a w() {
        try {
            y().getSuperWebViewResources(new b(this), i0.f26723a, h0.f26722a);
        } catch (Throwable th2) {
            u.h("SuperContentDownloadService", th2);
        }
        ListenableWorker.a c11 = ListenableWorker.a.c();
        p.i(c11, "success()");
        return c11;
    }
}
