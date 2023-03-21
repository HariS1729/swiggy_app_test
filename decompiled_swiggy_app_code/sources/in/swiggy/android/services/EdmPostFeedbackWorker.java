package in.swiggy.android.services;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import com.google.gson.Gson;
import d4.a;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.feature.edm.IEdmApi;
import in.swiggy.android.tejas.feature.edm.model.EdmPostableRating;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: EdmPostFeedbackWorker.kt */
public final class EdmPostFeedbackWorker extends CoroutineWorker {
    public static final a k = new a((i) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18596l = 8;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f18597m = "EdmPostFeedbackWorker.edmPostableFeedback";
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final IEdmApi f18598i;
    /* access modifiers changed from: private */
    public final Gson j;

    /* compiled from: EdmPostFeedbackWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a() {
            return EdmPostFeedbackWorker.f18597m;
        }

        public final void b(Context context, EdmPostableRating edmPostableRating) {
            p.j(context, LogCategory.CONTEXT);
            p.j(edmPostableRating, "edmPostableRating");
            d4.a a11 = new a.C0116a().b(NetworkType.CONNECTED).a();
            p.i(a11, "Builder().setRequiredNet…rkType.CONNECTED).build()");
            b a12 = new b.a().g(a(), c.c(edmPostableRating)).a();
            p.i(a12, "Builder()\n              …\n                .build()");
            e b11 = ((c.a) ((c.a) new c.a(EdmPostFeedbackWorker.class).h(a12)).e(a11)).b();
            p.i(b11, "Builder(EdmPostFeedbackW…ints(constraints).build()");
            n.k(context).i("EdmPostFeedbackWorker", ExistingWorkPolicy.APPEND, (androidx.work.c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EdmPostFeedbackWorker(Context context, WorkerParameters workerParameters, IEdmApi iEdmApi, Gson gson) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(iEdmApi, "edmApi");
        p.j(gson, "gson");
        this.f18598i = iEdmApi;
        this.j = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof in.swiggy.android.services.EdmPostFeedbackWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            in.swiggy.android.services.EdmPostFeedbackWorker$doWork$1 r0 = (in.swiggy.android.services.EdmPostFeedbackWorker$doWork$1) r0
            int r1 = r0.f18601c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18601c = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.EdmPostFeedbackWorker$doWork$1 r0 = new in.swiggy.android.services.EdmPostFeedbackWorker$doWork$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18599a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18601c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            bp0.g.b(r6)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            bp0.g.b(r6)
            in.swiggy.android.commons.utils.IDispatchProvider r6 = in.swiggy.android.commons.utils.DispatchProviderKt.a()
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.D()
            in.swiggy.android.services.EdmPostFeedbackWorker$doWork$2 r2 = new in.swiggy.android.services.EdmPostFeedbackWorker$doWork$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.f18601c = r3
            java.lang.Object r6 = wp0.h.g(r6, r2, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.lang.String r0 = "override suspend fun doW…?: Result.failure()\n    }"
            kotlin.jvm.internal.p.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.EdmPostFeedbackWorker.w(fp0.c):java.lang.Object");
    }
}
