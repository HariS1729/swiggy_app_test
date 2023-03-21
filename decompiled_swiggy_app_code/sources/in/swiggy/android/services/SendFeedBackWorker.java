package in.swiggy.android.services;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.gson.Gson;
import in.swiggy.android.components.AbstractWorker;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.network.requests.PostableFeedbackRatings;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mf0.d0;
import mf0.e0;
import os.u;

/* compiled from: SendFeedBackWorker.kt */
public final class SendFeedBackWorker extends AbstractWorker {

    /* renamed from: l  reason: collision with root package name */
    public static final a f18670l = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f18671m = 8;
    private final Gson k;

    /* compiled from: SendFeedBackWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendFeedBackWorker(Context context, WorkerParameters workerParameters, Gson gson, IApiGeneratedService iApiGeneratedService) {
        super(context, workerParameters, iApiGeneratedService);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(gson, "gson");
        p.j(iApiGeneratedService, "apiGeneratedService");
        this.k = gson;
    }

    /* access modifiers changed from: private */
    public static final void B(SwiggyBaseResponse swiggyBaseResponse) {
        u.b("SendFeedBackWorker", "Send Feedback ratings API success");
    }

    /* access modifiers changed from: private */
    public static final void C(Throwable th2) {
        u.e("SendFeedBackWorker", "Send Feedback ratings API failed", th2);
    }

    public ListenableWorker.a w() {
        Class cls = PostableFeedbackRatings.class;
        String k11 = g().k("postableFeedbackRatings");
        boolean z11 = false;
        if (!(k11 == null || k11.length() == 0)) {
            PostableFeedbackRatings postableFeedbackRatings = (PostableFeedbackRatings) this.k.fromJson(k11, cls);
            if (k11 == null || k11.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                y().sendFeedbackRatings((PostableFeedbackRatings) new Gson().fromJson(k11, cls), new SwiggyBaseResponseHandler(e0.f26721a, (e0) null), d0.f26720a, (go0.a) null);
                ListenableWorker.a c11 = ListenableWorker.a.c();
                p.i(c11, "success()");
                return c11;
            }
        }
        ListenableWorker.a a11 = ListenableWorker.a.a();
        p.i(a11, "failure()");
        return a11;
    }
}
