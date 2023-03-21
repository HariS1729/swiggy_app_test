package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.R;
import in.swiggy.android.web.utility.WebAssetsBackupUtility;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: WebAssetBackupWorker.kt */
public final class WebAssetBackupWorker extends Worker {
    public static final a j = new a((i) null);
    public static final int k = 8;

    /* renamed from: g  reason: collision with root package name */
    private final Context f18695g;

    /* renamed from: h  reason: collision with root package name */
    private final WorkerParameters f18696h;

    /* renamed from: i  reason: collision with root package name */
    private final WebAssetsBackupUtility f18697i;

    /* compiled from: WebAssetBackupWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context, String str, SharedPreferences sharedPreferences) {
            p.j(context, LogCategory.CONTEXT);
            p.j(str, "networkType");
            p.j(sharedPreferences, "sharedPreferences");
            boolean e11 = p.e(sharedPreferences.getString("android_web_download_enabled_v3", "true"), "true");
            e b11 = new c.a(WebAssetBackupWorker.class).b();
            p.i(b11, "Builder(WebAssetBackupWorker::class.java).build()");
            c cVar = (c) b11;
            if (o.x("2G", str, true) || !e11) {
                n.k(context).a("web_asset_backup", ExistingWorkPolicy.KEEP, cVar).a();
                return;
            }
            e b12 = new c.a(WebResourceDownloadWorker.class).b();
            p.i(b12, "Builder(WebResourceDownl…rker::class.java).build()");
            n.k(context).a("web_resource_download", ExistingWorkPolicy.KEEP, cVar).b((c) b12).a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebAssetBackupWorker(Context context, WorkerParameters workerParameters, WebAssetsBackupUtility webAssetsBackupUtility) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(webAssetsBackupUtility, "webAssetsBackupUtility");
        this.f18695g = context;
        this.f18696h = workerParameters;
        this.f18697i = webAssetsBackupUtility;
    }

    public static final void x(Context context, String str, SharedPreferences sharedPreferences) {
        j.a(context, str, sharedPreferences);
    }

    public ListenableWorker.a w() {
        try {
            this.f18697i.b(1115, R.raw.asset_file);
            ListenableWorker.a c11 = ListenableWorker.a.c();
            p.i(c11, "{\n            webAssetsB…esult.success()\n        }");
            return c11;
        } catch (Throwable th2) {
            u.h("WebAssetBackupWorker", th2);
            ListenableWorker.a a11 = ListenableWorker.a.a();
            p.i(a11, "{\n            Logger.log…esult.failure()\n        }");
            return a11;
        }
    }
}
