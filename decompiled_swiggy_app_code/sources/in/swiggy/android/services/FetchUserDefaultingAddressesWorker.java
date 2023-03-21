package in.swiggy.android.services;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.c;
import d4.a;
import ef0.e;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingRequestParam;
import in.swiggy.android.tejas.feature.address.v2.usecase.GetAllDefaultingAddressUseCase;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FetchUserDefaultingAddressesWorker.kt */
public final class FetchUserDefaultingAddressesWorker extends CoroutineWorker {
    public static final a k = new a((i) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18613l = 8;

    /* renamed from: m  reason: collision with root package name */
    public static GetAddressDefaultingRequestParam f18614m;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e f18615i;
    /* access modifiers changed from: private */
    public final GetAllDefaultingAddressUseCase j;

    /* compiled from: FetchUserDefaultingAddressesWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ c c(a aVar, GetAddressDefaultingRequestParam getAddressDefaultingRequestParam, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "LocationDefaultingContext";
            }
            return aVar.b(getAddressDefaultingRequestParam, str);
        }

        public final GetAddressDefaultingRequestParam a() {
            GetAddressDefaultingRequestParam getAddressDefaultingRequestParam = FetchUserDefaultingAddressesWorker.f18614m;
            if (getAddressDefaultingRequestParam != null) {
                return getAddressDefaultingRequestParam;
            }
            p.B("addressDefaultingRequestParam");
            return null;
        }

        public final c b(GetAddressDefaultingRequestParam getAddressDefaultingRequestParam, String str) {
            p.j(getAddressDefaultingRequestParam, "parameters");
            p.j(str, "tag");
            d(getAddressDefaultingRequestParam);
            d4.a a11 = new a.C0116a().b(NetworkType.CONNECTED).a();
            p.i(a11, "Builder()\n              …\n                .build()");
            androidx.work.e b11 = ((c.a) ((c.a) new c.a(FetchUserDefaultingAddressesWorker.class).e(a11)).a(str)).b();
            p.i(b11, "Builder(FetchUserDefault…\n                .build()");
            return (c) b11;
        }

        public final void d(GetAddressDefaultingRequestParam getAddressDefaultingRequestParam) {
            p.j(getAddressDefaultingRequestParam, "<set-?>");
            FetchUserDefaultingAddressesWorker.f18614m = getAddressDefaultingRequestParam;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchUserDefaultingAddressesWorker(Context context, WorkerParameters workerParameters, e eVar, GetAllDefaultingAddressUseCase getAllDefaultingAddressUseCase) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(getAllDefaultingAddressUseCase, "addressUseCase");
        this.f18615i = eVar;
        this.j = getAllDefaultingAddressUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$1 r0 = (in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$1) r0
            int r1 = r0.f18618c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18618c = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$1 r0 = new in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18616a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18618c
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
            in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$2 r2 = new in.swiggy.android.services.FetchUserDefaultingAddressesWorker$doWork$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.f18618c = r3
            java.lang.Object r6 = wp0.h.g(r6, r2, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.lang.String r0 = "override suspend fun doW…failure()\n        }\n    }"
            kotlin.jvm.internal.p.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.FetchUserDefaultingAddressesWorker.w(fp0.c):java.lang.Object");
    }
}
