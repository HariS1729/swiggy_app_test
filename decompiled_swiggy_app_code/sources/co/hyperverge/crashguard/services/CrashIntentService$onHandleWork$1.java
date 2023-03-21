package co.hyperverge.crashguard.services;

import android.util.Log;
import b5.a;
import bp0.g;
import bp0.k;
import co.hyperverge.crashguard.data.models.CrashEvent;
import co.hyperverge.crashguard.data.network.SentryErrorResponse;
import co.hyperverge.crashguard.data.network.SentryResponse;
import fp0.c;
import hq0.a;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import lp0.p;
import retrofit2.Response;
import wp0.j0;

@d(c = "co.hyperverge.crashguard.services.CrashIntentService$onHandleWork$1", f = "CrashIntentService.kt", l = {47}, m = "invokeSuspend")
/* compiled from: CrashIntentService.kt */
final class CrashIntentService$onHandleWork$1 extends SuspendLambda implements p<j0, c<? super Result<? extends Integer>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13153a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f13154b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CrashIntentService f13155c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CrashEvent f13156d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrashIntentService$onHandleWork$1(CrashIntentService crashIntentService, CrashEvent crashEvent, c<? super CrashIntentService$onHandleWork$1> cVar) {
        super(2, cVar);
        this.f13155c = crashIntentService;
        this.f13156d = crashEvent;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        CrashIntentService$onHandleWork$1 crashIntentService$onHandleWork$1 = new CrashIntentService$onHandleWork$1(this.f13155c, this.f13156d, cVar);
        crashIntentService$onHandleWork$1.f13154b = obj;
        return crashIntentService$onHandleWork$1;
    }

    public final Object invoke(j0 j0Var, c<? super Result<Integer>> cVar) {
        return ((CrashIntentService$onHandleWork$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i11;
        Object d11 = b.d();
        int i12 = this.f13153a;
        if (i12 == 0) {
            g.b(obj);
            j0 j0Var = (j0) this.f13154b;
            CrashIntentService crashIntentService = this.f13155c;
            CrashEvent crashEvent = this.f13156d;
            Result.a aVar = Result.f25582b;
            a l11 = crashIntentService.r();
            String f11 = crashIntentService.q().f();
            String g11 = crashIntentService.q().g();
            this.f13153a = 1;
            obj = l11.a(crashEvent, f11, g11, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i12 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f25582b;
                obj2 = Result.b(g.a(th2));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Response response = (Response) obj;
        if (response.isSuccessful()) {
            i11 = Log.i(CrashIntentService.f13145m, kotlin.jvm.internal.p.s("onHandleWork: success posting event: ", (SentryResponse) response.body()));
        } else {
            a.C0293a aVar3 = hq0.a.f23147b;
            i11 = Log.e(CrashIntentService.f13145m, kotlin.jvm.internal.p.s("onHandleWork: failed posting event: ", (SentryErrorResponse) aVar3.b(kotlinx.serialization.a.serializer(aVar3.a(), s.k(SentryErrorResponse.class)), String.valueOf(response.errorBody()))));
        }
        obj2 = Result.b(kotlin.coroutines.jvm.internal.a.d(i11));
        CrashEvent crashEvent2 = this.f13156d;
        CrashIntentService crashIntentService2 = this.f13155c;
        Throwable d12 = Result.d(obj2);
        if (d12 != null) {
            String m11 = CrashIntentService.f13145m;
            Log.e(m11, "onHandleWork: failed with e: " + d12 + " for event " + crashEvent2);
            crashIntentService2.p().c(crashEvent2);
        }
        return Result.a(obj2);
    }
}
