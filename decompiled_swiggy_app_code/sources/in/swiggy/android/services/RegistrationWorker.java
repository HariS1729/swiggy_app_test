package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ar.d;
import bp0.k;
import d4.n;
import ef0.e;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.SwiggyApplication;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.apiinterface.ISpnsApi;
import in.swiggy.android.tejas.feature.timeline.model.Destination;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeviceAddSPNS;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import os.g;
import os.u;
import wp0.h;
import wp0.k0;
import wp0.k1;
import wp0.u0;

/* compiled from: RegistrationWorker.kt */
public final class RegistrationWorker extends CoroutineWorker {

    /* renamed from: o  reason: collision with root package name */
    public static final a f18654o = new a((i) null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f18655p = 8;

    /* renamed from: i  reason: collision with root package name */
    private final e f18656i;
    /* access modifiers changed from: private */
    public final SharedPreferences j;
    private final d k;

    /* renamed from: l  reason: collision with root package name */
    private final os.a f18657l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final jr.a f18658m;
    /* access modifiers changed from: private */
    public final ISpnsApi n;

    /* compiled from: RegistrationWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context) {
            p.j(context, LogCategory.CONTEXT);
            androidx.work.e b11 = new c.a(RegistrationWorker.class).b();
            p.i(b11, "Builder(RegistrationWork…\n                .build()");
            n.k(context).i("RegIntentService", ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationWorker(Context context, WorkerParameters workerParameters, e eVar, SharedPreferences sharedPreferences, d dVar, os.a aVar, jr.a aVar2, ISpnsApi iSpnsApi) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(sharedPreferences, "sharedPreferences");
        p.j(dVar, "analyticsFeatureGate");
        p.j(aVar, "appBuildDetails");
        p.j(aVar2, "newrelicPerformanceUtils");
        p.j(iSpnsApi, "iSpnsApi");
        this.f18656i = eVar;
        this.j = sharedPreferences;
        this.k = dVar;
        this.f18657l = aVar;
        this.f18658m = aVar2;
        this.n = iSpnsApi;
    }

    private final void K(String str) {
        k1 unused = j.d(k0.a(u0.c()), (CoroutineContext) null, (CoroutineStart) null, new RegistrationWorker$saveToken$1(this, str, (fp0.c<? super RegistrationWorker$saveToken$1>) null), 3, (Object) null);
    }

    private final Object M(String str, fp0.c<? super k> cVar) {
        u.b("RegIntentService", p.s("sendRegistrationToServer: token : ", str));
        Object g11 = h.g(DispatchProviderKt.b().plus(DispatchProviderKt.a().D()), new RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1((fp0.c) null, this, new PostableDeviceAddSPNS(this.f18656i.getCustomerId(), Destination.TYPE_CUSTOMER, new g((SwiggyApplication) b()).g(this.f18657l, str, this.f18656i.getDeviceId()))), cVar);
        return g11 == b.d() ? g11 : k.f22762a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof in.swiggy.android.services.RegistrationWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.swiggy.android.services.RegistrationWorker$doWork$1 r0 = (in.swiggy.android.services.RegistrationWorker$doWork$1) r0
            int r1 = r0.f18666d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18666d = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.RegistrationWorker$doWork$1 r0 = new in.swiggy.android.services.RegistrationWorker$doWork$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f18664b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18666d
            java.lang.String r3 = "failure()"
            r4 = 1
            java.lang.String r5 = "RegIntentService"
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r0 = r0.f18663a
            java.lang.String r0 = (java.lang.String) r0
            bp0.g.b(r7)     // Catch:{ all -> 0x0092 }
            goto L_0x007c
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            bp0.g.b(r7)
            java.lang.String r7 = "onHandleIntent: getting token"
            os.u.b(r5, r7)
            com.google.firebase.messaging.FirebaseMessaging r7 = com.google.firebase.messaging.FirebaseMessaging.g()     // Catch:{ all -> 0x0092 }
            com.google.android.gms.tasks.Task r7 = r7.j()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "getInstance().token"
            kotlin.jvm.internal.p.i(r7, r2)     // Catch:{ all -> 0x0092 }
            zj.k.a(r7)     // Catch:{ all -> 0x0092 }
            boolean r2 = r7.r()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x008a
            boolean r2 = r7.s()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x008a
            java.lang.Object r7 = r7.o()     // Catch:{ all -> 0x0092 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0092 }
            if (r7 != 0) goto L_0x0067
            java.lang.String r7 = ""
        L_0x0067:
            boolean r2 = os.d0.g(r7)     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007d
            r6.K(r7)     // Catch:{ all -> 0x0092 }
            r0.f18663a = r7     // Catch:{ all -> 0x0092 }
            r0.f18666d = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r6.M(r7, r0)     // Catch:{ all -> 0x0092 }
            if (r0 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r0 = r7
        L_0x007c:
            r7 = r0
        L_0x007d:
            os.u.b(r5, r7)     // Catch:{ all -> 0x0092 }
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.c()     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.p.i(r7, r0)     // Catch:{ all -> 0x0092 }
            return r7
        L_0x008a:
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.a()
            kotlin.jvm.internal.p.i(r7, r3)
            return r7
        L_0x0092:
            r7 = move-exception
            os.u.h(r5, r7)
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.a()
            kotlin.jvm.internal.p.i(r7, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.RegistrationWorker.w(fp0.c):java.lang.Object");
    }
}
