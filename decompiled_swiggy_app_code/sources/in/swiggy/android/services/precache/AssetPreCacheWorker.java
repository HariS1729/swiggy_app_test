package in.swiggy.android.services.precache;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.d;
import androidx.work.e;
import bp0.h;
import d4.a;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import tf0.b;

/* compiled from: AssetPreCacheWorker.kt */
public final class AssetPreCacheWorker extends CoroutineWorker {
    public static final a k = new a((i) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18714l = 8;

    /* renamed from: i  reason: collision with root package name */
    private final jr.a f18715i;
    /* access modifiers changed from: private */
    public final b j;

    /* compiled from: AssetPreCacheWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context, String str, long j, long j11) {
            p.j(context, LogCategory.CONTEXT);
            p.j(str, "json");
            d4.a a11 = new a.C0116a().c(true).b(NetworkType.CONNECTED).a();
            p.i(a11, "Builder()\n              …\n                .build()");
            d.a aVar = new d.a(AssetPreCacheWorker.class, j11, TimeUnit.SECONDS);
            int i11 = 0;
            Pair[] pairArr = {h.a("JOB", str)};
            b.a aVar2 = new b.a();
            while (i11 < 1) {
                Pair pair = pairArr[i11];
                i11++;
                aVar2.b((String) pair.c(), pair.d());
            }
            androidx.work.b a12 = aVar2.a();
            p.i(a12, "dataBuilder.build()");
            e b11 = ((d.a) ((d.a) ((d.a) aVar.h(a12)).e(a11)).g(j, TimeUnit.SECONDS)).b();
            p.i(b11, "PeriodicWorkRequestBuild…\n                .build()");
            n.k(context).h("AssetPreCacheWorker", ExistingPeriodicWorkPolicy.KEEP, (d) b11);
        }

        public final void b(Context context) {
            p.j(context, LogCategory.CONTEXT);
            n.k(context).d("AssetPreCacheWorker");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssetPreCacheWorker(Context context, WorkerParameters workerParameters, jr.a aVar, tf0.b bVar) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(aVar, "newRelic");
        p.j(bVar, "requestHandler");
        this.f18715i = aVar;
        this.j = bVar;
    }

    private final void F(String str) {
        this.f18715i.b("ASSET_PRECACHE_WORKER_EVENT", x.j(h.a("ASSET_PRECACHE_WORKER_ERROR_MESSAGE", str)));
    }

    private final void H() {
        this.f18715i.a("ASSET_PRECACHE_WORKER_EVENT", (Map<String, ? extends Object>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$1 r0 = (in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$1) r0
            int r1 = r0.f18719d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18719d = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$1 r0 = new in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f18717b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18719d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f18716a
            in.swiggy.android.services.precache.AssetPreCacheWorker r0 = (in.swiggy.android.services.precache.AssetPreCacheWorker) r0
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
            vf0.a$a r2 = vf0.a.f19935b
            vf0.a r7 = r2.b(r7)
            if (r7 != 0) goto L_0x005d
            java.lang.String r7 = "Json exception"
            r6.F(r7)
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.a()
            java.lang.String r0 = "failure()"
            kotlin.jvm.internal.p.i(r7, r0)
            return r7
        L_0x005d:
            kotlinx.coroutines.CoroutineDispatcher r2 = wp0.u0.b()
            in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$2 r4 = new in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$2
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.f18716a = r6
            r0.f18719d = r3
            java.lang.Object r7 = wp0.h.g(r2, r4, r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r0 = r6
        L_0x0073:
            r0.H()
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.c()
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.p.i(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.precache.AssetPreCacheWorker.w(fp0.c):java.lang.Object");
    }
}
