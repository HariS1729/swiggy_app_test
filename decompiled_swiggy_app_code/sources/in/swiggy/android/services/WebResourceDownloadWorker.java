package in.swiggy.android.services;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.p;
import os.u;
import wm0.g;

/* compiled from: WebResourceDownloadWorker.kt */
public final class WebResourceDownloadWorker extends Worker {

    /* renamed from: g  reason: collision with root package name */
    private final Context f18701g;

    /* renamed from: h  reason: collision with root package name */
    private final WorkerParameters f18702h;

    /* renamed from: i  reason: collision with root package name */
    private final g f18703i;
    private final String j = "WebResourceDownloadWorker";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebResourceDownloadWorker(Context context, WorkerParameters workerParameters, g gVar) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(gVar, "webResourceDownloadUtility");
        this.f18701g = context;
        this.f18702h = workerParameters;
        this.f18703i = gVar;
    }

    public ListenableWorker.a w() {
        try {
            g.d(this.f18703i, (String) null, 1, (Object) null);
            ListenableWorker.a c11 = ListenableWorker.a.c();
            p.i(c11, "{\n            webResourc…esult.success()\n        }");
            return c11;
        } catch (Exception e11) {
            u.h(this.j, e11);
            ListenableWorker.a a11 = ListenableWorker.a.a();
            p.i(a11, "{\n            Logger.log…esult.failure()\n        }");
            return a11;
        }
    }
}
