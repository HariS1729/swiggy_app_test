package in.swiggy.android.services;

import fp0.c;
import in.swiggy.android.services.FetchUserProfileWorker$doWork$2;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1", f = "FetchUserProfileWorker.kt", l = {106}, m = "emit")
/* compiled from: FetchUserProfileWorker.kt */
final class FetchUserProfileWorker$doWork$2$1$emit$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18631a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f18632b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FetchUserProfileWorker$doWork$2.AnonymousClass1 f18633c;

    /* renamed from: d  reason: collision with root package name */
    int f18634d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FetchUserProfileWorker$doWork$2$1$emit$1(FetchUserProfileWorker$doWork$2.AnonymousClass1 r12, c<? super FetchUserProfileWorker$doWork$2$1$emit$1> cVar) {
        super(cVar);
        this.f18633c = r12;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18632b = obj;
        this.f18634d |= Integer.MIN_VALUE;
        return this.f18633c.emit((Response<SwiggyApiResponse<UserResponseData>>) null, this);
    }
}
