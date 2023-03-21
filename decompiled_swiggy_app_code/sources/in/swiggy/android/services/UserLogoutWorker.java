package in.swiggy.android.services;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import d4.a;
import d4.n;
import go0.g;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.components.AbstractWorker;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import zj.k;

/* compiled from: UserLogoutWorker.kt */
public final class UserLogoutWorker extends AbstractWorker {
    public static final a k = new a((i) null);

    /* compiled from: UserLogoutWorker.kt */
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
            e b11 = ((c.a) new c.a(UserLogoutWorker.class).e(a11)).b();
            p.i(b11, "Builder(UserLogoutWorker…\n                .build()");
            n.k(context).i("UserLogoutWorker", ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserLogoutWorker(Context context, WorkerParameters workerParameters, IApiGeneratedService iApiGeneratedService) {
        super(context, workerParameters, iApiGeneratedService);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(iApiGeneratedService, "apiGeneratedService");
    }

    public ListenableWorker.a w() {
        y().logOut((SwiggyBaseResponseHandler<SwiggyBaseResponse>) null, (g<Throwable>) null, (go0.a) null);
        FirebaseMessaging.g().d();
        Task<String> j = FirebaseMessaging.g().j();
        p.i(j, "getInstance().token");
        k.a(j);
        if (!j.s()) {
            u.e("UserLogoutWorker", "getInstanceId failed", j.n());
        }
        ListenableWorker.a c11 = ListenableWorker.a.c();
        p.i(c11, "success()");
        return c11;
    }
}
