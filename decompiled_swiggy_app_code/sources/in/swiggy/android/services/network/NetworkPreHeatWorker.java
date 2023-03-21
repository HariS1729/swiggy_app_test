package in.swiggy.android.services.network;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bp0.h;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: NetworkPreHeatWorker.kt */
public final class NetworkPreHeatWorker extends CoroutineWorker {
    public static final a k = new a((i) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18704l = 8;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f18705m;

    /* renamed from: i  reason: collision with root package name */
    private final jr.a f18706i;
    /* access modifiers changed from: private */
    public final pf0.a j;

    /* compiled from: NetworkPreHeatWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a() {
            return NetworkPreHeatWorker.f18705m;
        }
    }

    static {
        String simpleName = NetworkPreHeatWorker.class.getSimpleName();
        p.i(simpleName, "NetworkPreHeatWorker::class.java.simpleName");
        f18705m = simpleName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkPreHeatWorker(Context context, WorkerParameters workerParameters, jr.a aVar, pf0.a aVar2) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(aVar, "newRelic");
        p.j(aVar2, "requestHandler");
        this.f18706i = aVar;
        this.j = aVar2;
    }

    private final void H(String str) {
        this.f18706i.b("NETWORK_PREHEAT_WORKER_EVENT", x.j(h.a("NETWORK_PREHEAT_WORKER_ERROR_MESSAGE", str)));
    }

    private final void K() {
        this.f18706i.a("NETWORK_PREHEAT_WORKER_EVENT", (Map<String, ? extends Object>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$1 r0 = (in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$1) r0
            int r1 = r0.f18710d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18710d = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$1 r0 = new in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f18708b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18710d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f18707a
            in.swiggy.android.services.network.NetworkPreHeatWorker r0 = (in.swiggy.android.services.network.NetworkPreHeatWorker) r0
            bp0.g.b(r7)
            goto L_0x0073
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            bp0.g.b(r7)
            androidx.work.b r7 = r6.g()
            java.lang.String r2 = "JOB"
            java.lang.String r7 = r7.k(r2)
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = ""
        L_0x0046:
            qf0.a$a r2 = qf0.a.f19851b
            qf0.a r7 = r2.a(r7)
            if (r7 != 0) goto L_0x005d
            java.lang.String r7 = "Json exception"
            r6.H(r7)
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.a()
            java.lang.String r0 = "failure()"
            kotlin.jvm.internal.p.i(r7, r0)
            return r7
        L_0x005d:
            kotlinx.coroutines.CoroutineDispatcher r2 = wp0.u0.b()
            in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$2 r4 = new in.swiggy.android.services.network.NetworkPreHeatWorker$doWork$2
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.f18707a = r6
            r0.f18710d = r3
            java.lang.Object r7 = wp0.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r0 = r6
        L_0x0073:
            r0.K()
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.c()
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.p.i(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.network.NetworkPreHeatWorker.w(fp0.c):java.lang.Object");
    }
}
