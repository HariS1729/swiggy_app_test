package in.swiggy.android.services;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import d4.a;
import d4.n;
import ef0.e;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.feature.logout.LogoutUseCase;
import in.swiggy.android.services.FetchUserDefaultingAddressesWorker;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingRequestParam;
import in.swiggy.android.tejas.feature.user.RefreshProfileUseCase;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import in.swiggy.android.tejas.oldapi.utils.Constants;
import j3.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import wp0.h;

/* compiled from: FetchUserProfileWorker.kt */
public final class FetchUserProfileWorker extends CoroutineWorker {

    /* renamed from: l  reason: collision with root package name */
    public static final a f18622l = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f18623m = 8;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e f18624i;
    /* access modifiers changed from: private */
    public final RefreshProfileUseCase j;
    /* access modifiers changed from: private */
    public final LogoutUseCase k;

    /* compiled from: FetchUserProfileWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context, e eVar, SwiggyApiResponse<UserResponseData> swiggyApiResponse) {
            p.j(context, LogCategory.CONTEXT);
            p.j(eVar, LogSubCategory.Action.USER);
            p.j(swiggyApiResponse, "signInResponse");
            eVar.t2(swiggyApiResponse);
            com.google.firebase.crashlytics.a a11 = com.google.firebase.crashlytics.a.a();
            UserResponseData data = swiggyApiResponse.getData();
            a11.g(String.valueOf(data == null ? null : data.mCustomerId));
            if (!p.e(eVar.x2(), Constants.SUPER_TAG)) {
                b.a(context).edit().putInt("listing_small_card_shown_count", 0).apply();
            }
        }

        public final void b(Context context, boolean z11, boolean z12, String str, String str2, boolean z13, GetAddressDefaultingRequestParam getAddressDefaultingRequestParam) {
            c cVar;
            p.j(context, LogCategory.CONTEXT);
            p.j(str, AnalyticsAttribute.DEVICE_MANUFACTURER_ATTRIBUTE);
            p.j(str2, "deviceModelName");
            p.j(getAddressDefaultingRequestParam, "getAddressDefaultingRequestParam");
            androidx.work.b a11 = new b.a().e("FetchUserProfileWorker.isSilentSession", z11).g(AnalyticsAttribute.DEVICE_MANUFACTURER_ATTRIBUTE, str).g("deviceModelName", str2).a();
            p.i(a11, "Builder()\n              …\n                .build()");
            d4.a a12 = new a.C0116a().b(NetworkType.CONNECTED).a();
            p.i(a12, "Builder().setRequiredNet…rkType.CONNECTED).build()");
            androidx.work.e b11 = ((c.a) ((c.a) new c.a(FetchUserProfileWorker.class).h(a11)).e(a12)).b();
            p.i(b11, "Builder(FetchUserProfile…ints(constraints).build()");
            c cVar2 = (c) b11;
            u.b("FetchUserProfileWorker", p.s("userIdPresent ", Boolean.valueOf(z12)));
            n k = n.k(context);
            if (z13) {
                cVar = FetchUserDefaultingAddressesWorker.a.c(FetchUserDefaultingAddressesWorker.k, getAddressDefaultingRequestParam, (String) null, 2, (Object) null);
            } else {
                cVar = FetchUserAddressesWorker.k.a();
            }
            k.a("FetchUserProfileWorker", ExistingWorkPolicy.REPLACE, cVar2).b(cVar).a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchUserProfileWorker(Context context, WorkerParameters workerParameters, e eVar, RefreshProfileUseCase refreshProfileUseCase, LogoutUseCase logoutUseCase) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(refreshProfileUseCase, "refreshProfileUseCase");
        p.j(logoutUseCase, "logoutUseCase");
        this.f18624i = eVar;
        this.j = refreshProfileUseCase;
        this.k = logoutUseCase;
    }

    public static final void K(Context context, boolean z11, boolean z12, String str, String str2, boolean z13, GetAddressDefaultingRequestParam getAddressDefaultingRequestParam) {
        f18622l.b(context, z11, z12, str, str2, z13, getAddressDefaultingRequestParam);
    }

    public Object w(fp0.c<? super ListenableWorker.a> cVar) {
        return h.g(DispatchProviderKt.a().D(), new FetchUserProfileWorker$doWork$2(this, (fp0.c<? super FetchUserProfileWorker$doWork$2>) null), cVar);
    }
}
