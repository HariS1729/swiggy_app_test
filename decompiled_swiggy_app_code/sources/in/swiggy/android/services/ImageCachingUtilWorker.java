package in.swiggy.android.services;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import d4.a;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import pl0.m0;

/* compiled from: ImageCachingUtilWorker.kt */
public final class ImageCachingUtilWorker extends CoroutineWorker {
    public static final a j = new a((i) null);
    public static final int k = 8;

    /* renamed from: i  reason: collision with root package name */
    private final m0 f18635i;

    /* compiled from: ImageCachingUtilWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context) {
            Class<ImageCachingUtilWorker> cls = ImageCachingUtilWorker.class;
            p.j(context, LogCategory.CONTEXT);
            d4.a a11 = new a.C0116a().c(true).a();
            p.i(a11, "Builder()\n              …\n                .build()");
            e b11 = ((c.a) ((c.a) new c.a(cls).g(10, TimeUnit.SECONDS)).e(a11)).b();
            p.i(b11, "Builder(ImageCachingUtil…\n                .build()");
            n.k(context).i(cls.getSimpleName(), ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageCachingUtilWorker(Context context, WorkerParameters workerParameters, m0 m0Var) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(m0Var, "imageCachingUtil");
        this.f18635i = m0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof in.swiggy.android.services.ImageCachingUtilWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            in.swiggy.android.services.ImageCachingUtilWorker$doWork$1 r0 = (in.swiggy.android.services.ImageCachingUtilWorker$doWork$1) r0
            int r1 = r0.f18640e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18640e = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.ImageCachingUtilWorker$doWork$1 r0 = new in.swiggy.android.services.ImageCachingUtilWorker$doWork$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f18638c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18640e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f18637b
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f18636a
            in.swiggy.android.services.ImageCachingUtilWorker r0 = (in.swiggy.android.services.ImageCachingUtilWorker) r0
            bp0.g.b(r7)
            goto L_0x005a
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            bp0.g.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            wp0.t1 r2 = wp0.u0.c()
            in.swiggy.android.services.ImageCachingUtilWorker$doWork$2 r4 = new in.swiggy.android.services.ImageCachingUtilWorker$doWork$2
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.f18636a = r6
            r0.f18637b = r7
            r0.f18640e = r3
            java.lang.Object r0 = wp0.h.g(r2, r4, r0)
            if (r0 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r0 = r6
            r1 = r7
        L_0x005a:
            pl0.m0 r7 = r0.f18635i
            T r0 = r1.f25666a
            java.io.File[] r0 = (java.io.File[]) r0
            long r0 = r7.a(r0)
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0074
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.c()
            java.lang.String r0 = "{\n                Result.success()\n            }"
            kotlin.jvm.internal.p.i(r7, r0)
            goto L_0x007d
        L_0x0074:
            androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.a()
            java.lang.String r0 = "{\n                Result.failure()\n            }"
            kotlin.jvm.internal.p.i(r7, r0)
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.ImageCachingUtilWorker.w(fp0.c):java.lang.Object");
    }
}
